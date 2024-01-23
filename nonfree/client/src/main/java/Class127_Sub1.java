import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class127_Sub1 extends Class127 implements Interface5 {

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
	private int anInt4341 = 50;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "Lclient!jd;")
	private Class84 aClass84_94;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "Lclient!jd;")
	private Class84 aClass84_93;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!fa;")
	private Class53 aClass53_7;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "Lclient!fa;")
	private Class53 aClass53_8;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!jd;Lclient!jd;Lclient!jd;IZ)V")
	public Class127_Sub1(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass84_94 = arg2;
		this.aClass84_93 = arg0;
		this.aBoolean355 = arg4;
		this.anInt4341 = arg3;
		this.aClass53_7 = new Class53(this.anInt4341);
		if (Static60.aBoolean106) {
			this.aClass53_8 = new Class53(this.anInt4341);
		} else {
			this.aClass53_8 = null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method3513(@OriginalArg(0) int arg0) {
		return this.method3487(arg0).aBoolean172;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3519(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub3_Sub19 local14 = this.method3529(arg0);
		return local14 == null ? null : local14.method3031(this, this.aClass84_94, this.aBoolean355 || this.method3487(arg0).aBoolean173);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IB)Lclient!fb;")
	@Override
	protected Class2_Sub3_Sub4 method3488(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub19 local8 = this.method3529(arg0);
		return local8 == null ? null : local8.aClass2_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBF)[I")
	@Override
	public int[] method3515(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(8) Class2_Sub3_Sub19 local8 = this.method3529(arg0);
		if (local8 == null) {
			return null;
		} else {
			local8.aBoolean315 = true;
			return local8.method3029(this, this.aClass84_94, arg1, this.aBoolean355 || this.method3487(arg0).aBoolean173);
		}
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method3520(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aBoolean177;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(BI)I")
	@Override
	public int method3511(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aByte11 & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FZIII)Lclient!af;")
	@Override
	public Class2_Sub3_Sub1_Sub1 method3525(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class2_Sub3_Sub19 local16 = this.method3529(arg3);
		if (local16 != null && local16.method3028(this, this.aClass84_94)) {
			return arg1 ? local16.aClass2_Sub3_Sub4_1.method1285(arg2, this.aClass84_94, this, arg2, (double) arg0) : local16.aClass2_Sub3_Sub4_1.method1284(arg2, this.aClass84_94, this, (double) arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(BI)I")
	@Override
	public int method3514(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aByte9 & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(II)I")
	@Override
	public int method3521(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aShort14 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method3517(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub3_Sub19 local13 = this.method3529(arg0);
		return local13 == null ? false : local13.method3028(this, this.aClass84_94);
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public void method3528() {
		this.aClass53_7.method1261();
		if (this.aClass53_8 != null) {
			this.aClass53_8.method1261();
		}
		Static175.anIntArray300 = null;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method3518(@OriginalArg(0) int arg0) {
		return this.aBoolean355 || this.method3487(arg0).aBoolean173;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(IB)Lclient!nh;")
	private Class2_Sub3_Sub19 method3529(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub3_Sub19 local17 = (Class2_Sub3_Sub19) this.aClass53_7.method1254((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(28) byte[] local28 = this.aClass84_93.method2127(0, arg0);
		if (local28 == null) {
			return null;
		} else {
			local17 = new Class2_Sub3_Sub19(new Class2_Sub26(local28));
			this.aClass53_7.method1258((long) arg0, local17);
			return local17;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static4.method119(this.method3487(arg0).aByte10 & 0xFF, this.method3487(arg0).aByte12 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(26) Class2_Sub3_Sub19 local26 = this.method3529(arg0);
		if (local26 != null) {
			local21 = local26.method3035(this, this.aClass84_94, arg1);
		}
		if (!local21) {
			@Pc(52) Class2_Sub3_Sub15 local52 = this.method3533(arg0);
			local52.method2544();
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(BI)I")
	@Override
	public int method3523(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aByte10 & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
	public void method3530(@OriginalArg(0) boolean arg0) {
		this.aBoolean355 = arg0;
		this.method3528();
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)I")
	@Override
	public int method3516(@OriginalArg(1) int arg0) {
		return this.method3487(arg0).aByte12 & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(II)Z")
	@Override
	public boolean method3524(@OriginalArg(1) int arg0) {
		return !this.method3487(arg0).aBoolean175;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	@Override
	public void method3512(@OriginalArg(0) int arg0) {
		this.method3522(arg0, this.aBoolean355 || this.method3487(arg0).aBoolean173 ? 64 : 128);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(ZI)Lclient!lc;")
	private Class2_Sub3_Sub15 method3533(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub3_Sub15 local18 = (Class2_Sub3_Sub15) this.aClass53_8.method1254((long) arg0);
		if (local18 == null) {
			local18 = new Class2_Sub3_Sub15(this.method3487(arg0).aShort14 & 0xFFFF);
			this.aClass53_8.method1258((long) arg0, local18);
			return local18;
		} else {
			return local18;
		}
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "(II)V")
	public void method3534(@OriginalArg(1) int arg0) {
		this.anInt4341 = arg0;
		this.aClass53_7 = new Class53(this.anInt4341);
		if (Static60.aBoolean106) {
			this.aClass53_8 = new Class53(this.anInt4341);
		} else {
			this.aClass53_8 = null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "(II)V")
	public void method3535(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class2_Sub3_Sub19 local19 = (Class2_Sub3_Sub19) this.aClass53_7.method1260(); local19 != null; local19 = (Class2_Sub3_Sub19) this.aClass53_7.method1262()) {
			if (local19.aBoolean315) {
				local19.method3034(arg0);
				local19.aBoolean315 = false;
			}
		}
	}
}
