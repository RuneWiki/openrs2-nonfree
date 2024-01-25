import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class114 {

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
	public Class114() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(III)V")
	private Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLclient!dga;[B)V")
	public void method2278(@OriginalArg(1) Class6_Sub14 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray88[arg0.anInt7244] != 31 || arg0.aByteArray88[arg0.anInt7244 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray88, arg0.anInt7244 + 10, arg0.aByteArray88.length - 10 - arg0.anInt7244 + -8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
