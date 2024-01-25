import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
	public final int anInt2931;

	static {
		new Class62("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub7_Sub1(@OriginalArg(0) int arg0) {
		this.anInt2931 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2352();

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)Z")
	public abstract boolean method2353();
}
