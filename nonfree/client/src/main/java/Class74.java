import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class74 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class74() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III)V")
	private Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ab;[BI)V")
	public void method2282(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray35[arg0.anInt2385] != 31 || arg0.aByteArray35[arg0.anInt2385 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray35, arg0.anInt2385 + 10, arg0.aByteArray35.length - 8 - (arg0.anInt2385 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
