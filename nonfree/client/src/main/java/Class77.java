import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class77 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Lclient!hf;")
	public Class4_Sub1_Sub5 aClass4_Sub1_Sub5_1;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Lclient!um;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!gm;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!nf;")
	public Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!um;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_2;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!nf;")
	public Class4_Sub1_Sub3 aClass4_Sub1_Sub3_2;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!aca;")
	public Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!dn;")
	public Class77 aClass77_1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "B")
	public byte aByte23;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.aByte23 = (byte) arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method2169() {
		while (this.aClass128_1 != null) {
			@Pc(7) Class128 local7 = this.aClass128_1.aClass128_2;
			this.aClass128_1.method3217();
			this.aClass128_1 = local7;
		}
	}
}
