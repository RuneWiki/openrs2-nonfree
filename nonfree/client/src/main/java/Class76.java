import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class76 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_12 = new Class288(64);

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_13 = new Class288(100);

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Lclient!gp;")
	private final Class117 aClass117_60;

	static {
		new Class40("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;Lclient!gp;)V")
	public Class76(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class117 arg4) {
		this.aClass117_60 = arg2;
		if (this.aClass117_60 != null) {
			@Pc(26) int local26 = this.aClass117_60.method2972() - 1;
			this.aClass117_60.method2951(local26);
		}
		Static513.method7094(arg3, arg4);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
	public void method2149() {
		@Pc(6) Class288 local6 = this.aClass288_12;
		synchronized (this.aClass288_12) {
			this.aClass288_12.method6735(5);
		}
		local6 = this.aClass288_13;
		synchronized (this.aClass288_13) {
			this.aClass288_13.method6735(5);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
	public void method2151() {
		@Pc(2) Class288 local2 = this.aClass288_12;
		synchronized (this.aClass288_12) {
			this.aClass288_12.method6742();
		}
		local2 = this.aClass288_13;
		synchronized (this.aClass288_13) {
			this.aClass288_13.method6742();
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(BI)Lclient!bj;")
	public Class31 method2152(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_12;
		@Pc(16) Class31 local16;
		synchronized (this.aClass288_12) {
			local16 = (Class31) this.aClass288_12.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_60;
		@Pc(42) byte[] local42;
		synchronized (this.aClass117_60) {
			local42 = this.aClass117_60.method2962(Static433.method6183(arg0), Static77.method4919(arg0));
		}
		local16 = new Class31();
		local16.anInt918 = arg0;
		local16.aClass76_1 = this;
		if (local42 != null) {
			local16.method854(new Class5_Sub3(local42));
		}
		local16.method858();
		@Pc(78) Class288 local78 = this.aClass288_12;
		synchronized (this.aClass288_12) {
			this.aClass288_12.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)Lclient!mb;")
	public Class5_Sub2_Sub16 method2153(@OriginalArg(1) int arg0) {
		@Pc(14) Class288 local14 = this.aClass288_13;
		@Pc(24) Class5_Sub2_Sub16 local24;
		synchronized (this.aClass288_13) {
			local24 = (Class5_Sub2_Sub16) this.aClass288_13.method6745((long) arg0);
			if (local24 == null) {
				local24 = new Class5_Sub2_Sub16(arg0);
				this.aClass288_13.method6746(local24, (long) arg0);
			}
		}
		synchronized (local24) {
			return local24.method4956() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	public void method2154() {
		@Pc(2) Class288 local2 = this.aClass288_12;
		synchronized (this.aClass288_12) {
			this.aClass288_12.method6744();
		}
		local2 = this.aClass288_13;
		synchronized (this.aClass288_13) {
			this.aClass288_13.method6744();
		}
	}
}
