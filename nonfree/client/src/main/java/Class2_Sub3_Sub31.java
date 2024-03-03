import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_123 = new Class79("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_124 = new Class79("K", "T", "K", "K");

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	public static int anInt5832 = -1;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	private int anInt5826 = 32768;

	static {
		new Class79(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 77)
	public Class2_Sub3_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!bt;I)V", line = 30)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5826 = arg1.method4830() << 4;
		} else if (arg0 == 1) {
			super.aBoolean487 = arg1.method4816() == 1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[[I", line = 81)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(26) int[] local26 = this.method6474(1, arg0);
			@Pc(32) int[] local32 = this.method6474(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static211.anInt4031; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt5826 >> 12;
				@Pc(75) int local75 = local67 * Static169.anIntArray203[local58] >> 12;
				@Pc(83) int local83 = local67 * Static141.anIntArray173[local58] >> 12;
				@Pc(92) int local92 = Static69.anInt1719 & local46 + (local75 >> 12);
				@Pc(100) int local100 = Static139.anInt2715 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method6484(0, local100);
				local36[local46] = local106[0][local92];
				local40[local46] = local106[1][local92];
				local44[local46] = local106[2][local92];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[I", line = 139)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int[] local26 = this.method6474(1, arg0);
			@Pc(32) int[] local32 = this.method6474(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static211.anInt4031; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt5826 >> 12;
				@Pc(61) int local61 = Static169.anIntArray203[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static141.anIntArray173[local44] >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static69.anInt1719;
				@Pc(86) int local86 = Static139.anInt2715 & arg0 + (local69 >> 12);
				@Pc(92) int[] local92 = this.method6474(0, local86);
				local16[local34] = local92[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 209)
	@Override
	public void method6481() {
		Static28.method937();
	}
}
