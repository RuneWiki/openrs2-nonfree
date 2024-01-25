import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class2_Sub5_Sub11 extends Class2_Sub5 {

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!kt;")
	public final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1;

	static {
		new Class209("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!kt;)V")
	public Class2_Sub5_Sub11(@OriginalArg(0) Class3_Sub2_Sub2 arg0) {
		this.aClass3_Sub2_Sub2_1 = arg0;
	}
}
