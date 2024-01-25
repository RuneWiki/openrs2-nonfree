import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	public final int anInt546;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Z")
	public final boolean aBoolean38;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "Z")
	public final boolean aBoolean39;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
	public final int anInt544;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	public final int anInt542;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	public final int anInt543;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "J")
	public final long aLong22;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString3 = arg0;
		this.anInt546 = arg4;
		this.aBoolean38 = arg9;
		this.aBoolean39 = arg8;
		this.anInt544 = arg6;
		this.anInt542 = arg7;
		this.anInt543 = arg2;
		this.aString4 = arg1;
		this.aLong22 = arg5;
		this.anInt541 = arg3;
	}
}
