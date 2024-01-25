import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class160 {

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	private int anInt5202 = 0;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	private int anInt5200 = -1;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!mk;")
	private Class130 aClass130_113 = new Class130();

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	private final int anInt5205;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	private final int anInt5203;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "[Lclient!un;")
	private Class4_Sub40[] aClass4_Sub40Array1;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(III)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5205 = arg1;
		this.anInt5203 = arg0;
		this.aClass4_Sub40Array1 = new Class4_Sub40[this.anInt5205];
		this.anIntArrayArrayArray15 = new int[this.anInt5203][3][arg2];
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)[[I")
	public int[][] method4316(@OriginalArg(1) int arg0) {
		if (this.anInt5203 == this.anInt5205) {
			this.aBoolean441 = this.aClass4_Sub40Array1[arg0] == null;
			this.aClass4_Sub40Array1[arg0] = Static290.aClass4_Sub40_1;
			return this.anIntArrayArrayArray15[arg0];
		} else if (this.anInt5203 == 1) {
			this.aBoolean441 = this.anInt5200 != arg0;
			this.anInt5200 = arg0;
			return this.anIntArrayArrayArray15[0];
		} else {
			@Pc(53) Class4_Sub40 local53 = this.aClass4_Sub40Array1[arg0];
			if (local53 == null) {
				this.aBoolean441 = true;
				if (this.anInt5203 > this.anInt5202) {
					local53 = new Class4_Sub40(arg0, this.anInt5202);
					this.anInt5202++;
				} else {
					@Pc(84) Class4_Sub40 local84 = (Class4_Sub40) this.aClass130_113.method3506();
					local53 = new Class4_Sub40(arg0, local84.anInt6419);
					this.aClass4_Sub40Array1[local84.anInt6417] = null;
					local84.method5667();
				}
				this.aClass4_Sub40Array1[arg0] = local53;
			} else {
				this.aBoolean441 = false;
			}
			this.aClass130_113.method3505(local53);
			return this.anIntArrayArrayArray15[local53.anInt6419];
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method4317() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5203; local7++) {
			this.anIntArrayArrayArray15[local7][0] = null;
			this.anIntArrayArrayArray15[local7][1] = null;
			this.anIntArrayArrayArray15[local7][2] = null;
			this.anIntArrayArrayArray15[local7] = null;
		}
		this.aClass4_Sub40Array1 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass130_113.method3514();
		this.aClass130_113 = null;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)[[[I")
	public int[][][] method4319() {
		if (this.anInt5205 != this.anInt5203) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5203; local25++) {
			this.aClass4_Sub40Array1[local25] = Static290.aClass4_Sub40_1;
		}
		return this.anIntArrayArrayArray15;
	}
}
