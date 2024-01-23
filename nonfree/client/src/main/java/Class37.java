import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class37 {

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!r;")
	private Class2_Sub8 aClass2_Sub8_18;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!r;")
	public Class2_Sub8 aClass2_Sub8_17 = new Class2_Sub8();

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class37() {
		this.aClass2_Sub8_17.aClass2_Sub8_74 = this.aClass2_Sub8_17;
		this.aClass2_Sub8_17.aClass2_Sub8_75 = this.aClass2_Sub8_17;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lclient!r;")
	public Class2_Sub8 method1139() {
		@Pc(10) Class2_Sub8 local10 = this.aClass2_Sub8_17.aClass2_Sub8_74;
		if (this.aClass2_Sub8_17 == local10) {
			this.aClass2_Sub8_18 = null;
			return null;
		} else {
			this.aClass2_Sub8_18 = local10.aClass2_Sub8_74;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method1141() {
		while (true) {
			@Pc(17) Class2_Sub8 local17 = this.aClass2_Sub8_17.aClass2_Sub8_74;
			if (local17 == this.aClass2_Sub8_17) {
				this.aClass2_Sub8_18 = null;
				return;
			}
			local17.method4686();
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
	public int method1143() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class2_Sub8 local16 = this.aClass2_Sub8_17.aClass2_Sub8_74;
		while (this.aClass2_Sub8_17 != local16) {
			local16 = local16.aClass2_Sub8_74;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!r;B)V")
	public void method1144(@OriginalArg(0) Class2_Sub8 arg0) {
		if (arg0.aClass2_Sub8_75 != null) {
			arg0.method4686();
		}
		arg0.aClass2_Sub8_75 = this.aClass2_Sub8_17.aClass2_Sub8_75;
		arg0.aClass2_Sub8_74 = this.aClass2_Sub8_17;
		arg0.aClass2_Sub8_75.aClass2_Sub8_74 = arg0;
		arg0.aClass2_Sub8_74.aClass2_Sub8_75 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)Lclient!r;")
	public Class2_Sub8 method1145() {
		@Pc(11) Class2_Sub8 local11 = this.aClass2_Sub8_18;
		if (local11 == this.aClass2_Sub8_17) {
			this.aClass2_Sub8_18 = null;
			return null;
		} else {
			this.aClass2_Sub8_18 = local11.aClass2_Sub8_74;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!r;")
	public Class2_Sub8 method1146() {
		@Pc(7) Class2_Sub8 local7 = this.aClass2_Sub8_17.aClass2_Sub8_74;
		if (local7 == this.aClass2_Sub8_17) {
			return null;
		} else {
			local7.method4686();
			return local7;
		}
	}
}
