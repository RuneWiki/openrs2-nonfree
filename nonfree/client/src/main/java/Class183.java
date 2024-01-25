import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class183 {

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "B")
	public final byte aByte68;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
	public final int anInt4690;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "Z")
	public final boolean aBoolean367;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	public final int anInt4692;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
	public final int anInt4691;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
	public final int anInt4693;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public final int anInt4687;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte68 = (byte) arg8;
		this.aShort68 = (short) arg4;
		this.anInt4690 = arg3;
		this.aBoolean367 = arg10;
		this.anInt4692 = arg1;
		this.anInt4691 = arg2;
		this.aShort69 = (short) arg6;
		this.anInt4693 = arg11;
		this.aShort67 = (short) arg5;
		this.anInt4687 = arg0;
	}
}
