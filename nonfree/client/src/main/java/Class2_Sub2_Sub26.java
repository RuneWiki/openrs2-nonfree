import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	public int anInt4690;

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
	public int anInt4695;

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
	private int anInt4697 = 0;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
	private int anInt4692 = -1;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	private void method3246(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local14 > local23) {
			local40 = local23;
		}
		@Pc(48) double local48 = local14;
		if (local14 < local23) {
			local48 = local23;
		}
		if (local30 > local48) {
			local48 = local30;
		}
		if (local30 < local40) {
			local40 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local48 + local40) / 2.0D;
		this.anInt4690 = (int) (local76 * 256.0D);
		if (this.anInt4690 < 0) {
			this.anInt4690 = 0;
		} else if (this.anInt4690 > 255) {
			this.anInt4690 = 255;
		}
		if (local40 != local48) {
			if (local76 < 0.5D) {
				local68 = (local48 - local40) / (local40 + local48);
			}
			if (local14 == local48) {
				local70 = (local23 - local30) / (local48 - local40);
			} else if (local23 == local48) {
				local70 = (local30 - local14) / (local48 - local40) + 2.0D;
			} else if (local30 == local48) {
				local70 = (local14 - local23) / (-local40 + local48) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local68 = (local48 - local40) / (2.0D - local48 - local40);
			}
		}
		this.anInt4688 = (int) (local68 * 256.0D);
		local70 /= 6.0D;
		if (this.anInt4688 < 0) {
			this.anInt4688 = 0;
		} else if (this.anInt4688 > 255) {
			this.anInt4688 = 255;
		}
		if (local76 > 0.5D) {
			this.anInt4686 = (int) (local68 * (1.0D - local76) * 512.0D);
		} else {
			this.anInt4686 = (int) (local68 * local76 * 512.0D);
		}
		if (this.anInt4686 < 1) {
			this.anInt4686 = 1;
		}
		this.anInt4695 = (int) (local70 * (double) this.anInt4686);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ea;I)V")
	public void method3249(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method209();
			if (local5 == 0) {
				return;
			}
			this.method3250(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!ea;I)V")
	private void method3250(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4697 = arg1.method166();
			this.method3246(this.anInt4697);
		} else if (arg0 == 2) {
			this.anInt4692 = arg1.method163();
			if (this.anInt4692 == 65535) {
				this.anInt4692 = -1;
			}
		} else if (arg0 == 3) {
			arg1.method163();
		}
	}
}
