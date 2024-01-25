import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class97 {

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lclient!lr;")
	public Class196 aClass196_2;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lclient!ica;")
	public Class20_Sub2_Sub3 aClass20_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "S")
	public short aShort41;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lclient!ma;")
	public Class20_Sub2_Sub1 aClass20_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "Lclient!ica;")
	public Class20_Sub2_Sub3 aClass20_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "S")
	public short aShort42;

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "S")
	public short aShort43;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "S")
	public short aShort44;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lclient!ma;")
	public Class20_Sub2_Sub1 aClass20_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lclient!ffa;")
	public Class97 aClass97_1;

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "Lclient!ng;")
	public Class20_Sub2_Sub5 aClass20_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "Lclient!iq;")
	public Class20_Sub2_Sub4 aClass20_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.aByte52 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	public void method2391() {
		while (this.aClass196_2 != null) {
			@Pc(7) Class196 local7 = this.aClass196_2.aClass196_3;
			this.aClass196_2.method5408();
			this.aClass196_2 = local7;
		}
	}
}
