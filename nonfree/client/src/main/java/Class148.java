import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class148 {

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[Lclient!ee;")
	private Class46_Sub1[] aClass46_Sub1Array2;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Lclient!aj;")
	private Class8_Sub2 aClass8_Sub2_6;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!r;")
	private Class139 aClass139_3;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!ea;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "Lclient!dk;")
	private Class8_Sub1_Sub4_Sub1 aClass8_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!r;Lclient!ea;)V")
	public Class148(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class42 arg1) {
		this.aClass139_3 = arg0;
		this.aClass42_3 = arg1;
		if (!this.aClass139_3.method3447()) {
			this.aClass8_Sub1_Sub4_Sub1_2 = this.aClass139_3.method3443(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!pm;IZBLclient!pm;)Lclient!ee;")
	private Class46_Sub1 method3557(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class133 arg2) {
		if (this.aClass8_Sub2_6 == null) {
			throw new RuntimeException();
		}
		this.aClass8_Sub2_6.anInt2955 = arg1 * 8 + 5;
		if (this.aClass8_Sub2_6.aByteArray24.length <= this.aClass8_Sub2_6.anInt2955) {
			throw new RuntimeException();
		} else if (this.aClass46_Sub1Array2[arg1] == null) {
			@Pc(49) int local49 = this.aClass8_Sub2_6.method2352();
			@Pc(60) int local60 = this.aClass8_Sub2_6.method2352();
			@Pc(74) Class46_Sub1 local74 = new Class46_Sub1(arg1, arg2, arg0, this.aClass139_3, this.aClass42_3, local49, local60, true);
			this.aClass46_Sub1Array2[arg1] = local74;
			return local74;
		} else {
			return this.aClass46_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	public boolean method3560() {
		if (this.aClass8_Sub2_6 != null) {
			return true;
		}
		if (this.aClass8_Sub1_Sub4_Sub1_2 == null) {
			if (this.aClass139_3.method3447()) {
				return false;
			}
			this.aClass8_Sub1_Sub4_Sub1_2 = this.aClass139_3.method3443(255, 255, true, (byte) 0);
		}
		if (this.aClass8_Sub1_Sub4_Sub1_2.aBoolean313) {
			return false;
		} else {
			this.aClass8_Sub2_6 = new Class8_Sub2(this.aClass8_Sub1_Sub4_Sub1_2.method3013());
			this.aClass46_Sub1Array2 = new Class46_Sub1[(this.aClass8_Sub2_6.aByteArray24.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public void method3564() {
		if (this.aClass46_Sub1Array2 == null) {
			return;
		}
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass46_Sub1Array2.length; local18++) {
			if (this.aClass46_Sub1Array2[local18] != null) {
				this.aClass46_Sub1Array2[local18].method977();
			}
		}
		for (local18 = 0; local18 < this.aClass46_Sub1Array2.length; local18++) {
			if (this.aClass46_Sub1Array2[local18] != null) {
				this.aClass46_Sub1Array2[local18].method975();
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!pm;Lclient!pm;II)Lclient!ee;")
	public Class46_Sub1 method3565(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2) {
		return this.method3557(arg1, arg2, arg0);
	}
}
