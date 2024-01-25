import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class11 {

	@OriginalMember(owner = "client!an", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class11() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(III)V")
	private Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ti;[BI)V")
	public void method231(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray65[arg0.anInt5695] != 31 || arg0.aByteArray65[arg0.anInt5695 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray65, arg0.anInt5695 + 10, -18 - (arg0.anInt5695 - arg0.aByteArray65.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(59) Exception local59) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
