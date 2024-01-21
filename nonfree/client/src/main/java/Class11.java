import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class11 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class11() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V")
	private Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BLclient!kd;B)V")
	public void method237(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg1.aByteArray26[arg1.anInt2235] != 31 || arg1.aByteArray26[arg1.anInt2235 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray26, arg1.anInt2235 + 10, -18 - arg1.anInt2235 + arg1.aByteArray26.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
