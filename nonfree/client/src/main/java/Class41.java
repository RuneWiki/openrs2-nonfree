import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class41 {

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class41() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III)V")
	private Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BLclient!ic;B)V")
	public void method994(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg1.aByteArray27[arg1.anInt2187] != 31 || arg1.aByteArray27[arg1.anInt2187 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray27, arg1.anInt2187 + 10, arg1.aByteArray27.length + (-arg1.anInt2187 + -10 - 8));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
