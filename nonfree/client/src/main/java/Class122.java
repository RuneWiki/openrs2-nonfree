import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class122 {

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class122() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
	private Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)[B")
	public byte[] method2604(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub20 local13 = new Class1_Sub20(arg0);
		local13.anInt5238 = arg0.length - 4;
		@Pc(25) int local25 = local13.method4431();
		local13.anInt5238 = 0;
		@Pc(31) byte[] local31 = new byte[local25];
		this.method2607(local13, local31);
		return local31;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!io;[BB)V")
	public void method2607(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray52[arg0.anInt5238] != 31 || arg0.aByteArray52[arg0.anInt5238 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray52, arg0.anInt5238 + 10, arg0.aByteArray52.length - arg0.anInt5238 - 18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
