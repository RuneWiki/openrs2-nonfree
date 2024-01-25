import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class2_Sub7_Sub21 extends Class2_Sub7 {

	@OriginalMember(owner = "client!vea", name = "D", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!vea", name = "x", descriptor = "Z")
	public final boolean aBoolean722;

	@OriginalMember(owner = "client!vea", name = "F", descriptor = "Z")
	public final boolean aBoolean723;

	@OriginalMember(owner = "client!vea", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "Z")
	public final boolean aBoolean721;

	@OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
	public final int anInt10016;

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
	public final int anInt10011;

	@OriginalMember(owner = "client!vea", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString109;

	@OriginalMember(owner = "client!vea", name = "t", descriptor = "J")
	public final long aLong261;

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
	public final int anInt10012;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "I")
	public final int anInt10013;

	@OriginalMember(owner = "client!vea", name = "B", descriptor = "J")
	public final long aLong262;

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "I")
	public int anInt10014;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class2_Sub7_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean722 = arg8;
		this.aBoolean723 = arg9;
		this.aString107 = arg1;
		this.aBoolean721 = arg11;
		this.anInt10016 = arg7;
		this.anInt10011 = arg6;
		this.aString109 = arg0;
		this.aLong261 = arg10;
		this.anInt10012 = arg4;
		this.anInt10013 = arg2;
		this.aLong262 = arg5;
		this.anInt10014 = arg3;
	}
}
