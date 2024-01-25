import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class364 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!cja;")
	public Class9_Sub1_Sub2 aClass9_Sub1_Sub2_1;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!tv;")
	public Class9_Sub1_Sub4 aClass9_Sub1_Sub4_1;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!oaa;")
	public Class9_Sub1_Sub5 aClass9_Sub1_Sub5_1;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!vr;")
	public Class9_Sub1_Sub3 aClass9_Sub1_Sub3_1;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Lclient!tr;")
	public Class364 aClass364_1;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "Lclient!ija;")
	public Class181 aClass181_3;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Lclient!cja;")
	public Class9_Sub1_Sub2 aClass9_Sub1_Sub2_2;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Lclient!vr;")
	public Class9_Sub1_Sub3 aClass9_Sub1_Sub3_2;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "B")
	public byte aByte135;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I)V")
	public Class364(@OriginalArg(0) int arg0) {
		this.aByte135 = (byte) arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method8325() {
		while (this.aClass181_3 != null) {
			@Pc(7) Class181 local7 = this.aClass181_3.aClass181_2;
			this.aClass181_3.method3952();
			this.aClass181_3 = local7;
		}
	}
}
