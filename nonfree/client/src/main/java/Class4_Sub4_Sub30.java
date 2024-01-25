import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public class Class4_Sub4_Sub30 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "[I")
	protected int[] anIntArray574;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	protected int anInt7645;

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
	protected int anInt7649;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
	private int anInt7644 = -1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub30() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)Z")
	protected final boolean method6050() {
		if (this.anIntArray574 != null) {
			return true;
		} else if (this.anInt7644 >= 0) {
			@Pc(32) Class216 local32 = Static254.anInt4210 >= 0 ? Static465.method4465(Static82.aClass211_23, Static254.anInt4210, this.anInt7644) : Static465.method4474(Static82.aClass211_23, this.anInt7644);
			local32.method4473();
			this.anIntArray574 = local32.method4463();
			this.anInt7649 = local32.anInt5512;
			this.anInt7645 = local32.anInt5508;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296 && this.method6050()) {
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(54) int local54 = (Static91.anInt1740 == this.anInt7649 ? arg0 : arg0 * this.anInt7649 / Static91.anInt1740) * this.anInt7645;
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (Static419.anInt6404 == this.anInt7645) {
				for (local64 = 0; local64 < Static419.anInt6404; local64++) {
					local72 = this.anIntArray574[local54++];
					local38[local64] = (local72 & 0xFF) << 4;
					local34[local64] = local72 >> 4 & 0xFF0;
					local30[local64] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local64 = 0; local64 < Static419.anInt6404; local64++) {
					local72 = this.anInt7645 * local64 / Static419.anInt6404;
					@Pc(121) int local121 = this.anIntArray574[local54 + local72];
					local38[local64] = (local121 & 0xFF) << 4;
					local34[local64] = local121 >> 4 & 0xFF0;
					local30[local64] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
	@Override
	public final int method6045() {
		return this.anInt7644;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public final void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7644 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	@Override
	public final void method6042() {
		super.method6042();
		this.anIntArray574 = null;
	}
}
