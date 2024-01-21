import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class21 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(III)V")
	private Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class21() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BLclient!tf;)V")
	public void method478(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg1.aByteArray6[arg1.anInt1312] != 31 || arg1.aByteArray6[arg1.anInt1312 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray6, arg1.anInt1312 + 10, -10 - (arg1.anInt1312 + 8 - arg1.aByteArray6.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
