import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class379 {

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "Lclient!vl;")
	private Class2_Sub6 aClass2_Sub6_67 = new Class2_Sub6();

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Lclient!mn;")
	private final Class211 aClass211_13 = new Class211();

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	private int anInt11056;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	private final int anInt11055;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "Lclient!eq;")
	private final Class99 aClass99_85;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	public Class379(@OriginalArg(0) int arg0) {
		this.anInt11056 = arg0;
		this.anInt11055 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass99_85 = new Class99(local19);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(JB)Lclient!vl;")
	public Class2_Sub6 method9219(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub6 local16 = (Class2_Sub6) this.aClass99_85.method3056(arg0);
		if (local16 != null) {
			this.aClass211_13.method6002(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	public void method9220() {
		this.aClass211_13.method6006();
		this.aClass99_85.method3057();
		this.aClass2_Sub6_67 = new Class2_Sub6();
		this.anInt11056 = this.anInt11055;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IJ)V")
	public void method9221(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub6 local10 = (Class2_Sub6) this.aClass99_85.method3056(arg0);
		if (local10 != null) {
			local10.method9253();
			local10.method8933();
			this.anInt11056++;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(JLclient!vl;I)V")
	public void method9222(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (this.anInt11056 == 0) {
			@Pc(14) Class2_Sub6 local14 = this.aClass211_13.method6005();
			local14.method9253();
			local14.method8933();
			if (local14 == this.aClass2_Sub6_67) {
				local14 = this.aClass211_13.method6005();
				local14.method9253();
				local14.method8933();
			}
		} else {
			this.anInt11056--;
		}
		this.aClass99_85.method3059(arg0, arg1);
		this.aClass211_13.method6002(arg1);
	}
}
