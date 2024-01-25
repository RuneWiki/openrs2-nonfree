import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	private int anInt3365 = 0;

	@OriginalMember(owner = "client!in", name = "K", descriptor = "I")
	private int anInt3364 = 0;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	private int anInt3367 = 16;

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	private int anInt3369 = 2000;

	@OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
	private int anInt3373 = 4096;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt3365 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt3369 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt3367 = arg1.method3737();
		} else if (arg0 == 3) {
			this.anInt3364 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt3373 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		Static10.method210();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(20) int local20 = this.anInt3373 >> 1;
			@Pc(25) int[][] local25 = super.aClass67_41.method1595();
			@Pc(32) Random local32 = new Random((long) this.anInt3365);
			for (@Pc(34) int local34 = 0; local34 < this.anInt3369; local34++) {
				@Pc(57) int local57 = this.anInt3373 <= 0 ? this.anInt3364 : this.anInt3364 + Static159.method2512(this.anInt3373, local32) - local20;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static159.method2512(Static131.anInt2581, local32);
				@Pc(73) int local73 = Static159.method2512(Static266.anInt4930, local32);
				@Pc(84) int local84 = (this.anInt3367 * Static171.anIntArray220[local63] >> 12) + local68;
				@Pc(95) int local95 = local73 + (Static132.anIntArray145[local63] * this.anInt3367 >> 12);
				@Pc(100) int local100 = local95 - local73;
				@Pc(105) int local105 = local84 - local68;
				if (local105 != 0 || local100 != 0) {
					if (local100 < 0) {
						local100 = -local100;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(132) boolean local132 = local105 < local100;
					@Pc(136) int local136;
					@Pc(140) int local140;
					if (local132) {
						local136 = local68;
						local68 = local73;
						local140 = local84;
						local84 = local95;
						local73 = local136;
						local95 = local140;
					}
					if (local84 < local68) {
						local136 = local68;
						local68 = local84;
						local140 = local73;
						local73 = local95;
						local84 = local136;
						local95 = local140;
					}
					local136 = local73;
					local140 = local84 - local68;
					@Pc(173) int local173 = local95 - local73;
					@Pc(178) int local178 = -local140 / 2;
					@Pc(182) int local182 = 2048 / local140;
					@Pc(192) int local192 = 1024 - (Static159.method2512(4096, local32) >> 2);
					@Pc(199) int local199 = local73 < local95 ? 1 : -1;
					if (local173 < 0) {
						local173 = -local173;
					}
					for (@Pc(209) int local209 = local68; local209 < local84; local209++) {
						@Pc(222) int local222 = local192 + local182 * (local209 - local68) + 1024;
						@Pc(226) int local226 = local209 & Static287.anInt5227;
						@Pc(230) int local230 = local136 & Static36.anInt893;
						local178 += local173;
						if (local132) {
							local25[local230][local226] = local222;
						} else {
							local25[local226][local230] = local222;
						}
						if (local178 > 0) {
							local136 += local199;
							local178 += -local140;
						}
					}
				}
			}
		}
		return local11;
	}
}
