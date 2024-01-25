import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class282 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!ob;")
	private Class3_Sub7 aClass3_Sub7_56 = new Class3_Sub7();

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "Lclient!vu;")
	private final Class363 aClass363_43 = new Class363();

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	private int anInt7915;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	private final int anInt7916;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!baa;")
	private final Class25 aClass25_33;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	public Class282(@OriginalArg(0) int arg0) {
		this.anInt7915 = arg0;
		this.anInt7916 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass25_33 = new Class25(local19);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ob;BJ)V")
	public void method6850(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt7915 == 0) {
			@Pc(11) Class3_Sub7 local11 = this.aClass363_43.method8420();
			local11.method8682();
			local11.method7907();
			if (local11 == this.aClass3_Sub7_56) {
				local11 = this.aClass363_43.method8420();
				local11.method8682();
				local11.method7907();
			}
		} else {
			this.anInt7915--;
		}
		this.aClass25_33.method434(arg1, arg0);
		this.aClass363_43.method8413(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public void method6851() {
		this.aClass363_43.method8419();
		this.aClass25_33.method433();
		this.aClass3_Sub7_56 = new Class3_Sub7();
		this.anInt7915 = this.anInt7916;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JZ)V")
	public void method6854(@OriginalArg(0) long arg0) {
		@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) this.aClass25_33.method426(arg0);
		if (local14 != null) {
			local14.method8682();
			local14.method7907();
			this.anInt7915++;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)Lclient!ob;")
	public Class3_Sub7 method6855(@OriginalArg(1) long arg0) {
		@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) this.aClass25_33.method426(arg0);
		if (local17 != null) {
			this.aClass363_43.method8413(local17);
		}
		return local17;
	}
}
