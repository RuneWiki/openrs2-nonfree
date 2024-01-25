import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	public final int anInt2906;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "J")
	public final long aLong95;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public final int anInt2900;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString93;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public final int anInt2907;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class4_Sub18(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2906 = arg6;
		this.aLong95 = arg4;
		this.anInt2900 = arg2;
		this.anInt2905 = arg3;
		this.aString93 = arg0;
		this.anInt2907 = arg5;
		this.aString94 = arg1;
	}
}
