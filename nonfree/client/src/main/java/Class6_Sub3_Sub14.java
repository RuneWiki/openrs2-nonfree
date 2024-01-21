import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class6_Sub3_Sub14 extends Class6_Sub3 {

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
	public int anInt2452;

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
	public int anInt2455;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
	public int anInt2457;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
	public int anInt2458;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
	public int anInt2460;

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
	public int anInt2462 = 0;

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
	public int anInt2464 = -1;

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
	public int anInt2459 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!bf;I)V")
	public void method1592(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1321();
			if (local5 == 0) {
				return;
			}
			this.method1594(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!bf;II)V")
	private void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2462 = arg1.method1290();
		} else if (arg0 == 2) {
			this.anInt2464 = arg1.method1321();
		} else if (arg0 == 5) {
			this.aBoolean125 = false;
		} else if (arg0 == 7) {
			this.anInt2459 = arg1.method1290();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	private void method1597(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		@Pc(40) double local40 = local14;
		if (local14 < local23) {
			local40 = local23;
		}
		if (local40 < local30) {
			local40 = local30;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local32 + local40) / 2.0D;
		this.anInt2467 = (int) (local76 * 256.0D);
		if (local40 != local32) {
			if (local76 < 0.5D) {
				local60 = (local40 - local32) / (local32 + local40);
			}
			if (local76 >= 0.5D) {
				local60 = (local40 - local32) / ((2.0D - local40) - local32);
			}
			if (local40 == local14) {
				local70 = (local23 - local30) / (local40 - local32);
			} else if (local40 == local23) {
				local70 = (local30 - local14) / (-local32 + local40) + 2.0D;
			} else if (local30 == local40) {
				local70 = (local14 - local23) / (local40 - local32) + 4.0D;
			}
		}
		if (this.anInt2467 < 0) {
			this.anInt2467 = 0;
		} else if (this.anInt2467 > 255) {
			this.anInt2467 = 255;
		}
		this.anInt2452 = (int) (local60 * 256.0D);
		local70 /= 6.0D;
		if (this.anInt2452 < 0) {
			this.anInt2452 = 0;
		} else if (this.anInt2452 > 255) {
			this.anInt2452 = 255;
		}
		this.anInt2458 = (int) (local70 * 256.0D);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	public void method1598() {
		if (this.anInt2459 != -1) {
			this.method1597(this.anInt2459);
			this.anInt2460 = this.anInt2458;
			this.anInt2457 = this.anInt2452;
			this.anInt2455 = this.anInt2467;
		}
		this.method1597(this.anInt2462);
	}
}
