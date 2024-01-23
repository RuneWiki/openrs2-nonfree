import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class94 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class94() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V")
	private Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fd;B[B)V")
	public void method1980(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray71[arg0.anInt5713] != 31 || arg0.aByteArray71[arg0.anInt5713 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray71, arg0.anInt5713 + 10, arg0.aByteArray71.length - (arg0.anInt5713 + 18));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
