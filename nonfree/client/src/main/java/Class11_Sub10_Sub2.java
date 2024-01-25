import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class11_Sub10_Sub2 extends Class11_Sub10 {

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!aq;")
	public final Class16 aClass16_11 = new Class16();

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Lclient!nh;")
	public final Class11_Sub10_Sub3 aClass11_Sub10_Sub3_1 = new Class11_Sub10_Sub3();

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Lclient!om;")
	private final Class11_Sub10_Sub4 aClass11_Sub10_Sub4_1;

	static {
		new Class117("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!om;)V")
	public Class11_Sub10_Sub2(@OriginalArg(0) Class11_Sub10_Sub4 arg0) {
		this.aClass11_Sub10_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()I")
	@Override
	public int method4056() {
		return 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!vi;I)V")
	private void method845(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub42 arg1) {
		if ((this.aClass11_Sub10_Sub4_1.anIntArray354[arg1.anInt6394] & 0x4) != 0 && arg1.anInt6404 < 0) {
			@Pc(21) int local21 = this.aClass11_Sub10_Sub4_1.anIntArray362[arg1.anInt6394] / Static352.anInt6698;
			@Pc(31) int local31 = (local21 + 1048575 - arg1.anInt6398) / local21;
			arg1.anInt6398 = arg1.anInt6398 + local21 * arg0 & 0xFFFFF;
			if (local31 <= arg0) {
				if (this.aClass11_Sub10_Sub4_1.anIntArray366[arg1.anInt6394] == 0) {
					arg1.aClass11_Sub10_Sub1_3 = Static361.method792(arg1.aClass11_Sub15_Sub1_1, arg1.aClass11_Sub10_Sub1_3.method793(), arg1.aClass11_Sub10_Sub1_3.method796(), arg1.aClass11_Sub10_Sub1_3.method769());
				} else {
					arg1.aClass11_Sub10_Sub1_3 = Static361.method792(arg1.aClass11_Sub15_Sub1_1, arg1.aClass11_Sub10_Sub1_3.method793(), 0, arg1.aClass11_Sub10_Sub1_3.method769());
					this.aClass11_Sub10_Sub4_1.method4075(arg1.aClass11_Sub32_1.aShortArray93[arg1.anInt6402] < 0, arg1);
				}
				if (arg1.aClass11_Sub32_1.aShortArray93[arg1.anInt6402] < 0) {
					arg1.aClass11_Sub10_Sub1_3.method797(-1);
				}
				arg0 = arg1.anInt6398 / local21;
			}
		}
		arg1.aClass11_Sub10_Sub1_3.method4060(arg0);
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4059() {
		@Pc(9) Class11_Sub42 local9 = (Class11_Sub42) this.aClass16_11.method193();
		if (local9 == null) {
			return null;
		} else if (local9.aClass11_Sub10_Sub1_3 == null) {
			return this.method4058();
		} else {
			return local9.aClass11_Sub10_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	@Override
	public void method4060(@OriginalArg(0) int arg0) {
		this.aClass11_Sub10_Sub3_1.method4060(arg0);
		for (@Pc(15) Class11_Sub42 local15 = (Class11_Sub42) this.aClass16_11.method193(); local15 != null; local15 = (Class11_Sub42) this.aClass16_11.method188()) {
			if (!this.aClass11_Sub10_Sub4_1.method4088(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6410) {
						this.method845(local25, local15);
						local15.anInt6410 -= local25;
						break;
					}
					this.method845(local15.anInt6410, local15);
					local25 -= local15.anInt6410;
				} while (!this.aClass11_Sub10_Sub4_1.method4064(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!vi;[IIII)V")
	private void method847(@OriginalArg(1) Class11_Sub42 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass11_Sub10_Sub4_1.anIntArray354[arg0.anInt6394] & 0x4) != 0 && arg0.anInt6404 < 0) {
			@Pc(33) int local33 = this.aClass11_Sub10_Sub4_1.anIntArray362[arg0.anInt6394] / Static352.anInt6698;
			while (true) {
				@Pc(43) int local43 = (local33 + 1048575 - arg0.anInt6398) / local33;
				if (arg2 < local43) {
					arg0.anInt6398 += arg2 * local33;
					break;
				}
				arg0.aClass11_Sub10_Sub1_3.method4057(arg1, arg4, local43);
				arg0.anInt6398 += local43 * local33 - 1048576;
				arg4 += local43;
				arg2 -= local43;
				@Pc(78) int local78 = Static352.anInt6698 / 100;
				@Pc(82) int local82 = 262144 / local33;
				if (local82 < local78) {
					local78 = local82;
				}
				@Pc(90) Class11_Sub10_Sub1 local90 = arg0.aClass11_Sub10_Sub1_3;
				if (this.aClass11_Sub10_Sub4_1.anIntArray366[arg0.anInt6394] == 0) {
					arg0.aClass11_Sub10_Sub1_3 = Static361.method792(arg0.aClass11_Sub15_Sub1_1, local90.method793(), local90.method796(), local90.method769());
				} else {
					arg0.aClass11_Sub10_Sub1_3 = Static361.method792(arg0.aClass11_Sub15_Sub1_1, local90.method793(), 0, local90.method769());
					this.aClass11_Sub10_Sub4_1.method4075(arg0.aClass11_Sub32_1.aShortArray93[arg0.anInt6402] < 0, arg0);
					arg0.aClass11_Sub10_Sub1_3.method788(local78, local90.method796());
				}
				if (arg0.aClass11_Sub32_1.aShortArray93[arg0.anInt6402] < 0) {
					arg0.aClass11_Sub10_Sub1_3.method797(-1);
				}
				local90.method786(local78);
				local90.method4057(arg1, arg4, arg3 - arg4);
				if (local90.method790()) {
					this.aClass11_Sub10_Sub3_1.method3741(local90);
				}
			}
		}
		arg0.aClass11_Sub10_Sub1_3.method4057(arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "()Lclient!er;")
	@Override
	public Class11_Sub10 method4058() {
		@Pc(9) Class11_Sub42 local9;
		do {
			local9 = (Class11_Sub42) this.aClass16_11.method188();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass11_Sub10_Sub1_3 == null);
		return local9.aClass11_Sub10_Sub1_3;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "([III)V")
	@Override
	public void method4057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass11_Sub10_Sub3_1.method4057(arg0, arg1, arg2);
		for (@Pc(17) Class11_Sub42 local17 = (Class11_Sub42) this.aClass16_11.method193(); local17 != null; local17 = (Class11_Sub42) this.aClass16_11.method188()) {
			if (!this.aClass11_Sub10_Sub4_1.method4088(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt6410 >= local29) {
						this.method847(local17, arg0, local29, local27 + local29, local27);
						local17.anInt6410 -= local29;
						break;
					}
					this.method847(local17, arg0, local17.anInt6410, local27 + local29, local27);
					local27 += local17.anInt6410;
					local29 -= local17.anInt6410;
				} while (!this.aClass11_Sub10_Sub4_1.method4064(local29, local17, arg0, local27));
			}
		}
	}
}
