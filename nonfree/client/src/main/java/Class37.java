import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class37 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	private int anInt1485 = -1;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	private int anInt1489 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!vb;")
	private Class120 aClass120_7 = new Class120();

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	private int anInt1477;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
	private int anInt1487;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "[Lclient!td;")
	private Class1_Sub28[] aClass1_Sub28Array1;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(III)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1477 = arg0;
		this.anInt1487 = arg1;
		this.aClass1_Sub28Array1 = new Class1_Sub28[this.anInt1487];
		this.anIntArrayArray20 = new int[this.anInt1477][arg2];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method1162() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1477; local3++) {
			this.anIntArrayArray20[local3] = null;
		}
		this.anIntArrayArray20 = null;
		this.aClass1_Sub28Array1 = null;
		this.aClass120_7.method3560();
		this.aClass120_7 = null;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)[[I")
	public int[][] method1165() {
		if (this.anInt1487 != this.anInt1477) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1477; local22++) {
			this.aClass1_Sub28Array1[local22] = Static150.aClass1_Sub28_1;
		}
		return this.anIntArrayArray20;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[I")
	public int[] method1168(@OriginalArg(1) int arg0) {
		if (this.anInt1477 == this.anInt1487) {
			this.aBoolean131 = this.aClass1_Sub28Array1[arg0] == null;
			this.aClass1_Sub28Array1[arg0] = Static150.aClass1_Sub28_1;
			return this.anIntArrayArray20[arg0];
		} else if (this.anInt1477 == 1) {
			this.aBoolean131 = arg0 != this.anInt1485;
			this.anInt1485 = arg0;
			return this.anIntArrayArray20[0];
		} else {
			@Pc(67) Class1_Sub28 local67 = this.aClass1_Sub28Array1[arg0];
			if (local67 == null) {
				this.aBoolean131 = true;
				if (this.anInt1477 <= this.anInt1489) {
					@Pc(88) Class1_Sub28 local88 = (Class1_Sub28) this.aClass120_7.method3563();
					local67 = new Class1_Sub28(arg0, local88.anInt4359);
					this.aClass1_Sub28Array1[local88.anInt4357] = null;
					local88.method3735();
				} else {
					local67 = new Class1_Sub28(arg0, this.anInt1489);
					this.anInt1489++;
				}
				this.aClass1_Sub28Array1[arg0] = local67;
			} else {
				this.aBoolean131 = false;
			}
			this.aClass120_7.method3571(local67);
			return this.anIntArrayArray20[local67.anInt4359];
		}
	}
}
