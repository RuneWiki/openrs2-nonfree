import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class75 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!uo;")
	public Class5_Sub43 aClass5_Sub43_1;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!lm;")
	public Class5_Sub22_Sub2 aClass5_Sub22_Sub2_1;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!rm;")
	public Class5_Sub5_Sub1 aClass5_Sub5_Sub1_1;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Lclient!gm;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public int anInt1970;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	public final int anInt1974;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public final int anInt1971;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public final int anInt1969;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public final int anInt1973;

	static {
		new Class198(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(BIIIII)V")
	public Class75(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1970 = arg3;
		this.anInt1974 = arg4;
		this.anInt1971 = arg1;
		this.aByte16 = arg0;
		this.anInt1969 = arg5;
		this.anInt1973 = arg2;
	}
}
