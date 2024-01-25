import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class285 {

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	public final int anInt8318;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public final int anInt8316;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public final int anInt8319;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "B")
	public final byte aByte111;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public final int anInt8321;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	public final int anInt8317;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "Z")
	public final boolean aBoolean612;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt8318 = arg3;
		this.anInt8316 = arg11;
		this.aShort77 = (short) arg5;
		this.aShort79 = (short) arg4;
		this.anInt8319 = arg1;
		this.aByte111 = (byte) arg8;
		this.anInt8321 = arg2;
		this.anInt8317 = arg0;
		this.aShort78 = (short) arg6;
		this.aBoolean612 = arg10;
	}
}
