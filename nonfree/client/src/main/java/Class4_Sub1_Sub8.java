import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
	private int anInt1842 = -1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230 && this.method1399()) {
			@Pc(39) int local39 = this.anInt1831 * (Static25.anInt379 == this.anInt1838 ? arg0 : arg0 * this.anInt1838 / Static25.anInt379);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local11[1];
			@Pc(61) int local61;
			@Pc(74) int local74;
			if (this.anInt1831 == Static73.anInt1626) {
				for (local61 = 0; local61 < Static73.anInt1626; local61++) {
					local74 = this.anIntArray126[local39++];
					local47[local61] = (local74 & 0xFF) << 4;
					local51[local61] = local74 >> 4 & 0xFF0;
					local43[local61] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static73.anInt1626; local61++) {
					local74 = this.anInt1831 * local61 / Static73.anInt1626;
					@Pc(122) int local122 = this.anIntArray126[local74 + local39];
					local47[local61] = (local122 & 0xFF) << 4;
					local51[local61] = local122 >> 4 & 0xFF0;
					local43[local61] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z")
	private boolean method1399() {
		if (this.anIntArray126 != null) {
			return true;
		} else if (this.anInt1842 >= 0) {
			@Pc(21) int local21 = Static25.anInt379;
			@Pc(23) int local23 = Static73.anInt1626;
			@Pc(34) int local34 = Static229.anInterface3_1.method417(this.anInt1842).aBoolean234 ? 64 : 128;
			this.anIntArray126 = Static229.anInterface3_1.method415(local34, 1.0F, this.anInt1842, local34);
			this.anInt1838 = local34;
			this.anInt1831 = local34;
			Static33.method524(local23, local21);
			return this.anIntArray126 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1842 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	@Override
	public void method4733() {
		super.method4733();
		this.anIntArray126 = null;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I")
	@Override
	public int method4728() {
		return this.anInt1842;
	}
}
