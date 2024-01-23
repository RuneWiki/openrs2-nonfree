import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class135 {

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!qk;")
	private Class140 aClass140_5 = new Class140();

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	private int anInt4172;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	private int anInt4171;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!ik;")
	private Class70 aClass70_13;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.anInt4172 = arg0;
		this.anInt4171 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass70_13 = new Class70(local14);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
	public Object method3316(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) this.aClass70_13.method2075(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(19) Object local19 = local10.method1808();
		if (local19 == null) {
			local10.method4441();
			local10.method4347();
			this.anInt4171++;
			return null;
		}
		if (local10.method1802()) {
			@Pc(55) Class1_Sub2_Sub2_Sub1 local55 = new Class1_Sub2_Sub2_Sub1(local19);
			this.aClass70_13.method2084(local10.aLong205, local55);
			this.aClass140_5.method3414(local55);
			local55.aLong201 = 0L;
			local10.method4441();
			local10.method4347();
		} else {
			this.aClass140_5.method3414(local10);
			local10.aLong201 = 0L;
		}
		return local19;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method3317() {
		this.aClass140_5.method3417();
		this.aClass70_13.method2082();
		this.anInt4171 = this.anInt4172;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
	public void method3319(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub2_Sub2 local16 = (Class1_Sub2_Sub2) this.aClass70_13.method2075(arg0);
		if (local16 != null) {
			local16.method4441();
			local16.method4347();
			this.anInt4171++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public void method3320(@OriginalArg(0) int arg0) {
		if (Static155.aClass118_1 == null) {
			return;
		}
		for (@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) this.aClass140_5.method3413(); local10 != null; local10 = (Class1_Sub2_Sub2) this.aClass140_5.method3415()) {
			if (local10.method1802()) {
				if (local10.method1808() == null) {
					local10.method4441();
					local10.method4347();
					this.anInt4171++;
				}
			} else if (++local10.aLong201 > (long) arg0) {
				@Pc(39) Class1_Sub2_Sub2 local39 = Static155.aClass118_1.method3134(local10);
				this.aClass70_13.method2084(local10.aLong205, local39);
				Static77.method1350(local10, local39);
				local10.method4441();
				local10.method4347();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method3321(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method3319(arg0);
		if (this.anInt4171 == 0) {
			@Pc(17) Class1_Sub2_Sub2 local17 = (Class1_Sub2_Sub2) this.aClass140_5.method3416();
			local17.method4441();
			local17.method4347();
		} else {
			this.anInt4171--;
		}
		@Pc(36) Class1_Sub2_Sub2_Sub1 local36 = new Class1_Sub2_Sub2_Sub1(arg1);
		this.aClass70_13.method2084(arg0, local36);
		this.aClass140_5.method3414(local36);
		local36.aLong201 = 0L;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
	public int method3323() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class1_Sub2_Sub2 local13 = (Class1_Sub2_Sub2) this.aClass140_5.method3413(); local13 != null; local13 = (Class1_Sub2_Sub2) this.aClass140_5.method3415()) {
			if (!local13.method1802()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	public void method3324() {
		for (@Pc(7) Class1_Sub2_Sub2 local7 = (Class1_Sub2_Sub2) this.aClass140_5.method3413(); local7 != null; local7 = (Class1_Sub2_Sub2) this.aClass140_5.method3415()) {
			if (local7.method1802()) {
				local7.method4441();
				local7.method4347();
				this.anInt4171++;
			}
		}
	}
}
