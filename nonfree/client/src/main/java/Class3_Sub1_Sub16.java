import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "[B")
	public static final byte[] aByteArray45;

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
	private int anInt4548 = 32768;

	static {
		new Class67("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
		aByteArray45 = new byte[32896];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray45[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(26) int[] local26 = this.method7778(1, arg0);
			@Pc(32) int[] local32 = this.method7778(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static307.anInt4846; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt4548 >> 12;
				@Pc(75) int local75 = Static247.anIntArray452[local58] * local67 >> 12;
				@Pc(83) int local83 = Static226.anIntArray436[local58] * local67 >> 12;
				@Pc(91) int local91 = Static324.anInt6207 & (local75 >> 12) + local46;
				@Pc(99) int local99 = Static485.anInt8693 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method7779(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt4548 = arg1.method7591() << 4;
		} else if (arg0 == 1) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(26) int[] local26 = this.method7778(1, arg0);
			@Pc(32) int[] local32 = this.method7778(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static307.anInt4846; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt4548 * local32[local34] >> 12;
				@Pc(61) int local61 = Static247.anIntArray452[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static226.anIntArray436[local44] >> 12;
				@Pc(78) int local78 = local34 + (local61 >> 12) & Static324.anInt6207;
				@Pc(87) int local87 = Static485.anInt8693 & arg0 + (local69 >> 12);
				@Pc(93) int[] local93 = this.method7778(0, local87);
				local16[local34] = local93[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		Static353.method5563();
	}
}
