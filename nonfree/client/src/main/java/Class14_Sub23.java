import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class14_Sub23 extends Class14 {

	@OriginalMember(owner = "client!no", name = "l", descriptor = "I")
	public final int anInt4350;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public final int anInt4351;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString154;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	public final int anInt4357;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "Ljava/lang/String;")
	public String aString155;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "J")
	public final long aLong128;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public int anInt4355;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class14_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4350 = arg6;
		this.anInt4351 = arg5;
		this.aString154 = arg0;
		this.anInt4357 = arg2;
		this.aString155 = arg1;
		this.aLong128 = arg4;
		this.anInt4355 = arg3;
	}
}
