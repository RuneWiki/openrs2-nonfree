import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class153 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	private int anInt4747 = 0;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	private int anInt4753 = -1;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!pk;")
	private Class183 aClass183_33 = new Class183();

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	private final int anInt4749;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	private final int anInt4754;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "[Lclient!gd;")
	private Class4_Sub20[] aClass4_Sub20Array1;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4749 = arg0;
		this.anInt4754 = arg1;
		this.aClass4_Sub20Array1 = new Class4_Sub20[this.anInt4754];
		this.anIntArrayArrayArray5 = new int[this.anInt4749][3][arg2];
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)[[I")
	public int[][] method3679(@OriginalArg(1) int arg0) {
		if (this.anInt4749 == this.anInt4754) {
			this.aBoolean437 = this.aClass4_Sub20Array1[arg0] == null;
			this.aClass4_Sub20Array1[arg0] = Static366.aClass4_Sub20_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt4749 == 1) {
			this.aBoolean437 = this.anInt4753 != arg0;
			this.anInt4753 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(72) Class4_Sub20 local72 = this.aClass4_Sub20Array1[arg0];
			if (local72 == null) {
				this.aBoolean437 = true;
				if (this.anInt4747 >= this.anInt4749) {
					@Pc(97) Class4_Sub20 local97 = (Class4_Sub20) this.aClass183_33.method4139();
					local72 = new Class4_Sub20(arg0, local97.anInt2616);
					this.aClass4_Sub20Array1[local97.anInt2614] = null;
					local97.method5684();
				} else {
					local72 = new Class4_Sub20(arg0, this.anInt4747);
					this.anInt4747++;
				}
				this.aClass4_Sub20Array1[arg0] = local72;
			} else {
				this.aBoolean437 = false;
			}
			this.aClass183_33.method4133(local72);
			return this.anIntArrayArrayArray5[local72.anInt2616];
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)[[[I")
	public int[][][] method3680() {
		if (this.anInt4749 != this.anInt4754) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4749; local21++) {
			this.aClass4_Sub20Array1[local21] = Static366.aClass4_Sub20_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
	public void method3683() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4749; local7++) {
			this.anIntArrayArrayArray5[local7][0] = null;
			this.anIntArrayArrayArray5[local7][1] = null;
			this.anIntArrayArrayArray5[local7][2] = null;
			this.anIntArrayArrayArray5[local7] = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.aClass4_Sub20Array1 = null;
		this.aClass183_33.method4138();
		this.aClass183_33 = null;
	}
}
