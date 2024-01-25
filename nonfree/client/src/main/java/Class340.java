import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class340 {

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
	public int anInt9401;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Z")
	public boolean aBoolean653 = false;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!qj;")
	private Class295 aClass295_62 = new Class295(64);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!qj;")
	public final Class295 aClass295_63 = new Class295(500);

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "Lclient!qj;")
	public final Class295 aClass295_64 = new Class295(30);

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Lclient!qj;")
	public final Class295 aClass295_65 = new Class295(50);

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
	public boolean aBoolean654;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!uq;")
	private final Class362 aClass362_136;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!uq;")
	public final Class362 aClass362_137;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!kw;IZLclient!uq;Lclient!uq;)V")
	public Class340(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(4) Class362 arg4) {
		this.aBoolean654 = arg2;
		this.aClass362_136 = arg3;
		this.aClass362_137 = arg4;
		if (this.aClass362_136 != null) {
			@Pc(47) int local47 = this.aClass362_136.method8373() - 1;
			this.aClass362_136.method8355(local47);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method7664() {
		@Pc(6) Class295 local6 = this.aClass295_62;
		synchronized (this.aClass295_62) {
			this.aClass295_62.method6474();
		}
		local6 = this.aClass295_63;
		synchronized (this.aClass295_63) {
			this.aClass295_63.method6474();
		}
		local6 = this.aClass295_64;
		synchronized (this.aClass295_64) {
			this.aClass295_64.method6474();
		}
		local6 = this.aClass295_65;
		synchronized (this.aClass295_65) {
			this.aClass295_65.method6474();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!lp;")
	public Class216 method7665(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_62;
		@Pc(16) Class216 local16;
		synchronized (this.aClass295_62) {
			local16 = (Class216) this.aClass295_62.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_136;
		@Pc(46) byte[] local46;
		synchronized (this.aClass362_136) {
			local46 = this.aClass362_136.method8368(Static406.method5602(arg0), Static547.method7018(arg0));
		}
		local16 = new Class216();
		local16.aClass340_3 = this;
		local16.anInt5946 = arg0;
		if (local46 != null) {
			local16.method5045(new Class3_Sub4(local46));
		}
		local16.method5046();
		if (local16.aBoolean412) {
			local16.anInt5972 = 0;
			local16.aBoolean401 = false;
		}
		if (!this.aBoolean654 && local16.aBoolean403) {
			local16.aStringArray41 = null;
			local16.anIntArray326 = null;
		}
		@Pc(105) Class295 local105 = this.aClass295_62;
		synchronized (this.aClass295_62) {
			this.aClass295_62.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
	public void method7666(@OriginalArg(0) int arg0) {
		this.aClass295_62 = new Class295(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public void method7667(@OriginalArg(0) int arg0) {
		this.anInt9401 = arg0;
		@Pc(9) Class295 local9 = this.aClass295_63;
		synchronized (this.aClass295_63) {
			this.aClass295_63.method6464();
		}
		local9 = this.aClass295_64;
		synchronized (this.aClass295_64) {
			this.aClass295_64.method6464();
		}
		local9 = this.aClass295_65;
		synchronized (this.aClass295_65) {
			this.aClass295_65.method6464();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
	public void method7668(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean653 != arg0) {
			this.aBoolean653 = arg0;
			this.method7670();
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V")
	public void method7669() {
		@Pc(6) Class295 local6 = this.aClass295_62;
		synchronized (this.aClass295_62) {
			this.aClass295_62.method6462(5);
		}
		local6 = this.aClass295_63;
		synchronized (this.aClass295_63) {
			this.aClass295_63.method6462(5);
		}
		local6 = this.aClass295_64;
		synchronized (this.aClass295_64) {
			this.aClass295_64.method6462(5);
		}
		local6 = this.aClass295_65;
		synchronized (this.aClass295_65) {
			this.aClass295_65.method6462(5);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method7670() {
		@Pc(2) Class295 local2 = this.aClass295_62;
		synchronized (this.aClass295_62) {
			this.aClass295_62.method6464();
		}
		local2 = this.aClass295_63;
		synchronized (this.aClass295_63) {
			this.aClass295_63.method6464();
		}
		local2 = this.aClass295_64;
		synchronized (this.aClass295_64) {
			this.aClass295_64.method6464();
		}
		local2 = this.aClass295_65;
		synchronized (this.aClass295_65) {
			this.aClass295_65.method6464();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	public void method7671(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean654 != arg0) {
			this.aBoolean654 = arg0;
			this.method7670();
		}
	}
}
