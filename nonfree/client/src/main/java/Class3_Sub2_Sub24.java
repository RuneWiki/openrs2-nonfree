import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "Z")
	private boolean aBoolean476 = true;

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "Z")
	private boolean aBoolean477 = true;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(37) int[][] local37 = this.method8672(0, this.aBoolean476 ? Static575.anInt9412 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean477) {
				for (local66 = 0; local66 < Static201.anInt3738; local66++) {
					local53[local66] = local41[Static201.anInt3740 - local66];
					local57[local66] = local45[Static201.anInt3740 - local66];
					local61[local66] = local49[Static201.anInt3740 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static201.anInt3738; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean477 = arg0.method5633() == 1;
		} else if (arg1 == 1) {
			this.aBoolean476 = arg0.method5633() == 1;
		} else if (arg1 == 2) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(33) int[] local33 = this.method8669(this.aBoolean476 ? Static575.anInt9412 - arg0 : arg0, 0);
			if (this.aBoolean477) {
				for (@Pc(46) int local46 = 0; local46 < Static201.anInt3738; local46++) {
					local16[local46] = local33[Static201.anInt3740 - local46];
				}
			} else {
				Static651.method750(local33, 0, local16, 0, Static201.anInt3738);
			}
		}
		return local16;
	}
}
