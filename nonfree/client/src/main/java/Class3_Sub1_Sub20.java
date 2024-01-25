import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	static {
		new Class57("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(26) int[] local26 = this.method5547(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static238.anInt4221; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(21) int[][] local21 = this.method5551(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static238.anInt4221; local47++) {
				local37[local47] = 4096 - local25[local47];
				local41[local47] = 4096 - local29[local47];
				local45[local47] = 4096 - local33[local47];
			}
		}
		return local11;
	}
}
