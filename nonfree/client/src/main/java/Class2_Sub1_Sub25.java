import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	static {
		new Class256("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(21) int[] local21 = this.method6037(arg0, 0);
			@Pc(27) int[] local27 = this.method6037(arg0, 1);
			@Pc(33) int[] local33 = this.method6037(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static131.anInt2581; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local41 * local21[local35] + (4096 - local41) * local27[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(26) int[] local26 = this.method6037(arg0, 2);
			@Pc(32) int[][] local32 = this.method6031(0, arg0);
			@Pc(40) int[][] local40 = this.method6031(1, arg0);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static131.anInt2581; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(119) int local119 = 4096 - local84;
					local44[local78] = local119 * local68[local78] + local84 * local56[local78] >> 12;
					local48[local78] = local60[local78] * local84 + local119 * local72[local78] >> 12;
					local52[local78] = local84 * local64[local78] + local76[local78] * local119 >> 12;
				}
			}
		}
		return local16;
	}
}
