import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class39 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private int anInt1912 = -1;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	private int anInt1920 = 0;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!v;")
	private Class91 aClass91_5 = new Class91();

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
	private final int anInt1917;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private final int anInt1916;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[Lclient!hf;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1917 = arg0;
		this.anInt1916 = arg1;
		this.anIntArrayArrayArray2 = new int[this.anInt1917][3][arg2];
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt1916];
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method1377() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt1917; local10++) {
			this.anIntArrayArrayArray2[local10][0] = null;
			this.anIntArrayArrayArray2[local10][1] = null;
			this.anIntArrayArrayArray2[local10][2] = null;
			this.anIntArrayArrayArray2[local10] = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.aClass1_Sub9Array1 = null;
		this.aClass91_5.method3147();
		this.aClass91_5 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)[[[I")
	public int[][][] method1378() {
		if (this.anInt1916 != this.anInt1917) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt1917; local23++) {
			this.aClass1_Sub9Array1[local23] = Static176.aClass1_Sub9_1;
		}
		return this.anIntArrayArrayArray2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[[I")
	public int[][] method1383(@OriginalArg(0) int arg0) {
		if (this.anInt1917 == this.anInt1916) {
			this.aBoolean82 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Static176.aClass1_Sub9_1;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt1917 == 1) {
			this.aBoolean82 = this.anInt1912 != arg0;
			this.anInt1912 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(51) Class1_Sub9 local51 = this.aClass1_Sub9Array1[arg0];
			if (local51 == null) {
				this.aBoolean82 = true;
				if (this.anInt1920 < this.anInt1917) {
					local51 = new Class1_Sub9(arg0, this.anInt1920);
					this.anInt1920++;
				} else {
					@Pc(84) Class1_Sub9 local84 = (Class1_Sub9) this.aClass91_5.method3149();
					local51 = new Class1_Sub9(arg0, local84.anInt1797);
					this.aClass1_Sub9Array1[local84.anInt1798] = null;
					local84.method3295();
				}
				this.aClass1_Sub9Array1[arg0] = local51;
			} else {
				this.aBoolean82 = false;
			}
			this.aClass91_5.method3146(local51);
			return this.anIntArrayArrayArray2[local51.anInt1797];
		}
	}
}
