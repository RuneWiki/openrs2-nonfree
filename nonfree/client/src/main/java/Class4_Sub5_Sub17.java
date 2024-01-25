import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class4_Sub5_Sub17 extends Class4_Sub5 {

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "Ljava/lang/String;")
	public String aString98;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
	public int anInt7673;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Z")
	public final boolean aBoolean600;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
	public final int anInt7672;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
	public final int anInt7675;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "J")
	public final long aLong225;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "J")
	public final long aLong226;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Z")
	public final boolean aBoolean599;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	public final int anInt7674;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
	public final int anInt7676;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "Z")
	public final boolean aBoolean601;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString96;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class4_Sub5_Sub17(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.anInt7673 = arg3;
		this.aString97 = arg1;
		this.aBoolean600 = arg11;
		this.anInt7672 = arg2;
		this.anInt7675 = arg4;
		this.aLong225 = arg10;
		this.aLong226 = arg5;
		this.aBoolean599 = arg8;
		this.anInt7674 = arg6;
		this.anInt7676 = arg7;
		this.aBoolean601 = arg9;
		this.aString96 = arg0;
	}
}
