import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class14_Sub2_Sub20 extends Class14_Sub2 {

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "Ljava/lang/String;")
	public String aString112;

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "I")
	public final int anInt10007;

	@OriginalMember(owner = "client!uda", name = "C", descriptor = "I")
	public final int anInt10004;

	@OriginalMember(owner = "client!uda", name = "D", descriptor = "Z")
	public final boolean aBoolean691;

	@OriginalMember(owner = "client!uda", name = "L", descriptor = "J")
	public final long aLong280;

	@OriginalMember(owner = "client!uda", name = "w", descriptor = "I")
	public final int anInt10000;

	@OriginalMember(owner = "client!uda", name = "J", descriptor = "I")
	public final int anInt9999;

	@OriginalMember(owner = "client!uda", name = "y", descriptor = "Z")
	public final boolean aBoolean689;

	@OriginalMember(owner = "client!uda", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString113;

	@OriginalMember(owner = "client!uda", name = "B", descriptor = "Z")
	public final boolean aBoolean690;

	@OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
	public int anInt10001;

	@OriginalMember(owner = "client!uda", name = "K", descriptor = "J")
	public final long aLong281;

	@OriginalMember(owner = "client!uda", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class14_Sub2_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt10007 = arg4;
		this.anInt10004 = arg6;
		this.aBoolean691 = arg8;
		this.aLong280 = arg10;
		this.anInt10000 = arg7;
		this.anInt9999 = arg2;
		this.aBoolean689 = arg11;
		this.aString113 = arg1;
		this.aBoolean690 = arg9;
		this.anInt10001 = arg3;
		this.aLong281 = arg5;
		this.aString114 = arg0;
	}
}
