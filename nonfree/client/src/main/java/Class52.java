import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class52 {

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "[I")
	public static int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(27) int local27 = local24;
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				if ((local27 & 0x1) == 1) {
					local27 = local27 >>> 1 ^ 0xEDB88320;
				} else {
					local27 >>>= 0x1;
				}
			}
			anIntArray179[local24] = local27;
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class52() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	private Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B[BLclient!vf;)V")
	public void method1389(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		if (arg1.aByteArray52[arg1.anInt4021] != 31 || arg1.aByteArray52[arg1.anInt4021 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray52, arg1.anInt4021 + 10, arg1.aByteArray52.length - 10 - arg1.anInt4021 - 8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
