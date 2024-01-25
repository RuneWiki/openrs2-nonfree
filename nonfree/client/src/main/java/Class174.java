import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class174 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!rp;")
	private final Class220 aClass220_40 = new Class220(64);

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!rp;")
	private final Class220 aClass220_41 = new Class220(100);

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!lt;")
	private final Class158 aClass158_61;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;Lclient!lt;)V")
	public Class174(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) Class158 arg4) {
		this.aClass158_61 = arg2;
		if (this.aClass158_61 != null) {
			@Pc(26) int local26 = this.aClass158_61.method3695() - 1;
			this.aClass158_61.method3683(local26);
		}
		Static427.method5832(arg4, arg3);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public void method4010() {
		@Pc(2) Class220 local2 = this.aClass220_40;
		synchronized (this.aClass220_40) {
			this.aClass220_40.method4998(5);
		}
		local2 = this.aClass220_41;
		synchronized (this.aClass220_41) {
			this.aClass220_41.method4998(5);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!fn;")
	public Class83 method4011(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_40;
		@Pc(16) Class83 local16;
		synchronized (this.aClass220_40) {
			local16 = (Class83) this.aClass220_40.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass158_61.method3672(Static242.method3738(arg0), Static26.method2140(arg0));
		local16 = new Class83();
		local16.anInt1994 = arg0;
		local16.aClass174_1 = this;
		if (local37 != null) {
			local16.method1833(new Class6_Sub15(local37));
		}
		local16.method1829();
		@Pc(67) Class220 local67 = this.aClass220_40;
		synchronized (this.aClass220_40) {
			this.aClass220_40.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public void method4012() {
		@Pc(6) Class220 local6 = this.aClass220_40;
		synchronized (this.aClass220_40) {
			this.aClass220_40.method4999();
		}
		local6 = this.aClass220_41;
		synchronized (this.aClass220_41) {
			this.aClass220_41.method4999();
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lclient!cq;")
	public Class6_Sub1_Sub5 method4013(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_41;
		@Pc(16) Class6_Sub1_Sub5 local16;
		synchronized (this.aClass220_41) {
			local16 = (Class6_Sub1_Sub5) this.aClass220_41.method4990((long) arg0);
			if (local16 == null) {
				local16 = new Class6_Sub1_Sub5(arg0);
				this.aClass220_41.method4996(local16, (long) arg0);
			}
		}
		synchronized (local16) {
			return local16.method1095() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method4014() {
		@Pc(2) Class220 local2 = this.aClass220_40;
		synchronized (this.aClass220_40) {
			this.aClass220_40.method4987();
		}
		local2 = this.aClass220_41;
		synchronized (this.aClass220_41) {
			this.aClass220_41.method4987();
		}
	}
}
