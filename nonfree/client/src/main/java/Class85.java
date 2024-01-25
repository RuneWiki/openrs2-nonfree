import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class85 {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!ge;")
	private final Class83 aClass83_20 = new Class83(64);

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!ge;")
	private final Class83 aClass83_21 = new Class83(100);

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!ci;")
	private final Class38 aClass38_27;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;Lclient!ci;)V")
	public Class85(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) Class38 arg4) {
		this.aClass38_27 = arg2;
		if (this.aClass38_27 != null) {
			@Pc(26) int local26 = this.aClass38_27.method1035() - 1;
			this.aClass38_27.method1032(local26);
		}
		Static338.method4976(arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Lclient!rw;")
	public Class4_Sub1_Sub17 method2403(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_21;
		@Pc(21) Class4_Sub1_Sub17 local21;
		synchronized (this.aClass83_21) {
			local21 = (Class4_Sub1_Sub17) this.aClass83_21.method2338((long) arg0);
			if (local21 == null) {
				local21 = new Class4_Sub1_Sub17(arg0);
				this.aClass83_21.method2337(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method5226() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	public void method2404() {
		@Pc(2) Class83 local2 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method2346();
		}
		local2 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method2346();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lclient!kg;")
	public Class130 method2406(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_20;
		@Pc(16) Class130 local16;
		synchronized (this.aClass83_20) {
			local16 = (Class130) this.aClass83_20.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_27;
		@Pc(42) byte[] local42;
		synchronized (this.aClass38_27) {
			local42 = this.aClass38_27.method1039(Static298.method4544(arg0), Static359.method5164(arg0));
		}
		local16 = new Class130();
		local16.anInt3949 = arg0;
		local16.aClass85_2 = this;
		if (local42 != null) {
			local16.method3533(new Class4_Sub20(local42));
		}
		local16.method3538();
		@Pc(79) Class83 local79 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	public void method2408() {
		@Pc(6) Class83 local6 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method2345(5);
		}
		local6 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method2345(5);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public void method2409() {
		@Pc(10) Class83 local10 = this.aClass83_20;
		synchronized (this.aClass83_20) {
			this.aClass83_20.method2336();
		}
		local10 = this.aClass83_21;
		synchronized (this.aClass83_21) {
			this.aClass83_21.method2336();
		}
	}
}
