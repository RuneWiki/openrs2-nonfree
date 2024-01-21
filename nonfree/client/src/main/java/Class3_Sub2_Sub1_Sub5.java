import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub2_Sub1_Sub5 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	private final int anInt2720;

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
	private final int anInt2729;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	private final int anInt2714;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
	private final int anInt2723;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
	private final int anInt2728;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	private final int anInt2724;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!dg;")
	private Class3_Sub2_Sub2 aClass3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
	private int anInt2721;

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	private int anInt2725;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIZLclient!ac;)V")
	public Class3_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class3_Sub2_Sub1 arg8) {
		this.anInt2720 = arg5;
		this.anInt2729 = arg3;
		this.anInt2714 = arg0;
		this.anInt2723 = arg4;
		this.anInt2728 = arg2;
		this.anInt2724 = arg1;
		if (arg6 != -1) {
			this.aClass3_Sub2_Sub2_3 = Static35.method628(arg6);
			this.anInt2721 = Static20.anInt512 - 1;
			this.anInt2725 = 0;
			if (this.aClass3_Sub2_Sub2_3.anInt941 == 0 && arg8 != null && arg8 instanceof Class3_Sub2_Sub1_Sub5) {
				@Pc(47) Class3_Sub2_Sub1_Sub5 local47 = (Class3_Sub2_Sub1_Sub5) arg8;
				if (this.aClass3_Sub2_Sub2_3 == local47.aClass3_Sub2_Sub2_3) {
					this.anInt2721 = local47.anInt2721;
					this.anInt2725 = local47.anInt2725;
					return;
				}
			}
			if (arg7 && this.aClass3_Sub2_Sub2_3.anInt945 != -1) {
				this.anInt2725 = (int) ((double) this.aClass3_Sub2_Sub2_3.anIntArray74.length * Math.random());
				this.anInt2721 -= (int) ((double) this.aClass3_Sub2_Sub2_3.anIntArray73[this.anInt2725] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Lclient!fd;")
	@Override
	protected Class3_Sub2_Sub1_Sub2 method2683() {
		if (this.aClass3_Sub2_Sub2_3 != null) {
			@Pc(13) int local13 = Static20.anInt512 - this.anInt2721;
			if (local13 > 100 && this.aClass3_Sub2_Sub2_3.anInt945 > 0) {
				local13 = 100;
			}
			label46: {
				do {
					do {
						if (local13 <= this.aClass3_Sub2_Sub2_3.anIntArray73[this.anInt2725]) {
							break label46;
						}
						local13 -= this.aClass3_Sub2_Sub2_3.anIntArray73[this.anInt2725];
						this.anInt2725++;
					} while (this.anInt2725 < this.aClass3_Sub2_Sub2_3.anIntArray74.length);
					this.anInt2725 -= this.aClass3_Sub2_Sub2_3.anInt945;
				} while (this.anInt2725 >= 0 && this.aClass3_Sub2_Sub2_3.anIntArray74.length > this.anInt2725);
				this.aClass3_Sub2_Sub2_3 = null;
			}
			this.anInt2721 = Static20.anInt512 - local13;
		}
		@Pc(104) Class3_Sub2_Sub9 local104 = Static136.method2319(this.anInt2714);
		if (local104.anIntArray171 != null) {
			local104 = local104.method1199();
		}
		if (local104 == null) {
			return null;
		}
		@Pc(132) int local132;
		@Pc(135) int local135;
		if (this.anInt2728 == 1 || this.anInt2728 == 3) {
			local135 = local104.anInt1795;
			local132 = local104.anInt1825;
		} else {
			local132 = local104.anInt1795;
			local135 = local104.anInt1825;
		}
		@Pc(151) int local151 = this.anInt2723 + (local132 >> 1);
		@Pc(160) int local160 = (local132 + 1 >> 1) + this.anInt2723;
		@Pc(167) int local167 = (local135 >> 1) + this.anInt2720;
		@Pc(177) int local177 = this.anInt2720 + (local135 + 1 >> 1);
		@Pc(182) int[][] local182 = Static133.anIntArrayArrayArray8[this.anInt2729];
		@Pc(209) int local209 = local182[local151][local177] + local182[local151][local167] + local182[local160][local167] + local182[local160][local177] >> 2;
		@Pc(218) int local218 = (local135 << 6) + (this.anInt2720 << 7);
		@Pc(227) int local227 = (local132 << 6) + (this.anInt2723 << 7);
		return local104.method1207(this.anInt2725, local209, local227, this.aClass3_Sub2_Sub2_3, local182, local218, this.anInt2724, this.anInt2728);
	}
}
