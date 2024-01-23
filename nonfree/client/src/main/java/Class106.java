import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class106 {

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Lclient!r;")
	private Class2_Sub8 aClass2_Sub8_35 = new Class2_Sub8();

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!ea;")
	private Class37 aClass37_11 = new Class37();

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	private int anInt3625;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	private int anInt3626;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!l;")
	private Class101 aClass101_13;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
	public Class106(@OriginalArg(0) int arg0) {
		this.anInt3625 = arg0;
		this.anInt3626 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass101_13 = new Class101(local19);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lclient!qk;")
	public Class2 method2984() {
		return this.aClass101_13.method2868();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	public void method2985() {
		this.aClass37_11.method1141();
		this.aClass101_13.method2869();
		this.aClass2_Sub8_35 = new Class2_Sub8();
		this.anInt3625 = this.anInt3626;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)Lclient!r;")
	public Class2_Sub8 method2986(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub8 local16 = (Class2_Sub8) this.aClass101_13.method2867(arg0);
		if (local16 != null) {
			this.aClass37_11.method1144(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lclient!qk;")
	public Class2 method2987() {
		return this.aClass101_13.method2859();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(JILclient!r;)V")
	public void method2990(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (this.anInt3625 == 0) {
			@Pc(16) Class2_Sub8 local16 = this.aClass37_11.method1146();
			local16.method4743();
			local16.method4686();
			if (this.aClass2_Sub8_35 == local16) {
				local16 = this.aClass37_11.method1146();
				local16.method4743();
				local16.method4686();
			}
		} else {
			this.anInt3625--;
		}
		this.aClass101_13.method2860(arg1, arg0);
		this.aClass37_11.method1144(arg1);
	}
}
