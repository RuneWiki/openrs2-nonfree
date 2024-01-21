import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class4_Sub3_Sub1_Sub6 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
	private final int anInt2124;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "I")
	private final int anInt2114;

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
	private final int anInt2119;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
	private final int anInt2120;

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
	private final int anInt2118;

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
	private final int anInt2117;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "Lclient!ne;")
	private Class4_Sub3_Sub10 aClass4_Sub3_Sub10_3;

	@OriginalMember(owner = "client!q", name = "mb", descriptor = "I")
	private int anInt2125;

	@OriginalMember(owner = "client!q", name = "X", descriptor = "I")
	private int anInt2116;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIIIZLclient!h;)V")
	public Class4_Sub3_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class4_Sub3_Sub1 arg8) {
		this.anInt2124 = arg3;
		this.anInt2114 = arg1;
		this.anInt2119 = arg0;
		this.anInt2120 = arg2;
		this.anInt2118 = arg5;
		this.anInt2117 = arg4;
		if (arg6 != -1) {
			this.aClass4_Sub3_Sub10_3 = Static7.method63(arg6);
			this.anInt2125 = 0;
			this.anInt2116 = Static118.anInt2741 - 1;
			if (this.aClass4_Sub3_Sub10_3.anInt1871 == 0 && arg8 != null && arg8 instanceof Class4_Sub3_Sub1_Sub6) {
				@Pc(47) Class4_Sub3_Sub1_Sub6 local47 = (Class4_Sub3_Sub1_Sub6) arg8;
				if (local47.aClass4_Sub3_Sub10_3 == this.aClass4_Sub3_Sub10_3) {
					this.anInt2125 = local47.anInt2125;
					this.anInt2116 = local47.anInt2116;
					return;
				}
			}
			if (arg7 && this.aClass4_Sub3_Sub10_3.anInt1873 != -1) {
				this.anInt2125 = (int) (Math.random() * (double) this.aClass4_Sub3_Sub10_3.anIntArray216.length);
				this.anInt2116 -= (int) ((double) this.aClass4_Sub3_Sub10_3.anIntArray218[this.anInt2125] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		if (this.aClass4_Sub3_Sub10_3 != null) {
			@Pc(14) int local14 = Static118.anInt2741 - this.anInt2116;
			if (local14 > 100 && this.aClass4_Sub3_Sub10_3.anInt1873 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass4_Sub3_Sub10_3.anIntArray218[this.anInt2125] >= local14) {
							break label46;
						}
						local14 -= this.aClass4_Sub3_Sub10_3.anIntArray218[this.anInt2125];
						this.anInt2125++;
					} while (this.anInt2125 < this.aClass4_Sub3_Sub10_3.anIntArray216.length);
					this.anInt2125 -= this.aClass4_Sub3_Sub10_3.anInt1873;
				} while (this.anInt2125 >= 0 && this.aClass4_Sub3_Sub10_3.anIntArray216.length > this.anInt2125);
				this.aClass4_Sub3_Sub10_3 = null;
			}
			this.anInt2116 = Static118.anInt2741 - local14;
		}
		@Pc(105) Class4_Sub3_Sub3 local105 = Static76.method1244(this.anInt2119);
		if (local105.anIntArray81 != null) {
			local105 = local105.method402();
		}
		if (local105 == null) {
			return null;
		}
		@Pc(130) int local130;
		@Pc(127) int local127;
		if (this.anInt2120 == 1 || this.anInt2120 == 3) {
			local127 = local105.anInt760;
			local130 = local105.anInt750;
		} else {
			local127 = local105.anInt750;
			local130 = local105.anInt760;
		}
		@Pc(148) int local148 = this.anInt2117 + (local130 + 1 >> 1);
		@Pc(155) int local155 = (local130 >> 1) + this.anInt2117;
		@Pc(163) int local163 = this.anInt2118 + (local127 >> 1);
		@Pc(168) int[][] local168 = Static16.anIntArrayArrayArray1[this.anInt2124];
		@Pc(182) int local182 = this.anInt2118 + (local127 + 1 >> 1);
		@Pc(208) int local208 = local168[local148][local182] + local168[local155][local182] + local168[local148][local163] + local168[local155][local163] >> 2;
		@Pc(217) int local217 = (local127 << 6) + (this.anInt2118 << 7);
		@Pc(226) int local226 = (local130 << 6) + (this.anInt2117 << 7);
		return local105.method403(this.anInt2125, this.anInt2120, local208, this.aClass4_Sub3_Sub10_3, this.anInt2114, local226, local168, local217);
	}
}
