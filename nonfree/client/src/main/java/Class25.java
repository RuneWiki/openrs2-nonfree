import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class25 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class25() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(III)V")
	private Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[BLclient!rd;)V")
	public void method781(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg1.aByteArray36[arg1.anInt2951] != 31 || arg1.aByteArray36[arg1.anInt2951 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray36, arg1.anInt2951 + 10, arg1.aByteArray36.length + -arg1.anInt2951 + -10 + -8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
