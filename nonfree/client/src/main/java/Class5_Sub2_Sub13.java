import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!nba", name = "x", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
	public final int anInt6709;

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
	public int anInt6711;

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "Z")
	public final boolean aBoolean479;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
	public final int anInt6706;

	@OriginalMember(owner = "client!nba", name = "D", descriptor = "Z")
	public final boolean aBoolean480;

	@OriginalMember(owner = "client!nba", name = "A", descriptor = "I")
	public final int anInt6710;

	@OriginalMember(owner = "client!nba", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "client!nba", name = "J", descriptor = "J")
	public final long aLong198;

	@OriginalMember(owner = "client!nba", name = "E", descriptor = "Z")
	public final boolean aBoolean481;

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
	public final int anInt6708;

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "J")
	public final long aLong197;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class5_Sub2_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt6709 = arg4;
		this.aString66 = arg1;
		this.anInt6711 = arg3;
		this.aBoolean479 = arg8;
		this.anInt6706 = arg7;
		this.aBoolean480 = arg11;
		this.anInt6710 = arg6;
		this.aString68 = arg0;
		this.aLong198 = arg5;
		this.aBoolean481 = arg9;
		this.anInt6708 = arg2;
		this.aLong197 = arg10;
	}
}
