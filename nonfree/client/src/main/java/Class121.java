import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class121 {

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!tja;")
	private final Class352 aClass352_25 = new Class352(64);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_43;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class121(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_43 = arg2;
		this.aClass34_43.method1233(5);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lclient!wr;")
	public Class4_Sub5_Sub21 method2808(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_25;
		@Pc(16) Class4_Sub5_Sub21 local16;
		synchronized (this.aClass352_25) {
			local16 = (Class4_Sub5_Sub21) this.aClass352_25.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_43;
		@Pc(47) byte[] local47;
		synchronized (this.aClass34_43) {
			local47 = this.aClass34_43.method1239(5, arg0);
		}
		local16 = new Class4_Sub5_Sub21();
		if (local47 != null) {
			local16.method8948(new Class4_Sub11(local47));
		}
		@Pc(69) Class352 local69 = this.aClass352_25;
		synchronized (this.aClass352_25) {
			this.aClass352_25.method7655((long) arg0, local16);
			return local16;
		}
	}
}
