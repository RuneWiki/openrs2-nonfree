import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class259 {

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class259() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(III)V")
	private Class259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B[BLclient!co;)V")
	public void method6136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg1.aByteArray66[arg1.anInt4960] != 31 || arg1.aByteArray66[arg1.anInt4960 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray66, arg1.anInt4960 + 10, arg1.aByteArray66.length + (-arg1.anInt4960 + -8 - 10));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
