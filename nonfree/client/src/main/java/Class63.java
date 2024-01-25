import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class63 {

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!pc;")
	public Class9_Sub1_Sub4 aClass9_Sub1_Sub4_1;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!df;")
	public Class63 aClass63_1;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!pc;")
	public Class9_Sub1_Sub4 aClass9_Sub1_Sub4_2;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!tea;")
	public Class9_Sub1_Sub3 aClass9_Sub1_Sub3_1;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!ps;")
	public Class9_Sub1_Sub5 aClass9_Sub1_Sub5_1;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!ar;")
	public Class16 aClass16_3;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!eq;")
	public Class9_Sub1_Sub2 aClass9_Sub1_Sub2_1;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!df", name = "v", descriptor = "Lclient!eq;")
	public Class9_Sub1_Sub2 aClass9_Sub1_Sub2_2;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.aByte37 = (byte) arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public void method1970() {
		while (this.aClass16_3 != null) {
			@Pc(7) Class16 local7 = this.aClass16_3.aClass16_1;
			this.aClass16_3.method446();
			this.aClass16_3 = local7;
		}
	}
}
