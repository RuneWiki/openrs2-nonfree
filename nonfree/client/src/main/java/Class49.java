import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class49 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class49() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
	private Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BLclient!na;)V")
	public void method1146(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class2_Sub9 arg1) {
		if (arg1.aByteArray16[arg1.anInt976] != 31 || arg1.aByteArray16[arg1.anInt976 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray16, arg1.anInt976 + 10, -arg1.anInt976 - 10 - (8 - arg1.aByteArray16.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
