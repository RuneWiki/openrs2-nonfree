import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "Lclient!uh;")
	public final Class341 aClass341_8 = new Class341();

	@OriginalMember(owner = "client!bea", name = "C", descriptor = "Lclient!sq;")
	public final Class2_Sub8_Sub4 aClass2_Sub8_Sub4_1 = new Class2_Sub8_Sub4();

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "Lclient!ma;")
	private final Class2_Sub8_Sub3 aClass2_Sub8_Sub3_3;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class2_Sub8_Sub1(@OriginalArg(0) Class2_Sub8_Sub3 arg0) {
		this.aClass2_Sub8_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8817() {
		@Pc(9) Class2_Sub49 local9;
		do {
			local9 = (Class2_Sub49) this.aClass341_8.method8519();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub8_Sub5_4 == null);
		return local9.aClass2_Sub8_Sub5_4;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "([III)V")
	@Override
	public void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub8_Sub4_1.method8816(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub49 local17 = (Class2_Sub49) this.aClass341_8.method8524(); local17 != null; local17 = (Class2_Sub49) this.aClass341_8.method8519()) {
			if (!this.aClass2_Sub8_Sub3_3.method5789(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt10763 >= local29) {
						this.method867(local27 + local29, local17, local27, local29, arg0);
						local17.anInt10763 -= local29;
						break;
					}
					this.method867(local27 + local29, local17, local27, local17.anInt10763, arg0);
					local27 += local17.anInt10763;
					local29 -= local17.anInt10763;
				} while (!this.aClass2_Sub8_Sub3_3.method5794(arg0, local29, local17, local27));
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IBLclient!vv;)V")
	private void method866(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub49 arg1) {
		if ((this.aClass2_Sub8_Sub3_3.anIntArray414[arg1.anInt10749] & 0x4) != 0 && arg1.anInt10764 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub8_Sub3_3.anIntArray419[arg1.anInt10749] / Static215.anInt4848;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt10760) / local23;
			arg1.anInt10760 = local23 * arg0 + arg1.anInt10760 & 0xFFFFF;
			if (arg0 >= local33) {
				if (this.aClass2_Sub8_Sub3_3.anIntArray420[arg1.anInt10749] == 0) {
					arg1.aClass2_Sub8_Sub5_4 = Static654.method8844(arg1.aClass2_Sub29_Sub1_4, arg1.aClass2_Sub8_Sub5_4.method8847(), arg1.aClass2_Sub8_Sub5_4.method8839(), arg1.aClass2_Sub8_Sub5_4.method8825());
				} else {
					arg1.aClass2_Sub8_Sub5_4 = Static654.method8844(arg1.aClass2_Sub29_Sub1_4, arg1.aClass2_Sub8_Sub5_4.method8847(), 0, arg1.aClass2_Sub8_Sub5_4.method8825());
					this.aClass2_Sub8_Sub3_3.method5816(arg1.aClass2_Sub27_1.aShortArray65[arg1.anInt10753] < 0, arg1);
				}
				if (arg1.aClass2_Sub27_1.aShortArray65[arg1.anInt10753] < 0) {
					arg1.aClass2_Sub8_Sub5_4.method8850(-1);
				}
				arg0 = arg1.anInt10760 / local23;
			}
		}
		arg1.aClass2_Sub8_Sub5_4.method8818(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "()I")
	@Override
	public int method8820() {
		return 0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	@Override
	public void method8818(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8_Sub4_1.method8818(arg0);
		for (@Pc(15) Class2_Sub49 local15 = (Class2_Sub49) this.aClass341_8.method8524(); local15 != null; local15 = (Class2_Sub49) this.aClass341_8.method8519()) {
			if (!this.aClass2_Sub8_Sub3_3.method5789(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt10763) {
						this.method866(local25, local15);
						local15.anInt10763 -= local25;
						break;
					}
					this.method866(local15.anInt10763, local15);
					local25 -= local15.anInt10763;
				} while (!this.aClass2_Sub8_Sub3_3.method5794(null, local25, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!vv;IBI[I)V")
	private void method867(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass2_Sub8_Sub3_3.anIntArray414[arg1.anInt10749] & 0x4) != 0 && arg1.anInt10764 < 0) {
			@Pc(35) int local35 = this.aClass2_Sub8_Sub3_3.anIntArray419[arg1.anInt10749] / Static215.anInt4848;
			while (true) {
				@Pc(45) int local45 = (local35 + 1048575 - arg1.anInt10760) / local35;
				if (arg3 < local45) {
					arg1.anInt10760 += arg3 * local35;
					break;
				}
				arg1.aClass2_Sub8_Sub5_4.method8816(arg4, arg2, local45);
				arg2 += local45;
				arg1.anInt10760 += local35 * local45 - 1048576;
				arg3 -= local45;
				@Pc(80) int local80 = Static215.anInt4848 / 100;
				@Pc(84) int local84 = 262144 / local35;
				if (local84 < local80) {
					local80 = local84;
				}
				@Pc(92) Class2_Sub8_Sub5 local92 = arg1.aClass2_Sub8_Sub5_4;
				if (this.aClass2_Sub8_Sub3_3.anIntArray420[arg1.anInt10749] == 0) {
					arg1.aClass2_Sub8_Sub5_4 = Static654.method8844(arg1.aClass2_Sub29_Sub1_4, local92.method8847(), local92.method8839(), local92.method8825());
				} else {
					arg1.aClass2_Sub8_Sub5_4 = Static654.method8844(arg1.aClass2_Sub29_Sub1_4, local92.method8847(), 0, local92.method8825());
					this.aClass2_Sub8_Sub3_3.method5816(arg1.aClass2_Sub27_1.aShortArray65[arg1.anInt10753] < 0, arg1);
					arg1.aClass2_Sub8_Sub5_4.method8849(local80, local92.method8839());
				}
				if (arg1.aClass2_Sub27_1.aShortArray65[arg1.anInt10753] < 0) {
					arg1.aClass2_Sub8_Sub5_4.method8850(-1);
				}
				local92.method8835(local80);
				local92.method8816(arg4, arg2, arg0 - arg2);
				if (local92.method8828()) {
					this.aClass2_Sub8_Sub4_1.method7928(local92);
				}
			}
		}
		arg1.aClass2_Sub8_Sub5_4.method8816(arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8815() {
		@Pc(9) Class2_Sub49 local9 = (Class2_Sub49) this.aClass341_8.method8524();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub8_Sub5_4 == null) {
			return this.method8817();
		} else {
			return local9.aClass2_Sub8_Sub5_4;
		}
	}
}
