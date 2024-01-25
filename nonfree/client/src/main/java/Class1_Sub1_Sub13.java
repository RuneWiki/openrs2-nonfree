import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	static {
		new Class106("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(21) int[][] local21 = this.method6006(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static85.anInt1910; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method6013(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static85.anInt1910; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}
}
