import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class59 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "F")
	public float aFloat62 = 1.0F;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "F")
	public float aFloat63 = 1.0F;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "F")
	public float aFloat65 = 0.25F;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public int anInt1950;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!va;")
	public Class1_Sub2_Sub21 aClass1_Sub2_Sub21_3;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class59() {
		this.anInt1951 = Static201.anInt4495;
		this.aFloat64 = 1.1523438F;
		this.anInt1950 = 0;
		this.aFloat66 = 0.69921875F;
		this.anInt1943 = Static201.anInt4492;
		this.anInt1945 = -50;
		this.anInt1944 = -60;
		this.aFloat61 = 1.2F;
		this.anInt1942 = -50;
		if (Static52.anIntArray148 != null) {
			this.aClass1_Sub2_Sub21_3 = Static276.method4604(Static52.anIntArray148[0], Static52.anIntArray148[1], Static52.anIntArray148[2], Static52.anIntArray148[3], Static52.anIntArray148[4], Static52.anIntArray148[5]);
		}
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class59(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(16) int local16 = arg0.method2655();
		if ((local16 & 0x1) == 0) {
			this.anInt1951 = Static201.anInt4495;
		} else {
			this.anInt1951 = arg0.method2610();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat64 = 1.1523438F;
		} else {
			this.aFloat64 = (float) arg0.method2652() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat66 = 0.69921875F;
		} else {
			this.aFloat66 = (float) arg0.method2652() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat61 = 1.2F;
		} else {
			this.aFloat61 = (float) arg0.method2652() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1942 = -50;
			this.anInt1945 = -50;
			this.anInt1944 = -60;
		} else {
			this.anInt1945 = arg0.method2645();
			this.anInt1944 = arg0.method2645();
			this.anInt1942 = arg0.method2645();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1943 = Static201.anInt4492;
		} else {
			this.anInt1943 = arg0.method2610();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1950 = 0;
		} else {
			this.anInt1950 = arg0.method2652();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub2_Sub21_3 = Static276.method4604(arg0.method2652(), arg0.method2652(), arg0.method2652(), arg0.method2652(), arg0.method2652(), arg0.method2652());
		} else if (Static52.anIntArray148 != null) {
			this.aClass1_Sub2_Sub21_3 = Static276.method4604(Static52.anIntArray148[0], Static52.anIntArray148[1], Static52.anIntArray148[2], Static52.anIntArray148[3], Static52.anIntArray148[4], Static52.anIntArray148[5]);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!im;)V")
	public void method1455(@OriginalArg(1) Class1_Sub16 arg0) {
		this.aFloat62 = (float) (arg0.method2655() * 8) / 255.0F;
		this.aFloat65 = (float) (arg0.method2655() * 8) / 255.0F;
		this.aFloat63 = (float) (arg0.method2655() * 8) / 255.0F;
	}
}
