import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub4_Sub26 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt3529 = 4;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
	private int anInt3532 = 4;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(26) int local26 = Static182.anInt3492 / this.anInt3529;
			@Pc(31) int local31 = Static117.anInt2472 / this.anInt3532;
			@Pc(39) int[] local39;
			@Pc(45) int local45;
			if (local31 <= 0) {
				local39 = this.method4750(0, 0);
			} else {
				local45 = arg0 % local31;
				local39 = this.method4750(Static117.anInt2472 * local45 / local31, 0);
			}
			for (local45 = 0; local45 < Static182.anInt3492; local45++) {
				if (local26 <= 0) {
					local11[local45] = local39[0];
				} else {
					@Pc(74) int local74 = local45 % local26;
					local11[local45] = local39[local74 * Static182.anInt3492 / local26];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3529 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt3532 = arg0.method1378();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(23) int local23 = Static182.anInt3492 / this.anInt3529;
			@Pc(28) int local28 = Static117.anInt2472 / this.anInt3532;
			@Pc(44) int[][] local44;
			if (local28 > 0) {
				@Pc(34) int local34 = arg0 % local28;
				local44 = this.method4749(0, Static117.anInt2472 * local34 / local28);
			} else {
				local44 = this.method4749(0, 0);
			}
			@Pc(56) int[] local56 = local44[1];
			@Pc(60) int[] local60 = local44[0];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local7[1];
			@Pc(72) int[] local72 = local7[0];
			@Pc(76) int[] local76 = local7[2];
			for (@Pc(78) int local78 = 0; local78 < Static182.anInt3492; local78++) {
				@Pc(90) int local90;
				if (local23 <= 0) {
					local90 = 0;
				} else {
					@Pc(96) int local96 = local78 % local23;
					local90 = Static182.anInt3492 * local96 / local23;
				}
				local72[local78] = local60[local90];
				local68[local78] = local56[local90];
				local76[local78] = local64[local90];
			}
		}
		return local7;
	}
}
