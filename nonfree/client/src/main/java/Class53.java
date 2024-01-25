import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class53 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public int anInt1219;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public int anInt1220;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ns;")
	public Class177 aClass177_2;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Z")
	public boolean aBoolean106 = false;

	static {
		new Class96("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLclient!qa;I)Lclient!f;")
	public Class78 method995(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg2 << 16 | this.anInt1219 | (arg0 ? 262144 : 0) | arg1.anInt5745 << 19);
		@Pc(38) Class78 local38 = (Class78) this.aClass177_2.aClass151_116.method3288(local24);
		if (local38 != null) {
			return local38;
		} else if (this.aClass177_2.aClass109_62.method2348(this.anInt1219)) {
			@Pc(60) Class63 local60 = Static457.method1163(this.aClass177_2.aClass109_62, this.anInt1219, 0);
			if (local60 != null) {
				local60.anInt1471 = local60.anInt1473 = local60.anInt1469 = local60.anInt1468 = 0;
				if (arg0) {
					local60.method1169();
				}
				for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
					local60.method1160();
				}
			}
			local38 = arg1.method4589(local60);
			if (local38 != null) {
				this.aClass177_2.aClass151_116.method3291(local24, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method998(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method1001(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z")
	public boolean method1000() {
		return this.aClass177_2.aClass109_62.method2348(this.anInt1219);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method1001(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1219 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt1220 = arg0.method4496();
		} else if (arg1 == 3) {
			this.aBoolean106 = true;
		} else if (arg1 == 4) {
			this.anInt1219 = -1;
		}
	}
}
