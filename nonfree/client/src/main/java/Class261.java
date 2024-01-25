import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class261 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class261() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(III)V")
	private Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!dh;I[B)V")
	public void method5567(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray64[arg0.anInt5766] != 31 || arg0.aByteArray64[arg0.anInt5766 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray64, arg0.anInt5766 + 10, arg0.aByteArray64.length + -8 + -10 + -arg0.anInt5766);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
