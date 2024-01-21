import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!ld;")
	private final Class3_Sub1 aClass3_Sub1_13 = new Class3_Sub1();

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!rb;")
	private final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	private final int anInt430;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Lclient!e;")
	private final Class21 aClass21_3;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		this.anInt430 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt431 = arg0;
		while (local16 + local16 < arg0) {
			local16 += local16;
		}
		this.aClass21_3 = new Class21(local16);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(JI)V")
	public void method280(@OriginalArg(0) long arg0) {
		@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) this.aClass21_3.method459(arg0);
		if (local18 != null) {
			local18.method1966();
			local18.method1931();
			this.anInt431++;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJ)Lclient!ld;")
	public Class3_Sub1 method282(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) this.aClass21_3.method459(arg0);
		if (local18 != null) {
			this.aClass56_1.method1546(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method283() {
		while (true) {
			@Pc(8) Class3_Sub1 local8 = this.aClass56_1.method1547();
			if (local8 == null) {
				this.anInt431 = this.anInt430;
				return;
			}
			local8.method1966();
			local8.method1931();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ld;JB)V")
	public void method284(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt431 == 0) {
			@Pc(18) Class3_Sub1 local18 = this.aClass56_1.method1547();
			local18.method1966();
			local18.method1931();
			if (local18 == this.aClass3_Sub1_13) {
				local18 = this.aClass56_1.method1547();
				local18.method1966();
				local18.method1931();
			}
		} else {
			this.anInt431--;
		}
		this.aClass21_3.method452(arg1, arg0);
		this.aClass56_1.method1546(arg0);
	}
}
