import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	protected int anInt1952;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	protected int anInt1954;

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "[I")
	protected int[] anIntArray167;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	private int anInt1955 = -1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439 && this.method1892()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (this.anInt1954 == Static95.anInt2365 ? arg0 : arg0 * this.anInt1954 / Static95.anInt2365) * this.anInt1952;
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (Static236.anInt4609 == this.anInt1952) {
				for (local66 = 0; local66 < Static236.anInt4609; local66++) {
					local74 = this.anIntArray167[local56++];
					local36[local66] = (local74 & 0xFF) << 4;
					local32[local66] = local74 >> 4 & 0xFF0;
					local28[local66] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static236.anInt4609; local66++) {
					local74 = this.anInt1952 * local66 / Static236.anInt4609;
					@Pc(126) int local126 = this.anIntArray167[local74 + local56];
					local36[local66] = (local126 & 0xFF) << 4;
					local32[local66] = local126 >> 4 & 0xFF0;
					local28[local66] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)I")
	@Override
	public final int method7905() {
		return this.anInt1955;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public final void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1955 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	protected final boolean method1892() {
		if (this.anIntArray167 != null) {
			return true;
		} else if (this.anInt1955 >= 0) {
			@Pc(24) Class242 local24 = Static337.anInt6310 < 0 ? Static559.method5940(Static166.aClass160_37, this.anInt1955) : Static559.method5942(Static166.aClass160_37, Static337.anInt6310, this.anInt1955);
			local24.method5934();
			this.anIntArray167 = local24.method5943();
			this.anInt1954 = local24.anInt6866;
			this.anInt1952 = local24.anInt6863;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	@Override
	public final void method7908() {
		super.method7908();
		this.anIntArray167 = null;
	}
}
