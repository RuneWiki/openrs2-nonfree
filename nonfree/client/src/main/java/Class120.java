import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class120 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class120() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(III)V")
	private Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([BILclient!ha;)V")
	public void method2735(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg1.aByteArray51[arg1.anInt3487] != 31 || arg1.aByteArray51[arg1.anInt3487 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray51, arg1.anInt3487 + 10, arg1.aByteArray51.length - (arg1.anInt3487 + 18));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
