import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public final int anInt128;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public final int anInt133;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public final int anInt130;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
	public final boolean aBoolean19;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	public final int anInt129;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	public final int anInt132;

	static {
		new Class62("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt128 = arg0;
		this.anInt133 = arg1;
		this.anInt130 = arg2;
		this.aBoolean19 = arg5;
		this.anInt129 = arg4;
		this.anInt132 = arg3;
	}
}
