import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public class Class6_Sub3_Sub7 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
	protected int anInt2423;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "[I")
	protected int[] anIntArray298;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	protected int anInt2427;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
	private int anInt2422 = -1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub7() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172 && this.method2049()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = (Static495.anInt8251 == this.anInt2427 ? arg0 : arg0 * this.anInt2427 / Static495.anInt8251) * this.anInt2423;
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt2423 == Static447.anInt8568) {
				for (local65 = 0; local65 < Static447.anInt8568; local65++) {
					local73 = this.anIntArray298[local55++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static447.anInt8568; local65++) {
					local73 = this.anInt2423 * local65 / Static447.anInt8568;
					@Pc(121) int local121 = this.anIntArray298[local73 + local55];
					local39[local65] = (local121 & 0xFF) << 4;
					local35[local65] = local121 >> 4 & 0xFF0;
					local31[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)Z")
	protected final boolean method2049() {
		if (this.anIntArray298 != null) {
			return true;
		} else if (this.anInt2422 >= 0) {
			@Pc(27) Class196 local27 = Static62.anInt1000 >= 0 ? Static589.method4745(Static88.aClass251_27, Static62.anInt1000, this.anInt2422) : Static589.method4747(Static88.aClass251_27, this.anInt2422);
			local27.method4754();
			this.anIntArray298 = local27.method4743();
			this.anInt2423 = local27.anInt5516;
			this.anInt2427 = local27.anInt5517;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	@Override
	public final void method7830() {
		super.method7830();
		this.anIntArray298 = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public final void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2422 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
	@Override
	public final int method7829() {
		return this.anInt2422;
	}
}
