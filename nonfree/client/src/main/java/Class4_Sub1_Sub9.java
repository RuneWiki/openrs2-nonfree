import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fj", name = "T", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!fj", name = "bb", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(34) int[] local34 = this.method4736(this.aBoolean113 ? Static262.anInt5002 - arg0 : arg0, 0);
			if (this.aBoolean114) {
				for (@Pc(47) int local47 = 0; local47 < Static73.anInt1626; local47++) {
					local15[local47] = local34[Static48.anInt901 - local47];
				}
			} else {
				Static316.method74(local34, 0, local15, 0, Static73.anInt1626);
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean114 = arg0.method4666() == 1;
		} else if (arg1 == 1) {
			this.aBoolean113 = arg0.method4666() == 1;
		} else if (arg1 == 2) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(36) int[][] local36 = this.method4723(0, this.aBoolean113 ? Static262.anInt5002 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local18[0];
			@Pc(52) int[] local52 = local36[2];
			@Pc(56) int[] local56 = local18[1];
			@Pc(60) int[] local60 = local18[2];
			@Pc(65) int local65;
			if (this.aBoolean114) {
				for (local65 = 0; local65 < Static73.anInt1626; local65++) {
					local48[local65] = local40[Static48.anInt901 - local65];
					local56[local65] = local44[Static48.anInt901 - local65];
					local60[local65] = local52[Static48.anInt901 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static73.anInt1626; local65++) {
					local48[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local52[local65];
				}
			}
		}
		return local18;
	}
}
