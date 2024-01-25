import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class232 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public int anInt6733;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "Lclient!ih;")
	public Class31 aClass31_26;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!nba;")
	public Class232 aClass232_2;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	public final int anInt6735;

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
	public final int anInt6734;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6735 = arg0;
		this.anInt6734 = arg1;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Lclient!nba;")
	public Class232 method5855(@OriginalArg(0) int arg0) {
		return new Class232(this.anInt6735, arg0);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)Lclient!gca;")
	public Class121 method5856() {
		return Static319.method5303(this.anInt6735);
	}
}
