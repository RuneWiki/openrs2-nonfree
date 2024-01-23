import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	private int anInt1506 = 32768;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(3, false);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1506 = arg0.method1764() << 4;
		} else if (arg1 == 1) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		Static35.method621();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[] local29 = this.method4117(1, arg0);
			@Pc(35) int[] local35 = this.method4117(2, arg0);
			@Pc(39) int[] local39 = local7[1];
			@Pc(43) int[] local43 = local7[0];
			@Pc(47) int[] local47 = local7[2];
			for (@Pc(49) int local49 = 0; local49 < Static110.anInt2934; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt1506 * local35[local49] >> 12;
				@Pc(78) int local78 = Static157.anIntArray276[local61] * local70 >> 12;
				@Pc(86) int local86 = Static120.anIntArray224[local61] * local70 >> 12;
				@Pc(94) int local94 = Static2.anInt38 & local49 + (local86 >> 12);
				@Pc(102) int local102 = Static42.anInt1193 & arg0 + (local78 >> 12);
				@Pc(108) int[][] local108 = this.method4129(0, local102);
				local43[local49] = local108[0][local94];
				local39[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(25) int[] local25 = this.method4117(1, arg0);
			@Pc(31) int[] local31 = this.method4117(2, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static110.anInt2934; local33++) {
				@Pc(43) int local43 = local25[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = this.anInt1506 * local31[local33] >> 12;
				@Pc(60) int local60 = local52 * Static120.anIntArray224[local43] >> 12;
				@Pc(68) int local68 = local52 * Static157.anIntArray276[local43] >> 12;
				@Pc(76) int local76 = local33 + (local60 >> 12) & Static2.anInt38;
				@Pc(85) int local85 = Static42.anInt1193 & arg0 + (local68 >> 12);
				@Pc(91) int[] local91 = this.method4117(0, local85);
				local7[local33] = local91[local76];
			}
		}
		return local7;
	}
}
