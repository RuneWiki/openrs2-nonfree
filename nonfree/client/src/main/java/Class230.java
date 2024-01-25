import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class230 {

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public int anInt6302;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!pa;")
	private final Class265 aClass265_35 = new Class265(64);

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!pa;")
	public final Class265 aClass265_38 = new Class265(50);

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!pa;")
	public final Class265 aClass265_39 = new Class265(5);

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!iv;")
	public final Class174 aClass174_3;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!cb;")
	public final Class50 aClass50_102;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!cb;")
	private final Class50 aClass50_103;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!iv;IZLclient!cb;Lclient!cb;)V")
	public Class230(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) Class50 arg4) {
		this.aClass174_3 = arg0;
		this.aBoolean456 = arg2;
		this.aClass50_102 = arg4;
		this.aClass50_103 = arg3;
		if (this.aClass50_103 != null) {
			@Pc(41) int local41 = this.aClass50_103.method902() - 1;
			this.aClass50_103.method913(local41);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public void method5288(@OriginalArg(1) int arg0) {
		this.anInt6302 = arg0;
		@Pc(9) Class265 local9 = this.aClass265_38;
		synchronized (this.aClass265_38) {
			this.aClass265_38.method6568();
		}
		local9 = this.aClass265_39;
		synchronized (this.aClass265_39) {
			this.aClass265_39.method6568();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public void method5290() {
		@Pc(2) Class265 local2 = this.aClass265_35;
		synchronized (this.aClass265_35) {
			this.aClass265_35.method6570(5);
		}
		local2 = this.aClass265_38;
		synchronized (this.aClass265_38) {
			this.aClass265_38.method6570(5);
		}
		local2 = this.aClass265_39;
		synchronized (this.aClass265_39) {
			this.aClass265_39.method6570(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method5292() {
		@Pc(2) Class265 local2 = this.aClass265_38;
		synchronized (this.aClass265_38) {
			this.aClass265_38.method6568();
		}
		local2 = this.aClass265_39;
		synchronized (this.aClass265_39) {
			this.aClass265_39.method6568();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public void method5293() {
		@Pc(6) Class265 local6 = this.aClass265_35;
		synchronized (this.aClass265_35) {
			this.aClass265_35.method6568();
		}
		local6 = this.aClass265_38;
		synchronized (this.aClass265_38) {
			this.aClass265_38.method6568();
		}
		local6 = this.aClass265_39;
		synchronized (this.aClass265_39) {
			this.aClass265_39.method6568();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public void method5295() {
		@Pc(10) Class265 local10 = this.aClass265_35;
		synchronized (this.aClass265_35) {
			this.aClass265_35.method6573();
		}
		local10 = this.aClass265_38;
		synchronized (this.aClass265_38) {
			this.aClass265_38.method6573();
		}
		local10 = this.aClass265_39;
		synchronized (this.aClass265_39) {
			this.aClass265_39.method6573();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public void method5296(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean456 != arg0) {
			this.aBoolean456 = arg0;
			this.method5293();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Lclient!rn;")
	public Class311 method5297(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_35;
		@Pc(16) Class311 local16;
		synchronized (this.aClass265_35) {
			local16 = (Class311) this.aClass265_35.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_103;
		@Pc(42) byte[] local42;
		synchronized (this.aClass50_103) {
			local42 = this.aClass50_103.method916(Static143.method2156(arg0), Static628.method8371(arg0));
		}
		local16 = new Class311();
		local16.aClass230_2 = this;
		local16.anInt8665 = arg0;
		if (local42 != null) {
			local16.method7328(new Class5_Sub15(local42));
		}
		local16.method7327();
		@Pc(81) Class265 local81 = this.aClass265_35;
		synchronized (this.aClass265_35) {
			this.aClass265_35.method6566(local16, (long) arg0);
			return local16;
		}
	}
}
