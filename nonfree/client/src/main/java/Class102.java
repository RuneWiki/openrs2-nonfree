import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class102 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	private int anInt4291 = -1;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	private int anInt4293 = 0;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!db;")
	private Class19 aClass19_16 = new Class19();

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	private int anInt4286;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "[Lclient!j;")
	private Class1_Sub15[] aClass1_Sub15Array1;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	private int anInt4284;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4286 = arg1;
		this.aClass1_Sub15Array1 = new Class1_Sub15[this.anInt4286];
		this.anInt4284 = arg0;
		this.anIntArrayArray67 = new int[this.anInt4284][arg2];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[I")
	public int[] method3129(@OriginalArg(1) int arg0) {
		if (this.anInt4284 == this.anInt4286) {
			this.aBoolean239 = this.aClass1_Sub15Array1[arg0] == null;
			this.aClass1_Sub15Array1[arg0] = Static32.aClass1_Sub15_1;
			return this.anIntArrayArray67[arg0];
		} else if (this.anInt4284 == 1) {
			this.aBoolean239 = this.anInt4291 != arg0;
			this.anInt4291 = arg0;
			return this.anIntArrayArray67[0];
		} else {
			@Pc(63) Class1_Sub15 local63 = this.aClass1_Sub15Array1[arg0];
			if (local63 == null) {
				this.aBoolean239 = true;
				if (this.anInt4293 >= this.anInt4284) {
					@Pc(84) Class1_Sub15 local84 = (Class1_Sub15) this.aClass19_16.method613();
					local63 = new Class1_Sub15(arg0, local84.anInt2070);
					this.aClass1_Sub15Array1[local84.anInt2068] = null;
					local84.method3530();
				} else {
					local63 = new Class1_Sub15(arg0, this.anInt4293);
					this.anInt4293++;
				}
				this.aClass1_Sub15Array1[arg0] = local63;
			} else {
				this.aBoolean239 = false;
			}
			this.aClass19_16.method618(local63);
			return this.anIntArrayArray67[local63.anInt2070];
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)[[I")
	public int[][] method3131() {
		if (this.anInt4286 != this.anInt4284) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4284; local17++) {
			this.aClass1_Sub15Array1[local17] = Static32.aClass1_Sub15_1;
		}
		return this.anIntArrayArray67;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public void method3132() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4284; local11++) {
			this.anIntArrayArray67[local11] = null;
		}
		this.anIntArrayArray67 = null;
		this.aClass1_Sub15Array1 = null;
		this.aClass19_16.method619();
		this.aClass19_16 = null;
	}
}
