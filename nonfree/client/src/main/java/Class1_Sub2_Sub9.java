import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
	private int anInt2402;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
	private int anInt2408;

	@OriginalMember(owner = "client!gm", name = "T", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
	private int anInt2405 = -1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2405 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(43) int local43 = (Static214.anInt6457 == this.anInt2402 ? arg0 : this.anInt2402 * arg0 / Static214.anInt6457) * this.anInt2408;
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static410.anInt7198 == this.anInt2408) {
				for (local65 = 0; local65 < Static410.anInt7198; local65++) {
					local73 = this.anIntArray173[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static410.anInt7198; local65++) {
					local73 = this.anInt2408 * local65 / Static410.anInt7198;
					@Pc(126) int local126 = this.anIntArray173[local43 + local73];
					local55[local65] = (local126 & 0xFF) << 4;
					local51[local65] = local126 >> 4 & 0xFF0;
					local47[local65] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5871(arg0, arg1);
		if (this.anInt2405 >= 0 && Static51.anInterface5_3 != null) {
			@Pc(35) int local35 = Static51.anInterface5_3.method3920(this.anInt2405).aBoolean282 ? 64 : 128;
			this.anIntArray173 = Static51.anInterface5_3.method3923(this.anInt2405, false, 1.0F, local35, local35);
			this.anInt2408 = local35;
			this.anInt2402 = local35;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
	@Override
	public void method5860() {
		super.method5860();
		this.anIntArray173 = null;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)I")
	@Override
	public int method5861() {
		return this.anInt2405;
	}
}
