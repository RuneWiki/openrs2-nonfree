import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class94 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class94() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
	private Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B[BLclient!h;)V")
	public void method3127(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg1.aByteArray19[arg1.anInt1597] != 31 || arg1.aByteArray19[arg1.anInt1597 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray19, arg1.anInt1597 + 10, arg1.aByteArray19.length + -8 + (-arg1.anInt1597 - 10));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
