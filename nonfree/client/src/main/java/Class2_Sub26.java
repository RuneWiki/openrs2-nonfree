import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	public final int anInt3596;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public final int anInt3593;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	public final int anInt3595;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "J")
	public final long aLong127;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
	public final boolean aBoolean272;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	public final int anInt3599;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Z")
	public final boolean aBoolean273;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt3596 = arg7;
		this.aString39 = arg1;
		this.anInt3593 = arg4;
		this.anInt3594 = arg3;
		this.anInt3595 = arg2;
		this.aLong127 = arg5;
		this.aString40 = arg0;
		this.aBoolean272 = arg8;
		this.anInt3599 = arg6;
		this.aBoolean273 = arg9;
	}
}
