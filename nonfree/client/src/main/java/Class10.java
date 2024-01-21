import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class10 {

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class10() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(III)V")
	private Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BLclient!ne;)V")
	public void method150(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg1.aByteArray17[arg1.anInt931] != 31 || arg1.aByteArray17[arg1.anInt931 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray17, arg1.anInt931 + 10, -arg1.anInt931 + -10 - 8 + arg1.aByteArray17.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
