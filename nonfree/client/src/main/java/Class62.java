import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class62 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "F")
	public float aFloat12 = 0.25F;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "F")
	public float aFloat15 = 1.0F;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "F")
	public float aFloat16 = 1.0F;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public int anInt2412;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public int anInt2404;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Lclient!dc;")
	public Class1_Sub2_Sub7 aClass1_Sub2_Sub7_4;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class62() {
		this.anInt2418 = -50;
		this.aFloat13 = 0.69921875F;
		this.anInt2414 = 0;
		this.anInt2412 = -60;
		this.anInt2411 = Static28.anInt657;
		this.aFloat17 = 1.2F;
		this.anInt2404 = -50;
		this.aFloat14 = 1.1523438F;
		this.anInt2416 = Static28.anInt655;
		if (Static149.anIntArray296 != null) {
			this.aClass1_Sub2_Sub7_4 = Static42.method861(Static149.anIntArray296[0], Static149.anIntArray296[1], Static149.anIntArray296[2], Static149.anIntArray296[3], Static149.anIntArray296[4], Static149.anIntArray296[5]);
		}
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class62(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method2690();
		if ((local16 & 0x1) == 0) {
			this.anInt2416 = Static28.anInt655;
		} else {
			this.anInt2416 = arg0.method2643();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat14 = 1.1523438F;
		} else {
			this.aFloat14 = (float) arg0.method2691() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat13 = 0.69921875F;
		} else {
			this.aFloat13 = (float) arg0.method2691() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat17 = 1.2F;
		} else {
			this.aFloat17 = (float) arg0.method2691() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2412 = -60;
			this.anInt2404 = -50;
			this.anInt2418 = -50;
		} else {
			this.anInt2404 = arg0.method2632();
			this.anInt2412 = arg0.method2632();
			this.anInt2418 = arg0.method2632();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2411 = Static28.anInt657;
		} else {
			this.anInt2411 = arg0.method2643();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2414 = 0;
		} else {
			this.anInt2414 = arg0.method2691();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub2_Sub7_4 = Static42.method861(arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691());
		} else if (Static149.anIntArray296 != null) {
			this.aClass1_Sub2_Sub7_4 = Static42.method861(Static149.anIntArray296[0], Static149.anIntArray296[1], Static149.anIntArray296[2], Static149.anIntArray296[3], Static149.anIntArray296[4], Static149.anIntArray296[5]);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!cg;I)V")
	public void method1906(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aFloat16 = (float) (arg0.method2690() * 8) / 255.0F;
		this.aFloat12 = (float) (arg0.method2690() * 8) / 255.0F;
		this.aFloat15 = (float) (arg0.method2690() * 8) / 255.0F;
	}
}
