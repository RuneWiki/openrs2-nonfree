import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class365 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!tja;")
	private final Class352 aClass352_69 = new Class352(64);

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_121;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "I")
	public final int anInt9412;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class365(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_121 = arg2;
		if (this.aClass34_121 == null) {
			this.anInt9412 = 0;
		} else {
			this.anInt9412 = this.aClass34_121.method1233(16);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lclient!hq;")
	public Class154 method8030(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_69;
		@Pc(16) Class154 local16;
		synchronized (this.aClass352_69) {
			local16 = (Class154) this.aClass352_69.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class34 local37 = this.aClass34_121;
		@Pc(46) byte[] local46;
		synchronized (this.aClass34_121) {
			local46 = this.aClass34_121.method1239(16, arg0);
		}
		local16 = new Class154();
		if (local46 != null) {
			local16.method3351(new Class4_Sub11(local46));
		}
		@Pc(68) Class352 local68 = this.aClass352_69;
		synchronized (this.aClass352_69) {
			this.aClass352_69.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public void method8033() {
		@Pc(11) Class352 local11 = this.aClass352_69;
		synchronized (this.aClass352_69) {
			this.aClass352_69.method7656();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public void method8034() {
		@Pc(12) Class352 local12 = this.aClass352_69;
		synchronized (this.aClass352_69) {
			this.aClass352_69.method7659();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public void method8036() {
		@Pc(6) Class352 local6 = this.aClass352_69;
		synchronized (this.aClass352_69) {
			this.aClass352_69.method7663(5);
		}
	}
}
