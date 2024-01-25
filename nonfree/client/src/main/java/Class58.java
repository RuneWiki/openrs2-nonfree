import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class58 {

	@OriginalMember(owner = "client!cja", name = "f", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!cja", name = "h", descriptor = "Lclient!fj;")
	public Class12_Sub2_Sub3 aClass12_Sub2_Sub3_1;

	@OriginalMember(owner = "client!cja", name = "i", descriptor = "Lclient!eba;")
	public Class12_Sub2_Sub1 aClass12_Sub2_Sub1_1;

	@OriginalMember(owner = "client!cja", name = "j", descriptor = "Lclient!cja;")
	public Class58 aClass58_1;

	@OriginalMember(owner = "client!cja", name = "k", descriptor = "S")
	public short aShort22;

	@OriginalMember(owner = "client!cja", name = "m", descriptor = "Lclient!bt;")
	public Class43 aClass43_4;

	@OriginalMember(owner = "client!cja", name = "n", descriptor = "Lclient!fha;")
	public Class12_Sub2_Sub4 aClass12_Sub2_Sub4_1;

	@OriginalMember(owner = "client!cja", name = "o", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!cja", name = "p", descriptor = "Lclient!eba;")
	public Class12_Sub2_Sub1 aClass12_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "Lclient!nu;")
	public Class12_Sub2_Sub5 aClass12_Sub2_Sub5_1;

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "Lclient!fj;")
	public Class12_Sub2_Sub3 aClass12_Sub2_Sub3_2;

	@OriginalMember(owner = "client!cja", name = "t", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!cja", name = "l", descriptor = "B")
	public byte aByte39;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.aByte39 = (byte) arg0;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
	public void method1425() {
		while (this.aClass43_4 != null) {
			@Pc(16) Class43 local16 = this.aClass43_4.aClass43_3;
			this.aClass43_4.method1190();
			this.aClass43_4 = local16;
		}
	}
}
