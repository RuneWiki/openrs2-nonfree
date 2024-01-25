import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class15 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "Lclient!tm;")
	private Class4_Sub1 aClass4_Sub1_7 = new Class4_Sub1();

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "Lclient!rh;")
	private final Class178 aClass178_1 = new Class178();

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
	private final int anInt364;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "Lclient!uc;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I)V")
	public Class15(@OriginalArg(0) int arg0) {
		this.anInt364 = arg0;
		this.anInt365 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass198_1 = new Class198(local19);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(JBLclient!tm;)V")
	public void method352(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		if (this.anInt365 == 0) {
			@Pc(11) Class4_Sub1 local11 = this.aClass178_1.method4772();
			local11.method5667();
			local11.method5555();
			if (local11 == this.aClass4_Sub1_7) {
				local11 = this.aClass178_1.method4772();
				local11.method5667();
				local11.method5555();
			}
		} else {
			this.anInt365--;
		}
		this.aClass198_1.method5267(arg0, arg1);
		this.aClass178_1.method4767(arg1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public void method354() {
		this.aClass178_1.method4765();
		this.aClass198_1.method5260();
		this.aClass4_Sub1_7 = new Class4_Sub1();
		this.anInt365 = this.anInt364;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(JI)Lclient!tm;")
	public Class4_Sub1 method356(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub1 local10 = (Class4_Sub1) this.aClass198_1.method5261(arg0);
		if (local10 != null) {
			this.aClass178_1.method4767(local10);
		}
		return local10;
	}
}
