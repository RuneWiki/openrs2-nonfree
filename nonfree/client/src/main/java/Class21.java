import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class21 {

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!ss;")
	private Class3_Sub7 aClass3_Sub7_1 = new Class3_Sub7();

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!mt;")
	private final Class162 aClass162_5 = new Class162();

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	private final int anInt264;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!cp;")
	private final Class44 aClass44_4;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt264 = arg0;
		this.anInt263 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass44_4 = new Class44(local19);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JZLclient!ss;)V")
	public void method259(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (this.anInt263 == 0) {
			@Pc(15) Class3_Sub7 local15 = this.aClass162_5.method3735();
			local15.method5700();
			local15.method5673();
			if (local15 == this.aClass3_Sub7_1) {
				local15 = this.aClass162_5.method3735();
				local15.method5700();
				local15.method5673();
			}
		} else {
			this.anInt263--;
		}
		this.aClass44_4.method948(arg0, arg1);
		this.aClass162_5.method3729(arg1);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZJ)Lclient!ss;")
	public Class3_Sub7 method261(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) this.aClass44_4.method942(arg0);
		if (local15 != null) {
			this.aClass162_5.method3729(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public void method262() {
		this.aClass162_5.method3733();
		this.aClass44_4.method952();
		this.aClass3_Sub7_1 = new Class3_Sub7();
		this.anInt263 = this.anInt264;
	}
}
