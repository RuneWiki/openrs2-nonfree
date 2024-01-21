import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!m", name = "B", descriptor = "I")
	public int anInt1778;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "I")
	public int anInt1779;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	public int anInt1780;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "I")
	public int anInt1782;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public int anInt1784;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	public int anInt1788;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
	public boolean aBoolean112 = true;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	public int anInt1785 = -1;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
	public int anInt1787 = 0;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	public int anInt1794 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBILclient!ne;)V")
	private void method1167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub10 arg2) {
		if (arg0 == 1) {
			this.anInt1787 = arg2.method572();
		} else if (arg0 == 2) {
			this.anInt1785 = arg2.method599();
		} else if (arg0 == 5) {
			this.aBoolean112 = false;
		} else if (arg0 == 7) {
			this.anInt1794 = arg2.method572();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public void method1170() {
		if (this.anInt1794 != -1) {
			this.method1173(this.anInt1794);
			this.anInt1784 = this.anInt1779;
			this.anInt1780 = this.anInt1782;
			this.anInt1788 = this.anInt1778;
		}
		this.method1173(this.anInt1787);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ne;I)V")
	public void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method599();
			if (local5 == 0) {
				return;
			}
			this.method1167(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	private void method1173(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		@Pc(34) double local34 = local30;
		if (local30 < local21) {
			local32 = local21;
		}
		if (local32 < local8) {
			local32 = local8;
		}
		@Pc(48) double local48 = 0.0D;
		if (local21 < local30) {
			local34 = local21;
		}
		@Pc(60) double local60 = 0.0D;
		if (local8 < local34) {
			local34 = local8;
		}
		@Pc(72) double local72 = (local32 + local34) / 2.0D;
		if (local34 != local32) {
			if (local30 == local32) {
				local48 = (local21 - local8) / (local32 - local34);
			} else if (local32 == local21) {
				local48 = (local8 - local30) / (-local34 + local32) + 2.0D;
			} else if (local32 == local8) {
				local48 = (local30 - local21) / (-local34 + local32) + 4.0D;
			}
			if (local72 < 0.5D) {
				local60 = (local32 - local34) / (local34 + local32);
			}
			if (local72 >= 0.5D) {
				local60 = (local32 - local34) / (2.0D - local34 - local32);
			}
		}
		local48 /= 6.0D;
		this.anInt1779 = (int) (local72 * 256.0D);
		this.anInt1778 = (int) (local48 * 256.0D);
		this.anInt1782 = (int) (local60 * 256.0D);
		if (this.anInt1782 < 0) {
			this.anInt1782 = 0;
		} else if (this.anInt1782 > 255) {
			this.anInt1782 = 255;
		}
		if (this.anInt1779 < 0) {
			this.anInt1779 = 0;
		} else if (this.anInt1779 > 255) {
			this.anInt1779 = 255;
			return;
		}
	}
}
