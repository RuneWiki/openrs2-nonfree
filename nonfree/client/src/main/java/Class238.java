import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class238 {

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!eda;")
	private final Class87 aClass87_144 = new Class87(64);

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!la;")
	private final Class207 aClass207_70;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class238(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_70 = arg2;
		this.aClass207_70.method4672(32);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public void method5278() {
		@Pc(14) Class87 local14 = this.aClass87_144;
		synchronized (this.aClass87_144) {
			this.aClass87_144.method1796();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Lclient!pfa;")
	public Class269 method5279(@OriginalArg(1) int arg0) {
		@Pc(11) Class87 local11 = this.aClass87_144;
		@Pc(21) Class269 local21;
		synchronized (this.aClass87_144) {
			local21 = (Class269) this.aClass87_144.method1805((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class207 local34 = this.aClass207_70;
		@Pc(43) byte[] local43;
		synchronized (this.aClass207_70) {
			local43 = this.aClass207_70.method4681(32, arg0);
		}
		local21 = new Class269();
		if (local43 != null) {
			local21.method6401(new Class5_Sub22(local43));
		}
		@Pc(65) Class87 local65 = this.aClass87_144;
		synchronized (this.aClass87_144) {
			this.aClass87_144.method1792((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	public void method5280() {
		@Pc(2) Class87 local2 = this.aClass87_144;
		synchronized (this.aClass87_144) {
			this.aClass87_144.method1801();
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
	public void method5283() {
		@Pc(11) Class87 local11 = this.aClass87_144;
		synchronized (this.aClass87_144) {
			this.aClass87_144.method1793(5);
		}
	}
}
