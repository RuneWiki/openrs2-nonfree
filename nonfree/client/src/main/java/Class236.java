import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class236 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!gg;")
	private final Class112 aClass112_44 = new Class112(256);

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_72;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;)V")
	public Class236(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_72 = arg2;
		this.aClass181_72.method5025(26);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public void method6055() {
		@Pc(2) Class112 local2 = this.aClass112_44;
		synchronized (this.aClass112_44) {
			this.aClass112_44.method3638();
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public void method6057() {
		@Pc(6) Class112 local6 = this.aClass112_44;
		synchronized (this.aClass112_44) {
			this.aClass112_44.method3643();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public void method6058() {
		@Pc(2) Class112 local2 = this.aClass112_44;
		synchronized (this.aClass112_44) {
			this.aClass112_44.method3637(5);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Lclient!rga;")
	public Class3_Sub1_Sub18 method6059(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_44;
		@Pc(16) Class3_Sub1_Sub18 local16;
		synchronized (this.aClass112_44) {
			local16 = (Class3_Sub1_Sub18) this.aClass112_44.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_72) {
			local38 = this.aClass181_72.method5023(26, arg0);
		}
		local16 = new Class3_Sub1_Sub18();
		if (local38 != null) {
			local16.method7124(new Class3_Sub15(local38));
		}
		@Pc(60) Class112 local60 = this.aClass112_44;
		synchronized (this.aClass112_44) {
			this.aClass112_44.method3636((long) arg0, local16);
			return local16;
		}
	}
}
