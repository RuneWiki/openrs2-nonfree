import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class150 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public static int anInt3781 = 0;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Class2_Sub4_Sub2 aClass2_Sub4_Sub2_3 = new Class2_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!hu;")
	private final Class98 aClass98_32 = new Class98(64);

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!hu;")
	public final Class98 aClass98_33 = new Class98(2);

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!r;")
	public final Class197 aClass197_56;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!r;")
	private final Class197 aClass197_55;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V", line = 285)
	public Class150(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_56 = arg3;
		this.aClass197_55 = arg2;
		this.aClass197_55.method5082(33);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 70)
	public void method3729() {
		@Pc(2) Class98 local2 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2623();
		}
		local2 = this.aClass98_33;
		synchronized (this.aClass98_33) {
			this.aClass98_33.method2623();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!te;", line = 201)
	public Class220 method3732(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_32;
		@Pc(16) Class220 local16;
		synchronized (this.aClass98_32) {
			local16 = (Class220) this.aClass98_32.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_55.method5090(arg0, 33);
		local16 = new Class220();
		local16.aClass150_4 = this;
		if (local33 != null) {
			local16.method5662(new Class2_Sub4(local33));
		}
		@Pc(60) Class98 local60 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(BI)V", line = 233)
	public void method3733() {
		@Pc(2) Class98 local2 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2617(5);
		}
		local2 = this.aClass98_33;
		synchronized (this.aClass98_33) {
			this.aClass98_33.method2617(5);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 250)
	public void method3734() {
		@Pc(6) Class98 local6 = this.aClass98_32;
		synchronized (this.aClass98_32) {
			this.aClass98_32.method2616();
		}
		local6 = this.aClass98_33;
		synchronized (this.aClass98_33) {
			this.aClass98_33.method2616();
		}
	}
}
