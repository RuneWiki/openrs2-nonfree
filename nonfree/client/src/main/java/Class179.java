import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class179 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!fs;")
	private Class2_Sub11 aClass2_Sub11_52 = new Class2_Sub11();

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ek;")
	private final Class54 aClass54_9 = new Class54();

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	private int anInt5726;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	private final int anInt5725;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!va;")
	private final Class199 aClass199_26;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
	public Class179(@OriginalArg(0) int arg0) {
		this.anInt5726 = arg0;
		this.anInt5725 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass199_26 = new Class199(local19);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!fs;J)V")
	public void method5085(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5726 == 0) {
			@Pc(19) Class2_Sub11 local19 = this.aClass54_9.method1658();
			local19.method5945();
			local19.method5914();
			if (local19 == this.aClass2_Sub11_52) {
				local19 = this.aClass54_9.method1658();
				local19.method5945();
				local19.method5914();
			}
		} else {
			this.anInt5726--;
		}
		this.aClass199_26.method5749(arg0, arg1);
		this.aClass54_9.method1662(arg0);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	public void method5088() {
		this.aClass54_9.method1660();
		this.aClass199_26.method5750();
		this.aClass2_Sub11_52 = new Class2_Sub11();
		this.anInt5726 = this.anInt5725;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(JB)Lclient!fs;")
	public Class2_Sub11 method5092(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) this.aClass199_26.method5751(arg0);
		if (local15 != null) {
			this.aClass54_9.method1662(local15);
		}
		return local15;
	}
}
