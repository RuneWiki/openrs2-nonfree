import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class127 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
	private Class127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class127() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BLclient!aj;I)V")
	public void method3022(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class8_Sub2 arg1) {
		if (arg1.aByteArray24[arg1.anInt2955] != 31 || arg1.aByteArray24[arg1.anInt2955 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray24, arg1.anInt2955 + 10, arg1.aByteArray24.length - (arg1.anInt2955 - -8 + 10));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
