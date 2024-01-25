import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class214 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class214() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
	private Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!gk;[BZ)V")
	public void method4427(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray75[arg0.anInt4989] != 31 || arg0.aByteArray75[arg0.anInt4989 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray75, arg0.anInt4989 + 10, -arg0.anInt4989 + -10 + -8 + arg0.aByteArray75.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
