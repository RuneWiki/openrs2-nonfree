import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class299 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!bo;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "Lclient!iba;")
	public Class41_Sub2_Sub4 aClass41_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "Lclient!hfa;")
	public Class41_Sub2_Sub3 aClass41_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!hfa;")
	public Class41_Sub2_Sub3 aClass41_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "Lclient!ru;")
	public Class299 aClass299_1;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Lclient!tq;")
	public Class41_Sub2_Sub2 aClass41_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "Lclient!tn;")
	public Class41_Sub2_Sub5 aClass41_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "Lclient!tq;")
	public Class41_Sub2_Sub2 aClass41_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(I)V")
	public Class299(@OriginalArg(0) int arg0) {
		this.aByte101 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	public void method6506() {
		while (this.aClass38_2 != null) {
			@Pc(17) Class38 local17 = this.aClass38_2.aClass38_1;
			this.aClass38_2.method758();
			this.aClass38_2 = local17;
		}
	}
}
