import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class24_Sub1 extends Class24 implements Interface5 {

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	private int anInt447 = 50;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!fh;")
	private Class58 aClass58_16;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!fh;")
	private Class58 aClass58_15;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "Lclient!dj;")
	private Class40 aClass40_4;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "Lclient!dj;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;IZ)V")
	public Class24_Sub1(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.anInt447 = arg3;
		this.aClass58_16 = arg2;
		this.aClass58_15 = arg0;
		this.aBoolean28 = arg4;
		this.aClass40_4 = new Class40(this.anInt447);
		if (Static94.aBoolean138) {
			this.aClass40_3 = new Class40(this.anInt447);
		} else {
			this.aClass40_3 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
	public void method457(@OriginalArg(0) boolean arg0) {
		this.aBoolean28 = arg0;
		this.method460();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IZ)I")
	@Override
	public int method450(@OriginalArg(0) int arg0) {
		return this.method417(arg0).aByte7 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method442(@OriginalArg(0) int arg0) {
		return this.method417(arg0).aBoolean233;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(II)V")
	public void method458(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class4_Sub3_Sub18 local13 = (Class4_Sub3_Sub18) this.aClass40_4.method886(); local13 != null; local13 = (Class4_Sub3_Sub18) this.aClass40_4.method890()) {
			if (local13.aBoolean345) {
				local13.method4111(arg0);
				local13.aBoolean345 = false;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method441(@OriginalArg(0) int arg0) {
		return !this.method417(arg0).aBoolean237;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(II)I")
	@Override
	public int method455(@OriginalArg(0) int arg0) {
		return this.method417(arg0).aByte9 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)[I")
	@Override
	public int[] method449(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub3_Sub18 local8 = this.method459(arg0);
		return local8 == null ? null : local8.method4108(this, this.aClass58_16, this.aBoolean28 || this.method417(arg0).aBoolean234);
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "(II)Lclient!so;")
	private Class4_Sub3_Sub18 method459(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub3_Sub18 local17 = (Class4_Sub3_Sub18) this.aClass40_4.method889((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(28) byte[] local28 = this.aClass58_15.method1372(arg0, 0);
		if (local28 == null) {
			return null;
		} else {
			local17 = new Class4_Sub3_Sub18(new Class4_Sub10(local28));
			this.aClass40_4.method888((long) arg0, local17);
			return local17;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZFZII)Lclient!vn;")
	@Override
	public Class4_Sub3_Sub14_Sub1 method452(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub3_Sub18 local8 = this.method459(arg3);
		if (local8 != null && local8.method4113(this, this.aClass58_16)) {
			return arg0 ? local8.aClass4_Sub3_Sub15_1.method2663(arg2, this, this.aClass58_16, (double) arg1, arg2) : local8.aClass4_Sub3_Sub15_1.method2658((double) arg1, arg2, this, this.aClass58_16, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method453(@OriginalArg(1) int arg0) {
		return this.aBoolean28 || this.method417(arg0).aBoolean234;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public void method460() {
		this.aClass40_4.method893();
		if (this.aClass40_3 != null) {
			this.aClass40_3.method893();
		}
		Static260.anIntArray539 = null;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	@Override
	public int method446(@OriginalArg(0) int arg0) {
		return this.method417(arg0).aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method448(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub3_Sub18 local15 = this.method459(arg0);
		return local15 == null ? false : local15.method4113(this, this.aClass58_16);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V")
	public void method463(@OriginalArg(0) int arg0) {
		this.anInt447 = arg0;
		this.aClass40_4 = new Class40(this.anInt447);
		if (Static94.aBoolean138) {
			this.aClass40_3 = new Class40(this.anInt447);
		} else {
			this.aClass40_3 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method443(@OriginalArg(1) int arg0) {
		return this.method417(arg0).aBoolean235;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	@Override
	public void method454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static164.method2665(this.method417(arg1).aByte8 & 0xFF, this.method417(arg1).aByte9 & 0xFF);
		@Pc(29) boolean local29 = false;
		@Pc(34) Class4_Sub3_Sub18 local34 = this.method459(arg1);
		if (local34 != null) {
			local29 = local34.method4114(this, this.aClass58_16, arg0);
		}
		if (!local29) {
			@Pc(50) Class4_Sub3_Sub16 local50 = this.method465(arg1);
			local50.method3576();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	@Override
	public int method447(@OriginalArg(1) int arg0) {
		return this.method417(arg0).aByte10 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IZ)Lclient!ln;")
	@Override
	protected Class4_Sub3_Sub15 method421(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub3_Sub18 local14 = this.method459(arg0);
		return local14 == null ? null : local14.aClass4_Sub3_Sub15_1;
	}

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(II)Lclient!qd;")
	private Class4_Sub3_Sub16 method465(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub3_Sub16 local11 = (Class4_Sub3_Sub16) this.aClass40_3.method889((long) arg0);
		if (local11 == null) {
			local11 = new Class4_Sub3_Sub16(this.method417(arg0).aShort26 & 0xFFFF);
			this.aClass40_3.method888((long) arg0, local11);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(II)V")
	@Override
	public void method451(@OriginalArg(1) int arg0) {
		this.method454(this.aBoolean28 || this.method417(arg0).aBoolean234 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method445(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub3_Sub18 local4 = this.method459(arg1);
		if (local4 == null) {
			return null;
		} else {
			local4.aBoolean345 = true;
			return local4.method4110(this, this.aClass58_16, arg0, this.aBoolean28 || this.method417(arg1).aBoolean234);
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	@Override
	public int method444(@OriginalArg(0) int arg0) {
		return this.method417(arg0).aByte8 & 0xFF;
	}
}
