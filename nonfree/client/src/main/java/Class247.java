import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class247 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Lclient!tc;")
	public Class23_Sub2_Sub5 aClass23_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!tc;")
	public Class23_Sub2_Sub5 aClass23_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!va;")
	public Class23_Sub2_Sub2 aClass23_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!ni;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!dm;")
	public Class85 aClass85_3;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!va;")
	public Class23_Sub2_Sub2 aClass23_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!lg;")
	public Class23_Sub2_Sub3 aClass23_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!rq;")
	public Class23_Sub2_Sub4 aClass23_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V")
	public Class247(@OriginalArg(0) int arg0) {
		this.aByte94 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public void method5703() {
		while (this.aClass85_3 != null) {
			@Pc(7) Class85 local7 = this.aClass85_3.aClass85_1;
			this.aClass85_3.method2102();
			this.aClass85_3 = local7;
		}
	}
}
