import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class69 {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class69() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V")
	private Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!lf;[B)V")
	public void method2211(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray55[arg0.anInt3768] != 31 || arg0.aByteArray55[arg0.anInt3768 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray55, arg0.anInt3768 + 10, arg0.aByteArray55.length - (arg0.anInt3768 - -18));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
