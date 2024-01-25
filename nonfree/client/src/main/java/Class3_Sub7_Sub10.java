import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hla")
public final class Class3_Sub7_Sub10 extends Class3_Sub7 {

	@OriginalMember(owner = "client!hla", name = "x", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!hla", name = "G", descriptor = "Z")
	public final boolean aBoolean244;

	@OriginalMember(owner = "client!hla", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!hla", name = "t", descriptor = "I")
	public final int anInt3912;

	@OriginalMember(owner = "client!hla", name = "D", descriptor = "Z")
	public final boolean aBoolean243;

	@OriginalMember(owner = "client!hla", name = "B", descriptor = "Z")
	public final boolean aBoolean245;

	@OriginalMember(owner = "client!hla", name = "A", descriptor = "J")
	public final long aLong145;

	@OriginalMember(owner = "client!hla", name = "q", descriptor = "J")
	public final long aLong144;

	@OriginalMember(owner = "client!hla", name = "z", descriptor = "I")
	public final int anInt3911;

	@OriginalMember(owner = "client!hla", name = "v", descriptor = "I")
	public int anInt3913;

	@OriginalMember(owner = "client!hla", name = "r", descriptor = "I")
	public final int anInt3910;

	@OriginalMember(owner = "client!hla", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!hla", name = "s", descriptor = "I")
	public final int anInt3909;

	@OriginalMember(owner = "client!hla", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub7_Sub10(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean244 = arg9;
		this.aString56 = arg0;
		this.anInt3912 = arg4;
		this.aBoolean243 = arg11;
		this.aBoolean245 = arg8;
		this.aLong145 = arg5;
		this.aLong144 = arg10;
		this.anInt3911 = arg7;
		this.anInt3913 = arg3;
		this.anInt3910 = arg2;
		this.aString58 = arg1;
		this.anInt3909 = arg6;
	}
}
