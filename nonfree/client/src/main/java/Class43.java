import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class43 {

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	private int anInt1809 = -1;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private int anInt1804 = 0;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!tf;")
	private Class81 aClass81_6 = new Class81();

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	private final int anInt1813;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	private final int anInt1810;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "[Lclient!jg;")
	private Class2_Sub17[] aClass2_Sub17Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1813 = arg1;
		this.anIntArrayArrayArray3 = new int[arg0][3][arg2];
		this.anInt1810 = arg0;
		this.aClass2_Sub17Array1 = new Class2_Sub17[arg1];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[[I")
	public int[][] method1439(@OriginalArg(1) int arg0) {
		if (this.anInt1813 == this.anInt1810) {
			this.aBoolean77 = this.aClass2_Sub17Array1[arg0] == null;
			this.aClass2_Sub17Array1[arg0] = Static113.aClass2_Sub17_1;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt1810 == 1) {
			this.aBoolean77 = arg0 != this.anInt1809;
			this.anInt1809 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(46) Class2_Sub17 local46 = this.aClass2_Sub17Array1[arg0];
			if (this.aBoolean77 = local46 == null) {
				if (this.anInt1804 >= this.anInt1810) {
					@Pc(70) Class2_Sub17 local70 = (Class2_Sub17) this.aClass81_6.method2678();
					local46 = new Class2_Sub17(arg0, local70.anInt1797);
					this.aClass2_Sub17Array1[local70.anInt1794] = null;
					local70.method3007();
				} else {
					local46 = new Class2_Sub17(arg0, this.anInt1804);
					this.anInt1804++;
				}
				this.aClass2_Sub17Array1[arg0] = local46;
			}
			this.aClass81_6.method2679(local46);
			return this.anIntArrayArrayArray3[local46.anInt1797];
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)[[[I")
	public int[][][] method1443() {
		if (this.anInt1813 != this.anInt1810) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1810; local25++) {
			this.aClass2_Sub17Array1[local25] = Static113.aClass2_Sub17_1;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method1444() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1810; local7++) {
			this.anIntArrayArrayArray3[local7][0] = null;
			this.anIntArrayArrayArray3[local7][1] = null;
			this.anIntArrayArrayArray3[local7][2] = null;
			this.anIntArrayArrayArray3[local7] = null;
		}
		this.aClass2_Sub17Array1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass81_6.method2689();
		this.aClass81_6 = null;
	}
}
