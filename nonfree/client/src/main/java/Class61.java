import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class61 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!uc;")
	private Class164 aClass164_5 = new Class164();

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!pd;")
	private Class129 aClass129_6;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
	public Class61(@OriginalArg(0) int arg0) {
		this.anInt1819 = arg0;
		@Pc(11) int local11 = 1;
		this.anInt1812 = arg0;
		while (local11 + local11 < arg0) {
			local11 += local11;
		}
		this.aClass129_6 = new Class129(local11);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
	public int method1376() {
		@Pc(1) int local1 = 0;
		for (@Pc(17) Class8_Sub1_Sub16 local17 = (Class8_Sub1_Sub16) this.aClass164_5.method3989(); local17 != null; local17 = (Class8_Sub1_Sub16) this.aClass164_5.method3988()) {
			if (!local17.method4170()) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method1377(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method1382(arg0);
		if (this.anInt1812 == 0) {
			@Pc(24) Class8_Sub1_Sub16 local24 = (Class8_Sub1_Sub16) this.aClass164_5.method3992();
			local24.method4273();
			local24.method4277();
		} else {
			this.anInt1812--;
		}
		@Pc(35) Class8_Sub1_Sub16_Sub1 local35 = new Class8_Sub1_Sub16_Sub1(arg1);
		this.aClass129_6.method3039(local35, arg0);
		this.aClass164_5.method3993(local35);
		local35.aLong204 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method1378() {
		this.aClass164_5.method3994();
		this.aClass129_6.method3047();
		this.anInt1812 = this.anInt1819;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public void method1379() {
		for (@Pc(16) Class8_Sub1_Sub16 local16 = (Class8_Sub1_Sub16) this.aClass164_5.method3989(); local16 != null; local16 = (Class8_Sub1_Sub16) this.aClass164_5.method3988()) {
			if (local16.method4170()) {
				local16.method4273();
				local16.method4277();
				this.anInt1812++;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public void method1381(@OriginalArg(0) int arg0) {
		if (Static23.aClass96_1 == null) {
			return;
		}
		for (@Pc(10) Class8_Sub1_Sub16 local10 = (Class8_Sub1_Sub16) this.aClass164_5.method3989(); local10 != null; local10 = (Class8_Sub1_Sub16) this.aClass164_5.method3988()) {
			if (local10.method4170()) {
				if (local10.method4171() == null) {
					local10.method4273();
					local10.method4277();
					this.anInt1812++;
				}
			} else if ((long) arg0 < ++local10.aLong204) {
				@Pc(36) Class8_Sub1_Sub16 local36 = Static23.aClass96_1.method2230(local10);
				this.aClass129_6.method3039(local36, local10.aLong203);
				Static40.method617(local36, local10);
				local10.method4273();
				local10.method4277();
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JB)V")
	public void method1382(@OriginalArg(0) long arg0) {
		@Pc(17) Class8_Sub1_Sub16 local17 = (Class8_Sub1_Sub16) this.aClass129_6.method3043(arg0);
		if (local17 != null) {
			local17.method4273();
			local17.method4277();
			this.anInt1812++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(JB)Ljava/lang/Object;")
	public Object method1384(@OriginalArg(0) long arg0) {
		@Pc(16) Class8_Sub1_Sub16 local16 = (Class8_Sub1_Sub16) this.aClass129_6.method3043(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(26) Object local26 = local16.method4171();
		if (local26 == null) {
			local16.method4273();
			local16.method4277();
			this.anInt1812++;
			return null;
		}
		if (local16.method4170()) {
			@Pc(60) Class8_Sub1_Sub16_Sub1 local60 = new Class8_Sub1_Sub16_Sub1(local26);
			this.aClass129_6.method3039(local60, local16.aLong203);
			this.aClass164_5.method3993(local60);
			local60.aLong204 = 0L;
			local16.method4273();
			local16.method4277();
		} else {
			this.aClass164_5.method3993(local16);
			local16.aLong204 = 0L;
		}
		return local26;
	}
}
