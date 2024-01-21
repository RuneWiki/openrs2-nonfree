import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class4_Sub1_Sub3_Sub5 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
	private final int anInt2355;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
	private final int anInt2353;

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
	private final int anInt2347;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
	private final int anInt2356;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
	private final int anInt2357;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
	private final int anInt2352;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lclient!vc;")
	private Class4_Sub1_Sub17 aClass4_Sub1_Sub17_1;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
	private int anInt2350;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIZLclient!dd;)V")
	public Class4_Sub1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class4_Sub1_Sub3 arg8) {
		this.anInt2355 = arg0;
		this.anInt2353 = arg1;
		this.anInt2347 = arg3;
		this.anInt2356 = arg5;
		this.anInt2357 = arg2;
		this.anInt2352 = arg4;
		if (arg6 != -1) {
			this.aClass4_Sub1_Sub17_1 = Static79.method1437(arg6);
			this.anInt2350 = 0;
			this.anInt2358 = Static117.anInt2877 - 1;
			if (this.aClass4_Sub1_Sub17_1.anInt3005 == 0 && arg8 != null && arg8 instanceof Class4_Sub1_Sub3_Sub5) {
				@Pc(50) Class4_Sub1_Sub3_Sub5 local50 = (Class4_Sub1_Sub3_Sub5) arg8;
				if (this.aClass4_Sub1_Sub17_1 == local50.aClass4_Sub1_Sub17_1) {
					this.anInt2350 = local50.anInt2350;
					this.anInt2358 = local50.anInt2358;
					return;
				}
			}
			if (arg7 && this.aClass4_Sub1_Sub17_1.anInt2998 != -1) {
				this.anInt2350 = (int) ((double) this.aClass4_Sub1_Sub17_1.anIntArray330.length * Math.random());
				this.anInt2358 -= (int) ((double) this.aClass4_Sub1_Sub17_1.anIntArray327[this.anInt2350] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		if (this.aClass4_Sub1_Sub17_1 != null) {
			@Pc(10) int local10 = Static117.anInt2877 - this.anInt2358;
			if (local10 > 100 && this.aClass4_Sub1_Sub17_1.anInt2998 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass4_Sub1_Sub17_1.anIntArray327[this.anInt2350]) {
							break label46;
						}
						local10 -= this.aClass4_Sub1_Sub17_1.anIntArray327[this.anInt2350];
						this.anInt2350++;
					} while (this.aClass4_Sub1_Sub17_1.anIntArray330.length > this.anInt2350);
					this.anInt2350 -= this.aClass4_Sub1_Sub17_1.anInt2998;
				} while (this.anInt2350 >= 0 && this.aClass4_Sub1_Sub17_1.anIntArray330.length > this.anInt2350);
				this.aClass4_Sub1_Sub17_1 = null;
			}
			this.anInt2358 = Static117.anInt2877 - local10;
		}
		@Pc(102) Class4_Sub1_Sub5 local102 = Static5.method45(this.anInt2355);
		if (local102.anIntArray137 != null) {
			local102 = local102.method885();
		}
		if (local102 == null) {
			return null;
		}
		@Pc(129) int local129;
		@Pc(126) int local126;
		if (this.anInt2357 == 1 || this.anInt2357 == 3) {
			local126 = local102.anInt1256;
			local129 = local102.anInt1267;
		} else {
			local129 = local102.anInt1256;
			local126 = local102.anInt1267;
		}
		@Pc(146) int local146 = this.anInt2352 + (local129 + 1 >> 1);
		@Pc(154) int local154 = this.anInt2352 + (local129 >> 1);
		@Pc(161) int local161 = this.anInt2356 + (local126 >> 1);
		@Pc(170) int local170 = (local126 + 1 >> 1) + this.anInt2356;
		@Pc(175) int[][] local175 = Static57.anIntArrayArrayArray4[this.anInt2347];
		@Pc(202) int local202 = local175[local146][local170] + local175[local154][local170] + local175[local154][local161] + local175[local146][local161] >> 2;
		@Pc(212) int local212 = (this.anInt2352 << 7) + (local129 << 6);
		@Pc(222) int local222 = (this.anInt2356 << 7) + (local126 << 6);
		return local102.method878(this.aClass4_Sub1_Sub17_1, local222, this.anInt2353, local175, local212, this.anInt2350, local202, this.anInt2357);
	}
}
