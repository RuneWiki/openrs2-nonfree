import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class47 {

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt971 = -550;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt972 = 30967;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "([BI)V")
	public Class47(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method661((byte) 9, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("71105, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(B[B)V")
	private void method661(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, 15787);
			@Pc(10) int local10 = local7.method480();
			@Pc(13) int local13 = local7.method480();
			if (local13 == local10) {
				this.aByteArray21 = arg1;
				this.aBoolean250 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class38.method577(local19, local10, arg1, local13, 6);
				this.aByteArray21 = local19;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, 15787);
				this.aBoolean250 = true;
			}
			this.anInt973 = local7.method478();
			this.anIntArray264 = new int[this.anInt973];
			@Pc(61) boolean local61 = false;
			this.anIntArray265 = new int[this.anInt973];
			this.anIntArray266 = new int[this.anInt973];
			this.anIntArray267 = new int[this.anInt973];
			@Pc(87) int local87 = local7.anInt734 + this.anInt973 * 10;
			for (@Pc(89) int local89 = 0; local89 < this.anInt973; local89++) {
				this.anIntArray264[local89] = local7.method481();
				this.anIntArray265[local89] = local7.method480();
				this.anIntArray266[local89] = local7.method480();
				this.anIntArray267[local89] = local87;
				local87 += this.anIntArray266[local89];
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("9624, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method662(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt973; local27++) {
			if (this.anIntArray264[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray265[local27]];
				}
				if (this.aBoolean250) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray265[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray267[local27] + local67];
					}
				} else {
					Class38.method577(arg1, this.anIntArray265[local27], this.aByteArray21, this.anIntArray266[local27], this.anIntArray267[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
