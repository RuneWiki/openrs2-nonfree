import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class76 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class76() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(III)V")
	private Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!me;[BB)V")
	public void method2326(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray14[arg0.anInt2154] != 31 || arg0.aByteArray14[arg0.anInt2154 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray14, arg0.anInt2154 + 10, arg0.aByteArray14.length + -10 + (-arg0.anInt2154 - 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
