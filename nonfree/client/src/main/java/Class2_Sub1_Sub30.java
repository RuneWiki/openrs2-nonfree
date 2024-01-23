import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
	private int anInt4079 = 16;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	private int anInt4078 = 0;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
	private int anInt4083 = 4096;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt4076 = 2000;

	@OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
	private int anInt4087 = 0;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4078 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt4076 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt4079 = arg0.method2146();
		} else if (arg1 == 3) {
			this.anInt4087 = arg0.method2130();
		} else if (arg1 == 4) {
			this.anInt4083 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(23) int local23 = this.anInt4083 >> 1;
			@Pc(28) int[][] local28 = this.aClass174_41.method4335();
			@Pc(35) Random local35 = new Random((long) this.anInt4078);
			for (@Pc(37) int local37 = 0; local37 < this.anInt4076; local37++) {
				@Pc(64) int local64 = this.anInt4083 <= 0 ? this.anInt4087 : this.anInt4087 + Static222.method3672(local35, this.anInt4083) - local23;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static222.method3672(local35, Static281.anInt5558);
				@Pc(80) int local80 = Static222.method3672(local35, Static64.anInt1560);
				@Pc(91) int local91 = local80 + (Static80.anIntArray164[local70] * this.anInt4079 >> 12);
				@Pc(96) int local96 = local91 - local80;
				@Pc(107) int local107 = local75 + (Static290.anIntArray541[local70] * this.anInt4079 >> 12);
				@Pc(111) int local111 = local107 - local75;
				if (local111 != 0 || local96 != 0) {
					if (local96 < 0) {
						local96 = -local96;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(145) boolean local145 = local111 < local96;
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local145) {
						local150 = local75;
						local75 = local80;
						local154 = local107;
						local107 = local91;
						local80 = local150;
						local91 = local154;
					}
					if (local107 < local75) {
						local150 = local75;
						local154 = local80;
						local75 = local107;
						local107 = local150;
						local80 = local91;
						local91 = local154;
					}
					local150 = local80;
					@Pc(182) int local182 = local91 - local80;
					local154 = local107 - local75;
					if (local182 < 0) {
						local182 = -local182;
					}
					@Pc(203) int local203 = 1024 - (Static222.method3672(local35, 4096) >> 2);
					@Pc(207) int local207 = 2048 / local154;
					@Pc(212) int local212 = -local154 / 2;
					@Pc(219) int local219 = local91 <= local80 ? -1 : 1;
					for (@Pc(221) int local221 = local75; local221 < local107; local221++) {
						@Pc(236) int local236 = local203 + (local221 - local75) * local207 + 1024;
						local212 += local182;
						@Pc(244) int local244 = local221 & Static226.anInt6054;
						@Pc(248) int local248 = local150 & Static107.anInt2459;
						if (local145) {
							local28[local248][local244] = local236;
						} else {
							local28[local244][local248] = local236;
						}
						if (local212 > 0) {
							local150 += local219;
							local212 += -local154;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		Static66.method1205();
	}
}
