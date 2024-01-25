import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class282 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_73 = new Class307(64);

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "Lclient!ik;")
	private final Class182 aClass182_95;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	public final int anInt7535;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class282(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_95 = arg2;
		this.anInt7535 = this.aClass182_95.method3970(19);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)Lclient!tla;")
	public Class360 method6510(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_73;
		@Pc(22) Class360 local22;
		synchronized (this.aClass307_73) {
			local22 = (Class360) this.aClass307_73.method7002((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class182 local36 = this.aClass182_95;
		@Pc(45) byte[] local45;
		synchronized (this.aClass182_95) {
			local45 = this.aClass182_95.method3985(arg0, 19);
		}
		local22 = new Class360();
		if (local45 != null) {
			local22.method8267(new Class3_Sub2(local45));
		}
		@Pc(69) Class307 local69 = this.aClass307_73;
		synchronized (this.aClass307_73) {
			this.aClass307_73.method7000(local22, (long) arg0);
			return local22;
		}
	}
}
