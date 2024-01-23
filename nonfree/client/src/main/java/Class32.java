import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class32 {

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class32() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	private Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!nc;[B)V")
	public void method1062(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray20[arg0.anInt1192] != 31 || arg0.aByteArray20[arg0.anInt1192 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray20, arg0.anInt1192 + 10, arg0.aByteArray20.length + -8 + (-arg0.anInt1192 - 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(75) Exception local75) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
