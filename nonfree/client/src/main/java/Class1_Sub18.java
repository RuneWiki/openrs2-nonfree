import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public int anInt2849;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "I")
	public int anInt2850;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Lclient!bg;")
	public Class25_Sub1_Sub1_Sub1 aClass25_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public int anInt2851;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Lclient!vc;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Lclient!ib;")
	public Class1_Sub7_Sub2 aClass1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public int anInt2853;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Lclient!h;")
	public Class25_Sub1_Sub1_Sub2 aClass25_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "I")
	public int anInt2854;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Lclient!ib;")
	public Class1_Sub7_Sub2 aClass1_Sub7_Sub2_3;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "I")
	public int anInt2855;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	public int anInt2857;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "I")
	public int anInt2859;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "I")
	public int anInt2861;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	public int anInt2863;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public int anInt2862 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public void method2348() {
		@Pc(14) int local14 = this.anInt2859;
		if (this.aClass236_1 != null) {
			@Pc(98) Class236 local98 = this.aClass236_1.method5074(Static230.aClass72_3);
			if (local98 == null) {
				this.anInt2853 = 0;
				this.anInt2859 = -1;
				this.anInt2861 = 0;
				this.anInt2849 = 0;
				this.anInt2852 = 0;
				this.anIntArray341 = null;
			} else {
				this.anInt2852 = local98.anInt5927;
				this.anIntArray341 = local98.anIntArray711;
				this.anInt2861 = local98.anInt5914;
				this.anInt2849 = local98.anInt5899 * 128;
				this.anInt2853 = local98.anInt5935;
				this.anInt2859 = local98.anInt5896;
			}
		} else if (this.aClass25_Sub1_Sub1_Sub2_1 != null) {
			@Pc(48) int local48 = Static179.method2590(this.aClass25_Sub1_Sub1_Sub2_1);
			if (local48 != local14) {
				this.anInt2859 = local48;
				@Pc(62) Class59 local62 = this.aClass25_Sub1_Sub1_Sub2_1.aClass59_1;
				if (local62.anIntArray186 != null) {
					local62 = local62.method1150(Static230.aClass72_3);
				}
				if (local62 == null) {
					this.anInt2861 = this.anInt2849 = 0;
				} else {
					this.anInt2849 = local62.anInt1424 * 128;
					this.anInt2861 = local62.anInt1427;
				}
			}
		} else if (this.aClass25_Sub1_Sub1_Sub1_1 != null) {
			this.anInt2859 = Static182.method2612(this.aClass25_Sub1_Sub1_Sub1_1);
			this.anInt2849 = this.aClass25_Sub1_Sub1_Sub1_1.anInt581 * 128;
			this.anInt2861 = this.aClass25_Sub1_Sub1_Sub1_1.anInt610;
		}
		if (this.anInt2859 != local14 && this.aClass1_Sub7_Sub2_2 != null) {
			Static366.aClass1_Sub7_Sub4_2.method4410(this.aClass1_Sub7_Sub2_2);
			this.aClass1_Sub7_Sub2_2 = null;
		}
	}
}
