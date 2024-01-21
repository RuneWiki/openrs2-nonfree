import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class62 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
	public static int[] anIntArray283 = new int[256];

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	private int anInt2678 = -1;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	private int anInt2682 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!cf;")
	private Class12 aClass12_9 = new Class12();

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private final int anInt2689;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[Lclient!wg;")
	private Class2_Sub25[] aClass2_Sub25Array1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	private final int anInt2679;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray283[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2689 = arg1;
		this.anIntArrayArrayArray7 = new int[arg0][3][arg2];
		this.aClass2_Sub25Array1 = new Class2_Sub25[arg1];
		this.anInt2679 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
	public int[][] method1904(@OriginalArg(1) int arg0) {
		if (this.anInt2679 == this.anInt2689) {
			this.aBoolean118 = this.aClass2_Sub25Array1[arg0] == null;
			this.aClass2_Sub25Array1[arg0] = Static79.aClass2_Sub25_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt2679 == 1) {
			this.aBoolean118 = this.anInt2678 != arg0;
			this.anInt2678 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(48) Class2_Sub25 local48 = this.aClass2_Sub25Array1[arg0];
			if (this.aBoolean118 = local48 == null) {
				if (this.anInt2679 <= this.anInt2682) {
					@Pc(72) Class2_Sub25 local72 = (Class2_Sub25) this.aClass12_9.method380();
					local48 = new Class2_Sub25(arg0, local72.anInt3810);
					this.aClass2_Sub25Array1[local72.anInt3811] = null;
					local72.method2705();
				} else {
					local48 = new Class2_Sub25(arg0, this.anInt2682);
					this.anInt2682++;
				}
				this.aClass2_Sub25Array1[arg0] = local48;
			}
			this.aClass12_9.method388(local48);
			return this.anIntArrayArrayArray7[local48.anInt3810];
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public void method1906() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2679; local13++) {
			this.anIntArrayArrayArray7[local13][0] = null;
			this.anIntArrayArrayArray7[local13][1] = null;
			this.anIntArrayArrayArray7[local13][2] = null;
			this.anIntArrayArrayArray7[local13] = null;
		}
		this.aClass2_Sub25Array1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass12_9.method386();
		this.aClass12_9 = null;
	}
}
