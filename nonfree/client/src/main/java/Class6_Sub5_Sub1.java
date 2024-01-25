import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!ft;")
	public final Class88 aClass88_13 = new Class88();

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "Lclient!gq;")
	public final Class6_Sub5_Sub2 aClass6_Sub5_Sub2_1 = new Class6_Sub5_Sub2();

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "Lclient!ls;")
	private final Class6_Sub5_Sub3 aClass6_Sub5_Sub3_3;

	static {
		new Class231("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ls;)V")
	public Class6_Sub5_Sub1(@OriginalArg(0) Class6_Sub5_Sub3 arg0) {
		this.aClass6_Sub5_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "([III)V")
	@Override
	public void method5734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub5_Sub2_1.method5734(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub26 local17 = (Class6_Sub26) this.aClass88_13.method1882(); local17 != null; local17 = (Class6_Sub26) this.aClass88_13.method1891()) {
			if (!this.aClass6_Sub5_Sub3_3.method3640(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt5048) {
						this.method1138(local29 + local27, local29, local27, arg0, local17);
						local17.anInt5048 -= local29;
						break;
					}
					this.method1138(local27 + local29, local17.anInt5048, local27, arg0, local17);
					local27 += local17.anInt5048;
					local29 -= local17.anInt5048;
				} while (!this.aClass6_Sub5_Sub3_3.method3644(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "()I")
	@Override
	public int method5728() {
		return 0;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0) {
		this.aClass6_Sub5_Sub2_1.method5730(arg0);
		for (@Pc(15) Class6_Sub26 local15 = (Class6_Sub26) this.aClass88_13.method1882(); local15 != null; local15 = (Class6_Sub26) this.aClass88_13.method1891()) {
			if (!this.aClass6_Sub5_Sub3_3.method3640(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5048 >= local25) {
						this.method1136(local15, local25);
						local15.anInt5048 -= local25;
						break;
					}
					this.method1136(local15, local15.anInt5048);
					local25 -= local15.anInt5048;
				} while (!this.aClass6_Sub5_Sub3_3.method3644(null, local25, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!pl;BI)V")
	private void method1136(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass6_Sub5_Sub3_3.anIntArray356[arg0.anInt5056] & 0x4) != 0 && arg0.anInt5042 < 0) {
			@Pc(20) int local20 = this.aClass6_Sub5_Sub3_3.anIntArray349[arg0.anInt5056] / Static203.anInt3580;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt5053) / local20;
			arg0.anInt5053 = local20 * arg1 + arg0.anInt5053 & 0xFFFFF;
			if (arg1 >= local30) {
				if (this.aClass6_Sub5_Sub3_3.anIntArray350[arg0.anInt5056] == 0) {
					arg0.aClass6_Sub5_Sub4_4 = Static460.method5740(arg0.aClass6_Sub4_Sub1_2, arg0.aClass6_Sub5_Sub4_4.method5753(), arg0.aClass6_Sub5_Sub4_4.method5758(), arg0.aClass6_Sub5_Sub4_4.method5746());
				} else {
					arg0.aClass6_Sub5_Sub4_4 = Static460.method5740(arg0.aClass6_Sub4_Sub1_2, arg0.aClass6_Sub5_Sub4_4.method5753(), 0, arg0.aClass6_Sub5_Sub4_4.method5746());
					this.aClass6_Sub5_Sub3_3.method3653(arg0.aClass6_Sub19_1.aShortArray60[arg0.anInt5054] < 0, arg0);
				}
				if (arg0.aClass6_Sub19_1.aShortArray60[arg0.anInt5054] < 0) {
					arg0.aClass6_Sub5_Sub4_4.method5745(-1);
				}
				arg1 = arg0.anInt5053 / local20;
			}
		}
		arg0.aClass6_Sub5_Sub4_4.method5730(arg1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[ILclient!pl;I)V")
	private void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class6_Sub26 arg4) {
		if ((this.aClass6_Sub5_Sub3_3.anIntArray356[arg4.anInt5056] & 0x4) != 0 && arg4.anInt5042 < 0) {
			@Pc(35) int local35 = this.aClass6_Sub5_Sub3_3.anIntArray349[arg4.anInt5056] / Static203.anInt3580;
			while (true) {
				@Pc(45) int local45 = (local35 + 1048575 - arg4.anInt5053) / local35;
				if (local45 > arg1) {
					arg4.anInt5053 += arg1 * local35;
					break;
				}
				arg4.aClass6_Sub5_Sub4_4.method5734(arg3, arg2, local45);
				arg1 -= local45;
				arg4.anInt5053 += local45 * local35 - 1048576;
				arg2 += local45;
				@Pc(76) int local76 = Static203.anInt3580 / 100;
				@Pc(80) int local80 = 262144 / local35;
				if (local76 > local80) {
					local76 = local80;
				}
				@Pc(88) Class6_Sub5_Sub4 local88 = arg4.aClass6_Sub5_Sub4_4;
				if (this.aClass6_Sub5_Sub3_3.anIntArray350[arg4.anInt5056] == 0) {
					arg4.aClass6_Sub5_Sub4_4 = Static460.method5740(arg4.aClass6_Sub4_Sub1_2, local88.method5753(), local88.method5758(), local88.method5746());
				} else {
					arg4.aClass6_Sub5_Sub4_4 = Static460.method5740(arg4.aClass6_Sub4_Sub1_2, local88.method5753(), 0, local88.method5746());
					this.aClass6_Sub5_Sub3_3.method3653(arg4.aClass6_Sub19_1.aShortArray60[arg4.anInt5054] < 0, arg4);
					arg4.aClass6_Sub5_Sub4_4.method5739(local76, local88.method5758());
				}
				if (arg4.aClass6_Sub19_1.aShortArray60[arg4.anInt5054] < 0) {
					arg4.aClass6_Sub5_Sub4_4.method5745(-1);
				}
				local88.method5773(local76);
				local88.method5734(arg3, arg2, arg0 - arg2);
				if (local88.method5749()) {
					this.aClass6_Sub5_Sub2_1.method2166(local88);
				}
			}
		}
		arg4.aClass6_Sub5_Sub4_4.method5734(arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5729() {
		@Pc(9) Class6_Sub26 local9 = (Class6_Sub26) this.aClass88_13.method1882();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub5_Sub4_4 == null) {
			return this.method5732();
		} else {
			return local9.aClass6_Sub5_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "()Lclient!wg;")
	@Override
	public Class6_Sub5 method5732() {
		@Pc(9) Class6_Sub26 local9;
		do {
			local9 = (Class6_Sub26) this.aClass88_13.method1891();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub5_Sub4_4 == null);
		return local9.aClass6_Sub5_Sub4_4;
	}
}
