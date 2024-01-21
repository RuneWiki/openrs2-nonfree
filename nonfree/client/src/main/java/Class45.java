import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class45 {

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private int anInt994 = 33317;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "([BZ)V")
	public Class45(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method643(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("38009, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Z[B)V")
	private void method643(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, true);
			@Pc(10) int local10 = local7.method472();
			@Pc(18) int local18 = local7.method472();
			if (local18 == local10) {
				this.aByteArray21 = arg0;
				this.aBoolean203 = false;
			} else {
				@Pc(24) byte[] local24 = new byte[local10];
				Class38.method601(local24, local10, arg0, local18, 6);
				this.aByteArray21 = local24;
				local7 = new Class1_Sub1_Sub3(this.aByteArray21, true);
				this.aBoolean203 = true;
			}
			this.anInt996 = local7.method470();
			this.anIntArray253 = new int[this.anInt996];
			this.anIntArray254 = new int[this.anInt996];
			this.anIntArray255 = new int[this.anInt996];
			this.anIntArray256 = new int[this.anInt996];
			@Pc(84) int local84 = local7.anInt777 + this.anInt996 * 10;
			for (@Pc(86) int local86 = 0; local86 < this.anInt996; local86++) {
				this.anIntArray253[local86] = local7.method473();
				this.anIntArray254[local86] = local7.method472();
				this.anIntArray255[local86] = local7.method472();
				this.anIntArray256[local86] = local84;
				local84 += this.anIntArray255[local86];
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("7367, " + false + ", " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method644(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt996; local27++) {
			if (this.anIntArray253[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray254[local27]];
				}
				if (this.aBoolean203) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray254[local27]; local67++) {
						arg1[local67] = this.aByteArray21[this.anIntArray256[local27] + local67];
					}
				} else {
					Class38.method601(arg1, this.anIntArray254[local27], this.aByteArray21, this.anIntArray255[local27], this.anIntArray256[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
