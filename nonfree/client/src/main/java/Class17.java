import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class17 {

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class17() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(III)V")
	private Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ce;B[B)V")
	public void method464(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray12[arg0.anInt1758] != 31 || arg0.aByteArray12[arg0.anInt1758 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray12, arg0.anInt1758 + 10, -18 - arg0.anInt1758 + arg0.aByteArray12.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
