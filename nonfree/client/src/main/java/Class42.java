import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class42 {

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!daa;")
	private Class2_Sub1 aClass2_Sub1_11 = new Class2_Sub1();

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Lclient!pf;")
	private final Class279 aClass279_3 = new Class279();

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	private int anInt1221;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	private final int anInt1220;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!si;")
	private final Class335 aClass335_6;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V")
	public Class42(@OriginalArg(0) int arg0) {
		this.anInt1221 = arg0;
		this.anInt1220 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass335_6 = new Class335(local19);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public void method1172() {
		this.aClass279_3.method7297();
		this.aClass335_6.method8353();
		this.aClass2_Sub1_11 = new Class2_Sub1();
		this.anInt1221 = this.anInt1220;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!daa;J)V")
	public void method1175(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1221 == 0) {
			@Pc(19) Class2_Sub1 local19 = this.aClass279_3.method7291();
			local19.method9825();
			local19.method9377();
			if (this.aClass2_Sub1_11 == local19) {
				local19 = this.aClass279_3.method7291();
				local19.method9825();
				local19.method9377();
			}
		} else {
			this.anInt1221--;
		}
		this.aClass335_6.method8356(arg0, arg1);
		this.aClass279_3.method7292(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)V")
	public void method1176(@OriginalArg(0) long arg0) {
		@Pc(12) Class2_Sub1 local12 = (Class2_Sub1) this.aClass335_6.method8357(arg0);
		if (local12 != null) {
			local12.method9825();
			local12.method9377();
			this.anInt1221++;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IJ)Lclient!daa;")
	public Class2_Sub1 method1177(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass335_6.method8357(arg0);
		if (local15 != null) {
			this.aClass279_3.method7292(local15);
		}
		return local15;
	}
}
