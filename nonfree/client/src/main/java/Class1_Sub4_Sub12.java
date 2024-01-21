import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub4_Sub12 extends Class1_Sub4 {

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	private int anInt2396;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
	private int anInt2397;

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
	private int anInt2399;

	@OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
	private int anInt2400;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2400 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt2397 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt2399 = arg0.method544();
		} else if (arg1 == 3) {
			this.anInt2395 = arg0.method546();
		} else if (arg1 == 4) {
			this.anInt2396 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		Static145.method2764();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(21) int local21 = this.anInt2396 >> 1;
			@Pc(26) int[][] local26 = super.aClass39_38.method1884();
			@Pc(33) Random local33 = new Random((long) this.anInt2400);
			for (@Pc(35) int local35 = 0; local35 < this.anInt2397; local35++) {
				@Pc(58) int local58 = this.anInt2396 <= 0 ? this.anInt2395 : this.anInt2395 + Static49.method1046(this.anInt2396, local33) - local21;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static49.method1046(Static73.anInt1888, local33);
				@Pc(74) int local74 = Static49.method1046(Static98.anInt3017, local33);
				@Pc(85) int local85 = local74 + (Static25.anIntArray50[local64] * this.anInt2399 >> 12);
				@Pc(96) int local96 = (Static29.anIntArray62[local64] * this.anInt2399 >> 12) + local69;
				@Pc(100) int local100 = local85 - local74;
				@Pc(105) int local105 = local96 - local69;
				if (local105 != 0 || local100 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local100 < 0) {
						local100 = -local100;
					}
					@Pc(136) boolean local136 = local105 < local100;
					@Pc(142) int local142;
					@Pc(140) int local140;
					if (local136) {
						local140 = local96;
						local142 = local69;
						local69 = local74;
						local74 = local142;
						local96 = local85;
						local85 = local140;
					}
					if (local69 > local96) {
						local142 = local69;
						local69 = local96;
						local96 = local142;
						local140 = local74;
						local74 = local85;
						local85 = local140;
					}
					local140 = local96 - local69;
					local142 = local74;
					@Pc(180) int local180 = local85 - local74;
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(189) int local189 = 2048 / local140;
					@Pc(194) int local194 = -local140 / 2;
					@Pc(204) int local204 = 1024 - (Static49.method1046(4096, local33) >> 2);
					@Pc(211) int local211 = local74 < local85 ? 1 : -1;
					for (@Pc(213) int local213 = local69; local213 < local96; local213++) {
						@Pc(219) int local219 = Static35.anInt672 & local213;
						@Pc(223) int local223 = Static125.anInt3628 & local142;
						@Pc(234) int local234 = local204 + (-local69 + local213) * local189 + 1024;
						if (local136) {
							local26[local223][local219] = local234;
						} else {
							local26[local219][local223] = local234;
						}
						local194 += local180;
						if (local194 > 0) {
							local142 += local211;
							local194 -= local140;
						}
					}
				}
			}
		}
		return local7;
	}
}
