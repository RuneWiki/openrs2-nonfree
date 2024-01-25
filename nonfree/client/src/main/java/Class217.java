import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class217 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!mf;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!wr;")
	public Class11_Sub1_Sub2 aClass11_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!wr;")
	public Class11_Sub1_Sub2 aClass11_Sub1_Sub2_2;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!qn;")
	public Class11_Sub1_Sub5 aClass11_Sub1_Sub5_1;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!cu;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!rc;")
	public Class11_Sub1_Sub3 aClass11_Sub1_Sub3_1;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!ht;")
	public Class11_Sub1_Sub4 aClass11_Sub1_Sub4_1;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!rc;")
	public Class11_Sub1_Sub3 aClass11_Sub1_Sub3_2;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "B")
	public byte aByte91;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	public Class217(@OriginalArg(0) int arg0) {
		this.aByte91 = (byte) arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method5396() {
		while (this.aClass61_2 != null) {
			@Pc(14) Class61 local14 = this.aClass61_2.aClass61_1;
			this.aClass61_2.method1456();
			this.aClass61_2 = local14;
		}
	}
}
