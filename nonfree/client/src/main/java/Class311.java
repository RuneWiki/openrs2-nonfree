import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class311 {

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!gma;")
	public Class142 aClass142_2;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!ss;")
	public Class4_Sub2_Sub5 aClass4_Sub2_Sub5_1;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!qj;")
	public Class311 aClass311_1;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!eg;")
	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_1;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!qka;")
	public Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!eg;")
	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!uca;")
	public Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!uca;")
	public Class4_Sub2_Sub4 aClass4_Sub2_Sub4_2;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "B")
	public byte aByte118;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
	public Class311(@OriginalArg(0) int arg0) {
		this.aByte118 = (byte) arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public void method7355() {
		while (this.aClass142_2 != null) {
			@Pc(7) Class142 local7 = this.aClass142_2.aClass142_1;
			this.aClass142_2.method2996();
			this.aClass142_2 = local7;
		}
	}
}
