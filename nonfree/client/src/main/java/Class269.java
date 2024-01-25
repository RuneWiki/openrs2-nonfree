import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class269 {

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class269() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
	private Class269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([BILclient!ia;)V")
	public void method6149(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg1.aByteArray14[arg1.anInt1710] != 31 || arg1.aByteArray14[arg1.anInt1710 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray14, arg1.anInt1710 + 10, -arg1.anInt1710 + -8 - (10 - arg1.aByteArray14.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
