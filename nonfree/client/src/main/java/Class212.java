import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class212 {

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_35;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public final int anInt5831;

	static {
		new Class7("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class212(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub2_35 = arg0;
		this.anInt5831 = arg2;
	}

	@OriginalMember(owner = "client!rm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub2_35.method3174(this.anInt5831);
		super.finalize();
	}
}
