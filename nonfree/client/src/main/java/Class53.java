import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class53 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "S")
	public short aShort13;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Lclient!cq;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "S")
	public short aShort14;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!dn;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!rh;")
	public Class1_Sub4_Sub5 aClass1_Sub4_Sub5_1;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!dn;")
	public Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "S")
	public short aShort15;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!lw;")
	public Class1_Sub4_Sub3 aClass1_Sub4_Sub3_1;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!rh;")
	public Class1_Sub4_Sub5 aClass1_Sub4_Sub5_2;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!rfa;")
	public Class289 aClass289_1;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Lclient!kj;")
	public Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		this.aByte13 = (byte) arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1211() {
		while (this.aClass289_1 != null) {
			@Pc(7) Class289 local7 = this.aClass289_1.aClass289_3;
			this.aClass289_1.method6964();
			this.aClass289_1 = local7;
		}
	}
}
