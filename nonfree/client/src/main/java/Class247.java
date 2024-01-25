import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class247 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!wg;")
	private Class313 aClass313_47 = new Class313(64);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!kr;")
	private final Class171 aClass171_119;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class247(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_119 = arg2;
		if (this.aClass171_119 != null) {
			@Pc(20) int local20 = this.aClass171_119.method4331() - 1;
			this.aClass171_119.method4349(local20);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Lclient!ng;")
	public Class203 method5888(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_47;
		@Pc(16) Class203 local16;
		synchronized (this.aClass313_47) {
			local16 = (Class203) this.aClass313_47.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_119;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_119) {
			local42 = this.aClass171_119.method4339(Static300.method4752(arg0), Static124.method2114(arg0));
		}
		local16 = new Class203();
		if (local42 != null) {
			local16.method4984(new Class1_Sub6(local42));
		}
		@Pc(64) Class313 local64 = this.aClass313_47;
		synchronized (this.aClass313_47) {
			this.aClass313_47.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method5889() {
		@Pc(2) Class313 local2 = this.aClass313_47;
		synchronized (this.aClass313_47) {
			this.aClass313_47.method7398();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public void method5890() {
		@Pc(6) Class313 local6 = this.aClass313_47;
		synchronized (this.aClass313_47) {
			this.aClass313_47.method7400();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	public void method5891(@OriginalArg(0) int arg0) {
		@Pc(2) Class313 local2 = this.aClass313_47;
		synchronized (this.aClass313_47) {
			this.aClass313_47.method7398();
			this.aClass313_47 = new Class313(arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(ZI)V")
	public void method5895() {
		@Pc(6) Class313 local6 = this.aClass313_47;
		synchronized (this.aClass313_47) {
			this.aClass313_47.method7403(5);
		}
	}
}
