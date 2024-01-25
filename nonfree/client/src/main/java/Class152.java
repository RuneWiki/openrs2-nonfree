import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class152 {

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!sw;")
	private final Class277 aClass277_33 = new Class277(64);

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!sw;")
	private final Class277 aClass277_34 = new Class277(100);

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_45;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;Lclient!dn;)V")
	public Class152(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class69 arg4) {
		this.aClass69_45 = arg2;
		if (this.aClass69_45 != null) {
			@Pc(26) int local26 = this.aClass69_45.method1895() - 1;
			this.aClass69_45.method1884(local26);
		}
		Static47.method5109(arg4, arg3);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public void method4040() {
		@Pc(2) Class277 local2 = this.aClass277_33;
		synchronized (this.aClass277_33) {
			this.aClass277_33.method7026();
		}
		local2 = this.aClass277_34;
		synchronized (this.aClass277_34) {
			this.aClass277_34.method7026();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lclient!sba;")
	public Class1_Sub2_Sub17 method4041(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_34;
		@Pc(18) Class1_Sub2_Sub17 local18;
		synchronized (this.aClass277_34) {
			local18 = (Class1_Sub2_Sub17) this.aClass277_34.method7014((long) arg0);
			if (local18 == null) {
				local18 = new Class1_Sub2_Sub17(arg0);
				this.aClass277_34.method7016(local18, (long) arg0);
			}
		}
		synchronized (local18) {
			return local18.method6817() ? local18 : null;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	public void method4043() {
		@Pc(6) Class277 local6 = this.aClass277_33;
		synchronized (this.aClass277_33) {
			this.aClass277_33.method7018(5);
		}
		local6 = this.aClass277_34;
		synchronized (this.aClass277_34) {
			this.aClass277_34.method7018(5);
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public void method4044() {
		@Pc(10) Class277 local10 = this.aClass277_33;
		synchronized (this.aClass277_33) {
			this.aClass277_33.method7019();
		}
		local10 = this.aClass277_34;
		synchronized (this.aClass277_34) {
			this.aClass277_34.method7019();
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Lclient!lk;")
	public Class176 method4045(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_33;
		@Pc(16) Class176 local16;
		synchronized (this.aClass277_33) {
			local16 = (Class176) this.aClass277_33.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_45;
		@Pc(42) byte[] local42;
		synchronized (this.aClass69_45) {
			local42 = this.aClass69_45.method1888(Static321.method5504(arg0), Static259.method4669(arg0));
		}
		local16 = new Class176();
		local16.aClass152_2 = this;
		local16.anInt5286 = arg0;
		if (local42 != null) {
			local16.method4874(new Class1_Sub17(local42));
		}
		local16.method4867();
		@Pc(81) Class277 local81 = this.aClass277_33;
		synchronized (this.aClass277_33) {
			this.aClass277_33.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
