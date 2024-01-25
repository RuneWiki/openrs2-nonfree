import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class247 {

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public int anInt7102;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!ge;")
	private final Class83 aClass83_55 = new Class83(64);

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Lclient!ge;")
	public final Class83 aClass83_56 = new Class83(50);

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "Lclient!ge;")
	public final Class83 aClass83_57 = new Class83(5);

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "Lclient!sn;")
	public final Class235 aClass235_7;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!ci;")
	public final Class38 aClass38_85;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!ci;")
	private final Class38 aClass38_84;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!sn;IZLclient!ci;Lclient!ci;)V")
	public Class247(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) Class38 arg4) {
		this.aClass235_7 = arg0;
		this.aBoolean526 = arg2;
		this.aClass38_85 = arg4;
		this.aClass38_84 = arg3;
		if (this.aClass38_84 != null) {
			@Pc(41) int local41 = this.aClass38_84.method1035() - 1;
			this.aClass38_84.method1032(local41);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method5655() {
		@Pc(6) Class83 local6 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method2346();
		}
		local6 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method2346();
		}
		local6 = this.aClass83_57;
		synchronized (this.aClass83_57) {
			this.aClass83_57.method2346();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	public void method5656() {
		@Pc(6) Class83 local6 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method2345(5);
		}
		local6 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method2345(5);
		}
		local6 = this.aClass83_57;
		synchronized (this.aClass83_57) {
			this.aClass83_57.method2345(5);
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(ZI)V")
	public void method5657(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean526 != arg0) {
			this.aBoolean526 = arg0;
			this.method5655();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public void method5658() {
		@Pc(6) Class83 local6 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method2336();
		}
		local6 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method2336();
		}
		local6 = this.aClass83_57;
		synchronized (this.aClass83_57) {
			this.aClass83_57.method2336();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
	public void method5659(@OriginalArg(0) int arg0) {
		this.anInt7102 = arg0;
		@Pc(13) Class83 local13 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method2346();
		}
		local13 = this.aClass83_57;
		synchronized (this.aClass83_57) {
			this.aClass83_57.method2346();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Lclient!ti;")
	public Class241 method5660(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_55;
		@Pc(16) Class241 local16;
		synchronized (this.aClass83_55) {
			local16 = (Class241) this.aClass83_55.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class38 local35 = this.aClass38_84;
		@Pc(48) byte[] local48;
		synchronized (this.aClass38_84) {
			local48 = this.aClass38_84.method1039(Static369.method5238(arg0), Static406.method5347(arg0));
		}
		local16 = new Class241();
		local16.aClass247_2 = this;
		local16.anInt7025 = arg0;
		if (local48 != null) {
			local16.method5601(new Class4_Sub20(local48));
		}
		local16.method5591();
		@Pc(79) Class83 local79 = this.aClass83_55;
		synchronized (this.aClass83_55) {
			this.aClass83_55.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public void method5661() {
		@Pc(6) Class83 local6 = this.aClass83_56;
		synchronized (this.aClass83_56) {
			this.aClass83_56.method2346();
		}
		local6 = this.aClass83_57;
		synchronized (this.aClass83_57) {
			this.aClass83_57.method2346();
		}
	}
}
