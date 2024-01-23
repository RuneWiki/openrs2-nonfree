import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class65 {

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	private int anInt1756 = -1;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	private int anInt1754 = 0;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "Lclient!bo;")
	private Class24 aClass24_15 = new Class24();

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	private int anInt1751;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "[Lclient!sk;")
	private Class1_Sub28[] aClass1_Sub28Array1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V")
	public Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1750 = arg0;
		this.anInt1751 = arg1;
		this.anIntArrayArray9 = new int[this.anInt1750][arg2];
		this.aClass1_Sub28Array1 = new Class1_Sub28[this.anInt1751];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method1364() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1750; local3++) {
			this.anIntArrayArray9[local3] = null;
		}
		this.anIntArrayArray9 = null;
		this.aClass1_Sub28Array1 = null;
		this.aClass24_15.method462();
		this.aClass24_15 = null;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)[[I")
	public int[][] method1365() {
		if (this.anInt1751 != this.anInt1750) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt1750; local27++) {
			this.aClass1_Sub28Array1[local27] = Static21.aClass1_Sub28_1;
		}
		return this.anIntArrayArray9;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
	public int[] method1368(@OriginalArg(1) int arg0) {
		if (this.anInt1750 == this.anInt1751) {
			this.aBoolean137 = this.aClass1_Sub28Array1[arg0] == null;
			this.aClass1_Sub28Array1[arg0] = Static21.aClass1_Sub28_1;
			return this.anIntArrayArray9[arg0];
		} else if (this.anInt1750 == 1) {
			this.aBoolean137 = this.anInt1756 != arg0;
			this.anInt1756 = arg0;
			return this.anIntArrayArray9[0];
		} else {
			@Pc(55) Class1_Sub28 local55 = this.aClass1_Sub28Array1[arg0];
			if (local55 == null) {
				this.aBoolean137 = true;
				if (this.anInt1754 < this.anInt1750) {
					local55 = new Class1_Sub28(arg0, this.anInt1754);
					this.anInt1754++;
				} else {
					@Pc(87) Class1_Sub28 local87 = (Class1_Sub28) this.aClass24_15.method461();
					local55 = new Class1_Sub28(arg0, local87.anInt5028);
					this.aClass1_Sub28Array1[local87.anInt5025] = null;
					local87.method4616();
				}
				this.aClass1_Sub28Array1[arg0] = local55;
			} else {
				this.aBoolean137 = false;
			}
			this.aClass24_15.method466(local55);
			return this.anIntArrayArray9[local55.anInt5028];
		}
	}
}
