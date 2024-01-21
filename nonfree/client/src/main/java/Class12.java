import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!kf;")
	private final Class4_Sub3 aClass4_Sub3_11 = new Class4_Sub3();

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!ob;")
	private final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private final int anInt517;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!ud;")
	private final Class75 aClass75_2;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class12(@OriginalArg(0) int arg0) {
		this.anInt515 = arg0;
		this.anInt517 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass75_2 = new Class75(local19);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method284() {
		while (true) {
			@Pc(13) Class4_Sub3 local13 = this.aClass59_1.method1286();
			if (local13 == null) {
				this.anInt515 = this.anInt517;
				return;
			}
			local13.method1989();
			local13.method1996();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BJ)V")
	public void method287(@OriginalArg(1) long arg0) {
		@Pc(6) Class4_Sub3 local6 = (Class4_Sub3) this.aClass75_2.method1896(arg0);
		if (local6 != null) {
			local6.method1989();
			local6.method1996();
			this.anInt515++;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZJ)Lclient!kf;")
	public Class4_Sub3 method289(@OriginalArg(1) long arg0) {
		@Pc(6) Class4_Sub3 local6 = (Class4_Sub3) this.aClass75_2.method1896(arg0);
		if (local6 != null) {
			this.aClass59_1.method1290(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kf;JB)V")
	public void method290(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt515 == 0) {
			@Pc(15) Class4_Sub3 local15 = this.aClass59_1.method1286();
			local15.method1989();
			local15.method1996();
			if (this.aClass4_Sub3_11 == local15) {
				local15 = this.aClass59_1.method1286();
				local15.method1989();
				local15.method1996();
			}
		} else {
			this.anInt515--;
		}
		this.aClass75_2.method1892(arg1, arg0);
		this.aClass59_1.method1290(arg0);
	}
}
