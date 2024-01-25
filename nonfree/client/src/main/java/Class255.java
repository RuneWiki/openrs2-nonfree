import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class255 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!jo;")
	private final Class126 aClass126_59 = new Class126(16);

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!ok;")
	private final Class178 aClass178_131;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class255(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_131 = arg2;
		this.aClass178_131.method3833(29);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method5271() {
		@Pc(6) Class126 local6 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method2821();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public void method5272() {
		@Pc(6) Class126 local6 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method2827();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIILclient!ri;)Lclient!po;")
	public Class196 method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class217 arg4) {
		@Pc(7) Class115[] local7 = null;
		@Pc(17) Class140 local17 = this.method5275(arg2);
		if (local17.anIntArray346 != null) {
			local7 = new Class115[local17.anIntArray346.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(39) Class259 local39 = arg4.method4452(local17.anIntArray346[local27]);
				local7[local27] = new Class115(local39.anInt7211, local39.anInt7205, local39.anInt7210, local39.anInt7209, local39.anInt7207, local39.anInt7202, local39.anInt7204, local39.aBoolean484);
			}
		}
		return new Class196(local17.anInt3954, local7, local17.anInt3956, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Lclient!ld;")
	private Class140 method5275(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_59;
		@Pc(16) Class140 local16;
		synchronized (this.aClass126_59) {
			local16 = (Class140) this.aClass126_59.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_131;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_131) {
			local38 = this.aClass178_131.method3838(arg0, 29);
		}
		local16 = new Class140();
		if (local38 != null) {
			local16.method3136(new Class7_Sub14(local38));
		}
		@Pc(67) Class126 local67 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public void method5276() {
		@Pc(2) Class126 local2 = this.aClass126_59;
		synchronized (this.aClass126_59) {
			this.aClass126_59.method2828(5);
		}
	}
}
