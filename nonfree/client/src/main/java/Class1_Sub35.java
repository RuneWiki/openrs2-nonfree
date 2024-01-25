import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public int anInt5281;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	public int anInt5283;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
	public int anInt5284;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	public int anInt5285;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public int anInt5286;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!fi;")
	public Class1_Sub19_Sub1 aClass1_Sub19_Sub1_3;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public int anInt5287;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!wq;")
	public Class31_Sub2_Sub1_Sub2 aClass31_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "Lclient!jt;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
	public int anInt5289;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public int anInt5290;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "Lclient!fi;")
	public Class1_Sub19_Sub1 aClass1_Sub19_Sub1_4;

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "Lclient!cl;")
	public Class31_Sub2_Sub1_Sub1 aClass31_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	public int anInt5293;

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
	public int anInt5288 = 0;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	public void method4370() {
		@Pc(6) int local6 = this.anInt5281;
		if (this.aClass129_1 != null) {
			@Pc(21) Class129 local21 = this.aClass129_1.method3031(Static394.aClass23_1);
			if (local21 == null) {
				this.anInt5281 = -1;
				this.anInt5283 = 0;
				this.anInt5285 = 0;
				this.anInt5287 = 0;
				this.anInt5293 = 0;
				this.anIntArray459 = null;
			} else {
				this.anInt5281 = local21.anInt3489;
				this.anInt5283 = local21.anInt3495 << 7;
				this.anIntArray459 = local21.anIntArray309;
				this.anInt5293 = local21.anInt3515;
				this.anInt5287 = local21.anInt3488;
				this.anInt5285 = local21.anInt3486;
			}
		} else if (this.aClass31_Sub2_Sub1_Sub2_1 != null) {
			@Pc(99) int local99 = Static43.method810(this.aClass31_Sub2_Sub1_Sub2_1);
			if (local99 != local6) {
				this.anInt5281 = local99;
				@Pc(113) Class53 local113 = this.aClass31_Sub2_Sub1_Sub2_1.aClass53_1;
				if (local113.anIntArray131 != null) {
					local113 = local113.method1508(Static394.aClass23_1);
				}
				if (local113 == null) {
					this.anInt5285 = this.anInt5283 = 0;
				} else {
					this.anInt5283 = local113.anInt1705 << 7;
					this.anInt5285 = local113.anInt1710;
				}
			}
		} else if (this.aClass31_Sub2_Sub1_Sub1_1 != null) {
			this.anInt5281 = Static269.method3957(this.aClass31_Sub2_Sub1_Sub1_1);
			this.anInt5285 = this.aClass31_Sub2_Sub1_Sub1_1.anInt1318;
			this.anInt5283 = this.aClass31_Sub2_Sub1_Sub1_1.anInt1291 << 7;
		}
		if (this.anInt5281 != local6 && this.aClass1_Sub19_Sub1_3 != null) {
			Static59.aClass1_Sub19_Sub2_1.method2185(this.aClass1_Sub19_Sub1_3);
			this.aClass1_Sub19_Sub1_3 = null;
		}
	}
}
