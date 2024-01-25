import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	public final int anInt3043;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public final int anInt3040;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "J")
	public final long aLong82;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Z")
	public final boolean aBoolean217;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Z")
	public final boolean aBoolean218;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
	public final int anInt3046;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	public final int anInt3045;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString35 = arg0;
		this.anInt3043 = arg6;
		this.aString36 = arg1;
		this.anInt3040 = arg7;
		this.aLong82 = arg5;
		this.aBoolean217 = arg9;
		this.aBoolean218 = arg8;
		this.anInt3046 = arg4;
		this.anInt3045 = arg2;
		this.anInt3041 = arg3;
	}
}
