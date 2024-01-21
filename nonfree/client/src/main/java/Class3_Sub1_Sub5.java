import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "[Lclient!sd;")
	public Class73[] aClass73Array5;

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "Lclient!sd;")
	public Class73 aClass73_351 = Static168.aClass73_1975;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
	public int anInt595 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ff;)V")
	public void method473(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1354();
			if (local11 == 0) {
				return;
			}
			this.method476(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!ff;)V")
	private void method476(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt594 = arg1.method1354();
		} else if (arg0 == 2) {
			this.anInt592 = arg1.method1354();
		} else if (arg0 == 3) {
			this.aClass73_351 = arg1.method1390();
		} else if (arg0 == 4) {
			this.anInt588 = arg1.method1373();
		} else {
			@Pc(54) int local54;
			if (arg0 == 5) {
				this.anInt595 = arg1.method1359();
				this.aClass73Array5 = new Class73[this.anInt595];
				this.anIntArray62 = new int[this.anInt595];
				for (local54 = 0; local54 < this.anInt595; local54++) {
					this.anIntArray62[local54] = arg1.method1373();
					this.aClass73Array5[local54] = arg1.method1390();
				}
			} else if (arg0 == 6) {
				this.anInt595 = arg1.method1359();
				this.anIntArray62 = new int[this.anInt595];
				this.anIntArray60 = new int[this.anInt595];
				for (local54 = 0; local54 < this.anInt595; local54++) {
					this.anIntArray62[local54] = arg1.method1373();
					this.anIntArray60[local54] = arg1.method1373();
				}
			}
		}
	}
}
