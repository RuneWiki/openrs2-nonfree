import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class122 {

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class122() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(III)V")
	private Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B)[B")
	public byte[] method2711(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub22 local8 = new Class5_Sub22(arg0);
		local8.anInt6629 = arg0.length - 4;
		@Pc(18) int local18 = local8.method5911();
		local8.anInt6629 = 0;
		@Pc(24) byte[] local24 = new byte[local18];
		this.method2712(local24, local8);
		return local24;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[BLclient!ofa;)V")
	public void method2712(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg1.aByteArray71[arg1.anInt6629] != 31 || arg1.aByteArray71[arg1.anInt6629 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray71, arg1.anInt6629 + 10, -arg1.anInt6629 + -10 + -8 + arg1.aByteArray71.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
