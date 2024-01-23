import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class98 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!mm;")
	private Class115 aClass115_5 = new Class115();

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	private int anInt2885;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	private int anInt2883;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!cn;")
	private Class30 aClass30_18;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2885 = arg0;
		this.anInt2883 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass30_18 = new Class30(local14);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	public int method2562() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub4_Sub5 local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2879(); local13 != null; local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2885()) {
			if (!local13.method4035()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
	public void method2565(@OriginalArg(1) int arg0) {
		if (Static220.aClass138_2 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub4_Sub5 local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2879(); local13 != null; local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2885()) {
			if (local13.method4035()) {
				if (local13.method4033() == null) {
					local13.method5013();
					local13.method5022();
					this.anInt2883++;
				}
			} else if ((long) arg0 < ++local13.aLong245) {
				@Pc(60) Class3_Sub4_Sub5 local60 = Static220.aClass138_2.method3546(local13);
				this.aClass30_18.method668(local60, local13.aLong243);
				Static67.method1032(local60, local13);
				local13.method5013();
				local13.method5022();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method2568(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method2569(arg1);
		if (this.anInt2883 == 0) {
			@Pc(27) Class3_Sub4_Sub5 local27 = (Class3_Sub4_Sub5) this.aClass115_5.method2882();
			local27.method5013();
			local27.method5022();
		} else {
			this.anInt2883--;
		}
		@Pc(46) Class3_Sub4_Sub5_Sub2 local46 = new Class3_Sub4_Sub5_Sub2(arg0);
		this.aClass30_18.method668(local46, arg1);
		this.aClass115_5.method2875(local46);
		local46.aLong245 = 0L;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BJ)V")
	public void method2569(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub4_Sub5 local15 = (Class3_Sub4_Sub5) this.aClass30_18.method663(arg0);
		if (local15 != null) {
			local15.method5013();
			local15.method5022();
			this.anInt2883++;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2570(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub4_Sub5 local10 = (Class3_Sub4_Sub5) this.aClass30_18.method663(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(26) Object local26 = local10.method4033();
		if (local26 == null) {
			local10.method5013();
			local10.method5022();
			this.anInt2883++;
			return null;
		}
		if (local10.method4035()) {
			@Pc(52) Class3_Sub4_Sub5_Sub2 local52 = new Class3_Sub4_Sub5_Sub2(local26);
			this.aClass30_18.method668(local52, local10.aLong243);
			this.aClass115_5.method2875(local52);
			local52.aLong245 = 0L;
			local10.method5013();
			local10.method5022();
		} else {
			this.aClass115_5.method2875(local10);
			local10.aLong245 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public void method2571() {
		for (@Pc(13) Class3_Sub4_Sub5 local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2879(); local13 != null; local13 = (Class3_Sub4_Sub5) this.aClass115_5.method2885()) {
			if (local13.method4035()) {
				local13.method5013();
				local13.method5022();
				this.anInt2883++;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public void method2572() {
		this.aClass115_5.method2877();
		this.aClass30_18.method667();
		this.anInt2883 = this.anInt2885;
	}
}
