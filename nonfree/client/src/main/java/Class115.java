import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class115 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!gg;")
	private Class112 aClass112_21 = new Class112(128);

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!gg;")
	public Class112 aClass112_22 = new Class112(64);

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!kha;")
	private final Class181 aClass181_40;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!kha;")
	public final Class181 aClass181_39;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class115(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_40 = arg2;
		this.aClass181_39 = arg3;
		this.aClass181_40.method5025(36);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V")
	public void method3751() {
		@Pc(2) Class112 local2 = this.aClass112_21;
		synchronized (this.aClass112_21) {
			this.aClass112_21.method3637(5);
		}
		local2 = this.aClass112_22;
		synchronized (this.aClass112_22) {
			this.aClass112_22.method3637(5);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Lclient!qca;")
	public Class269 method3752(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_21;
		@Pc(16) Class269 local16;
		synchronized (this.aClass112_21) {
			local16 = (Class269) this.aClass112_21.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_40;
		@Pc(38) byte[] local38;
		synchronized (this.aClass181_40) {
			local38 = this.aClass181_40.method5023(36, arg0);
		}
		local16 = new Class269();
		local16.aClass115_4 = this;
		local16.anInt8173 = arg0;
		if (local38 != null) {
			local16.method6793(new Class3_Sub15(local38));
		}
		local16.method6800();
		@Pc(69) Class112 local69 = this.aClass112_21;
		synchronized (this.aClass112_21) {
			this.aClass112_21.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public void method3754() {
		@Pc(6) Class112 local6 = this.aClass112_21;
		synchronized (this.aClass112_21) {
			this.aClass112_21.method3643();
		}
		@Pc(29) Class112 local29 = this.aClass112_22;
		synchronized (this.aClass112_22) {
			this.aClass112_22.method3643();
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(IBI)V")
	public void method3755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass112_21 = new Class112(arg0);
		this.aClass112_22 = new Class112(arg1);
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public void method3757() {
		@Pc(7) Class112 local7 = this.aClass112_21;
		synchronized (this.aClass112_21) {
			this.aClass112_21.method3638();
		}
		local7 = this.aClass112_22;
		synchronized (this.aClass112_22) {
			this.aClass112_22.method3638();
		}
	}
}
