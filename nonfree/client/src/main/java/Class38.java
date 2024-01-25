import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class38 {

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public int anInt922;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!wm;")
	private final Class267 aClass267_7 = new Class267(64);

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!wm;")
	public final Class267 aClass267_8 = new Class267(50);

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Lclient!wm;")
	public final Class267 aClass267_9 = new Class267(5);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!kp;")
	public final Class147 aClass147_1;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!ph;")
	private final Class187 aClass187_14;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!ph;")
	public final Class187 aClass187_13;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Z")
	public boolean aBoolean54;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!kp;IZLclient!ph;Lclient!ph;)V")
	public Class38(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class187 arg3, @OriginalArg(4) Class187 arg4) {
		this.aClass147_1 = arg0;
		this.aClass187_14 = arg3;
		this.aClass187_13 = arg4;
		this.aBoolean54 = arg2;
		if (this.aClass187_14 != null) {
			@Pc(41) int local41 = this.aClass187_14.method4302() - 1;
			this.aClass187_14.method4306(local41);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method860() {
		@Pc(6) Class267 local6 = this.aClass267_7;
		synchronized (this.aClass267_7) {
			this.aClass267_7.method6007(5);
		}
		local6 = this.aClass267_8;
		synchronized (this.aClass267_8) {
			this.aClass267_8.method6007(5);
		}
		local6 = this.aClass267_9;
		synchronized (this.aClass267_9) {
			this.aClass267_9.method6007(5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZ)V")
	public void method861(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean54 != arg0) {
			this.aBoolean54 = arg0;
			this.method862();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public void method862() {
		@Pc(6) Class267 local6 = this.aClass267_7;
		synchronized (this.aClass267_7) {
			this.aClass267_7.method6011();
		}
		local6 = this.aClass267_8;
		synchronized (this.aClass267_8) {
			this.aClass267_8.method6011();
		}
		local6 = this.aClass267_9;
		synchronized (this.aClass267_9) {
			this.aClass267_9.method6011();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public void method863() {
		@Pc(2) Class267 local2 = this.aClass267_7;
		synchronized (this.aClass267_7) {
			this.aClass267_7.method6013();
		}
		local2 = this.aClass267_8;
		synchronized (this.aClass267_8) {
			this.aClass267_8.method6013();
		}
		local2 = this.aClass267_9;
		synchronized (this.aClass267_9) {
			this.aClass267_9.method6013();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Lclient!sh;")
	public Class222 method866(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_7;
		@Pc(18) Class222 local18;
		synchronized (this.aClass267_7) {
			local18 = (Class222) this.aClass267_7.method6014((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class187 local31 = this.aClass187_14;
		@Pc(44) byte[] local44;
		synchronized (this.aClass187_14) {
			local44 = this.aClass187_14.method4300(Static204.method3196(arg0), Static392.method5217(arg0));
		}
		local18 = new Class222();
		local18.anInt6362 = arg0;
		local18.aClass38_3 = this;
		if (local44 != null) {
			local18.method4937(new Class10_Sub8(local44));
		}
		local18.method4939();
		@Pc(82) Class267 local82 = this.aClass267_7;
		synchronized (this.aClass267_7) {
			this.aClass267_7.method6008(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
	public void method867(@OriginalArg(1) int arg0) {
		this.anInt922 = arg0;
		@Pc(9) Class267 local9 = this.aClass267_8;
		synchronized (this.aClass267_8) {
			this.aClass267_8.method6011();
		}
		local9 = this.aClass267_9;
		synchronized (this.aClass267_9) {
			this.aClass267_9.method6011();
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	public void method868() {
		@Pc(7) Class267 local7 = this.aClass267_8;
		synchronized (this.aClass267_8) {
			this.aClass267_8.method6011();
		}
		local7 = this.aClass267_9;
		synchronized (this.aClass267_9) {
			this.aClass267_9.method6011();
		}
	}
}
