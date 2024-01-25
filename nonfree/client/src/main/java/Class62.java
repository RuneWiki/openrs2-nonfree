import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class62 implements Interface24 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!pf;")
	public final Class275 aClass275_8;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Z")
	public final boolean aBoolean83;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	public final int anInt1106;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	public final int anInt1110;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public final int anInt1108;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!dg;")
	public final Class81 aClass81_8;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	public final int anInt1104;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public final int anInt1107;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public final int anInt1102;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public final int anInt1101;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public final int anInt1105;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(ILclient!pf;Lclient!dg;IIIIIIIZ)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass275_8 = arg1;
		this.aBoolean83 = arg10;
		this.anInt1106 = arg9;
		this.anInt1110 = arg4;
		this.anInt1108 = arg7;
		this.aClass81_8 = arg2;
		this.anInt1104 = arg3;
		this.anInt1107 = arg6;
		this.anInt1102 = arg5;
		this.anInt1101 = arg8;
		this.anInt1105 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static149.aClass139_3;
	}
}
