import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class88 {

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!wm;")
	private Class267 aClass267_21 = new Class267(128);

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Lclient!wm;")
	public Class267 aClass267_22 = new Class267(64);

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!ph;")
	public final Class187 aClass187_51;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!ph;")
	private final Class187 aClass187_52;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;)V")
	public Class88(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3) {
		this.aClass187_51 = arg3;
		this.aClass187_52 = arg2;
		this.aClass187_52.method4306(36);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method2267() {
		@Pc(10) Class267 local10 = this.aClass267_21;
		synchronized (this.aClass267_21) {
			this.aClass267_21.method6007(5);
		}
		local10 = this.aClass267_22;
		synchronized (this.aClass267_22) {
			this.aClass267_22.method6007(5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Lclient!rk;")
	public Class208 method2268(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_21;
		@Pc(16) Class208 local16;
		synchronized (this.aClass267_21) {
			local16 = (Class208) this.aClass267_21.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_52) {
			local38 = this.aClass187_52.method4300(36, arg0);
		}
		local16 = new Class208();
		local16.anInt6001 = arg0;
		local16.aClass88_4 = this;
		if (local38 != null) {
			local16.method4757(new Class10_Sub8(local38));
		}
		local16.method4754();
		@Pc(74) Class267 local74 = this.aClass267_21;
		synchronized (this.aClass267_21) {
			this.aClass267_21.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public void method2269() {
		@Pc(2) Class267 local2 = this.aClass267_21;
		synchronized (this.aClass267_21) {
			this.aClass267_21.method6011();
		}
		local2 = this.aClass267_22;
		synchronized (this.aClass267_22) {
			this.aClass267_22.method6011();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public void method2270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass267_21 = new Class267(arg1);
		this.aClass267_22 = new Class267(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public void method2272() {
		@Pc(6) Class267 local6 = this.aClass267_21;
		synchronized (this.aClass267_21) {
			this.aClass267_21.method6013();
		}
		local6 = this.aClass267_22;
		synchronized (this.aClass267_22) {
			this.aClass267_22.method6013();
		}
	}
}
