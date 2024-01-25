import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class170 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	private int anInt4052 = 0;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private int anInt4059 = -1;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!cf;")
	private Class30 aClass30_33 = new Class30();

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	private final int anInt4053;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	private final int anInt4065;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lclient!om;")
	private Class2_Sub32[] aClass2_Sub32Array1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4053 = arg1;
		this.anInt4065 = arg0;
		this.anIntArrayArrayArray11 = new int[this.anInt4065][3][arg2];
		this.aClass2_Sub32Array1 = new Class2_Sub32[this.anInt4053];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method3730() {
		if (this.anInt4053 != this.anInt4065) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4065; local21++) {
			this.aClass2_Sub32Array1[local21] = Static82.aClass2_Sub32_1;
		}
		return this.anIntArrayArrayArray11;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method3734() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4065; local11++) {
			this.anIntArrayArrayArray11[local11][0] = null;
			this.anIntArrayArrayArray11[local11][1] = null;
			this.anIntArrayArrayArray11[local11][2] = null;
			this.anIntArrayArrayArray11[local11] = null;
		}
		this.aClass2_Sub32Array1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass30_33.method692();
		this.aClass30_33 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[[I")
	public int[][] method3736(@OriginalArg(1) int arg0) {
		if (this.anInt4065 == this.anInt4053) {
			this.aBoolean309 = this.aClass2_Sub32Array1[arg0] == null;
			this.aClass2_Sub32Array1[arg0] = Static82.aClass2_Sub32_1;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt4065 == 1) {
			this.aBoolean309 = this.anInt4059 != arg0;
			this.anInt4059 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(46) Class2_Sub32 local46 = this.aClass2_Sub32Array1[arg0];
			if (local46 == null) {
				this.aBoolean309 = true;
				if (this.anInt4065 <= this.anInt4052) {
					@Pc(62) Class2_Sub32 local62 = (Class2_Sub32) this.aClass30_33.method696();
					local46 = new Class2_Sub32(arg0, local62.anInt4446);
					this.aClass2_Sub32Array1[local62.anInt4445] = null;
					local62.method5617();
				} else {
					local46 = new Class2_Sub32(arg0, this.anInt4052);
					this.anInt4052++;
				}
				this.aClass2_Sub32Array1[arg0] = local46;
			} else {
				this.aBoolean309 = false;
			}
			this.aClass30_33.method693(local46);
			return this.anIntArrayArrayArray11[local46.anInt4446];
		}
	}
}
