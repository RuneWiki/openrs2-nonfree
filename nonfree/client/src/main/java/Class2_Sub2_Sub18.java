import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	private int anInt3871 = 32768;

	static {
		new Class231("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(29) int[] local29 = this.method6266(1, arg0);
			@Pc(35) int[] local35 = this.method6266(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static398.anInt6955; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt3871 * local35[local49] >> 12;
				@Pc(78) int local78 = local70 * Static314.anIntArray477[local61] >> 12;
				@Pc(86) int local86 = local70 * Static55.anIntArray70[local61] >> 12;
				@Pc(95) int local95 = local49 + (local78 >> 12) & Static210.anInt3600;
				@Pc(103) int local103 = Static71.anInt1203 & (local86 >> 12) + arg0;
				@Pc(109) int[][] local109 = this.method6276(0, local103);
				local39[local49] = local109[0][local95];
				local43[local49] = local109[1][local95];
				local47[local49] = local109[2][local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		Static193.method2769();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3871 = arg0.method6148() << 4;
		} else if (arg1 == 1) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int[] local29 = this.method6266(1, arg0);
			@Pc(35) int[] local35 = this.method6266(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static398.anInt6955; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt3871 * local35[local37] >> 12;
				@Pc(64) int local64 = Static314.anIntArray477[local47] * local56 >> 12;
				@Pc(72) int local72 = Static55.anIntArray70[local47] * local56 >> 12;
				@Pc(81) int local81 = local37 + (local64 >> 12) & Static210.anInt3600;
				@Pc(90) int local90 = arg0 + (local72 >> 12) & Static71.anInt1203;
				@Pc(96) int[] local96 = this.method6266(0, local90);
				local11[local37] = local96[local81];
			}
		}
		return local11;
	}
}
