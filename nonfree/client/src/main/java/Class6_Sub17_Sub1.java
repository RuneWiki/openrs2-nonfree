import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class6_Sub17_Sub1 extends Class6_Sub17 {

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Lclient!tf;")
	public final Class340 aClass340_21 = new Class340();

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "Lclient!jf;")
	public final Class6_Sub17_Sub3 aClass6_Sub17_Sub3_1 = new Class6_Sub17_Sub3();

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!ng;")
	private final Class6_Sub17_Sub4 aClass6_Sub17_Sub4_1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class6_Sub17_Sub1(@OriginalArg(0) Class6_Sub17_Sub4 arg0) {
		this.aClass6_Sub17_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8140() {
		@Pc(9) Class6_Sub49 local9 = (Class6_Sub49) this.aClass340_21.method8124();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub17_Sub2_4 == null) {
			return this.method8143();
		} else {
			return local9.aClass6_Sub17_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()I")
	@Override
	public int method8141() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public void method8144(@OriginalArg(0) int arg0) {
		this.aClass6_Sub17_Sub3_1.method8144(arg0);
		for (@Pc(15) Class6_Sub49 local15 = (Class6_Sub49) this.aClass340_21.method8124(); local15 != null; local15 = (Class6_Sub49) this.aClass340_21.method8134()) {
			if (!this.aClass6_Sub17_Sub4_1.method6076(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local27 <= local15.anInt9362) {
						this.method2589(local15, local27);
						local15.anInt9362 -= local27;
						break;
					}
					this.method2589(local15, local15.anInt9362);
					local27 -= local15.anInt9362;
				} while (!this.aClass6_Sub17_Sub4_1.method6091((int[]) null, local27, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V")
	@Override
	public void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub17_Sub3_1.method8139(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub49 local17 = (Class6_Sub49) this.aClass340_21.method8124(); local17 != null; local17 = (Class6_Sub49) this.aClass340_21.method8134()) {
			if (!this.aClass6_Sub17_Sub4_1.method6076(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local29 <= local17.anInt9362) {
						this.method2591(local17, local29 + local31, arg0, local31, local29);
						local17.anInt9362 -= local29;
						break;
					}
					this.method2591(local17, local29 + local31, arg0, local31, local17.anInt9362);
					local29 -= local17.anInt9362;
					local31 += local17.anInt9362;
				} while (!this.aClass6_Sub17_Sub4_1.method6091(arg0, local29, local31, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8143() {
		@Pc(11) Class6_Sub49 local11;
		do {
			local11 = (Class6_Sub49) this.aClass340_21.method8134();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass6_Sub17_Sub2_4 == null);
		return local11.aClass6_Sub17_Sub2_4;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!tia;II)V")
	private void method2589(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass6_Sub17_Sub4_1.anIntArray421[arg0.anInt9358] & 0x4) != 0 && arg0.anInt9355 < 0) {
			@Pc(25) int local25 = this.aClass6_Sub17_Sub4_1.anIntArray419[arg0.anInt9358] / Static90.anInt9479;
			@Pc(34) int local34 = (local25 + 1048575 - arg0.anInt9361) / local25;
			arg0.anInt9361 = arg0.anInt9361 + arg1 * local25 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass6_Sub17_Sub4_1.anIntArray420[arg0.anInt9358] == 0) {
					arg0.aClass6_Sub17_Sub2_4 = Static693.method3920(arg0.aClass6_Sub54_Sub1_4, arg0.aClass6_Sub17_Sub2_4.method3910(), arg0.aClass6_Sub17_Sub2_4.method3909(), arg0.aClass6_Sub17_Sub2_4.method3921());
				} else {
					arg0.aClass6_Sub17_Sub2_4 = Static693.method3920(arg0.aClass6_Sub54_Sub1_4, arg0.aClass6_Sub17_Sub2_4.method3910(), 0, arg0.aClass6_Sub17_Sub2_4.method3921());
					this.aClass6_Sub17_Sub4_1.method6093(arg0.aClass6_Sub22_1.aShortArray47[arg0.anInt9359] < 0, arg0);
				}
				if (arg0.aClass6_Sub22_1.aShortArray47[arg0.anInt9359] < 0) {
					arg0.aClass6_Sub17_Sub2_4.method3937(-1);
				}
				arg1 = arg0.anInt9361 / local25;
			}
		}
		arg0.aClass6_Sub17_Sub2_4.method8144(arg1);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!tia;I[IIII)V")
	private void method2591(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub17_Sub4_1.anIntArray421[arg0.anInt9358] & 0x4) != 0 && arg0.anInt9355 < 0) {
			@Pc(34) int local34 = this.aClass6_Sub17_Sub4_1.anIntArray419[arg0.anInt9358] / Static90.anInt9479;
			while (true) {
				@Pc(45) int local45 = (local34 + 1048575 - arg0.anInt9361) / local34;
				if (arg4 < local45) {
					arg0.anInt9361 += local34 * arg4;
					break;
				}
				arg0.aClass6_Sub17_Sub2_4.method8139(arg2, arg3, local45);
				arg0.anInt9361 += local34 * local45 - 1048576;
				arg4 -= local45;
				arg3 += local45;
				@Pc(76) int local76 = Static90.anInt9479 / 100;
				@Pc(80) int local80 = 262144 / local34;
				if (local80 < local76) {
					local76 = local80;
				}
				@Pc(92) Class6_Sub17_Sub2 local92 = arg0.aClass6_Sub17_Sub2_4;
				if (this.aClass6_Sub17_Sub4_1.anIntArray420[arg0.anInt9358] == 0) {
					arg0.aClass6_Sub17_Sub2_4 = Static693.method3920(arg0.aClass6_Sub54_Sub1_4, local92.method3910(), local92.method3909(), local92.method3921());
				} else {
					arg0.aClass6_Sub17_Sub2_4 = Static693.method3920(arg0.aClass6_Sub54_Sub1_4, local92.method3910(), 0, local92.method3921());
					this.aClass6_Sub17_Sub4_1.method6093(arg0.aClass6_Sub22_1.aShortArray47[arg0.anInt9359] < 0, arg0);
					arg0.aClass6_Sub17_Sub2_4.method3902(local76, local92.method3909());
				}
				if (arg0.aClass6_Sub22_1.aShortArray47[arg0.anInt9359] < 0) {
					arg0.aClass6_Sub17_Sub2_4.method3937(-1);
				}
				local92.method3917(local76);
				local92.method8139(arg2, arg3, arg1 - arg3);
				if (local92.method3928()) {
					this.aClass6_Sub17_Sub3_1.method4661(local92);
				}
			}
		}
		arg0.aClass6_Sub17_Sub2_4.method8139(arg2, arg3, arg4);
	}
}
