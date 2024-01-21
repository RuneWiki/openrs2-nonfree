import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	public int anInt2894;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "[Lclient!ed;")
	public Class23[] aClass23Array14;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	public int anInt2896 = 0;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lclient!ed;")
	public Class23 aClass23_1116 = Static1.aClass23_72;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!jg;)V")
	public void method2002(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method861();
			if (local14 == 0) {
				return;
			}
			this.method2003(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!jg;)V")
	private void method2003(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt2894 = arg1.method861();
		} else if (arg0 == 2) {
			this.anInt2901 = arg1.method861();
		} else if (arg0 == 3) {
			this.aClass23_1116 = arg1.method864();
		} else if (arg0 == 4) {
			this.anInt2902 = arg1.method868();
		} else {
			@Pc(80) int local80;
			if (arg0 == 5) {
				this.anInt2896 = arg1.method878();
				this.anIntArray385 = new int[this.anInt2896];
				this.aClass23Array14 = new Class23[this.anInt2896];
				for (local80 = 0; local80 < this.anInt2896; local80++) {
					this.anIntArray385[local80] = arg1.method868();
					this.aClass23Array14[local80] = arg1.method864();
				}
			} else if (arg0 == 6) {
				this.anInt2896 = arg1.method878();
				this.anIntArray386 = new int[this.anInt2896];
				this.anIntArray385 = new int[this.anInt2896];
				for (local80 = 0; local80 < this.anInt2896; local80++) {
					this.anIntArray385[local80] = arg1.method868();
					this.anIntArray386[local80] = arg1.method868();
				}
			}
		}
	}
}
