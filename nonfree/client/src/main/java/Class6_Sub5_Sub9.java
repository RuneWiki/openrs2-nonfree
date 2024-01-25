import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class6_Sub5_Sub9 extends Class6_Sub5 {

	@OriginalMember(owner = "client!em", name = "x", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!em", name = "E", descriptor = "J")
	public final long aLong79;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "I")
	public final int anInt3239;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	public final int anInt3238;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "I")
	public final int anInt3241;

	@OriginalMember(owner = "client!em", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	public int anInt3240;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
	public final boolean aBoolean252;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "Z")
	public final boolean aBoolean253;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Z")
	public final boolean aBoolean254;

	@OriginalMember(owner = "client!em", name = "z", descriptor = "J")
	public final long aLong78;

	@OriginalMember(owner = "client!em", name = "I", descriptor = "I")
	public final int anInt3242;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class6_Sub5_Sub9(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aLong79 = arg10;
		this.anInt3239 = arg4;
		this.anInt3238 = arg2;
		this.anInt3241 = arg7;
		this.aString25 = arg1;
		this.anInt3240 = arg3;
		this.aBoolean252 = arg9;
		this.aBoolean253 = arg8;
		this.aBoolean254 = arg11;
		this.aLong78 = arg5;
		this.anInt3242 = arg6;
		this.aString26 = arg0;
	}
}
