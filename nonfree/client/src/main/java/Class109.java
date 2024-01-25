import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class109 {

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class109() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(III)V")
	private Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLclient!rg;[B)V")
	public void method3150(@OriginalArg(1) Class6_Sub40 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray113[arg0.anInt10169] != 31 || arg0.aByteArray113[arg0.anInt10169 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray113, arg0.anInt10169 + 10, arg0.aByteArray113.length + -8 + (-arg0.anInt10169 - 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([BZ)[B")
	public byte[] method3151(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub40 local8 = new Class6_Sub40(arg0);
		local8.anInt10169 = arg0.length - 4;
		@Pc(18) int local18 = local8.method8599();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.anInt10169 = 0;
		this.method3150(local8, local21);
		return local21;
	}
}
