import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class227 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	public int anInt6577;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "Lclient!nba;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public int anInt6580;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	public int anInt6584;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
	public int anInt6585;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
	public int anInt6586;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	public int anInt6589;

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
	public int anInt6590;

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
	public int anInt6592;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
	public final int anInt6582;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
	private final int anInt6591;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	public final int anInt6587;

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
	public final int anInt6581;

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIIIB)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6582 = arg1;
		this.anInt6591 = arg0;
		this.anInt6587 = arg3;
		this.anInt6581 = arg2;
		this.aByte72 = arg4;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIII)Lclient!nba;")
	public Class227 method5527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class227(this.anInt6591, arg1, arg0, arg2, this.aByte72);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Lclient!kea;")
	public Class187 method5529() {
		return Static35.method465(this.anInt6591);
	}
}
