import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class48 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	private int anInt2069 = 0;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	private int anInt2075 = -1;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Lclient!nd;")
	private Class59 aClass59_5 = new Class59();

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private final int anInt2071;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	private final int anInt2072;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lclient!q;")
	private Class3_Sub18[] aClass3_Sub18Array1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2071 = arg1;
		this.anInt2072 = arg0;
		this.anIntArrayArrayArray4 = new int[arg0][3][arg2];
		this.aClass3_Sub18Array1 = new Class3_Sub18[arg1];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public void method1400() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2072; local3++) {
			this.anIntArrayArrayArray4[local3][0] = null;
			this.anIntArrayArrayArray4[local3][1] = null;
			this.anIntArrayArrayArray4[local3][2] = null;
			this.anIntArrayArrayArray4[local3] = null;
		}
		this.aClass3_Sub18Array1 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass59_5.method1741();
		this.aClass59_5 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
	public int[][] method1402(@OriginalArg(1) int arg0) {
		if (this.anInt2072 == this.anInt2071) {
			this.aBoolean87 = this.aClass3_Sub18Array1[arg0] == null;
			this.aClass3_Sub18Array1[arg0] = Static106.aClass3_Sub18_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt2072 == 1) {
			this.aBoolean87 = this.anInt2075 != arg0;
			this.anInt2075 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(66) Class3_Sub18 local66 = this.aClass3_Sub18Array1[arg0];
			if (this.aBoolean87 = local66 == null) {
				if (this.anInt2072 > this.anInt2069) {
					local66 = new Class3_Sub18(arg0, this.anInt2069);
					this.anInt2069++;
				} else {
					@Pc(105) Class3_Sub18 local105 = (Class3_Sub18) this.aClass59_5.method1737();
					local66 = new Class3_Sub18(arg0, local105.anInt3031);
					this.aClass3_Sub18Array1[local105.anInt3030] = null;
					local105.method2900();
				}
				this.aClass3_Sub18Array1[arg0] = local66;
			}
			this.aClass59_5.method1738(local66);
			return this.anIntArrayArrayArray4[local66.anInt3031];
		}
	}
}
