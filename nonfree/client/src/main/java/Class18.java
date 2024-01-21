import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class18 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class18() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	private Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[BLclient!ff;)V")
	public void method573(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if (arg1.aByteArray16[arg1.anInt1793] != 31 || arg1.aByteArray16[arg1.anInt1793 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray16, arg1.anInt1793 + 10, -arg1.anInt1793 + -8 + -10 + arg1.aByteArray16.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
