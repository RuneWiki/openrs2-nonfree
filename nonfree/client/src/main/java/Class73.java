import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class73 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!jv;")
	private final Class126 aClass126_15 = new Class126(64);

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!bu;")
	private final Class32 aClass32_36;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class73(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_36 = arg2;
		this.aClass32_36.method790(32);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method1822() {
		@Pc(2) Class126 local2 = this.aClass126_15;
		synchronized (this.aClass126_15) {
			this.aClass126_15.method3140(5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!a;")
	public Class1 method1823(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_15;
		@Pc(16) Class1 local16;
		synchronized (this.aClass126_15) {
			local16 = (Class1) this.aClass126_15.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass32_36.method785(arg0, 32);
		local16 = new Class1();
		if (local33 != null) {
			local16.method4(new Class3_Sub7(local33));
		}
		@Pc(49) Class126 local49 = this.aClass126_15;
		synchronized (this.aClass126_15) {
			this.aClass126_15.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public void method1825() {
		@Pc(6) Class126 local6 = this.aClass126_15;
		synchronized (this.aClass126_15) {
			this.aClass126_15.method3131();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1826() {
		@Pc(10) Class126 local10 = this.aClass126_15;
		synchronized (this.aClass126_15) {
			this.aClass126_15.method3135();
		}
	}
}
