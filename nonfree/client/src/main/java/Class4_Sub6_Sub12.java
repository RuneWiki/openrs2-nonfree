import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class4_Sub6_Sub12 extends Class4_Sub6 {

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "[B")
	public static final byte[] aByteArray42 = new byte[32896];

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
	private int anInt2475 = 1024;

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
	private int anInt2476 = 2048;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
	private int anInt2472 = 3072;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray42[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2475 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt2472 = arg1.method3401();
		} else if (arg0 == 2) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method5702(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static31.anInt797; local28++) {
				local11[local28] = this.anInt2475 + (local26[local28] * this.anInt2476 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(21) int[][] local21 = this.method5693(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static31.anInt797; local47++) {
				local37[local47] = this.anInt2475 + (local25[local47] * this.anInt2476 >> 12);
				local41[local47] = (local29[local47] * this.anInt2476 >> 12) + this.anInt2475;
				local45[local47] = this.anInt2475 + (this.anInt2476 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.anInt2476 = this.anInt2472 - this.anInt2475;
	}
}
