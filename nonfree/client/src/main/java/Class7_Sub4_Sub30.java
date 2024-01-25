import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class7_Sub4_Sub30 extends Class7_Sub4 {

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
	private int anInt5353;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
	private int[] anIntArray685;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
	private int anInt5357;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
	private int anInt5359 = -1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub30() {
		super(0, false);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5359 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	@Override
	public void method5633() {
		super.method5633();
		this.anIntArray685 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
	@Override
	public void method5632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5632(arg0, arg1);
		if (this.anInt5359 >= 0) {
			@Pc(29) int local29 = Static102.anInterface6_2.method5614(this.anInt5359).aBoolean15 ? 64 : 128;
			this.anIntArray685 = Static102.anInterface6_2.method5616(local29, local29, this.anInt5359, false, 1.0F);
			this.anInt5357 = local29;
			this.anInt5353 = local29;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I")
	@Override
	public int method5629() {
		return this.anInt5359;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(43) int local43 = this.anInt5357 * (this.anInt5353 == Static216.anInt4322 ? arg0 : arg0 * this.anInt5353 / Static216.anInt4322);
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (this.anInt5357 == Static201.anInt4174) {
				for (local65 = 0; local65 < Static201.anInt4174; local65++) {
					local74 = this.anIntArray685[local43++];
					local55[local65] = (local74 & 0xFF) << 4;
					local51[local65] = local74 >> 4 & 0xFF0;
					local47[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static201.anInt4174; local65++) {
					local74 = local65 * this.anInt5357 / Static201.anInt4174;
					@Pc(81) int local81 = this.anIntArray685[local43 + local74];
					local55[local65] = (local81 & 0xFF) << 4;
					local51[local65] = local81 >> 4 & 0xFF0;
					local47[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
