import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WEMOPWVJ")
public final class Class43 {

	@OriginalMember(owner = "client!WEMOPWVJ", name = "d", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "e", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "f", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "g", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "h", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "i", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "j", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "b", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "c", descriptor = "I")
	private int anInt728 = -192;

	@OriginalMember(owner = "client!WEMOPWVJ", name = "<init>", descriptor = "([BI)V")
	public Class43(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			this.method514(arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("2714, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "(Z[B)V")
	private void method514(@OriginalArg(1) byte[] arg0) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(arg0, true);
			@Pc(10) int local10 = local7.method409();
			@Pc(16) int local16 = local7.method409();
			if (local16 == local10) {
				this.aByteArray18 = arg0;
				this.aBoolean173 = false;
			} else {
				@Pc(22) byte[] local22 = new byte[local10];
				Class15.method173(local22, local10, arg0, local16, 6);
				this.aByteArray18 = local22;
				local7 = new Class1_Sub1_Sub4(this.aByteArray18, true);
				this.aBoolean173 = true;
			}
			this.anInt729 = local7.method407();
			this.anIntArray192 = new int[this.anInt729];
			this.anIntArray193 = new int[this.anInt729];
			this.anIntArray194 = new int[this.anInt729];
			this.anIntArray195 = new int[this.anInt729];
			@Pc(82) int local82 = local7.anInt624 + this.anInt729 * 10;
			for (@Pc(84) int local84 = 0; local84 < this.anInt729; local84++) {
				this.anIntArray192[local84] = local7.method410();
				this.anIntArray193[local84] = local7.method409();
				this.anIntArray194[local84] = local7.method409();
				this.anIntArray195[local84] = local82;
				local82 += this.anIntArray194[local84];
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("14050, " + false + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WEMOPWVJ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
	public byte[] method515(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3 = 0;
		@Pc(6) String local6 = arg0.toUpperCase();
		for (@Pc(8) int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt729; local27++) {
			if (this.anIntArray192[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray193[local27]];
				}
				if (this.aBoolean173) {
					for (@Pc(67) int local67 = 0; local67 < this.anIntArray193[local27]; local67++) {
						arg1[local67] = this.aByteArray18[this.anIntArray195[local27] + local67];
					}
				} else {
					Class15.method173(arg1, this.anIntArray193[local27], this.aByteArray18, this.anIntArray194[local27], this.anIntArray195[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
