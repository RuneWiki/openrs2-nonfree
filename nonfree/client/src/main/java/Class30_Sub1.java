import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class30_Sub1 extends Class30 implements Interface5 {

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	private int anInt895 = 50;

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!nk;")
	private Class121 aClass121_29;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!nk;")
	private Class121 aClass121_30;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!qj;")
	private Class148 aClass148_4;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!qj;")
	private Class148 aClass148_5;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!nk;Lclient!nk;Lclient!nk;IZ)V")
	public Class30_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.anInt895 = arg3;
		this.aClass121_29 = arg2;
		this.aClass121_30 = arg0;
		this.aBoolean47 = arg4;
		this.aClass148_4 = new Class148(this.anInt895);
		if (Static156.aBoolean211) {
			this.aClass148_5 = new Class148(this.anInt895);
		} else {
			this.aClass148_5 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public void method792(@OriginalArg(1) boolean arg0) {
		this.aBoolean47 = arg0;
		this.method797();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZII)V")
	@Override
	public void method786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static90.method1648(this.method755(arg1).aByte22 & 0xFF, this.method755(arg1).aByte19 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(26) Class1_Sub2_Sub19 local26 = this.method798(arg1);
		if (local26 != null) {
			local21 = local26.method4111(this, this.aClass121_29, arg0);
		}
		if (!local21) {
			@Pc(44) Class1_Sub2_Sub10 local44 = this.method796(arg1);
			local44.method2838();
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(BI)Lclient!kd;")
	@Override
	protected Class1_Sub2_Sub8 method759(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub19 local4 = this.method798(arg0);
		return local4 == null ? null : local4.aClass1_Sub2_Sub8_1;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(BI)V")
	public void method793(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class1_Sub2_Sub19 local7 = (Class1_Sub2_Sub19) this.aClass148_4.method3609(); local7 != null; local7 = (Class1_Sub2_Sub19) this.aClass148_4.method3601()) {
			if (local7.aBoolean324) {
				local7.method4112(arg0);
				local7.aBoolean324 = false;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	@Override
	public void method782(@OriginalArg(1) int arg0) {
		this.method786(this.aBoolean47 || this.method755(arg0).aBoolean236 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method785(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aBoolean238;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method777(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aShort23 & 0xFFFF;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IB)I")
	@Override
	public int method784(@OriginalArg(0) int arg0) {
		return this.method755(arg0).aByte21 & 0xFF;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(II)Lclient!m;")
	private Class1_Sub2_Sub10 method796(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub10 local11 = (Class1_Sub2_Sub10) this.aClass148_5.method3600((long) arg0);
		if (local11 == null) {
			local11 = new Class1_Sub2_Sub10(this.method755(arg0).aShort23 & 0xFFFF);
			this.aClass148_5.method3602(local11, (long) arg0);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method779(@OriginalArg(0) int arg0) {
		return !this.method755(arg0).aBoolean240;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method783(@OriginalArg(1) int arg0) {
		return this.aBoolean47 || this.method755(arg0).aBoolean236;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public void method797() {
		this.aClass148_4.method3605();
		if (this.aClass148_5 != null) {
			this.aClass148_5.method3605();
		}
		Static260.anIntArray418 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method781(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aBoolean239;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(II)Lclient!sl;")
	private Class1_Sub2_Sub19 method798(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub19 local13 = (Class1_Sub2_Sub19) this.aClass148_4.method3600((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(25) byte[] local25 = this.aClass121_30.method3115(arg0, 0);
		if (local25 == null) {
			return null;
		} else {
			local13 = new Class1_Sub2_Sub19(new Class1_Sub14(local25));
			this.aClass148_4.method3602(local13, (long) arg0);
			return local13;
		}
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "(II)V")
	public void method799(@OriginalArg(1) int arg0) {
		this.anInt895 = arg0;
		this.aClass148_4 = new Class148(this.anInt895);
		if (Static156.aBoolean211) {
			this.aClass148_5 = new Class148(this.anInt895);
		} else {
			this.aClass148_5 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)I")
	@Override
	public int method788(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aByte22 & 0xFF;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
	@Override
	public int method778(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aByte20 & 0xFF;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method790(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub19 local4 = this.method798(arg1);
		if (local4 == null) {
			return null;
		} else {
			local4.aBoolean324 = true;
			return local4.method4110(this, this.aClass121_29, arg0, this.aBoolean47 || this.method755(arg1).aBoolean236);
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method787(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub19 local13 = this.method798(arg0);
		return local13 == null ? false : local13.method4109(this, this.aClass121_29);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IB)[I")
	@Override
	public int[] method780(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub19 local16 = this.method798(arg0);
		return local16 == null ? null : local16.method4108(this, this.aClass121_29, this.aBoolean47 || this.method755(arg0).aBoolean236);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIFB)Lclient!ch;")
	@Override
	public Class1_Sub2_Sub1_Sub2 method789(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(14) Class1_Sub2_Sub19 local14 = this.method798(arg0);
		if (local14 != null && local14.method4109(this, this.aClass121_29)) {
			return arg1 ? local14.aClass1_Sub2_Sub8_1.method2463(this, arg2, (double) arg3, arg2, this.aClass121_29) : local14.aClass1_Sub2_Sub8_1.method2462(arg2, this.aClass121_29, (double) arg3, arg2, this);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(II)I")
	@Override
	public int method791(@OriginalArg(1) int arg0) {
		return this.method755(arg0).aByte19 & 0xFF;
	}
}
