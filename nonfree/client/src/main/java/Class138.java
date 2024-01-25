import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class138 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class138() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V")
	private Class138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BLclient!fb;)V")
	public void method3544(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg1.aByteArray70[arg1.anInt4268] != 31 || arg1.aByteArray70[arg1.anInt4268 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray70, arg1.anInt4268 + 10, -arg1.anInt4268 - 18 + arg1.aByteArray70.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
