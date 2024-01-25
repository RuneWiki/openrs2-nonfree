import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class68 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
	private int anInt2262 = 0;

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
	private int anInt2264 = -1;

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Lclient!fh;")
	private Class114 aClass114_10 = new Class114();

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
	private final int anInt2268;

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
	private final int anInt2265;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "[Lclient!bw;")
	private Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(III)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2268 = arg1;
		this.anInt2265 = arg0;
		this.aClass2_Sub10Array1 = new Class2_Sub10[this.anInt2268];
		this.anIntArrayArrayArray1 = new int[this.anInt2265][3][arg2];
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)[[I")
	public int[][] method1901(@OriginalArg(1) int arg0) {
		if (this.anInt2265 == this.anInt2268) {
			this.aBoolean188 = this.aClass2_Sub10Array1[arg0] == null;
			this.aClass2_Sub10Array1[arg0] = Static52.aClass2_Sub10_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt2265 == 1) {
			this.aBoolean188 = this.anInt2264 != arg0;
			this.anInt2264 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(51) Class2_Sub10 local51 = this.aClass2_Sub10Array1[arg0];
			if (local51 == null) {
				this.aBoolean188 = true;
				if (this.anInt2265 > this.anInt2262) {
					local51 = new Class2_Sub10(arg0, this.anInt2262);
					this.anInt2262++;
				} else {
					@Pc(88) Class2_Sub10 local88 = (Class2_Sub10) this.aClass114_10.method2758();
					local51 = new Class2_Sub10(arg0, local88.anInt1425);
					this.aClass2_Sub10Array1[local88.anInt1422] = null;
					local88.method8920();
				}
				this.aClass2_Sub10Array1[arg0] = local51;
			} else {
				this.aBoolean188 = false;
			}
			this.aClass114_10.method2759(local51);
			return this.anIntArrayArrayArray1[local51.anInt1425];
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public void method1902() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2265; local11++) {
			this.anIntArrayArrayArray1[local11][0] = null;
			this.anIntArrayArrayArray1[local11][1] = null;
			this.anIntArrayArrayArray1[local11][2] = null;
			this.anIntArrayArrayArray1[local11] = null;
		}
		this.aClass2_Sub10Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass114_10.method2768();
		this.aClass114_10 = null;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)[[[I")
	public int[][][] method1903() {
		if (this.anInt2265 != this.anInt2268) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2265; local25++) {
			this.aClass2_Sub10Array1[local25] = Static52.aClass2_Sub10_1;
		}
		return this.anIntArrayArrayArray1;
	}
}
