import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class351 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!lj;")
	public Class9_Sub2_Sub2 aClass9_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!ki;")
	public Class9_Sub2_Sub5 aClass9_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!pn;")
	public Class9_Sub2_Sub3 aClass9_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!uda;")
	public Class9_Sub2_Sub4 aClass9_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!pn;")
	public Class9_Sub2_Sub3 aClass9_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!fe;")
	public Class105 aClass105_3;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!ve;")
	public Class351 aClass351_1;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ki;")
	public Class9_Sub2_Sub5 aClass9_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "B")
	public byte aByte118;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class351(@OriginalArg(0) int arg0) {
		this.aByte118 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method8235() {
		while (this.aClass105_3 != null) {
			@Pc(16) Class105 local16 = this.aClass105_3.aClass105_1;
			this.aClass105_3.method2553();
			this.aClass105_3 = local16;
		}
	}
}
