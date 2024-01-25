import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class124 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class124() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(III)V")
	private Class124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!jg;[BZ)V")
	public void method3378(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray74[arg0.anInt2637] != 31 || arg0.aByteArray74[arg0.anInt2637 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray74, arg0.anInt2637 + 10, arg0.aByteArray74.length - arg0.anInt2637 - 18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(57) Exception local57) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
