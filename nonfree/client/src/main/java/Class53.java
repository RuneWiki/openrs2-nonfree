import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class53 {

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	private int anInt2083 = -1;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private int anInt2084 = 0;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!h;")
	private Class30 aClass30_12 = new Class30();

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private final int anInt2077;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private final int anInt2078;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[Lclient!mb;")
	private Class1_Sub19[] aClass1_Sub19Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2077 = arg1;
		this.anInt2078 = arg0;
		this.aClass1_Sub19Array1 = new Class1_Sub19[arg1];
		this.anIntArrayArrayArray2 = new int[arg0][3][arg2];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1588() {
		if (this.anInt2077 != this.anInt2078) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt2078; local22++) {
			this.aClass1_Sub19Array1[local22] = Static77.aClass1_Sub19_1;
		}
		return this.anIntArrayArrayArray2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
	public int[][] method1591(@OriginalArg(0) int arg0) {
		if (this.anInt2078 == this.anInt2077) {
			this.aBoolean90 = this.aClass1_Sub19Array1[arg0] == null;
			this.aClass1_Sub19Array1[arg0] = Static77.aClass1_Sub19_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt2078 == 1) {
			this.aBoolean90 = this.anInt2083 != arg0;
			this.anInt2083 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(31) Class1_Sub19 local31 = this.aClass1_Sub19Array1[arg0];
			if (this.aBoolean90 = local31 == null) {
				if (this.anInt2084 < this.anInt2078) {
					local31 = new Class1_Sub19(arg0, this.anInt2084);
					this.anInt2084++;
				} else {
					@Pc(70) Class1_Sub19 local70 = (Class1_Sub19) this.aClass30_12.method1123();
					local31 = new Class1_Sub19(arg0, local70.anInt2263);
					this.aClass1_Sub19Array1[local70.anInt2260] = null;
					local70.method3134();
				}
				this.aClass1_Sub19Array1[arg0] = local31;
			}
			this.aClass30_12.method1114(local31);
			return this.anIntArrayArrayArray2[local31.anInt2263];
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public void method1594() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2078; local7++) {
			this.anIntArrayArrayArray2[local7][0] = null;
			this.anIntArrayArrayArray2[local7][1] = null;
			this.anIntArrayArrayArray2[local7][2] = null;
			this.anIntArrayArrayArray2[local7] = null;
		}
		this.aClass1_Sub19Array1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass30_12.method1118();
		this.aClass30_12 = null;
	}
}
