import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class4_Sub2_Sub33 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
	private int anInt7003 = 32768;

	static {
		new Class242("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub33() {
		super(3, false);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(26) int[] local26 = this.method5847(1, arg0);
			@Pc(32) int[] local32 = this.method5847(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static350.anInt6330; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt7003 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static100.anIntArray135[local58] >> 12;
				@Pc(83) int local83 = local67 * Static249.anIntArray375[local58] >> 12;
				@Pc(91) int local91 = Static144.anInt2707 & local46 + (local75 >> 12);
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static323.anInt5763;
				@Pc(105) int[][] local105 = this.method5848(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		Static47.method995();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt7003 = arg1.method4877() << 4;
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(23) int[] local23 = this.method5847(1, arg0);
			@Pc(31) int[] local31 = this.method5847(2, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static350.anInt6330; local33++) {
				@Pc(43) int local43 = local23[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = local31[local33] * this.anInt7003 >> 12;
				@Pc(60) int local60 = Static100.anIntArray135[local43] * local52 >> 12;
				@Pc(68) int local68 = Static249.anIntArray375[local43] * local52 >> 12;
				@Pc(76) int local76 = local33 + (local60 >> 12) & Static144.anInt2707;
				@Pc(84) int local84 = (local68 >> 12) + arg0 & Static323.anInt5763;
				@Pc(90) int[] local90 = this.method5847(0, local84);
				local11[local33] = local90[local76];
			}
		}
		return local11;
	}
}
