import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class57 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class57() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	private Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!ce;[B)V")
	public void method2222(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray27[arg0.anInt2195] != 31 || arg0.aByteArray27[arg0.anInt2195 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray27, arg0.anInt2195 + 10, arg0.aByteArray27.length - 10 - arg0.anInt2195 + -8);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
