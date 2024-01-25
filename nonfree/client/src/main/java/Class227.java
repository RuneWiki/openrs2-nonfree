import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class227 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "F")
	public float aFloat296 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "F")
	public float aFloat299 = 0.25F;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "F")
	public float aFloat301 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public final int anInt6894;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "F")
	public final float aFloat297;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public final int anInt6896;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public final int anInt6890;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!kk;")
	public final Class92 aClass92_3;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public final int anInt6893;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public final int anInt6892;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public final int anInt6889;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "F")
	public final float aFloat298;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "F")
	public final float aFloat300;

	static {
		new Class40("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class227() {
		this.anInt6894 = -50;
		this.aFloat297 = 1.1523438F;
		this.anInt6896 = 0;
		this.anInt6890 = -50;
		this.aClass92_3 = Static465.aClass92_4;
		this.anInt6893 = Static449.anInt7818;
		this.anInt6892 = Static435.anInt7660;
		this.anInt6889 = -60;
		this.aFloat298 = 1.2F;
		this.aFloat300 = 0.69921875F;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class227(@OriginalArg(0) Class5_Sub3 arg0) {
		@Pc(16) int local16 = arg0.method4220();
		if (Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459) && Static206.aClass62_24.method7034() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6893 = Static449.anInt7818;
			} else {
				this.anInt6893 = arg0.method4230();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat297 = 1.1523438F;
			} else {
				this.aFloat297 = (float) arg0.method4227() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat300 = 0.69921875F;
			} else {
				this.aFloat300 = (float) arg0.method4227() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat298 = 1.2F;
			} else {
				this.aFloat298 = (float) arg0.method4227() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4230();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4227();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4227();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4227();
			}
			this.aFloat297 = 1.1523438F;
			this.aFloat298 = 1.2F;
			this.aFloat300 = 0.69921875F;
			this.anInt6893 = Static449.anInt7818;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6894 = -50;
			this.anInt6890 = -50;
			this.anInt6889 = -60;
		} else {
			this.anInt6890 = arg0.method4212();
			this.anInt6889 = arg0.method4212();
			this.anInt6894 = arg0.method4212();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6892 = Static435.anInt7660;
		} else {
			this.anInt6892 = arg0.method4230();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6896 = 0;
		} else {
			this.anInt6896 = arg0.method4227();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass92_3 = Static465.aClass92_4;
		} else {
			@Pc(229) int local229 = arg0.method4227();
			@Pc(233) int local233 = arg0.method4227();
			@Pc(237) int local237 = arg0.method4227();
			@Pc(241) int local241 = arg0.method4227();
			@Pc(245) int local245 = arg0.method4227();
			@Pc(249) int local249 = arg0.method4227();
			this.aClass92_3 = Static214.method3472(local233, local237, local245, local229, local241, local249);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!pb;)Z")
	public boolean method5609(@OriginalArg(1) Class227 arg0) {
		return this.anInt6893 == arg0.anInt6893 && arg0.aFloat297 == this.aFloat297 && arg0.aFloat300 == this.aFloat300 && arg0.aFloat298 == this.aFloat298 && arg0.aFloat299 == this.aFloat299 && this.aFloat296 == arg0.aFloat296 && this.aFloat301 == arg0.aFloat301 && arg0.anInt6892 == this.anInt6892 && arg0.anInt6896 == this.anInt6896 && this.aClass92_3 == arg0.aClass92_3;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!co;B)V")
	public void method5610(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aFloat296 = (float) (arg0.method4220() * 8) / 255.0F;
		this.aFloat299 = (float) (arg0.method4220() * 8) / 255.0F;
		this.aFloat301 = (float) (arg0.method4220() * 8) / 255.0F;
	}
}
