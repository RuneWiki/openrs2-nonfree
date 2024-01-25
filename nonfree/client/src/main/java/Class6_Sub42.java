import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "J")
	public final long aLong200;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
	public final int anInt8288;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
	public final int anInt8289;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "Z")
	public final boolean aBoolean605;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "Z")
	public final boolean aBoolean607;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
	public final int anInt8284;

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
	public final int anInt8287;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	public int anInt8285;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class6_Sub42(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aString101 = arg1;
		this.aLong200 = arg5;
		this.anInt8288 = arg6;
		this.anInt8289 = arg4;
		this.aBoolean605 = arg8;
		this.aString102 = arg0;
		this.aBoolean607 = arg9;
		this.anInt8284 = arg7;
		this.anInt8287 = arg2;
		this.anInt8285 = arg3;
	}
}
