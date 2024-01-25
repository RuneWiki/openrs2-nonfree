import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class147 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!ie;")
	private Class2_Sub5 aClass2_Sub5_32 = new Class2_Sub5();

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!cn;")
	private final Class44 aClass44_5 = new Class44();

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	private final int anInt4106;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!mn;")
	private final Class163 aClass163_25;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	public Class147(@OriginalArg(0) int arg0) {
		this.anInt4106 = arg0;
		this.anInt4105 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass163_25 = new Class163(local19);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ie;BJ)V")
	public void method3336(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4105 == 0) {
			@Pc(15) Class2_Sub5 local15 = this.aClass44_5.method800();
			local15.method5866();
			local15.method5534();
			if (local15 == this.aClass2_Sub5_32) {
				local15 = this.aClass44_5.method800();
				local15.method5866();
				local15.method5534();
			}
		} else {
			this.anInt4105--;
		}
		this.aClass163_25.method3764(arg1, arg0);
		this.aClass44_5.method799(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public void method3337() {
		this.aClass44_5.method807();
		this.aClass163_25.method3767();
		this.aClass2_Sub5_32 = new Class2_Sub5();
		this.anInt4105 = this.anInt4106;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(JI)Lclient!ie;")
	public Class2_Sub5 method3340(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) this.aClass163_25.method3769(arg0);
		if (local10 != null) {
			this.aClass44_5.method799(local10);
		}
		return local10;
	}
}
