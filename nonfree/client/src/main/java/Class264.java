import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class264 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class264() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(III)V")
	private Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!wn;[B)V")
	public void method6060(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray77[arg0.anInt5526] != 31 || arg0.aByteArray77[arg0.anInt5526 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray77, arg0.anInt5526 + 10, arg0.aByteArray77.length + -8 + -arg0.anInt5526 + -10);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
