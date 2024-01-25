import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class182 {

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public int anInt4782;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!qj;")
	private final Class295 aClass295_20 = new Class295(64);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!qj;")
	public final Class295 aClass295_21 = new Class295(60);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_57;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!uq;")
	public final Class362 aClass362_58;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class182(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_57 = arg2;
		this.aClass362_58 = arg3;
		@Pc(26) int local26 = this.aClass362_57.method8373() - 1;
		this.aClass362_57.method8355(local26);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public void method4100() {
		@Pc(2) Class295 local2 = this.aClass295_20;
		synchronized (this.aClass295_20) {
			this.aClass295_20.method6464();
		}
		local2 = this.aClass295_21;
		synchronized (this.aClass295_21) {
			this.aClass295_21.method6464();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4101() {
		@Pc(2) Class295 local2 = this.aClass295_20;
		synchronized (this.aClass295_20) {
			this.aClass295_20.method6474();
		}
		local2 = this.aClass295_21;
		synchronized (this.aClass295_21) {
			this.aClass295_21.method6474();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public void method4105(@OriginalArg(0) int arg0) {
		this.anInt4782 = arg0;
		@Pc(13) Class295 local13 = this.aClass295_21;
		synchronized (this.aClass295_21) {
			this.aClass295_21.method6464();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
	public void method4106() {
		@Pc(12) Class295 local12 = this.aClass295_20;
		synchronized (this.aClass295_20) {
			this.aClass295_20.method6462(5);
		}
		local12 = this.aClass295_21;
		synchronized (this.aClass295_21) {
			this.aClass295_21.method6462(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)Lclient!el;")
	public Class106 method4107(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_20;
		@Pc(16) Class106 local16;
		synchronized (this.aClass295_20) {
			local16 = (Class106) this.aClass295_20.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class362 local35 = this.aClass362_57;
		@Pc(48) byte[] local48;
		synchronized (this.aClass362_57) {
			local48 = this.aClass362_57.method8368(Static490.method7817(arg0), Static256.method3844(arg0));
		}
		local16 = new Class106();
		local16.anInt2670 = arg0;
		local16.aClass182_1 = this;
		if (local48 != null) {
			local16.method2340(new Class3_Sub4(local48));
		}
		@Pc(76) Class295 local76 = this.aClass295_20;
		synchronized (this.aClass295_20) {
			this.aClass295_20.method6469((long) arg0, local16);
			return local16;
		}
	}
}
