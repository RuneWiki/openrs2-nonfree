import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class4 {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "Lclient!aj;")
	private final Class10 aClass10_2 = new Class10(256);

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_1;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "Lclient!fa;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!us;Lclient!fa;)V")
	public Class4(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass43_Sub3_1 = arg0;
		this.anInterface8_2 = arg1;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
	public void method102() {
		this.aClass10_2.method258(5);
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
	public void method103() {
		this.aClass10_2.method263();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Lclient!db;")
	public Class34_Sub2 method104(@OriginalArg(1) int arg0) {
		@Pc(18) Object local18 = this.aClass10_2.method250((long) arg0);
		if (local18 != null) {
			return (Class34_Sub2) local18;
		} else if (this.anInterface8_2.method6559(arg0)) {
			@Pc(39) Class224 local39 = this.anInterface8_2.method6560(arg0);
			@Pc(48) int local48 = local39.aBoolean490 ? 64 : this.aClass43_Sub3_1.anInt8728;
			@Pc(83) Class34_Sub2 local83;
			if (local39.aBoolean488 && this.aClass43_Sub3_1.method7216()) {
				@Pc(65) float[] local65 = this.anInterface8_2.method6558(arg0, local48, local48, 0.7F);
				local83 = new Class34_Sub2(this.aClass43_Sub3_1, 3553, 34842, local48, local48, local39.aByte72 != 0, local65, 6408);
			} else {
				@Pc(103) int[] local103;
				if (!local39.aBoolean492 && Static588.method2590(local39.aByte69)) {
					local103 = this.anInterface8_2.method6555(arg0, true, 0.7F, local48, local48);
				} else {
					local103 = this.anInterface8_2.method6556(arg0, local48, 0.7F, local48);
				}
				local83 = new Class34_Sub2(this.aClass43_Sub3_1, 3553, 6408, local48, local48, local39.aByte72 != 0, local103, false);
			}
			local83.method1964(local39.aBoolean495, local39.aBoolean489);
			this.aClass10_2.method254(local83, (long) arg0);
			return local83;
		} else {
			return null;
		}
	}
}
