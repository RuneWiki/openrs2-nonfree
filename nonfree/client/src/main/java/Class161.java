import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class161 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	public final int anInt4197;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public final int anInt4195;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public final int anInt4198;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	public final int anInt4200;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
	public final int anInt4202;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Z")
	public final boolean aBoolean342;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4197 = arg2;
		this.aByte54 = (byte) arg8;
		this.aShort46 = (short) arg5;
		this.anInt4195 = arg0;
		this.anInt4198 = arg11;
		this.aShort47 = (short) arg4;
		this.aShort45 = (short) arg6;
		this.anInt4200 = arg1;
		this.anInt4202 = arg3;
		this.aBoolean342 = arg10;
	}
}
