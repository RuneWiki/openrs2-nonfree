import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	static {
		new Class231("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(26) int[][] local26 = this.method6276(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static398.anInt6955; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int[] local26 = this.method6266(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static398.anInt6955; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}
}
