import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class191 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!wg;")
	private final Class313 aClass313_32 = new Class313(128);

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!kr;")
	private final Class171 aClass171_84;

	static {
		new Class306("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class306("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class191(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_84 = arg2;
		if (this.aClass171_84 != null) {
			@Pc(20) int local20 = this.aClass171_84.method4331() - 1;
			this.aClass171_84.method4349(local20);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Lclient!oc;")
	public Class214 method4745(@OriginalArg(0) int arg0) {
		@Pc(14) Class313 local14 = this.aClass313_32;
		@Pc(24) Class214 local24;
		synchronized (this.aClass313_32) {
			local24 = (Class214) this.aClass313_32.method7406((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass171_84.method4339(Static366.method5468(arg0), Static334.method5101(arg0));
		local24 = new Class214();
		if (local45 != null) {
			local24.method5118(new Class1_Sub6(local45));
		}
		@Pc(61) Class313 local61 = this.aClass313_32;
		synchronized (this.aClass313_32) {
			this.aClass313_32.method7399((long) arg0, local24);
			return local24;
		}
	}
}
