import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class24 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!jn;")
	private Class4_Sub1 aClass4_Sub1_11 = new Class4_Sub1();

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "Lclient!kn;")
	private final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	private final int anInt838;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!qo;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
	public Class24(@OriginalArg(0) int arg0) {
		this.anInt839 = arg0;
		this.anInt838 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass196_1 = new Class196(local19);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(JI)Lclient!jn;")
	public Class4_Sub1 method655(@OriginalArg(0) long arg0) {
		@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) this.aClass196_1.method4477(arg0);
		if (local15 != null) {
			this.aClass140_1.method3015(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public void method658() {
		this.aClass140_1.method3013();
		this.aClass196_1.method4471();
		this.aClass4_Sub1_11 = new Class4_Sub1();
		this.anInt839 = this.anInt838;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!jn;JI)V")
	public void method660(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt839 == 0) {
			@Pc(22) Class4_Sub1 local22 = this.aClass140_1.method3016();
			local22.method5854();
			local22.method5863();
			if (local22 == this.aClass4_Sub1_11) {
				local22 = this.aClass140_1.method3016();
				local22.method5854();
				local22.method5863();
			}
		} else {
			this.anInt839--;
		}
		this.aClass196_1.method4474(arg1, arg0);
		this.aClass140_1.method3015(arg0);
	}
}
