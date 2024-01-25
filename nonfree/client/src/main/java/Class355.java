import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class355 {

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
	public int anInt10479;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!jr;")
	private final Class169 aClass169_69 = new Class169(64);

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "Lclient!jr;")
	public final Class169 aClass169_70 = new Class169(50);

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Lclient!jr;")
	public final Class169 aClass169_71 = new Class169(5);

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "Z")
	public boolean aBoolean719;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "Lclient!in;")
	private final Class157 aClass157_294;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "Lclient!in;")
	public final Class157 aClass157_293;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "Lclient!sj;")
	public final Class316 aClass316_7;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!sj;IZLclient!in;Lclient!in;)V")
	public Class355(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) Class157 arg4) {
		this.aBoolean719 = arg2;
		this.aClass157_294 = arg3;
		this.aClass157_293 = arg4;
		this.aClass316_7 = arg0;
		if (this.aClass157_294 != null) {
			@Pc(41) int local41 = this.aClass157_294.method4568() - 1;
			this.aClass157_294.method4561(local41);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)V")
	public void method8737(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean719 != arg0) {
			this.aBoolean719 = arg0;
			this.method8743();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
	public void method8738(@OriginalArg(1) int arg0) {
		this.anInt10479 = arg0;
		@Pc(9) Class169 local9 = this.aClass169_70;
		synchronized (this.aClass169_70) {
			this.aClass169_70.method5009();
		}
		local9 = this.aClass169_71;
		synchronized (this.aClass169_71) {
			this.aClass169_71.method5009();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public void method8739() {
		@Pc(2) Class169 local2 = this.aClass169_70;
		synchronized (this.aClass169_70) {
			this.aClass169_70.method5009();
		}
		local2 = this.aClass169_71;
		synchronized (this.aClass169_71) {
			this.aClass169_71.method5009();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	public void method8741() {
		@Pc(6) Class169 local6 = this.aClass169_69;
		synchronized (this.aClass169_69) {
			this.aClass169_69.method4997(5);
		}
		local6 = this.aClass169_70;
		synchronized (this.aClass169_70) {
			this.aClass169_70.method4997(5);
		}
		local6 = this.aClass169_71;
		synchronized (this.aClass169_71) {
			this.aClass169_71.method4997(5);
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public void method8743() {
		@Pc(6) Class169 local6 = this.aClass169_69;
		synchronized (this.aClass169_69) {
			this.aClass169_69.method5009();
		}
		local6 = this.aClass169_70;
		synchronized (this.aClass169_70) {
			this.aClass169_70.method5009();
		}
		local6 = this.aClass169_71;
		synchronized (this.aClass169_71) {
			this.aClass169_71.method5009();
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)Lclient!bb;")
	public Class27 method8744(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_69;
		@Pc(16) Class27 local16;
		synchronized (this.aClass169_69) {
			local16 = (Class27) this.aClass169_69.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_294;
		@Pc(44) byte[] local44;
		synchronized (this.aClass157_294) {
			local44 = this.aClass157_294.method4564(Static359.method6066(arg0), Static558.method8314(arg0));
		}
		local16 = new Class27();
		local16.anInt638 = arg0;
		local16.aClass355_1 = this;
		if (local44 != null) {
			local16.method731(new Class2_Sub11(local44));
		}
		local16.method732();
		@Pc(75) Class169 local75 = this.aClass169_69;
		synchronized (this.aClass169_69) {
			this.aClass169_69.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	public void method8745() {
		@Pc(6) Class169 local6 = this.aClass169_69;
		synchronized (this.aClass169_69) {
			this.aClass169_69.method5006();
		}
		local6 = this.aClass169_70;
		synchronized (this.aClass169_70) {
			this.aClass169_70.method5006();
		}
		local6 = this.aClass169_71;
		synchronized (this.aClass169_71) {
			this.aClass169_71.method5006();
		}
	}
}
