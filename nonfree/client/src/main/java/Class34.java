import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class34 {

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class34() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
	private Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!b;[BI)V")
	public void method882(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray7[arg0.anInt413] != 31 || arg0.aByteArray7[arg0.anInt413 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray7, arg0.anInt413 + 10, arg0.aByteArray7.length - 8 - (arg0.anInt413 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
