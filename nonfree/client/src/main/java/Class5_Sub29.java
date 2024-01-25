import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class5_Sub29 extends Class5 {

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	public int anInt4543 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public int anInt4539 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public int anInt4541 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	public int anInt4544 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public int anInt4542 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
	public int anInt4547 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	public int anInt4546 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	public int anInt4540 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Lclient!cl;")
	public final Class5_Sub8 aClass5_Sub8_1;

	static {
		new Class198("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!cl;)V")
	public Class5_Sub29(@OriginalArg(0) Class5_Sub8 arg0) {
		this.aClass5_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public boolean method3602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4542 <= arg0 && arg0 <= this.anInt4547 && this.anInt4539 <= arg1 && arg1 <= this.anInt4546) {
			return true;
		} else {
			return arg0 >= this.anInt4544 && this.anInt4541 >= arg0 && arg1 >= this.anInt4540 && arg1 <= this.anInt4543;
		}
	}
}
