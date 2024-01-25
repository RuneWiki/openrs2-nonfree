import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class157 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class157() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(III)V")
	private Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!at;[B)V")
	public void method4295(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray41[arg0.anInt2219] != 31 || arg0.aByteArray41[arg0.anInt2219 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray41, arg0.anInt2219 + 10, -arg0.anInt2219 + -10 + -8 + arg0.aByteArray41.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
