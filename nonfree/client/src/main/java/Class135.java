import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class135 {

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	private int anInt3548 = -1;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
	private int anInt3547 = 0;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "Lclient!v;")
	private Class362 aClass362_19 = new Class362();

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
	private final int anInt3540;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
	private final int anInt3542;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "[Lclient!cc;")
	private Class6_Sub9[] aClass6_Sub9Array1;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(III)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3540 = arg0;
		this.anInt3542 = arg1;
		this.aClass6_Sub9Array1 = new Class6_Sub9[this.anInt3542];
		this.anIntArrayArray18 = new int[this.anInt3540][arg2];
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
	public int[] method3057(@OriginalArg(0) int arg0) {
		if (this.anInt3542 == this.anInt3540) {
			this.aBoolean210 = this.aClass6_Sub9Array1[arg0] == null;
			this.aClass6_Sub9Array1[arg0] = Static445.aClass6_Sub9_1;
			return this.anIntArrayArray18[arg0];
		} else if (this.anInt3540 == 1) {
			this.aBoolean210 = arg0 != this.anInt3548;
			this.anInt3548 = arg0;
			return this.anIntArrayArray18[0];
		} else {
			@Pc(46) Class6_Sub9 local46 = this.aClass6_Sub9Array1[arg0];
			if (local46 == null) {
				this.aBoolean210 = true;
				if (this.anInt3540 <= this.anInt3547) {
					@Pc(67) Class6_Sub9 local67 = (Class6_Sub9) this.aClass362_19.method8542();
					local46 = new Class6_Sub9(arg0, local67.anInt1206);
					this.aClass6_Sub9Array1[local67.anInt1202] = null;
					local67.method9174();
				} else {
					local46 = new Class6_Sub9(arg0, this.anInt3547);
					this.anInt3547++;
				}
				this.aClass6_Sub9Array1[arg0] = local46;
			} else {
				this.aBoolean210 = false;
			}
			this.aClass362_19.method8539(local46);
			return this.anIntArrayArray18[local46.anInt1206];
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public void method3059() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3540; local7++) {
			this.anIntArrayArray18[local7] = null;
		}
		this.anIntArrayArray18 = null;
		this.aClass6_Sub9Array1 = null;
		this.aClass362_19.method8543();
		this.aClass362_19 = null;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)[[I")
	public int[][] method3063() {
		if (this.anInt3540 != this.anInt3542) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt3540; local26++) {
			this.aClass6_Sub9Array1[local26] = Static445.aClass6_Sub9_1;
		}
		return this.anIntArrayArray18;
	}
}
