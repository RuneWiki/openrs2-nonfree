import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mt", name = "Q", descriptor = "[J")
	public static final long[] aLongArray5;

	@OriginalMember(owner = "client!mt", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!mt", name = "R", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!mt", name = "S", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "[S")
	private final short[] aShortArray72 = new short[257];

	@OriginalMember(owner = "client!mt", name = "T", descriptor = "I")
	private int anInt4748 = 0;

	static {
		new Class209("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
		aLongArray5 = new long[256];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray5[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)V")
	private void method3828() {
		@Pc(8) int[] local8 = this.anIntArrayArray48[0];
		@Pc(13) int[] local13 = this.anIntArrayArray48[1];
		@Pc(22) int[] local22 = this.anIntArrayArray48[this.anIntArrayArray48.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray48[this.anIntArrayArray48.length - 1];
		this.anIntArray397 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + local8[1] - local13[1] };
		this.anIntArray396 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] + -local22[1]) };
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		if (this.anIntArrayArray48 == null) {
			this.anIntArrayArray48 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray48.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt4748 == 2) {
			this.method3828();
		}
		Static180.method2885();
		this.method3829();
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(26) int[] local26 = this.method5839(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static429.anInt6518; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray72[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt4748 = arg0.method5495();
		this.anIntArrayArray48 = new int[arg0.method5495()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray48.length; local26++) {
			this.anIntArrayArray48[local26][0] = arg0.method5500();
			this.anIntArrayArray48[local26][1] = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "(I)V")
	private void method3829() {
		@Pc(4) int local4 = this.anInt4748;
		@Pc(24) int local24;
		@Pc(22) int local22;
		@Pc(55) int[] local55;
		@Pc(60) int[] local60;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(86) int local86;
		if (local4 == 2) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray48.length - 1 > local24 && this.anIntArrayArray48[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray48[local24 - 1];
				local60 = this.anIntArrayArray48[local24];
				local69 = this.method3831(local24 - 2)[1];
				local73 = local55[1];
				local77 = local60[1];
				local86 = this.method3831(local24 + 1)[1];
				@Pc(104) int local104 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				@Pc(110) int local110 = local104 * local104 >> 12;
				@Pc(120) int local120 = local73 + local86 - local69 - local77;
				@Pc(127) int local127 = local69 - local120 - local73;
				@Pc(132) int local132 = local77 - local69;
				@Pc(144) int local144 = local110 * (local104 * local120 >> 12) >> 12;
				@Pc(150) int local150 = local127 * local110 >> 12;
				@Pc(156) int local156 = local104 * local132 >> 12;
				@Pc(165) int local165 = local150 + local144 + local156 + local73;
				if (local165 <= -32768) {
					local165 = -32767;
				}
				if (local165 >= 32768) {
					local165 = 32767;
				}
				this.aShortArray72[local4] = (short) local165;
			}
		} else if (local4 == 1) {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray48.length - 1 > local24 && this.anIntArrayArray48[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray48[local24 - 1];
				local60 = this.anIntArrayArray48[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - Static90.anIntArray171[local69 >> 5 & 0xFF] >> 1;
				local77 = 4096 - local73;
				local86 = local55[1] * local77 + local60[1] * local73 >> 12;
				if (local86 <= -32768) {
					local86 = -32767;
				}
				if (local86 >= 32768) {
					local86 = 32767;
				}
				this.aShortArray72[local4] = (short) local86;
			}
		} else {
			for (local4 = 0; local4 < 257; local4++) {
				local22 = local4 << 4;
				for (local24 = 1; this.anIntArrayArray48.length - 1 > local24 && this.anIntArrayArray48[local24][0] <= local22; local24++) {
				}
				local55 = this.anIntArrayArray48[local24 - 1];
				local60 = this.anIntArrayArray48[local24];
				local69 = (local22 - local55[0] << 12) / (local60[0] - local55[0]);
				local73 = 4096 - local69;
				local77 = local60[1] * local69 + local55[1] * local73 >> 12;
				if (local77 <= -32768) {
					local77 = -32767;
				}
				if (local77 >= 32768) {
					local77 = 32767;
				}
				this.aShortArray72[local4] = (short) local77;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)[I")
	private int[] method3831(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray397;
		} else if (arg0 >= this.anIntArrayArray48.length) {
			return this.anIntArray396;
		} else {
			return this.anIntArrayArray48[arg0];
		}
	}
}
