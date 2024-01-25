import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class2_Sub7_Sub17 extends Class2_Sub7 {

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	private int anInt3626;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	private int anInt3627;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	private int anInt3623 = -1;

	static {
		new Class202("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	@Override
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7588(arg0, arg1);
		if (this.anInt3623 >= 0 && Static355.anInterface12_14 != null) {
			@Pc(35) int local35 = Static355.anInterface12_14.method2573(this.anInt3623).aBoolean454 ? 64 : 128;
			this.anIntArray389 = Static355.anInterface12_14.method2571(local35, local35, 1.0F, this.anInt3623, false);
			this.anInt3626 = local35;
			this.anInt3627 = local35;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	@Override
	public void method7591() {
		super.method7591();
		this.anIntArray389 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	@Override
	public int method7579() {
		return this.anInt3623;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(43) int local43 = this.anInt3627 * (this.anInt3626 == Static79.anInt1658 ? arg0 : arg0 * this.anInt3626 / Static79.anInt1658);
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static352.anInt6485 == this.anInt3627) {
				for (local65 = 0; local65 < Static352.anInt6485; local65++) {
					local73 = this.anIntArray389[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static352.anInt6485; local65++) {
					local73 = local65 * this.anInt3627 / Static352.anInt6485;
					@Pc(121) int local121 = this.anIntArray389[local73 + local43];
					local55[local65] = (local121 & 0xFF) << 4;
					local51[local65] = local121 >> 4 & 0xFF0;
					local47[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3623 = arg1.method5229();
		}
	}
}
