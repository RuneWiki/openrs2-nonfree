import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class4_Sub7_Sub3 extends Class4_Sub7 {

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "Lclient!gw;")
	public final Class91 aClass91_15 = new Class91();

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "Lclient!tc;")
	public final Class4_Sub7_Sub4 aClass4_Sub7_Sub4_2 = new Class4_Sub7_Sub4();

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!db;")
	private final Class4_Sub7_Sub2 aClass4_Sub7_Sub2_5;

	static {
		new Class21("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!db;)V")
	public Class4_Sub7_Sub3(@OriginalArg(0) Class4_Sub7_Sub2 arg0) {
		this.aClass4_Sub7_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([III)V")
	@Override
	public void method5463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub7_Sub4_2.method5463(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub37 local17 = (Class4_Sub37) this.aClass91_15.method2584(); local17 != null; local17 = (Class4_Sub37) this.aClass91_15.method2586()) {
			if (!this.aClass4_Sub7_Sub2_5.method1419(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt6611) {
						this.method2527(arg0, local17, local27 + local29, local29, local27);
						local17.anInt6611 -= local27;
						break;
					}
					this.method2527(arg0, local17, local29 + local27, local29, local17.anInt6611);
					local27 -= local17.anInt6611;
					local29 += local17.anInt6611;
				} while (!this.aClass4_Sub7_Sub2_5.method1409(local27, local17, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[ILclient!si;III)V")
	private void method2527(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class4_Sub37 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass4_Sub7_Sub2_5.anIntArray101[arg1.anInt6619] & 0x4) != 0 && arg1.anInt6621 < 0) {
			@Pc(22) int local22 = this.aClass4_Sub7_Sub2_5.anIntArray98[arg1.anInt6619] / Static88.anInt6642;
			while (true) {
				@Pc(32) int local32 = (local22 + 1048575 - arg1.anInt6622) / local22;
				if (arg4 < local32) {
					arg1.anInt6622 += local22 * arg4;
					break;
				}
				arg1.aClass4_Sub7_Sub1_4.method5463(arg0, arg3, local32);
				arg1.anInt6622 += local32 * local22 - 1048576;
				arg3 += local32;
				arg4 -= local32;
				@Pc(67) int local67 = Static88.anInt6642 / 100;
				@Pc(71) int local71 = 262144 / local22;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(79) Class4_Sub7_Sub1 local79 = arg1.aClass4_Sub7_Sub1_4;
				if (this.aClass4_Sub7_Sub2_5.anIntArray97[arg1.anInt6619] == 0) {
					arg1.aClass4_Sub7_Sub1_4 = Static470.method971(arg1.aClass4_Sub9_Sub1_2, local79.method996(), local79.method975(), local79.method972());
				} else {
					arg1.aClass4_Sub7_Sub1_4 = Static470.method971(arg1.aClass4_Sub9_Sub1_2, local79.method996(), 0, local79.method972());
					this.aClass4_Sub7_Sub2_5.method1416(arg1, arg1.aClass4_Sub32_1.aShortArray89[arg1.anInt6618] < 0);
					arg1.aClass4_Sub7_Sub1_4.method979(local67, local79.method975());
				}
				if (arg1.aClass4_Sub32_1.aShortArray89[arg1.anInt6618] < 0) {
					arg1.aClass4_Sub7_Sub1_4.method974(-1);
				}
				local79.method973(local67);
				local79.method5463(arg0, arg3, arg2 - arg3);
				if (local79.method988()) {
					this.aClass4_Sub7_Sub4_2.method5473(local79);
				}
			}
		}
		arg1.aClass4_Sub7_Sub1_4.method5463(arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!si;)V")
	private void method2528(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub37 arg1) {
		if ((this.aClass4_Sub7_Sub2_5.anIntArray101[arg1.anInt6619] & 0x4) != 0 && arg1.anInt6621 < 0) {
			@Pc(29) int local29 = this.aClass4_Sub7_Sub2_5.anIntArray98[arg1.anInt6619] / Static88.anInt6642;
			@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt6622) / local29;
			arg1.anInt6622 = arg1.anInt6622 + local29 * arg0 & 0xFFFFF;
			if (local39 <= arg0) {
				if (this.aClass4_Sub7_Sub2_5.anIntArray97[arg1.anInt6619] == 0) {
					arg1.aClass4_Sub7_Sub1_4 = Static470.method971(arg1.aClass4_Sub9_Sub1_2, arg1.aClass4_Sub7_Sub1_4.method996(), arg1.aClass4_Sub7_Sub1_4.method975(), arg1.aClass4_Sub7_Sub1_4.method972());
				} else {
					arg1.aClass4_Sub7_Sub1_4 = Static470.method971(arg1.aClass4_Sub9_Sub1_2, arg1.aClass4_Sub7_Sub1_4.method996(), 0, arg1.aClass4_Sub7_Sub1_4.method972());
					this.aClass4_Sub7_Sub2_5.method1416(arg1, arg1.aClass4_Sub32_1.aShortArray89[arg1.anInt6618] < 0);
				}
				if (arg1.aClass4_Sub32_1.aShortArray89[arg1.anInt6618] < 0) {
					arg1.aClass4_Sub7_Sub1_4.method974(-1);
				}
				arg0 = arg1.anInt6622 / local29;
			}
		}
		arg1.aClass4_Sub7_Sub1_4.method5465(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "()I")
	@Override
	public int method5464() {
		return 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	@Override
	public void method5465(@OriginalArg(0) int arg0) {
		this.aClass4_Sub7_Sub4_2.method5465(arg0);
		for (@Pc(15) Class4_Sub37 local15 = (Class4_Sub37) this.aClass91_15.method2584(); local15 != null; local15 = (Class4_Sub37) this.aClass91_15.method2586()) {
			if (!this.aClass4_Sub7_Sub2_5.method1419(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6611 >= local25) {
						this.method2528(local25, local15);
						local15.anInt6611 -= local25;
						break;
					}
					this.method2528(local15.anInt6611, local15);
					local25 -= local15.anInt6611;
				} while (!this.aClass4_Sub7_Sub2_5.method1409(local25, local15, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5466() {
		@Pc(9) Class4_Sub37 local9 = (Class4_Sub37) this.aClass91_15.method2584();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub7_Sub1_4 == null) {
			return this.method5468();
		} else {
			return local9.aClass4_Sub7_Sub1_4;
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5468() {
		@Pc(9) Class4_Sub37 local9;
		do {
			local9 = (Class4_Sub37) this.aClass91_15.method2586();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub7_Sub1_4 == null);
		return local9.aClass4_Sub7_Sub1_4;
	}
}
