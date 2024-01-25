import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lka")
public final class Class233 {

	@OriginalMember(owner = "client!lka", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lka", name = "<init>", descriptor = "()V")
	public Class233() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lka", name = "<init>", descriptor = "(III)V")
	private Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(Lclient!ika;B[B)V")
	public void method5133(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray20[arg0.anInt2178] != 31 || arg0.aByteArray20[arg0.anInt2178 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray20, arg0.anInt2178 + 10, -18 - arg0.anInt2178 + arg0.aByteArray20.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "([BB)[B")
	public byte[] method5134(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class3_Sub2 local15 = new Class3_Sub2(arg0);
		local15.anInt2178 = arg0.length - 4;
		@Pc(25) int local25 = local15.method2077();
		@Pc(28) byte[] local28 = new byte[local25];
		local15.anInt2178 = 0;
		this.method5133(local15, local28);
		return local28;
	}
}
