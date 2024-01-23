import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class33 {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!ia;")
	private Class3_Sub4 aClass3_Sub4_12 = new Class3_Sub4();

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!mm;")
	private Class115 aClass115_2 = new Class115();

	@OriginalMember(owner = "client!df", name = "q", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!cn;")
	private Class30 aClass30_9;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt1006 = arg0;
		this.anInt1005 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass30_9 = new Class30(local19);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method823() {
		this.aClass115_2.method2877();
		this.aClass30_9.method667();
		this.aClass3_Sub4_12 = new Class3_Sub4();
		this.anInt1006 = this.anInt1005;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lclient!wk;")
	public Class3 method825() {
		return this.aClass30_9.method664();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Lclient!wk;")
	public Class3 method826() {
		return this.aClass30_9.method671();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ia;BJ)V")
	public void method827(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1006 == 0) {
			@Pc(24) Class3_Sub4 local24 = this.aClass115_2.method2882();
			local24.method5013();
			local24.method5022();
			if (local24 == this.aClass3_Sub4_12) {
				local24 = this.aClass115_2.method2882();
				local24.method5013();
				local24.method5022();
			}
		} else {
			this.anInt1006--;
		}
		this.aClass30_9.method668(arg0, arg1);
		this.aClass115_2.method2875(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IJ)Lclient!ia;")
	public Class3_Sub4 method828(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub4 local10 = (Class3_Sub4) this.aClass30_9.method663(arg0);
		if (local10 != null) {
			this.aClass115_2.method2875(local10);
		}
		return local10;
	}
}
