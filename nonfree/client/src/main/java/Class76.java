import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class76 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class76() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V")
	private Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BLclient!ge;B)V")
	public void method1796(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (arg1.aByteArray66[arg1.anInt4555] != 31 || arg1.aByteArray66[arg1.anInt4555 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray66, arg1.anInt4555 + 10, -8 - (arg1.anInt4555 + 10 - arg1.aByteArray66.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(71) Exception local71) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
