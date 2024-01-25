import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub9_Sub4 extends Class3_Sub9 {

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!eea;")
	public final Class71 aClass71_63 = new Class71();

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!ov;")
	public final Class3_Sub9_Sub3 aClass3_Sub9_Sub3_1 = new Class3_Sub9_Sub3();

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Lclient!ci;")
	private final Class3_Sub9_Sub1 aClass3_Sub9_Sub1_3;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ci;)V")
	public Class3_Sub9_Sub4(@OriginalArg(0) Class3_Sub9_Sub1 arg0) {
		this.aClass3_Sub9_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	@Override
	public int method6926() {
		return 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	@Override
	public void method6931(@OriginalArg(0) int arg0) {
		this.aClass3_Sub9_Sub3_1.method6931(arg0);
		for (@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) this.aClass71_63.method2089(); local15 != null; local15 = (Class3_Sub28) this.aClass71_63.method2086()) {
			if (!this.aClass3_Sub9_Sub1_3.method1204(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5437 >= local25) {
						this.method6936(local25, local15);
						local15.anInt5437 -= local25;
						break;
					}
					this.method6936(local15.anInt5437, local15);
					local25 -= local15.anInt5437;
				} while (!this.aClass3_Sub9_Sub1_3.method1208(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!kv;BI[II)V")
	private void method6935(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub9_Sub1_3.anIntArray159[arg1.anInt5447] & 0x4) != 0 && arg1.anInt5438 < 0) {
			@Pc(37) int local37 = this.aClass3_Sub9_Sub1_3.anIntArray171[arg1.anInt5447] / Static361.anInt6755;
			while (true) {
				@Pc(47) int local47 = (local37 + 1048575 - arg1.anInt5440) / local37;
				if (arg2 < local47) {
					arg1.anInt5440 += arg2 * local37;
					break;
				}
				arg1.aClass3_Sub9_Sub2_4.method6930(arg3, arg4, local47);
				arg2 -= local47;
				arg4 += local47;
				arg1.anInt5440 += local37 * local47 - 1048576;
				@Pc(78) int local78 = Static361.anInt6755 / 100;
				@Pc(82) int local82 = 262144 / local37;
				if (local78 > local82) {
					local78 = local82;
				}
				@Pc(90) Class3_Sub9_Sub2 local90 = arg1.aClass3_Sub9_Sub2_4;
				if (this.aClass3_Sub9_Sub1_3.anIntArray158[arg1.anInt5447] == 0) {
					arg1.aClass3_Sub9_Sub2_4 = Static556.method5376(arg1.aClass3_Sub42_Sub1_4, local90.method5355(), local90.method5368(), local90.method5362());
				} else {
					arg1.aClass3_Sub9_Sub2_4 = Static556.method5376(arg1.aClass3_Sub42_Sub1_4, local90.method5355(), 0, local90.method5362());
					this.aClass3_Sub9_Sub1_3.method1194(arg1, arg1.aClass3_Sub26_1.aShortArray96[arg1.anInt5446] < 0);
					arg1.aClass3_Sub9_Sub2_4.method5358(local78, local90.method5368());
				}
				if (arg1.aClass3_Sub26_1.aShortArray96[arg1.anInt5446] < 0) {
					arg1.aClass3_Sub9_Sub2_4.method5365(-1);
				}
				local90.method5360(local78);
				local90.method6930(arg3, arg4, arg0 - arg4);
				if (local90.method5366()) {
					this.aClass3_Sub9_Sub3_1.method5654(local90);
				}
			}
		}
		arg1.aClass3_Sub9_Sub2_4.method6930(arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "([III)V")
	@Override
	public void method6930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub9_Sub3_1.method6930(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub28 local17 = (Class3_Sub28) this.aClass71_63.method2089(); local17 != null; local17 = (Class3_Sub28) this.aClass71_63.method2086()) {
			if (!this.aClass3_Sub9_Sub1_3.method1204(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5437 >= local27) {
						this.method6935(local29 + local27, local17, local27, arg0, local29);
						local17.anInt5437 -= local27;
						break;
					}
					this.method6935(local27 + local29, local17, local17.anInt5437, arg0, local29);
					local29 += local17.anInt5437;
					local27 -= local17.anInt5437;
				} while (!this.aClass3_Sub9_Sub1_3.method1208(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!kv;B)V")
	private void method6936(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if ((this.aClass3_Sub9_Sub1_3.anIntArray159[arg1.anInt5447] & 0x4) != 0 && arg1.anInt5438 < 0) {
			@Pc(31) int local31 = this.aClass3_Sub9_Sub1_3.anIntArray171[arg1.anInt5447] / Static361.anInt6755;
			@Pc(41) int local41 = (local31 + 1048575 - arg1.anInt5440) / local31;
			arg1.anInt5440 = local31 * arg0 + arg1.anInt5440 & 0xFFFFF;
			if (local41 <= arg0) {
				if (this.aClass3_Sub9_Sub1_3.anIntArray158[arg1.anInt5447] == 0) {
					arg1.aClass3_Sub9_Sub2_4 = Static556.method5376(arg1.aClass3_Sub42_Sub1_4, arg1.aClass3_Sub9_Sub2_4.method5355(), arg1.aClass3_Sub9_Sub2_4.method5368(), arg1.aClass3_Sub9_Sub2_4.method5362());
				} else {
					arg1.aClass3_Sub9_Sub2_4 = Static556.method5376(arg1.aClass3_Sub42_Sub1_4, arg1.aClass3_Sub9_Sub2_4.method5355(), 0, arg1.aClass3_Sub9_Sub2_4.method5362());
					this.aClass3_Sub9_Sub1_3.method1194(arg1, arg1.aClass3_Sub26_1.aShortArray96[arg1.anInt5446] < 0);
				}
				if (arg1.aClass3_Sub26_1.aShortArray96[arg1.anInt5446] < 0) {
					arg1.aClass3_Sub9_Sub2_4.method5365(-1);
				}
				arg0 = arg1.anInt5440 / local31;
			}
		}
		arg1.aClass3_Sub9_Sub2_4.method6931(arg0);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6929() {
		@Pc(9) Class3_Sub28 local9 = (Class3_Sub28) this.aClass71_63.method2089();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub9_Sub2_4 == null) {
			return this.method6928();
		} else {
			return local9.aClass3_Sub9_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "()Lclient!bk;")
	@Override
	public Class3_Sub9 method6928() {
		@Pc(9) Class3_Sub28 local9;
		do {
			local9 = (Class3_Sub28) this.aClass71_63.method2086();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub9_Sub2_4 == null);
		return local9.aClass3_Sub9_Sub2_4;
	}
}
