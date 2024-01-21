import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!x")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!x", name = "fb", descriptor = "Lclient!xb;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!x", name = "eb", descriptor = "I")
	private int anInt683 = 8;

	@OriginalMember(owner = "client!x", name = "a", descriptor = "(I)Lclient!db;")
	@Override
	public Class1_Sub3_Sub1 method479() {
		if (this.aClass38_1 == null) {
			return null;
		} else if (super.anInt731 == -1 || super.anInt732 == -1) {
			return this.method453();
		} else {
			@Pc(20) Class1_Sub3_Sub1 local20 = this.method453();
			@Pc(25) Class13 local25 = Class13.aClass13Array1[super.anInt731];
			@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(true, !local25.aBoolean83, local25.method245(), 440, true, false);
			local41.method165(this.anInt683, 0, 0, -super.anInt735);
			local41.method159();
			local41.method160(local25.aClass11_1.anIntArray124[super.anInt732]);
			local41.anIntArrayArray8 = null;
			local41.anIntArrayArray7 = null;
			local41.method169(64, 850, -30, -50, -30, true);
			@Pc(93) Class1_Sub3_Sub1[] local93 = new Class1_Sub3_Sub1[] { local20, local41 };
			return new Class1_Sub3_Sub1(true, local93, 20525, 2);
		}
	}

	@OriginalMember(owner = "client!x", name = "b", descriptor = "(I)Lclient!db;")
	private Class1_Sub3_Sub1 method453() {
		@Pc(21) int local21;
		if (super.anInt726 >= 0 && super.anInt729 == 0) {
			local21 = Class11.aClass11Array1[super.anInt726].anIntArray124[super.anInt727];
			@Pc(23) int local23 = -1;
			if (super.anInt723 >= 0 && super.anInt723 != super.anInt710) {
				local23 = Class11.aClass11Array1[super.anInt723].anIntArray124[super.anInt724];
			}
			return this.aClass38_1.method459(local21, local23, Class11.aClass11Array1[super.anInt726].anIntArray127);
		}
		local21 = -1;
		if (super.anInt723 >= 0) {
			local21 = Class11.aClass11Array1[super.anInt723].anIntArray124[super.anInt724];
		}
		@Pc(72) Class1_Sub3_Sub1 local72 = this.aClass38_1.method459(local21, -1, null);
		super.anInt743 = local72.anInt220;
		return local72;
	}

	@OriginalMember(owner = "client!x", name = "c", descriptor = "(I)Z")
	public boolean method454() {
		return this.aClass38_1 != null;
	}
}
