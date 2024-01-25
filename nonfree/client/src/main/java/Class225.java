import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class225 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!dc;")
	private final Class44 aClass44_48 = new Class44(64);

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_74;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class225(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_74 = arg2;
		this.aClass100_74.method2523(5);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!vr;")
	public Class6_Sub2_Sub18 method5495(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_48;
		@Pc(16) Class6_Sub2_Sub18 local16;
		synchronized (this.aClass44_48) {
			local16 = (Class6_Sub2_Sub18) this.aClass44_48.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass100_74.method2520(arg0, 5);
		local16 = new Class6_Sub2_Sub18();
		if (local33 != null) {
			local16.method6280(new Class6_Sub1(local33));
		}
		@Pc(49) Class44 local49 = this.aClass44_48;
		synchronized (this.aClass44_48) {
			this.aClass44_48.method1349(local16, (long) arg0);
			return local16;
		}
	}
}
