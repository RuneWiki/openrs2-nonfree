import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class53 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(III)V")
	private Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class53() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B[BLclient!va;)V")
	public void method1663(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg1.aByteArray24[arg1.anInt2077] != 31 || arg1.aByteArray24[arg1.anInt2077 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray24, arg1.anInt2077 + 10, -arg1.anInt2077 - (18 - arg1.aByteArray24.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
