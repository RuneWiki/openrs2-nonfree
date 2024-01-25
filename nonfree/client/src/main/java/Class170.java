import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class170 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!fr;")
	private Class91 aClass91_66 = new Class91(128);

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!fr;")
	public Class91 aClass91_67 = new Class91(64);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!qs;")
	public final Class211 aClass211_64;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Lclient!qs;")
	private final Class211 aClass211_65;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;)V")
	public Class170(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_64 = arg3;
		this.aClass211_65 = arg2;
		this.aClass211_65.method4772(36);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lclient!co;")
	public Class47 method3739(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_66;
		@Pc(16) Class47 local16;
		synchronized (this.aClass91_66) {
			local16 = (Class47) this.aClass91_66.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_65;
		@Pc(40) byte[] local40;
		synchronized (this.aClass211_65) {
			local40 = this.aClass211_65.method4758(arg0, 36);
		}
		local16 = new Class47();
		local16.aClass170_1 = this;
		local16.anInt1534 = arg0;
		if (local40 != null) {
			local16.method1080(new Class1_Sub3(local40));
		}
		local16.method1079();
		@Pc(77) Class91 local77 = this.aClass91_66;
		synchronized (this.aClass91_66) {
			this.aClass91_66.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public void method3740() {
		@Pc(6) Class91 local6 = this.aClass91_66;
		synchronized (this.aClass91_66) {
			this.aClass91_66.method1993();
		}
		local6 = this.aClass91_67;
		synchronized (this.aClass91_67) {
			this.aClass91_67.method1993();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public void method3741() {
		@Pc(10) Class91 local10 = this.aClass91_66;
		synchronized (this.aClass91_66) {
			this.aClass91_66.method1999();
		}
		local10 = this.aClass91_67;
		synchronized (this.aClass91_67) {
			this.aClass91_67.method1999();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public void method3742() {
		@Pc(2) Class91 local2 = this.aClass91_66;
		synchronized (this.aClass91_66) {
			this.aClass91_66.method1998(5);
		}
		local2 = this.aClass91_67;
		synchronized (this.aClass91_67) {
			this.aClass91_67.method1998(5);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public void method3743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass91_66 = new Class91(arg0);
		this.aClass91_67 = new Class91(arg1);
	}
}
