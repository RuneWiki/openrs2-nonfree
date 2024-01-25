import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class162 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public final int anInt4931;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_22;

	static {
		new Class114("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!te;II)V")
	public Class162(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4931 = arg2;
		this.aClass9_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub3_22.method6683(this.anInt4931);
		super.finalize();
	}
}
