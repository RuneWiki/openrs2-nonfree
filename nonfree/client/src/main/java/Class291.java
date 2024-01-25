import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class291 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!ke;")
	private Class5_Sub2 aClass5_Sub2_58 = new Class5_Sub2();

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!lj;")
	private final Class187 aClass187_11 = new Class187();

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	private int anInt8482;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	private final int anInt8485;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!cb;")
	private final Class42 aClass42_38;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.anInt8482 = arg0;
		this.anInt8485 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass42_38 = new Class42(local19);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public void method6847() {
		this.aClass187_11.method4808();
		this.aClass42_38.method1108();
		this.aClass5_Sub2_58 = new Class5_Sub2();
		this.anInt8482 = this.anInt8485;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)Lclient!ke;")
	public Class5_Sub2 method6850(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub2 local10 = (Class5_Sub2) this.aClass42_38.method1109(arg0);
		if (local10 != null) {
			this.aClass187_11.method4807(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJLclient!ke;)V")
	public void method6851(@OriginalArg(1) long arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		if (this.anInt8482 == 0) {
			@Pc(16) Class5_Sub2 local16 = this.aClass187_11.method4802();
			local16.method7425();
			local16.method7323();
			if (this.aClass5_Sub2_58 == local16) {
				local16 = this.aClass187_11.method4802();
				local16.method7425();
				local16.method7323();
			}
		} else {
			this.anInt8482--;
		}
		this.aClass42_38.method1106(arg0, arg1);
		this.aClass187_11.method4807(arg1);
	}
}
