import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class223 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	public final int anInt6988;

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
	public final int anInt6994;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public final int anInt6987;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	public final int anInt6992;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIII)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6988 = arg1;
		this.anInt6994 = arg3;
		this.anInt6987 = arg2;
		this.anInt6992 = arg0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Lclient!nba;")
	public Class223 method5868(@OriginalArg(0) int arg0) {
		return new Class223(this.anInt6992, arg0, this.anInt6987, this.anInt6994);
	}
}
