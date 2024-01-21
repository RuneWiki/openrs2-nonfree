import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class75 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!jd;")
	private final Class3_Sub1 aClass3_Sub1_54 = new Class3_Sub1();

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!kb;")
	private final Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	private final int anInt2487;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "Lclient!ud;")
	private final Class77 aClass77_9;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt2487 = arg0;
		this.anInt2488 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass77_9 = new Class77(local19);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public void method1724() {
		while (true) {
			@Pc(6) Class3_Sub1 local6 = this.aClass41_2.method1070();
			if (local6 == null) {
				this.anInt2488 = this.anInt2487;
				return;
			}
			local6.method1962();
			local6.method1956();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(JB)V")
	public void method1727(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass77_9.method1805(arg0);
		if (local10 != null) {
			local10.method1962();
			local10.method1956();
			this.anInt2488++;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BJ)Lclient!jd;")
	public Class3_Sub1 method1728(@OriginalArg(1) long arg0) {
		@Pc(16) Class3_Sub1 local16 = (Class3_Sub1) this.aClass77_9.method1805(arg0);
		if (local16 != null) {
			this.aClass41_2.method1072(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!jd;J)V")
	public void method1730(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2488 == 0) {
			@Pc(18) Class3_Sub1 local18 = this.aClass41_2.method1070();
			local18.method1962();
			local18.method1956();
			if (local18 == this.aClass3_Sub1_54) {
				local18 = this.aClass41_2.method1070();
				local18.method1962();
				local18.method1956();
			}
		} else {
			this.anInt2488--;
		}
		this.aClass77_9.method1810(arg0, arg1);
		this.aClass41_2.method1072(arg0);
	}
}
