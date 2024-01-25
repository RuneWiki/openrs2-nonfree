import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class4_Sub4_Sub37 extends Class4_Sub4 {

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "Z")
	private boolean aBoolean529 = true;

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "Z")
	private boolean aBoolean530 = true;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(34) int[] local34 = this.method6040(this.aBoolean529 ? Static204.anInt3610 - arg0 : arg0, 0);
			if (this.aBoolean530) {
				for (@Pc(47) int local47 = 0; local47 < Static419.anInt6404; local47++) {
					local11[local47] = local34[Static211.anInt3669 - local47];
				}
			} else {
				Static461.method1982(local34, 0, local11, 0, Static419.anInt6404);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(31) int[][] local31 = this.method6049(this.aBoolean529 ? Static204.anInt3610 - arg0 : arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			@Pc(60) int local60;
			if (this.aBoolean530) {
				for (local60 = 0; local60 < Static419.anInt6404; local60++) {
					local47[local60] = local35[Static211.anInt3669 - local60];
					local51[local60] = local39[Static211.anInt3669 - local60];
					local55[local60] = local43[Static211.anInt3669 - local60];
				}
			} else {
				for (local60 = 0; local60 < Static419.anInt6404; local60++) {
					local47[local60] = local35[local60];
					local51[local60] = local39[local60];
					local55[local60] = local43[local60];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean530 = arg1.method5007() == 1;
		} else if (arg0 == 1) {
			this.aBoolean529 = arg1.method5007() == 1;
		} else if (arg0 == 2) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}
}
