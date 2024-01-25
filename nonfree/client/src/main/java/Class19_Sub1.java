import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
	public boolean aBoolean393 = false;

	static {
		new Class142("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!nt;)V")
	public Class19_Sub1(@OriginalArg(0) Class177 arg0) {
		super.anInt4238 = 3;
		this.method3350(true);
		super.aBoolean388 = true;
		super.anInt4230 = 0;
		super.aBoolean387 = true;
		super.aBoolean385 = false;
		super.anInt4229 = 0;
		super.aBoolean379 = true;
		super.aBoolean383 = true;
		super.anInt4237 = 1;
		super.aBoolean389 = true;
		super.aBoolean380 = true;
		super.anInt4225 = 255;
		super.anInt4234 = 0;
		super.anInt4226 = 127;
		super.aBoolean381 = true;
		super.anInt4222 = 2;
		super.anInt4218 = 0;
		super.aBoolean392 = true;
		super.aBoolean391 = true;
		super.anInt4240 = 0;
		super.aBoolean378 = true;
		super.anInt4221 = 127;
		if (Static45.anInt669 >= 96) {
			Static151.method1903(2);
		} else {
			Static151.method1903(0);
		}
		super.aBoolean390 = true;
		super.aBoolean377 = false;
		super.anInt4233 = 0;
		super.anInt4231 = 0;
		super.aBoolean384 = true;
		super.aBoolean382 = false;
		super.anInt4227 = Static188.anInt3431 == 1 ? 2 : 4;
		super.anInt4220 = 2;
		super.anInt4219 = 2;
		super.aBoolean375 = false;
		@Pc(129) Class235 local129 = null;
		try {
			@Pc(135) Class253 local135 = arg0.method3832(true, "");
			while (local135.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (local135.anInt6669 == 1) {
				local129 = (Class235) local135.anObject9;
				@Pc(157) byte[] local157 = new byte[(int) local129.method4941()];
				@Pc(172) int local172;
				for (@Pc(159) int local159 = 0; local159 < local157.length; local159 += local172) {
					local172 = local129.method4940(local159, local157, local157.length - local159);
					if (local172 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3352(new Class1_Sub19(local157));
			}
		} catch (@Pc(197) Exception local197) {
		}
		try {
			if (local129 != null) {
				local129.method4942();
			}
		} catch (@Pc(204) Exception local204) {
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(ZI)Z")
	public boolean method3344(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean386 : true;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Lclient!wm;")
	public Class1_Sub19 method3345() {
		@Pc(8) Class1_Sub19 local8 = new Class1_Sub19(41);
		local8.method2934(17);
		local8.method2934(super.anInt4238);
		local8.method2934(super.aBoolean386 ? 1 : 0);
		local8.method2934(super.aBoolean388 ? 1 : 0);
		local8.method2934(super.aBoolean387 ? 1 : 0);
		local8.method2934(super.aBoolean378 ? 1 : 0);
		local8.method2934(0);
		local8.method2934(super.aBoolean389 ? 1 : 0);
		local8.method2934(super.aBoolean392 ? 1 : 0);
		local8.method2934(super.aBoolean381 ? 1 : 0);
		local8.method2934(super.anInt4222);
		local8.method2934(super.anInt4234);
		local8.method2934(super.aBoolean391 ? 1 : 0);
		local8.method2934(super.aBoolean385 ? 1 : 0);
		local8.method2934(super.aBoolean379 ? 1 : 0);
		local8.method2934(super.aBoolean383 ? 1 : 0);
		local8.method2934(super.anInt4229);
		local8.method2934(super.aBoolean380 ? 1 : 0);
		local8.method2934(super.anInt4226);
		local8.method2934(super.anInt4225);
		local8.method2934(super.anInt4221);
		local8.method2930(super.anInt4240);
		local8.method2930(super.anInt4230);
		local8.method2934(Static60.method838());
		local8.method2912(super.anInt4231);
		local8.method2934(super.anInt4220);
		local8.method2934(super.aBoolean375 ? 1 : 0);
		local8.method2934(super.aBoolean382 ? 1 : 0);
		local8.method2934(super.anInt4233);
		local8.method2934(super.aBoolean377 ? 1 : 0);
		local8.method2934(super.aBoolean390 ? 1 : 0);
		local8.method2934(super.anInt4237);
		local8.method2934(super.aBoolean384 ? 1 : 0);
		local8.method2934(super.anInt4219);
		local8.method2934(super.anInt4227);
		local8.method2934(super.aBoolean376 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLclient!nt;)V")
	public void method3346(@OriginalArg(1) Class177 arg0) {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(21) Class253 local21 = arg0.method3832(true, "");
			while (local21.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (local21.anInt6669 == 1) {
				local7 = (Class235) local21.anObject9;
				@Pc(43) Class1_Sub19 local43 = this.method3345();
				local7.method4943(0, local43.anInt3698, local43.aByteArray38);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method4942();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I")
	public int method3348(@OriginalArg(1) int arg0) {
		if (this.aBoolean393) {
			return 0;
		} else if (this.method3353(arg0)) {
			return super.aBoolean388 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V")
	public void method3350(@OriginalArg(0) boolean arg0) {
		super.aBoolean386 = arg0;
		if (Static86.aClass248_7 != null) {
			Static86.aClass248_7.method5244(!this.method3353(Static214.anInt3968));
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!wm;Z)V")
	private void method3352(@OriginalArg(0) Class1_Sub19 arg0) {
		if (arg0.aByteArray38.length - arg0.anInt3698 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method2915();
		if (local18 < 0 || local18 > 17) {
			return;
		}
		@Pc(36) byte local36;
		if (local18 == 17) {
			local36 = 40;
		} else if (local18 == 16) {
			local36 = 38;
		} else if (local18 == 15) {
			local36 = 37;
		} else if (local18 == 14) {
			local36 = 36;
		} else if (local18 == 13) {
			local36 = 35;
		} else if (local18 == 12) {
			local36 = 34;
		} else if (local18 == 11) {
			local36 = 33;
		} else if (local18 == 10) {
			local36 = 32;
		} else if (local18 == 9) {
			local36 = 31;
		} else if (local18 == 8) {
			local36 = 30;
		} else if (local18 == 7) {
			local36 = 29;
		} else if (local18 == 6) {
			local36 = 28;
		} else if (local18 == 5) {
			local36 = 28;
		} else if (local18 == 4) {
			local36 = 24;
		} else if (local18 == 3) {
			local36 = 23;
		} else if (local18 == 2) {
			local36 = 22;
		} else if (local18 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (local36 > arg0.aByteArray38.length - arg0.anInt3698) {
			return;
		}
		super.anInt4238 = arg0.method2915();
		if (super.anInt4238 < 1) {
			super.anInt4238 = 1;
		} else if (super.anInt4238 > 4) {
			super.anInt4238 = 4;
		}
		this.method3350(arg0.method2915() == 1);
		super.aBoolean388 = arg0.method2915() == 1;
		super.aBoolean387 = arg0.method2915() == 1;
		super.aBoolean378 = arg0.method2915() == 1;
		super.anInt4237 = arg0.method2915() == 1 ? 1 : 0;
		super.aBoolean389 = arg0.method2915() == 1;
		super.aBoolean392 = arg0.method2915() == 1;
		super.aBoolean381 = arg0.method2915() == 1;
		super.anInt4222 = arg0.method2915();
		if (super.anInt4222 > 2) {
			super.anInt4222 = 2;
		}
		if (local18 >= 17) {
			super.anInt4234 = arg0.method2915();
		}
		if (local18 < 2) {
			super.aBoolean391 = arg0.method2915() == 1;
			arg0.method2915();
		} else {
			super.aBoolean391 = arg0.method2915() == 1;
			if (local18 >= 17) {
				super.aBoolean385 = arg0.method2915() == 1;
			}
		}
		super.aBoolean379 = arg0.method2915() == 1;
		super.aBoolean383 = arg0.method2915() == 1;
		super.anInt4229 = arg0.method2915();
		if (super.anInt4229 > 2) {
			super.anInt4229 = 2;
		}
		super.anInt4218 = super.anInt4229;
		super.aBoolean380 = arg0.method2915() == 1;
		super.anInt4226 = arg0.method2915();
		if (super.anInt4226 > 127) {
			super.anInt4226 = 127;
		}
		super.anInt4225 = arg0.method2915();
		super.anInt4221 = arg0.method2915();
		if (super.anInt4221 > 127) {
			super.anInt4221 = 127;
		}
		if (local18 >= 1) {
			super.anInt4240 = arg0.method2896();
			super.anInt4230 = arg0.method2896();
		}
		if (local18 >= 3 && local18 < 6) {
			arg0.method2915();
		}
		@Pc(488) int local488;
		if (local18 >= 4) {
			local488 = arg0.method2915();
			if (local488 < 0 || local488 > 2) {
				local488 = 0;
			}
			if (Static45.anInt669 < 96) {
				local488 = 0;
			}
			Static151.method1903(local488);
		}
		if (local18 >= 5) {
			super.anInt4231 = arg0.method2877();
		}
		local488 = 0;
		if (local18 >= 6) {
			super.anInt4220 = local488 = arg0.method2915();
		}
		if (super.anInt4220 != 1 && super.anInt4220 != 2) {
			super.anInt4220 = 2;
		}
		if (local18 >= 7) {
			super.aBoolean375 = arg0.method2915() == 1;
		}
		if (local18 >= 8) {
			super.aBoolean382 = arg0.method2915() == 1;
		}
		if (local18 >= 9) {
			super.anInt4233 = arg0.method2915();
		}
		if (super.anInt4233 < 0 || super.anInt4233 > Static137.method1748(Static45.anInt669)) {
			super.anInt4233 = 0;
		}
		if (local18 >= 10) {
			super.aBoolean377 = arg0.method2915() != 0;
		}
		if (local18 >= 11) {
			super.aBoolean390 = arg0.method2915() != 0;
		}
		if (local18 >= 12) {
			super.anInt4237 = arg0.method2915();
		}
		if (super.anInt4237 < 0 || super.anInt4237 > 2) {
			super.anInt4237 = 1;
		}
		if (local18 >= 13) {
			super.aBoolean384 = arg0.method2915() == 1;
		}
		if (local18 >= 14) {
			super.anInt4219 = arg0.method2915();
		} else if (local488 == 0) {
			super.anInt4219 = 2;
		} else {
			super.anInt4219 = 1;
		}
		if (super.anInt4219 < 0 || super.anInt4219 > 3) {
			super.anInt4219 = 2;
		}
		if (local18 >= 15) {
			super.anInt4227 = arg0.method2915();
			if (super.anInt4227 < 0 || super.anInt4227 > 4) {
				super.anInt4227 = Static188.anInt3431 == 1 ? 2 : 4;
			}
		}
		if (local18 >= 16) {
			super.aBoolean376 = arg0.method2915() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean376 = false;
				}
			} catch (@Pc(756) Throwable local756) {
			}
		}
		if (local18 < 17 && super.anInt4219 == 0) {
			super.anInt4219 = 2;
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)Z")
	public boolean method3353(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean394 ? super.aBoolean386 : true;
	}
}
