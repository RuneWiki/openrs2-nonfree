import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class174 {

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "S")
	public short aShort50;

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "Lclient!qa;")
	public Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "Lclient!qj;")
	public Class8_Sub1_Sub2 aClass8_Sub1_Sub2_1;

	@OriginalMember(owner = "client!iia", name = "h", descriptor = "Lclient!dr;")
	public Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "Lclient!qa;")
	public Class8_Sub1_Sub4 aClass8_Sub1_Sub4_2;

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "S")
	public short aShort51;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "Lclient!pb;")
	public Class273 aClass273_67;

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "S")
	public short aShort52;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "S")
	public short aShort53;

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "Lclient!iia;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "Lclient!mia;")
	public Class8_Sub1_Sub5 aClass8_Sub1_Sub5_1;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "Lclient!qj;")
	public Class8_Sub1_Sub2 aClass8_Sub1_Sub2_2;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I)V")
	public Class174(@OriginalArg(0) int arg0) {
		this.aByte65 = (byte) arg0;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method3709() {
		while (this.aClass273_67 != null) {
			@Pc(7) Class273 local7 = this.aClass273_67.aClass273_114;
			this.aClass273_67.method6495();
			this.aClass273_67 = local7;
		}
	}
}
