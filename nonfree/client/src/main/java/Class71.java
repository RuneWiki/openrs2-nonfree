import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class71 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class71() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	private Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kh;[BI)V")
	public void method1235(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray93[arg0.anInt6076] != 31 || arg0.aByteArray93[arg0.anInt6076 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray93, arg0.anInt6076 + 10, -arg0.anInt6076 + -10 + -8 + arg0.aByteArray93.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
