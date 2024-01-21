import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class75 {

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	private int anInt2847 = -1;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	private int anInt2853 = 0;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!cf;")
	private Class20 aClass20_17 = new Class20();

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	private final int anInt2854;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	private final int anInt2849;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "[Lclient!bd;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(III)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2854 = arg0;
		this.anIntArrayArrayArray5 = new int[this.anInt2854][3][arg2];
		this.anInt2849 = arg1;
		this.aClass1_Sub2Array1 = new Class1_Sub2[this.anInt2849];
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public void method2100() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2854; local3++) {
			this.anIntArrayArrayArray5[local3][0] = null;
			this.anIntArrayArrayArray5[local3][1] = null;
			this.anIntArrayArrayArray5[local3][2] = null;
			this.anIntArrayArrayArray5[local3] = null;
		}
		this.aClass1_Sub2Array1 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass20_17.method469();
		this.aClass20_17 = null;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)[[[I")
	public int[][][] method2103() {
		if (this.anInt2854 != this.anInt2849) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2854; local21++) {
			this.aClass1_Sub2Array1[local21] = Static203.aClass1_Sub2_1;
		}
		return this.anIntArrayArrayArray5;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[[I")
	public int[][] method2104(@OriginalArg(1) int arg0) {
		if (this.anInt2849 == this.anInt2854) {
			this.aBoolean166 = this.aClass1_Sub2Array1[arg0] == null;
			this.aClass1_Sub2Array1[arg0] = Static203.aClass1_Sub2_1;
			return this.anIntArrayArrayArray5[arg0];
		} else if (this.anInt2854 == 1) {
			this.aBoolean166 = arg0 != this.anInt2847;
			this.anInt2847 = arg0;
			return this.anIntArrayArrayArray5[0];
		} else {
			@Pc(44) Class1_Sub2 local44 = this.aClass1_Sub2Array1[arg0];
			if (local44 == null) {
				this.aBoolean166 = true;
				if (this.anInt2853 >= this.anInt2854) {
					@Pc(65) Class1_Sub2 local65 = (Class1_Sub2) this.aClass20_17.method477();
					local44 = new Class1_Sub2(arg0, local65.anInt379);
					this.aClass1_Sub2Array1[local65.anInt383] = null;
					local65.method3414();
				} else {
					local44 = new Class1_Sub2(arg0, this.anInt2853);
					this.anInt2853++;
				}
				this.aClass1_Sub2Array1[arg0] = local44;
			} else {
				this.aBoolean166 = false;
			}
			this.aClass20_17.method471(local44);
			return this.anIntArrayArrayArray5[local44.anInt379];
		}
	}
}
