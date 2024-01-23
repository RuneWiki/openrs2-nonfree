import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
	public static int[] anIntArray165 = new int[256];

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "[I")
	protected int[] anIntArray164;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	protected int anInt2336;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	protected int anInt2337;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt2338 = -1;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(13) int local13 = local8;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray165[local8] = local13;
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190 && this.method2080()) {
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			@Pc(54) int local54 = (Static213.anInt5511 == this.anInt2337 ? arg0 : this.anInt2337 * arg0 / Static213.anInt5511) * this.anInt2336;
			@Pc(64) int local64;
			@Pc(78) int local78;
			if (Static6.anInt4960 == this.anInt2336) {
				for (local64 = 0; local64 < Static6.anInt4960; local64++) {
					local78 = this.anIntArray164[local54++];
					local38[local64] = (local78 & 0xFF) << 4;
					local34[local64] = local78 >> 4 & 0xFF0;
					local30[local64] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static6.anInt4960; local64++) {
					local78 = this.anInt2336 * local64 / Static6.anInt4960;
					@Pc(85) int local85 = this.anIntArray164[local78 + local54];
					local38[local64] = (local85 & 0xFF) << 4;
					local34[local64] = local85 >> 4 & 0xFF0;
					local30[local64] = local85 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
	@Override
	public final int method4457() {
		return this.anInt2338;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
	protected final boolean method2080() {
		if (this.anIntArray164 != null) {
			return true;
		} else if (this.anInt2338 >= 0) {
			@Pc(37) Class1_Sub5_Sub6_Sub1 local37 = Static178.anInt3542 < 0 ? Static74.method1491(this.anInt2338, Static166.aClass119_62) : Static240.method3828(this.anInt2338, Static178.anInt3542, Static166.aClass119_62);
			local37.method1272();
			this.anIntArray164 = local37.anIntArray117;
			this.anInt2336 = local37.anInt3617;
			this.anInt2337 = local37.anInt3625;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	@Override
	public final void method4458() {
		super.method4458();
		this.anIntArray164 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public final void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2338 = arg0.method1879();
		}
	}
}
