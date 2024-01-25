import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class124 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!jv;")
	private final Class126 aClass126_23 = new Class126(256);

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Lclient!bu;")
	private final Class32 aClass32_48;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class124(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_48 = arg2;
		this.aClass32_48.method790(26);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Lclient!tg;")
	public Class3_Sub4_Sub14 method3116(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_23;
		@Pc(18) Class3_Sub4_Sub14 local18;
		synchronized (this.aClass126_23) {
			local18 = (Class3_Sub4_Sub14) this.aClass126_23.method3141((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(44) byte[] local44 = this.aClass32_48.method785(arg0, 26);
		local18 = new Class3_Sub4_Sub14();
		if (local44 != null) {
			local18.method4994(new Class3_Sub7(local44));
		}
		@Pc(60) Class126 local60 = this.aClass126_23;
		synchronized (this.aClass126_23) {
			this.aClass126_23.method3132((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method3117() {
		@Pc(6) Class126 local6 = this.aClass126_23;
		synchronized (this.aClass126_23) {
			this.aClass126_23.method3131();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method3118() {
		@Pc(8) Class126 local8 = this.aClass126_23;
		synchronized (this.aClass126_23) {
			this.aClass126_23.method3135();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
	public void method3119() {
		@Pc(12) Class126 local12 = this.aClass126_23;
		synchronized (this.aClass126_23) {
			this.aClass126_23.method3140(5);
		}
	}
}
