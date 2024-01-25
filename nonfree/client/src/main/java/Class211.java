import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class211 {

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!mf;")
	private final Class222 aClass222_33 = new Class222(64);

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!mf;")
	private final Class222 aClass222_34 = new Class222(100);

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!pu;")
	private final Class270 aClass270_60;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;Lclient!pu;)V")
	public Class211(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(4) Class270 arg4) {
		this.aClass270_60 = arg2;
		if (this.aClass270_60 != null) {
			@Pc(26) int local26 = this.aClass270_60.method5674() - 1;
			this.aClass270_60.method5685(local26);
		}
		Static72.method1231(arg3, arg4);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lclient!bba;")
	public Class1_Sub6_Sub1 method4272(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_34;
		synchronized (this.aClass222_34) {
			@Pc(25) Class1_Sub6_Sub1 local25 = (Class1_Sub6_Sub1) this.aClass222_34.method4430((long) arg0);
			if (local25 == null) {
				local25 = new Class1_Sub6_Sub1(arg0);
				this.aClass222_34.method4434(local25, (long) arg0);
			}
			return local25.method351() ? local25 : null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	public void method4275() {
		@Pc(6) Class222 local6 = this.aClass222_33;
		synchronized (this.aClass222_33) {
			this.aClass222_33.method4422();
		}
		local6 = this.aClass222_34;
		synchronized (this.aClass222_34) {
			this.aClass222_34.method4422();
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	public void method4276() {
		@Pc(10) Class222 local10 = this.aClass222_33;
		synchronized (this.aClass222_33) {
			this.aClass222_33.method4433(5);
		}
		local10 = this.aClass222_34;
		synchronized (this.aClass222_34) {
			this.aClass222_34.method4433(5);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)Lclient!rk;")
	public Class290 method4277(@OriginalArg(0) int arg0) {
		@Pc(11) Class222 local11 = this.aClass222_33;
		@Pc(21) Class290 local21;
		synchronized (this.aClass222_33) {
			local21 = (Class290) this.aClass222_33.method4430((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class270 local34 = this.aClass270_60;
		@Pc(47) byte[] local47;
		synchronized (this.aClass270_60) {
			local47 = this.aClass270_60.method5704(Static331.method4527(arg0), Static360.method4778(arg0));
		}
		local21 = new Class290();
		local21.aClass211_2 = this;
		local21.anInt7809 = arg0;
		if (local47 != null) {
			local21.method6265(new Class1_Sub35(local47));
		}
		local21.method6267();
		@Pc(78) Class222 local78 = this.aClass222_33;
		synchronized (this.aClass222_33) {
			this.aClass222_33.method4434(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method4278() {
		@Pc(6) Class222 local6 = this.aClass222_33;
		synchronized (this.aClass222_33) {
			this.aClass222_33.method4428();
		}
		local6 = this.aClass222_34;
		synchronized (this.aClass222_34) {
			this.aClass222_34.method4428();
		}
	}
}
