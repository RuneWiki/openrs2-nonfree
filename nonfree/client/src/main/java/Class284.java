import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class284 {

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!lj;")
	private Class6_Sub1 aClass6_Sub1_50 = new Class6_Sub1();

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_14 = new Class144();

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
	private int anInt7787;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	private final int anInt7785;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!nj;")
	private final Class212 aClass212_33;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
	public Class284(@OriginalArg(0) int arg0) {
		this.anInt7787 = arg0;
		this.anInt7785 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass212_33 = new Class212(local19);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	public void method6448() {
		this.aClass144_14.method3112();
		this.aClass212_33.method5110();
		this.aClass6_Sub1_50 = new Class6_Sub1();
		this.anInt7787 = this.anInt7785;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IJ)Lclient!lj;")
	public Class6_Sub1 method6449(@OriginalArg(1) long arg0) {
		@Pc(18) Class6_Sub1 local18 = (Class6_Sub1) this.aClass212_33.method5106(arg0);
		if (local18 != null) {
			this.aClass144_14.method3114(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(JLclient!lj;B)V")
	public void method6450(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (this.anInt7787 == 0) {
			@Pc(18) Class6_Sub1 local18 = this.aClass144_14.method3115();
			local18.method7849();
			local18.method7852();
			if (this.aClass6_Sub1_50 == local18) {
				local18 = this.aClass144_14.method3115();
				local18.method7849();
				local18.method7852();
			}
		} else {
			this.anInt7787--;
		}
		this.aClass212_33.method5104(arg0, arg1);
		this.aClass144_14.method3114(arg1);
	}
}
