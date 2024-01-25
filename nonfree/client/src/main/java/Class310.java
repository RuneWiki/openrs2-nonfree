import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class310 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!qr;")
	private final Class293 aClass293_57 = new Class293(256);

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_19;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!d;")
	private final Interface8 anInterface8_11;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!rv;Lclient!d;)V")
	public Class310(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass126_Sub2_19 = arg0;
		this.anInterface8_11 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)Lclient!tr;")
	public Interface25 method7370(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass293_57.method6921((long) arg0);
		if (local12 != null) {
			return (Interface25) local12;
		} else if (this.anInterface8_11.method7811(arg0)) {
			@Pc(31) Class321 local31 = this.anInterface8_11.method7813(arg0);
			@Pc(40) int local40 = local31.aBoolean729 ? 64 : this.aClass126_Sub2_19.anInt6252;
			@Pc(97) Interface25 local97;
			if (local31.aBoolean725 && this.aClass126_Sub2_19.method7025()) {
				@Pc(109) float[] local109 = this.anInterface8_11.method7816(local40, local40, arg0, 0.7F);
				local97 = this.aClass126_Sub2_19.method5452(local109, local40, local31.aByte114 != 0, Static208.aClass281_10, local40);
			} else {
				@Pc(68) int[] local68;
				if (local31.anInt8901 != 2 && Static553.method7807(local31.aByte115)) {
					local68 = this.anInterface8_11.method7812(local40, 0.7F, true, arg0, local40);
				} else {
					local68 = this.anInterface8_11.method7815(local40, local40, 0.7F, arg0);
				}
				local97 = this.aClass126_Sub2_19.method5553(local40, local68, local31.aByte114 != 0, local40);
			}
			local97.method7630(local31.aBoolean731, local31.aBoolean727);
			this.aClass293_57.method6925((long) arg0, local97);
			return local97;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method7371() {
		this.aClass293_57.method6922(5);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public void method7372() {
		this.aClass293_57.method6930();
	}
}
