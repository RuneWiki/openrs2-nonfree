import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	private int anInt6311;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	private int anInt6314;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	private int anInt6317 = -1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	@Override
	public void method7829() {
		super.method7829();
		this.anIntArray377 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(40) int local40 = this.anInt6311 * (Static8.anInt5990 == this.anInt6314 ? arg0 : arg0 * this.anInt6314 / Static8.anInt5990);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt6311 == Static501.anInt8748) {
				for (local62 = 0; local62 < Static501.anInt8748; local62++) {
					local70 = this.anIntArray377[local40++];
					local52[local62] = (local70 & 0xFF) << 4;
					local48[local62] = local70 >> 4 & 0xFF0;
					local44[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static501.anInt8748; local62++) {
					local70 = local62 * this.anInt6311 / Static501.anInt8748;
					@Pc(118) int local118 = this.anIntArray377[local70 + local40];
					local52[local62] = (local118 & 0xFF) << 4;
					local48[local62] = local118 >> 4 & 0xFF0;
					local44[local62] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7834(arg0, arg1);
		if (this.anInt6317 >= 0 && Static9.anInterface9_1 != null) {
			@Pc(27) int local27 = Static9.anInterface9_1.method947(this.anInt6317).aBoolean33 ? 64 : 128;
			this.anIntArray377 = Static9.anInterface9_1.method948(false, this.anInt6317, local27, 1.0F, local27);
			this.anInt6314 = local27;
			this.anInt6311 = local27;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	@Override
	public int method7828() {
		return this.anInt6317;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6317 = arg1.method7945();
		}
	}
}
