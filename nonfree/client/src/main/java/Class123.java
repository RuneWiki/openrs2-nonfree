import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class123 {

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!jo;")
	private final Class126 aClass126_25 = new Class126(64);

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_51;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public final int anInt3366;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class123(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_51 = arg2;
		if (this.aClass178_51 == null) {
			this.anInt3366 = 0;
		} else {
			this.anInt3366 = this.aClass178_51.method3833(16);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!nq;")
	public Class174 method2740(@OriginalArg(1) int arg0) {
		@Pc(11) Class126 local11 = this.aClass126_25;
		@Pc(21) Class174 local21;
		synchronized (this.aClass126_25) {
			local21 = (Class174) this.aClass126_25.method2822((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class178 local34 = this.aClass178_51;
		@Pc(43) byte[] local43;
		synchronized (this.aClass178_51) {
			local43 = this.aClass178_51.method3838(arg0, 16);
		}
		local21 = new Class174();
		if (local43 != null) {
			local21.method3671(new Class7_Sub14(local43));
		}
		@Pc(65) Class126 local65 = this.aClass126_25;
		synchronized (this.aClass126_25) {
			this.aClass126_25.method2824((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	public void method2741() {
		@Pc(8) Class126 local8 = this.aClass126_25;
		synchronized (this.aClass126_25) {
			this.aClass126_25.method2828(5);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method2742() {
		@Pc(6) Class126 local6 = this.aClass126_25;
		synchronized (this.aClass126_25) {
			this.aClass126_25.method2827();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public void method2744() {
		@Pc(6) Class126 local6 = this.aClass126_25;
		synchronized (this.aClass126_25) {
			this.aClass126_25.method2821();
		}
	}
}
