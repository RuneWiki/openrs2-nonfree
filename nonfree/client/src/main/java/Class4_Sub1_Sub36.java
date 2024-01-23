import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class4_Sub1_Sub36 extends Class4_Sub1 {

	@OriginalMember(owner = "client!t", name = "K", descriptor = "[Lclient!be;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			this.method3965(this.aClass43_41.method1182());
		}
		return local9;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B[[I)V")
	private void method3965(@OriginalArg(1) int[][] arg0) {
		@Pc(13) int local13 = Static68.anInt1753;
		@Pc(15) int local15 = Static33.anInt660;
		Static150.method2374(arg0);
		Static8.method123(Static295.anInt5711, Static19.anInt437);
		if (this.aClass5Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass5Array1.length; local30++) {
			@Pc(44) Class5 local44 = this.aClass5Array1[local30];
			@Pc(47) int local47 = local44.anInt2885;
			@Pc(50) int local50 = local44.anInt2895;
			if (local50 < 0) {
				if (local47 >= 0) {
					local44.method2331(local13, local15);
				}
			} else if (local47 >= 0) {
				local44.method2334(local15, local13);
			} else {
				local44.method2328(local15, local13);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(17) int local17 = Static68.anInt1753;
			@Pc(19) int local19 = Static33.anInt660;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = this.aClass113_41.method2909();
			this.method3965(local23);
			for (@Pc(34) int local34 = 0; local34 < Static33.anInt660; local34++) {
				@Pc(41) int[] local41 = local23[local34];
				@Pc(45) int[][] local45 = local28[local34];
				@Pc(49) int[] local49 = local45[1];
				@Pc(53) int[] local53 = local45[0];
				@Pc(57) int[] local57 = local45[2];
				for (@Pc(59) int local59 = 0; local59 < Static68.anInt1753; local59++) {
					@Pc(66) int local66 = local41[local59];
					local57[local59] = (local66 & 0xFF) << 4;
					local49[local59] = local66 >> 4 & 0xFF0;
					local53[local59] = local66 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aClass5Array1 = new Class5[arg1.method3110()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass5Array1.length; local33++) {
				@Pc(46) int local46 = arg1.method3110();
				if (local46 == 0) {
					this.aClass5Array1[local33] = Static29.method615(arg1);
				} else if (local46 == 1) {
					this.aClass5Array1[local33] = Static303.method4650(arg1);
				} else if (local46 == 2) {
					this.aClass5Array1[local33] = Static132.method2151(arg1);
				} else if (local46 == 3) {
					this.aClass5Array1[local33] = Static210.method3317(arg1);
				}
			}
		} else if (arg0 == 1) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}
}
