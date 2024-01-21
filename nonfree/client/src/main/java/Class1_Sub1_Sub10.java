import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ei", name = "vb", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
	protected int anInt1393;

	@OriginalMember(owner = "client!ei", name = "tb", descriptor = "[I")
	protected int[] anIntArray128;

	@OriginalMember(owner = "client!ei", name = "ub", descriptor = "I")
	protected int anInt1406;

	@OriginalMember(owner = "client!ei", name = "ob", descriptor = "I")
	private int anInt1401 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray4[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public final void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1401 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)Z")
	protected final boolean method919() {
		if (this.anIntArray128 != null) {
			return true;
		} else if (this.anInt1401 >= 0) {
			@Pc(17) Class1_Sub2_Sub5_Sub3 local17 = Static1.method3305(this.anInt1401, Static174.aClass60_33);
			local17.method1308();
			this.anInt1393 = local17.anInt1855;
			this.anIntArray128 = local17.anIntArray204;
			this.anInt1406 = local17.anInt1851;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82 && this.method919()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(53) int local53 = this.anInt1406 * (Static112.anInt2736 == this.anInt1393 ? arg0 : arg0 * this.anInt1393 / Static112.anInt2736);
			@Pc(57) int[] local57 = local17[2];
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (Static176.anInt3921 == this.anInt1406) {
				for (local67 = 0; local67 < Static176.anInt3921; local67++) {
					local76 = this.anIntArray128[local53++];
					local57[local67] = (local76 & 0xFF) << 4;
					local33[local67] = local76 >> 4 & 0xFF0;
					local29[local67] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static176.anInt3921; local67++) {
					local76 = this.anInt1406 * local67 / Static176.anInt3921;
					@Pc(83) int local83 = this.anIntArray128[local53 + local76];
					local57[local67] = (local83 & 0xFF) << 4;
					local33[local67] = local83 >> 4 & 0xFF0;
					local29[local67] = local83 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
	@Override
	public final void method3306() {
		super.method3306();
		this.anIntArray128 = null;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I")
	@Override
	public final int method3309() {
		return this.anInt1401;
	}
}
