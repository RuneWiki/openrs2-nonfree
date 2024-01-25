import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public final int anInt2367;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public final int anInt2368;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public final int anInt2366;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	public final int anInt2372;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Z")
	public final boolean aBoolean222;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
	public final int anInt2373;

	static {
		new Class83(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2367 = arg4;
		this.anInt2368 = arg1;
		this.anInt2366 = arg3;
		this.anInt2372 = arg0;
		this.aBoolean222 = arg5;
		this.anInt2373 = arg2;
	}
}
