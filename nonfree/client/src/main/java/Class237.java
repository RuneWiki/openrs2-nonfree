import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class237 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class237() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(III)V")
	private Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BB)[B")
	public byte[] method4971(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		local8.anInt10466 = arg0.length - 4;
		@Pc(23) int local23 = local8.method8874();
		@Pc(26) byte[] local26 = new byte[local23];
		local8.anInt10466 = 0;
		this.method4972(local8, local26);
		return local26;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!es;[BB)V")
	public void method4972(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray107[arg0.anInt10466] != 31 || arg0.aByteArray107[arg0.anInt10466 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray107, arg0.anInt10466 + 10, -arg0.anInt10466 + -18 + arg0.aByteArray107.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
