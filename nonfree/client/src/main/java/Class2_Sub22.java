import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "J")
	public final long aLong114;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "Z")
	public final boolean aBoolean281;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
	public final int anInt3720;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public final int anInt3715;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
	public final boolean aBoolean282;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public final int anInt3717;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt3719 = arg7;
		this.aLong114 = arg5;
		this.aBoolean281 = arg8;
		this.anInt3720 = arg4;
		this.anInt3715 = arg6;
		this.aString43 = arg1;
		this.anInt3716 = arg3;
		this.aBoolean282 = arg9;
		this.aString42 = arg0;
		this.anInt3717 = arg2;
	}
}
