import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class132 {

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public int anInt3151;

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "[[S")
	public short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
	public int anInt3154;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
	public int anInt3150 = 2;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "[I")
	public int[] anIntArray254 = null;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "[I")
	public int[] anIntArray253 = null;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
	public int anInt3156 = -1;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
	public int anInt3158 = 4;

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
	public int anInt3155 = 3;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!nca;)V")
	public Class132(@OriginalArg(0) Class254 arg0) {
		@Pc(30) byte[] local30 = arg0.method6079(3);
		this.method2759(new Class2_Sub20(local30));
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!et;I)V")
	private void method2759(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) boolean local7 = false;
		while (true) {
			while (true) {
				@Pc(20) int local20 = arg0.method8581(-17416);
				if (local20 == 0) {
					if (local7) {
						return;
					}
					if (this.anIntArray253 == null) {
						this.anIntArray253 = new int[4];
						this.anIntArray254 = new int[4];
						this.anInt3158 = 4;
					}
					for (local20 = 0; local20 < this.anIntArray253.length; local20++) {
						this.anIntArray253[local20] = 0;
						this.anIntArray254[local20] = local20 * 20;
					}
					return;
				}
				@Pc(58) int local58;
				if (local20 == 1) {
					if (this.anIntArray253 == null) {
						this.anIntArray254 = new int[4];
						this.anInt3158 = 4;
						this.anIntArray253 = new int[4];
					}
					for (local58 = 0; local58 < this.anIntArray253.length; local58++) {
						this.anIntArray253[local58] = arg0.method8598();
						this.anIntArray254[local58] = arg0.method8598();
					}
					local7 = true;
				} else if (local20 == 2) {
					this.anInt3156 = arg0.method8575();
				} else if (local20 == 3) {
					this.anInt3158 = arg0.method8581(-17416);
					this.anIntArray253 = new int[this.anInt3158];
					this.anIntArray254 = new int[this.anInt3158];
				} else if (local20 != 4) {
					if (local20 == 5) {
						this.anInt3151 = arg0.method8583();
					} else if (local20 == 6) {
						this.anInt3154 = arg0.method8583();
					} else if (local20 == 7) {
						this.aShortArrayArray2 = new short[10][4];
						this.aShortArrayArrayArray2 = new short[10][4][];
						for (local58 = 0; local58 < 10; local58++) {
							for (@Pc(158) int local158 = 0; local158 < 4; local158++) {
								@Pc(164) int local164 = arg0.method8575();
								if (local164 == 65535) {
									local164 = -1;
								}
								this.aShortArrayArray2[local58][local158] = (short) local164;
								@Pc(181) int local181 = arg0.method8575();
								this.aShortArrayArrayArray2[local58][local158] = new short[local181];
								for (@Pc(191) int local191 = 0; local191 < local181; local191++) {
									@Pc(197) int local197 = arg0.method8575();
									if (local197 == 65535) {
										local197 = -1;
									}
									this.aShortArrayArrayArray2[local58][local158][local191] = (short) local197;
								}
							}
						}
					} else if (local20 == 8) {
						this.aBoolean302 = false;
					} else if (local20 == 9) {
						this.anInt3150 = arg0.method8581(-17416);
					} else if (local20 == 10) {
						this.aBoolean303 = false;
					} else if (local20 == 11) {
						this.anInt3155 = arg0.method8581(-17416);
					}
				}
			}
		}
	}
}
