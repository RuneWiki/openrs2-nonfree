import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class222 {

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Lclient!gg;")
	private final Class112 aClass112_39 = new Class112(64);

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "Lclient!gg;")
	private final Class112 aClass112_40 = new Class112(100);

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "Lclient!kha;")
	private final Class181 aClass181_67;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!dh;ILclient!kha;Lclient!kha;Lclient!kha;)V")
	public Class222(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) Class181 arg4) {
		this.aClass181_67 = arg2;
		if (this.aClass181_67 != null) {
			@Pc(26) int local26 = this.aClass181_67.method5029() - 1;
			this.aClass181_67.method5025(local26);
		}
		Static9.method111(arg4, arg3);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)Lclient!kga;")
	public Class3_Sub1_Sub12 method5861(@OriginalArg(1) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_40;
		synchronized (this.aClass112_40) {
			@Pc(16) Class3_Sub1_Sub12 local16 = (Class3_Sub1_Sub12) this.aClass112_40.method3640((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub1_Sub12(arg0);
				this.aClass112_40.method3636((long) arg0, local16);
			}
			return local16.method5014() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
	public void method5863() {
		@Pc(2) Class112 local2 = this.aClass112_39;
		synchronized (this.aClass112_39) {
			this.aClass112_39.method3637(5);
		}
		local2 = this.aClass112_40;
		synchronized (this.aClass112_40) {
			this.aClass112_40.method3637(5);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	public void method5864() {
		@Pc(11) Class112 local11 = this.aClass112_39;
		synchronized (this.aClass112_39) {
			this.aClass112_39.method3638();
		}
		local11 = this.aClass112_40;
		synchronized (this.aClass112_40) {
			this.aClass112_40.method3638();
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
	public void method5866() {
		@Pc(11) Class112 local11 = this.aClass112_39;
		synchronized (this.aClass112_39) {
			this.aClass112_39.method3643();
		}
		local11 = this.aClass112_40;
		synchronized (this.aClass112_40) {
			this.aClass112_40.method3643();
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Lclient!rj;")
	public Class290 method5867(@OriginalArg(0) int arg0) {
		@Pc(6) Class112 local6 = this.aClass112_39;
		@Pc(16) Class290 local16;
		synchronized (this.aClass112_39) {
			local16 = (Class290) this.aClass112_39.method3640((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class181 local29 = this.aClass181_67;
		@Pc(42) byte[] local42;
		synchronized (this.aClass181_67) {
			local42 = this.aClass181_67.method5023(Static238.method4607(arg0), Static388.method6126(arg0));
		}
		local16 = new Class290();
		local16.aClass222_1 = this;
		local16.anInt8686 = arg0;
		if (local42 != null) {
			local16.method7173(new Class3_Sub15(local42));
		}
		local16.method7175();
		@Pc(78) Class112 local78 = this.aClass112_39;
		synchronized (this.aClass112_39) {
			this.aClass112_39.method3636((long) arg0, local16);
			return local16;
		}
	}
}
