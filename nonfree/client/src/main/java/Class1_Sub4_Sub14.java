import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class Class1_Sub4_Sub14 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
	public final int anInt5412;

	static {
		new Class106("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub4_Sub14(@OriginalArg(0) int arg0) {
		this.anInt5412 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4959();

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)Z")
	public abstract boolean method4960();
}
