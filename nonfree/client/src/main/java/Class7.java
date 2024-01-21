import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class7 {

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class7() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(III)V")
	private Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B[BLclient!hc;)V")
	public void method273(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg1.aByteArray3[arg1.anInt839] != 31 || arg1.aByteArray3[arg1.anInt839 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray3, arg1.anInt839 + 10, -arg1.anInt839 + -18 + arg1.aByteArray3.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
