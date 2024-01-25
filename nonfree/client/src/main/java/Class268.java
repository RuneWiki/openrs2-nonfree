import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class268 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!af;")
	private final Class10 aClass10_44 = new Class10(64);

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!af;")
	private final Class10 aClass10_45 = new Class10(100);

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!ae;")
	private final Class8 aClass8_106;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;Lclient!ae;Lclient!ae;)V")
	public Class268(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) Class8 arg4) {
		this.aClass8_106 = arg2;
		if (this.aClass8_106 != null) {
			@Pc(26) int local26 = this.aClass8_106.method279() - 1;
			this.aClass8_106.method280(local26);
		}
		Static17.method474(arg3, arg4);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public void method6467() {
		@Pc(6) Class10 local6 = this.aClass10_44;
		synchronized (this.aClass10_44) {
			this.aClass10_44.method369(5);
		}
		local6 = this.aClass10_45;
		synchronized (this.aClass10_45) {
			this.aClass10_45.method369(5);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Lclient!g;")
	public Class6_Sub4_Sub4 method6468(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_45;
		synchronized (this.aClass10_45) {
			@Pc(18) Class6_Sub4_Sub4 local18 = (Class6_Sub4_Sub4) this.aClass10_45.method373((long) arg0);
			if (local18 == null) {
				local18 = new Class6_Sub4_Sub4(arg0);
				this.aClass10_45.method366(local18, (long) arg0);
			}
			return local18.method2426() ? local18 : null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lclient!gf;")
	public Class119 method6469(@OriginalArg(0) int arg0) {
		@Pc(11) Class10 local11 = this.aClass10_44;
		@Pc(21) Class119 local21;
		synchronized (this.aClass10_44) {
			local21 = (Class119) this.aClass10_44.method373((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class8 local34 = this.aClass8_106;
		@Pc(47) byte[] local47;
		synchronized (this.aClass8_106) {
			local47 = this.aClass8_106.method262(Static82.method1403(arg0), Static400.method5779(arg0));
		}
		local21 = new Class119();
		local21.anInt3015 = arg0;
		local21.aClass268_1 = this;
		if (local47 != null) {
			local21.method2505(new Class6_Sub23(local47));
		}
		local21.method2506();
		@Pc(78) Class10 local78 = this.aClass10_44;
		synchronized (this.aClass10_44) {
			this.aClass10_44.method366(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public void method6470() {
		@Pc(10) Class10 local10 = this.aClass10_44;
		synchronized (this.aClass10_44) {
			this.aClass10_44.method375();
		}
		local10 = this.aClass10_45;
		synchronized (this.aClass10_45) {
			this.aClass10_45.method375();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method6471() {
		@Pc(2) Class10 local2 = this.aClass10_44;
		synchronized (this.aClass10_44) {
			this.aClass10_44.method380();
		}
		local2 = this.aClass10_45;
		synchronized (this.aClass10_45) {
			this.aClass10_45.method380();
		}
	}
}
