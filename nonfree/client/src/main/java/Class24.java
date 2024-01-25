import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class24 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "Lclient!tb;")
	private final Class313 aClass313_4 = new Class313(256);

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!pl;")
	private final Class259 aClass259_15;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class24(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_15 = arg2;
		this.aClass259_15.method5969(26);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lclient!bh;")
	public Class2_Sub3_Sub2 method428(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_4;
		@Pc(16) Class2_Sub3_Sub2 local16;
		synchronized (this.aClass313_4) {
			local16 = (Class2_Sub3_Sub2) this.aClass313_4.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class259 local35 = this.aClass259_15;
		@Pc(44) byte[] local44;
		synchronized (this.aClass259_15) {
			local44 = this.aClass259_15.method5985(arg0, 26);
		}
		local16 = new Class2_Sub3_Sub2();
		if (local44 != null) {
			local16.method667(new Class2_Sub15(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_4;
		synchronized (this.aClass313_4) {
			this.aClass313_4.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
	public void method429() {
		@Pc(6) Class313 local6 = this.aClass313_4;
		synchronized (this.aClass313_4) {
			this.aClass313_4.method6982(5);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public void method432() {
		@Pc(6) Class313 local6 = this.aClass313_4;
		synchronized (this.aClass313_4) {
			this.aClass313_4.method6983();
		}
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	public void method433() {
		@Pc(6) Class313 local6 = this.aClass313_4;
		synchronized (this.aClass313_4) {
			this.aClass313_4.method6977();
		}
	}
}
