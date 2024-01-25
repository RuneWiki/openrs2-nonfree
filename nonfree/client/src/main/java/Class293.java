import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class293 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!hk;")
	public Class20_Sub2_Sub1 aClass20_Sub2_Sub1_1;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!hk;")
	public Class20_Sub2_Sub1 aClass20_Sub2_Sub1_2;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!lt;")
	public Class20_Sub2_Sub3 aClass20_Sub2_Sub3_1;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!ia;")
	public Class20_Sub2_Sub2 aClass20_Sub2_Sub2_1;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!ia;")
	public Class20_Sub2_Sub2 aClass20_Sub2_Sub2_2;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!qv;")
	public Class20_Sub2_Sub5 aClass20_Sub2_Sub5_1;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!se;")
	public Class293 aClass293_1;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!ri;")
	public Class285 aClass285_6;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
	public Class293(@OriginalArg(0) int arg0) {
		this.aByte100 = (byte) arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public void method6707() {
		while (this.aClass285_6 != null) {
			@Pc(17) Class285 local17 = this.aClass285_6.aClass285_5;
			this.aClass285_6.method6515();
			this.aClass285_6 = local17;
		}
	}
}
