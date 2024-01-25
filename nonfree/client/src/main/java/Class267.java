import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class267 {

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class267() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(III)V")
	private Class267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B[BLclient!ig;)V")
	public void method6800(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg1.aByteArray107[arg1.anInt10588] != 31 || arg1.aByteArray107[arg1.anInt10588 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray107, arg1.anInt10588 + 10, arg1.aByteArray107.length + -8 + -arg1.anInt10588 + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z[B)[B")
	public byte[] method6805(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class8_Sub8 local8 = new Class8_Sub8(arg0);
		local8.anInt10588 = arg0.length - 4;
		@Pc(18) int local18 = local8.method8526();
		local8.anInt10588 = 0;
		@Pc(30) byte[] local30 = new byte[local18];
		this.method6800(local30, local8);
		return local30;
	}
}
