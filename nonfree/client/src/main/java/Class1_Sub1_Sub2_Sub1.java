import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	static {
		new Class96("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!qo;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5252() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5251() {
		return false;
	}
}
