import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class85 {

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	private int anInt2802 = -1;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	private int anInt2805 = 0;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!hga;")
	private Class130 aClass130_10 = new Class130();

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	private final int anInt2803;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	private final int anInt2801;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "[Lclient!ab;")
	private Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(III)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2803 = arg1;
		this.anInt2801 = arg0;
		this.aClass3_Sub2Array1 = new Class3_Sub2[this.anInt2803];
		this.anIntArrayArray20 = new int[this.anInt2801][arg2];
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public void method2545() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2801; local11++) {
			this.anIntArrayArray20[local11] = null;
		}
		this.aClass3_Sub2Array1 = null;
		this.anIntArrayArray20 = null;
		this.aClass130_10.method3541();
		this.aClass130_10 = null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[[I")
	public int[][] method2547() {
		if (this.anInt2801 != this.anInt2803) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2801; local25++) {
			this.aClass3_Sub2Array1[local25] = Static303.aClass3_Sub2_1;
		}
		return this.anIntArrayArray20;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
	public int[] method2548(@OriginalArg(0) int arg0) {
		if (this.anInt2801 == this.anInt2803) {
			this.aBoolean239 = this.aClass3_Sub2Array1[arg0] == null;
			this.aClass3_Sub2Array1[arg0] = Static303.aClass3_Sub2_1;
			return this.anIntArrayArray20[arg0];
		} else if (this.anInt2801 == 1) {
			this.aBoolean239 = arg0 != this.anInt2802;
			this.anInt2802 = arg0;
			return this.anIntArrayArray20[0];
		} else {
			@Pc(49) Class3_Sub2 local49 = this.aClass3_Sub2Array1[arg0];
			if (local49 == null) {
				this.aBoolean239 = true;
				if (this.anInt2801 <= this.anInt2805) {
					@Pc(69) Class3_Sub2 local69 = (Class3_Sub2) this.aClass130_10.method3540();
					local49 = new Class3_Sub2(arg0, local69.anInt59);
					this.aClass3_Sub2Array1[local69.anInt61] = null;
					local69.method7812();
				} else {
					local49 = new Class3_Sub2(arg0, this.anInt2805);
					this.anInt2805++;
				}
				this.aClass3_Sub2Array1[arg0] = local49;
			} else {
				this.aBoolean239 = false;
			}
			this.aClass130_10.method3547(local49);
			return this.anIntArrayArray20[local49.anInt59];
		}
	}
}
