import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
	public final int anInt7375;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V")
	public Class2_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7377 = arg1;
		this.anInt7375 = arg0;
	}
}
