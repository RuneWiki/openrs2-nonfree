import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	private int anInt3571;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!sf", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "I")
	private int anInt3579;

	@OriginalMember(owner = "client!sf", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
	private int anInt3581 = 1024;

	@OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
	private int anInt3578 = 1024;

	@OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
	private int anInt3574 = 409;

	@OriginalMember(owner = "client!sf", name = "wb", descriptor = "I")
	private int anInt3583 = 0;

	@OriginalMember(owner = "client!sf", name = "xb", descriptor = "I")
	private int anInt3584 = 4;

	@OriginalMember(owner = "client!sf", name = "ob", descriptor = "I")
	private int anInt3577 = 8;

	@OriginalMember(owner = "client!sf", name = "Ab", descriptor = "I")
	private int anInt3586 = 81;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	private int anInt3572 = 204;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	private void method2725() {
		@Pc(12) Random local12 = new Random((long) this.anInt3577);
		this.anIntArrayArray30 = new int[this.anInt3577][this.anInt3584 + 1];
		this.anInt3573 = this.anInt3586 / 2;
		this.anIntArrayArray31 = new int[this.anInt3577][this.anInt3584];
		this.anInt3571 = 4096 / this.anInt3584;
		this.anInt3579 = 4096 / this.anInt3577;
		this.anIntArray296 = new int[this.anInt3577 + 1];
		@Pc(58) int local58 = this.anInt3571 / 2;
		this.anIntArray296[0] = 0;
		@Pc(73) int local73 = this.anInt3579 / 2;
		for (@Pc(75) int local75 = 0; local75 < this.anInt3577; local75++) {
			@Pc(82) int local82;
			@Pc(96) int local96;
			if (local75 > 0) {
				local82 = this.anInt3579;
				local96 = (Static13.method273(local12, 4096) - 2048) * this.anInt3572 >> 12;
				@Pc(104) int local104 = local82 + (local96 * local73 >> 12);
				this.anIntArray296[local75] = this.anIntArray296[local75 - 1] + local104;
			}
			this.anIntArrayArray30[local75][0] = 0;
			for (local82 = 0; local82 < this.anInt3584; local82++) {
				if (local82 > 0) {
					local96 = this.anInt3571;
					@Pc(145) int local145 = (Static13.method273(local12, 4096) - 2048) * this.anInt3574 >> 12;
					local96 += local145 * local58 >> 12;
					this.anIntArrayArray30[local75][local82] = this.anIntArrayArray30[local75][local82 - 1] + local96;
				}
				this.anIntArrayArray31[local75][local82] = this.anInt3581 <= 0 ? 4096 : 4096 - Static13.method273(local12, this.anInt3581);
			}
			this.anIntArrayArray30[local75][this.anInt3584] = 4096;
		}
		this.anIntArray296[this.anInt3577] = 4096;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3584 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt3577 = arg0.method1278();
		} else if (arg1 == 2) {
			this.anInt3574 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt3572 = arg0.method1270();
		} else if (arg1 == 4) {
			this.anInt3578 = arg0.method1270();
		} else if (arg1 == 5) {
			this.anInt3583 = arg0.method1270();
		} else if (arg1 == 6) {
			this.anInt3586 = arg0.method1270();
		} else if (arg1 == 7) {
			this.anInt3581 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.method2725();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = this.anInt3583 + Static34.anIntArray37[arg0]; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt3577 && this.anIntArray296[local25] <= local32) {
				local25++;
			}
			@Pc(71) boolean local71 = (local25 & 0x1) == 0;
			@Pc(75) int local75 = local25 - 1;
			@Pc(82) int local82 = this.anIntArray296[local25 - 1];
			@Pc(87) int local87 = this.anIntArray296[local25];
			if (this.anInt3573 + local82 < local32 && local32 < local87 - this.anInt3573) {
				for (@Pc(117) int local117 = 0; local117 < Static190.anInt3865; local117++) {
					@Pc(128) int local128 = local71 ? this.anInt3578 : -this.anInt3578;
					@Pc(130) int local130 = 0;
					@Pc(142) int local142;
					for (local142 = Static133.anIntArray187[local117] + (local128 * this.anInt3571 >> 12); local142 < 0; local142 += 4096) {
					}
					while (local142 > 4096) {
						local142 -= 4096;
					}
					while (local130 < this.anInt3584 && local142 >= this.anIntArrayArray30[local75][local130]) {
						local130++;
					}
					@Pc(182) int local182 = local130 - 1;
					@Pc(189) int local189 = this.anIntArrayArray30[local75][local182];
					@Pc(196) int local196 = this.anIntArrayArray30[local75][local130];
					if (local189 + this.anInt3573 < local142 && local142 < local196 - this.anInt3573) {
						local19[local117] = this.anIntArrayArray31[local75][local182];
					} else {
						local19[local117] = 0;
					}
				}
			} else {
				Static218.method2015(local19, 0, Static190.anInt3865, 0);
			}
		}
		return local19;
	}
}
