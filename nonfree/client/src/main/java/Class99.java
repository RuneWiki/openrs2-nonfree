import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class99 {

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!wg;")
	private final Class313 aClass313_20 = new Class313(64);

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!kr;")
	private final Class171 aClass171_56;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public final int anInt2744;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class99(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_56 = arg2;
		this.anInt2744 = this.aClass171_56.method4349(19);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Lclient!bca;")
	public Class20 method2335(@OriginalArg(0) int arg0) {
		@Pc(12) Class313 local12 = this.aClass313_20;
		@Pc(22) Class20 local22;
		synchronized (this.aClass313_20) {
			local22 = (Class20) this.aClass313_20.method7406((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class171 local35 = this.aClass171_56;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_56) {
			local44 = this.aClass171_56.method4339(19, arg0);
		}
		local22 = new Class20();
		if (local44 != null) {
			local22.method783(new Class1_Sub6(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_20;
		synchronized (this.aClass313_20) {
			this.aClass313_20.method7399((long) arg0, local22);
			return local22;
		}
	}
}
