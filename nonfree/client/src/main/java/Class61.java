import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class61 {

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class61() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(III)V")
	private Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dc;[BI)V")
	public void method1418(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray13[arg0.anInt792] != 31 || arg0.aByteArray13[arg0.anInt792 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray13, arg0.anInt792 + 10, -8 - (arg0.anInt792 + 10 - arg0.aByteArray13.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
