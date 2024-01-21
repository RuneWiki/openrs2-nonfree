import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class51 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class51() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
	private Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!s;[BI)V")
	public void method1185(@OriginalArg(0) Class4_Sub16 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray22[arg0.anInt2019] != 31 || arg0.aByteArray22[arg0.anInt2019 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray22, arg0.anInt2019 + 10, arg0.aByteArray22.length + -arg0.anInt2019 + -18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
