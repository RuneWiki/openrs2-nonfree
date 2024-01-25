import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7 {

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!rw;")
	private Class9_Sub1_Sub1_Sub2_Sub2 aClass9_Sub1_Sub1_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!afa;")
	private Class9_Sub1_Sub1_Sub2_Sub1 aClass9_Sub1_Sub1_Sub2_Sub1_1 = null;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private final int anInt235;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public final int anInt240;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!ika;I)V")
	public Class7(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt235 = arg1;
		@Pc(19) int local19 = arg0.method2048(255);
		if (local19 == 0) {
			this.anInt240 = arg0.method2030();
		} else if (local19 == 1) {
			this.anInt240 = -1;
		} else {
			this.anInt240 = -1;
		}
		arg0.method2014();
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public void method244() {
		this.aClass9_Sub1_Sub1_Sub2_Sub1_1 = null;
		this.aBoolean4 = false;
		this.aClass9_Sub1_Sub1_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
	public void method245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean4) {
			this.aBoolean4 = true;
			if (this.anInt240 < 0) {
				this.aClass9_Sub1_Sub1_Sub2_Sub1_1 = new Class9_Sub1_Sub1_Sub2_Sub1(25);
				this.aClass9_Sub1_Sub1_Sub2_Sub1_1.method473(Static557.aClass3_Sub2_7, 78);
				this.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8783 = this.anInt235;
				this.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8801 = Static716.anInt11157;
				this.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8770 = Static48.anInt1323++;
			} else {
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1 = new Class9_Sub1_Sub1_Sub2_Sub2(25);
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8783 = this.anInt235;
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8801 = Static716.anInt11157;
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7509(Static255.aClass14_1.method619(this.anInt240));
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7481(this.aClass9_Sub1_Sub1_Sub2_Sub2_1.aClass219_1.anInt5693);
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8770 = Static48.anInt1323++;
				this.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8807 = this.aClass9_Sub1_Sub1_Sub2_Sub2_1.aClass219_1.lb << 3;
			}
		}
		if (this.anInt240 < 0) {
			this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aByte139 = this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aByte140 = (byte) arg0;
			this.aClass9_Sub1_Sub1_Sub2_Sub1_1.method483(arg3, arg2);
			this.aClass9_Sub1_Sub1_Sub2_Sub1_1.method7495(arg1, true);
		} else {
			this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7506(this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7485(), arg2, arg3, true, arg0);
			this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7495(arg1, true);
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Lclient!kt;")
	public Class9_Sub1_Sub1_Sub2 method249() {
		return this.aClass9_Sub1_Sub1_Sub2_Sub2_1 == null ? this.aClass9_Sub1_Sub1_Sub2_Sub1_1 : this.aClass9_Sub1_Sub1_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIII)V")
	public void method251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass9_Sub1_Sub1_Sub2_Sub2_1 == null) {
			this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aByte139 = this.aClass9_Sub1_Sub1_Sub2_Sub1_1.aByte140 = (byte) arg1;
			this.aClass9_Sub1_Sub1_Sub2_Sub1_1.method483(arg2, arg0);
		} else {
			this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7506(this.aClass9_Sub1_Sub1_Sub2_Sub2_1.method7485(), arg0, arg2, true, arg1);
		}
	}
}
