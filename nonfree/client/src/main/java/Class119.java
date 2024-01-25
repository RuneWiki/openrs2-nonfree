import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class119 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!kh;")
	private final Class134 aClass134_28 = new Class134(64);

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!ul;")
	private final Class246 aClass246_108;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public final int anInt3273;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class119(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_108 = arg2;
		this.anInt3273 = this.aClass246_108.method5492(19);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!oq;")
	public Class185 method2843(@OriginalArg(1) int arg0) {
		@Pc(11) Class134 local11 = this.aClass134_28;
		@Pc(21) Class185 local21;
		synchronized (this.aClass134_28) {
			local21 = (Class185) this.aClass134_28.method3266((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_108;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_108) {
			local43 = this.aClass246_108.method5477(19, arg0);
		}
		local21 = new Class185();
		if (local43 != null) {
			local21.method4252(new Class1_Sub5(local43));
		}
		@Pc(65) Class134 local65 = this.aClass134_28;
		synchronized (this.aClass134_28) {
			this.aClass134_28.method3263((long) arg0, local21);
			return local21;
		}
	}
}
