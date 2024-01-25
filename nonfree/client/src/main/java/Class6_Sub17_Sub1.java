import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class6_Sub17_Sub1 extends Class6_Sub17 {

	@OriginalMember(owner = "client!vaa", name = "zb", descriptor = "I")
	public int anInt9310;

	@OriginalMember(owner = "client!vaa", name = "ub", descriptor = "Z")
	public boolean aBoolean617 = false;

	@OriginalMember(owner = "client!vaa", name = "qb", descriptor = "Z")
	public boolean aBoolean616 = false;

	@OriginalMember(owner = "client!vaa", name = "Ab", descriptor = "Z")
	public boolean aBoolean618 = false;

	@OriginalMember(owner = "client!vaa", name = "Bb", descriptor = "Z")
	public boolean aBoolean619 = false;

	@OriginalMember(owner = "client!vaa", name = "kb", descriptor = "Z")
	public boolean aBoolean615 = false;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class6_Sub17_Sub1(@OriginalArg(0) Class313 arg0) {
		super.anInt9274 = 3;
		super.anInt9289 = 3;
		this.method7358(true);
		super.anInt9288 = 127;
		super.aBoolean609 = true;
		super.aBoolean612 = false;
		super.anInt9282 = 0;
		super.aBoolean610 = true;
		super.aBoolean601 = true;
		super.anInt9272 = 0;
		super.aBoolean606 = true;
		super.anInt9268 = 0;
		super.anInt9290 = 0;
		super.aBoolean602 = true;
		super.aBoolean611 = true;
		super.anInt9287 = 127;
		super.anInt9284 = 0;
		super.anInt9279 = 127;
		super.anInt9269 = 127;
		super.anInt9276 = 2;
		super.anInt9286 = 127;
		super.aBoolean604 = true;
		super.aBoolean614 = true;
		super.aBoolean600 = true;
		super.anInt9277 = 1;
		super.aBoolean613 = true;
		if (Static355.anInt6598 < 96) {
			Static282.method4301(0);
		} else {
			Static282.method4301(2);
		}
		super.aBoolean599 = true;
		super.anInt9281 = 2;
		super.anInt9271 = Static182.anInt3500 == 1 ? 2 : 4;
		super.aBoolean608 = true;
		super.anInt9291 = 0;
		super.anInt9278 = 0;
		super.anInt9292 = 0;
		super.aBoolean603 = false;
		super.aBoolean598 = false;
		super.aBoolean597 = false;
		super.anInt9294 = 2;
		@Pc(150) Class108 local150 = null;
		try {
			@Pc(156) Class224 local156 = arg0.method6994("", true);
			while (local156.anInt6632 == 0) {
				Static183.method3079(1L);
			}
			if (local156.anInt6632 == 1) {
				local150 = (Class108) local156.anObject14;
				@Pc(181) byte[] local181 = new byte[(int) local150.method2449()];
				@Pc(196) int local196;
				for (@Pc(183) int local183 = 0; local183 < local181.length; local183 += local196) {
					local196 = local150.method2451(local183, local181.length - local183, local181);
					if (local196 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method7369(new Class6_Sub12(local181));
			}
		} catch (@Pc(222) Exception local222) {
		}
		try {
			if (local150 != null) {
				local150.method2453();
			}
		} catch (@Pc(229) Exception local229) {
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)Z")
	public boolean method7353(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean618 ? super.aBoolean607 : true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public void method7354() {
		this.method7358(true);
		super.aBoolean605 = false;
		super.aBoolean604 = false;
		super.aBoolean602 = false;
		super.aBoolean609 = false;
		super.anInt9276 = super.anInt9284 = 0;
		super.aBoolean606 = false;
		super.anInt9277 = 0;
		super.aBoolean613 = false;
		super.anInt9268 = super.anInt9282 = 0;
		super.aBoolean612 = false;
		super.aBoolean601 = false;
		super.aBoolean614 = true;
		super.aBoolean611 = false;
		super.aBoolean610 = false;
		Static282.method4301(0);
		super.aBoolean603 = false;
		super.aBoolean599 = true;
		super.anInt9291 = 0;
		this.method7367();
		this.method7368(2);
		super.anInt9289 = 2;
		Static28.method407();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)I")
	public int method7355(@OriginalArg(1) int arg0) {
		if (Static258.method3975(arg0) && !Static111.method1702(Static375.anInt9162)) {
			return Static355.anInt6598 < 96 && Static473.method6560(arg0) && super.anInt9278 == 0 ? 1 : super.anInt9278;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)I")
	public int method7356() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static174.aClass313_24.aBoolean569 && !Static174.aClass313_24.aBoolean570) {
			if (Static508.aString77.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static508.aString74.startsWith("amd64") && !Static508.aString74.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean616) {
			local11 = false;
		}
		if (this.aBoolean619) {
			local7 = false;
		}
		if (this.aBoolean615) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method7362();
		}
		@Pc(66) int local66 = -1;
		@Pc(74) int local74 = -1;
		if (local7) {
			try {
				local66 = Static500.method6914(1000, 2);
			} catch (@Pc(85) Exception local85) {
			}
		}
		@Pc(88) int local88 = -1;
		if (local11) {
			try {
				local88 = Static500.method6914(1000, 3);
				if (Static79.anInt2700 == 3) {
					@Pc(101) Class102 local101 = Static554.aClass90_12.method7450();
					@Pc(106) long local106 = local101.aLong49 & 0xFFFFFFFFFFFFL;
					@Pc(109) int local109 = local101.anInt2764;
					if (local109 == 4318) {
						local9 &= local106 >= 64425238954L;
					} else if (local109 == 4098) {
						local9 &= local106 >= 60129613779L;
					}
				}
			} catch (@Pc(145) Exception local145) {
			}
		}
		if (local9) {
			try {
				local74 = Static500.method6914(1000, 1);
			} catch (@Pc(157) Exception local157) {
			}
		}
		if (local66 == -1 && local74 == -1 && local88 == -1) {
			return this.method7362();
		}
		local74 = (int) ((float) local74 * 1.1F);
		local88 = (int) ((float) local88 * 1.1F);
		if (local88 < local66 && local74 < local66) {
			return this.method7363(local66);
		} else if (local74 >= local88) {
			return this.method7370(local74, 1);
		} else {
			return this.method7370(local88, 3);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BI)Z")
	public boolean method7357(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean607 : true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZB)V")
	public void method7358(@OriginalArg(0) boolean arg0) {
		super.aBoolean607 = arg0;
		if (Static85.aClass27_1 != null) {
			Static85.aClass27_1.method518(!this.method7353(Static79.anInt2700));
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!tt;)V")
	public void method7359(@OriginalArg(1) Class313 arg0) {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(13) Class224 local13 = arg0.method6994("", true);
			while (local13.anInt6632 == 0) {
				Static183.method3079(1L);
			}
			if (local13.anInt6632 == 1) {
				local7 = (Class108) local13.anObject14;
				@Pc(37) Class6_Sub12 local37 = new Class6_Sub12(Static457.method6387());
				this.method7352(local37);
				local7.method2447(local37.aByteArray97, 0, local37.anInt7556);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method2453();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(BI)I")
	public int method7360(@OriginalArg(1) int arg0) {
		if (this.aBoolean617) {
			return 0;
		} else if (this.method7353(arg0)) {
			return super.aBoolean613 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public void method7361() {
		this.method7358(true);
		super.aBoolean605 = true;
		super.aBoolean604 = true;
		super.aBoolean611 = true;
		super.anInt9268 = super.anInt9282 = 0;
		super.aBoolean609 = true;
		super.aBoolean610 = true;
		super.aBoolean606 = true;
		super.aBoolean601 = true;
		super.aBoolean614 = true;
		super.anInt9276 = super.anInt9284 = 2;
		super.aBoolean613 = true;
		super.aBoolean602 = true;
		super.anInt9277 = 1;
		super.aBoolean612 = true;
		if (Static355.anInt6598 <= 95) {
			Static282.method4301(0);
		} else {
			Static282.method4301(2);
		}
		super.aBoolean603 = false;
		super.aBoolean599 = true;
		super.anInt9291 = 0;
		this.method7367();
		this.method7368(0);
		super.anInt9289 = 4;
		Static28.method407();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I")
	private int method7362() {
		@Pc(10) byte local10;
		if (Static355.anInt6598 < 96) {
			local10 = 1;
			this.method7365();
		} else {
			@Pc(18) int local18 = Static31.method504();
			if (local18 <= 100) {
				this.method7361();
				local10 = 4;
			} else if (local18 <= 500) {
				this.method7366();
				local10 = 3;
			} else if (local18 <= 1000) {
				this.method7354();
				local10 = 2;
			} else {
				local10 = 1;
				this.method7365();
			}
		}
		if (Static79.anInt2700 != 0) {
			super.anInt9281 = 0;
			Static584.method7942(0);
		}
		this.method7359(Static174.aClass313_24);
		return local10;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)I")
	private int method7363(@OriginalArg(1) int arg0) {
		@Pc(13) byte local13;
		if (arg0 > 12000) {
			this.method7361();
			local13 = 4;
		} else if (arg0 > 5000) {
			this.method7366();
			local13 = 3;
		} else if (arg0 > 2000) {
			local13 = 2;
			this.method7354();
		} else {
			this.method7365();
			local13 = 1;
		}
		if (Static79.anInt2700 != 2) {
			super.anInt9281 = 2;
			Static584.method7942(2);
		}
		this.method7359(Static174.aClass313_24);
		return local13;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	public void method7365() {
		this.method7358(false);
		super.aBoolean613 = false;
		super.aBoolean610 = false;
		super.aBoolean604 = false;
		super.aBoolean602 = false;
		super.aBoolean612 = false;
		super.aBoolean601 = false;
		super.anInt9276 = super.anInt9284 = 0;
		super.aBoolean611 = false;
		super.aBoolean614 = false;
		super.anInt9268 = super.anInt9282 = 0;
		super.aBoolean605 = false;
		super.aBoolean609 = false;
		super.anInt9277 = 0;
		super.aBoolean606 = false;
		Static282.method4301(0);
		super.aBoolean599 = false;
		super.aBoolean603 = false;
		super.anInt9291 = 0;
		this.method7367();
		this.method7368(2);
		super.anInt9289 = 1;
		Static28.method407();
	}

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "(I)V")
	public void method7366() {
		this.method7358(true);
		super.aBoolean606 = true;
		super.aBoolean611 = true;
		super.aBoolean610 = true;
		super.anInt9268 = super.anInt9282 = 0;
		super.aBoolean601 = true;
		super.anInt9276 = super.anInt9284 = 1;
		super.aBoolean609 = true;
		super.aBoolean604 = false;
		super.aBoolean605 = true;
		super.aBoolean602 = true;
		super.anInt9277 = 1;
		super.aBoolean614 = true;
		super.aBoolean613 = true;
		super.aBoolean612 = false;
		if (Static355.anInt6598 > 95) {
			Static282.method4301(1);
		} else {
			Static282.method4301(0);
		}
		super.anInt9291 = 0;
		super.aBoolean603 = false;
		super.aBoolean599 = true;
		this.method7367();
		this.method7368(1);
		super.anInt9289 = 3;
		Static28.method407();
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(B)V")
	private void method7367() {
		if (Static182.anInt3500 <= 1) {
			super.anInt9271 = 2;
		} else {
			super.anInt9271 = 4;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(BI)V")
	public void method7368(@OriginalArg(1) int arg0) {
		Static258.aBoolean348 = true;
		Static334.aClass178Array1 = null;
		super.anInt9278 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!jr;I)V")
	private void method7369(@OriginalArg(0) Class6_Sub12 arg0) {
		if (arg0.aByteArray97.length - arg0.anInt7556 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6019();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(37) byte local37;
		if (local21 == 22) {
			local37 = 45;
		} else if (local21 == 21) {
			local37 = 44;
		} else if (local21 == 20) {
			local37 = 43;
		} else if (local21 == 19) {
			local37 = 42;
		} else if (local21 == 18) {
			local37 = 41;
		} else if (local21 == 17) {
			local37 = 40;
		} else if (local21 == 16) {
			local37 = 38;
		} else if (local21 == 15) {
			local37 = 37;
		} else if (local21 == 14) {
			local37 = 36;
		} else if (local21 == 13) {
			local37 = 35;
		} else if (local21 == 12) {
			local37 = 34;
		} else if (local21 == 11) {
			local37 = 33;
		} else if (local21 == 10) {
			local37 = 32;
		} else if (local21 == 9) {
			local37 = 31;
		} else if (local21 == 8) {
			local37 = 30;
		} else if (local21 == 7) {
			local37 = 29;
		} else if (local21 == 6) {
			local37 = 28;
		} else if (local21 == 5) {
			local37 = 28;
		} else if (local21 == 4) {
			local37 = 24;
		} else if (local21 == 3) {
			local37 = 23;
		} else if (local21 == 2) {
			local37 = 22;
		} else if (local21 == 1) {
			local37 = 23;
		} else {
			local37 = 19;
		}
		if (arg0.aByteArray97.length - arg0.anInt7556 < local37) {
			return;
		}
		super.anInt9274 = arg0.method6019();
		if (super.anInt9274 < 1) {
			super.anInt9274 = 1;
		} else if (super.anInt9274 > 4) {
			super.anInt9274 = 4;
		}
		this.method7358(arg0.method6019() == 1);
		super.aBoolean613 = arg0.method6019() == 1;
		super.aBoolean614 = arg0.method6019() == 1;
		super.aBoolean601 = arg0.method6019() == 1;
		super.anInt9277 = arg0.method6019() == 1 ? 1 : 0;
		super.aBoolean609 = arg0.method6019() == 1;
		super.aBoolean606 = arg0.method6019() == 1;
		super.aBoolean602 = arg0.method6019() == 1;
		super.anInt9276 = arg0.method6019();
		if (super.anInt9276 > 2) {
			super.anInt9276 = 2;
		}
		if (local21 >= 17) {
			super.anInt9284 = arg0.method6019();
		}
		if (local21 < 2) {
			super.aBoolean611 = arg0.method6019() == 1;
			arg0.method6019();
		} else {
			super.aBoolean611 = arg0.method6019() == 1;
			if (local21 >= 17) {
				super.aBoolean612 = arg0.method6019() == 1;
			}
		}
		super.aBoolean604 = arg0.method6019() == 1;
		super.aBoolean610 = arg0.method6019() == 1;
		super.anInt9268 = arg0.method6019();
		if (super.anInt9268 > 2) {
			super.anInt9268 = 2;
		}
		super.anInt9282 = super.anInt9268;
		super.aBoolean600 = arg0.method6019() == 1;
		super.anInt9279 = arg0.method6019();
		if (super.anInt9279 > 127) {
			super.anInt9279 = 127;
		}
		if (local21 < 20) {
			super.anInt9288 = super.anInt9279;
		} else {
			super.anInt9288 = arg0.method6019();
			if (super.anInt9288 > 127) {
				super.anInt9288 = 127;
			}
		}
		super.anInt9287 = arg0.method6019();
		super.anInt9286 = arg0.method6019();
		if (super.anInt9286 > 127) {
			super.anInt9286 = 127;
		}
		if (local21 >= 21) {
			super.anInt9269 = arg0.method6019();
			if (super.anInt9269 > 127) {
				super.anInt9269 = 127;
			}
		} else {
			super.anInt9269 = super.anInt9287;
		}
		if (local21 >= 1) {
			super.anInt9290 = arg0.method6044();
			super.anInt9272 = arg0.method6044();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method6019();
		}
		@Pc(568) int local568;
		if (local21 >= 4) {
			local568 = arg0.method6019();
			if (local568 < 0 || local568 > 2) {
				local568 = 0;
			}
			if (Static355.anInt6598 < 96) {
				local568 = 0;
			}
			Static282.method4301(local568);
		}
		if (local21 >= 5) {
			super.anInt9292 = arg0.method6015();
		}
		local568 = 0;
		if (local21 >= 6) {
			super.anInt9294 = local568 = arg0.method6019();
		}
		if (super.anInt9294 != 1 && super.anInt9294 != 2) {
			super.anInt9294 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean597 = arg0.method6019() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean598 = arg0.method6019() == 1;
		}
		if (local21 >= 9) {
			super.anInt9291 = arg0.method6019();
		}
		if (super.anInt9291 < 0 || super.anInt9291 > Static371.method6427(Static355.anInt6598)) {
			super.anInt9291 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean603 = arg0.method6019() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean608 = arg0.method6019() != 0;
		}
		if (local21 >= 12) {
			super.anInt9277 = arg0.method6019();
		}
		if (super.anInt9277 < 0 || super.anInt9277 > 2) {
			super.anInt9277 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean599 = arg0.method6019() == 1;
		}
		if (local21 >= 14) {
			super.anInt9281 = arg0.method6019();
		} else if (local568 == 0) {
			super.anInt9281 = 2;
		} else {
			super.anInt9281 = 1;
		}
		if (super.anInt9281 < 0 || super.anInt9281 > 5) {
			super.anInt9281 = 2;
		}
		if (local21 >= 15) {
			super.anInt9271 = arg0.method6019();
			if (super.anInt9271 < 0 || super.anInt9271 > 4) {
				super.anInt9271 = Static182.anInt3500 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean605 = arg0.method6019() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean605 = false;
				}
			} catch (@Pc(830) Throwable local830) {
			}
		}
		if (local21 < 17 && super.anInt9281 == 0) {
			super.anInt9281 = 2;
		}
		if (local21 >= 18) {
			super.anInt9289 = arg0.method6019();
			if (super.anInt9289 < 0 || super.anInt9289 > 4) {
				super.anInt9289 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt9278 = arg0.method6019();
		} else if (super.anInt9289 == 1 || super.anInt9289 == 2) {
			super.anInt9278 = 2;
		} else if (super.anInt9289 == 3) {
			super.anInt9278 = 1;
		} else {
			super.anInt9278 = 0;
		}
		if (local21 >= 22) {
			super.anInt9270 = arg0.method6019();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIB)I")
	private int method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) byte local17;
		if (arg0 > 20000) {
			local17 = 4;
			this.method7361();
		} else if (arg0 > 10000) {
			local17 = 3;
			this.method7366();
		} else if (arg0 > 5000) {
			this.method7354();
			local17 = 2;
		} else {
			local17 = 1;
			this.method7365();
		}
		if (arg1 != Static79.anInt2700) {
			super.anInt9281 = arg1;
			Static584.method7942(arg1);
		}
		this.method7359(Static174.aClass313_24);
		return local17;
	}
}
