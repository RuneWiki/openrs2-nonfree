import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class6_Sub1_Sub24 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qba", name = "K", descriptor = "[I")
	public static final int[] anIntArray538 = new int[256];

	@OriginalMember(owner = "client!qba", name = "M", descriptor = "I")
	private int anInt7652 = 4;

	@OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
	private int anInt7651 = 4;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray538[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(25) int local25 = Static289.anInt5549 / this.anInt7651;
			@Pc(30) int local30 = Static468.anInt8642 / this.anInt7652;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method8162(Static468.anInt8642 * local39 / local30, 0);
			} else {
				local49 = this.method8162(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static289.anInt5549; local83++) {
				@Pc(92) int local92;
				if (local25 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local25;
					local92 = local98 * Static289.anInt5549 / local25;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(25) int local25 = Static289.anInt5549 / this.anInt7651;
			@Pc(30) int local30 = Static468.anInt8642 / this.anInt7652;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method8165(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method8165(0, local44 * Static468.anInt8642 / local30);
			}
			for (local44 = 0; local44 < Static289.anInt5549; local44++) {
				if (local25 <= 0) {
					local16[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local25;
					local16[local44] = local38[local72 * Static289.anInt5549 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt7651 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt7652 = arg1.method4966();
		}
	}
}
