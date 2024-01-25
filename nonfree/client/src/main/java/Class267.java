import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class267 {

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Lclient!ju;")
	private final Class136 aClass136_11 = new Class136();

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	private final int anInt7538;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private int anInt7533;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!mn;")
	private final Class167 aClass167_36;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	public Class267(@OriginalArg(0) int arg0) {
		this.anInt7538 = arg0;
		this.anInt7533 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass167_36 = new Class167(local14);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
	public int method6004() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class10_Sub1_Sub3 local13 = (Class10_Sub1_Sub3) this.aClass136_11.method3200(); local13 != null; local13 = (Class10_Sub1_Sub3) this.aClass136_11.method3201()) {
			if (!local13.method5667()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
	private void method6005(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt7538 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6010(arg1);
		this.anInt7533--;
		while (this.anInt7533 < 0) {
			@Pc(36) Class10_Sub1_Sub3 local36 = (Class10_Sub1_Sub3) this.aClass136_11.method3198();
			this.method6009(local36);
		}
		@Pc(49) Class10_Sub1_Sub3_Sub2 local49 = new Class10_Sub1_Sub3_Sub2(arg0, 1);
		this.aClass167_36.method3705(local49, arg1);
		this.aClass136_11.method3197(local49);
		local49.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
	public int method6006() {
		return this.anInt7533;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	public void method6007(@OriginalArg(1) int arg0) {
		if (Static460.aClass93_4 == null) {
			return;
		}
		for (@Pc(9) Class10_Sub1_Sub3 local9 = (Class10_Sub1_Sub3) this.aClass136_11.method3200(); local9 != null; local9 = (Class10_Sub1_Sub3) this.aClass136_11.method3201()) {
			if (local9.method5667()) {
				if (local9.method5668() == null) {
					local9.method6033();
					local9.method5897();
					this.anInt7533++;
				}
			} else if (++local9.aLong254 > (long) arg0) {
				@Pc(37) Class10_Sub1_Sub3 local37 = Static460.aClass93_4.method5401(local9);
				this.aClass167_36.method3705(local37, local9.aLong264);
				Static31.method447(local37, local9);
				local9.method6033();
				local9.method5897();
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method6008(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method6005(arg0, arg1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLclient!ba;)V")
	private void method6009(@OriginalArg(1) Class10_Sub1_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method6033();
			arg0.method5897();
			this.anInt7533 += arg0.anInt7190;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V")
	private void method6010(@OriginalArg(1) long arg0) {
		@Pc(17) Class10_Sub1_Sub3 local17 = (Class10_Sub1_Sub3) this.aClass167_36.method3709(arg0);
		this.method6009(local17);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
	public void method6011() {
		this.aClass136_11.method3204();
		this.aClass167_36.method3701();
		this.anInt7533 = this.anInt7538;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public void method6013() {
		for (@Pc(19) Class10_Sub1_Sub3 local19 = (Class10_Sub1_Sub3) this.aClass136_11.method3200(); local19 != null; local19 = (Class10_Sub1_Sub3) this.aClass136_11.method3201()) {
			if (local19.method5667()) {
				local19.method6033();
				local19.method5897();
				this.anInt7533 += local19.anInt7190;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method6014(@OriginalArg(1) long arg0) {
		@Pc(10) Class10_Sub1_Sub3 local10 = (Class10_Sub1_Sub3) this.aClass167_36.method3709(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method5668();
		if (local23 == null) {
			local10.method6033();
			local10.method5897();
			this.anInt7533 += local10.anInt7190;
			return null;
		}
		if (local10.method5667()) {
			@Pc(61) Class10_Sub1_Sub3_Sub2 local61 = new Class10_Sub1_Sub3_Sub2(local23, local10.anInt7190);
			this.aClass167_36.method3705(local61, local10.aLong264);
			this.aClass136_11.method3197(local61);
			local61.aLong254 = 0L;
			local10.method6033();
			local10.method5897();
		} else {
			this.aClass136_11.method3197(local10);
			local10.aLong254 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method6015() {
		@Pc(11) Class10_Sub1_Sub3 local11 = (Class10_Sub1_Sub3) this.aClass167_36.method3708();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5668();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class10_Sub1_Sub3 local23 = local11;
			local11 = (Class10_Sub1_Sub3) this.aClass167_36.method3708();
			local23.method6033();
			local23.method5897();
			this.anInt7533 += local11.anInt7190;
		}
		return null;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method6016() {
		@Pc(11) Class10_Sub1_Sub3 local11 = (Class10_Sub1_Sub3) this.aClass167_36.method3702();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5668();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class10_Sub1_Sub3 local21 = local11;
			local11 = (Class10_Sub1_Sub3) this.aClass167_36.method3708();
			local21.method6033();
			local21.method5897();
			this.anInt7533 += local11.anInt7190;
		}
		return null;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
	public int method6017() {
		return this.anInt7538;
	}
}
