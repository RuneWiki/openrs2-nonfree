import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class104 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	private int anInt3067 = 0;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	private int anInt3068 = -1;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!fea;")
	private Class99 aClass99_23 = new Class99();

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	private final int anInt3070;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	private final int anInt3072;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "[Lclient!ge;")
	private Class5_Sub20[] aClass5_Sub20Array1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(III)V")
	public Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3070 = arg0;
		this.anInt3072 = arg1;
		this.anIntArrayArray21 = new int[this.anInt3070][arg2];
		this.aClass5_Sub20Array1 = new Class5_Sub20[this.anInt3072];
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I")
	public int[] method2752(@OriginalArg(1) int arg0) {
		if (this.anInt3070 == this.anInt3072) {
			this.aBoolean203 = this.aClass5_Sub20Array1[arg0] == null;
			this.aClass5_Sub20Array1[arg0] = Static334.aClass5_Sub20_3;
			return this.anIntArrayArray21[arg0];
		} else if (this.anInt3070 == 1) {
			this.aBoolean203 = this.anInt3068 != arg0;
			this.anInt3068 = arg0;
			return this.anIntArrayArray21[0];
		} else {
			@Pc(49) Class5_Sub20 local49 = this.aClass5_Sub20Array1[arg0];
			if (local49 == null) {
				this.aBoolean203 = true;
				if (this.anInt3070 <= this.anInt3067) {
					@Pc(69) Class5_Sub20 local69 = (Class5_Sub20) this.aClass99_23.method2527();
					local49 = new Class5_Sub20(arg0, local69.anInt3190);
					this.aClass5_Sub20Array1[local69.anInt3189] = null;
					local69.method7425();
				} else {
					local49 = new Class5_Sub20(arg0, this.anInt3067);
					this.anInt3067++;
				}
				this.aClass5_Sub20Array1[arg0] = local49;
			} else {
				this.aBoolean203 = false;
			}
			this.aClass99_23.method2514(local49);
			return this.anIntArrayArray21[local49.anInt3190];
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public void method2753() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3070; local3++) {
			this.anIntArrayArray21[local3] = null;
		}
		this.aClass5_Sub20Array1 = null;
		this.anIntArrayArray21 = null;
		this.aClass99_23.method2524();
		this.aClass99_23 = null;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)[[I")
	public int[][] method2754() {
		if (this.anInt3072 != this.anInt3070) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt3070; local22++) {
			this.aClass5_Sub20Array1[local22] = Static334.aClass5_Sub20_3;
		}
		return this.anIntArrayArray21;
	}
}
