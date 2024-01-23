import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class25 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	private int anInt884 = -1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	private int anInt887 = 0;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!en;")
	private Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[Lclient!gg;")
	private Class2_Sub15[] aClass2_Sub15Array1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt891 = arg0;
		this.anIntArrayArrayArray2 = new int[this.anInt891][3][arg2];
		this.anInt886 = arg1;
		this.aClass2_Sub15Array1 = new Class2_Sub15[this.anInt886];
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[[I")
	public int[][] method652(@OriginalArg(0) int arg0) {
		if (this.anInt886 == this.anInt891) {
			this.aBoolean53 = this.aClass2_Sub15Array1[arg0] == null;
			this.aClass2_Sub15Array1[arg0] = Static234.aClass2_Sub15_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt891 == 1) {
			this.aBoolean53 = arg0 != this.anInt884;
			this.anInt884 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(53) Class2_Sub15 local53 = this.aClass2_Sub15Array1[arg0];
			if (local53 == null) {
				this.aBoolean53 = true;
				if (this.anInt891 <= this.anInt887) {
					@Pc(79) Class2_Sub15 local79 = (Class2_Sub15) this.aClass44_1.method1350();
					local53 = new Class2_Sub15(arg0, local79.anInt2279);
					this.aClass2_Sub15Array1[local79.anInt2278] = null;
					local79.method4743();
				} else {
					local53 = new Class2_Sub15(arg0, this.anInt887);
					this.anInt887++;
				}
				this.aClass2_Sub15Array1[arg0] = local53;
			} else {
				this.aBoolean53 = false;
			}
			this.aClass44_1.method1355(local53);
			return this.anIntArrayArrayArray2[local53.anInt2279];
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method656() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt891; local10++) {
			this.anIntArrayArrayArray2[local10][0] = null;
			this.anIntArrayArrayArray2[local10][1] = null;
			this.anIntArrayArrayArray2[local10][2] = null;
			this.anIntArrayArrayArray2[local10] = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass2_Sub15Array1 = null;
		this.aClass44_1.method1361();
		this.aClass44_1 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method657() {
		if (this.anInt886 != this.anInt891) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt891; local24++) {
			this.aClass2_Sub15Array1[local24] = Static234.aClass2_Sub15_1;
		}
		return this.anIntArrayArrayArray2;
	}
}
