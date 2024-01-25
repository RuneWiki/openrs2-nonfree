import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class106 {

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!td;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!fu;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "Lclient!pda;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "Lclient!maa;")
	public Class2_Sub3_Sub4 aClass2_Sub3_Sub4_1;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Lclient!vl;")
	public Class2_Sub3_Sub5 aClass2_Sub3_Sub5_1;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "Lclient!of;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "Lclient!pda;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_2;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "S")
	public short aShort37;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "Lclient!td;")
	public Class2_Sub3_Sub2 aClass2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
	public Class106(@OriginalArg(0) int arg0) {
		this.aByte46 = (byte) arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public void method3466() {
		while (this.aClass243_1 != null) {
			@Pc(11) Class243 local11 = this.aClass243_1.aClass243_3;
			this.aClass243_1.method6372();
			this.aClass243_1 = local11;
		}
	}
}
