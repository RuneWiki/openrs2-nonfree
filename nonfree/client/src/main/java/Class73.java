import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class73 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Lclient!bga;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "Lclient!dq;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!et;")
	public Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!hba;")
	public Class144 aClass144_1;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!ab;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "Lclient!qja;")
	public Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "Lclient!bga;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_2;

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "Lclient!et;")
	public Class3_Sub1_Sub4 aClass3_Sub1_Sub4_2;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "B")
	public byte aByte20;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(I)V")
	public Class73(@OriginalArg(0) int arg0) {
		this.aByte20 = (byte) arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public void method2069() {
		while (this.aClass144_1 != null) {
			@Pc(16) Class144 local16 = this.aClass144_1.aClass144_2;
			this.aClass144_1.method3125();
			this.aClass144_1 = local16;
		}
	}
}
