import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class212 {

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt5516 = 99;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
	public int anInt5520 = 2;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
	public int anInt5513 = -1;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public int anInt5517 = -1;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "Z")
	public boolean aBoolean416 = false;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public int anInt5523 = 5;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
	public int anInt5522 = -1;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Z")
	public boolean aBoolean414 = false;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public int anInt5524 = -1;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public int anInt5527 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!jc;)V")
	private void method5026(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(43) int local43;
		@Pc(66) int local66;
		if (arg0 == 1) {
			local12 = arg1.method3018();
			this.anIntArray325 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray325[local18] = arg1.method3018();
			}
			this.anIntArray322 = new int[local12];
			for (local43 = 0; local43 < local12; local43++) {
				this.anIntArray322[local43] = arg1.method3018();
			}
			for (local66 = 0; local66 < local12; local66++) {
				this.anIntArray322[local66] = (arg1.method3018() << 16) + this.anIntArray322[local66];
			}
		} else if (arg0 == 2) {
			this.anInt5513 = arg1.method3018();
		} else if (arg0 == 3) {
			this.aBooleanArray18 = new boolean[256];
			local12 = arg1.method3030();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray18[arg1.method3030()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt5523 = arg1.method3030();
		} else if (arg0 == 6) {
			this.anInt5517 = arg1.method3018();
		} else if (arg0 == 7) {
			this.anInt5522 = arg1.method3018();
		} else if (arg0 == 8) {
			this.anInt5516 = arg1.method3030();
		} else if (arg0 == 9) {
			this.anInt5527 = arg1.method3030();
		} else if (arg0 == 10) {
			this.anInt5524 = arg1.method3030();
		} else if (arg0 == 11) {
			this.anInt5520 = arg1.method3030();
		} else if (arg0 == 12) {
			local12 = arg1.method3030();
			this.anIntArray324 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray324[local18] = arg1.method3018();
			}
			for (local43 = 0; local43 < local12; local43++) {
				this.anIntArray324[local43] = (arg1.method3018() << 16) + this.anIntArray324[local43];
			}
		} else if (arg0 == 13) {
			local12 = arg1.method3018();
			this.anIntArrayArray31 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local43 = arg1.method3030();
				if (local43 > 0) {
					this.anIntArrayArray31[local18] = new int[local43];
					this.anIntArrayArray31[local18][0] = arg1.method2987();
					for (local66 = 1; local66 < local43; local66++) {
						this.anIntArrayArray31[local18][local66] = arg1.method3018();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean414 = true;
		} else if (arg0 == 15) {
			this.aBoolean416 = true;
		} else if (arg0 != 16) {
			if (arg0 == 18) {
				this.aBoolean415 = true;
			} else if (arg0 == 19) {
				if (this.anIntArray323 == null) {
					this.anIntArray323 = new int[this.anIntArrayArray31.length];
					for (local12 = 0; local12 < this.anIntArrayArray31.length; local12++) {
						this.anIntArray323[local12] = 255;
					}
				}
				this.anIntArray323[arg1.method3030()] = arg1.method3030();
			} else if (arg0 == 20) {
				if (this.anIntArray321 == null || this.anIntArray320 == null) {
					this.anIntArray321 = new int[this.anIntArrayArray31.length];
					this.anIntArray320 = new int[this.anIntArrayArray31.length];
					for (local12 = 0; local12 < this.anIntArrayArray31.length; local12++) {
						this.anIntArray321[local12] = 256;
						this.anIntArray320[local12] = 256;
					}
				}
				local12 = arg1.method3030();
				this.anIntArray321[local12] = arg1.method3018();
				this.anIntArray320[local12] = arg1.method3018();
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method5027() {
		if (this.anInt5527 == -1) {
			if (this.aBooleanArray18 == null) {
				this.anInt5527 = 0;
			} else {
				this.anInt5527 = 2;
			}
		}
		if (this.anInt5524 != -1) {
			return;
		}
		if (this.aBooleanArray18 == null) {
			this.anInt5524 = 0;
		} else {
			this.anInt5524 = 2;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!jc;)V")
	public void method5030(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method5026(local5, arg0);
		}
	}
}
