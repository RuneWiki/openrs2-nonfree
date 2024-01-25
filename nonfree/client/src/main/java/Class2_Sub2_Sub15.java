import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
	private int anInt1897;

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt1903 = -1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(III)V")
	@Override
	public void method6277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6277(arg0, arg1);
		if (this.anInt1903 >= 0 && Static276.anInterface7_5 != null) {
			@Pc(32) int local32 = Static276.anInterface7_5.method1170(this.anInt1903).aBoolean493 ? 64 : 128;
			this.anIntArray144 = Static276.anInterface7_5.method1171(false, 1.0F, this.anInt1903, local32, local32);
			this.anInt1902 = local32;
			this.anInt1897 = local32;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1903 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(42) int local42 = this.anInt1902 * (this.anInt1897 == Static271.anInt4925 ? arg0 : arg0 * this.anInt1897 / Static271.anInt4925);
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (Static398.anInt6955 == this.anInt1902) {
				for (local60 = 0; local60 < Static398.anInt6955; local60++) {
					local69 = this.anIntArray144[local42++];
					local54[local60] = (local69 & 0xFF) << 4;
					local50[local60] = local69 >> 4 & 0xFF0;
					local46[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static398.anInt6955; local60++) {
					local69 = this.anInt1902 * local60 / Static398.anInt6955;
					@Pc(76) int local76 = this.anIntArray144[local69 + local42];
					local54[local60] = (local76 & 0xFF) << 4;
					local50[local60] = local76 >> 4 & 0xFF0;
					local46[local60] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.anInt1903;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	@Override
	public void method6272() {
		super.method6272();
		this.anIntArray144 = null;
	}
}
