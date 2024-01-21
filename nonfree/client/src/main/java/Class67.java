import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class67 {

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	private int anInt2767 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	private int anInt2763 = -1;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!bd;")
	private Class10 aClass10_73 = new Class10();

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	private final int anInt2775;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
	private final int anInt2774;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[Lclient!ji;")
	private Class3_Sub15[] aClass3_Sub15Array1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2775 = arg0;
		this.anInt2774 = arg1;
		this.anIntArrayArrayArray11 = new int[this.anInt2775][3][arg2];
		this.aClass3_Sub15Array1 = new Class3_Sub15[this.anInt2774];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I")
	public int[][] method1940(@OriginalArg(0) int arg0) {
		if (this.anInt2774 == this.anInt2775) {
			this.aBoolean135 = this.aClass3_Sub15Array1[arg0] == null;
			this.aClass3_Sub15Array1[arg0] = Static81.aClass3_Sub15_1;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt2775 == 1) {
			this.aBoolean135 = arg0 != this.anInt2763;
			this.anInt2763 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(48) Class3_Sub15 local48 = this.aClass3_Sub15Array1[arg0];
			if (local48 == null) {
				this.aBoolean135 = true;
				if (this.anInt2775 > this.anInt2767) {
					local48 = new Class3_Sub15(arg0, this.anInt2767);
					this.anInt2767++;
				} else {
					@Pc(83) Class3_Sub15 local83 = (Class3_Sub15) this.aClass10_73.method257();
					local48 = new Class3_Sub15(arg0, local83.anInt2090);
					this.aClass3_Sub15Array1[local83.anInt2084] = null;
					local83.method3320();
				}
				this.aClass3_Sub15Array1[arg0] = local48;
			} else {
				this.aBoolean135 = false;
			}
			this.aClass10_73.method265(local48);
			return this.anIntArrayArrayArray11[local48.anInt2090];
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public void method1944() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2775; local7++) {
			this.anIntArrayArrayArray11[local7][0] = null;
			this.anIntArrayArrayArray11[local7][1] = null;
			this.anIntArrayArrayArray11[local7][2] = null;
			this.anIntArrayArrayArray11[local7] = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.aClass3_Sub15Array1 = null;
		this.aClass10_73.method262();
		this.aClass10_73 = null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)[[[I")
	public int[][][] method1946() {
		if (this.anInt2774 != this.anInt2775) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2775; local17++) {
			this.aClass3_Sub15Array1[local17] = Static81.aClass3_Sub15_1;
		}
		return this.anIntArrayArrayArray11;
	}
}
