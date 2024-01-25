import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class195 {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Lclient!wg;")
	private final Class313 aClass313_37 = new Class313(64);

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!kr;")
	private final Class171 aClass171_87;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class195(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_87 = arg2;
		this.aClass171_87.method4349(31);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V")
	public void method4836() {
		@Pc(10) Class313 local10 = this.aClass313_37;
		synchronized (this.aClass313_37) {
			this.aClass313_37.method7403(5);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lclient!pda;")
	public Class231 method4840(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_37;
		@Pc(16) Class231 local16;
		synchronized (this.aClass313_37) {
			local16 = (Class231) this.aClass313_37.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class171 local35 = this.aClass171_87;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_87) {
			local44 = this.aClass171_87.method4339(31, arg0);
		}
		local16 = new Class231();
		if (local44 != null) {
			local16.method5425(new Class1_Sub6(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_37;
		synchronized (this.aClass313_37) {
			this.aClass313_37.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method4841() {
		@Pc(2) Class313 local2 = this.aClass313_37;
		synchronized (this.aClass313_37) {
			this.aClass313_37.method7398();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	public void method4843() {
		@Pc(2) Class313 local2 = this.aClass313_37;
		synchronized (this.aClass313_37) {
			this.aClass313_37.method7400();
		}
	}
}
