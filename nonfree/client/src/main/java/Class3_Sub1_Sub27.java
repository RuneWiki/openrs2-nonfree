import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub1_Sub27 extends Class3_Sub1 {

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	private int anInt4083 = 2000;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "I")
	private int anInt4082 = 16;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
	private int anInt4086 = 4096;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	private int anInt4085 = 0;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	private int anInt4087 = 0;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		Static204.method4476();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(25) int local25 = this.anInt4086 >> 1;
			@Pc(30) int[][] local30 = super.aClass4_41.method60();
			@Pc(37) Random local37 = new Random((long) this.anInt4087);
			for (@Pc(39) int local39 = 0; local39 < this.anInt4083; local39++) {
				@Pc(64) int local64 = this.anInt4086 <= 0 ? this.anInt4085 : this.anInt4085 + Static213.method3319(local37, this.anInt4086) - local25;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static213.method3319(local37, Static238.anInt4221);
				@Pc(80) int local80 = Static213.method3319(local37, Static220.anInt3914);
				@Pc(91) int local91 = (this.anInt4082 * Static81.anIntArray164[local70] >> 12) + local75;
				@Pc(102) int local102 = (this.anInt4082 * Static167.anIntArray309[local70] >> 12) + local80;
				@Pc(107) int local107 = local102 - local80;
				@Pc(111) int local111 = local91 - local75;
				if (local111 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(141) boolean local141 = local111 < local107;
					@Pc(145) int local145;
					@Pc(147) int local147;
					if (local141) {
						local145 = local75;
						local147 = local91;
						local75 = local80;
						local80 = local145;
						local91 = local102;
						local102 = local147;
					}
					if (local91 < local75) {
						local145 = local75;
						local75 = local91;
						local147 = local80;
						local80 = local102;
						local91 = local145;
						local102 = local147;
					}
					local145 = local80;
					local147 = local91 - local75;
					@Pc(186) int local186 = local102 - local80;
					@Pc(191) int local191 = -local147 / 2;
					@Pc(195) int local195 = 2048 / local147;
					@Pc(204) int local204 = 1024 - (Static213.method3319(local37, 4096) >> 2);
					@Pc(211) int local211 = local102 <= local80 ? -1 : 1;
					if (local186 < 0) {
						local186 = -local186;
					}
					for (@Pc(218) int local218 = local75; local218 < local91; local218++) {
						@Pc(231) int local231 = local195 * (local218 - local75) + local204 + 1024;
						@Pc(235) int local235 = local218 & Static171.anInt3000;
						@Pc(239) int local239 = local145 & Static300.anInt5187;
						if (local141) {
							local30[local239][local235] = local231;
						} else {
							local30[local235][local239] = local231;
						}
						local191 += local186;
						if (local191 > 0) {
							local191 += -local147;
							local145 -= -local211;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4087 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt4083 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt4082 = arg0.method2739();
		} else if (arg1 == 3) {
			this.anInt4085 = arg0.method2767();
		} else if (arg1 == 4) {
			this.anInt4086 = arg0.method2767();
		}
	}
}
