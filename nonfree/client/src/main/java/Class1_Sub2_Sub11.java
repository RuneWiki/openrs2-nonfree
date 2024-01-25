import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!is", name = "I", descriptor = "I")
	private int anInt3403 = 0;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "I")
	private int anInt3406 = 16;

	@OriginalMember(owner = "client!is", name = "F", descriptor = "I")
	private int anInt3400 = 2000;

	@OriginalMember(owner = "client!is", name = "P", descriptor = "I")
	private int anInt3408 = 4096;

	@OriginalMember(owner = "client!is", name = "R", descriptor = "I")
	private int anInt3410 = 0;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(20) int local20 = this.anInt3408 >> 1;
			@Pc(25) int[][] local25 = super.aClass22_41.method314();
			@Pc(32) Random local32 = new Random((long) this.anInt3403);
			for (@Pc(34) int local34 = 0; local34 < this.anInt3400; local34++) {
				@Pc(57) int local57 = this.anInt3408 > 0 ? this.anInt3410 + Static133.method1697(this.anInt3408, local32) - local20 : this.anInt3410;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static133.method1697(Static218.anInt3990, local32);
				@Pc(73) int local73 = Static133.method1697(Static54.anInt778, local32);
				@Pc(84) int local84 = (this.anInt3406 * Static117.anIntArray157[local63] >> 12) + local68;
				@Pc(96) int local96 = local73 + (this.anInt3406 * Static157.anIntArray201[local63] >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local84 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(137) boolean local137 = local101 > local106;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local137) {
						local141 = local68;
						local143 = local84;
						local68 = local73;
						local73 = local141;
						local84 = local96;
						local96 = local143;
					}
					if (local84 < local68) {
						local141 = local68;
						local143 = local73;
						local68 = local84;
						local73 = local96;
						local84 = local141;
						local96 = local143;
					}
					local141 = local73;
					local143 = local84 - local68;
					@Pc(181) int local181 = local96 - local73;
					@Pc(186) int local186 = -local143 / 2;
					@Pc(190) int local190 = 2048 / local143;
					@Pc(200) int local200 = 1024 - (Static133.method1697(4096, local32) >> 2);
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(216) int local216 = local96 > local73 ? 1 : -1;
					for (@Pc(218) int local218 = local68; local218 < local84; local218++) {
						@Pc(231) int local231 = local190 * (local218 - local68) + local200 + 1024;
						@Pc(235) int local235 = local218 & Static147.anInt2302;
						@Pc(239) int local239 = Static464.anInt6761 & local141;
						if (local137) {
							local25[local239][local235] = local231;
						} else {
							local25[local235][local239] = local231;
						}
						local186 += local181;
						if (local186 > 0) {
							local141 -= -local216;
							local186 += -local143;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3403 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt3400 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt3406 = arg0.method2915();
		} else if (arg1 == 3) {
			this.anInt3410 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt3408 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		Static1.method20();
	}
}
