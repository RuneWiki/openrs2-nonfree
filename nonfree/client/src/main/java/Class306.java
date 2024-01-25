import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class306 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class306() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V")
	private Class306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!iaa;[BB)V")
	public void method7451(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray65[arg0.anInt5769] != 31 || arg0.aByteArray65[arg0.anInt5769 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray65, arg0.anInt5769 + 10, -8 - (arg0.anInt5769 + 10 - arg0.aByteArray65.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
