import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class237 {

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
	public int anInt6653;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
	public boolean aBoolean439 = false;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Lclient!wm;")
	private Class267 aClass267_71 = new Class267(64);

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Lclient!wm;")
	public final Class267 aClass267_72 = new Class267(500);

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Lclient!wm;")
	public final Class267 aClass267_73 = new Class267(30);

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!wm;")
	public final Class267 aClass267_74 = new Class267(50);

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Lclient!ph;")
	private final Class187 aClass187_114;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!ph;")
	public final Class187 aClass187_115;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!kp;IZLclient!ph;Lclient!ph;)V")
	public Class237(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class187 arg3, @OriginalArg(4) Class187 arg4) {
		this.aClass187_114 = arg3;
		this.aClass187_115 = arg4;
		this.aBoolean438 = arg2;
		if (this.aClass187_114 != null) {
			@Pc(47) int local47 = this.aClass187_114.method4302() - 1;
			this.aClass187_114.method4306(local47);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V")
	public void method5204(@OriginalArg(0) int arg0) {
		this.aClass267_71 = new Class267(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	public void method5205() {
		@Pc(6) Class267 local6 = this.aClass267_71;
		synchronized (this.aClass267_71) {
			this.aClass267_71.method6013();
		}
		local6 = this.aClass267_72;
		synchronized (this.aClass267_72) {
			this.aClass267_72.method6013();
		}
		local6 = this.aClass267_73;
		synchronized (this.aClass267_73) {
			this.aClass267_73.method6013();
		}
		local6 = this.aClass267_74;
		synchronized (this.aClass267_74) {
			this.aClass267_74.method6013();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)V")
	public void method5207(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean439) {
			this.aBoolean439 = arg0;
			this.method5208();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public void method5208() {
		@Pc(2) Class267 local2 = this.aClass267_71;
		synchronized (this.aClass267_71) {
			this.aClass267_71.method6011();
		}
		local2 = this.aClass267_72;
		synchronized (this.aClass267_72) {
			this.aClass267_72.method6011();
		}
		local2 = this.aClass267_73;
		synchronized (this.aClass267_73) {
			this.aClass267_73.method6011();
		}
		local2 = this.aClass267_74;
		synchronized (this.aClass267_74) {
			this.aClass267_74.method6011();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V")
	public void method5209(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean438) {
			this.aBoolean438 = arg0;
			this.method5208();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public void method5210() {
		@Pc(2) Class267 local2 = this.aClass267_71;
		synchronized (this.aClass267_71) {
			this.aClass267_71.method6007(5);
		}
		local2 = this.aClass267_72;
		synchronized (this.aClass267_72) {
			this.aClass267_72.method6007(5);
		}
		local2 = this.aClass267_73;
		synchronized (this.aClass267_73) {
			this.aClass267_73.method6007(5);
		}
		local2 = this.aClass267_74;
		synchronized (this.aClass267_74) {
			this.aClass267_74.method6007(5);
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(IZ)V")
	public void method5211(@OriginalArg(0) int arg0) {
		this.anInt6653 = arg0;
		@Pc(9) Class267 local9 = this.aClass267_72;
		synchronized (this.aClass267_72) {
			this.aClass267_72.method6011();
		}
		local9 = this.aClass267_73;
		synchronized (this.aClass267_73) {
			this.aClass267_73.method6011();
		}
		local9 = this.aClass267_74;
		synchronized (this.aClass267_74) {
			this.aClass267_74.method6011();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lclient!jc;")
	public Class126 method5212(@OriginalArg(1) int arg0) {
		@Pc(12) Class267 local12 = this.aClass267_71;
		@Pc(22) Class126 local22;
		synchronized (this.aClass267_71) {
			local22 = (Class126) this.aClass267_71.method6014((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class187 local35 = this.aClass187_114;
		@Pc(48) byte[] local48;
		synchronized (this.aClass187_114) {
			local48 = this.aClass187_114.method4300(Static182.method2974(arg0), Static404.method5328(arg0));
		}
		local22 = new Class126();
		local22.anInt3798 = arg0;
		local22.aClass237_3 = this;
		if (local48 != null) {
			local22.method3011(new Class10_Sub8(local48));
		}
		local22.method3019();
		if (local22.aBoolean250) {
			local22.aBoolean247 = false;
			local22.anInt3791 = 0;
		}
		if (!this.aBoolean438 && local22.aBoolean255) {
			local22.aStringArray27 = null;
			local22.anIntArray384 = null;
		}
		@Pc(100) Class267 local100 = this.aClass267_71;
		synchronized (this.aClass267_71) {
			this.aClass267_71.method6008(local22, (long) arg0);
			return local22;
		}
	}
}
