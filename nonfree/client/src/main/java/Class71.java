import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class71 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class71() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(III)V")
	private Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!os;[BI)V")
	public void method1929(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray58[arg0.anInt4872] != 31 || arg0.aByteArray58[arg0.anInt4872 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray58, arg0.anInt4872 + 10, arg0.aByteArray58.length - 10 - (arg0.anInt4872 + 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
