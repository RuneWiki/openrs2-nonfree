import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class5_Sub2_Sub24 extends Class5_Sub2 {

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
	public int anInt3824;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	public int anInt3827;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	public int anInt3829;

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
	private int anInt3831 = -1;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
	private int anInt3833 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
	private void method2904(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		@Pc(39) double local39 = local14;
		if (local14 > local30) {
			local37 = local30;
		}
		if (local21 < local37) {
			local37 = local21;
		}
		@Pc(53) double local53 = 0.0D;
		if (local30 > local14) {
			local39 = local30;
		}
		@Pc(61) double local61 = 0.0D;
		if (local21 > local39) {
			local39 = local21;
		}
		@Pc(73) double local73 = (local39 + local37) / 2.0D;
		this.anInt3824 = (int) (local73 * 256.0D);
		if (local37 != local39) {
			if (local39 == local14) {
				local61 = (local30 - local21) / (local39 - local37);
			} else if (local39 == local30) {
				local61 = (local21 - local14) / (-local37 + local39) + 2.0D;
			} else if (local39 == local21) {
				local61 = (local14 - local30) / (local39 - local37) + 4.0D;
			}
			if (local73 < 0.5D) {
				local53 = (local39 - local37) / (local37 + local39);
			}
			if (local73 >= 0.5D) {
				local53 = (local39 - local37) / (2.0D - local39 - local37);
			}
		}
		if (local73 > 0.5D) {
			this.anInt3827 = (int) ((1.0D - local73) * 512.0D * local53);
		} else {
			this.anInt3827 = (int) (local53 * local73 * 512.0D);
		}
		this.anInt3829 = (int) (local53 * 256.0D);
		if (this.anInt3829 < 0) {
			this.anInt3829 = 0;
		} else if (this.anInt3829 > 255) {
			this.anInt3829 = 255;
		}
		if (this.anInt3824 < 0) {
			this.anInt3824 = 0;
		} else if (this.anInt3824 > 255) {
			this.anInt3824 = 255;
		}
		if (this.anInt3827 < 1) {
			this.anInt3827 = 1;
		}
		local61 /= 6.0D;
		this.anInt3823 = (int) ((double) this.anInt3827 * local61);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILclient!ce;)V")
	private void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub6 arg2) {
		if (arg0 == 1) {
			this.anInt3833 = arg2.method3072();
			this.method2904(this.anInt3833);
		} else if (arg0 == 2) {
			this.anInt3831 = arg2.method3077();
			if (this.anInt3831 == 65535) {
				this.anInt3831 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method3077();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!ce;)V")
	public void method2906(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method3062();
			if (local12 == 0) {
				return;
			}
			this.method2905(local12, arg0, arg1);
		}
	}
}
