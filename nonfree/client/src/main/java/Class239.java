import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class239 {

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "Lclient!aq;")
	private final Class22 aClass22_32 = new Class22(256);

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_17;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_8;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!mj;Lclient!d;)V")
	public Class239(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass101_Sub1_17 = arg0;
		this.anInterface3_8 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	public void method6482() {
		this.aClass22_32.method461();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lclient!lba;")
	public Interface10 method6483(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass22_32.method462((long) arg0);
		if (local12 != null) {
			return (Interface10) local12;
		} else if (this.anInterface3_8.method1940(arg0)) {
			@Pc(31) Class136 local31 = this.anInterface3_8.method1941(arg0);
			@Pc(40) int local40 = local31.aBoolean333 ? 64 : this.aClass101_Sub1_17.anInt6623;
			@Pc(75) Interface10 local75;
			if (local31.aBoolean336 && this.aClass101_Sub1_17.method8101()) {
				@Pc(57) float[] local57 = this.anInterface3_8.method1942(local40, local40, 0.7F, arg0);
				local75 = this.aClass101_Sub1_17.method5939(local31.aByte63 != 0, local57, Static584.aClass244_9, local40, local40);
			} else {
				@Pc(98) int[] local98;
				if (local31.anInt4370 != 2 && Static155.method3183(local31.aByte62)) {
					local98 = this.anInterface3_8.method1938(true, 0.7F, local40, arg0, local40);
				} else {
					local98 = this.anInterface3_8.method1939(0.7F, arg0, local40, local40);
				}
				local75 = this.aClass101_Sub1_17.method5833(local40, local40, local98, local31.aByte63 != 0);
			}
			local75.method9107(local31.aBoolean331, local31.aBoolean335);
			this.aClass22_32.method470((long) arg0, local75);
			return local75;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public void method6485() {
		this.aClass22_32.method468(5);
	}
}
