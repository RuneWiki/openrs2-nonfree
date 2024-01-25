import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class69 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Lclient!dc;")
	private final Class44 aClass44_8 = new Class44(256);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "Lclient!ps;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_7;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!rl;Lclient!ps;)V")
	public Class69(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_2 = arg1;
		this.aClass66_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lclient!ud;")
	public Class19_Sub4 method1819(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass44_8.method1353((long) arg0);
		if (local12 != null) {
			return (Class19_Sub4) local12;
		} else if (this.anInterface8_2.method5562(arg0)) {
			@Pc(31) Class184 local31 = this.anInterface8_2.method5566(arg0);
			@Pc(40) int local40 = local31.aBoolean325 ? 64 : this.aClass66_Sub2_7.anInt6139;
			@Pc(78) Class19_Sub4 local78;
			if (local31.aBoolean328 && this.aClass66_Sub2_7.method5056()) {
				@Pc(57) float[] local57 = this.anInterface8_2.method5565(arg0, local40, 0.7F, local40);
				local78 = new Class19_Sub4(this.aClass66_Sub2_7, 3553, 34842, local40, local40, local31.aByte71 != 0, local57, 6408);
			} else {
				@Pc(100) short local100;
				@Pc(98) int[] local98;
				if (local31.aBoolean324 && Static288.method4321(local31.aByte72)) {
					local98 = this.anInterface8_2.method5563(arg0, local40, false, 0.7F, local40);
					local100 = 6407;
				} else {
					local100 = 6408;
					local98 = this.anInterface8_2.method5564(0.7F, local40, local40, arg0);
				}
				local78 = new Class19_Sub4(this.aClass66_Sub2_7, 3553, local100, local40, local40, local31.aByte71 != 0, local98, false);
			}
			local78.method4257(local31.aBoolean329, local31.aBoolean326);
			this.aClass44_8.method1349(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	public void method1820() {
		this.aClass44_8.method1351();
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
	public void method1822() {
		this.aClass44_8.method1352(5);
	}
}
