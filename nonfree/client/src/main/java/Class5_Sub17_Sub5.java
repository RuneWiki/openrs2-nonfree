import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class5_Sub17_Sub5 extends Class5_Sub17 {

	@OriginalMember(owner = "client!qaa", name = "t", descriptor = "Lclient!fca;")
	public final Class114 aClass114_54 = new Class114();

	@OriginalMember(owner = "client!qaa", name = "B", descriptor = "Lclient!of;")
	public final Class5_Sub17_Sub4 aClass5_Sub17_Sub4_3 = new Class5_Sub17_Sub4();

	@OriginalMember(owner = "client!qaa", name = "A", descriptor = "Lclient!eka;")
	private final Class5_Sub17_Sub1 aClass5_Sub17_Sub1_4;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class5_Sub17_Sub5(@OriginalArg(0) Class5_Sub17_Sub1 arg0) {
		this.aClass5_Sub17_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "()I")
	@Override
	public int method6646() {
		return 0;
	}

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6652() {
		@Pc(9) Class5_Sub19 local9;
		do {
			local9 = (Class5_Sub19) this.aClass114_54.method2814();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass5_Sub17_Sub2_1 == null);
		return local9.aClass5_Sub17_Sub2_1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[IILclient!eu;II)V")
	private void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub19 arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass5_Sub17_Sub1_4.anIntArray119[arg3.anInt3106] & 0x4) != 0 && arg3.anInt3116 < 0) {
			@Pc(35) int local35 = this.aClass5_Sub17_Sub1_4.anIntArray108[arg3.anInt3106] / Static302.anInt5797;
			while (true) {
				@Pc(45) int local45 = (local35 + 1048575 - arg3.anInt3118) / local35;
				if (arg0 < local45) {
					arg3.anInt3118 += local35 * arg0;
					break;
				}
				arg3.aClass5_Sub17_Sub2_1.method6647(arg1, arg2, local45);
				arg0 -= local45;
				arg2 += local45;
				arg3.anInt3118 += local35 * local45 - 1048576;
				@Pc(76) int local76 = Static302.anInt5797 / 100;
				@Pc(80) int local80 = 262144 / local35;
				if (local80 < local76) {
					local76 = local80;
				}
				@Pc(92) Class5_Sub17_Sub2 local92 = arg3.aClass5_Sub17_Sub2_1;
				if (this.aClass5_Sub17_Sub1_4.anIntArray115[arg3.anInt3106] == 0) {
					arg3.aClass5_Sub17_Sub2_1 = Static684.method3952(arg3.aClass5_Sub42_Sub1_1, local92.method3963(), local92.method3967(), local92.method3966());
				} else {
					arg3.aClass5_Sub17_Sub2_1 = Static684.method3952(arg3.aClass5_Sub42_Sub1_1, local92.method3963(), 0, local92.method3966());
					this.aClass5_Sub17_Sub1_4.method2544(arg3, arg3.aClass5_Sub35_1.aShortArray75[arg3.anInt3114] < 0);
					arg3.aClass5_Sub17_Sub2_1.method3965(local76, local92.method3967());
				}
				if (arg3.aClass5_Sub35_1.aShortArray75[arg3.anInt3114] < 0) {
					arg3.aClass5_Sub17_Sub2_1.method3969(-1);
				}
				local92.method3938(local76);
				local92.method6647(arg1, arg2, arg4 - arg2);
				if (local92.method3950()) {
					this.aClass5_Sub17_Sub4_3.method6191(local92);
				}
			}
		}
		arg3.aClass5_Sub17_Sub2_1.method6647(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6649() {
		@Pc(9) Class5_Sub19 local9 = (Class5_Sub19) this.aClass114_54.method2805();
		if (local9 == null) {
			return null;
		} else if (local9.aClass5_Sub17_Sub2_1 == null) {
			return this.method6652();
		} else {
			return local9.aClass5_Sub17_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!eu;II)V")
	private void method6655(@OriginalArg(0) Class5_Sub19 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass5_Sub17_Sub1_4.anIntArray119[arg0.anInt3106] & 0x4) != 0 && arg0.anInt3116 < 0) {
			@Pc(23) int local23 = this.aClass5_Sub17_Sub1_4.anIntArray108[arg0.anInt3106] / Static302.anInt5797;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt3118) / local23;
			arg0.anInt3118 = local23 * arg1 + arg0.anInt3118 & 0xFFFFF;
			if (arg1 >= local33) {
				if (this.aClass5_Sub17_Sub1_4.anIntArray115[arg0.anInt3106] == 0) {
					arg0.aClass5_Sub17_Sub2_1 = Static684.method3952(arg0.aClass5_Sub42_Sub1_1, arg0.aClass5_Sub17_Sub2_1.method3963(), arg0.aClass5_Sub17_Sub2_1.method3967(), arg0.aClass5_Sub17_Sub2_1.method3966());
				} else {
					arg0.aClass5_Sub17_Sub2_1 = Static684.method3952(arg0.aClass5_Sub42_Sub1_1, arg0.aClass5_Sub17_Sub2_1.method3963(), 0, arg0.aClass5_Sub17_Sub2_1.method3966());
					this.aClass5_Sub17_Sub1_4.method2544(arg0, arg0.aClass5_Sub35_1.aShortArray75[arg0.anInt3114] < 0);
				}
				if (arg0.aClass5_Sub35_1.aShortArray75[arg0.anInt3114] < 0) {
					arg0.aClass5_Sub17_Sub2_1.method3969(-1);
				}
				arg1 = arg0.anInt3118 / local23;
			}
		}
		arg0.aClass5_Sub17_Sub2_1.method6650(arg1);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([III)V")
	@Override
	public void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub17_Sub4_3.method6647(arg0, arg1, arg2);
		for (@Pc(17) Class5_Sub19 local17 = (Class5_Sub19) this.aClass114_54.method2805(); local17 != null; local17 = (Class5_Sub19) this.aClass114_54.method2814()) {
			if (!this.aClass5_Sub17_Sub1_4.method2541(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3112 >= local27) {
						this.method6654(local27, arg0, local29, local17, local27 + local29);
						local17.anInt3112 -= local27;
						break;
					}
					this.method6654(local17.anInt3112, arg0, local29, local17, local27 + local29);
					local29 += local17.anInt3112;
					local27 -= local17.anInt3112;
				} while (!this.aClass5_Sub17_Sub1_4.method2558(local27, arg0, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	@Override
	public void method6650(@OriginalArg(0) int arg0) {
		this.aClass5_Sub17_Sub4_3.method6650(arg0);
		for (@Pc(13) Class5_Sub19 local13 = (Class5_Sub19) this.aClass114_54.method2805(); local13 != null; local13 = (Class5_Sub19) this.aClass114_54.method2814()) {
			if (!this.aClass5_Sub17_Sub1_4.method2541(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local22 <= local13.anInt3112) {
						this.method6655(local13, local22);
						local13.anInt3112 -= local22;
						break;
					}
					this.method6655(local13, local13.anInt3112);
					local22 -= local13.anInt3112;
				} while (!this.aClass5_Sub17_Sub1_4.method2558(local22, (int[]) null, 0, local13));
			}
		}
	}
}
