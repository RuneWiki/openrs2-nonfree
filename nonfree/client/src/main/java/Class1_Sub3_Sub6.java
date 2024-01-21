import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "[Lclient!af;")
	public Class5[] aClass5Array6;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lclient!af;")
	public Class5 aClass5_370 = Static128.aClass5_1468;

	@OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
	public int anInt807 = 0;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILclient!rd;)V")
	public void method565(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2053();
			if (local5 == 0) {
				return;
			}
			this.method567(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!rd;Z)V")
	private void method567(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt802 = arg1.method2053();
		} else if (arg0 == 2) {
			this.anInt799 = arg1.method2053();
		} else if (arg0 == 3) {
			this.aClass5_370 = arg1.method2101();
		} else if (arg0 == 4) {
			this.anInt803 = arg1.method2094();
		} else {
			@Pc(55) int local55;
			if (arg0 == 5) {
				this.anInt807 = arg1.method2087();
				this.anIntArray93 = new int[this.anInt807];
				this.aClass5Array6 = new Class5[this.anInt807];
				for (local55 = 0; local55 < this.anInt807; local55++) {
					this.anIntArray93[local55] = arg1.method2094();
					this.aClass5Array6[local55] = arg1.method2101();
				}
				return;
			}
			if (arg0 == 6) {
				this.anInt807 = arg1.method2087();
				this.anIntArray93 = new int[this.anInt807];
				this.anIntArray92 = new int[this.anInt807];
				for (local55 = 0; local55 < this.anInt807; local55++) {
					this.anIntArray93[local55] = arg1.method2094();
					this.anIntArray92[local55] = arg1.method2094();
				}
				return;
			}
		}
	}
}
