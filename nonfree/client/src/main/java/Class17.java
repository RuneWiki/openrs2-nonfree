import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class17 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	private Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class17() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BLclient!be;I)V")
	public void method357(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg1.aByteArray20[arg1.anInt1298] != 31 || arg1.aByteArray20[arg1.anInt1298 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray20, arg1.anInt1298 + 10, arg1.aByteArray20.length - 18 - arg1.anInt1298);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(61) Exception local61) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
