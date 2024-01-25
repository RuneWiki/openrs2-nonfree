import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
	public static final int[] anIntArray4 = new int[32];

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!mg;")
	public final Class156 aClass156_2 = new Class156();

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Lclient!mn;")
	public final Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1 = new Class2_Sub1_Sub4();

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!br;")
	private final Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray4[local6] = local4 - 1;
			local4 += local4;
		}
		new Class134("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!br;)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		this.aClass2_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3224() {
		@Pc(9) Class2_Sub16 local9 = (Class2_Sub16) this.aClass156_2.method3155();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub1_Sub3_2 == null) {
			return this.method3226();
		} else {
			return local9.aClass2_Sub1_Sub3_2;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	@Override
	public void method3228(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_Sub4_1.method3228(arg0);
		for (@Pc(15) Class2_Sub16 local15 = (Class2_Sub16) this.aClass156_2.method3155(); local15 != null; local15 = (Class2_Sub16) this.aClass156_2.method3150()) {
			if (!this.aClass2_Sub1_Sub2_1.method581(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1939 >= local25) {
						this.method34(local15, local25);
						local15.anInt1939 -= local25;
						break;
					}
					this.method34(local15, local15.anInt1939);
					local25 -= local15.anInt1939;
				} while (!this.aClass2_Sub1_Sub2_1.method601(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()I")
	@Override
	public int method3223() {
		return 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!er;I)V")
	private void method34(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub1_Sub2_1.anIntArray76[arg0.anInt1932] & 0x4) != 0 && arg0.anInt1931 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub1_Sub2_1.anIntArray78[arg0.anInt1932] / Static333.anInt5628;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt1934) / local30;
			arg0.anInt1934 = arg1 * local30 + arg0.anInt1934 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass2_Sub1_Sub2_1.anIntArray82[arg0.anInt1932] == 0) {
					arg0.aClass2_Sub1_Sub3_2 = Static462.method1581(arg0.aClass2_Sub22_Sub1_2, arg0.aClass2_Sub1_Sub3_2.method1578(), arg0.aClass2_Sub1_Sub3_2.method1590(), arg0.aClass2_Sub1_Sub3_2.method1579());
				} else {
					arg0.aClass2_Sub1_Sub3_2 = Static462.method1581(arg0.aClass2_Sub22_Sub1_2, arg0.aClass2_Sub1_Sub3_2.method1578(), 0, arg0.aClass2_Sub1_Sub3_2.method1579());
					this.aClass2_Sub1_Sub2_1.method587(arg0.aClass2_Sub23_1.aShortArray15[arg0.anInt1937] < 0, arg0);
				}
				if (arg0.aClass2_Sub23_1.aShortArray15[arg0.anInt1937] < 0) {
					arg0.aClass2_Sub1_Sub3_2.method1598(-1);
				}
				arg1 = arg0.anInt1934 / local30;
			}
		}
		arg0.aClass2_Sub1_Sub3_2.method3228(arg1);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "([III)V")
	@Override
	public void method3229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub1_Sub4_1.method3229(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub16 local17 = (Class2_Sub16) this.aClass156_2.method3155(); local17 != null; local17 = (Class2_Sub16) this.aClass156_2.method3150()) {
			if (!this.aClass2_Sub1_Sub2_1.method581(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1939) {
						this.method35(arg0, local17, local27, local29 + local27, local29);
						local17.anInt1939 -= local27;
						break;
					}
					this.method35(arg0, local17, local17.anInt1939, local27 + local29, local29);
					local27 -= local17.anInt1939;
					local29 += local17.anInt1939;
				} while (!this.aClass2_Sub1_Sub2_1.method601(local17, arg0, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3226() {
		@Pc(9) Class2_Sub16 local9;
		do {
			local9 = (Class2_Sub16) this.aClass156_2.method3150();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub1_Sub3_2 == null);
		return local9.aClass2_Sub1_Sub3_2;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([IILclient!er;III)V")
	private void method35(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class2_Sub16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub1_Sub2_1.anIntArray76[arg1.anInt1932] & 0x4) != 0 && arg1.anInt1931 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub1_Sub2_1.anIntArray78[arg1.anInt1932] / Static333.anInt5628;
			while (true) {
				@Pc(45) int local45 = (local34 + 1048575 - arg1.anInt1934) / local34;
				if (local45 > arg2) {
					arg1.anInt1934 += local34 * arg2;
					break;
				}
				arg1.aClass2_Sub1_Sub3_2.method3229(arg0, arg4, local45);
				arg2 -= local45;
				arg4 += local45;
				arg1.anInt1934 += local34 * local45 - 1048576;
				@Pc(76) int local76 = Static333.anInt5628 / 100;
				@Pc(80) int local80 = 262144 / local34;
				if (local76 > local80) {
					local76 = local80;
				}
				@Pc(92) Class2_Sub1_Sub3 local92 = arg1.aClass2_Sub1_Sub3_2;
				if (this.aClass2_Sub1_Sub2_1.anIntArray82[arg1.anInt1932] == 0) {
					arg1.aClass2_Sub1_Sub3_2 = Static462.method1581(arg1.aClass2_Sub22_Sub1_2, local92.method1578(), local92.method1590(), local92.method1579());
				} else {
					arg1.aClass2_Sub1_Sub3_2 = Static462.method1581(arg1.aClass2_Sub22_Sub1_2, local92.method1578(), 0, local92.method1579());
					this.aClass2_Sub1_Sub2_1.method587(arg1.aClass2_Sub23_1.aShortArray15[arg1.anInt1937] < 0, arg1);
					arg1.aClass2_Sub1_Sub3_2.method1583(local76, local92.method1590());
				}
				if (arg1.aClass2_Sub23_1.aShortArray15[arg1.anInt1937] < 0) {
					arg1.aClass2_Sub1_Sub3_2.method1598(-1);
				}
				local92.method1566(local76);
				local92.method3229(arg0, arg4, arg3 - arg4);
				if (local92.method1567()) {
					this.aClass2_Sub1_Sub4_1.method3232(local92);
				}
			}
		}
		arg1.aClass2_Sub1_Sub3_2.method3229(arg0, arg4, arg2);
	}
}
