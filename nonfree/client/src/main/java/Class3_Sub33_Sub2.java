import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class3_Sub33_Sub2 extends Class3_Sub33 {

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "Lclient!sja;")
	public final Class342 aClass342_57 = new Class342();

	@OriginalMember(owner = "client!oca", name = "B", descriptor = "Lclient!ufa;")
	public final Class3_Sub33_Sub4 aClass3_Sub33_Sub4_2 = new Class3_Sub33_Sub4();

	@OriginalMember(owner = "client!oca", name = "y", descriptor = "Lclient!te;")
	private final Class3_Sub33_Sub3 aClass3_Sub33_Sub3_2;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class3_Sub33_Sub2(@OriginalArg(0) Class3_Sub33_Sub3 arg0) {
		this.aClass3_Sub33_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0) {
		this.aClass3_Sub33_Sub4_2.method8710(arg0);
		for (@Pc(15) Class3_Sub58 local15 = (Class3_Sub58) this.aClass342_57.method7644(); local15 != null; local15 = (Class3_Sub58) this.aClass342_57.method7650()) {
			if (!this.aClass3_Sub33_Sub3_2.method7910(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local15.anInt11077 >= local27) {
						this.method6261(local27, local15);
						local15.anInt11077 -= local27;
						break;
					}
					this.method6261(local15.anInt11077, local15);
					local27 -= local15.anInt11077;
				} while (!this.aClass3_Sub33_Sub3_2.method7908(local15, 0, (int[]) null, local27));
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "()I")
	@Override
	public int method8705() {
		return 0;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wea;I[IIIB)V")
	private void method6260(@OriginalArg(0) Class3_Sub58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass3_Sub33_Sub3_2.anIntArray687[arg0.anInt11075] & 0x4) != 0 && arg0.anInt11085 < 0) {
			@Pc(27) int local27 = this.aClass3_Sub33_Sub3_2.anIntArray674[arg0.anInt11075] / Static330.anInt9773;
			while (true) {
				@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt11072) / local27;
				if (arg3 < local37) {
					arg0.anInt11072 += arg3 * local27;
					break;
				}
				arg0.aClass3_Sub33_Sub5_4.method8709(arg2, arg4, local37);
				arg3 -= local37;
				arg4 += local37;
				arg0.anInt11072 += local37 * local27 - 1048576;
				@Pc(68) int local68 = Static330.anInt9773 / 100;
				@Pc(72) int local72 = 262144 / local27;
				if (local72 < local68) {
					local68 = local72;
				}
				@Pc(84) Class3_Sub33_Sub5 local84 = arg0.aClass3_Sub33_Sub5_4;
				if (this.aClass3_Sub33_Sub3_2.anIntArray679[arg0.anInt11075] == 0) {
					arg0.aClass3_Sub33_Sub5_4 = Static737.method8739(arg0.aClass3_Sub34_Sub1_4, local84.method8737(), local84.method8746(), local84.method8711());
				} else {
					arg0.aClass3_Sub33_Sub5_4 = Static737.method8739(arg0.aClass3_Sub34_Sub1_4, local84.method8737(), 0, local84.method8711());
					this.aClass3_Sub33_Sub3_2.method7898(arg0, arg0.aClass3_Sub46_1.aShortArray103[arg0.anInt11087] < 0);
					arg0.aClass3_Sub33_Sub5_4.method8731(local68, local84.method8746());
				}
				if (arg0.aClass3_Sub46_1.aShortArray103[arg0.anInt11087] < 0) {
					arg0.aClass3_Sub33_Sub5_4.method8730(-1);
				}
				local84.method8735(local68);
				local84.method8709(arg2, arg4, arg1 - arg4);
				if (local84.method8714()) {
					this.aClass3_Sub33_Sub4_2.method8545(local84);
				}
			}
		}
		arg0.aClass3_Sub33_Sub5_4.method8709(arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!wea;I)V")
	private void method6261(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub58 arg1) {
		if ((this.aClass3_Sub33_Sub3_2.anIntArray687[arg1.anInt11075] & 0x4) != 0 && arg1.anInt11085 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub33_Sub3_2.anIntArray674[arg1.anInt11075] / Static330.anInt9773;
			@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt11072) / local29;
			arg1.anInt11072 = local29 * arg0 + arg1.anInt11072 & 0xFFFFF;
			if (arg0 >= local39) {
				if (this.aClass3_Sub33_Sub3_2.anIntArray679[arg1.anInt11075] == 0) {
					arg1.aClass3_Sub33_Sub5_4 = Static737.method8739(arg1.aClass3_Sub34_Sub1_4, arg1.aClass3_Sub33_Sub5_4.method8737(), arg1.aClass3_Sub33_Sub5_4.method8746(), arg1.aClass3_Sub33_Sub5_4.method8711());
				} else {
					arg1.aClass3_Sub33_Sub5_4 = Static737.method8739(arg1.aClass3_Sub34_Sub1_4, arg1.aClass3_Sub33_Sub5_4.method8737(), 0, arg1.aClass3_Sub33_Sub5_4.method8711());
					this.aClass3_Sub33_Sub3_2.method7898(arg1, arg1.aClass3_Sub46_1.aShortArray103[arg1.anInt11087] < 0);
				}
				if (arg1.aClass3_Sub46_1.aShortArray103[arg1.anInt11087] < 0) {
					arg1.aClass3_Sub33_Sub5_4.method8730(-1);
				}
				arg0 = arg1.anInt11072 / local29;
			}
		}
		arg1.aClass3_Sub33_Sub5_4.method8710(arg0);
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8706() {
		@Pc(9) Class3_Sub58 local9 = (Class3_Sub58) this.aClass342_57.method7644();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub33_Sub5_4 == null) {
			return this.method8708();
		} else {
			return local9.aClass3_Sub33_Sub5_4;
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "([III)V")
	@Override
	public void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub33_Sub4_2.method8709(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub58 local17 = (Class3_Sub58) this.aClass342_57.method7644(); local17 != null; local17 = (Class3_Sub58) this.aClass342_57.method7650()) {
			if (!this.aClass3_Sub33_Sub3_2.method7910(local17)) {
				@Pc(29) int local29 = arg2;
				@Pc(31) int local31 = arg1;
				do {
					if (local17.anInt11077 >= local29) {
						this.method6260(local17, local31 + local29, arg0, local29, local31);
						local17.anInt11077 -= local29;
						break;
					}
					this.method6260(local17, local31 + local29, arg0, local17.anInt11077, local31);
					local29 -= local17.anInt11077;
					local31 += local17.anInt11077;
				} while (!this.aClass3_Sub33_Sub3_2.method7908(local17, local31, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8708() {
		@Pc(11) Class3_Sub58 local11;
		do {
			local11 = (Class3_Sub58) this.aClass342_57.method7650();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass3_Sub33_Sub5_4 == null);
		return local11.aClass3_Sub33_Sub5_4;
	}
}
