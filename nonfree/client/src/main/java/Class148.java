import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class148 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3757 = 500;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_31 = new Class98(8);

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!h;")
	public static final Class89 aClass89_155 = new Class89(46, -1);

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!h;")
	public static final Class89 aClass89_156 = new Class89(7, 2);

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "[B")
	public static final byte[] aByteArray39;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "[I")
	public static final int[] anIntArray229;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public static int anInt3770;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!fl;")
	public Class72 aClass72_4;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt3760 = 127;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt3762 = 16;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public boolean aBoolean244 = true;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public int anInt3755 = -1;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public int anInt3759 = 128;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt3767 = 1190717;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt3765 = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	public int anInt3768 = 8;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public int anInt3753 = -1;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt3758 = -1;

	static {
		@Pc(20) int local20 = 0;
		aByteArray39 = new byte[32896];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			for (@Pc(28) int local28 = 0; local28 <= local25; local28++) {
				aByteArray39[local20++] = (byte) (255.0D / Math.sqrt((double) ((float) (local25 * local25 + local28 * local28 + 65535) / 65535.0F)));
			}
		}
		anIntArray229 = new int[4];
		anInt3770 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;Z)V", line = 3)
	private void method3716(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3765 = Static90.method2103(arg1.method4834());
		} else if (arg0 == 2) {
			this.anInt3758 = arg1.method4816();
		} else if (arg0 == 3) {
			this.anInt3758 = arg1.method4830();
			if (this.anInt3758 == 65535) {
				this.anInt3758 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean244 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt3753 = Static90.method2103(arg1.method4834());
		} else if (arg0 == 8) {
			this.aClass72_4.anInt2057 = this.anInt3752;
			return;
		} else if (arg0 == 9) {
			this.anInt3759 = arg1.method4830();
			return;
		} else if (arg0 == 10) {
			this.aBoolean246 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt3768 = arg1.method4816();
			return;
		} else if (arg0 == 12) {
			this.aBoolean245 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt3767 = arg1.method4834();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt3762 = arg1.method4816();
			} else if (arg0 == 15) {
				this.anInt3755 = arg1.method4830();
				if (this.anInt3755 == 65535) {
					this.anInt3755 = -1;
					return;
				}
			} else if (arg0 == 16) {
				this.anInt3760 = arg1.method4816();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 83)
	public void method3717() {
		if (this.anInt3755 == -1) {
			this.anInt3755 = this.anInt3758;
		}
		this.anInt3768 = this.anInt3752 | this.anInt3768 << 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;)V", line = 130)
	public void method3719(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method3716(local5, arg0);
		}
	}
}
