import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class50 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class50() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
	private Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[BLclient!ql;)V")
	public void method1840(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg1.aByteArray29[arg1.anInt2395] != 31 || arg1.aByteArray29[arg1.anInt2395 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray29, arg1.anInt2395 + 10, -arg1.anInt2395 - (8 - arg1.aByteArray29.length) + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(65) Exception local65) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
