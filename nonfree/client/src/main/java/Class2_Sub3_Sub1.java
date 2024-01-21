import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!af", name = "T", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	private int anInt123 = 0;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt136 = -1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	private void method82(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local30 < local14) {
			local32 = local30;
		}
		@Pc(42) double local42 = 0.0D;
		if (local14 < local30) {
			local34 = local30;
		}
		if (local21 > local34) {
			local34 = local21;
		}
		@Pc(56) double local56 = 0.0D;
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(68) double local68 = (local34 + local32) / 2.0D;
		if (local34 != local32) {
			if (local34 == local14) {
				local42 = (local30 - local21) / (local34 - local32);
			} else if (local34 == local30) {
				local42 = (local21 - local14) / (-local32 + local34) + 2.0D;
			} else if (local34 == local21) {
				local42 = (local14 - local30) / (local34 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local56 = (local34 - local32) / (local32 + local34);
			}
			if (local68 >= 0.5D) {
				local56 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		this.anInt138 = (int) (local56 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt135 = (int) ((1.0D - local68) * 512.0D * local56);
		} else {
			this.anInt135 = (int) (local56 * local68 * 512.0D);
		}
		if (this.anInt138 < 0) {
			this.anInt138 = 0;
		} else if (this.anInt138 > 255) {
			this.anInt138 = 255;
		}
		if (this.anInt135 < 1) {
			this.anInt135 = 1;
		}
		this.anInt132 = (int) (local68 * 256.0D);
		local42 /= 6.0D;
		this.anInt133 = (int) (local42 * (double) this.anInt135);
		if (this.anInt132 < 0) {
			this.anInt132 = 0;
		} else if (this.anInt132 > 255) {
			this.anInt132 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!me;II)V")
	public void method84(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1402();
			if (local14 == 0) {
				return;
			}
			this.method85(arg0, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!me;III)V")
	private void method85(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt123 = arg0.method1406();
			this.method82(this.anInt123);
		} else if (arg2 == 2) {
			this.anInt136 = arg0.method1397();
			if (this.anInt136 == 65535) {
				this.anInt136 = -1;
				return;
			}
		} else if (arg2 == 3) {
			arg0.method1397();
			return;
		} else {
			return;
		}
	}
}
