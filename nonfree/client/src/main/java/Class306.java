import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class306 {

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Lclient!gg;")
	public final Class112 aClass112_55 = new Class112(20);

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!gg;")
	private final Class112 aClass112_56 = new Class112(64);

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!kha;")
	public final Class181 aClass181_106;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_105;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class306(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_106 = arg3;
		this.aClass181_105 = arg2;
		this.aClass181_105.method5025(46);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public void method7415() {
		@Pc(6) Class112 local6 = this.aClass112_56;
		synchronized (this.aClass112_56) {
			this.aClass112_56.method3638();
		}
		local6 = this.aClass112_55;
		synchronized (this.aClass112_55) {
			this.aClass112_55.method3638();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public void method7416() {
		@Pc(6) Class112 local6 = this.aClass112_56;
		synchronized (this.aClass112_56) {
			this.aClass112_56.method3637(5);
		}
		local6 = this.aClass112_55;
		synchronized (this.aClass112_55) {
			this.aClass112_55.method3637(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Lclient!sd;")
	public Class301 method7417(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_56;
		@Pc(16) Class301 local16;
		synchronized (this.aClass112_56) {
			local16 = (Class301) this.aClass112_56.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_105;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_105) {
			local38 = this.aClass181_105.method5023(46, arg0);
		}
		local16 = new Class301();
		local16.aClass306_2 = this;
		if (local38 != null) {
			local16.method7382(new Class3_Sub15(local38));
		}
		@Pc(63) Class112 local63 = this.aClass112_56;
		synchronized (this.aClass112_56) {
			this.aClass112_56.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public void method7419() {
		@Pc(6) Class112 local6 = this.aClass112_56;
		synchronized (this.aClass112_56) {
			this.aClass112_56.method3643();
		}
		local6 = this.aClass112_55;
		synchronized (this.aClass112_55) {
			this.aClass112_55.method3643();
		}
	}
}
