import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class101 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	private int anInt2929;

	static {
		new Class85(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(II)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != arg1) {
			@Pc(12) int local12 = Static219.method4011(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anIntArrayArray50 = new int[local20][14];
			this.anInt2930 = local16;
			this.anInt2929 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray50[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local16 / (double) local20;
				while (local66 > local56) {
					@Pc(88) double local88 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(90) double local90 = local79;
					if (local88 < -1.0E-4D || local88 > 1.0E-4D) {
						local90 = local79 * (Math.sin(local88) / local88);
					}
					local90 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local90 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)I")
	public int method2706(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) this.anInt2930 * (long) arg0 / (long) this.anInt2929) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public int method2707(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray50 != null) {
			arg0 = (int) ((long) this.anInt2930 * (long) arg0 / (long) this.anInt2929);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([BB)[B")
	public byte[] method2708(@OriginalArg(0) byte[] arg0) {
		if (this.anIntArrayArray50 != null) {
			@Pc(27) int local27 = (int) ((long) arg0.length * (long) this.anInt2930 / (long) this.anInt2929) + 14;
			@Pc(30) int[] local30 = new int[local27];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
				@Pc(42) byte local42 = arg0[local36];
				@Pc(47) int[] local47 = this.anIntArrayArray50[local34];
				for (@Pc(49) int local49 = 0; local49 < 14; local49++) {
					local30[local49 + local32] += local47[local49] * local42;
				}
				local34 += this.anInt2930;
				@Pc(78) int local78 = local34 / this.anInt2929;
				local34 -= local78 * this.anInt2929;
				local32 += local78;
			}
			arg0 = new byte[local27];
			for (@Pc(99) int local99 = 0; local99 < local27; local99++) {
				@Pc(109) int local109 = local30[local99] + 32768 >> 16;
				if (local109 < -128) {
					arg0[local99] = -128;
				} else if (local109 > 127) {
					arg0[local99] = 127;
				} else {
					arg0[local99] = (byte) local109;
				}
			}
		}
		return arg0;
	}
}
