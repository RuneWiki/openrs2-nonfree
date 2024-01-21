import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "[Lclient!pe;")
	public Class65[] aClass65Array68;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
	public int anInt2563;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	public int anInt2565 = 0;

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lclient!pe;")
	public Class65 aClass65_1104 = Static71.aClass65_706;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!be;I)V")
	public void method1855(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method933();
			if (local9 == 0) {
				return;
			}
			this.method1857(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!be;)V")
	private void method1857(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2563 = arg1.method933();
		} else if (arg0 == 2) {
			this.anInt2571 = arg1.method933();
		} else if (arg0 == 3) {
			this.aClass65_1104 = arg1.method931();
		} else if (arg0 == 4) {
			this.anInt2568 = arg1.method903();
		} else {
			@Pc(53) int local53;
			if (arg0 == 5) {
				this.anInt2565 = arg1.method896();
				this.aClass65Array68 = new Class65[this.anInt2565];
				this.anIntArray338 = new int[this.anInt2565];
				for (local53 = 0; local53 < this.anInt2565; local53++) {
					this.anIntArray338[local53] = arg1.method903();
					this.aClass65Array68[local53] = arg1.method931();
				}
			} else if (arg0 == 6) {
				this.anInt2565 = arg1.method896();
				this.anIntArray338 = new int[this.anInt2565];
				this.anIntArray339 = new int[this.anInt2565];
				for (local53 = 0; local53 < this.anInt2565; local53++) {
					this.anIntArray338[local53] = arg1.method903();
					this.anIntArray339[local53] = arg1.method903();
				}
			}
		}
	}
}
