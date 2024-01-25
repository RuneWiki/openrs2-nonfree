import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class14 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "Lclient!iha;")
	private final Class168 aClass168_3 = new Class168(64);

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "Lclient!iha;")
	private final Class168 aClass168_4 = new Class168(100);

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "Lclient!gda;")
	private final Class126 aClass126_8;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;Lclient!gda;)V")
	public Class14(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) Class126 arg4) {
		this.aClass126_8 = arg2;
		if (this.aClass126_8 != null) {
			@Pc(26) int local26 = this.aClass126_8.method3082() - 1;
			this.aClass126_8.method3062(local26);
		}
		Static374.method5571(arg3, arg4);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lclient!vu;")
	public Class5_Sub1_Sub21 method221(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_4;
		synchronized (this.aClass168_4) {
			@Pc(22) Class5_Sub1_Sub21 local22 = (Class5_Sub1_Sub21) this.aClass168_4.method3860((long) arg0);
			if (local22 == null) {
				local22 = new Class5_Sub1_Sub21(arg0);
				this.aClass168_4.method3853((long) arg0, local22);
			}
			return local22.method8961() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
	public void method223() {
		@Pc(15) Class168 local15 = this.aClass168_3;
		synchronized (this.aClass168_3) {
			this.aClass168_3.method3862();
		}
		local15 = this.aClass168_4;
		synchronized (this.aClass168_4) {
			this.aClass168_4.method3862();
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
	public void method224() {
		@Pc(2) Class168 local2 = this.aClass168_3;
		synchronized (this.aClass168_3) {
			this.aClass168_3.method3856();
		}
		local2 = this.aClass168_4;
		synchronized (this.aClass168_4) {
			this.aClass168_4.method3856();
		}
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)V")
	public void method225() {
		@Pc(2) Class168 local2 = this.aClass168_3;
		synchronized (this.aClass168_3) {
			this.aClass168_3.method3852(5);
		}
		local2 = this.aClass168_4;
		synchronized (this.aClass168_4) {
			this.aClass168_4.method3852(5);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)Lclient!oe;")
	public Class264 method227(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_3;
		@Pc(16) Class264 local16;
		synchronized (this.aClass168_3) {
			local16 = (Class264) this.aClass168_3.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_8;
		@Pc(43) byte[] local43;
		synchronized (this.aClass126_8) {
			local43 = this.aClass126_8.method3086(Static213.method3421(arg0), Static621.method3256(arg0));
		}
		local16 = new Class264();
		local16.aClass14_2 = this;
		local16.anInt7034 = arg0;
		if (local43 != null) {
			local16.method6128(new Class5_Sub36(local43));
		}
		local16.method6125();
		@Pc(84) Class168 local84 = this.aClass168_3;
		synchronized (this.aClass168_3) {
			this.aClass168_3.method3853((long) arg0, local16);
			return local16;
		}
	}
}
