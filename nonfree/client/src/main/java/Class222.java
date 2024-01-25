import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class222 {

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Z")
	public final boolean aBoolean453;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public final int anInt6180;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	public final int anInt6181;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public final int anInt6176;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "S")
	public final short aShort82;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "B")
	public final byte aByte82;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public final int anInt6179;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	public final int anInt6182;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean453 = arg10;
		this.anInt6180 = arg2;
		this.anInt6181 = arg1;
		this.aShort83 = (short) arg5;
		this.anInt6176 = arg3;
		this.aShort82 = (short) arg6;
		this.aByte82 = (byte) arg8;
		this.anInt6179 = arg11;
		this.aShort84 = (short) arg4;
		this.anInt6182 = arg0;
	}
}
