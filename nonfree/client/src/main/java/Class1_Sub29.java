import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public int anInt4366;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!wl;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_2;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public int anInt4367;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "I")
	public int anInt4368;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!wl;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_3;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public int anInt4372;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	public int anInt4375;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!pk;")
	public Class182 aClass182_1;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "I")
	public int anInt4378;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!uo;")
	public Class26_Sub2_Sub2_Sub2 aClass26_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	public int anInt4380;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public int anInt4381;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Lclient!tf;")
	public Class26_Sub2_Sub2_Sub1 aClass26_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public int anInt4379 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public void method3604() {
		@Pc(8) int local8 = this.anInt4372;
		if (this.aClass182_1 != null) {
			@Pc(88) Class182 local88 = this.aClass182_1.method4388(Static51.aClass79_1);
			if (local88 == null) {
				this.anInt4372 = -1;
				this.anIntArray350 = null;
				this.anInt4375 = 0;
				this.anInt4368 = 0;
				this.anInt4377 = 0;
				this.anInt4380 = 0;
			} else {
				this.anIntArray350 = local88.anIntArray427;
				this.anInt4380 = local88.anInt5448;
				this.anInt4368 = local88.anInt5495;
				this.anInt4375 = local88.anInt5476;
				this.anInt4372 = local88.anInt5479;
				this.anInt4377 = local88.anInt5462 << 7;
			}
		} else if (this.aClass26_Sub2_Sub2_Sub2_1 != null) {
			@Pc(19) int local19 = Static204.method3120(this.aClass26_Sub2_Sub2_Sub2_1);
			if (local19 != local8) {
				this.anInt4372 = local19;
				@Pc(29) Class66 local29 = this.aClass26_Sub2_Sub2_Sub2_1.aClass66_1;
				if (local29.anIntArray152 != null) {
					local29 = local29.method1454(Static51.aClass79_1);
				}
				if (local29 == null) {
					this.anInt4380 = this.anInt4377 = 0;
				} else {
					this.anInt4377 = local29.anInt1694 << 7;
					this.anInt4380 = local29.anInt1683;
				}
			}
		} else if (this.aClass26_Sub2_Sub2_Sub1_2 != null) {
			this.anInt4372 = Static195.method2960(this.aClass26_Sub2_Sub2_Sub1_2);
			this.anInt4380 = this.aClass26_Sub2_Sub2_Sub1_2.anInt6632;
			this.anInt4377 = this.aClass26_Sub2_Sub2_Sub1_2.anInt6627 << 7;
		}
		if (local8 != this.anInt4372 && this.aClass1_Sub7_Sub4_3 != null) {
			Static38.aClass1_Sub7_Sub1_1.method3979(this.aClass1_Sub7_Sub4_3);
			this.aClass1_Sub7_Sub4_3 = null;
		}
	}
}
