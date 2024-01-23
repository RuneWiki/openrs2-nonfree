import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt3911;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!og", name = "V", descriptor = "I")
	private int anInt3916;

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
	private int anInt3919;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
	private int anInt3921;

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	private int anInt3923;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "I")
	private int anInt3917 = 0;

	@OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
	private int anInt3925 = 0;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "I")
	private int anInt3913 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBII)V")
	private void method3311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(23) int local23 = local16 > arg0 ? arg0 : local16;
		@Pc(34) int local34 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(45) int local45 = local34 >= arg0 ? local34 : arg0;
		this.anInt3919 = (local45 + local23) / 2;
		@Pc(56) int local56 = local45 - local23;
		if (local56 <= 0) {
			this.anInt3921 = 0;
		} else {
			@Pc(83) int local83 = (local45 - arg1 << 12) / local56;
			@Pc(92) int local92 = (local45 - arg2 << 12) / local56;
			@Pc(101) int local101 = (local45 - arg0 << 12) / local56;
			if (local45 == arg2) {
				this.anInt3921 = local23 == arg1 ? local101 + 20480 : -local83 + 4096;
			} else if (local45 == arg1) {
				this.anInt3921 = local23 == arg0 ? local92 + 4096 : -local101 + 12288;
			} else {
				this.anInt3921 = arg2 == local23 ? local83 + 12288 : 20480 - local92;
			}
			this.anInt3921 /= 6;
		}
		if (this.anInt3919 > 0 && this.anInt3919 < 4096) {
			this.anInt3916 = (local56 << 12) / (this.anInt3919 <= 2048 ? this.anInt3919 * 2 : 8192 - (this.anInt3919 * 2));
		} else {
			this.anInt3916 = 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIII)V")
	private void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
		if (local28 <= 0) {
			this.anInt3911 = this.anInt3914 = this.anInt3923 = arg0;
			return;
		}
		@Pc(40) int local40 = arg2 * 6;
		@Pc(47) int local47 = arg0 + arg0 - local28;
		@Pc(56) int local56 = (local28 - local47 << 12) / local28;
		@Pc(60) int local60 = local40 >> 12;
		@Pc(67) int local67 = local40 - (local60 << 12);
		@Pc(75) int local75 = local28 * local56 >> 12;
		@Pc(81) int local81 = local75 * local67 >> 12;
		@Pc(86) int local86 = local28 - local81;
		@Pc(90) int local90 = local47 + local81;
		if (local60 == 0) {
			this.anInt3911 = local28;
			this.anInt3914 = local90;
			this.anInt3923 = local47;
		} else if (local60 == 1) {
			this.anInt3923 = local47;
			this.anInt3914 = local28;
			this.anInt3911 = local86;
		} else if (local60 == 2) {
			this.anInt3914 = local28;
			this.anInt3911 = local47;
			this.anInt3923 = local90;
		} else if (local60 == 3) {
			this.anInt3923 = local28;
			this.anInt3911 = local47;
			this.anInt3914 = local86;
		} else if (local60 == 4) {
			this.anInt3914 = local47;
			this.anInt3923 = local28;
			this.anInt3911 = local90;
		} else if (local60 == 5) {
			this.anInt3923 = local86;
			this.anInt3911 = local28;
			this.anInt3914 = local47;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(27) int[][] local27 = this.method4965(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local16[0];
			@Pc(43) int[] local43 = local27[2];
			@Pc(47) int[] local47 = local16[1];
			@Pc(51) int[] local51 = local16[2];
			for (@Pc(53) int local53 = 0; local53 < Static22.anInt421; local53++) {
				this.method3311(local43[local53], local35[local53], local31[local53]);
				this.anInt3919 += this.anInt3913;
				this.anInt3916 += this.anInt3917;
				if (this.anInt3919 < 0) {
					this.anInt3919 = 0;
				}
				if (this.anInt3916 < 0) {
					this.anInt3916 = 0;
				}
				if (this.anInt3916 > 4096) {
					this.anInt3916 = 4096;
				}
				if (this.anInt3919 > 4096) {
					this.anInt3919 = 4096;
				}
				for (this.anInt3921 += this.anInt3925; this.anInt3921 < 0; this.anInt3921 += 4096) {
				}
				while (this.anInt3921 > 4096) {
					this.anInt3921 -= 4096;
				}
				this.method3312(this.anInt3919, this.anInt3916, this.anInt3921);
				local39[local53] = this.anInt3911;
				local47[local53] = this.anInt3914;
				local51[local53] = this.anInt3923;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3925 = arg1.method3930();
		} else if (arg0 == 1) {
			this.anInt3917 = (arg1.method3920() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3913 = (arg1.method3920() << 12) / 100;
		}
	}
}
