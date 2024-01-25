import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
	protected int anInt6201;

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
	protected int anInt6204;

	@OriginalMember(owner = "client!ui", name = "W", descriptor = "[I")
	protected int[] anIntArray456;

	@OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
	private int anInt6206 = -1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)I")
	@Override
	public final int method5881() {
		return this.anInt6206;
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)Z")
	protected final boolean method5408() {
		if (this.anIntArray456 != null) {
			return true;
		} else if (this.anInt6206 >= 0) {
			@Pc(37) Class76 local37 = Static287.anInt5817 < 0 ? Static361.method2360(Static157.aClass191_98, this.anInt6206) : Static361.method2368(Static157.aClass191_98, Static287.anInt5817, this.anInt6206);
			local37.method2358();
			this.anIntArray456 = local37.method2359();
			this.anInt6201 = local37.anInt2414;
			this.anInt6204 = local37.anInt2415;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	@Override
	public final void method5878() {
		super.method5878();
		this.anIntArray456 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public final void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6206 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238 && this.method5408()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = this.anInt6201 * (Static84.anInt1830 == this.anInt6204 ? arg0 : arg0 * this.anInt6204 / Static84.anInt1830);
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static339.anInt6735 == this.anInt6201) {
				for (local65 = 0; local65 < Static339.anInt6735; local65++) {
					local73 = this.anIntArray456[local59++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static339.anInt6735; local65++) {
					local73 = local65 * this.anInt6201 / Static339.anInt6735;
					@Pc(121) int local121 = this.anIntArray456[local73 + local59];
					local39[local65] = (local121 & 0xFF) << 4;
					local35[local65] = local121 >> 4 & 0xFF0;
					local31[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
