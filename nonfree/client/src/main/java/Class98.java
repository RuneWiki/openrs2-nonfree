import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class98 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!wm;")
	private final Class267 aClass267_23 = new Class267(64);

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!wm;")
	private final Class267 aClass267_24 = new Class267(100);

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!ph;")
	private final Class187 aClass187_57;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;Lclient!ph;)V")
	public Class98(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3, @OriginalArg(4) Class187 arg4) {
		this.aClass187_57 = arg2;
		if (this.aClass187_57 != null) {
			@Pc(26) int local26 = this.aClass187_57.method4302() - 1;
			this.aClass187_57.method4306(local26);
		}
		Static315.method4329(arg3, arg4);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method2404() {
		@Pc(6) Class267 local6 = this.aClass267_23;
		synchronized (this.aClass267_23) {
			this.aClass267_23.method6011();
		}
		local6 = this.aClass267_24;
		synchronized (this.aClass267_24) {
			this.aClass267_24.method6011();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)Lclient!jv;")
	public Class137 method2405(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_23;
		@Pc(16) Class137 local16;
		synchronized (this.aClass267_23) {
			local16 = (Class137) this.aClass267_23.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_57;
		@Pc(42) byte[] local42;
		synchronized (this.aClass187_57) {
			local42 = this.aClass187_57.method4300(Static15.method239(arg0), Static36.method501(arg0));
		}
		local16 = new Class137();
		local16.anInt4041 = arg0;
		local16.aClass98_1 = this;
		if (local42 != null) {
			local16.method3213(new Class10_Sub8(local42));
		}
		local16.method3207();
		@Pc(73) Class267 local73 = this.aClass267_23;
		synchronized (this.aClass267_23) {
			this.aClass267_23.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method2407() {
		@Pc(6) Class267 local6 = this.aClass267_23;
		synchronized (this.aClass267_23) {
			this.aClass267_23.method6013();
		}
		local6 = this.aClass267_24;
		synchronized (this.aClass267_24) {
			this.aClass267_24.method6013();
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	public void method2408() {
		@Pc(6) Class267 local6 = this.aClass267_23;
		synchronized (this.aClass267_23) {
			this.aClass267_23.method6007(5);
		}
		local6 = this.aClass267_24;
		synchronized (this.aClass267_24) {
			this.aClass267_24.method6007(5);
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)Lclient!ei;")
	public Class10_Sub1_Sub4 method2409(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_24;
		@Pc(16) Class10_Sub1_Sub4 local16;
		synchronized (this.aClass267_24) {
			local16 = (Class10_Sub1_Sub4) this.aClass267_24.method6014((long) arg0);
			if (local16 == null) {
				local16 = new Class10_Sub1_Sub4(arg0);
				this.aClass267_24.method6008(local16, (long) arg0);
			}
		}
		synchronized (local16) {
			return local16.method1708() ? local16 : null;
		}
	}
}
