import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class35 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	private int anInt2239 = -1;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	private int anInt2243 = 0;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!pg;")
	private Class59 aClass59_35 = new Class59();

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	private final int anInt2236;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "[Lclient!mg;")
	private Class1_Sub15[] aClass1_Sub15Array1;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	private final int anInt2238;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(III)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2236 = arg1;
		this.aClass1_Sub15Array1 = new Class1_Sub15[arg1];
		this.anInt2238 = arg0;
		this.anIntArrayArrayArray2 = new int[arg0][3][arg2];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1569(@OriginalArg(1) int arg0) {
		if (this.anInt2238 == this.anInt2236) {
			this.aBoolean89 = this.aClass1_Sub15Array1[arg0] == null;
			this.aClass1_Sub15Array1[arg0] = Static32.aClass1_Sub15_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt2238 == 1) {
			this.aBoolean89 = arg0 != this.anInt2239;
			this.anInt2239 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(42) Class1_Sub15 local42 = this.aClass1_Sub15Array1[arg0];
			if (this.aBoolean89 = local42 == null) {
				if (this.anInt2243 < this.anInt2238) {
					local42 = new Class1_Sub15(arg0, this.anInt2243);
					this.anInt2243++;
				} else {
					@Pc(77) Class1_Sub15 local77 = (Class1_Sub15) this.aClass59_35.method2419();
					local42 = new Class1_Sub15(arg0, local77.anInt3022);
					this.aClass1_Sub15Array1[local77.anInt3020] = null;
					local77.method3198();
				}
				this.aClass1_Sub15Array1[arg0] = local42;
			}
			this.aClass59_35.method2412(local42);
			return this.anIntArrayArrayArray2[local42.anInt3022];
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method1572() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2238; local13++) {
			this.anIntArrayArrayArray2[local13][0] = null;
			this.anIntArrayArrayArray2[local13][1] = null;
			this.anIntArrayArrayArray2[local13][2] = null;
			this.anIntArrayArrayArray2[local13] = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass1_Sub15Array1 = null;
		this.aClass59_35.method2416();
		this.aClass59_35 = null;
	}
}
