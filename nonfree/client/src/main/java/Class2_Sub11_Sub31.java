import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class2_Sub11_Sub31 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
	private int anInt10334;

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "[I")
	private int[] anIntArray727;

	@OriginalMember(owner = "client!vaa", name = "D", descriptor = "I")
	private int anInt10335;

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
	private int anInt10338 = -1;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9539(arg0, arg1);
		if (this.anInt10338 >= 0 && Static654.anInterface3_11 != null) {
			@Pc(32) int local32 = Static654.anInterface3_11.method2857(this.anInt10338).aBoolean28 ? 64 : 128;
			this.anIntArray727 = Static654.anInterface3_11.method2853(this.anInt10338, 1.0F, local32, local32, false);
			this.anInt10335 = local32;
			this.anInt10334 = local32;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
	@Override
	public int method9529() {
		return this.anInt10338;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(43) int local43 = (Static609.anInt9448 == this.anInt10335 ? arg0 : this.anInt10335 * arg0 / Static609.anInt9448) * this.anInt10334;
			@Pc(47) int[] local47 = local20[0];
			@Pc(51) int[] local51 = local20[1];
			@Pc(55) int[] local55 = local20[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (Static301.anInt10214 == this.anInt10334) {
				for (local61 = 0; local61 < Static301.anInt10214; local61++) {
					local70 = this.anIntArray727[local43++];
					local55[local61] = (local70 & 0xFF) << 4;
					local51[local61] = local70 >> 4 & 0xFF0;
					local47[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static301.anInt10214; local61++) {
					local70 = this.anInt10334 * local61 / Static301.anInt10214;
					@Pc(77) int local77 = this.anIntArray727[local70 + local43];
					local55[local61] = (local77 & 0xFF) << 4;
					local51[local61] = local77 >> 4 & 0xFF0;
					local47[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10338 = arg1.method8575();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	@Override
	public void method9536() {
		super.method9536();
		this.anIntArray727 = null;
	}
}
