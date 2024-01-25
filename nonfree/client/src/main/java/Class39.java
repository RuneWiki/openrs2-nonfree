import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class39 {

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Lclient!kg;")
	public Class8_Sub3_Sub4 aClass8_Sub3_Sub4_1;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!fea;")
	public Class8_Sub3_Sub2 aClass8_Sub3_Sub2_1;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "Lclient!sw;")
	public Class8_Sub3_Sub1 aClass8_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!sj;")
	public Class8_Sub3_Sub5 aClass8_Sub3_Sub5_1;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!fea;")
	public Class8_Sub3_Sub2 aClass8_Sub3_Sub2_2;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "S")
	public short aShort5;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "Lclient!bt;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "Lclient!kg;")
	public Class8_Sub3_Sub4 aClass8_Sub3_Sub4_2;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!fv;")
	public Class111 aClass111_1;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "B")
	public byte aByte21;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V")
	public Class39(@OriginalArg(0) int arg0) {
		this.aByte21 = (byte) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method715() {
		while (this.aClass111_1 != null) {
			@Pc(16) Class111 local16 = this.aClass111_1.aClass111_2;
			this.aClass111_1.method2191();
			this.aClass111_1 = local16;
		}
	}
}
