import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class230 {

	@OriginalMember(owner = "client!pca", name = "H", descriptor = "[[I")
	public int[][] anIntArrayArray84;

	@OriginalMember(owner = "client!pca", name = "T", descriptor = "[I")
	public int[] anIntArray650;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
	public int anInt6375 = -1;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
	public int anInt6377 = -1;

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
	public int anInt6378 = -1;

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	public int anInt6384 = 0;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
	public int anInt6390 = -1;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	public int anInt6393 = -1;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	public int anInt6386 = 0;

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "I")
	public int anInt6397 = 0;

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
	public int anInt6394 = -1;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
	public int anInt6380 = -1;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
	public int anInt6388 = -1;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
	public int anInt6381 = 0;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
	public int anInt6383 = 0;

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
	private int anInt6395 = 0;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
	public int anInt6389 = 0;

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
	public int anInt6391 = -1;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
	public int anInt6382 = -1;

	@OriginalMember(owner = "client!pca", name = "I", descriptor = "I")
	public int anInt6406 = -1;

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "Z")
	public boolean aBoolean467 = true;

	@OriginalMember(owner = "client!pca", name = "M", descriptor = "I")
	public int anInt6410 = 0;

	@OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
	public int anInt6404 = -1;

	@OriginalMember(owner = "client!pca", name = "L", descriptor = "I")
	public int anInt6409 = -1;

	@OriginalMember(owner = "client!pca", name = "R", descriptor = "I")
	public int anInt6414 = 0;

	@OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
	public int anInt6401 = 0;

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
	public int anInt6387 = -1;

	@OriginalMember(owner = "client!pca", name = "U", descriptor = "I")
	public int anInt6416 = -1;

	@OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
	public int anInt6407 = -1;

	@OriginalMember(owner = "client!pca", name = "S", descriptor = "I")
	public int anInt6415 = 0;

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
	public int anInt6399 = -1;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
	public int anInt6376 = -1;

	@OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
	public int anInt6402 = -1;

	@OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
	public int anInt6405 = -1;

	@OriginalMember(owner = "client!pca", name = "W", descriptor = "I")
	public int anInt6418 = 0;

	@OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
	public int anInt6400 = -1;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
	public int anInt6398 = -1;

	@OriginalMember(owner = "client!pca", name = "Q", descriptor = "I")
	public int anInt6413 = 0;

	@OriginalMember(owner = "client!pca", name = "X", descriptor = "I")
	public int anInt6419 = -1;

	@OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
	public int anInt6408 = -1;

	@OriginalMember(owner = "client!pca", name = "Y", descriptor = "[I")
	public int[] anIntArray651 = null;

	@OriginalMember(owner = "client!pca", name = "V", descriptor = "I")
	public int anInt6417 = -1;

	@OriginalMember(owner = "client!pca", name = "ab", descriptor = "[I")
	public int[] anIntArray652 = null;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	public int method5395() {
		if (this.anInt6380 != -1) {
			return this.anInt6380;
		} else if (this.anIntArray652 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt6395);
			@Pc(33) int local33;
			for (local33 = 0; this.anIntArray651[local33] <= local31; local33++) {
				local31 -= this.anIntArray651[local33];
			}
			return this.anIntArray652[local33];
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method5396(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6380 = arg0.method3967();
			this.anInt6409 = arg0.method3967();
			if (this.anInt6409 == 65535) {
				this.anInt6409 = -1;
			}
			if (this.anInt6380 == 65535) {
				this.anInt6380 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt6377 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt6398 = arg0.method3967();
		} else if (arg1 == 4) {
			this.anInt6407 = arg0.method3967();
		} else if (arg1 == 5) {
			this.anInt6400 = arg0.method3967();
		} else if (arg1 == 6) {
			this.anInt6382 = arg0.method3967();
		} else if (arg1 == 7) {
			this.anInt6408 = arg0.method3967();
		} else if (arg1 == 8) {
			this.anInt6390 = arg0.method3967();
		} else if (arg1 == 9) {
			this.anInt6378 = arg0.method3967();
		} else if (arg1 == 26) {
			this.anInt6414 = (short) (arg0.method3922() * 4);
			this.anInt6386 = (short) (arg0.method3922() * 4);
		} else {
			@Pc(110) int local110;
			@Pc(341) int local341;
			if (arg1 == 27) {
				if (this.anIntArrayArray84 == null) {
					this.anIntArrayArray84 = new int[12][];
				}
				local110 = arg0.method3922();
				this.anIntArrayArray84[local110] = new int[6];
				for (local341 = 0; local341 < 6; local341++) {
					this.anIntArrayArray84[local110][local341] = arg0.method3964();
				}
			} else if (arg1 == 28) {
				this.anIntArray650 = new int[12];
				for (local110 = 0; local110 < 12; local110++) {
					this.anIntArray650[local110] = arg0.method3922();
					if (this.anIntArray650[local110] == 255) {
						this.anIntArray650[local110] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt6415 = arg0.method3922();
			} else if (arg1 == 30) {
				this.anInt6381 = arg0.method3967();
			} else if (arg1 == 31) {
				this.anInt6384 = arg0.method3922();
			} else if (arg1 == 32) {
				this.anInt6418 = arg0.method3967();
			} else if (arg1 == 33) {
				this.anInt6401 = arg0.method3964();
			} else if (arg1 == 34) {
				this.anInt6413 = arg0.method3922();
			} else if (arg1 == 35) {
				this.anInt6410 = arg0.method3967();
			} else if (arg1 == 36) {
				this.anInt6389 = arg0.method3964();
			} else if (arg1 == 37) {
				this.anInt6399 = arg0.method3922();
			} else if (arg1 == 38) {
				this.anInt6387 = arg0.method3967();
			} else if (arg1 == 39) {
				this.anInt6405 = arg0.method3967();
			} else if (arg1 == 40) {
				this.anInt6402 = arg0.method3967();
			} else if (arg1 == 41) {
				this.anInt6393 = arg0.method3967();
			} else if (arg1 == 42) {
				this.anInt6375 = arg0.method3967();
			} else if (arg1 == 43) {
				this.anInt6417 = arg0.method3967();
			} else if (arg1 == 44) {
				this.anInt6416 = arg0.method3967();
			} else if (arg1 == 45) {
				this.anInt6388 = arg0.method3967();
			} else if (arg1 == 46) {
				this.anInt6406 = arg0.method3967();
			} else if (arg1 == 47) {
				this.anInt6404 = arg0.method3967();
			} else if (arg1 == 48) {
				this.anInt6391 = arg0.method3967();
			} else if (arg1 == 49) {
				this.anInt6394 = arg0.method3967();
			} else if (arg1 == 50) {
				this.anInt6376 = arg0.method3967();
			} else if (arg1 == 51) {
				this.anInt6419 = arg0.method3967();
			} else if (arg1 == 52) {
				local110 = arg0.method3922();
				this.anIntArray651 = new int[local110];
				this.anIntArray652 = new int[local110];
				for (local341 = 0; local341 < local110; local341++) {
					this.anIntArray652[local341] = arg0.method3967();
					@Pc(353) int local353 = arg0.method3922();
					this.anIntArray651[local341] = local353;
					this.anInt6395 += local353;
				}
			} else if (arg1 == 53) {
				this.aBoolean467 = false;
			} else if (arg1 == 54) {
				this.anInt6397 = arg0.method3922() << 6;
				this.anInt6383 = arg0.method3922() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method5398(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3922();
			if (local9 == 0) {
				return;
			}
			this.method5396(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)Z")
	public boolean method5400(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6380 == arg0) {
			return true;
		} else {
			if (this.anIntArray652 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray652.length; local26++) {
					if (this.anIntArray652[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
