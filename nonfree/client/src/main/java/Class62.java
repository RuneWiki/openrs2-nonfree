import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class62 implements Interface25 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!hj;")
	private final Class146 aClass146_1;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Lclient!bga;")
	private final Class35 aClass35_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!bga;Lclient!hj;)V")
	public Class62(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class146 arg1) {
		this.aClass146_1 = arg1;
		this.aClass35_1 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return this.aClass35_1.method758();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;IILclient!da;IB)I")
	private int method1350(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3) {
		return arg2.method6008(0, 0, 0, 0, arg1 + 5, arg3 - -5, null, arg0, this.aClass146_1.anInt4002, this.aClass146_1.anInt4001 - 10, null, null, this.aClass146_1.anInt4000, 0, this.aClass146_1.anInt3999 - 10);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		@Pc(15) Class22 local15 = this.aClass35_1.method759(this.aClass146_1.anInt3995);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass146_1.aClass245_8.method5486(Static79.anInt1667, this.aClass146_1.anInt3999) + this.aClass146_1.anInt3996;
		@Pc(46) int local46 = this.aClass146_1.aClass183_5.method4291(this.aClass146_1.anInt4001, Static627.anInt10422) + this.aClass146_1.anInt3997;
		if (this.aClass146_1.aBoolean298) {
			Static213.aClass133_5.method7279(local31, local46, this.aClass146_1.anInt3999, this.aClass146_1.anInt4001, this.aClass146_1.anInt3994, 0);
		}
		local46 += this.method1350(local15.aString11, local46, Static16.aClass55_1, local31) * 12;
		local46 += 8;
		if (this.aClass146_1.aBoolean298) {
			Static213.aClass133_5.method7304(local31, local46, local31 + this.aClass146_1.anInt3999 - 1, local46, this.aClass146_1.anInt3994, 0);
		}
		local46++;
		local46 += this.method1350(local15.aString13, local46, Static16.aClass55_1, local31) * 12;
		local46 += 5;
		@Pc(129) int local129 = local46 + this.method1350(local15.aString12, local46, Static16.aClass55_1, local31) * 12;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
	}
}
