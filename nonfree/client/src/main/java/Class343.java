import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class343 {

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
	public int anInt9721;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!gg;")
	private final Class112 aClass112_62 = new Class112(64);

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Lclient!gg;")
	public final Class112 aClass112_63 = new Class112(60);

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "Lclient!kha;")
	public final Class181 aClass181_119;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_118;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;)V")
	public Class343(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3) {
		this.aClass181_119 = arg3;
		this.aClass181_118 = arg2;
		@Pc(26) int local26 = this.aClass181_118.method5029() - 1;
		this.aClass181_118.method5025(local26);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public void method8028(@OriginalArg(0) int arg0) {
		this.anInt9721 = arg0;
		@Pc(9) Class112 local9 = this.aClass112_63;
		synchronized (this.aClass112_63) {
			this.aClass112_63.method3638();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public void method8029() {
		@Pc(12) Class112 local12 = this.aClass112_62;
		synchronized (this.aClass112_62) {
			this.aClass112_62.method3637(5);
		}
		local12 = this.aClass112_63;
		synchronized (this.aClass112_63) {
			this.aClass112_63.method3637(5);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public void method8032() {
		@Pc(6) Class112 local6 = this.aClass112_62;
		synchronized (this.aClass112_62) {
			this.aClass112_62.method3638();
		}
		local6 = this.aClass112_63;
		synchronized (this.aClass112_63) {
			this.aClass112_63.method3638();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)Lclient!qa;")
	public Class268 method8033(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_62;
		@Pc(16) Class268 local16;
		synchronized (this.aClass112_62) {
			local16 = (Class268) this.aClass112_62.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_118;
		@Pc(42) byte[] local42;
		synchronized (this.aClass181_118) {
			local42 = this.aClass181_118.method5023(Static201.method3948(arg0), Static86.method2242(arg0));
		}
		local16 = new Class268();
		local16.anInt8065 = arg0;
		local16.aClass343_2 = this;
		if (local42 != null) {
			local16.method6739(new Class3_Sub15(local42));
		}
		@Pc(75) Class112 local75 = this.aClass112_62;
		synchronized (this.aClass112_62) {
			this.aClass112_62.method3636((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public void method8034() {
		@Pc(2) Class112 local2 = this.aClass112_62;
		synchronized (this.aClass112_62) {
			this.aClass112_62.method3643();
		}
		@Pc(29) Class112 local29 = this.aClass112_63;
		synchronized (this.aClass112_63) {
			this.aClass112_63.method3643();
		}
	}
}
