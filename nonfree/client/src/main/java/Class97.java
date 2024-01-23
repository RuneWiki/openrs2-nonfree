import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class97 {

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class97() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
	private Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!nh;I[B)V")
	public void method3563(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray41[arg0.anInt2703] != 31 || arg0.aByteArray41[arg0.anInt2703 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray41, arg0.anInt2703 + 10, -8 - arg0.anInt2703 + -10 + arg0.aByteArray41.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
