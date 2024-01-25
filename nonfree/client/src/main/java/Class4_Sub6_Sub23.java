import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class4_Sub6_Sub23 extends Class4_Sub6 {

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
	private int anInt4742 = 1;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
	private int anInt4745 = 204;

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
	private int anInt4741 = 1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
		new Class83("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			for (@Pc(25) int local25 = 0; local25 < Static80.anInt1616; local25++) {
				@Pc(31) int local31 = Static341.anIntArray504[local25];
				@Pc(35) int local35 = Static165.anIntArray209[arg0];
				@Pc(42) int local42 = local31 * this.anInt4742 >> 12;
				@Pc(49) int local49 = this.anInt4741 * local35 >> 12;
				@Pc(59) int local59 = this.anInt4742 * (local31 % (4096 / this.anInt4742));
				@Pc(69) int local69 = local35 % (4096 / this.anInt4741) * this.anInt4741;
				if (this.anInt4745 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt4745 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt4745) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4742 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt4741 = arg1.method2490();
		} else if (arg0 == 2) {
			this.anInt4745 = arg1.method2536();
		}
	}
}
