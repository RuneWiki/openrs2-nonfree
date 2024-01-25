import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class3_Sub4_Sub29 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	private int anInt5613;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
	private int anInt5619 = -1;

	static {
		new Class174("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(43) int local43 = this.anInt5613 * (this.anInt5615 == Static140.anInt2503 ? arg0 : this.anInt5615 * arg0 / Static140.anInt2503);
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static148.anInt2687 == this.anInt5613) {
				for (local65 = 0; local65 < Static148.anInt2687; local65++) {
					local73 = this.anIntArray348[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static148.anInt2687; local65++) {
					local73 = local65 * this.anInt5613 / Static148.anInt2687;
					@Pc(125) int local125 = this.anIntArray348[local43 + local73];
					local55[local65] = (local125 & 0xFF) << 4;
					local51[local65] = local125 >> 4 & 0xFF0;
					local47[local65] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I")
	@Override
	public int method6145() {
		return this.anInt5619;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	@Override
	public void method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6140(arg0, arg1);
		if (this.anInt5619 >= 0 && Static188.anInterface7_3 != null) {
			@Pc(24) int local24 = Static188.anInterface7_3.method4417(this.anInt5619).aBoolean232 ? 64 : 128;
			this.anIntArray348 = Static188.anInterface7_3.method4416(this.anInt5619, false, local24, local24, 1.0F);
			this.anInt5615 = local24;
			this.anInt5613 = local24;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5619 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method6137() {
		super.method6137();
		this.anIntArray348 = null;
	}
}
