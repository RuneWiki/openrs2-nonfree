import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class196 {

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class196() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(III)V")
	private Class196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!daa;[BI)V")
	public void method4720(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray82[arg0.anInt6217] != 31 || arg0.aByteArray82[arg0.anInt6217 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray82, arg0.anInt6217 + 10, -arg0.anInt6217 + -8 + -10 + arg0.aByteArray82.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
