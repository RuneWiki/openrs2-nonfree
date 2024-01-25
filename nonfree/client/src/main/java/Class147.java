import java.awt.Rectangle;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class147 {

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		for (@Pc(63) int local63 = 0; local63 < 100; local63++) {
			aRectangleArray1[local63] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class147() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(III)V")
	private Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([BLclient!wq;I)V")
	public void method3396(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		if (arg1.aByteArray89[arg1.anInt8456] != 31 || arg1.aByteArray89[arg1.anInt8456 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray89, arg1.anInt8456 + 10, arg1.aByteArray89.length + (-arg1.anInt8456 - 10) + -8);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(69) Exception local69) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([BB)[B")
	public byte[] method3398(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub36 local8 = new Class5_Sub36(arg0);
		local8.anInt8456 = arg0.length - 4;
		@Pc(26) int local26 = local8.method7298();
		@Pc(29) byte[] local29 = new byte[local26];
		local8.anInt8456 = 0;
		this.method3396(local29, local8);
		return local29;
	}
}
