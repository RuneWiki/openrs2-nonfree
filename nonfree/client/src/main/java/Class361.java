import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class361 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!tja;")
	public final Class352 aClass352_66 = new Class352(20);

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "Lclient!tja;")
	private final Class352 aClass352_67 = new Class352(64);

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_118;

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "Lclient!bt;")
	public final Class34 aClass34_119;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class361(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_118 = arg2;
		this.aClass34_119 = arg3;
		this.aClass34_118.method1233(46);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public void method7870() {
		@Pc(11) Class352 local11 = this.aClass352_67;
		synchronized (this.aClass352_67) {
			this.aClass352_67.method7656();
		}
		local11 = this.aClass352_66;
		synchronized (this.aClass352_66) {
			this.aClass352_66.method7656();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lclient!hr;")
	public Class155 method7871(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_67;
		@Pc(16) Class155 local16;
		synchronized (this.aClass352_67) {
			local16 = (Class155) this.aClass352_67.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class34 local35 = this.aClass34_118;
		@Pc(44) byte[] local44;
		synchronized (this.aClass34_118) {
			local44 = this.aClass34_118.method1239(46, arg0);
		}
		local16 = new Class155();
		local16.aClass361_2 = this;
		if (local44 != null) {
			local16.method3352(new Class4_Sub11(local44));
		}
		@Pc(69) Class352 local69 = this.aClass352_67;
		synchronized (this.aClass352_67) {
			this.aClass352_67.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
	public void method7872() {
		@Pc(11) Class352 local11 = this.aClass352_67;
		synchronized (this.aClass352_67) {
			this.aClass352_67.method7663(5);
		}
		local11 = this.aClass352_66;
		synchronized (this.aClass352_66) {
			this.aClass352_66.method7663(5);
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public void method7873() {
		@Pc(8) Class352 local8 = this.aClass352_67;
		synchronized (this.aClass352_67) {
			this.aClass352_67.method7659();
		}
		local8 = this.aClass352_66;
		synchronized (this.aClass352_66) {
			this.aClass352_66.method7659();
		}
	}
}
