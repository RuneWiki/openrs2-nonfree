import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class243 {

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public int anInt6287;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "Lclient!iha;")
	private Class168 aClass168_55 = new Class168(64);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!iha;")
	public final Class168 aClass168_56 = new Class168(500);

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!iha;")
	public final Class168 aClass168_57 = new Class168(30);

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "Lclient!iha;")
	public final Class168 aClass168_58 = new Class168(50);

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Lclient!gda;")
	public final Class126 aClass126_175;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!gda;")
	private final Class126 aClass126_174;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!po;IZLclient!gda;Lclient!gda;)V")
	public Class243(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) Class126 arg4) {
		this.aBoolean416 = arg2;
		this.aClass126_175 = arg4;
		this.aClass126_174 = arg3;
		if (this.aClass126_174 != null) {
			@Pc(47) int local47 = this.aClass126_174.method3082() - 1;
			this.aClass126_174.method3062(local47);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V")
	public void method5549(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean417 != arg0) {
			this.aBoolean417 = arg0;
			this.method5554();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public void method5550() {
		@Pc(6) Class168 local6 = this.aClass168_55;
		synchronized (this.aClass168_55) {
			this.aClass168_55.method3852(5);
		}
		local6 = this.aClass168_56;
		synchronized (this.aClass168_56) {
			this.aClass168_56.method3852(5);
		}
		local6 = this.aClass168_57;
		synchronized (this.aClass168_57) {
			this.aClass168_57.method3852(5);
		}
		local6 = this.aClass168_58;
		synchronized (this.aClass168_58) {
			this.aClass168_58.method3852(5);
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)V")
	public void method5551(@OriginalArg(1) int arg0) {
		this.aClass168_55 = new Class168(arg0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public void method5552() {
		@Pc(2) Class168 local2 = this.aClass168_55;
		synchronized (this.aClass168_55) {
			this.aClass168_55.method3856();
		}
		local2 = this.aClass168_56;
		synchronized (this.aClass168_56) {
			this.aClass168_56.method3856();
		}
		local2 = this.aClass168_57;
		synchronized (this.aClass168_57) {
			this.aClass168_57.method3856();
		}
		local2 = this.aClass168_58;
		synchronized (this.aClass168_58) {
			this.aClass168_58.method3856();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method5554() {
		@Pc(2) Class168 local2 = this.aClass168_55;
		synchronized (this.aClass168_55) {
			this.aClass168_55.method3862();
		}
		local2 = this.aClass168_56;
		synchronized (this.aClass168_56) {
			this.aClass168_56.method3862();
		}
		local2 = this.aClass168_57;
		synchronized (this.aClass168_57) {
			this.aClass168_57.method3862();
		}
		local2 = this.aClass168_58;
		synchronized (this.aClass168_58) {
			this.aClass168_58.method3862();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V")
	public void method5555(@OriginalArg(1) int arg0) {
		this.anInt6287 = arg0;
		@Pc(9) Class168 local9 = this.aClass168_56;
		synchronized (this.aClass168_56) {
			this.aClass168_56.method3862();
		}
		local9 = this.aClass168_57;
		synchronized (this.aClass168_57) {
			this.aClass168_57.method3862();
		}
		local9 = this.aClass168_58;
		synchronized (this.aClass168_58) {
			this.aClass168_58.method3862();
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(II)Lclient!tk;")
	public Class354 method5556(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_55;
		@Pc(16) Class354 local16;
		synchronized (this.aClass168_55) {
			local16 = (Class354) this.aClass168_55.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class126 local38 = this.aClass126_174;
		@Pc(51) byte[] local51;
		synchronized (this.aClass126_174) {
			local51 = this.aClass126_174.method3086(Static171.method4815(arg0), Static25.method386(arg0));
		}
		local16 = new Class354();
		local16.aClass243_4 = this;
		local16.anInt9392 = arg0;
		if (local51 != null) {
			local16.method8026(new Class5_Sub36(local51));
		}
		local16.method8016();
		if (!this.aBoolean416 && local16.aBoolean648) {
			local16.aStringArray39 = null;
			local16.anIntArray527 = null;
		}
		if (local16.aBoolean641) {
			local16.anInt9424 = 0;
			local16.aBoolean651 = false;
		}
		@Pc(111) Class168 local111 = this.aClass168_55;
		synchronized (this.aClass168_55) {
			this.aClass168_55.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZB)V")
	public void method5558(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean416 != arg0) {
			this.aBoolean416 = arg0;
			this.method5554();
		}
	}
}
