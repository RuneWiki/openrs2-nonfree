import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	public int anInt5700;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	public int anInt5701;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public int anInt5702;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
	public int anInt5703;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
	public int anInt5705;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Z")
	public boolean aBoolean354 = false;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
	public int anInt5707 = -1;

	static {
		new Class267(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V")
	public Class6_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5707 = arg0;
	}
}
