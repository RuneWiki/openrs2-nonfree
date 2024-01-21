import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class2_Sub1_Sub3_Sub6 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!na", name = "R", descriptor = "I")
	private final int anInt2432;

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
	private final int anInt2444;

	@OriginalMember(owner = "client!na", name = "V", descriptor = "I")
	private final int anInt2434;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	private final int anInt2433;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
	private final int anInt2431;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
	private final int anInt2437;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!ke;")
	private Class2_Sub1_Sub9 aClass2_Sub1_Sub9_3;

	@OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
	private int anInt2441;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "I")
	private int anInt2435;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIIIZLclient!sh;)V")
	public Class2_Sub1_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub1_Sub3 arg8) {
		this.anInt2432 = arg1;
		this.anInt2444 = arg5;
		this.anInt2434 = arg2;
		this.anInt2433 = arg3;
		this.anInt2431 = arg0;
		this.anInt2437 = arg4;
		if (arg6 != -1) {
			this.aClass2_Sub1_Sub9_3 = Static19.method325(arg6);
			this.anInt2441 = 0;
			this.anInt2435 = Static14.anInt386 - 1;
			if (this.aClass2_Sub1_Sub9_3.anInt1920 == 0 && arg8 != null && arg8 instanceof Class2_Sub1_Sub3_Sub6) {
				@Pc(47) Class2_Sub1_Sub3_Sub6 local47 = (Class2_Sub1_Sub3_Sub6) arg8;
				if (local47.aClass2_Sub1_Sub9_3 == this.aClass2_Sub1_Sub9_3) {
					this.anInt2435 = local47.anInt2435;
					this.anInt2441 = local47.anInt2441;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub1_Sub9_3.anInt1929 != -1) {
				this.anInt2441 = (int) ((double) this.aClass2_Sub1_Sub9_3.anIntArray214.length * Math.random());
				this.anInt2435 -= (int) ((double) this.aClass2_Sub1_Sub9_3.anIntArray217[this.anInt2441] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		if (this.aClass2_Sub1_Sub9_3 != null) {
			@Pc(10) int local10 = Static14.anInt386 - this.anInt2435;
			if (local10 > 100 && this.aClass2_Sub1_Sub9_3.anInt1929 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass2_Sub1_Sub9_3.anIntArray217[this.anInt2441] >= local10) {
							break label46;
						}
						local10 -= this.aClass2_Sub1_Sub9_3.anIntArray217[this.anInt2441];
						this.anInt2441++;
					} while (this.aClass2_Sub1_Sub9_3.anIntArray214.length > this.anInt2441);
					this.anInt2441 -= this.aClass2_Sub1_Sub9_3.anInt1929;
				} while (this.anInt2441 >= 0 && this.aClass2_Sub1_Sub9_3.anIntArray214.length > this.anInt2441);
				this.aClass2_Sub1_Sub9_3 = null;
			}
			this.anInt2435 = Static14.anInt386 - local10;
		}
		@Pc(98) Class2_Sub1_Sub10 local98 = Static62.method1106(this.anInt2431);
		if (local98.anIntArray234 != null) {
			local98 = local98.method1580();
		}
		if (local98 == null) {
			return null;
		}
		@Pc(122) int local122;
		@Pc(125) int local125;
		if (this.anInt2434 == 1 || this.anInt2434 == 3) {
			local125 = local98.anInt2225;
			local122 = local98.anInt2210;
		} else {
			local122 = local98.anInt2225;
			local125 = local98.anInt2210;
		}
		@Pc(140) int local140 = (local122 >> 1) + this.anInt2437;
		@Pc(149) int local149 = (local122 + 1 >> 1) + this.anInt2437;
		@Pc(159) int local159 = this.anInt2444 + (local125 + 1 >> 1);
		@Pc(164) int[][] local164 = Static162.anIntArrayArrayArray8[this.anInt2433];
		@Pc(172) int local172 = this.anInt2444 + (local125 >> 1);
		@Pc(182) int local182 = (this.anInt2437 << 7) + (local122 << 6);
		@Pc(209) int local209 = local164[local149][local159] + local164[local140][local172] + local164[local149][local172] + local164[local140][local159] >> 2;
		@Pc(218) int local218 = (local125 << 6) + (this.anInt2444 << 7);
		return local98.method1586(local218, local209, local182, this.aClass2_Sub1_Sub9_3, this.anInt2434, local164, this.anInt2441, this.anInt2432);
	}
}
