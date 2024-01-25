import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class307 implements Interface20 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!ge;")
	private final Class126 aClass126_1;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!pb;")
	private final Class252 aClass252_2;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!pb;Lclient!ge;)V")
	public Class307(@OriginalArg(0) Class252 arg0, @OriginalArg(1) Class126 arg1) {
		this.aClass126_1 = arg1;
		this.aClass252_2 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		@Pc(11) Class213 local11 = this.aClass252_2.method6397(this.aClass126_1.anInt3873);
		if (local11 == null) {
			return;
		}
		@Pc(27) int local27 = this.aClass126_1.aClass174_6.method4260(Static386.anInt6961, this.aClass126_1.anInt3874) + this.aClass126_1.anInt3871;
		@Pc(42) int local42 = this.aClass126_1.aClass176_6.method4289(this.aClass126_1.anInt3878, Static135.anInt3053) + this.aClass126_1.anInt3882;
		if (this.aClass126_1.aBoolean329) {
			Static600.aClass87_15.method7954(local27, local42, this.aClass126_1.anInt3874, this.aClass126_1.anInt3878, this.aClass126_1.anInt3875, 0);
		}
		local42 += this.method7293(local11.aString60, local42, Static4.aClass64_1, local27) * 12;
		local42 += 8;
		if (this.aClass126_1.aBoolean329) {
			Static600.aClass87_15.method7906(local27, local42, this.aClass126_1.anInt3874 + local27 - 1, local42, this.aClass126_1.anInt3875, 0);
		}
		local42++;
		local42 += this.method7293(local11.aString61, local42, Static4.aClass64_1, local27) * 12;
		local42 += 5;
		@Pc(124) int local124 = local42 + this.method7293(local11.aString59, local42, Static4.aClass64_1, local27) * 12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILclient!da;III)I")
	private int method7293(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(4) int arg3) {
		return arg2.method7490(0, 0, arg3 + 5, null, arg1 + 5, this.aClass126_1.anInt3878 + -10, null, this.aClass126_1.anInt3885, this.aClass126_1.anInt3874 - 10, this.aClass126_1.anInt3879, arg0, 0, 0, 0, null);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		return this.aClass252_2.method6399();
	}
}
