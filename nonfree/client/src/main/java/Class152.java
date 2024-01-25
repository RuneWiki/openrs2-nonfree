import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class152 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!mq;")
	private final Class223 aClass223_28 = new Class223(256);

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!fa;")
	private final Interface11 anInterface11_7;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_17;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!kga;Lclient!fa;)V")
	public Class152(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Interface11 arg1) {
		this.anInterface11_7 = arg1;
		this.aClass44_Sub3_17 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public void method3505() {
		this.aClass223_28.method5399(5);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!saa;")
	public Class77_Sub1 method3507(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass223_28.method5388((long) arg0);
		if (local12 != null) {
			return (Class77_Sub1) local12;
		} else if (this.anInterface11_7.method7407(arg0)) {
			@Pc(31) Class14 local31 = this.anInterface11_7.method7405(arg0);
			@Pc(40) int local40 = local31.aBoolean12 ? 64 : this.aClass44_Sub3_17.anInt5467;
			@Pc(83) Class77_Sub1 local83;
			if (local31.aBoolean9 && this.aClass44_Sub3_17.method5019()) {
				@Pc(65) float[] local65 = this.anInterface11_7.method7409(arg0, local40, 0.7F, local40);
				local83 = new Class77_Sub1(this.aClass44_Sub3_17, 3553, 34842, local40, local40, local31.aByte10 != 0, local65, 6408);
			} else {
				@Pc(105) int[] local105;
				if (!local31.aBoolean15 && Static126.method2599(local31.aByte9)) {
					local105 = this.anInterface11_7.method7408(local40, true, local40, arg0, 0.7F);
				} else {
					local105 = this.anInterface11_7.method7406(local40, arg0, local40, 0.7F);
				}
				local83 = new Class77_Sub1(this.aClass44_Sub3_17, 3553, 6408, local40, local40, local31.aByte10 != 0, local105, false);
			}
			local83.method2266(local31.aBoolean8, local31.aBoolean7);
			this.aClass223_28.method5394(local83, (long) arg0);
			return local83;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method3508() {
		this.aClass223_28.method5398();
	}
}
