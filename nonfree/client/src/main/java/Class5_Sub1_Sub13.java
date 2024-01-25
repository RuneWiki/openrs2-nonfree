import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "Z")
	public final boolean aBoolean412;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
	public int anInt6068;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Z")
	public final boolean aBoolean413;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
	public final int anInt6065;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
	public final int anInt6069;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "J")
	public final long aLong176;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public final int anInt6067;

	@OriginalMember(owner = "client!mk", name = "O", descriptor = "J")
	public final long aLong177;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
	public final int anInt6066;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Z")
	public final boolean aBoolean414;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class5_Sub1_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aBoolean412 = arg9;
		this.anInt6068 = arg3;
		this.aBoolean413 = arg11;
		this.anInt6065 = arg2;
		this.anInt6069 = arg7;
		this.aLong176 = arg5;
		this.anInt6067 = arg4;
		this.aLong177 = arg10;
		this.aString75 = arg0;
		this.anInt6066 = arg6;
		this.aString74 = arg1;
		this.aBoolean414 = arg8;
	}
}
