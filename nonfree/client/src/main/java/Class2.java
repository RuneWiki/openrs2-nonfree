import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_1 = new Class352(64);

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!tja;")
	private final Class352 aClass352_2 = new Class352(100);

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "Lclient!bt;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;Lclient!bt;)V")
	public Class2(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) Class34 arg4) {
		this.aClass34_1 = arg2;
		if (this.aClass34_1 != null) {
			@Pc(26) int local26 = this.aClass34_1.method1247() - 1;
			this.aClass34_1.method1233(local26);
		}
		Static198.method3050(arg4, arg3);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
	public void method20() {
		@Pc(6) Class352 local6 = this.aClass352_1;
		synchronized (this.aClass352_1) {
			this.aClass352_1.method7663(5);
		}
		local6 = this.aClass352_2;
		synchronized (this.aClass352_2) {
			this.aClass352_2.method7663(5);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lclient!fs;")
	public Class124 method22(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_1;
		@Pc(16) Class124 local16;
		synchronized (this.aClass352_1) {
			local16 = (Class124) this.aClass352_1.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_1;
		@Pc(42) byte[] local42;
		synchronized (this.aClass34_1) {
			local42 = this.aClass34_1.method1239(Static148.method2573(arg0), Static406.method5152(arg0));
		}
		local16 = new Class124();
		local16.anInt3031 = arg0;
		local16.aClass2_2 = this;
		if (local42 != null) {
			local16.method2832(new Class4_Sub11(local42));
		}
		local16.method2838();
		@Pc(79) Class352 local79 = this.aClass352_1;
		synchronized (this.aClass352_1) {
			this.aClass352_1.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public void method23() {
		@Pc(2) Class352 local2 = this.aClass352_1;
		synchronized (this.aClass352_1) {
			this.aClass352_1.method7659();
		}
		local2 = this.aClass352_2;
		synchronized (this.aClass352_2) {
			this.aClass352_2.method7659();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)Lclient!ne;")
	public Class4_Sub5_Sub15 method24(@OriginalArg(0) int arg0) {
		@Pc(11) Class352 local11 = this.aClass352_2;
		synchronized (this.aClass352_2) {
			@Pc(21) Class4_Sub5_Sub15 local21 = (Class4_Sub5_Sub15) this.aClass352_2.method7653((long) arg0);
			if (local21 == null) {
				local21 = new Class4_Sub5_Sub15(arg0);
				this.aClass352_2.method7655((long) arg0, local21);
			}
			return local21.method5087() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
	public void method25() {
		@Pc(2) Class352 local2 = this.aClass352_1;
		synchronized (this.aClass352_1) {
			this.aClass352_1.method7656();
		}
		local2 = this.aClass352_2;
		synchronized (this.aClass352_2) {
			this.aClass352_2.method7656();
		}
	}
}
