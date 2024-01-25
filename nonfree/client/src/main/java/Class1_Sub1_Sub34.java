import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
	private int anInt8945 = 3216;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	private int anInt8946 = 3216;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "[I")
	private final int[] anIntArray600 = new int[3];

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	private int anInt8953 = 4096;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(27) int local27 = this.anInt8953 * Static500.anInt6889 >> 12;
			@Pc(37) int[] local37 = this.method7882(0, arg0 - 1 & Static561.anInt6003);
			@Pc(43) int[] local43 = this.method7882(0, arg0);
			@Pc(53) int[] local53 = this.method7882(0, arg0 + 1 & Static561.anInt6003);
			for (@Pc(55) int local55 = 0; local55 < Static87.anInt1964; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = local27 * (local43[Static451.anInt8721 & local55 - 1] - local43[local55 + 1 & Static451.anInt8721]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(142) int local142 = Class17_Sub3.aByteArray46[local95 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(148) int local148 = local142 * local70 >> 8;
				@Pc(154) int local154 = local142 * 4096 >> 8;
				@Pc(160) int local160 = local142 * local91 >> 8;
				@Pc(169) int local169 = this.anIntArray600[2] * local154 >> 12;
				@Pc(178) int local178 = this.anIntArray600[0] * local160 >> 12;
				@Pc(187) int local187 = this.anIntArray600[1] * local148 >> 12;
				local16[local55] = local187 + local178 + local169;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V")
	private void method7387() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt8945 / 4096.0F));
		this.anIntArray600[0] = (int) (Math.sin((double) ((float) this.anInt8946 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray600[1] = (int) (Math.cos((double) ((float) this.anInt8946 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray600[2] = (int) (Math.sin((double) ((float) this.anInt8945 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray600[0] * this.anIntArray600[0] >> 12;
		@Pc(87) int local87 = this.anIntArray600[1] * this.anIntArray600[1] >> 12;
		@Pc(99) int local99 = this.anIntArray600[2] * this.anIntArray600[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local87 + local75 + local99 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray600[1] = (this.anIntArray600[1] << 12) / local112;
			this.anIntArray600[2] = (this.anIntArray600[2] << 12) / local112;
			this.anIntArray600[0] = (this.anIntArray600[0] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8953 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt8946 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt8945 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.method7387();
	}
}
