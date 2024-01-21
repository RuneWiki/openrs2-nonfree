import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class78 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class78() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
	private Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!pa;I[B)V")
	public void method1974(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray33[arg0.anInt2199] != 31 || arg0.aByteArray33[arg0.anInt2199 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray33, arg0.anInt2199 + 10, arg0.aByteArray33.length - (arg0.anInt2199 + 18));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
