import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class353 implements Interface14 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "Lclient!ida;")
	private final Class148 aClass148_1;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!vf;")
	private final Class360 aClass360_2;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!vf;Lclient!ida;)V")
	public Class353(@OriginalArg(0) Class360 arg0, @OriginalArg(1) Class148 arg1) {
		this.aClass148_1 = arg1;
		this.aClass360_2 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		@Pc(11) Class100 local11 = this.aClass360_2.method8093(this.aClass148_1.anInt3763);
		if (local11 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass148_1.aClass361_6.method8101(Static66.anInt10099, this.aClass148_1.anInt3759) + this.aClass148_1.anInt3766;
		@Pc(49) int local49 = this.aClass148_1.aClass306_8.method6899(this.aClass148_1.anInt3765, Static364.anInt5763) + this.aClass148_1.anInt3767;
		if (this.aClass148_1.aBoolean266) {
			Static192.aClass95_4.method6997(local35, local49, this.aClass148_1.anInt3759, this.aClass148_1.anInt3765, this.aClass148_1.anInt3760, 0);
		}
		local49 += this.method8002(local49, Static194.aClass62_22, local35, local11.aString25) * 12;
		local49 += 8;
		if (this.aClass148_1.aBoolean266) {
			Static192.aClass95_4.method6937(local35, local49, local35 + this.aClass148_1.anInt3759 - 1, local49, this.aClass148_1.anInt3760, 0);
		}
		local49++;
		local49 += this.method8002(local49, Static194.aClass62_22, local35, local11.aString23) * 12;
		local49 += 5;
		@Pc(131) int local131 = local49 + this.method8002(local49, Static194.aClass62_22, local35, local11.aString24) * 12;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!da;IILjava/lang/String;I)I")
	private int method8002(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		return arg1.method5680(null, 0, arg2 + 5, 0, this.aClass148_1.anInt3764, 0, this.aClass148_1.anInt3761, null, 0, arg3, arg0 + 5, 0, null, this.aClass148_1.anInt3759 - 10, this.aClass148_1.anInt3765 - 10);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		return this.aClass360_2.method8096();
	}
}
