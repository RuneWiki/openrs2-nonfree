import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class207 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt6584 = 0;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt6589 = -1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!mk;")
	private Class130 aClass130_148 = new Class130();

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Z")
	public boolean aBoolean572 = false;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	private final int anInt6581;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private final int anInt6588;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lclient!wf;")
	private Class4_Sub42[] aClass4_Sub42Array1;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6581 = arg1;
		this.anInt6588 = arg0;
		this.aClass4_Sub42Array1 = new Class4_Sub42[this.anInt6581];
		this.anIntArrayArray61 = new int[this.anInt6588][arg2];
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)[[I")
	public int[][] method5468() {
		if (this.anInt6581 != this.anInt6588) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6588; local17++) {
			this.aClass4_Sub42Array1[local17] = Static319.aClass4_Sub42_1;
		}
		return this.anIntArrayArray61;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method5469() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6588; local7++) {
			this.anIntArrayArray61[local7] = null;
		}
		this.anIntArrayArray61 = null;
		this.aClass4_Sub42Array1 = null;
		this.aClass130_148.method3514();
		this.aClass130_148 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	public int[] method5470(@OriginalArg(0) int arg0) {
		if (this.anInt6581 == this.anInt6588) {
			this.aBoolean572 = this.aClass4_Sub42Array1[arg0] == null;
			this.aClass4_Sub42Array1[arg0] = Static319.aClass4_Sub42_1;
			return this.anIntArrayArray61[arg0];
		} else if (this.anInt6588 == 1) {
			this.aBoolean572 = arg0 != this.anInt6589;
			this.anInt6589 = arg0;
			return this.anIntArrayArray61[0];
		} else {
			@Pc(46) Class4_Sub42 local46 = this.aClass4_Sub42Array1[arg0];
			if (local46 == null) {
				this.aBoolean572 = true;
				if (this.anInt6584 < this.anInt6588) {
					local46 = new Class4_Sub42(arg0, this.anInt6584);
					this.anInt6584++;
				} else {
					@Pc(82) Class4_Sub42 local82 = (Class4_Sub42) this.aClass130_148.method3506();
					local46 = new Class4_Sub42(arg0, local82.anInt6782);
					this.aClass4_Sub42Array1[local82.anInt6785] = null;
					local82.method5667();
				}
				this.aClass4_Sub42Array1[arg0] = local46;
			} else {
				this.aBoolean572 = false;
			}
			this.aClass130_148.method3505(local46);
			return this.anIntArrayArray61[local46.anInt6782];
		}
	}
}
