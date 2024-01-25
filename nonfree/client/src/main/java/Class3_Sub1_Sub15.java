import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	private int anInt2412 = 204;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	private int anInt2414 = 1;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	private int anInt2411 = 1;

	static {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			aRectangleArray4[local8] = new Rectangle();
		}
		new Class57("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2414 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt2411 = arg0.method2739();
		} else if (arg1 == 2) {
			this.anInt2412 = arg0.method2767();
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			for (@Pc(23) int local23 = 0; local23 < Static238.anInt4221; local23++) {
				@Pc(29) int local29 = Static187.anIntArray379[local23];
				@Pc(33) int local33 = Static351.anIntArray371[arg0];
				@Pc(40) int local40 = this.anInt2414 * local29 >> 12;
				@Pc(47) int local47 = this.anInt2411 * local33 >> 12;
				@Pc(57) int local57 = this.anInt2414 * (local29 % (4096 / this.anInt2414));
				@Pc(67) int local67 = this.anInt2411 * (local33 % (4096 / this.anInt2411));
				if (this.anInt2412 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (local57 < this.anInt2412) {
						local17[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt2412) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}
}
