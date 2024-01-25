import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class2_Sub3_Sub24 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
	private int anInt5020 = 32768;

	static {
		new Class140("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub24() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static224.method5493();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(23) int[] local23 = this.method5700(1, arg0);
			@Pc(29) int[] local29 = this.method5700(2, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static263.anInt5504; local31++) {
				@Pc(41) int local41 = local23[local31] >> 4 & 0xFF;
				@Pc(50) int local50 = local29[local31] * this.anInt5020 >> 12;
				@Pc(58) int local58 = local50 * Static45.anIntArray70[local41] >> 12;
				@Pc(66) int local66 = local50 * Static331.anIntArray498[local41] >> 12;
				@Pc(74) int local74 = Static171.anInt3863 & local31 + (local58 >> 12);
				@Pc(82) int local82 = (local66 >> 12) + arg0 & Static241.anInt5135;
				@Pc(88) int[] local88 = this.method5700(0, local82);
				local11[local31] = local88[local74];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(26) int[] local26 = this.method5700(1, arg0);
			@Pc(32) int[] local32 = this.method5700(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static263.anInt5504; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt5020 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static45.anIntArray70[local58] >> 12;
				@Pc(83) int local83 = local67 * Static331.anIntArray498[local58] >> 12;
				@Pc(91) int local91 = Static171.anInt3863 & (local75 >> 12) + local46;
				@Pc(100) int local100 = arg0 + (local83 >> 12) & Static241.anInt5135;
				@Pc(106) int[][] local106 = this.method5707(local100, 0);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5020 = arg1.method3104() << 4;
		} else if (arg0 == 1) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}
}
