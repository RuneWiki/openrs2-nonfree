import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class103 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class103() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
	private Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!k;I[B)V")
	public void method3099(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray62[arg0.anInt4860] != 31 || arg0.aByteArray62[arg0.anInt4860 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray62, arg0.anInt4860 + 10, -10 - arg0.anInt4860 - 8 + arg0.aByteArray62.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
