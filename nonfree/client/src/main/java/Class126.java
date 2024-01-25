import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class126 {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Z")
	public final boolean aBoolean209;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
	public final int anInt3089;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	public final int anInt3088;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	public final int anInt3086;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public final int anInt3085;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public final int anInt3084;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort68 = (short) arg6;
		this.aBoolean209 = arg10;
		this.anInt3089 = arg0;
		this.aShort66 = (short) arg5;
		this.anInt3088 = arg3;
		this.anInt3086 = arg2;
		this.aShort67 = (short) arg4;
		this.anInt3085 = arg1;
		this.aByte47 = (byte) arg8;
		this.anInt3084 = arg11;
	}
}
