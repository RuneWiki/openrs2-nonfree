import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	private Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([BBLclient!jd;)V")
	public void method6(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg1.aByteArray9[arg1.anInt1099] != 31 || arg1.aByteArray9[arg1.anInt1099 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray9, arg1.anInt1099 + 10, arg1.aByteArray9.length + -8 + -arg1.anInt1099 + -10);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(72) Exception local72) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
