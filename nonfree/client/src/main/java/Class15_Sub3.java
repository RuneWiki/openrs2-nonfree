import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public abstract class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	protected int anInt6142;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	public final int anInt6141;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	protected final int anInt6143;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	protected int anInt6146;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIII)V")
	protected Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6142 = arg2;
		this.anInt6141 = arg3;
		this.anInt6143 = arg1;
		this.anInt6146 = arg0;
	}
}
