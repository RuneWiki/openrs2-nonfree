import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class174 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	private int anInt4116 = -1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	private int anInt4121 = 0;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "Lclient!cga;")
	private Class60 aClass60_85 = new Class60();

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	private final int anInt4119;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
	private final int anInt4123;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "[Lclient!wo;")
	private Class2_Sub58[] aClass2_Sub58Array1;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(III)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4119 = arg0;
		this.anInt4123 = arg1;
		this.aClass2_Sub58Array1 = new Class2_Sub58[this.anInt4123];
		this.anIntArrayArray30 = new int[this.anInt4119][arg2];
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public void method3747() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4119; local7++) {
			this.anIntArrayArray30[local7] = null;
		}
		this.aClass2_Sub58Array1 = null;
		this.anIntArrayArray30 = null;
		this.aClass60_85.method1223();
		this.aClass60_85 = null;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)[I")
	public int[] method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			Static265.aBoolean368 = true;
		}
		if (this.anInt4119 == this.anInt4123) {
			this.aBoolean369 = this.aClass2_Sub58Array1[arg0] == null;
			this.aClass2_Sub58Array1[arg0] = Static719.aClass2_Sub58_1;
			return this.anIntArrayArray30[arg0];
		} else if (this.anInt4119 == 1) {
			this.aBoolean369 = arg0 != this.anInt4116;
			this.anInt4116 = arg0;
			return this.anIntArrayArray30[0];
		} else {
			@Pc(48) Class2_Sub58 local48 = this.aClass2_Sub58Array1[arg0];
			if (local48 == null) {
				this.aBoolean369 = true;
				if (this.anInt4121 >= this.anInt4119) {
					@Pc(77) Class2_Sub58 local77 = (Class2_Sub58) this.aClass60_85.method1227();
					local48 = new Class2_Sub58(arg0, local77.anInt10977);
					this.aClass2_Sub58Array1[local77.anInt10976] = null;
					local77.method9872();
				} else {
					local48 = new Class2_Sub58(arg0, this.anInt4121);
					this.anInt4121++;
				}
				this.aClass2_Sub58Array1[arg0] = local48;
			} else {
				this.aBoolean369 = false;
			}
			this.aClass60_85.method1234(local48);
			return this.anIntArrayArray30[local48.anInt10977];
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)[[I")
	public int[][] method3749() {
		if (this.anInt4123 != this.anInt4119) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt4119; local20++) {
			this.aClass2_Sub58Array1[local20] = Static719.aClass2_Sub58_1;
		}
		if (false) {
			this.method3748(13, -26);
		}
		return this.anIntArrayArray30;
	}
}
