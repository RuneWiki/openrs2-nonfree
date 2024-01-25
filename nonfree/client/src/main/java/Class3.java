import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!pa;")
	private final Class265 aClass265_1 = new Class265(64);

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt30 = 0;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!cb;")
	private final Class50 aClass50_4;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public final int anInt24;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class3(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_4 = arg2;
		this.anInt24 = this.aClass50_4.method913(4);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Lclient!g;")
	public Class123 method40(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_1;
		@Pc(16) Class123 local16;
		synchronized (this.aClass265_1) {
			local16 = (Class123) this.aClass265_1.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class50 local35 = this.aClass50_4;
		@Pc(44) byte[] local44;
		synchronized (this.aClass50_4) {
			local44 = this.aClass50_4.method916(arg0, 4);
		}
		local16 = new Class123();
		local16.aClass3_3 = this;
		local16.anInt2864 = arg0;
		if (local44 != null) {
			local16.method2559(new Class5_Sub15(local44));
		}
		local16.method2561();
		@Pc(75) Class265 local75 = this.aClass265_1;
		synchronized (this.aClass265_1) {
			this.aClass265_1.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public void method41() {
		@Pc(2) Class265 local2 = this.aClass265_1;
		synchronized (this.aClass265_1) {
			this.aClass265_1.method6573();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method43() {
		@Pc(14) Class265 local14 = this.aClass265_1;
		synchronized (this.aClass265_1) {
			this.aClass265_1.method6568();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public void method44() {
		@Pc(6) Class265 local6 = this.aClass265_1;
		synchronized (this.aClass265_1) {
			this.aClass265_1.method6570(5);
		}
	}
}
