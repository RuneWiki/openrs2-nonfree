import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub1_Sub2_Sub6 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!te", name = "rb", descriptor = "I")
	private int anInt2462 = 0;

	@OriginalMember(owner = "client!te", name = "Db", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!te", name = "Hb", descriptor = "I")
	private int anInt2472 = 0;

	@OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
	public final int anInt2465;

	@OriginalMember(owner = "client!te", name = "Bb", descriptor = "I")
	public final int anInt2468;

	@OriginalMember(owner = "client!te", name = "Tb", descriptor = "I")
	private final int anInt2479;

	@OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
	public final int anInt2463;

	@OriginalMember(owner = "client!te", name = "Fb", descriptor = "I")
	public final int anInt2470;

	@OriginalMember(owner = "client!te", name = "wb", descriptor = "I")
	public final int anInt2466;

	@OriginalMember(owner = "client!te", name = "Lb", descriptor = "Lclient!e;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2465 = arg3;
		this.anInt2468 = arg1;
		this.anInt2479 = arg0;
		this.anInt2463 = arg4;
		this.anInt2470 = arg2;
		this.anInt2466 = arg5 + arg6;
		@Pc(36) int local36 = Static62.method1091(this.anInt2479).anInt1200;
		if (local36 == -1) {
			this.aBoolean151 = true;
		} else {
			this.aBoolean151 = false;
			this.aClass1_Sub1_Sub4_3 = Static10.method254(local36);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
	public void method1722(@OriginalArg(1) int arg0) {
		if (this.aBoolean151) {
			return;
		}
		this.anInt2462 += arg0;
		while (this.anInt2462 > this.aClass1_Sub1_Sub4_3.anIntArray96[this.anInt2472]) {
			this.anInt2462 -= this.aClass1_Sub1_Sub4_3.anIntArray96[this.anInt2472];
			this.anInt2472++;
			if (this.anInt2472 >= this.aClass1_Sub1_Sub4_3.anIntArray97.length) {
				this.aBoolean151 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		@Pc(13) Class1_Sub1_Sub8 local13 = Static62.method1091(this.anInt2479);
		@Pc(21) Class1_Sub1_Sub2_Sub7 local21;
		if (this.aBoolean151) {
			local21 = local13.method915(-1);
		} else {
			local21 = local13.method915(this.anInt2472);
		}
		return local21 == null ? null : local21;
	}
}
