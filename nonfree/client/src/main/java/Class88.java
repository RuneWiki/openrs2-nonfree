import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class88 {

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	private int anInt2727 = 0;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	private int anInt2729 = -1;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!wq;")
	private Class216 aClass216_27 = new Class216();

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	private final int anInt2725;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	private final int anInt2721;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[Lclient!tk;")
	private Class2_Sub40[] aClass2_Sub40Array1;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2725 = arg0;
		this.anInt2721 = arg1;
		this.aClass2_Sub40Array1 = new Class2_Sub40[this.anInt2721];
		this.anIntArrayArrayArray4 = new int[this.anInt2725][3][arg2];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)[[[I")
	public int[][][] method2626() {
		if (this.anInt2721 != this.anInt2725) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2725; local21++) {
			this.aClass2_Sub40Array1[local21] = Static188.aClass2_Sub40_2;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public void method2628() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2725; local11++) {
			this.anIntArrayArrayArray4[local11][0] = null;
			this.anIntArrayArrayArray4[local11][1] = null;
			this.anIntArrayArrayArray4[local11][2] = null;
			this.anIntArrayArrayArray4[local11] = null;
		}
		this.aClass2_Sub40Array1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass216_27.method5991();
		this.aClass216_27 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[[I")
	public int[][] method2632(@OriginalArg(1) int arg0) {
		if (this.anInt2721 == this.anInt2725) {
			this.aBoolean238 = this.aClass2_Sub40Array1[arg0] == null;
			this.aClass2_Sub40Array1[arg0] = Static188.aClass2_Sub40_2;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt2725 == 1) {
			this.aBoolean238 = this.anInt2729 != arg0;
			this.anInt2729 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(70) Class2_Sub40 local70 = this.aClass2_Sub40Array1[arg0];
			if (local70 == null) {
				this.aBoolean238 = true;
				if (this.anInt2727 < this.anInt2725) {
					local70 = new Class2_Sub40(arg0, this.anInt2727);
					this.anInt2727++;
				} else {
					@Pc(101) Class2_Sub40 local101 = (Class2_Sub40) this.aClass216_27.method5996();
					local70 = new Class2_Sub40(arg0, local101.anInt6136);
					this.aClass2_Sub40Array1[local101.anInt6139] = null;
					local101.method5945();
				}
				this.aClass2_Sub40Array1[arg0] = local70;
			} else {
				this.aBoolean238 = false;
			}
			this.aClass216_27.method5997(local70);
			return this.anIntArrayArrayArray4[local70.anInt6136];
		}
	}
}
