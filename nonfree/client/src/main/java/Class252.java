import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class252 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	public static boolean aBoolean486;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "J")
	public static long aLong231;

	static {
		new Class79("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		aBoolean486 = false;
		aLong231 = 0L;
	}
}
