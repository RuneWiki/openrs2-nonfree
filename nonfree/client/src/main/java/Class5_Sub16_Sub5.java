import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class5_Sub16_Sub5 extends Class5_Sub16 {

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!ef;")
	public final Class102 aClass102_72 = new Class102();

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Lclient!fk;")
	public final Class5_Sub16_Sub1 aClass5_Sub16_Sub1_2 = new Class5_Sub16_Sub1();

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!ot;")
	private final Class5_Sub16_Sub4 aClass5_Sub16_Sub4_7;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!ot;)V")
	public Class5_Sub16_Sub5(@OriginalArg(0) Class5_Sub16_Sub4 arg0) {
		this.aClass5_Sub16_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8735() {
		@Pc(11) Class5_Sub33 local11;
		do {
			local11 = (Class5_Sub33) this.aClass102_72.method1915();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass5_Sub16_Sub3_4 == null);
		return local11.aClass5_Sub16_Sub3_4;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "()I")
	@Override
	public int method8739() {
		return 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!lba;I[III)V")
	private void method8742(@OriginalArg(1) Class5_Sub33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass5_Sub16_Sub4_7.anIntArray437[arg0.anInt5901] & 0x4) != 0 && arg0.anInt5900 < 0) {
			@Pc(34) int local34 = this.aClass5_Sub16_Sub4_7.anIntArray445[arg0.anInt5901] / Static608.anInt10099;
			while (true) {
				@Pc(44) int local44 = (local34 + 1048575 - arg0.anInt5891) / local34;
				if (local44 > arg4) {
					arg0.anInt5891 += local34 * arg4;
					break;
				}
				arg0.aClass5_Sub16_Sub3_4.method8738(arg2, arg3, local44);
				arg0.anInt5891 += local44 * local34 - 1048576;
				arg3 += local44;
				arg4 -= local44;
				@Pc(79) int local79 = Static608.anInt10099 / 100;
				@Pc(83) int local83 = 262144 / local34;
				if (local79 > local83) {
					local79 = local83;
				}
				@Pc(95) Class5_Sub16_Sub3 local95 = arg0.aClass5_Sub16_Sub3_4;
				if (this.aClass5_Sub16_Sub4_7.anIntArray449[arg0.anInt5901] == 0) {
					arg0.aClass5_Sub16_Sub3_4 = Static688.method6163(arg0.aClass5_Sub24_Sub1_4, local95.method6149(), local95.method6135(), local95.method6153());
				} else {
					arg0.aClass5_Sub16_Sub3_4 = Static688.method6163(arg0.aClass5_Sub24_Sub1_4, local95.method6149(), 0, local95.method6153());
					this.aClass5_Sub16_Sub4_7.method6392(arg0, arg0.aClass5_Sub54_1.aShortArray157[arg0.anInt5894] < 0);
					arg0.aClass5_Sub16_Sub3_4.method6126(local79, local95.method6135());
				}
				if (arg0.aClass5_Sub54_1.aShortArray157[arg0.anInt5894] < 0) {
					arg0.aClass5_Sub16_Sub3_4.method6140(-1);
				}
				local95.method6150(local79);
				local95.method8738(arg2, arg3, arg1 - arg3);
				if (local95.method6147()) {
					this.aClass5_Sub16_Sub1_2.method2555(local95);
				}
			}
		}
		arg0.aClass5_Sub16_Sub3_4.method8738(arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([III)V")
	@Override
	public void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub16_Sub1_2.method8738(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub33 local17 = (Class5_Sub33) this.aClass102_72.method1916(); local17 != null; local17 = (Class5_Sub33) this.aClass102_72.method1915()) {
			if (!this.aClass5_Sub16_Sub4_7.method6399(local17)) {
				@Pc(29) int local29 = arg1;
				@Pc(31) int local31 = arg2;
				do {
					if (local31 <= local17.anInt5884) {
						this.method8742(local17, local29 + local31, arg0, local29, local31);
						local17.anInt5884 -= local31;
						break;
					}
					this.method8742(local17, local29 + local31, arg0, local29, local17.anInt5884);
					local31 -= local17.anInt5884;
					local29 += local17.anInt5884;
				} while (!this.aClass5_Sub16_Sub4_7.method6387(local29, arg0, local17, local31));
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!lba;I)V")
	private void method8744(@OriginalArg(1) Class5_Sub33 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass5_Sub16_Sub4_7.anIntArray437[arg0.anInt5901] & 0x4) != 0 && arg0.anInt5900 < 0) {
			@Pc(33) int local33 = this.aClass5_Sub16_Sub4_7.anIntArray445[arg0.anInt5901] / Static608.anInt10099;
			@Pc(42) int local42 = (local33 + 1048575 - arg0.anInt5891) / local33;
			arg0.anInt5891 = local33 * arg1 + arg0.anInt5891 & 0xFFFFF;
			if (arg1 >= local42) {
				if (this.aClass5_Sub16_Sub4_7.anIntArray449[arg0.anInt5901] == 0) {
					arg0.aClass5_Sub16_Sub3_4 = Static688.method6163(arg0.aClass5_Sub24_Sub1_4, arg0.aClass5_Sub16_Sub3_4.method6149(), arg0.aClass5_Sub16_Sub3_4.method6135(), arg0.aClass5_Sub16_Sub3_4.method6153());
				} else {
					arg0.aClass5_Sub16_Sub3_4 = Static688.method6163(arg0.aClass5_Sub24_Sub1_4, arg0.aClass5_Sub16_Sub3_4.method6149(), 0, arg0.aClass5_Sub16_Sub3_4.method6153());
					this.aClass5_Sub16_Sub4_7.method6392(arg0, arg0.aClass5_Sub54_1.aShortArray157[arg0.anInt5894] < 0);
				}
				if (arg0.aClass5_Sub54_1.aShortArray157[arg0.anInt5894] < 0) {
					arg0.aClass5_Sub16_Sub3_4.method6140(-1);
				}
				arg1 = arg0.anInt5891 / local33;
			}
		}
		arg0.aClass5_Sub16_Sub3_4.method8740(arg1);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8737() {
		@Pc(9) Class5_Sub33 local9 = (Class5_Sub33) this.aClass102_72.method1916();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub16_Sub3_4 == null) {
			return this.method8735();
		} else {
			return local9.aClass5_Sub16_Sub3_4;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method8740(@OriginalArg(0) int arg0) {
		this.aClass5_Sub16_Sub1_2.method8740(arg0);
		for (@Pc(15) Class5_Sub33 local15 = (Class5_Sub33) this.aClass102_72.method1916(); local15 != null; local15 = (Class5_Sub33) this.aClass102_72.method1915()) {
			if (!this.aClass5_Sub16_Sub4_7.method6399(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local15.anInt5884 >= local27) {
						this.method8744(local15, local27);
						local15.anInt5884 -= local27;
						break;
					}
					this.method8744(local15, local15.anInt5884);
					local27 -= local15.anInt5884;
				} while (!this.aClass5_Sub16_Sub4_7.method6387(0, (int[]) null, local15, local27));
			}
		}
	}
}
