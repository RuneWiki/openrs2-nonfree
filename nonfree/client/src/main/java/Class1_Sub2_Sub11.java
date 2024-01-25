import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
	private int anInt1714 = 1;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	private int anInt1715 = 1;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	private int anInt1720 = 204;

	static {
		new Class169("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			for (@Pc(27) int local27 = 0; local27 < Static158.anInt2658; local27++) {
				@Pc(33) int local33 = Static87.anIntArray211[local27];
				@Pc(37) int local37 = Static394.anIntArray751[arg0];
				@Pc(44) int local44 = local33 * this.anInt1714 >> 12;
				@Pc(51) int local51 = local37 * this.anInt1715 >> 12;
				@Pc(61) int local61 = this.anInt1714 * (local33 % (4096 / this.anInt1714));
				@Pc(71) int local71 = local37 % (4096 / this.anInt1715) * this.anInt1715;
				if (local71 < this.anInt1720) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 != 1) {
						local21[local27] = 0;
						continue;
					}
					if (local61 < this.anInt1720) {
						local21[local27] = 0;
						continue;
					}
				}
				if (this.anInt1720 > local61) {
					for (local44 -= local51; local44 < 0; local44 += 4) {
					}
					while (local44 > 3) {
						local44 -= 4;
					}
					if (local44 > 0) {
						local21[local27] = 0;
						continue;
					}
				}
				local21[local27] = 4096;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt1714 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt1715 = arg1.method5174();
		} else if (arg0 == 2) {
			this.anInt1720 = arg1.method5177();
		}
	}
}
