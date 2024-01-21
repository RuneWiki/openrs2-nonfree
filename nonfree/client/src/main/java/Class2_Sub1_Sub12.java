import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
	private int anInt1158;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt1160;

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
	private int anInt1163;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static120.anInt2812; local37++) {
				local27[local37] = this.anInt1163;
				local31[local37] = this.anInt1158;
				local35[local37] = this.anInt1160;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
	private void method727(@OriginalArg(0) int arg0) {
		this.anInt1158 = arg0 >> 4 & 0xFF0;
		this.anInt1160 = (arg0 & 0xFF) << 4;
		this.anInt1163 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method727(arg0.method1406());
		}
	}
}
