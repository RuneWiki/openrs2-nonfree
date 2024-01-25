import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class360 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!jb;")
	public Class11_Sub1_Sub4 aClass11_Sub1_Sub4_1;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!cu;")
	public Class11_Sub1_Sub3 aClass11_Sub1_Sub3_1;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!cu;")
	public Class11_Sub1_Sub3 aClass11_Sub1_Sub3_2;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!cba;")
	public Class11_Sub1_Sub2 aClass11_Sub1_Sub2_1;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Lclient!ml;")
	public Class11_Sub1_Sub5 aClass11_Sub1_Sub5_1;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!ml;")
	public Class11_Sub1_Sub5 aClass11_Sub1_Sub5_2;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!wg;")
	public Class360 aClass360_1;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!bda;")
	public Class21 aClass21_4;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
	public Class360(@OriginalArg(0) int arg0) {
		this.aByte129 = (byte) arg0;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public void method7790() {
		while (this.aClass21_4 != null) {
			@Pc(11) Class21 local11 = this.aClass21_4.aClass21_1;
			this.aClass21_4.method639();
			this.aClass21_4 = local11;
		}
	}
}
