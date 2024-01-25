import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "[I")
	public static final int[] anIntArray225 = new int[16384];

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
	public static final int[] anIntArray224 = new int[16384];

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Z")
	public boolean aBoolean309 = false;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray225[local11] = (int) (Math.sin(local9 * (double) local11) * 32768.0D);
			anIntArray224[local11] = (int) (Math.cos((double) local11 * local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class50_Sub1(@OriginalArg(0) Class66 arg0) {
		super.anInt3436 = 3;
		this.method2859(true);
		super.aBoolean295 = true;
		super.aBoolean293 = true;
		super.anInt3439 = 255;
		super.aBoolean305 = true;
		super.anInt3435 = 2;
		super.anInt3450 = 0;
		super.aBoolean306 = true;
		super.anInt3449 = 127;
		super.aBoolean298 = true;
		super.anInt3431 = 0;
		super.anInt3448 = 127;
		super.aBoolean296 = true;
		super.aBoolean294 = true;
		super.anInt3440 = 0;
		super.anInt3442 = 0;
		super.anInt3430 = 0;
		super.aBoolean299 = true;
		super.aBoolean291 = true;
		super.aBoolean301 = false;
		super.aBoolean302 = true;
		super.anInt3433 = 1;
		if (Static70.anInt1503 >= 96) {
			Static157.method2673(2);
		} else {
			Static157.method2673(0);
		}
		super.anInt3434 = 0;
		super.aBoolean303 = false;
		super.aBoolean289 = true;
		super.aBoolean304 = true;
		super.anInt3447 = 2;
		super.aBoolean297 = false;
		super.anInt3445 = 2;
		super.anInt3437 = Static249.anInt4622 == 1 ? 2 : 4;
		super.anInt3428 = 0;
		super.aBoolean300 = false;
		@Pc(129) Class207 local129 = null;
		try {
			@Pc(134) Class199 local134 = arg0.method1738("");
			while (local134.anInt5760 == 0) {
				Static435.method5503(1L);
			}
			if (local134.anInt5760 == 1) {
				local129 = (Class207) local134.anObject29;
				@Pc(156) byte[] local156 = new byte[(int) local129.method4717()];
				@Pc(171) int local171;
				for (@Pc(158) int local158 = 0; local158 < local156.length; local158 += local171) {
					local171 = local129.method4715(local158, local156.length - local158, local156);
					if (local171 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2862(new Class4_Sub12(local156));
			}
		} catch (@Pc(196) Exception local196) {
		}
		try {
			if (local129 != null) {
				local129.method4713();
			}
		} catch (@Pc(203) Exception local203) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!et;B)V")
	public void method2856(@OriginalArg(0) Class66 arg0) {
		@Pc(7) Class207 local7 = null;
		try {
			@Pc(20) Class199 local20 = arg0.method1738("");
			while (local20.anInt5760 == 0) {
				Static435.method5503(1L);
			}
			if (local20.anInt5760 == 1) {
				local7 = (Class207) local20.anObject29;
				@Pc(40) Class4_Sub12 local40 = this.method2863();
				local7.method4714(0, local40.anInt2997, local40.aByteArray36);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method4713();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Z")
	public boolean method2857(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean290 : true;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I")
	public int method2858(@OriginalArg(0) int arg0) {
		if (this.aBoolean309) {
			return 0;
		} else if (this.method2861(arg0)) {
			return super.aBoolean306 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	public void method2859(@OriginalArg(1) boolean arg0) {
		super.aBoolean290 = arg0;
		if (Static267.aClass262_2 != null) {
			Static267.aClass262_2.method5562(!this.method2861(Static177.anInt2973));
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)Z")
	public boolean method2861(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean308 ? super.aBoolean290 : true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!iv;I)V")
	private void method2862(@OriginalArg(0) Class4_Sub12 arg0) {
		if (arg0.aByteArray36.length - arg0.anInt2997 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2490();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(42) byte local42;
		if (local21 == 17) {
			local42 = 40;
		} else if (local21 == 16) {
			local42 = 38;
		} else if (local21 == 15) {
			local42 = 37;
		} else if (local21 == 14) {
			local42 = 36;
		} else if (local21 == 13) {
			local42 = 35;
		} else if (local21 == 12) {
			local42 = 34;
		} else if (local21 == 11) {
			local42 = 33;
		} else if (local21 == 10) {
			local42 = 32;
		} else if (local21 == 9) {
			local42 = 31;
		} else if (local21 == 8) {
			local42 = 30;
		} else if (local21 == 7) {
			local42 = 29;
		} else if (local21 == 6) {
			local42 = 28;
		} else if (local21 == 5) {
			local42 = 28;
		} else if (local21 == 4) {
			local42 = 24;
		} else if (local21 == 3) {
			local42 = 23;
		} else if (local21 == 2) {
			local42 = 22;
		} else if (local21 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (arg0.aByteArray36.length - arg0.anInt2997 < local42) {
			return;
		}
		super.anInt3436 = arg0.method2490();
		if (super.anInt3436 < 1) {
			super.anInt3436 = 1;
		} else if (super.anInt3436 > 4) {
			super.anInt3436 = 4;
		}
		this.method2859(arg0.method2490() == 1);
		super.aBoolean306 = arg0.method2490() == 1;
		super.aBoolean305 = arg0.method2490() == 1;
		super.aBoolean296 = arg0.method2490() == 1;
		super.anInt3433 = arg0.method2490() == 1 ? 1 : 0;
		super.aBoolean295 = arg0.method2490() == 1;
		super.aBoolean293 = arg0.method2490() == 1;
		super.aBoolean302 = arg0.method2490() == 1;
		super.anInt3435 = arg0.method2490();
		if (super.anInt3435 > 2) {
			super.anInt3435 = 2;
		}
		if (local21 >= 17) {
			super.anInt3430 = arg0.method2490();
		}
		if (local21 < 2) {
			super.aBoolean299 = arg0.method2490() == 1;
			arg0.method2490();
		} else {
			super.aBoolean299 = arg0.method2490() == 1;
			if (local21 >= 17) {
				super.aBoolean301 = arg0.method2490() == 1;
			}
		}
		super.aBoolean294 = arg0.method2490() == 1;
		super.aBoolean298 = arg0.method2490() == 1;
		super.anInt3442 = arg0.method2490();
		if (super.anInt3442 > 2) {
			super.anInt3442 = 2;
		}
		super.anInt3440 = super.anInt3442;
		super.aBoolean291 = arg0.method2490() == 1;
		super.anInt3448 = arg0.method2490();
		if (super.anInt3448 > 127) {
			super.anInt3448 = 127;
		}
		super.anInt3439 = arg0.method2490();
		super.anInt3449 = arg0.method2490();
		if (super.anInt3449 > 127) {
			super.anInt3449 = 127;
		}
		if (local21 >= 1) {
			super.anInt3431 = arg0.method2536();
			super.anInt3450 = arg0.method2536();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method2490();
		}
		@Pc(474) int local474;
		if (local21 >= 4) {
			local474 = arg0.method2490();
			if (local474 < 0 || local474 > 2) {
				local474 = 0;
			}
			if (Static70.anInt1503 < 96) {
				local474 = 0;
			}
			Static157.method2673(local474);
		}
		if (local21 >= 5) {
			super.anInt3428 = arg0.method2529();
		}
		local474 = 0;
		if (local21 >= 6) {
			super.anInt3447 = local474 = arg0.method2490();
		}
		if (super.anInt3447 != 1 && super.anInt3447 != 2) {
			super.anInt3447 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean297 = arg0.method2490() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean303 = arg0.method2490() == 1;
		}
		if (local21 >= 9) {
			super.anInt3434 = arg0.method2490();
		}
		if (super.anInt3434 < 0 || super.anInt3434 > Static53.method898(Static70.anInt1503)) {
			super.anInt3434 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean300 = arg0.method2490() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean304 = arg0.method2490() != 0;
		}
		if (local21 >= 12) {
			super.anInt3433 = arg0.method2490();
		}
		if (super.anInt3433 < 0 || super.anInt3433 > 2) {
			super.anInt3433 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean289 = arg0.method2490() == 1;
		}
		if (local21 >= 14) {
			super.anInt3445 = arg0.method2490();
		} else if (local474 == 0) {
			super.anInt3445 = 2;
		} else {
			super.anInt3445 = 1;
		}
		if (super.anInt3445 < 0 || super.anInt3445 > 3) {
			super.anInt3445 = 2;
		}
		if (local21 >= 15) {
			super.anInt3437 = arg0.method2490();
			if (super.anInt3437 < 0 || super.anInt3437 > 4) {
				super.anInt3437 = Static249.anInt4622 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean307 = arg0.method2490() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean307 = false;
				}
			} catch (@Pc(736) Throwable local736) {
			}
		}
		if (local21 < 17 && super.anInt3445 == 0) {
			super.anInt3445 = 2;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lclient!iv;")
	public Class4_Sub12 method2863() {
		@Pc(8) Class4_Sub12 local8 = new Class4_Sub12(41);
		local8.method2551(17);
		local8.method2551(super.anInt3436);
		local8.method2551(super.aBoolean290 ? 1 : 0);
		local8.method2551(super.aBoolean306 ? 1 : 0);
		local8.method2551(super.aBoolean305 ? 1 : 0);
		local8.method2551(super.aBoolean296 ? 1 : 0);
		local8.method2551(0);
		local8.method2551(super.aBoolean295 ? 1 : 0);
		local8.method2551(super.aBoolean293 ? 1 : 0);
		local8.method2551(super.aBoolean302 ? 1 : 0);
		local8.method2551(super.anInt3435);
		local8.method2551(super.anInt3430);
		local8.method2551(super.aBoolean299 ? 1 : 0);
		local8.method2551(super.aBoolean301 ? 1 : 0);
		local8.method2551(super.aBoolean294 ? 1 : 0);
		local8.method2551(super.aBoolean298 ? 1 : 0);
		local8.method2551(super.anInt3442);
		local8.method2551(super.aBoolean291 ? 1 : 0);
		local8.method2551(super.anInt3448);
		local8.method2551(super.anInt3439);
		local8.method2551(super.anInt3449);
		local8.method2524(super.anInt3431);
		local8.method2524(super.anInt3450);
		local8.method2551(Static218.method3279());
		local8.method2531(super.anInt3428);
		local8.method2551(super.anInt3447);
		local8.method2551(super.aBoolean297 ? 1 : 0);
		local8.method2551(super.aBoolean303 ? 1 : 0);
		local8.method2551(super.anInt3434);
		local8.method2551(super.aBoolean300 ? 1 : 0);
		local8.method2551(super.aBoolean304 ? 1 : 0);
		local8.method2551(super.anInt3433);
		local8.method2551(super.aBoolean289 ? 1 : 0);
		local8.method2551(super.anInt3445);
		local8.method2551(super.anInt3437);
		local8.method2551(super.aBoolean307 ? 1 : 0);
		return local8;
	}
}
