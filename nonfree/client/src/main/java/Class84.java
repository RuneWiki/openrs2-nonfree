import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class84 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
	public int anInt2473;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[[S")
	public short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
	public int anInt2472 = -1;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[I")
	public int[] anIntArray121 = null;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "[I")
	public int[] anIntArray122 = null;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
	public int anInt2476 = 3;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Z")
	public boolean aBoolean206 = true;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
	public int anInt2478 = 2;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
	public int anInt2474 = 4;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class84(@OriginalArg(0) Class221 arg0) {
		@Pc(30) byte[] local30 = arg0.method5077(3);
		this.method2190(new Class3_Sub28(local30));
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLclient!rba;)V")
	private void method2190(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(7) boolean local7 = false;
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg0.method5322(-120);
					if (local18 == 0) {
						if (local7) {
							return;
						}
						if (this.anIntArray121 == null) {
							this.anIntArray122 = new int[4];
							this.anInt2474 = 4;
							this.anIntArray121 = new int[4];
						}
						for (local18 = 0; local18 < this.anIntArray121.length; local18++) {
							this.anIntArray121[local18] = 0;
							this.anIntArray122[local18] = local18 * 20;
						}
						return;
					}
					@Pc(154) int local154;
					if (local18 == 1) {
						if (this.anIntArray121 == null) {
							this.anInt2474 = 4;
							this.anIntArray122 = new int[4];
							this.anIntArray121 = new int[4];
						}
						local7 = true;
						for (local154 = 0; local154 < this.anIntArray121.length; local154++) {
							this.anIntArray121[local154] = arg0.method5281();
							this.anIntArray122[local154] = arg0.method5281();
						}
					} else if (local18 == 2) {
						this.anInt2472 = arg0.method5272();
					} else if (local18 == 3) {
						this.anInt2474 = arg0.method5322(-109);
						this.anIntArray122 = new int[this.anInt2474];
						this.anIntArray121 = new int[this.anInt2474];
					} else if (local18 != 4) {
						if (local18 == 5) {
							this.anInt2473 = arg0.method5307();
						} else if (local18 == 6) {
							this.anInt2475 = arg0.method5307();
						} else if (local18 == 7) {
							this.aShortArrayArray1 = new short[10][4];
							this.aShortArrayArrayArray2 = new short[10][4][];
							for (local154 = 0; local154 < 10; local154++) {
								for (@Pc(158) int local158 = 0; local158 < 4; local158++) {
									@Pc(164) int local164 = arg0.method5272();
									if (local164 == 65535) {
										local164 = -1;
									}
									this.aShortArrayArray1[local154][local158] = (short) local164;
									@Pc(183) int local183 = arg0.method5272();
									this.aShortArrayArrayArray2[local154][local158] = new short[local183];
									for (@Pc(193) int local193 = 0; local193 < local183; local193++) {
										@Pc(199) int local199 = arg0.method5272();
										if (local199 == 65535) {
											local199 = -1;
										}
										this.aShortArrayArrayArray2[local154][local158][local193] = (short) local199;
									}
								}
							}
						} else if (local18 == 8) {
							this.aBoolean206 = false;
						} else if (local18 == 9) {
							this.anInt2478 = arg0.method5322(-45);
						} else if (local18 == 10) {
							this.aBoolean205 = false;
						} else if (local18 == 11) {
							this.anInt2476 = arg0.method5322(-78);
						}
					}
				}
			}
		}
	}
}
