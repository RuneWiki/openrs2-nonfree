import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "[I")
	public final int[] anIntArray89;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	public final int[] anIntArray88;

	static {
		new Class134(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II[I[I)V")
	public Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray89 = arg2;
		this.anIntArray88 = arg3;
	}
}
