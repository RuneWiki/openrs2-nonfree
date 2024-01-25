import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class199 implements Interface8 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!wa;")
	private final Class261 aClass261_2 = new Class261(256);

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!um;")
	private final Class243 aClass243_187;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!um;")
	private final Class243 aClass243_186;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	private final int anInt5335;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[Lclient!oc;")
	private final Class178[] aClass178Array1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!um;Lclient!um;Lclient!um;)V")
	public Class199(@OriginalArg(0) Class243 arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_187 = arg2;
		this.aClass243_186 = arg1;
		@Pc(24) Class5_Sub15 local24 = new Class5_Sub15(arg0.method5455(0, 0));
		this.anInt5335 = local24.method5598();
		this.aClass178Array1 = new Class178[this.anInt5335];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5335; local36++) {
			if (local24.method5539() == 1) {
				this.aClass178Array1[local36] = new Class178();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt5335; local57++) {
			if (this.aClass178Array1[local57] != null) {
				this.aClass178Array1[local57].aBoolean321 = local24.method5539() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt5335; local87++) {
			if (this.aClass178Array1[local87] != null) {
				this.aClass178Array1[local87].aBoolean326 = local24.method5539() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt5335; local120++) {
			if (this.aClass178Array1[local120] != null) {
				this.aClass178Array1[local120].aBoolean324 = local24.method5539() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < this.anInt5335; local149++) {
			if (this.aClass178Array1[local149] != null) {
				this.aClass178Array1[local149].aBoolean318 = local24.method5539() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < this.anInt5335; local178++) {
			if (this.aClass178Array1[local178] != null) {
				this.aClass178Array1[local178].aByte52 = local24.method5600();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt5335; local204++) {
			if (this.aClass178Array1[local204] != null) {
				this.aClass178Array1[local204].aByte53 = local24.method5600();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt5335; local226++) {
			if (this.aClass178Array1[local226] != null) {
				this.aClass178Array1[local226].aByte55 = local24.method5600();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt5335; local248++) {
			if (this.aClass178Array1[local248] != null) {
				this.aClass178Array1[local248].aByte56 = local24.method5600();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.anInt5335; local274++) {
			if (this.aClass178Array1[local274] != null) {
				this.aClass178Array1[local274].aShort54 = (short) local24.method5598();
			}
		}
		for (@Pc(297) int local297 = 0; local297 < this.anInt5335; local297++) {
			if (this.aClass178Array1[local297] != null) {
				this.aClass178Array1[local297].aByte54 = local24.method5600();
			}
		}
		for (@Pc(319) int local319 = 0; local319 < this.anInt5335; local319++) {
			if (this.aClass178Array1[local319] != null) {
				this.aClass178Array1[local319].aByte50 = local24.method5600();
			}
		}
		for (@Pc(341) int local341 = 0; local341 < this.anInt5335; local341++) {
			if (this.aClass178Array1[local341] != null) {
				this.aClass178Array1[local341].aBoolean320 = local24.method5539() == 1;
			}
		}
		for (@Pc(368) int local368 = 0; local368 < this.anInt5335; local368++) {
			if (this.aClass178Array1[local368] != null) {
				this.aClass178Array1[local368].aBoolean325 = local24.method5539() == 1;
			}
		}
		for (@Pc(401) int local401 = 0; local401 < this.anInt5335; local401++) {
			if (this.aClass178Array1[local401] != null) {
				this.aClass178Array1[local401].aByte51 = local24.method5600();
			}
		}
		for (@Pc(427) int local427 = 0; local427 < this.anInt5335; local427++) {
			if (this.aClass178Array1[local427] != null) {
				this.aClass178Array1[local427].aBoolean327 = local24.method5539() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < this.anInt5335; local460++) {
			if (this.aClass178Array1[local460] != null) {
				this.aClass178Array1[local460].aBoolean319 = local24.method5539() == 1;
			}
		}
		for (@Pc(491) int local491 = 0; local491 < this.anInt5335; local491++) {
			if (this.aClass178Array1[local491] != null) {
				this.aClass178Array1[local491].aBoolean322 = local24.method5539() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt5335; local520++) {
			if (this.aClass178Array1[local520] != null) {
				this.aClass178Array1[local520].anInt4614 = local24.method5539();
			}
		}
		for (@Pc(546) int local546 = 0; local546 < this.anInt5335; local546++) {
			if (this.aClass178Array1[local546] != null) {
				this.aClass178Array1[local546].anInt4620 = local24.method5603();
			}
		}
		for (@Pc(568) int local568 = 0; local568 < this.anInt5335; local568++) {
			if (this.aClass178Array1[local568] != null) {
				this.aClass178Array1[local568].aBoolean323 = local24.method5539() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIZF)[I")
	@Override
	public int[] method4126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4) {
		return this.method4128(arg1).method3522(arg2, this.aClass178Array1[arg1].aBoolean325, arg0, this.aClass243_187, arg3, this, (double) arg4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!oc;")
	@Override
	public Class178 method4125(@OriginalArg(1) int arg0) {
		return this.aClass178Array1[arg0];
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lclient!no;")
	private Class5_Sub2_Sub12 method4128(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2 local10 = this.aClass261_2.method5897((long) arg0);
		if (local10 != null) {
			return (Class5_Sub2_Sub12) local10;
		}
		@Pc(21) byte[] local21 = this.aClass243_186.method5459(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(41) Class5_Sub2_Sub12 local41 = new Class5_Sub2_Sub12(new Class5_Sub15(local21));
			this.aClass261_2.method5900((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method4123(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub12 local13 = this.method4128(arg0);
		return local13 != null && local13.method3515(this, this.aClass243_187);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(FIZBII)[F")
	@Override
	public float[] method4127(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4128(arg2).method3517(this.aClass178Array1[arg2].aBoolean325, this.aClass243_187, this, arg3, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method4124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method4128(arg0).method3521(this.aClass178Array1[arg0].aBoolean325, (double) arg3, arg1, arg2, this.aClass243_187, this);
	}
}
