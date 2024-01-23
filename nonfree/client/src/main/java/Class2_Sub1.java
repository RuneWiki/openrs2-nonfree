import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub1 extends Class2 implements Interface2 {

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Z")
	private boolean aBoolean300 = false;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	private int anInt5664 = 50;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!kb;")
	private Class83 aClass83_182;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!kb;")
	private Class83 aClass83_183;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Lclient!pm;")
	private Class125 aClass125_8;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "Lclient!pm;")
	private Class125 aClass125_9;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;IZ)V")
	public Class2_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass83_182 = arg0;
		this.anInt5664 = arg3;
		this.aBoolean300 = arg4;
		this.aClass83_183 = arg2;
		this.aClass125_8 = new Class125(this.anInt5664);
		if (Static296.aBoolean335) {
			this.aClass125_9 = new Class125(this.anInt5664);
		} else {
			this.aClass125_9 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method4420(@OriginalArg(0) int arg0) {
		return this.method4404(arg0).aBoolean256;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)I")
	@Override
	public int method4417(@OriginalArg(1) int arg0) {
		return this.method4404(arg0).aByte19 & 0xFF;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V")
	public void method4427(@OriginalArg(0) boolean arg0) {
		this.aBoolean300 = arg0;
		this.method4428();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)I")
	@Override
	public int method4422(@OriginalArg(0) int arg0) {
		return this.method4404(arg0).aByte17 & 0xFF;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method4414(@OriginalArg(1) int arg0) {
		return !this.method4404(arg0).aBoolean254;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(II)I")
	@Override
	public int method4424(@OriginalArg(1) int arg0) {
		return this.method4404(arg0).aByte18 & 0xFF;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method4413(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub10 local4 = this.method4433(arg0);
		return local4 == null ? false : local4.method1773(this, this.aClass83_183);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method4428() {
		this.aClass125_8.method3666();
		if (this.aClass125_9 != null) {
			this.aClass125_9.method3666();
		}
		Static109.anIntArray238 = null;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(II)V")
	@Override
	public void method4421(@OriginalArg(1) int arg0) {
		this.method4425(this.aBoolean300 || this.method4404(arg0).aBoolean251 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(BI)V")
	public void method4430(@OriginalArg(1) int arg0) {
		this.anInt5664 = arg0;
		this.aClass125_8 = new Class125(this.anInt5664);
		if (Static296.aBoolean335) {
			this.aClass125_9 = new Class125(this.anInt5664);
		} else {
			this.aClass125_9 = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIFII)Lclient!n;")
	@Override
	public Class1_Sub2_Sub14_Sub1 method4412(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class1_Sub2_Sub10 local4 = this.method4433(arg3);
		if (local4 != null && local4.method1773(this, this.aClass83_183)) {
			return arg0 ? local4.aClass1_Sub2_Sub5_1.method1153(arg1, arg1, this, (double) arg2, this.aClass83_183) : local4.aClass1_Sub2_Sub5_1.method1154(arg1, this, arg1, this.aClass83_183, (double) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method4423(@OriginalArg(0) int arg0) {
		return this.aBoolean300 || this.method4404(arg0).aBoolean251;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(BI)Lclient!da;")
	private Class1_Sub2_Sub4 method4432(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub4 local11 = (Class1_Sub2_Sub4) this.aClass125_9.method3669((long) arg0);
		if (local11 == null) {
			local11 = new Class1_Sub2_Sub4(this.method4404(arg0).aShort36 & 0xFFFF);
			this.aClass125_9.method3671(local11, (long) arg0);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	@Override
	public void method4425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static141.method2524(this.method4404(arg1).aByte18 & 0xFF, this.method4404(arg1).aByte17 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(33) Class1_Sub2_Sub10 local33 = this.method4433(arg1);
		if (local33 != null) {
			local21 = local33.method1774(this, this.aClass83_183, arg0);
		}
		if (!local21) {
			@Pc(50) Class1_Sub2_Sub4 local50 = this.method4432(arg1);
			local50.method914();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4411(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub10 local15 = this.method4433(arg0);
		return local15 == null ? null : local15.method1776(this, this.aClass83_183, this.aBoolean300 || this.method4404(arg0).aBoolean251);
	}

	@OriginalMember(owner = "client!u", name = "i", descriptor = "(II)Lclient!ef;")
	@Override
	protected Class1_Sub2_Sub5 method4408(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub10 local4 = this.method4433(arg0);
		return local4 == null ? null : local4.aClass1_Sub2_Sub5_1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method4418(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub2_Sub10 local14 = this.method4433(arg1);
		if (local14 == null) {
			return null;
		} else {
			local14.aBoolean131 = true;
			return local14.method1775(this, this.aClass83_183, arg0, this.aBoolean300 || this.method4404(arg1).aBoolean251);
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(BI)Lclient!ia;")
	private Class1_Sub2_Sub10 method4433(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub2_Sub10 local17 = (Class1_Sub2_Sub10) this.aClass125_8.method3669((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(29) byte[] local29 = this.aClass83_182.method2306(arg0, 0);
		if (local29 == null) {
			return null;
		} else {
			local17 = new Class1_Sub2_Sub10(new Class1_Sub16(local29));
			this.aClass125_8.method3671(local17, (long) arg0);
			return local17;
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method4419(@OriginalArg(0) int arg0) {
		return this.method4404(arg0).aBoolean253;
	}

	@OriginalMember(owner = "client!u", name = "j", descriptor = "(II)V")
	public void method4434(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class1_Sub2_Sub10 local18 = (Class1_Sub2_Sub10) this.aClass125_8.method3670(); local18 != null; local18 = (Class1_Sub2_Sub10) this.aClass125_8.method3668()) {
			if (local18.aBoolean131) {
				local18.method1771(arg0);
				local18.aBoolean131 = false;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
	@Override
	public int method4416(@OriginalArg(1) int arg0) {
		return this.method4404(arg0).aShort36 & 0xFFFF;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)I")
	@Override
	public int method4415(@OriginalArg(0) int arg0) {
		return this.method4404(arg0).aByte20 & 0xFF;
	}
}
