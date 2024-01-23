import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class63_Sub1 extends Class63 implements Interface1 {

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	private int anInt5994 = 50;

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!vn", name = "Y", descriptor = "Lclient!th;")
	private Class168 aClass168_205;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "Lclient!th;")
	private Class168 aClass168_204;

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "Lclient!ta;")
	private Class162 aClass162_11;

	@OriginalMember(owner = "client!vn", name = "Z", descriptor = "Lclient!ta;")
	private Class162 aClass162_12;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!th;Lclient!th;Lclient!th;IZ)V")
	public Class63_Sub1(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass168_205 = arg2;
		this.aBoolean388 = arg4;
		this.aClass168_204 = arg0;
		this.anInt5994 = arg3;
		this.aClass162_11 = new Class162(this.anInt5994);
		if (Static294.aBoolean367) {
			this.aClass162_12 = new Class162(this.anInt5994);
		} else {
			this.aClass162_12 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method4606() {
		this.aClass162_11.method4006();
		if (this.aClass162_12 != null) {
			this.aClass162_12.method4006();
		}
		Static274.anIntArray493 = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static1.method4721(this.method4585(arg1).aByte10 & 0xFF, this.method4585(arg1).aByte9 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(26) Class1_Sub3_Sub20 local26 = this.method4614(arg1);
		if (local26 != null) {
			local21 = local26.method4155(this, this.aClass168_205, arg0);
		}
		if (!local21) {
			@Pc(49) Class1_Sub3_Sub23 local49 = this.method4607(arg1);
			local49.method4635();
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IZ)Lclient!wa;")
	private Class1_Sub3_Sub23 method4607(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub23 local11 = (Class1_Sub3_Sub23) this.aClass162_12.method4003((long) arg0);
		if (local11 == null) {
			local11 = new Class1_Sub3_Sub23(this.method4585(arg0).aShort50 & 0xFFFF);
			this.aClass162_12.method4005(local11, (long) arg0);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "(II)V")
	public void method4608(@OriginalArg(1) int arg0) {
		this.anInt5994 = arg0;
		this.aClass162_11 = new Class162(this.anInt5994);
		if (Static294.aBoolean367) {
			this.aClass162_12 = new Class162(this.anInt5994);
		} else {
			this.aClass162_12 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method4594(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub3_Sub20 local13 = this.method4614(arg0);
		return local13 == null ? false : local13.method4154(this, this.aClass168_205);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(II)V")
	@Override
	public void method4595(@OriginalArg(1) int arg0) {
		this.method4599(this.aBoolean388 || this.method4585(arg0).aBoolean169 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4602(@OriginalArg(0) int arg0) {
		return this.method4585(arg0).aBoolean168;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method4603(@OriginalArg(0) int arg0) {
		return !this.method4585(arg0).aBoolean167;
	}

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "(II)V")
	public void method4611(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub3_Sub20 local12 = (Class1_Sub3_Sub20) this.aClass162_11.method4007(); local12 != null; local12 = (Class1_Sub3_Sub20) this.aClass162_11.method4000()) {
			if (local12.aBoolean343) {
				local12.method4152(arg0);
				local12.aBoolean343 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZB)V")
	public void method4612(@OriginalArg(0) boolean arg0) {
		this.aBoolean388 = arg0;
		this.method4606();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4591(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub20 local8 = this.method4614(arg0);
		return local8 == null ? null : local8.method4156(this, this.aClass168_205, this.aBoolean388 || this.method4585(arg0).aBoolean169);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIFZI)Lclient!si;")
	@Override
	public Class1_Sub3_Sub13_Sub2 method4592(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1_Sub3_Sub20 local10 = this.method4614(arg3);
		if (local10 != null && local10.method4154(this, this.aClass168_205)) {
			return arg2 ? local10.aClass1_Sub3_Sub9_1.method2036(this, arg0, arg0, (double) arg1, this.aClass168_205) : local10.aClass1_Sub3_Sub9_1.method2035(arg0, this, arg0, (double) arg1, this.aClass168_205);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(II)I")
	@Override
	public int method4597(@OriginalArg(0) int arg0) {
		return this.method4585(arg0).aShort50 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method4604(@OriginalArg(0) int arg0) {
		return this.aBoolean388 || this.method4585(arg0).aBoolean169;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	@Override
	public int method4590(@OriginalArg(1) int arg0) {
		return this.method4585(arg0).aByte10 & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4600(@OriginalArg(1) int arg0) {
		return this.method4585(arg0).aByte11 & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(II)I")
	@Override
	public int method4596(@OriginalArg(0) int arg0) {
		return this.method4585(arg0).aByte12 & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)I")
	@Override
	public int method4601(@OriginalArg(0) int arg0) {
		return this.method4585(arg0).aByte9 & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "(II)Lclient!to;")
	private Class1_Sub3_Sub20 method4614(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub20 local11 = (Class1_Sub3_Sub20) this.aClass162_11.method4003((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(31) byte[] local31 = this.aClass168_204.method4058(0, arg0);
		if (local31 == null) {
			return null;
		} else {
			local11 = new Class1_Sub3_Sub20(new Class1_Sub14(local31));
			this.aClass162_11.method4005(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FIB)[I")
	@Override
	public int[] method4598(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub20 local8 = this.method4614(arg1);
		if (local8 == null) {
			return null;
		} else {
			local8.aBoolean343 = true;
			return local8.method4157(this, this.aClass168_205, arg0, this.aBoolean388 || this.method4585(arg1).aBoolean169);
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method4593(@OriginalArg(1) int arg0) {
		return this.method4585(arg0).aBoolean166;
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "(II)Lclient!jb;")
	@Override
	protected Class1_Sub3_Sub9 method4588(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub3_Sub20 local4 = this.method4614(arg0);
		return local4 == null ? null : local4.aClass1_Sub3_Sub9_1;
	}
}
