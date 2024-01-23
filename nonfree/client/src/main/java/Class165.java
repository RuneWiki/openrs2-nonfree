import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class165 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class165() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III)V")
	private Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pi;Z[B)V")
	public void method4232(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray47[arg0.anInt3822] != 31 || arg0.aByteArray47[arg0.anInt3822 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray47, arg0.anInt3822 + 10, -arg0.anInt3822 + -8 + -10 + arg0.aByteArray47.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
