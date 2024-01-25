import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class26 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!jv;")
	private final Class126 aClass126_3 = new Class126(64);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!bu;")
	private final Class32 aClass32_12;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class26(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_12 = arg2;
		if (this.aClass32_12 != null) {
			this.aClass32_12.method790(11);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public void method690() {
		@Pc(2) Class126 local2 = this.aClass126_3;
		synchronized (this.aClass126_3) {
			this.aClass126_3.method3140(5);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Lclient!sd;")
	public Class224 method691(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_3;
		@Pc(16) Class224 local16;
		synchronized (this.aClass126_3) {
			local16 = (Class224) this.aClass126_3.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass32_12.method785(arg0, 11);
		local16 = new Class224();
		if (local33 != null) {
			local16.method4787(new Class3_Sub7(local33));
		}
		@Pc(51) Class126 local51 = this.aClass126_3;
		synchronized (this.aClass126_3) {
			this.aClass126_3.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	public void method692() {
		@Pc(2) Class126 local2 = this.aClass126_3;
		synchronized (this.aClass126_3) {
			this.aClass126_3.method3131();
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public void method694() {
		@Pc(2) Class126 local2 = this.aClass126_3;
		synchronized (this.aClass126_3) {
			this.aClass126_3.method3135();
		}
	}
}
