import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class70 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private int anInt2205 = -1;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!qg;")
	private Class131 aClass131_5 = new Class131();

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	private int anInt2203;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	private int anInt2204;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[Lclient!id;")
	private Class1_Sub15[] aClass1_Sub15Array1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(III)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2203 = arg1;
		this.anInt2204 = arg0;
		this.anIntArrayArrayArray8 = new int[this.anInt2204][3][arg2];
		this.aClass1_Sub15Array1 = new Class1_Sub15[this.anInt2203];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)[[[I")
	public int[][][] method1658() {
		if (this.anInt2203 != this.anInt2204) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt2204; local24++) {
			this.aClass1_Sub15Array1[local24] = Static22.aClass1_Sub15_1;
		}
		return this.anIntArrayArrayArray8;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public void method1661() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2204; local3++) {
			this.anIntArrayArrayArray8[local3][0] = null;
			this.anIntArrayArrayArray8[local3][1] = null;
			this.anIntArrayArrayArray8[local3][2] = null;
			this.anIntArrayArrayArray8[local3] = null;
		}
		this.aClass1_Sub15Array1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass131_5.method3795();
		this.aClass131_5 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1662(@OriginalArg(1) int arg0) {
		if (this.anInt2203 == this.anInt2204) {
			this.aBoolean118 = this.aClass1_Sub15Array1[arg0] == null;
			this.aClass1_Sub15Array1[arg0] = Static22.aClass1_Sub15_1;
			return this.anIntArrayArrayArray8[arg0];
		} else if (this.anInt2204 == 1) {
			this.aBoolean118 = arg0 != this.anInt2205;
			this.anInt2205 = arg0;
			return this.anIntArrayArrayArray8[0];
		} else {
			@Pc(51) Class1_Sub15 local51 = this.aClass1_Sub15Array1[arg0];
			if (local51 == null) {
				this.aBoolean118 = true;
				if (this.anInt2204 <= this.anInt2199) {
					@Pc(73) Class1_Sub15 local73 = (Class1_Sub15) this.aClass131_5.method3786();
					local51 = new Class1_Sub15(arg0, local73.anInt2413);
					this.aClass1_Sub15Array1[local73.anInt2418] = null;
					local73.method4742();
				} else {
					local51 = new Class1_Sub15(arg0, this.anInt2199);
					this.anInt2199++;
				}
				this.aClass1_Sub15Array1[arg0] = local51;
			} else {
				this.aBoolean118 = false;
			}
			this.aClass131_5.method3793(local51);
			return this.anIntArrayArrayArray8[local51.anInt2413];
		}
	}
}
