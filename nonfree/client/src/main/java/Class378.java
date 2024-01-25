import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class378 {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!qj;")
	private Class295 aClass295_69 = new Class295(128);

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!qj;")
	public Class295 aClass295_70 = new Class295(64);

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!uq;")
	public final Class362 aClass362_152;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_151;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class378(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_152 = arg3;
		this.aClass362_151 = arg2;
		this.aClass362_151.method8355(36);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	public void method8701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass295_69 = new Class295(arg1);
		this.aClass295_70 = new Class295(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	public void method8703() {
		@Pc(2) Class295 local2 = this.aClass295_69;
		synchronized (this.aClass295_69) {
			this.aClass295_69.method6474();
		}
		local2 = this.aClass295_70;
		synchronized (this.aClass295_70) {
			this.aClass295_70.method6474();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public void method8704() {
		@Pc(2) Class295 local2 = this.aClass295_69;
		synchronized (this.aClass295_69) {
			this.aClass295_69.method6462(5);
		}
		local2 = this.aClass295_70;
		synchronized (this.aClass295_70) {
			this.aClass295_70.method6462(5);
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
	public void method8706() {
		@Pc(6) Class295 local6 = this.aClass295_69;
		synchronized (this.aClass295_69) {
			this.aClass295_69.method6464();
		}
		local6 = this.aClass295_70;
		synchronized (this.aClass295_70) {
			this.aClass295_70.method6464();
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Lclient!js;")
	public Class188 method8708(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_69;
		@Pc(16) Class188 local16;
		synchronized (this.aClass295_69) {
			local16 = (Class188) this.aClass295_69.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_151;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_151) {
			local38 = this.aClass362_151.method8368(36, arg0);
		}
		local16 = new Class188();
		local16.anInt4968 = arg0;
		local16.aClass378_2 = this;
		if (local38 != null) {
			local16.method4286(new Class3_Sub4(local38));
		}
		local16.method4292();
		@Pc(75) Class295 local75 = this.aClass295_69;
		synchronized (this.aClass295_69) {
			this.aClass295_69.method6469((long) arg0, local16);
			return local16;
		}
	}
}
