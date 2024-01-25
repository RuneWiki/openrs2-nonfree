import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class8_Sub5_Sub7 extends Class8_Sub5 {

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "J")
	public final long aLong92;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
	public final boolean aBoolean277;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	public final int anInt3778;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
	public final int anInt3782;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "Z")
	public final boolean aBoolean278;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString41;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	public final int anInt3780;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	public final int anInt3777;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "J")
	public final long aLong93;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "Z")
	public final boolean aBoolean279;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class8_Sub5_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aLong92 = arg10;
		this.aBoolean277 = arg9;
		this.anInt3778 = arg2;
		this.anInt3782 = arg7;
		this.anInt3779 = arg3;
		this.aBoolean278 = arg11;
		this.aString41 = arg0;
		this.anInt3780 = arg6;
		this.anInt3777 = arg4;
		this.aLong93 = arg5;
		this.aBoolean279 = arg8;
		this.aString42 = arg1;
	}
}
