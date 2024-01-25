import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
	private int anInt1266 = 4096;

	static {
		new Class169("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt1266 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(32) int[] local32 = this.method5510(arg0 - 1 & Static13.anInt189, 0);
			@Pc(38) int[] local38 = this.method5510(arg0, 0);
			@Pc(48) int[] local48 = this.method5510(Static13.anInt189 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static158.anInt2658; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * this.anInt1266;
				@Pc(84) int local84 = (local38[Static271.anInt4721 & local50 + 1] - local38[Static271.anInt4721 & local50 - 1]) * this.anInt1266;
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local16[local50] = 4096 - local129;
			}
		}
		return local16;
	}
}
