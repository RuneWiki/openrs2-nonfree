import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class16 {

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class16() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
	private Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BZLclient!mb;)V")
	public void method401(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg1.aByteArray40[arg1.anInt2923] != 31 || arg1.aByteArray40[arg1.anInt2923 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray40, arg1.anInt2923 + 10, arg1.aByteArray40.length + -10 + (-arg1.anInt2923 - 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
