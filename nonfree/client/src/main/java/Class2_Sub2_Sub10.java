import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean75 = arg0.method6138() == 1;
		} else if (arg1 == 1) {
			this.aBoolean74 = arg0.method6138() == 1;
		} else if (arg1 == 2) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int[] local29 = this.method6266(0, this.aBoolean74 ? Static71.anInt1203 - arg0 : arg0);
			if (this.aBoolean75) {
				for (@Pc(34) int local34 = 0; local34 < Static398.anInt6955; local34++) {
					local11[local34] = local29[Static210.anInt3600 - local34];
				}
			} else {
				Static472.method5025(local29, 0, local11, 0, Static398.anInt6955);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(37) int[][] local37 = this.method6276(0, this.aBoolean74 ? Static71.anInt1203 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean75) {
				for (local66 = 0; local66 < Static398.anInt6955; local66++) {
					local53[local66] = local41[Static210.anInt3600 - local66];
					local57[local66] = local45[Static210.anInt3600 - local66];
					local61[local66] = local49[Static210.anInt3600 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static398.anInt6955; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}
}
