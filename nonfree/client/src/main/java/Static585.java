import java.awt.Component;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static585 {

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!vw;")
	public static Class209 method8136(@OriginalArg(0) Component arg0) {
		return new Class209_Sub1(arg0);
	}
}
