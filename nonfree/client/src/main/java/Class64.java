import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class64 {

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class64() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V")
	private Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!qc;[BI)V")
	public void method1821(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray96[arg0.anInt3078] != 31 || arg0.aByteArray96[arg0.anInt3078 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray96, arg0.anInt3078 + 10, -10 - arg0.anInt3078 + -8 + arg0.aByteArray96.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
