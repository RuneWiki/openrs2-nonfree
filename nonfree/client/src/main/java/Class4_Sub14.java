import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	public final int anInt2131;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
	public final int anInt2130;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Z")
	public final boolean aBoolean150;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "J")
	public final long aLong69;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!eu", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString14;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "Z")
	public final boolean aBoolean149;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
	public final int anInt2135;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
	public final int anInt2133;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class4_Sub14(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt2132 = arg3;
		this.anInt2131 = arg2;
		this.anInt2130 = arg4;
		this.aBoolean150 = arg9;
		this.aLong69 = arg5;
		this.aString13 = arg1;
		this.aString14 = arg0;
		this.aBoolean149 = arg8;
		this.anInt2135 = arg7;
		this.anInt2133 = arg6;
	}
}
