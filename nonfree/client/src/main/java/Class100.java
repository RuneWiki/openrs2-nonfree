import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class100 {

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!un;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!oga;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!es;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!aba;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "Lclient!qfa;")
	public Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "Lclient!qfa;")
	public Class3_Sub1_Sub5 aClass3_Sub1_Sub5_2;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "Lclient!un;")
	public Class3_Sub1_Sub2 aClass3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "Lclient!fha;")
	public Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!es", name = "r", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "B")
	public byte aByte41;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.aByte41 = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public void method3073() {
		while (this.aClass243_1 != null) {
			@Pc(7) Class243 local7 = this.aClass243_1.aClass243_3;
			this.aClass243_1.method6494();
			this.aClass243_1 = local7;
		}
	}
}
