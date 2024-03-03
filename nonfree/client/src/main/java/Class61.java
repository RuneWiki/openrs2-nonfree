import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class61 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!h;")
	public static final Class89 aClass89_66 = new Class89(56, -1);

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_67 = new Class89(35, -2);

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int anInt1834 = 0;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_64 = new Class145(25, 2);

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
	public static final int[] anIntArray120;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt1835;

	static {
		new Class79("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		anIntArray120 = new int[13];
		anInt1835 = 100;
	}
}
