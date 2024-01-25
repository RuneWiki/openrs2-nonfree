import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
	public static int anInt2494;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
	public static final int anInt2486 = 0;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_35 = new Class242("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)I")
	public static int method1862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
