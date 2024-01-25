import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class224 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public final int anInt5679;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public final int anInt5680;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public final int anInt5678;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public final int anInt5677;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "Z")
	public final boolean aBoolean386;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	public final int anInt5682;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort72 = (short) arg4;
		this.anInt5679 = arg1;
		this.anInt5680 = arg3;
		this.anInt5678 = arg0;
		this.anInt5677 = arg11;
		this.aBoolean386 = arg10;
		this.aShort73 = (short) arg6;
		this.aByte72 = (byte) arg7;
		this.aByte71 = (byte) arg8;
		this.anInt5682 = arg2;
		this.aShort74 = (short) arg5;
	}
}
