import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class99 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	private int anInt4540 = 0;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	private int anInt4544 = -1;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!wi;")
	private Class108 aClass108_18 = new Class108();

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	private int anInt4546;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[Lclient!od;")
	private Class2_Sub19[] aClass2_Sub19Array1;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	private int anInt4541;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4546 = arg1;
		this.aClass2_Sub19Array1 = new Class2_Sub19[this.anInt4546];
		this.anInt4541 = arg0;
		this.anIntArrayArrayArray20 = new int[this.anInt4541][3][arg2];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public void method3144() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4541; local7++) {
			this.anIntArrayArrayArray20[local7][0] = null;
			this.anIntArrayArrayArray20[local7][1] = null;
			this.anIntArrayArrayArray20[local7][2] = null;
			this.anIntArrayArrayArray20[local7] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass2_Sub19Array1 = null;
		this.aClass108_18.method3328();
		this.aClass108_18 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method3150() {
		if (this.anInt4541 != this.anInt4546) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(30) int local30 = 0; local30 < this.anInt4541; local30++) {
			this.aClass2_Sub19Array1[local30] = Static61.aClass2_Sub19_1;
		}
		return this.anIntArrayArrayArray20;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I")
	public int[][] method3152(@OriginalArg(1) int arg0) {
		if (this.anInt4541 == this.anInt4546) {
			this.aBoolean280 = this.aClass2_Sub19Array1[arg0] == null;
			this.aClass2_Sub19Array1[arg0] = Static61.aClass2_Sub19_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt4541 == 1) {
			this.aBoolean280 = arg0 != this.anInt4544;
			this.anInt4544 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(61) Class2_Sub19 local61 = this.aClass2_Sub19Array1[arg0];
			if (local61 == null) {
				this.aBoolean280 = true;
				if (this.anInt4541 > this.anInt4540) {
					local61 = new Class2_Sub19(arg0, this.anInt4540);
					this.anInt4540++;
				} else {
					@Pc(97) Class2_Sub19 local97 = (Class2_Sub19) this.aClass108_18.method3324();
					local61 = new Class2_Sub19(arg0, local97.anInt3248);
					this.aClass2_Sub19Array1[local97.anInt3251] = null;
					local97.method3314();
				}
				this.aClass2_Sub19Array1[arg0] = local61;
			} else {
				this.aBoolean280 = false;
			}
			this.aClass108_18.method3327(local61);
			return this.anIntArrayArrayArray20[local61.anInt3248];
		}
	}
}
