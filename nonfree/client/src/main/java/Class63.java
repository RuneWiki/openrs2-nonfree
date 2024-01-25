import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class63 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class63() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V")
	private Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!fh;[BI)V")
	public void method1350(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray81[arg0.anInt6207] != 31 || arg0.aByteArray81[arg0.anInt6207 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray81, arg0.anInt6207 + 10, arg0.aByteArray81.length - 8 - arg0.anInt6207 - 10);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
