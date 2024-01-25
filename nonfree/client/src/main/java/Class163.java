import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class163 {

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
	private int anInt3995 = -1;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	private int anInt4000 = 0;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!ub;")
	private Class244 aClass244_18 = new Class244();

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
	private final int anInt3996;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
	private final int anInt3999;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "[Lclient!nh;")
	private Class4_Sub27[] aClass4_Sub27Array1;

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(III)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3996 = arg0;
		this.anInt3999 = arg1;
		this.aClass4_Sub27Array1 = new Class4_Sub27[this.anInt3999];
		this.anIntArrayArrayArray6 = new int[this.anInt3996][3][arg2];
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)[[[I")
	public int[][][] method3179() {
		if (this.anInt3996 != this.anInt3999) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3996; local21++) {
			this.aClass4_Sub27Array1[local21] = Static409.aClass4_Sub27_1;
		}
		return this.anIntArrayArrayArray6;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I")
	public int[][] method3181(@OriginalArg(1) int arg0) {
		if (this.anInt3996 == this.anInt3999) {
			this.aBoolean296 = this.aClass4_Sub27Array1[arg0] == null;
			this.aClass4_Sub27Array1[arg0] = Static409.aClass4_Sub27_1;
			return this.anIntArrayArrayArray6[arg0];
		} else if (this.anInt3996 == 1) {
			this.aBoolean296 = arg0 != this.anInt3995;
			this.anInt3995 = arg0;
			return this.anIntArrayArrayArray6[0];
		} else {
			@Pc(61) Class4_Sub27 local61 = this.aClass4_Sub27Array1[arg0];
			if (local61 == null) {
				this.aBoolean296 = true;
				if (this.anInt4000 < this.anInt3996) {
					local61 = new Class4_Sub27(arg0, this.anInt4000);
					this.anInt4000++;
				} else {
					@Pc(101) Class4_Sub27 local101 = (Class4_Sub27) this.aClass244_18.method5267();
					local61 = new Class4_Sub27(arg0, local101.anInt4361);
					this.aClass4_Sub27Array1[local101.anInt4360] = null;
					local101.method6059();
				}
				this.aClass4_Sub27Array1[arg0] = local61;
			} else {
				this.aBoolean296 = false;
			}
			this.aClass244_18.method5274(local61);
			return this.anIntArrayArrayArray6[local61.anInt4361];
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public void method3182() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3996; local11++) {
			this.anIntArrayArrayArray6[local11][0] = null;
			this.anIntArrayArrayArray6[local11][1] = null;
			this.anIntArrayArrayArray6[local11][2] = null;
			this.anIntArrayArrayArray6[local11] = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.aClass4_Sub27Array1 = null;
		this.aClass244_18.method5264();
		this.aClass244_18 = null;
	}
}
