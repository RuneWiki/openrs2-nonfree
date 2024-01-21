import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class40 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	private int anInt2147 = 0;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt2158 = -1;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Lclient!th;")
	private Class82 aClass82_7 = new Class82();

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	private final int anInt2149;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	private final int anInt2150;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[Lclient!q;")
	private Class1_Sub17[] aClass1_Sub17Array1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(III)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2149 = arg0;
		this.anIntArrayArrayArray3 = new int[arg0][3][arg2];
		this.anInt2150 = arg1;
		this.aClass1_Sub17Array1 = new Class1_Sub17[arg1];
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public void method1585() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2149; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.anIntArrayArrayArray3 = null;
		this.aClass1_Sub17Array1 = null;
		this.aClass82_7.method2847();
		this.aClass82_7 = null;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)[[[I")
	public int[][][] method1588() {
		if (this.anInt2150 != this.anInt2149) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2149; local26++) {
			this.aClass1_Sub17Array1[local26] = Static93.aClass1_Sub17_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[[I")
	public int[][] method1589(@OriginalArg(1) int arg0) {
		if (this.anInt2149 == this.anInt2150) {
			this.aBoolean168 = this.aClass1_Sub17Array1[arg0] == null;
			this.aClass1_Sub17Array1[arg0] = Static93.aClass1_Sub17_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt2149 == 1) {
			this.aBoolean168 = this.anInt2158 != arg0;
			this.anInt2158 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(65) Class1_Sub17 local65 = this.aClass1_Sub17Array1[arg0];
			if (this.aBoolean168 = local65 == null) {
				if (this.anInt2149 <= this.anInt2147) {
					@Pc(89) Class1_Sub17 local89 = (Class1_Sub17) this.aClass82_7.method2858();
					local65 = new Class1_Sub17(arg0, local89.anInt3395);
					this.aClass1_Sub17Array1[local89.anInt3393] = null;
					local89.method3056();
				} else {
					local65 = new Class1_Sub17(arg0, this.anInt2147);
					this.anInt2147++;
				}
				this.aClass1_Sub17Array1[arg0] = local65;
			}
			this.aClass82_7.method2856(local65);
			return this.anIntArrayArrayArray3[local65.anInt3395];
		}
	}
}
