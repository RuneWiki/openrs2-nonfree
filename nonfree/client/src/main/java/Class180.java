import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class180 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class180() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III)V")
	private Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BLclient!ec;)V")
	public void method4854(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg1.aByteArray67[arg1.anInt4188] != 31 || arg1.aByteArray67[arg1.anInt4188 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray67, arg1.anInt4188 + 10, -18 - (arg1.anInt4188 - arg1.aByteArray67.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
