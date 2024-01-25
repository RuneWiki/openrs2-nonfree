import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class217 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "S")
	public short aShort74;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!uw;")
	public Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!uw;")
	public Class4_Sub2_Sub4 aClass4_Sub2_Sub4_2;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!fp;")
	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_1;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!mj;")
	public Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!mo;")
	public Class4_Sub2_Sub5 aClass4_Sub2_Sub5_1;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!qi;")
	public Class290 aClass290_2;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!lo;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Lclient!fp;")
	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
	public Class217(@OriginalArg(0) int arg0) {
		this.aByte80 = (byte) arg0;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public void method4875() {
		while (this.aClass290_2 != null) {
			@Pc(11) Class290 local11 = this.aClass290_2.aClass290_3;
			this.aClass290_2.method6826();
			this.aClass290_2 = local11;
		}
	}
}
