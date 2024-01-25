import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class228 {

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!ms;")
	public Class228 aClass228_1;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Lclient!jp;")
	public Class180 aClass180_3;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!po;")
	public Class12_Sub2_Sub5 aClass12_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "Lclient!fg;")
	public Class12_Sub2_Sub4 aClass12_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!po;")
	public Class12_Sub2_Sub5 aClass12_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!kga;")
	public Class12_Sub2_Sub2 aClass12_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!kn;")
	public Class12_Sub2_Sub3 aClass12_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!fg;")
	public Class12_Sub2_Sub4 aClass12_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I)V")
	public Class228(@OriginalArg(0) int arg0) {
		this.aByte80 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public void method4921() {
		while (this.aClass180_3 != null) {
			@Pc(18) Class180 local18 = this.aClass180_3.aClass180_2;
			this.aClass180_3.method3654();
			this.aClass180_3 = local18;
		}
	}
}
