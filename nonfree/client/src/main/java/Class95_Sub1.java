import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class95_Sub1 extends Class95 implements Interface1 {

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
	private int anInt3028 = 50;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "Lclient!cg;")
	private Class22 aClass22_55;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Lclient!cg;")
	private Class22 aClass22_54;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Lclient!nb;")
	private Class111 aClass111_13;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Lclient!nb;")
	private Class111 aClass111_12;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!cg;Lclient!cg;Lclient!cg;IZ)V")
	public Class95_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass22_55 = arg0;
		this.aClass22_54 = arg2;
		this.aBoolean188 = arg4;
		this.anInt3028 = arg3;
		this.aClass111_13 = new Class111(this.anInt3028);
		if (Static251.aBoolean330) {
			this.aClass111_12 = new Class111(this.anInt3028);
		} else {
			this.aClass111_12 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(II)I")
	@Override
	public int method2437(@OriginalArg(0) int arg0) {
		return this.method2413(arg0).aByte18 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I")
	@Override
	public int method2427(@OriginalArg(1) int arg0) {
		return this.method2413(arg0).aByte20 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2426(@OriginalArg(0) int arg0) {
		return this.method2413(arg0).aBoolean310;
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(II)V")
	public void method2439(@OriginalArg(0) int arg0) {
		this.anInt3028 = arg0;
		this.aClass111_13 = new Class111(this.anInt3028);
		if (Static251.aBoolean330) {
			this.aClass111_12 = new Class111(this.anInt3028);
		} else {
			this.aClass111_12 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(II)V")
	@Override
	public void method2436(@OriginalArg(0) int arg0) {
		this.method2424(arg0, this.aBoolean188 || this.method2413(arg0).aBoolean306 ? 64 : 128);
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method2435(@OriginalArg(1) int arg0) {
		return this.aBoolean188 || this.method2413(arg0).aBoolean306;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZF)[I")
	@Override
	public int[] method2432(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(8) Class4_Sub2_Sub21 local8 = this.method2443(arg0);
		if (local8 == null) {
			return null;
		} else {
			local8.aBoolean360 = true;
			return local8.method4257(this, this.aClass22_54, arg1, this.aBoolean188 || this.method2413(arg0).aBoolean306);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		Static126.method2046(this.method2413(arg0).aByte18 & 0xFF, this.method2413(arg0).aByte20 & 0xFF);
		@Pc(33) Class4_Sub2_Sub21 local33 = this.method2443(arg0);
		if (local33 != null) {
			local1 = local33.method4254(this, this.aClass22_54, arg1);
		}
		if (!local1) {
			@Pc(49) Class4_Sub2_Sub20 local49 = this.method2445(arg0);
			local49.method4049();
		}
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(II)Lclient!uc;")
	private Class4_Sub2_Sub21 method2443(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub2_Sub21 local11 = (Class4_Sub2_Sub21) this.aClass111_13.method2890((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(23) byte[] local23 = this.aClass22_55.method665(arg0, 0);
		if (local23 == null) {
			return null;
		} else {
			local11 = new Class4_Sub2_Sub21(new Class4_Sub24(local23));
			this.aClass111_13.method2886((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)Lclient!kj;")
	@Override
	protected Class4_Sub2_Sub12 method2416(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub2_Sub21 local13 = this.method2443(arg0);
		return local13 == null ? null : local13.aClass4_Sub2_Sub12_1;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method2430(@OriginalArg(1) int arg0) {
		return this.method2413(arg0).aBoolean308;
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(II)V")
	public void method2444(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class4_Sub2_Sub21 local7 = (Class4_Sub2_Sub21) this.aClass111_13.method2884(); local7 != null; local7 = (Class4_Sub2_Sub21) this.aClass111_13.method2888()) {
			if (local7.aBoolean360) {
				local7.method4256(arg0);
				local7.aBoolean360 = false;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIZFI)Lclient!n;")
	@Override
	public Class4_Sub2_Sub4_Sub2 method2428(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class4_Sub2_Sub21 local14 = this.method2443(arg3);
		if (local14 != null && local14.method4258(this, this.aClass22_54)) {
			return arg0 ? local14.aClass4_Sub2_Sub12_1.method2324(arg1, arg1, this, this.aClass22_54, (double) arg2) : local14.aClass4_Sub2_Sub12_1.method2320(this, arg1, (double) arg2, this.aClass22_54, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)I")
	@Override
	public int method2431(@OriginalArg(0) int arg0) {
		return this.method2413(arg0).aShort29 & 0xFFFF;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)Lclient!td;")
	private Class4_Sub2_Sub20 method2445(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub2_Sub20 local11 = (Class4_Sub2_Sub20) this.aClass111_12.method2890((long) arg0);
		if (local11 == null) {
			local11 = new Class4_Sub2_Sub20(this.method2413(arg0).aShort29 & 0xFFFF);
			this.aClass111_12.method2886((long) arg0, local11);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2429(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub2_Sub21 local13 = this.method2443(arg0);
		return local13 == null ? false : local13.method4258(this, this.aClass22_54);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	@Override
	public int method2425(@OriginalArg(1) int arg0) {
		return this.method2413(arg0).aByte19 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(ZI)V")
	public void method2447(@OriginalArg(0) boolean arg0) {
		this.aBoolean188 = arg0;
		this.method2450();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2433(@OriginalArg(0) int arg0) {
		return !this.method2413(arg0).aBoolean307;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2434(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub21 local8 = this.method2443(arg0);
		return local8 == null ? null : local8.method4255(this, this.aClass22_54, this.aBoolean188 || this.method2413(arg0).aBoolean306);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IZ)I")
	@Override
	public int method2438(@OriginalArg(0) int arg0) {
		return this.method2413(arg0).aByte17 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method2450() {
		this.aClass111_13.method2889();
		if (this.aClass111_12 != null) {
			this.aClass111_12.method2889();
		}
		Static270.anIntArray420 = null;
	}
}
