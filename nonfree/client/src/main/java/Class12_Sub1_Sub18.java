import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class12_Sub1_Sub18 extends Class12_Sub1 {

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "Z")
	private boolean aBoolean419 = true;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean418 = arg0.method5216() == 1;
		} else if (arg1 == 1) {
			this.aBoolean419 = arg0.method5216() == 1;
		} else if (arg1 == 2) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(30) int[] local30 = this.method7795(0, this.aBoolean419 ? Static162.anInt3758 - arg0 : arg0);
			if (this.aBoolean418) {
				for (@Pc(35) int local35 = 0; local35 < Static357.anInt6670; local35++) {
					local11[local35] = local30[Static149.anInt3278 - local35];
				}
			} else {
				Static554.method3496(local30, 0, local11, 0, Static357.anInt6670);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(37) int[][] local37 = this.method7790(0, this.aBoolean419 ? Static162.anInt3758 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			@Pc(66) int local66;
			if (this.aBoolean418) {
				for (local66 = 0; local66 < Static357.anInt6670; local66++) {
					local53[local66] = local41[Static149.anInt3278 - local66];
					local57[local66] = local45[Static149.anInt3278 - local66];
					local61[local66] = local49[Static149.anInt3278 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static357.anInt6670; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local11;
	}
}
