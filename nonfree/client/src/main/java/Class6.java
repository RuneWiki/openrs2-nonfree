import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 {

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class6() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(III)V")
	private Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!pg;[B)V")
	public void method154(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray40[arg0.anInt2656] != 31 || arg0.aByteArray40[arg0.anInt2656 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray40, arg0.anInt2656 + 10, -8 - arg0.anInt2656 + -10 + arg0.aByteArray40.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
