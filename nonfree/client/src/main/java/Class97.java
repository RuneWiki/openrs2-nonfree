import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class97 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Lclient!gg;")
	private final Class112 aClass112_15 = new Class112(64);

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!kha;")
	public final Class181 aClass181_33;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_32;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class97(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_33 = arg3;
		this.aClass181_32 = arg2;
		this.aClass181_32.method5025(3);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public void method3257() {
		@Pc(12) Class112 local12 = this.aClass112_15;
		synchronized (this.aClass112_15) {
			this.aClass112_15.method3638();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!nu;")
	public Class239 method3258(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_15;
		@Pc(18) Class239 local18;
		synchronized (this.aClass112_15) {
			local18 = (Class239) this.aClass112_15.method3640((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) Class181 local38 = this.aClass181_32;
		@Pc(49) byte[] local49;
		synchronized (this.aClass181_32) {
			local49 = this.aClass181_32.method5023(3, arg0);
		}
		local18 = new Class239();
		local18.aClass97_1 = this;
		if (local49 != null) {
			local18.method6104(new Class3_Sub15(local49));
		}
		@Pc(74) Class112 local74 = this.aClass112_15;
		synchronized (this.aClass112_15) {
			this.aClass112_15.method3636((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public void method3261() {
		@Pc(14) Class112 local14 = this.aClass112_15;
		synchronized (this.aClass112_15) {
			this.aClass112_15.method3643();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
	public void method3263() {
		@Pc(2) Class112 local2 = this.aClass112_15;
		synchronized (this.aClass112_15) {
			this.aClass112_15.method3637(5);
		}
	}
}
