import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TKEGJSFV")
public final class Class38 {

	@OriginalMember(owner = "client!TKEGJSFV", name = "c", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!TKEGJSFV", name = "d", descriptor = "I")
	private int anInt726;

	@OriginalMember(owner = "client!TKEGJSFV", name = "e", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!TKEGJSFV", name = "f", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!TKEGJSFV", name = "g", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!TKEGJSFV", name = "h", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!TKEGJSFV", name = "i", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!TKEGJSFV", name = "a", descriptor = "I")
	private int anInt725 = 4;

	@OriginalMember(owner = "client!TKEGJSFV", name = "b", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!TKEGJSFV", name = "<init>", descriptor = "(B[B)V")
	public Class38(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.method513(arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("96065, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKEGJSFV", name = "a", descriptor = "([BZ)V")
	private void method513(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg0, false);
			@Pc(10) int local10 = local7.method171();
			@Pc(13) int local13 = local7.method171();
			if (local13 == local10) {
				this.aByteArray18 = arg0;
				this.aBoolean195 = false;
			} else {
				@Pc(19) byte[] local19 = new byte[local10];
				Class24.method320(local19, local10, arg0, local13, 6);
				this.aByteArray18 = local19;
				local7 = new Class4_Sub1_Sub3(this.aByteArray18, false);
				this.aBoolean195 = true;
			}
			this.anInt726 = local7.method169();
			this.anIntArray171 = new int[this.anInt726];
			this.anIntArray172 = new int[this.anInt726];
			this.anIntArray173 = new int[this.anInt726];
			this.anIntArray174 = new int[this.anInt726];
			@Pc(82) int local82 = local7.anInt242 + this.anInt726 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt726; local84++) {
				this.anIntArray171[local84] = local7.method172();
				this.anIntArray172[local84] = local7.method171();
				this.anIntArray173[local84] = local7.method171();
				this.anIntArray174[local84] = local82;
				local82 += this.anIntArray173[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("87564, " + arg0 + ", " + false + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKEGJSFV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method514(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt726; local27++) {
			if (this.anIntArray171[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray172[local27]];
				}
				if (this.aBoolean195) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray172[local27]; local67++) {
						arg1[local67] = this.aByteArray18[this.anIntArray174[local27] + local67];
					}
				} else {
					Class24.method320(arg1, this.anIntArray172[local27], this.aByteArray18, this.anIntArray173[local27], this.anIntArray174[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
