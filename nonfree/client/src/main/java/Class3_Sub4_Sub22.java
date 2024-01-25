import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class3_Sub4_Sub22 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	private int anInt5139;

	@OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
	private int anInt5145;

	@OriginalMember(owner = "client!nu", name = "U", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
	private int anInt5146 = -1;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
	@Override
	public void method5957() {
		super.method5957();
		this.anIntArray397 = null;
	}

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)I")
	@Override
	public int method5968() {
		return this.anInt5146;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5146 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(III)V")
	@Override
	public void method5969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5969(arg0, arg1);
		if (this.anInt5146 >= 0 && Static194.anInterface7_7 != null) {
			@Pc(27) int local27 = Static194.anInterface7_7.method2131(this.anInt5146).aBoolean142 ? 64 : 128;
			this.anIntArray397 = Static194.anInterface7_7.method2129(1.0F, local27, local27, false, this.anInt5146);
			this.anInt5145 = local27;
			this.anInt5139 = local27;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(35) int local35 = this.anInt5139 * (this.anInt5145 == Static340.anInt6286 ? arg0 : arg0 * this.anInt5145 / Static340.anInt6286);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (this.anInt5139 == Static106.anInt2356) {
				for (local53 = 0; local53 < Static106.anInt2356; local53++) {
					local62 = this.anIntArray397[local35++];
					local47[local53] = (local62 & 0xFF) << 4;
					local43[local53] = local62 >> 4 & 0xFF0;
					local39[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static106.anInt2356; local53++) {
					local62 = local53 * this.anInt5139 / Static106.anInt2356;
					@Pc(69) int local69 = this.anIntArray397[local62 + local35];
					local47[local53] = (local69 & 0xFF) << 4;
					local43[local53] = local69 >> 4 & 0xFF0;
					local39[local53] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
