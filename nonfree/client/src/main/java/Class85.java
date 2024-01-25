import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class85 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!fs;")
	private Class2_Sub5 aClass2_Sub5_13 = new Class2_Sub5();

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!vv;")
	private final Class261 aClass261_6 = new Class261();

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	private final int anInt2339;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!ew;")
	private final Class72 aClass72_15;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this.anInt2338 = arg0;
		this.anInt2339 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass72_15 = new Class72(local19);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public void method1933() {
		this.aClass261_6.method5486();
		this.aClass72_15.method1650();
		this.aClass2_Sub5_13 = new Class2_Sub5();
		this.anInt2338 = this.anInt2339;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJLclient!fs;)V")
	public void method1934(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		if (this.anInt2338 == 0) {
			@Pc(10) Class2_Sub5 local10 = this.aClass261_6.method5485();
			local10.method5703();
			local10.method5621();
			if (local10 == this.aClass2_Sub5_13) {
				local10 = this.aClass261_6.method5485();
				local10.method5703();
				local10.method5621();
			}
		} else {
			this.anInt2338--;
		}
		this.aClass72_15.method1653(arg1, arg0);
		this.aClass261_6.method5487(arg1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JI)Lclient!fs;")
	public Class2_Sub5 method1935(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) this.aClass72_15.method1659(arg0);
		if (local15 != null) {
			this.aClass261_6.method5487(local15);
		}
		return local15;
	}
}
