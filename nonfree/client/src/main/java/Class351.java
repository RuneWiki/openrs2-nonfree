import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class351 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!bq;")
	public Class2_Sub1_Sub3 aClass2_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!jg;")
	public Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!jg;")
	public Class2_Sub1_Sub4 aClass2_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!kka;")
	public Class2_Sub1_Sub5 aClass2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!wc;")
	public Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Lclient!wc;")
	public Class2_Sub1_Sub2 aClass2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Lclient!ug;")
	public Class351 aClass351_1;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!dja;")
	public Class67 aClass67_3;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "B")
	public byte aByte139;

	static {
		new Class357("", 76);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class351(@OriginalArg(0) int arg0) {
		this.aByte139 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public void method8271() {
		while (this.aClass67_3 != null) {
			@Pc(11) Class67 local11 = this.aClass67_3.aClass67_1;
			this.aClass67_3.method1723();
			this.aClass67_3 = local11;
		}
	}
}
