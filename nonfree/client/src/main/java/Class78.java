import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class78 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(III)V")
	private Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class78() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([BILclient!wd;)V")
	public void method1930(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class8_Sub20 arg1) {
		if (arg1.aByteArray44[arg1.anInt2853] != 31 || arg1.aByteArray44[arg1.anInt2853 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray44, arg1.anInt2853 + 10, arg1.aByteArray44.length + -8 + -arg1.anInt2853 - 10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
