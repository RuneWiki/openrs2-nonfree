import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class187 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(III)V")
	private Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class187() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B[BLclient!iv;)V")
	public void method4171(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg1.aByteArray36[arg1.anInt2997] != 31 || arg1.aByteArray36[arg1.anInt2997 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray36, arg1.anInt2997 + 10, -arg1.anInt2997 + -10 + -8 + arg1.aByteArray36.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
