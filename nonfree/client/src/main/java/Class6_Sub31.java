import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
	public int anInt6719 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public int anInt6721 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
	public int anInt6722 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	public int anInt6720 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
	public int anInt6725 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
	public int anInt6727 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
	public int anInt6729 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
	public int anInt6728 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "Lclient!tl;")
	public final Class6_Sub45 aClass6_Sub45_1;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class6_Sub31(@OriginalArg(0) Class6_Sub45 arg0) {
		this.aClass6_Sub45_1 = arg0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Z")
	public boolean method5767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt6727 && arg1 <= this.anInt6722 && this.anInt6720 <= arg0 && this.anInt6719 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt6729 && arg1 <= this.anInt6728 && this.anInt6721 <= arg0 && this.anInt6725 >= arg0;
		}
	}
}
