import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Z")
	public final boolean aBoolean381;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
	public final int anInt4536;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public final int anInt4533;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public final int anInt4530;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
	public final boolean aBoolean379;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public int anInt4529;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "J")
	public final long aLong137;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	public final int anInt4535;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean381 = arg9;
		this.anInt4536 = arg2;
		this.aString40 = arg0;
		this.anInt4533 = arg6;
		this.anInt4530 = arg4;
		this.aBoolean379 = arg8;
		this.aString41 = arg1;
		this.anInt4529 = arg3;
		this.aLong137 = arg5;
		this.anInt4535 = arg7;
	}
}
