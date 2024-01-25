import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class356 {

	@OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
	public int anInt9848;

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "Lclient!nga;")
	private final Class233 aClass233_58 = new Class233(64);

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "Lclient!nga;")
	public final Class233 aClass233_59 = new Class233(60);

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "Lclient!eq;")
	public final Class97 aClass97_146;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lclient!eq;")
	private final Class97 aClass97_145;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;Lclient!eq;)V")
	public Class356(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Class97 arg3) {
		this.aClass97_146 = arg3;
		this.aClass97_145 = arg2;
		@Pc(26) int local26 = this.aClass97_145.method2546() - 1;
		this.aClass97_145.method2569(local26);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	public void method8210(@OriginalArg(0) int arg0) {
		this.anInt9848 = arg0;
		@Pc(9) Class233 local9 = this.aClass233_59;
		synchronized (this.aClass233_59) {
			this.aClass233_59.method5663();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	public void method8211() {
		@Pc(6) Class233 local6 = this.aClass233_58;
		synchronized (this.aClass233_58) {
			this.aClass233_58.method5665();
		}
		local6 = this.aClass233_59;
		synchronized (this.aClass233_59) {
			this.aClass233_59.method5665();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V")
	public void method8212() {
		@Pc(10) Class233 local10 = this.aClass233_58;
		synchronized (this.aClass233_58) {
			this.aClass233_58.method5664(5);
		}
		local10 = this.aClass233_59;
		synchronized (this.aClass233_59) {
			this.aClass233_59.method5664(5);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)Lclient!dfa;")
	public Class69 method8213(@OriginalArg(1) int arg0) {
		@Pc(14) Class233 local14 = this.aClass233_58;
		@Pc(24) Class69 local24;
		synchronized (this.aClass233_58) {
			local24 = (Class69) this.aClass233_58.method5669((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class97 local37 = this.aClass97_145;
		@Pc(50) byte[] local50;
		synchronized (this.aClass97_145) {
			local50 = this.aClass97_145.method2545(Static278.method4447(arg0), Static78.method1463(arg0));
		}
		local24 = new Class69();
		local24.anInt1808 = arg0;
		local24.aClass356_1 = this;
		if (local50 != null) {
			local24.method1577(new Class2_Sub34(local50));
		}
		@Pc(78) Class233 local78 = this.aClass233_58;
		synchronized (this.aClass233_58) {
			this.aClass233_58.method5662(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	public void method8215() {
		@Pc(11) Class233 local11 = this.aClass233_58;
		synchronized (this.aClass233_58) {
			this.aClass233_58.method5663();
		}
		local11 = this.aClass233_59;
		synchronized (this.aClass233_59) {
			this.aClass233_59.method5663();
		}
	}
}
