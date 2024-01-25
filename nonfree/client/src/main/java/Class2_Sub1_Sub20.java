import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	private int anInt4467 = 4096;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	private int anInt4468 = 0;

	static {
		new Class256("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(28) int[][] local28 = this.method6031(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static131.anInt2581; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local36[local54];
				@Pc(68) int local68 = local40[local54];
				if (this.anInt4468 > local60) {
					local44[local54] = this.anInt4468;
				} else if (local60 <= this.anInt4467) {
					local44[local54] = local60;
				} else {
					local44[local54] = this.anInt4467;
				}
				if (this.anInt4468 > local64) {
					local48[local54] = this.anInt4468;
				} else if (this.anInt4467 < local64) {
					local48[local54] = this.anInt4467;
				} else {
					local48[local54] = local64;
				}
				if (local68 < this.anInt4468) {
					local52[local54] = this.anInt4468;
				} else if (this.anInt4467 < local68) {
					local52[local54] = this.anInt4467;
				} else {
					local52[local54] = local68;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4468 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt4467 = arg1.method3711();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(26) int[] local26 = this.method6037(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2581; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt4468 > local34) {
					local11[local28] = this.anInt4468;
				} else if (local34 <= this.anInt4467) {
					local11[local28] = local34;
				} else {
					local11[local28] = this.anInt4467;
				}
			}
		}
		return local11;
	}
}
