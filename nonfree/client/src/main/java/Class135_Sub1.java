import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!kl", name = "R", descriptor = "Z")
	public boolean aBoolean333 = false;

	@OriginalMember(owner = "client!kl", name = "U", descriptor = "Z")
	public boolean aBoolean334 = false;

	static {
		new Class169("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class135_Sub1(@OriginalArg(0) Class162 arg0) {
		super.anInt3373 = 3;
		this.method2749(true);
		super.anInt3376 = 0;
		super.anInt3382 = 127;
		super.aBoolean322 = true;
		super.aBoolean332 = true;
		super.anInt3377 = 1;
		super.anInt3381 = 0;
		super.anInt3384 = 2;
		super.aBoolean321 = true;
		super.aBoolean320 = true;
		super.anInt3372 = 0;
		super.aBoolean325 = true;
		super.aBoolean328 = true;
		super.aBoolean327 = true;
		super.anInt3374 = 127;
		super.aBoolean326 = true;
		super.anInt3378 = 0;
		super.aBoolean317 = true;
		super.anInt3379 = 255;
		super.aBoolean324 = true;
		if (Static294.anInt5063 < 96) {
			Static310.method4626(0);
		} else {
			Static310.method4626(2);
		}
		super.aBoolean329 = false;
		super.anInt3385 = Static323.anInt5471 == 1 ? 2 : 4;
		super.aBoolean323 = false;
		super.aBoolean316 = false;
		super.aBoolean330 = true;
		super.aBoolean318 = true;
		super.anInt3371 = 0;
		super.anInt3380 = 2;
		super.anInt3383 = 0;
		super.anInt3375 = 2;
		@Pc(121) Class237 local121 = null;
		try {
			@Pc(125) Class112 local125 = arg0.method3268();
			while (local125.anInt2969 == 0) {
				Static57.method5056(1L);
			}
			if (local125.anInt2969 == 1) {
				local121 = (Class237) local125.anObject5;
				@Pc(147) byte[] local147 = new byte[(int) local121.method5211()];
				@Pc(161) int local161;
				for (@Pc(149) int local149 = 0; local149 < local147.length; local149 += local161) {
					local161 = local121.method5209(local147, local147.length - local149, local149);
					if (local161 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2750(new Class1_Sub33(local147));
			}
		} catch (@Pc(191) Exception local191) {
		}
		try {
			if (local121 != null) {
				local121.method5212();
			}
		} catch (@Pc(198) Exception local198) {
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)Z")
	public boolean method2744(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean319 : true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!ng;)V")
	public void method2746(@OriginalArg(1) Class162 arg0) {
		@Pc(7) Class237 local7 = null;
		try {
			@Pc(11) Class112 local11 = arg0.method3268();
			while (local11.anInt2969 == 0) {
				Static57.method5056(1L);
			}
			if (local11.anInt2969 == 1) {
				local7 = (Class237) local11.anObject5;
				@Pc(31) Class1_Sub33 local31 = this.method2748();
				local7.method5208(local31.aByteArray86, local31.lb, 0);
			}
		} catch (@Pc(41) Exception local41) {
		}
		try {
			if (local7 != null) {
				local7.method5212();
			}
		} catch (@Pc(48) Exception local48) {
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
	public boolean method2747(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean334 ? super.aBoolean319 : true;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Lclient!re;")
	public Class1_Sub33 method2748() {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(39);
		local8.method5165(16);
		local8.method5165(super.anInt3373);
		local8.method5165(super.aBoolean319 ? 1 : 0);
		local8.method5165(super.aBoolean321 ? 1 : 0);
		local8.method5165(super.aBoolean326 ? 1 : 0);
		local8.method5165(super.aBoolean328 ? 1 : 0);
		local8.method5165(0);
		local8.method5165(super.aBoolean322 ? 1 : 0);
		local8.method5165(super.aBoolean320 ? 1 : 0);
		local8.method5165(super.aBoolean327 ? 1 : 0);
		local8.method5165(super.anInt3384);
		local8.method5165(super.aBoolean332 ? 1 : 0);
		local8.method5165(super.aBoolean324 ? 1 : 0);
		local8.method5165(super.aBoolean317 ? 1 : 0);
		local8.method5165(super.anInt3376);
		local8.method5165(super.aBoolean325 ? 1 : 0);
		local8.method5165(super.anInt3382);
		local8.method5165(super.anInt3379);
		local8.method5165(super.anInt3374);
		local8.method5138(super.anInt3378);
		local8.method5138(super.anInt3381);
		local8.method5165(Static176.method2585());
		local8.method5142(super.anInt3371);
		local8.method5165(super.anInt3380);
		local8.method5165(super.aBoolean323 ? 1 : 0);
		local8.method5165(super.aBoolean329 ? 1 : 0);
		local8.method5165(super.anInt3383);
		local8.method5165(super.aBoolean316 ? 1 : 0);
		local8.method5165(super.aBoolean318 ? 1 : 0);
		local8.method5165(super.anInt3377);
		local8.method5165(super.aBoolean330 ? 1 : 0);
		local8.method5165(super.anInt3375);
		local8.method5165(super.anInt3385);
		local8.method5165(super.aBoolean331 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)V")
	public void method2749(@OriginalArg(0) boolean arg0) {
		super.aBoolean319 = arg0;
		if (Static54.aClass153_1 != null) {
			Static54.aClass153_1.method3087(!this.method2747(Static25.anInt394));
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!re;I)V")
	private void method2750(@OriginalArg(0) Class1_Sub33 arg0) {
		if (arg0.aByteArray86.length - arg0.lb < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method5174();
		if (local23 < 0 || local23 > 16) {
			return;
		}
		@Pc(34) byte local34;
		if (local23 == 16) {
			local34 = 38;
		} else if (local23 == 15) {
			local34 = 37;
		} else if (local23 == 14) {
			local34 = 36;
		} else if (local23 == 13) {
			local34 = 35;
		} else if (local23 == 12) {
			local34 = 34;
		} else if (local23 == 11) {
			local34 = 33;
		} else if (local23 == 10) {
			local34 = 32;
		} else if (local23 == 9) {
			local34 = 31;
		} else if (local23 == 8) {
			local34 = 30;
		} else if (local23 == 7) {
			local34 = 29;
		} else if (local23 == 6) {
			local34 = 28;
		} else if (local23 == 5) {
			local34 = 28;
		} else if (local23 == 4) {
			local34 = 24;
		} else if (local23 == 3) {
			local34 = 23;
		} else if (local23 == 2) {
			local34 = 22;
		} else if (local23 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray86.length - arg0.lb) {
			return;
		}
		super.anInt3373 = arg0.method5174();
		if (super.anInt3373 < 1) {
			super.anInt3373 = 1;
		} else if (super.anInt3373 > 4) {
			super.anInt3373 = 4;
		}
		this.method2749(arg0.method5174() == 1);
		super.aBoolean321 = arg0.method5174() == 1;
		super.aBoolean326 = arg0.method5174() == 1;
		super.aBoolean328 = arg0.method5174() == 1;
		super.anInt3377 = arg0.method5174() == 1 ? 1 : 0;
		super.aBoolean322 = arg0.method5174() == 1;
		super.aBoolean320 = arg0.method5174() == 1;
		super.aBoolean327 = arg0.method5174() == 1;
		super.anInt3384 = arg0.method5174();
		if (super.anInt3384 > 2) {
			super.anInt3384 = 2;
		}
		if (local23 < 2) {
			super.aBoolean332 = arg0.method5174() == 1;
			arg0.method5174();
		} else {
			super.aBoolean332 = arg0.method5174() == 1;
		}
		super.aBoolean324 = arg0.method5174() == 1;
		super.aBoolean317 = arg0.method5174() == 1;
		super.anInt3376 = arg0.method5174();
		if (super.anInt3376 > 2) {
			super.anInt3376 = 2;
		}
		super.anInt3372 = super.anInt3376;
		super.aBoolean325 = arg0.method5174() == 1;
		super.anInt3382 = arg0.method5174();
		if (super.anInt3382 > 127) {
			super.anInt3382 = 127;
		}
		super.anInt3379 = arg0.method5174();
		super.anInt3374 = arg0.method5174();
		if (super.anInt3374 > 127) {
			super.anInt3374 = 127;
		}
		if (local23 >= 1) {
			super.anInt3378 = arg0.method5177();
			super.anInt3381 = arg0.method5177();
		}
		if (local23 >= 3 && local23 < 6) {
			arg0.method5174();
		}
		@Pc(457) int local457;
		if (local23 >= 4) {
			local457 = arg0.method5174();
			if (local457 < 0 || local457 > 2) {
				local457 = 0;
			}
			if (Static294.anInt5063 < 96) {
				local457 = 0;
			}
			Static310.method4626(local457);
		}
		if (local23 >= 5) {
			super.anInt3371 = arg0.method5150();
		}
		local457 = 0;
		if (local23 >= 6) {
			super.anInt3380 = local457 = arg0.method5174();
		}
		if (super.anInt3380 != 1 && super.anInt3380 != 2) {
			super.anInt3380 = 2;
		}
		if (local23 >= 7) {
			super.aBoolean323 = arg0.method5174() == 1;
		}
		if (local23 >= 8) {
			super.aBoolean329 = arg0.method5174() == 1;
		}
		if (local23 >= 9) {
			super.anInt3383 = arg0.method5174();
		}
		if (super.anInt3383 < 0 || super.anInt3383 > Static43.method680(Static294.anInt5063)) {
			super.anInt3383 = 0;
		}
		if (local23 >= 10) {
			super.aBoolean316 = arg0.method5174() != 0;
		}
		if (local23 >= 11) {
			super.aBoolean318 = arg0.method5174() != 0;
		}
		if (local23 >= 12) {
			super.anInt3377 = arg0.method5174();
		}
		if (super.anInt3377 < 0 || super.anInt3377 > 2) {
			super.anInt3377 = 1;
		}
		if (local23 >= 13) {
			super.aBoolean330 = arg0.method5174() == 1;
		}
		if (local23 >= 14) {
			super.anInt3375 = arg0.method5174();
		} else if (local457 == 0) {
			super.anInt3375 = 2;
		} else {
			super.anInt3375 = 1;
		}
		if (super.anInt3375 < 0 || super.anInt3375 > 3) {
			super.anInt3375 = 2;
		}
		if (local23 >= 15) {
			super.anInt3385 = arg0.method5174();
			if (super.anInt3385 < 0 || super.anInt3385 > 4) {
				super.anInt3385 = Static323.anInt5471 == 1 ? 2 : 4;
			}
		}
		if (local23 >= 16) {
			super.aBoolean331 = arg0.method5174() != 1;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)I")
	public int method2751(@OriginalArg(1) int arg0) {
		if (this.aBoolean333) {
			return 0;
		} else if (this.method2747(arg0)) {
			return super.aBoolean321 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
