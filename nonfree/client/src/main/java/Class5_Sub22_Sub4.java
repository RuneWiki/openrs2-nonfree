import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class5_Sub22_Sub4 extends Class5_Sub22 {

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "Lclient!nv;")
	public final Class177 aClass177_50 = new Class177();

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!nw;")
	public final Class5_Sub22_Sub3 aClass5_Sub22_Sub3_4 = new Class5_Sub22_Sub3();

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!jq;")
	private final Class5_Sub22_Sub1 aClass5_Sub22_Sub1_3;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!jq;)V")
	public Class5_Sub22_Sub4(@OriginalArg(0) Class5_Sub22_Sub1 arg0) {
		this.aClass5_Sub22_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5928() {
		@Pc(9) Class5_Sub23 local9;
		do {
			local9 = (Class5_Sub23) this.aClass177_50.method3619();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub22_Sub2_2 == null);
		return local9.aClass5_Sub22_Sub2_2;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()Lclient!ms;")
	@Override
	public Class5_Sub22 method5929() {
		@Pc(9) Class5_Sub23 local9 = (Class5_Sub23) this.aClass177_50.method3618();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub22_Sub2_2 == null) {
			return this.method5928();
		} else {
			return local9.aClass5_Sub22_Sub2_2;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()I")
	@Override
	public int method5931() {
		return 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!js;)V")
	private void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if ((this.aClass5_Sub22_Sub1_3.anIntArray198[arg1.anInt3420] & 0x4) != 0 && arg1.anInt3424 < 0) {
			@Pc(23) int local23 = this.aClass5_Sub22_Sub1_3.anIntArray200[arg1.anInt3420] / Static193.anInt3215;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt3435) / local23;
			arg1.anInt3435 = local23 * arg0 + arg1.anInt3435 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass5_Sub22_Sub1_3.anIntArray196[arg1.anInt3420] == 0) {
					arg1.aClass5_Sub22_Sub2_2 = Static467.method3135(arg1.aClass5_Sub5_Sub1_2, arg1.aClass5_Sub22_Sub2_2.method3114(), arg1.aClass5_Sub22_Sub2_2.method3119(), arg1.aClass5_Sub22_Sub2_2.method3118());
				} else {
					arg1.aClass5_Sub22_Sub2_2 = Static467.method3135(arg1.aClass5_Sub5_Sub1_2, arg1.aClass5_Sub22_Sub2_2.method3114(), 0, arg1.aClass5_Sub22_Sub2_2.method3118());
					this.aClass5_Sub22_Sub1_3.method2732(arg1.aClass5_Sub42_1.aShortArray111[arg1.anInt3425] < 0, arg1);
				}
				if (arg1.aClass5_Sub42_1.aShortArray111[arg1.anInt3425] < 0) {
					arg1.aClass5_Sub22_Sub2_2.method3128(-1);
				}
				arg0 = arg1.anInt3435 / local23;
			}
		}
		arg1.aClass5_Sub22_Sub2_2.method5930(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "([III)V")
	@Override
	public void method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub22_Sub3_4.method5934(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub23 local17 = (Class5_Sub23) this.aClass177_50.method3618(); local17 != null; local17 = (Class5_Sub23) this.aClass177_50.method3619()) {
			if (!this.aClass5_Sub22_Sub1_3.method2727(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt3431) {
						this.method5938(arg0, local27, local17, local29, local29 + local27);
						local17.anInt3431 -= local27;
						break;
					}
					this.method5938(arg0, local17.anInt3431, local17, local29, local29 + local27);
					local29 += local17.anInt3431;
					local27 -= local17.anInt3431;
				} while (!this.aClass5_Sub22_Sub1_3.method2746(arg0, local29, local17, local27));
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method5930(@OriginalArg(0) int arg0) {
		this.aClass5_Sub22_Sub3_4.method5930(arg0);
		for (@Pc(15) Class5_Sub23 local15 = (Class5_Sub23) this.aClass177_50.method3618(); local15 != null; local15 = (Class5_Sub23) this.aClass177_50.method3619()) {
			if (!this.aClass5_Sub22_Sub1_3.method2727(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3431 >= local25) {
						this.method5937(local25, local15);
						local15.anInt3431 -= local25;
						break;
					}
					this.method5937(local15.anInt3431, local15);
					local25 -= local15.anInt3431;
				} while (!this.aClass5_Sub22_Sub1_3.method2746(null, 0, local15, local25));
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIZLclient!js;II)V")
	private void method5938(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub22_Sub1_3.anIntArray198[arg2.anInt3420] & 0x4) != 0 && arg2.anInt3424 < 0) {
			@Pc(29) int local29 = this.aClass5_Sub22_Sub1_3.anIntArray200[arg2.anInt3420] / Static193.anInt3215;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg2.anInt3435) / local29;
				if (local39 > arg1) {
					arg2.anInt3435 += local29 * arg1;
					break;
				}
				arg2.aClass5_Sub22_Sub2_2.method5934(arg0, arg3, local39);
				arg3 += local39;
				arg1 -= local39;
				arg2.anInt3435 += local39 * local29 - 1048576;
				@Pc(74) int local74 = Static193.anInt3215 / 100;
				@Pc(78) int local78 = 262144 / local29;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(90) Class5_Sub22_Sub2 local90 = arg2.aClass5_Sub22_Sub2_2;
				if (this.aClass5_Sub22_Sub1_3.anIntArray196[arg2.anInt3420] == 0) {
					arg2.aClass5_Sub22_Sub2_2 = Static467.method3135(arg2.aClass5_Sub5_Sub1_2, local90.method3114(), local90.method3119(), local90.method3118());
				} else {
					arg2.aClass5_Sub22_Sub2_2 = Static467.method3135(arg2.aClass5_Sub5_Sub1_2, local90.method3114(), 0, local90.method3118());
					this.aClass5_Sub22_Sub1_3.method2732(arg2.aClass5_Sub42_1.aShortArray111[arg2.anInt3425] < 0, arg2);
					arg2.aClass5_Sub22_Sub2_2.method3126(local74, local90.method3119());
				}
				if (arg2.aClass5_Sub42_1.aShortArray111[arg2.anInt3425] < 0) {
					arg2.aClass5_Sub22_Sub2_2.method3128(-1);
				}
				local90.method3100(local74);
				local90.method5934(arg0, arg3, arg4 - arg3);
				if (local90.method3108()) {
					this.aClass5_Sub22_Sub3_4.method3641(local90);
				}
			}
		}
		arg2.aClass5_Sub22_Sub2_2.method5934(arg0, arg3, arg1);
	}
}
