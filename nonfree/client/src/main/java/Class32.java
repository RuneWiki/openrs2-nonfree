import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt831 = 25;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray12 = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "-unused-", "runecraft", "-unused-", "-unused-", "-unused-", "-unused-" };

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, false, false, false, false };
}
