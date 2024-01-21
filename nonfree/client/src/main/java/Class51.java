import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class51 {

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	private int anInt2137 = -1;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	private int anInt2138 = 0;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!tf;")
	private Class81 aClass81_8 = new Class81();

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lclient!hd;")
	private Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	private final int anInt2134;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	private final int anInt2139;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray22 = new int[arg0][arg2];
		this.aClass2_Sub10Array1 = new Class2_Sub10[arg1];
		this.anInt2134 = arg1;
		this.anInt2139 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)[[I")
	public int[][] method1728() {
		if (this.anInt2134 != this.anInt2139) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt2139; local21++) {
			this.aClass2_Sub10Array1[local21] = Static92.aClass2_Sub10_1;
		}
		return this.anIntArrayArray22;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
	public int[] method1730(@OriginalArg(1) int arg0) {
		if (this.anInt2139 == this.anInt2134) {
			this.aBoolean89 = this.aClass2_Sub10Array1[arg0] == null;
			this.aClass2_Sub10Array1[arg0] = Static92.aClass2_Sub10_1;
			return this.anIntArrayArray22[arg0];
		} else if (this.anInt2139 == 1) {
			this.aBoolean89 = this.anInt2137 != arg0;
			this.anInt2137 = arg0;
			return this.anIntArrayArray22[0];
		} else {
			@Pc(42) Class2_Sub10 local42 = this.aClass2_Sub10Array1[arg0];
			if (this.aBoolean89 = local42 == null) {
				if (this.anInt2139 > this.anInt2138) {
					local42 = new Class2_Sub10(arg0, this.anInt2138);
					this.anInt2138++;
				} else {
					@Pc(83) Class2_Sub10 local83 = (Class2_Sub10) this.aClass81_8.method2678();
					local42 = new Class2_Sub10(arg0, local83.anInt1402);
					this.aClass2_Sub10Array1[local83.anInt1403] = null;
					local83.method3007();
				}
				this.aClass2_Sub10Array1[arg0] = local42;
			}
			this.aClass81_8.method2679(local42);
			return this.anIntArrayArray22[local42.anInt1402];
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public void method1732() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2139; local7++) {
			this.anIntArrayArray22[local7] = null;
		}
		this.aClass2_Sub10Array1 = null;
		this.anIntArrayArray22 = null;
		this.aClass81_8.method2689();
		this.aClass81_8 = null;
	}
}
