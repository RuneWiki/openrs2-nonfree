import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class291 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!mb;")
	public Class15_Sub3_Sub1 aClass15_Sub3_Sub1_1;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!q;")
	public Class291 aClass291_1;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!ww;")
	public Class15_Sub3_Sub4 aClass15_Sub3_Sub4_1;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!bc;")
	public Class27 aClass27_3;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!ne;")
	public Class15_Sub3_Sub5 aClass15_Sub3_Sub5_1;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!mb;")
	public Class15_Sub3_Sub1 aClass15_Sub3_Sub1_2;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!ww;")
	public Class15_Sub3_Sub4 aClass15_Sub3_Sub4_2;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!dc;")
	public Class15_Sub3_Sub2 aClass15_Sub3_Sub2_1;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "B")
	public byte aByte112;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.aByte112 = (byte) arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method7528() {
		while (this.aClass27_3 != null) {
			@Pc(7) Class27 local7 = this.aClass27_3.aClass27_1;
			this.aClass27_3.method628();
			this.aClass27_3 = local7;
		}
	}
}
