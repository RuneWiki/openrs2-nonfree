import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class264 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "Lclient!gw;")
	private final Class136 aClass136_49 = new Class136(64);

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "Lclient!gw;")
	private final Class136 aClass136_50 = new Class136(100);

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "Lclient!uu;")
	private final Class343 aClass343_206;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;Lclient!uu;)V")
	public Class264(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3, @OriginalArg(4) Class343 arg4) {
		this.aClass343_206 = arg2;
		if (this.aClass343_206 != null) {
			@Pc(26) int local26 = this.aClass343_206.method8144() - 1;
			this.aClass343_206.method8157(local26);
		}
		Static228.method3949(arg4, arg3);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	public void method6568() {
		@Pc(12) Class136 local12 = this.aClass136_49;
		synchronized (this.aClass136_49) {
			this.aClass136_49.method3138();
		}
		local12 = this.aClass136_50;
		synchronized (this.aClass136_50) {
			this.aClass136_50.method3138();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IB)Lclient!ro;")
	public Class3_Sub7_Sub18 method6569(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_50;
		synchronized (this.aClass136_50) {
			@Pc(16) Class3_Sub7_Sub18 local16 = (Class3_Sub7_Sub18) this.aClass136_50.method3134((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub7_Sub18(arg0);
				this.aClass136_50.method3135(local16, (long) arg0);
			}
			return local16.method7263() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V")
	public void method6570() {
		@Pc(2) Class136 local2 = this.aClass136_49;
		synchronized (this.aClass136_49) {
			this.aClass136_49.method3142();
		}
		@Pc(29) Class136 local29 = this.aClass136_50;
		synchronized (this.aClass136_50) {
			this.aClass136_50.method3142();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Lclient!pia;")
	public Class267 method6574(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_49;
		@Pc(16) Class267 local16;
		synchronized (this.aClass136_49) {
			local16 = (Class267) this.aClass136_49.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_206;
		@Pc(44) byte[] local44;
		synchronized (this.aClass343_206) {
			local44 = this.aClass343_206.method8132(Static418.method6448(arg0), Static73.method1258(arg0));
		}
		local16 = new Class267();
		local16.anInt7578 = arg0;
		local16.aClass264_1 = this;
		if (local44 != null) {
			local16.method6608(new Class3_Sub9(local44));
		}
		local16.method6606();
		@Pc(77) Class136 local77 = this.aClass136_49;
		synchronized (this.aClass136_49) {
			this.aClass136_49.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V")
	public void method6575() {
		@Pc(2) Class136 local2 = this.aClass136_49;
		synchronized (this.aClass136_49) {
			this.aClass136_49.method3132(5);
		}
		local2 = this.aClass136_50;
		synchronized (this.aClass136_50) {
			this.aClass136_50.method3132(5);
		}
	}
}
