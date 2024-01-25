import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class308 implements Interface21 {

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "Lclient!kv;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!hu;")
	private final Class141 aClass141_1;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!kv;Lclient!hu;)V")
	public Class308(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class141 arg1) {
		this.aClass178_1 = arg0;
		this.aClass141_1 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		@Pc(11) Class272 local11 = this.aClass178_1.method5143(this.aClass141_1.anInt4358);
		if (local11 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass141_1.aClass238_6.method6456(Static507.anInt8741, this.aClass141_1.anInt4356) + this.aClass141_1.anInt4355;
		@Pc(48) int local48 = this.aClass141_1.aClass79_9.method2054(this.aClass141_1.anInt4357, Static106.anInt2101) + this.aClass141_1.anInt4360;
		if (this.aClass141_1.aBoolean309) {
			Static162.aClass100_7.method8845(local33, local48, this.aClass141_1.anInt4356, this.aClass141_1.anInt4357, this.aClass141_1.anInt4354, 0);
		}
		local48 += this.method7818(Static173.aClass50_5, local48, local11.aString94, local33) * 12;
		local48 += 8;
		if (this.aClass141_1.aBoolean309) {
			Static162.aClass100_7.method8781(local33, local48, local33 + this.aClass141_1.anInt4356 - 1, local48, this.aClass141_1.anInt4354, 0);
		}
		local48++;
		local48 += this.method7818(Static173.aClass50_5, local48, local11.aString93, local33) * 12;
		local48 += 5;
		@Pc(135) int local135 = local48 + this.method7818(Static173.aClass50_5, local48, local11.aString95, local33) * 12;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!da;ILjava/lang/String;II)I")
	private int method7818(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		return arg0.method5742(0, (int[]) null, arg1 + 5, this.aClass141_1.anInt4353, 0, (Class1) null, 0, arg2, 0, 0, this.aClass141_1.anInt4357 - 10, this.aClass141_1.anInt4356 + -10, arg3 + 5, this.aClass141_1.anInt4361, (Class32[]) null);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return this.aClass178_1.method5144();
	}
}
