import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class56 {

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
	private int anInt2039 = 0;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	private int anInt2037 = -1;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!hi;")
	private Class61 aClass61_4 = new Class61();

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	private int anInt2034;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[Lclient!l;")
	private Class1_Sub19[] aClass1_Sub19Array1;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2034 = arg1;
		this.aClass1_Sub19Array1 = new Class1_Sub19[this.anInt2034];
		this.anInt2031 = arg0;
		this.anIntArrayArrayArray4 = new int[this.anInt2031][3][arg2];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)[[[I")
	public int[][][] method1594() {
		if (this.anInt2031 != this.anInt2034) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2031; local17++) {
			this.aClass1_Sub19Array1[local17] = Static243.aClass1_Sub19_1;
		}
		return this.anIntArrayArrayArray4;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[[I")
	public int[][] method1596(@OriginalArg(0) int arg0) {
		if (this.anInt2031 == this.anInt2034) {
			this.aBoolean144 = this.aClass1_Sub19Array1[arg0] == null;
			this.aClass1_Sub19Array1[arg0] = Static243.aClass1_Sub19_1;
			return this.anIntArrayArrayArray4[arg0];
		} else if (this.anInt2031 == 1) {
			this.aBoolean144 = arg0 != this.anInt2037;
			this.anInt2037 = arg0;
			return this.anIntArrayArrayArray4[0];
		} else {
			@Pc(49) Class1_Sub19 local49 = this.aClass1_Sub19Array1[arg0];
			if (local49 == null) {
				this.aBoolean144 = true;
				if (this.anInt2039 < this.anInt2031) {
					local49 = new Class1_Sub19(arg0, this.anInt2039);
					this.anInt2039++;
				} else {
					@Pc(92) Class1_Sub19 local92 = (Class1_Sub19) this.aClass61_4.method1838();
					local49 = new Class1_Sub19(arg0, local92.anInt3175);
					this.aClass1_Sub19Array1[local92.anInt3172] = null;
					local92.method4441();
				}
				this.aClass1_Sub19Array1[arg0] = local49;
			} else {
				this.aBoolean144 = false;
			}
			this.aClass61_4.method1843(local49);
			return this.anIntArrayArrayArray4[local49.anInt3175];
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public void method1597() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2031; local7++) {
			this.anIntArrayArrayArray4[local7][0] = null;
			this.anIntArrayArrayArray4[local7][1] = null;
			this.anIntArrayArrayArray4[local7][2] = null;
			this.anIntArrayArrayArray4[local7] = null;
		}
		this.anIntArrayArrayArray4 = null;
		this.aClass1_Sub19Array1 = null;
		this.aClass61_4.method1845();
		this.aClass61_4 = null;
	}
}
