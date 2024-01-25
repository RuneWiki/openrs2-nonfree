import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class155 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!vg;")
	private final Class342 aClass342_89 = new Class342(64);

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!vg;")
	private final Class342 aClass342_90 = new Class342(100);

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_73;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;Lclient!ri;)V")
	public Class155(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3, @OriginalArg(4) Class284 arg4) {
		this.aClass284_73 = arg2;
		if (this.aClass284_73 != null) {
			@Pc(26) int local26 = this.aClass284_73.method6322() - 1;
			this.aClass284_73.method6354(local26);
		}
		Static247.method3933(arg3, arg4);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!pea;")
	public Class3_Sub7_Sub15 method3818(@OriginalArg(0) int arg0) {
		@Pc(14) Class342 local14 = this.aClass342_90;
		synchronized (this.aClass342_90) {
			@Pc(24) Class3_Sub7_Sub15 local24 = (Class3_Sub7_Sub15) this.aClass342_90.method7684((long) arg0);
			if (local24 == null) {
				local24 = new Class3_Sub7_Sub15(arg0);
				this.aClass342_90.method7683(local24, (long) arg0);
			}
			return local24.method5744() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lclient!qg;")
	public Class270 method3820(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_89;
		@Pc(16) Class270 local16;
		synchronized (this.aClass342_89) {
			local16 = (Class270) this.aClass342_89.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_73;
		@Pc(42) byte[] local42;
		synchronized (this.aClass284_73) {
			local42 = this.aClass284_73.method6331(Static276.method4183(arg0), Static384.method5344(arg0));
		}
		local16 = new Class270();
		local16.anInt7696 = arg0;
		local16.aClass155_2 = this;
		if (local42 != null) {
			local16.method6009(new Class3_Sub26(local42));
		}
		local16.method6010();
		@Pc(78) Class342 local78 = this.aClass342_89;
		synchronized (this.aClass342_89) {
			this.aClass342_89.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	public void method3822() {
		@Pc(2) Class342 local2 = this.aClass342_89;
		synchronized (this.aClass342_89) {
			this.aClass342_89.method7697(5);
		}
		local2 = this.aClass342_90;
		synchronized (this.aClass342_90) {
			this.aClass342_90.method7697(5);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method3823() {
		@Pc(2) Class342 local2 = this.aClass342_89;
		synchronized (this.aClass342_89) {
			this.aClass342_89.method7687();
		}
		local2 = this.aClass342_90;
		synchronized (this.aClass342_90) {
			this.aClass342_90.method7687();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method3824() {
		@Pc(7) Class342 local7 = this.aClass342_89;
		synchronized (this.aClass342_89) {
			this.aClass342_89.method7693();
		}
		local7 = this.aClass342_90;
		synchronized (this.aClass342_90) {
			this.aClass342_90.method7693();
		}
	}
}
