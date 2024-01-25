import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
	protected int anInt7999;

	@OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
	protected int anInt8001;

	@OriginalMember(owner = "client!mba", name = "O", descriptor = "[I")
	protected int[] anIntArray572;

	@OriginalMember(owner = "client!mba", name = "Q", descriptor = "I")
	private int anInt8008 = -1;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public final void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt8008 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)V")
	@Override
	public final void method8168() {
		super.method8168();
		this.anIntArray572 = null;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)I")
	@Override
	public final int method8163() {
		return this.anInt8008;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)Z")
	protected final boolean method6695() {
		if (this.anIntArray572 != null) {
			return true;
		} else if (this.anInt8008 >= 0) {
			@Pc(33) Class1 local33 = Static15.anInt599 >= 0 ? Static583.method55(Static142.aClass168_36, Static15.anInt599, this.anInt8008) : Static583.method47(Static142.aClass168_36, this.anInt8008);
			local33.method59();
			this.anIntArray572 = local33.method49();
			this.anInt8001 = local33.anInt27;
			this.anInt7999 = local33.anInt30;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402 && this.method6695()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(53) int local53 = this.anInt8001 * (Static468.anInt8642 == this.anInt7999 ? arg0 : arg0 * this.anInt7999 / Static468.anInt8642);
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt8001 == Static289.anInt5549) {
				for (local63 = 0; local63 < Static289.anInt5549; local63++) {
					local72 = this.anIntArray572[local53++];
					local37[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static289.anInt5549; local63++) {
					local72 = local63 * this.anInt8001 / Static289.anInt5549;
					@Pc(79) int local79 = this.anIntArray572[local53 + local72];
					local37[local63] = (local79 & 0xFF) << 4;
					local33[local63] = local79 >> 4 & 0xFF0;
					local29[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
