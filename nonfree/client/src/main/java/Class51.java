import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class51 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class51() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	private Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!re;[BZ)V")
	public void method1421(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray68[arg0.anInt1643] != 31 || arg0.aByteArray68[arg0.anInt1643 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray68, arg0.anInt1643 + 10, -arg0.anInt1643 - 18 + arg0.aByteArray68.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
