import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class220 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!of;")
	private final Class236 aClass236_67 = new Class236(64);

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!of;")
	private final Class236 aClass236_68 = new Class236(100);

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!oh;")
	private final Class237 aClass237_98;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;Lclient!oh;)V")
	public Class220(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(4) Class237 arg4) {
		this.aClass237_98 = arg2;
		if (this.aClass237_98 != null) {
			@Pc(26) int local26 = this.aClass237_98.method6311() - 1;
			this.aClass237_98.method6315(local26);
		}
		Static303.method4963(arg3, arg4);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public void method5666() {
		@Pc(12) Class236 local12 = this.aClass236_67;
		synchronized (this.aClass236_67) {
			this.aClass236_67.method6253();
		}
		local12 = this.aClass236_68;
		synchronized (this.aClass236_68) {
			this.aClass236_68.method6253();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lclient!wc;")
	public Class8_Sub5_Sub21 method5668(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_68;
		synchronized (this.aClass236_68) {
			@Pc(16) Class8_Sub5_Sub21 local16 = (Class8_Sub5_Sub21) this.aClass236_68.method6242((long) arg0);
			if (local16 == null) {
				local16 = new Class8_Sub5_Sub21(arg0);
				this.aClass236_68.method6241((long) arg0, local16);
			}
			return local16.method8386() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public void method5669() {
		@Pc(2) Class236 local2 = this.aClass236_67;
		synchronized (this.aClass236_67) {
			this.aClass236_67.method6245();
		}
		local2 = this.aClass236_68;
		synchronized (this.aClass236_68) {
			this.aClass236_68.method6245();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!fba;")
	public Class97 method5670(@OriginalArg(1) int arg0) {
		@Pc(12) Class236 local12 = this.aClass236_67;
		@Pc(22) Class97 local22;
		synchronized (this.aClass236_67) {
			local22 = (Class97) this.aClass236_67.method6242((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class237 local35 = this.aClass237_98;
		@Pc(48) byte[] local48;
		synchronized (this.aClass237_98) {
			local48 = this.aClass237_98.method6314(Static553.method7768(arg0), Static138.method6950(arg0));
		}
		local22 = new Class97();
		local22.anInt3601 = arg0;
		local22.aClass220_2 = this;
		if (local48 != null) {
			local22.method2967(new Class8_Sub8(local48));
		}
		local22.method2970();
		@Pc(79) Class236 local79 = this.aClass236_67;
		synchronized (this.aClass236_67) {
			this.aClass236_67.method6241((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public void method5672() {
		@Pc(2) Class236 local2 = this.aClass236_67;
		synchronized (this.aClass236_67) {
			this.aClass236_67.method6243(5);
		}
		local2 = this.aClass236_68;
		synchronized (this.aClass236_68) {
			this.aClass236_68.method6243(5);
		}
	}
}
