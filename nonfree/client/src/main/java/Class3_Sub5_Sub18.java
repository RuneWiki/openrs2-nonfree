import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class3_Sub5_Sub18 extends Class3_Sub5 {

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "J")
	public final long aLong258;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString105;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	public final int anInt9212;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public final int anInt9211;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Z")
	public final boolean aBoolean640;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	public final int anInt9213;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	public final int anInt9210;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
	public final boolean aBoolean642;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "J")
	public final long aLong259;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public int anInt9217;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Z")
	public final boolean aBoolean641;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class3_Sub5_Sub18(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aLong258 = arg10;
		this.aString105 = arg0;
		this.anInt9212 = arg6;
		this.anInt9211 = arg2;
		this.aBoolean640 = arg8;
		this.anInt9213 = arg7;
		this.anInt9210 = arg4;
		this.aBoolean642 = arg11;
		this.aLong259 = arg5;
		this.anInt9217 = arg3;
		this.aString106 = arg1;
		this.aBoolean641 = arg9;
	}
}
