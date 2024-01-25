import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	private int anInt827 = 32768;

	static {
		new Class93("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(21) int[] local21 = this.method5876(1, arg0);
			@Pc(27) int[] local27 = this.method5876(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static339.anInt6735; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt827 >> 12;
				@Pc(70) int local70 = Static296.anIntArray435[local53] * local62 >> 12;
				@Pc(78) int local78 = Static160.anIntArray273[local53] * local62 >> 12;
				@Pc(87) int local87 = Static25.anInt1346 & local41 + (local70 >> 12);
				@Pc(95) int local95 = Static285.anInt5782 & (local78 >> 12) + arg0;
				@Pc(101) int[][] local101 = this.method5887(local95, 0);
				local31[local41] = local101[0][local87];
				local35[local41] = local101[1][local87];
				local39[local41] = local101[2][local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(25) int[] local25 = this.method5876(1, arg0);
			@Pc(31) int[] local31 = this.method5876(2, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static339.anInt6735; local33++) {
				@Pc(43) int local43 = local25[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = this.anInt827 * local31[local33] >> 12;
				@Pc(60) int local60 = Static296.anIntArray435[local43] * local52 >> 12;
				@Pc(68) int local68 = local52 * Static160.anIntArray273[local43] >> 12;
				@Pc(77) int local77 = local33 + (local60 >> 12) & Static25.anInt1346;
				@Pc(85) int local85 = (local68 >> 12) + arg0 & Static285.anInt5782;
				@Pc(91) int[] local91 = this.method5876(0, local85);
				local11[local33] = local91[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		Static71.method1639();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt827 = arg1.method4464() << 4;
		} else if (arg0 == 1) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}
}
