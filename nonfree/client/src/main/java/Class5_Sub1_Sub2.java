import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!af", name = "db", descriptor = "I")
	private int anInt206 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!qe;)V")
	public void method140(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1546();
			if (local5 == 0) {
				return;
			}
			this.method144(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	private void method141(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> -1925245304 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(28) double local28 = local10;
		if (local19 > local10) {
			local28 = local19;
		}
		if (local28 < local26) {
			local28 = local26;
		}
		@Pc(46) double local46 = local10;
		if (local10 > local19) {
			local46 = local19;
		}
		@Pc(54) double local54 = 0.0D;
		if (local46 > local26) {
			local46 = local26;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local28 + local46) / 2.0D;
		if (local28 != local46) {
			if (local68 < 0.5D) {
				local62 = (local28 - local46) / (local28 + local46);
			}
			if (local28 == local10) {
				local54 = (local19 - local26) / (local28 - local46);
			} else if (local28 == local19) {
				local54 = (local26 - local10) / (-local46 + local28) + 2.0D;
			} else if (local26 == local28) {
				local54 = (local10 - local19) / (local28 - local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local28 - local46) / (2.0D - local28 - local46);
			}
		}
		if (local68 > 0.5D) {
			this.anInt203 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt203 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt203 < 1) {
			this.anInt203 = 1;
		}
		this.anInt210 = (int) (local62 * 256.0D);
		this.anInt198 = (int) (local68 * 256.0D);
		if (this.anInt198 < 0) {
			this.anInt198 = 0;
		} else if (this.anInt198 > 255) {
			this.anInt198 = 255;
		}
		local54 /= 6.0D;
		if (this.anInt210 < 0) {
			this.anInt210 = 0;
		} else if (this.anInt210 > 255) {
			this.anInt210 = 255;
		}
		this.anInt199 = (int) ((double) this.anInt203 * local54);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qe;ZII)V")
	private void method144(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt206 = arg0.method1530();
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
	public void method147() {
		this.method141(this.anInt206);
	}
}
