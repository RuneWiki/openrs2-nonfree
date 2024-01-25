import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class61 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	private int anInt2066 = 0;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	private int anInt2070 = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!um;")
	private Class244 aClass244_11 = new Class244();

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private final int anInt2073;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[Lclient!pl;")
	private Class6_Sub29[] aClass6_Sub29Array1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2073 = arg0;
		this.anInt2069 = arg1;
		this.anIntArrayArray11 = new int[this.anInt2073][arg2];
		this.aClass6_Sub29Array1 = new Class6_Sub29[this.anInt2069];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public void method1606() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2073; local7++) {
			this.anIntArrayArray11[local7] = null;
		}
		this.anIntArrayArray11 = null;
		this.aClass6_Sub29Array1 = null;
		this.aClass244_11.method5969();
		this.aClass244_11 = null;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[[I")
	public int[][] method1607() {
		if (this.anInt2073 != this.anInt2069) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2073; local17++) {
			this.aClass6_Sub29Array1[local17] = Static270.aClass6_Sub29_1;
		}
		return this.anIntArrayArray11;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	public int[] method1611(@OriginalArg(0) int arg0) {
		if (this.anInt2069 == this.anInt2073) {
			this.aBoolean142 = this.aClass6_Sub29Array1[arg0] == null;
			this.aClass6_Sub29Array1[arg0] = Static270.aClass6_Sub29_1;
			return this.anIntArrayArray11[arg0];
		} else if (this.anInt2073 == 1) {
			this.aBoolean142 = this.anInt2070 != arg0;
			this.anInt2070 = arg0;
			return this.anIntArrayArray11[0];
		} else {
			@Pc(71) Class6_Sub29 local71 = this.aClass6_Sub29Array1[arg0];
			if (local71 == null) {
				this.aBoolean142 = true;
				if (this.anInt2073 > this.anInt2066) {
					local71 = new Class6_Sub29(arg0, this.anInt2066);
					this.anInt2066++;
				} else {
					@Pc(111) Class6_Sub29 local111 = (Class6_Sub29) this.aClass244_11.method5974();
					local71 = new Class6_Sub29(arg0, local111.anInt5401);
					this.aClass6_Sub29Array1[local111.anInt5402] = null;
					local111.method6525();
				}
				this.aClass6_Sub29Array1[arg0] = local71;
			} else {
				this.aBoolean142 = false;
			}
			this.aClass244_11.method5972(local71);
			return this.anIntArrayArray11[local71.anInt5401];
		}
	}
}
