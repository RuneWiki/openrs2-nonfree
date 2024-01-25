import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
	private int anInt3566 = 2000;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	private int anInt3567 = 4096;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	private int anInt3564 = 16;

	@OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
	private int anInt3572 = 0;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
	private int anInt3570 = 0;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		Static180.method2885();
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(29) int local29 = this.anInt3567 >> 1;
			@Pc(34) int[][] local34 = super.aClass82_41.method2032();
			@Pc(41) Random local41 = new Random((long) this.anInt3570);
			for (@Pc(43) int local43 = 0; local43 < this.anInt3566; local43++) {
				@Pc(67) int local67 = this.anInt3567 > 0 ? this.anInt3572 + Static149.method2451(this.anInt3567, local41) - local29 : this.anInt3572;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(78) int local78 = Static149.method2451(Static429.anInt6518, local41);
				@Pc(83) int local83 = Static149.method2451(Static51.anInt1129, local41);
				@Pc(94) int local94 = (this.anInt3564 * Static90.anIntArray171[local73] >> 12) + local78;
				@Pc(106) int local106 = local83 + (this.anInt3564 * Static381.anIntArray532[local73] >> 12);
				@Pc(110) int local110 = local106 - local83;
				@Pc(115) int local115 = local94 - local78;
				if (local115 != 0 || local110 != 0) {
					if (local115 < 0) {
						local115 = -local115;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(146) boolean local146 = local110 > local115;
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local146) {
						local150 = local78;
						local78 = local83;
						local154 = local94;
						local83 = local150;
						local94 = local106;
						local106 = local154;
					}
					if (local94 < local78) {
						local150 = local78;
						local78 = local94;
						local154 = local83;
						local83 = local106;
						local94 = local150;
						local106 = local154;
					}
					local150 = local83;
					local154 = local94 - local78;
					@Pc(186) int local186 = local106 - local83;
					@Pc(191) int local191 = -local154 / 2;
					@Pc(195) int local195 = 2048 / local154;
					@Pc(205) int local205 = 1024 - (Static149.method2451(4096, local41) >> 2);
					@Pc(212) int local212 = local83 < local106 ? 1 : -1;
					if (local186 < 0) {
						local186 = -local186;
					}
					for (@Pc(219) int local219 = local78; local219 < local94; local219++) {
						@Pc(232) int local232 = local205 + local195 * (local219 + -local78) + 1024;
						@Pc(236) int local236 = local219 & Static303.anInt5406;
						@Pc(240) int local240 = local150 & Static246.anInt4669;
						local191 += local186;
						if (local146) {
							local34[local240][local236] = local232;
						} else {
							local34[local236][local240] = local232;
						}
						if (local191 > 0) {
							local191 += -local154;
							local150 += local212;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3570 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt3566 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt3564 = arg0.method5495();
		} else if (arg1 == 3) {
			this.anInt3572 = arg0.method5500();
		} else if (arg1 == 4) {
			this.anInt3567 = arg0.method5500();
		}
	}
}
