import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class261 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class261() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(III)V")
	private Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!rt;I[B)V")
	public void method6528(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray114[arg0.anInt9191] != 31 || arg0.aByteArray114[arg0.anInt9191 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray114, arg0.anInt9191 + 10, -arg0.anInt9191 - 10 + -8 + arg0.aByteArray114.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(72) Exception local72) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
