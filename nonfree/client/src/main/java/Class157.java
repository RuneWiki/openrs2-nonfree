import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class157 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	private int anInt4726 = -1;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	private int anInt4724 = 0;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!gw;")
	private Class91 aClass91_28 = new Class91();

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	private final int anInt4725;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	private final int anInt4723;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[Lclient!nd;")
	private Class4_Sub28[] aClass4_Sub28Array1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(III)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4725 = arg1;
		this.anInt4723 = arg0;
		this.anIntArrayArray34 = new int[this.anInt4723][arg2];
		this.aClass4_Sub28Array1 = new Class4_Sub28[this.anInt4725];
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method4023() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4723; local3++) {
			this.anIntArrayArray34[local3] = null;
		}
		this.anIntArrayArray34 = null;
		this.aClass4_Sub28Array1 = null;
		this.aClass91_28.method2582();
		this.aClass91_28 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
	public int[] method4027(@OriginalArg(1) int arg0) {
		if (this.anInt4723 == this.anInt4725) {
			this.aBoolean315 = this.aClass4_Sub28Array1[arg0] == null;
			this.aClass4_Sub28Array1[arg0] = Static411.aClass4_Sub28_3;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt4723 == 1) {
			this.aBoolean315 = arg0 != this.anInt4726;
			this.anInt4726 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(71) Class4_Sub28 local71 = this.aClass4_Sub28Array1[arg0];
			if (local71 == null) {
				this.aBoolean315 = true;
				if (this.anInt4723 <= this.anInt4724) {
					@Pc(87) Class4_Sub28 local87 = (Class4_Sub28) this.aClass91_28.method2577();
					local71 = new Class4_Sub28(arg0, local87.anInt4993);
					this.aClass4_Sub28Array1[local87.anInt4995] = null;
					local87.method6330();
				} else {
					local71 = new Class4_Sub28(arg0, this.anInt4724);
					this.anInt4724++;
				}
				this.aClass4_Sub28Array1[arg0] = local71;
			} else {
				this.aBoolean315 = false;
			}
			this.aClass91_28.method2574(local71);
			return this.anIntArrayArray34[local71.anInt4993];
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)[[I")
	public int[][] method4028() {
		if (this.anInt4725 != this.anInt4723) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4723; local29++) {
			this.aClass4_Sub28Array1[local29] = Static411.aClass4_Sub28_3;
		}
		return this.anIntArrayArray34;
	}
}
