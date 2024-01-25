import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class128 {

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Lclient!mha;")
	public Class4_Sub1_Sub5 aClass4_Sub1_Sub5_1;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!qea;")
	public Class299 aClass299_2;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "S")
	public short aShort39;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!mha;")
	public Class4_Sub1_Sub5 aClass4_Sub1_Sub5_2;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "S")
	public short aShort40;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "S")
	public short aShort41;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!lda;")
	public Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!pba;")
	public Class4_Sub1_Sub2 aClass4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!lv;")
	public Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Lclient!gf;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "S")
	public short aShort42;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!pba;")
	public Class4_Sub1_Sub2 aClass4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "B")
	public byte aByte40;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class128(@OriginalArg(0) int arg0) {
		this.aByte40 = (byte) arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public void method3124() {
		while (this.aClass299_2 != null) {
			@Pc(7) Class299 local7 = this.aClass299_2.aClass299_3;
			this.aClass299_2.method6761();
			this.aClass299_2 = local7;
		}
	}
}
