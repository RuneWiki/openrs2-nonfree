import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "Z")
	public final boolean aBoolean607;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
	public final int anInt7397;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "Z")
	public final boolean aBoolean606;

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
	public final int anInt7400;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	public final int anInt7399;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "J")
	public final long aLong225;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
	public final int anInt7396;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
	public int anInt7398;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class1_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.aBoolean607 = arg8;
		this.anInt7397 = arg6;
		this.aString70 = arg0;
		this.aBoolean606 = arg9;
		this.anInt7400 = arg7;
		this.anInt7399 = arg2;
		this.aLong225 = arg5;
		this.anInt7396 = arg4;
		this.aString69 = arg1;
		this.anInt7398 = arg3;
	}
}
