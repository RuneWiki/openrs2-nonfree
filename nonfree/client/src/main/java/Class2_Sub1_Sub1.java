import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	public int anInt73;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
	private int anInt71 = -1;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	private int anInt65 = 0;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V")
	private void method52(@OriginalArg(1) int arg0) {
		@Pc(18) double local18 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(29) double local29 = local18;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local18;
		if (local27 < local18) {
			local29 = local27;
		}
		if (local36 < local29) {
			local29 = local36;
		}
		@Pc(52) double local52 = 0.0D;
		@Pc(54) double local54 = 0.0D;
		if (local18 < local27) {
			local38 = local27;
		}
		if (local38 < local36) {
			local38 = local36;
		}
		@Pc(72) double local72 = (local29 + local38) / 2.0D;
		if (local38 != local29) {
			if (local38 == local18) {
				local52 = (local27 - local36) / (local38 - local29);
			} else if (local27 == local38) {
				local52 = (local36 - local18) / (-local29 + local38) + 2.0D;
			} else if (local36 == local38) {
				local52 = (local18 - local27) / (-local29 + local38) + 4.0D;
			}
			if (local72 < 0.5D) {
				local54 = (local38 - local29) / (local38 + local29);
			}
			if (local72 >= 0.5D) {
				local54 = (local38 - local29) / (2.0D - local38 - local29);
			}
		}
		local52 /= 6.0D;
		this.anInt73 = (int) (local54 * 256.0D);
		this.anInt66 = (int) (local72 * 256.0D);
		if (this.anInt73 < 0) {
			this.anInt73 = 0;
		} else if (this.anInt73 > 255) {
			this.anInt73 = 255;
		}
		if (this.anInt66 < 0) {
			this.anInt66 = 0;
		} else if (this.anInt66 > 255) {
			this.anInt66 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt82 = (int) (local54 * 512.0D * (1.0D - local72));
		} else {
			this.anInt82 = (int) (local72 * local54 * 512.0D);
		}
		if (this.anInt82 < 1) {
			this.anInt82 = 1;
		}
		this.anInt76 = (int) (local52 * (double) this.anInt82);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!kd;)V")
	public void method53(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1534();
			if (local14 == 0) {
				return;
			}
			this.method56(arg0, local14, arg1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!kd;Z)V")
	private void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt65 = arg2.method1536();
			this.method52(this.anInt65);
		} else if (arg1 == 2) {
			this.anInt71 = arg2.method1557();
			if (this.anInt71 == 65535) {
				this.anInt71 = -1;
				return;
			}
		} else if (arg1 == 3) {
			arg2.method1557();
			return;
		} else {
			return;
		}
	}
}
