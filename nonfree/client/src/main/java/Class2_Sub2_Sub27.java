import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "[I")
	private int[] anIntArray509;

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	private int anInt5796 = -1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5796 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	@Override
	public int method5469() {
		return this.anInt5796;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5466(arg0, arg1);
		if (this.anInt5796 >= 0 && Static243.anInterface9_5 != null) {
			@Pc(28) int local28 = Static243.anInterface9_5.method1769(this.anInt5796).aBoolean283 ? 64 : 128;
			this.anIntArray509 = Static243.anInterface9_5.method1770(local28, this.anInt5796, 1.0F, false, local28);
			this.anInt5795 = local28;
			this.anInt5797 = local28;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(39) int local39 = (Static290.anInt4775 == this.anInt5795 ? arg0 : this.anInt5795 * arg0 / Static290.anInt4775) * this.anInt5797;
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt5797 == Static217.anInt3574) {
				for (local61 = 0; local61 < Static217.anInt3574; local61++) {
					local70 = this.anIntArray509[local39++];
					local51[local61] = (local70 & 0xFF) << 4;
					local47[local61] = local70 >> 4 & 0xFF0;
					local43[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static217.anInt3574; local61++) {
					local70 = this.anInt5797 * local61 / Static217.anInt3574;
					@Pc(78) int local78 = this.anIntArray509[local39 + local70];
					local51[local61] = (local78 & 0xFF) << 4;
					local47[local61] = local78 >> 4 & 0xFF0;
					local43[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	@Override
	public void method5467() {
		super.method5467();
		this.anIntArray509 = null;
	}
}
