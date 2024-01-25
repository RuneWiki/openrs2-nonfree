import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ap", name = "I", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!ap", name = "L", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(29) int[][] local29 = this.method5968(0, this.aBoolean24 ? Static464.anInt6761 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean25) {
				for (local58 = 0; local58 < Static218.anInt3990; local58++) {
					local45[local58] = local33[Static147.anInt2302 - local58];
					local49[local58] = local37[Static147.anInt2302 - local58];
					local53[local58] = local41[Static147.anInt2302 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static218.anInt3990; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean25 = arg0.method2915() == 1;
		} else if (arg1 == 1) {
			this.aBoolean24 = arg0.method2915() == 1;
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(35) int[] local35 = this.method5964(this.aBoolean24 ? Static464.anInt6761 - arg0 : arg0, 0);
			if (this.aBoolean25) {
				for (@Pc(48) int local48 = 0; local48 < Static218.anInt3990; local48++) {
					local17[local48] = local35[Static147.anInt2302 - local48];
				}
			} else {
				Static471.method3066(local35, 0, local17, 0, Static218.anInt3990);
			}
		}
		return local17;
	}
}
