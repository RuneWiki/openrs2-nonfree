import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	private int anInt3872;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
	private int anInt3876;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
	private int anInt3873 = -1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3873 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
	private boolean method2933() {
		if (this.anIntArray374 != null) {
			return true;
		} else if (this.anInt3873 >= 0) {
			@Pc(13) int local13 = Static135.anInt2897;
			@Pc(15) int local15 = Static102.anInt2347;
			@Pc(25) int local25 = Static67.anInterface3_2.method1288(this.anInt3873) ? 64 : 128;
			this.anIntArray374 = Static67.anInterface3_2.method1291(this.anInt3873);
			this.anInt3872 = local25;
			this.anInt3876 = local25;
			Static84.method1496(local15, local13);
			return this.anIntArray374 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92 && this.method2933()) {
			@Pc(45) int local45 = this.anInt3872 * (this.anInt3876 == Static102.anInt2347 ? arg0 : arg0 * this.anInt3876 / Static102.anInt2347);
			@Pc(49) int[] local49 = local7[1];
			@Pc(53) int[] local53 = local7[2];
			@Pc(57) int[] local57 = local7[0];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static135.anInt2897 == this.anInt3872) {
				for (local63 = 0; local63 < Static135.anInt2897; local63++) {
					local71 = this.anIntArray374[local45++];
					local53[local63] = (local71 & 0xFF) << 4;
					local49[local63] = local71 >> 4 & 0xFF0;
					local57[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static135.anInt2897; local63++) {
					local71 = this.anInt3872 * local63 / Static135.anInt2897;
					@Pc(119) int local119 = this.anIntArray374[local71 + local45];
					local53[local63] = (local119 & 0xFF) << 4;
					local49[local63] = local119 >> 4 & 0xFF0;
					local57[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	@Override
	public void method3257() {
		super.method3257();
		this.anIntArray374 = null;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)I")
	@Override
	public int method3266() {
		return this.anInt3873;
	}
}
