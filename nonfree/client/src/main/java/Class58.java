import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class58 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class58() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	private Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BILclient!tl;)V")
	public void method1461(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg1.aByteArray79[arg1.anInt6244] != 31 || arg1.aByteArray79[arg1.anInt6244 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray79, arg1.anInt6244 + 10, -18 - (arg1.anInt6244 - arg1.aByteArray79.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(57) Exception local57) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
