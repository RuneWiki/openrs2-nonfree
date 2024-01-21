import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class57 {

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	private int anInt3323 = -1;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	private int anInt3321 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!pi;")
	private Class67 aClass67_6 = new Class67();

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	private final int anInt3327;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	private final int anInt3319;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[Lclient!rf;")
	private Class2_Sub21[] aClass2_Sub21Array1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3327 = arg0;
		this.anIntArrayArray22 = new int[this.anInt3327][arg2];
		this.anInt3319 = arg1;
		this.aClass2_Sub21Array1 = new Class2_Sub21[this.anInt3319];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	public int[] method2569(@OriginalArg(0) int arg0) {
		if (this.anInt3319 == this.anInt3327) {
			this.aBoolean122 = this.aClass2_Sub21Array1[arg0] == null;
			this.aClass2_Sub21Array1[arg0] = Static47.aClass2_Sub21_2;
			return this.anIntArrayArray22[arg0];
		} else if (this.anInt3327 == 1) {
			this.aBoolean122 = this.anInt3323 != arg0;
			this.anInt3323 = arg0;
			return this.anIntArrayArray22[0];
		} else {
			@Pc(51) Class2_Sub21 local51 = this.aClass2_Sub21Array1[arg0];
			if (local51 == null) {
				this.aBoolean122 = true;
				if (this.anInt3327 > this.anInt3321) {
					local51 = new Class2_Sub21(arg0, this.anInt3321);
					this.anInt3321++;
				} else {
					@Pc(82) Class2_Sub21 local82 = (Class2_Sub21) this.aClass67_6.method2849();
					local51 = new Class2_Sub21(arg0, local82.anInt4011);
					this.aClass2_Sub21Array1[local82.anInt4004] = null;
					local82.method3556();
				}
				this.aClass2_Sub21Array1[arg0] = local51;
			} else {
				this.aBoolean122 = false;
			}
			this.aClass67_6.method2845(local51);
			return this.anIntArrayArray22[local51.anInt4011];
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public void method2570() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3327; local3++) {
			this.anIntArrayArray22[local3] = null;
		}
		this.anIntArrayArray22 = null;
		this.aClass2_Sub21Array1 = null;
		this.aClass67_6.method2847();
		this.aClass67_6 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)[[I")
	public int[][] method2572() {
		if (this.anInt3319 != this.anInt3327) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt3327; local23++) {
			this.aClass2_Sub21Array1[local23] = Static47.aClass2_Sub21_2;
		}
		return this.anIntArrayArray22;
	}
}
