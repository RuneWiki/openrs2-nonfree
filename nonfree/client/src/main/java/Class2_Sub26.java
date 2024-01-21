import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!hg;")
	public Class2_Sub9_Sub2 aClass2_Sub9_Sub2_2;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt4012;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public int anInt4013;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!md;")
	public Class2_Sub2_Sub20 aClass2_Sub2_Sub20_1;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	public int anInt4019;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public int anInt4020;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public int anInt4022;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public int anInt4023;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public int anInt4024;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Lclient!hg;")
	public Class2_Sub9_Sub2 aClass2_Sub9_Sub2_3;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "[I")
	public int[] anIntArray400;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public void method3082() {
		@Pc(6) int local6 = this.anInt4024;
		@Pc(13) Class2_Sub2_Sub20 local13 = this.aClass2_Sub2_Sub20_1.method2050();
		if (local13 == null) {
			this.anInt4024 = -1;
			this.anIntArray400 = null;
			this.anInt4012 = 0;
			this.anInt4018 = 0;
			this.anInt4022 = 0;
		} else {
			this.anInt4018 = local13.anInt2662;
			this.anInt4024 = local13.anInt2691;
			this.anIntArray400 = local13.anIntArray262;
			this.anInt4012 = local13.anInt2677;
			this.anInt4022 = local13.anInt2684 * 128;
		}
		if (this.anInt4024 != local6 && this.aClass2_Sub9_Sub2_3 != null) {
			Static34.aClass2_Sub9_Sub4_1.method2480(this.aClass2_Sub9_Sub2_3);
			this.aClass2_Sub9_Sub2_3 = null;
		}
	}
}
