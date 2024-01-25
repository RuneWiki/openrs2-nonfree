import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class10_Sub2_Sub7 extends Class10_Sub2 {

	@OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
	private int anInt1637 = 2048;

	@OriginalMember(owner = "client!dp", name = "P", descriptor = "I")
	private int anInt1641 = 0;

	@OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
	private int anInt1640 = 8192;

	@OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
	private int anInt1636 = 2048;

	@OriginalMember(owner = "client!dp", name = "U", descriptor = "I")
	private int anInt1645 = 4096;

	@OriginalMember(owner = "client!dp", name = "V", descriptor = "I")
	private int anInt1646 = 12288;

	@OriginalMember(owner = "client!dp", name = "T", descriptor = "I")
	private int anInt1644 = 0;

	static {
		new Class182("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		Static44.method657();
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)Z")
	private boolean method1497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt1646 >> 12;
		@Pc(22) int local22 = Static132.anIntArray275[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local22 << 12) / this.anInt1646;
		@Pc(44) int local44 = (local37 << 12) / this.anInt1640;
		@Pc(51) int local51 = this.anInt1645 * local44 >> 12;
		return local51 > arg1 - arg0 && -local51 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int local26 = Static67.anIntArray106[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static121.anInt2458; local28++) {
				@Pc(36) int local36 = Static182.anIntArray374[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt1636;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(59) int local59 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(64) int local64 = this.anInt1641 + local26;
				@Pc(73) int local73 = local64 >= -2048 ? local64 : local64 + 4096;
				@Pc(82) int local82 = local73 > 2048 ? local73 - 4096 : local73;
				@Pc(87) int local87 = this.anInt1644 + local36;
				@Pc(96) int local96 = local87 >= -2048 ? local87 : local87 + 4096;
				@Pc(107) int local107 = local96 <= 2048 ? local96 : local96 - 4096;
				@Pc(112) int local112 = this.anInt1637 + local26;
				@Pc(121) int local121 = local112 < -2048 ? local112 + 4096 : local112;
				@Pc(130) int local130 = local121 <= 2048 ? local121 : local121 - 4096;
				local16[local28] = this.method1499(local82, local59) || this.method1497(local107, local130) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1636 = arg1.method2485();
		} else if (arg0 == 1) {
			this.anInt1641 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt1644 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt1637 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt1646 = arg1.method2485();
		} else if (arg0 == 5) {
			this.anInt1645 = arg1.method2485();
		} else if (arg0 == 6) {
			this.anInt1640 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBI)Z")
	private boolean method1499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt1646 >> 12;
		@Pc(28) int local28 = Static132.anIntArray275[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1646;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1640;
		@Pc(49) int local49 = local42 * this.anInt1645 >> 12;
		return local49 > arg1 + arg0 && arg0 + arg1 > -local49;
	}
}
