import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
	public int anInt5147;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	public final int anInt5142;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public final int anInt5144;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "J")
	public final long aLong215;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Z")
	public final boolean aBoolean390;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
	public final boolean aBoolean389;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	public final int anInt5143;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public final int anInt5145;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt5147 = arg3;
		this.aString54 = arg0;
		this.anInt5142 = arg2;
		this.anInt5144 = arg6;
		this.aLong215 = arg5;
		this.aBoolean390 = arg9;
		this.aBoolean389 = arg8;
		this.anInt5143 = arg4;
		this.aString55 = arg1;
		this.anInt5145 = arg7;
	}
}
