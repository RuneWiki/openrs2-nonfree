import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	public final int anInt1770;

	static {
		new Class221("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt1770 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
	public abstract boolean method1594();

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method1597();
}
