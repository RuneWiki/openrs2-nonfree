import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class298 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public int anInt8760;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public int anInt8765;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
	public int anInt8771;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	public int anInt8766 = -1;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	private int anInt8770 = 0;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Z")
	public boolean aBoolean620 = true;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "Z")
	public boolean aBoolean621 = true;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	public int anInt8772 = 512;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!ig;)V")
	public void method7232(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8525();
			if (local9 == 0) {
				return;
			}
			this.method7236(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!ig;B)V")
	private void method7236(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt8770 = arg1.method8560();
			this.method7237(this.anInt8770);
		} else if (arg0 == 2) {
			this.anInt8766 = arg1.method8578();
			if (this.anInt8766 == 65535) {
				this.anInt8766 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt8772 = arg1.method8578() << 2;
			return;
		} else {
			if (arg0 == 4) {
				this.aBoolean620 = false;
			} else if (arg0 == 5) {
				this.aBoolean621 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	private void method7237(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local31 < local14) {
			local40 = local31;
		}
		if (local38 < local40) {
			local40 = local38;
		}
		@Pc(54) double local54 = local14;
		if (local14 < local31) {
			local54 = local31;
		}
		if (local54 < local38) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local40 + local54) / 2.0D;
		if (local54 != local40) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local40 + local54);
			}
			if (local54 == local14) {
				local68 = (local31 - local38) / (-local40 + local54);
			} else if (local54 == local31) {
				local68 = (local38 - local14) / (-local40 + local54) + 2.0D;
			} else if (local54 == local38) {
				local68 = (local14 - local31) / (local54 - local40) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / ((2.0D - local54) - local40);
			}
		}
		this.anInt8769 = (int) (local76 * 256.0D);
		local68 /= 6.0D;
		this.anInt8760 = (int) (local70 * 256.0D);
		if (this.anInt8769 < 0) {
			this.anInt8769 = 0;
		} else if (this.anInt8769 > 255) {
			this.anInt8769 = 255;
		}
		if (local76 > 0.5D) {
			this.anInt8765 = (int) ((1.0D - local76) * 512.0D * local70);
		} else {
			this.anInt8765 = (int) (local76 * 512.0D * local70);
		}
		if (this.anInt8760 < 0) {
			this.anInt8760 = 0;
		} else if (this.anInt8760 > 255) {
			this.anInt8760 = 255;
		}
		if (this.anInt8765 < 1) {
			this.anInt8765 = 1;
		}
		this.anInt8771 = (int) ((double) this.anInt8765 * local68);
	}
}
