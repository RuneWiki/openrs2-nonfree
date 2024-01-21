import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub16_Sub4 extends Class2_Sub16 {

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "Lclient!da;")
	public final Class13 aClass13_68 = new Class13();

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lclient!vc;")
	public final Class2_Sub16_Sub3 aClass2_Sub16_Sub3_3 = new Class2_Sub16_Sub3();

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "Lclient!v;")
	private final Class2_Sub16_Sub2 aClass2_Sub16_Sub2_2;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!v;)V")
	public Class2_Sub16_Sub4(@OriginalArg(0) Class2_Sub16_Sub2 arg0) {
		this.aClass2_Sub16_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method1917(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub16_Sub2_2.anIntArray376[arg0.anInt453] & 0x4) != 0 && arg0.anInt433 < 0) {
			@Pc(33) int local33 = this.aClass2_Sub16_Sub2_2.anIntArray377[arg0.anInt453] / Static119.anInt2551;
			@Pc(42) int local42 = (local33 + 1048575 - arg0.anInt430) / local33;
			arg0.anInt430 = arg1 * local33 + arg0.anInt430 & 0xFFFFF;
			if (local42 <= arg1) {
				if (this.aClass2_Sub16_Sub2_2.anIntArray386[arg0.anInt453] == 0) {
					arg0.aClass2_Sub16_Sub1_1 = Static134.method1186(arg0.aClass2_Sub14_Sub1_1, arg0.aClass2_Sub16_Sub1_1.method1181(), arg0.aClass2_Sub16_Sub1_1.method1183(), arg0.aClass2_Sub16_Sub1_1.method1192());
				} else {
					arg0.aClass2_Sub16_Sub1_1 = Static134.method1186(arg0.aClass2_Sub14_Sub1_1, arg0.aClass2_Sub16_Sub1_1.method1181(), 0, arg0.aClass2_Sub16_Sub1_1.method1192());
					this.aClass2_Sub16_Sub2_2.method1797(arg0.aClass2_Sub15_1.aShortArray8[arg0.anInt441] < 0, arg0);
				}
				if (arg0.aClass2_Sub15_1.aShortArray8[arg0.anInt441] < 0) {
					arg0.aClass2_Sub16_Sub1_1.method1174(-1);
				}
				arg1 = arg0.anInt430 / local33;
			}
		}
		arg0.aClass2_Sub16_Sub1_1.method1916(arg1);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "()I")
	@Override
	public int method1914() {
		return 0;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1912() {
		@Pc(5) Class2_Sub5 local5 = (Class2_Sub5) this.aClass13_68.method415();
		if (local5 == null) {
			return null;
		} else if (local5.aClass2_Sub16_Sub1_1 == null) {
			return this.method1911();
		} else {
			return local5.aClass2_Sub16_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "()Lclient!wc;")
	@Override
	public Class2_Sub16 method1911() {
		@Pc(9) Class2_Sub5 local9;
		do {
			local9 = (Class2_Sub5) this.aClass13_68.method414();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub16_Sub1_1 == null);
		return local9.aClass2_Sub16_Sub1_1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([ILclient!ce;IIII)V")
	private void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub16_Sub2_2.anIntArray376[arg1.anInt453] & 0x4) != 0 && arg1.anInt433 < 0) {
			@Pc(32) int local32 = this.aClass2_Sub16_Sub2_2.anIntArray377[arg1.anInt453] / Static119.anInt2551;
			while (true) {
				@Pc(42) int local42 = (local32 + 1048575 - arg1.anInt430) / local32;
				if (arg3 < local42) {
					arg1.anInt430 += local32 * arg3;
					break;
				}
				arg1.aClass2_Sub16_Sub1_1.method1913(arg0, arg4, local42);
				arg4 += local42;
				arg1.anInt430 += local32 * local42 - 1048576;
				@Pc(73) int local73 = Static119.anInt2551 / 100;
				arg3 -= local42;
				@Pc(81) int local81 = 262144 / local32;
				if (local73 > local81) {
					local73 = local81;
				}
				@Pc(93) Class2_Sub16_Sub1 local93 = arg1.aClass2_Sub16_Sub1_1;
				if (this.aClass2_Sub16_Sub2_2.anIntArray386[arg1.anInt453] == 0) {
					arg1.aClass2_Sub16_Sub1_1 = Static134.method1186(arg1.aClass2_Sub14_Sub1_1, local93.method1181(), local93.method1183(), local93.method1192());
				} else {
					arg1.aClass2_Sub16_Sub1_1 = Static134.method1186(arg1.aClass2_Sub14_Sub1_1, local93.method1181(), 0, local93.method1192());
					this.aClass2_Sub16_Sub2_2.method1797(arg1.aClass2_Sub15_1.aShortArray8[arg1.anInt441] < 0, arg1);
					arg1.aClass2_Sub16_Sub1_1.method1195(local73, local93.method1183());
				}
				if (arg1.aClass2_Sub15_1.aShortArray8[arg1.anInt441] < 0) {
					arg1.aClass2_Sub16_Sub1_1.method1174(-1);
				}
				local93.method1185(local73);
				local93.method1913(arg0, arg4, arg2 - arg4);
				if (local93.method1184()) {
					this.aClass2_Sub16_Sub3_3.method1839(local93);
				}
			}
		}
		arg1.aClass2_Sub16_Sub1_1.method1913(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([III)V")
	@Override
	public void method1913(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub16_Sub3_3.method1913(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) this.aClass13_68.method415(); local17 != null; local17 = (Class2_Sub5) this.aClass13_68.method414()) {
			if (!this.aClass2_Sub16_Sub2_2.method1814(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt451 >= local27) {
						this.method1921(arg0, local17, local27 + local29, local27, local29);
						local17.anInt451 -= local27;
						break;
					}
					this.method1921(arg0, local17, local29 + local27, local17.anInt451, local29);
					local27 -= local17.anInt451;
					local29 += local17.anInt451;
				} while (!this.aClass2_Sub16_Sub2_2.method1813(local27, local29, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	@Override
	public void method1916(@OriginalArg(0) int arg0) {
		this.aClass2_Sub16_Sub3_3.method1916(arg0);
		for (@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) this.aClass13_68.method415(); local15 != null; local15 = (Class2_Sub5) this.aClass13_68.method414()) {
			if (!this.aClass2_Sub16_Sub2_2.method1814(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt451) {
						this.method1917(local15, local25);
						local15.anInt451 -= local25;
						break;
					}
					this.method1917(local15, local15.anInt451);
					local25 -= local15.anInt451;
				} while (!this.aClass2_Sub16_Sub2_2.method1813(local25, 0, local15, null));
			}
		}
	}
}
