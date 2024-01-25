import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class109 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class109() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
	private Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!lk;[BI)V")
	public void method2498(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray77[arg0.anInt4788] != 31 || arg0.aByteArray77[arg0.anInt4788 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray77, arg0.anInt4788 + 10, -arg0.anInt4788 - 10 - 8 + arg0.aByteArray77.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
