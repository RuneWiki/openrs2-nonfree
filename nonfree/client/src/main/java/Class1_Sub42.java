import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Ljava/lang/String;")
	public String aString64;

	static {
		new Class114("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	private Class1_Sub42() {
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString64 = arg0;
	}
}
