import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub1_Sub5_Sub6 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
	private final int anInt2997;

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	private final int anInt2993;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "I")
	private final int anInt2990;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	private final int anInt2995;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
	private final int anInt2998;

	@OriginalMember(owner = "client!me", name = "qb", descriptor = "Lclient!pf;")
	private Class1_Sub1_Sub12 aClass1_Sub1_Sub12_2;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
	private int anInt2989;

	@OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
	private int anInt2992;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIZLclient!ff;)V")
	public Class1_Sub1_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub1_Sub5 arg8) {
		this.anInt2997 = arg1;
		this.anInt2996 = arg4;
		this.anInt2993 = arg5;
		this.anInt2990 = arg0;
		this.anInt2995 = arg2;
		this.anInt2998 = arg3;
		if (arg6 != -1) {
			this.aClass1_Sub1_Sub12_2 = Static121.method2378(arg6);
			this.anInt2989 = 0;
			this.anInt2992 = Static41.anInt1322 - 1;
			if (this.aClass1_Sub1_Sub12_2.anInt3450 == 0 && arg8 != null && arg8 instanceof Class1_Sub1_Sub5_Sub6) {
				@Pc(50) Class1_Sub1_Sub5_Sub6 local50 = (Class1_Sub1_Sub5_Sub6) arg8;
				if (local50.aClass1_Sub1_Sub12_2 == this.aClass1_Sub1_Sub12_2) {
					this.anInt2989 = local50.anInt2989;
					this.anInt2992 = local50.anInt2992;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub1_Sub12_2.anInt3462 != -1) {
				this.anInt2989 = (int) ((double) this.aClass1_Sub1_Sub12_2.anIntArray307.length * Math.random());
				this.anInt2992 -= (int) ((double) this.aClass1_Sub1_Sub12_2.anIntArray309[this.anInt2989] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		if (this.aClass1_Sub1_Sub12_2 != null) {
			@Pc(10) int local10 = Static41.anInt1322 - this.anInt2992;
			if (local10 > 100 && this.aClass1_Sub1_Sub12_2.anInt3462 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass1_Sub1_Sub12_2.anIntArray309[this.anInt2989]) {
							break label46;
						}
						local10 -= this.aClass1_Sub1_Sub12_2.anIntArray309[this.anInt2989];
						this.anInt2989++;
					} while (this.aClass1_Sub1_Sub12_2.anIntArray307.length > this.anInt2989);
					this.anInt2989 -= this.aClass1_Sub1_Sub12_2.anInt3462;
				} while (this.anInt2989 >= 0 && this.anInt2989 < this.aClass1_Sub1_Sub12_2.anIntArray307.length);
				this.aClass1_Sub1_Sub12_2 = null;
			}
			this.anInt2992 = Static41.anInt1322 - local10;
		}
		@Pc(98) Class1_Sub1_Sub11 local98 = Static62.method1274(this.anInt2990);
		if (local98.anIntArray250 != null) {
			local98 = local98.method1961();
		}
		if (local98 == null) {
			return null;
		}
		@Pc(124) int local124;
		@Pc(127) int local127;
		if (this.anInt2995 == 1 || this.anInt2995 == 3) {
			local127 = local98.anInt2815;
			local124 = local98.anInt2822;
		} else {
			local124 = local98.anInt2815;
			local127 = local98.anInt2822;
		}
		@Pc(142) int local142 = this.anInt2996 + (local124 >> 1);
		@Pc(151) int local151 = (local124 + 1 >> 1) + this.anInt2996;
		@Pc(160) int local160 = (local127 + 1 >> 1) + this.anInt2993;
		@Pc(167) int local167 = (local127 >> 1) + this.anInt2993;
		@Pc(172) int[][] local172 = Static135.anIntArrayArrayArray5[this.anInt2998];
		@Pc(203) int local203 = local172[local142][local160] + local172[local151][local167] + local172[local142][local167] + local172[local151][local160] >> 2;
		@Pc(213) int local213 = (this.anInt2996 << 7) + (local124 << 6);
		@Pc(222) int local222 = (local127 << 6) + (this.anInt2993 << 7);
		return local98.method1962(local222, local213, this.anInt2997, this.anInt2989, local172, local203, this.aClass1_Sub1_Sub12_2, this.anInt2995);
	}
}
