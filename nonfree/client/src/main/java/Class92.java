import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class92 {

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class92() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
	private Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BLclient!p;I)V")
	public void method2285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub17 arg1) {
		if (arg1.aByteArray30[arg1.anInt2400] != 31 || arg1.aByteArray30[arg1.anInt2400 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray30, arg1.anInt2400 + 10, arg1.aByteArray30.length + -8 + -arg1.anInt2400 + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(76) Exception local76) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
