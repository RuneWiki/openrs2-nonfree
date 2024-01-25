import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class282 {

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
	public int anInt8143;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_62 = new Class288(64);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_63 = new Class288(50);

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_64 = new Class288(5);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!gp;")
	public final Class117 aClass117_202;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!gp;")
	private final Class117 aClass117_203;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!jc;")
	public final Class155 aClass155_3;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!jc;IZLclient!gp;Lclient!gp;)V")
	public Class282(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class117 arg4) {
		this.aClass117_202 = arg4;
		this.aBoolean577 = arg2;
		this.aClass117_203 = arg3;
		this.aClass155_3 = arg0;
		if (this.aClass117_203 != null) {
			@Pc(41) int local41 = this.aClass117_203.method2972() - 1;
			this.aClass117_203.method2951(local41);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method6595() {
		@Pc(6) Class288 local6 = this.aClass288_62;
		synchronized (this.aClass288_62) {
			this.aClass288_62.method6744();
		}
		local6 = this.aClass288_63;
		synchronized (this.aClass288_63) {
			this.aClass288_63.method6744();
		}
		local6 = this.aClass288_64;
		synchronized (this.aClass288_64) {
			this.aClass288_64.method6744();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!vq;")
	public Class305 method6596(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_62;
		@Pc(16) Class305 local16;
		synchronized (this.aClass288_62) {
			local16 = (Class305) this.aClass288_62.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_203;
		@Pc(44) byte[] local44;
		synchronized (this.aClass117_203) {
			local44 = this.aClass117_203.method2962(Static178.method3066(arg0), Static366.method5590(arg0));
		}
		local16 = new Class305();
		local16.aClass282_2 = this;
		local16.anInt8805 = arg0;
		if (local44 != null) {
			local16.method7140(new Class5_Sub3(local44));
		}
		local16.method7143();
		@Pc(81) Class288 local81 = this.aClass288_62;
		synchronized (this.aClass288_62) {
			this.aClass288_62.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	public void method6597(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean577 != arg0) {
			this.aBoolean577 = arg0;
			this.method6595();
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public void method6599() {
		@Pc(6) Class288 local6 = this.aClass288_63;
		synchronized (this.aClass288_63) {
			this.aClass288_63.method6744();
		}
		local6 = this.aClass288_64;
		synchronized (this.aClass288_64) {
			this.aClass288_64.method6744();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
	public void method6600(@OriginalArg(0) int arg0) {
		this.anInt8143 = arg0;
		@Pc(17) Class288 local17 = this.aClass288_63;
		synchronized (this.aClass288_63) {
			this.aClass288_63.method6744();
		}
		local17 = this.aClass288_64;
		synchronized (this.aClass288_64) {
			this.aClass288_64.method6744();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	public void method6601() {
		@Pc(2) Class288 local2 = this.aClass288_62;
		synchronized (this.aClass288_62) {
			this.aClass288_62.method6735(5);
		}
		local2 = this.aClass288_63;
		synchronized (this.aClass288_63) {
			this.aClass288_63.method6735(5);
		}
		local2 = this.aClass288_64;
		synchronized (this.aClass288_64) {
			this.aClass288_64.method6735(5);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method6602() {
		@Pc(2) Class288 local2 = this.aClass288_62;
		synchronized (this.aClass288_62) {
			this.aClass288_62.method6742();
		}
		local2 = this.aClass288_63;
		synchronized (this.aClass288_63) {
			this.aClass288_63.method6742();
		}
		local2 = this.aClass288_64;
		synchronized (this.aClass288_64) {
			this.aClass288_64.method6742();
		}
	}
}
