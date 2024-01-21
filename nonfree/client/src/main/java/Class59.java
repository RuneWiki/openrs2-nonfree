import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class59 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class59() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
	private Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!la;Z[B)V")
	public void method1785(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray77[arg0.anInt2886] != 31 || arg0.aByteArray77[arg0.anInt2886 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray77, arg0.anInt2886 + 10, arg0.aByteArray77.length + -10 + (-arg0.anInt2886 - 8));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
