import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class168 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	private int anInt5367 = -1;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	private int anInt5372 = 0;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!fk;")
	private Class56 aClass56_26 = new Class56();

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
	public boolean aBoolean373 = false;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	private int anInt5373;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "[Lclient!i;")
	private Class3_Sub14[] aClass3_Sub14Array1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5369 = arg0;
		this.anInt5373 = arg1;
		this.anIntArrayArray72 = new int[this.anInt5369][arg2];
		this.aClass3_Sub14Array1 = new Class3_Sub14[this.anInt5373];
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)[[I")
	public int[][] method4361() {
		if (this.anInt5373 != this.anInt5369) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt5369; local28++) {
			this.aClass3_Sub14Array1[local28] = Static310.aClass3_Sub14_1;
		}
		return this.anIntArrayArray72;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	public int[] method4366(@OriginalArg(0) int arg0) {
		if (this.anInt5373 == this.anInt5369) {
			this.aBoolean373 = this.aClass3_Sub14Array1[arg0] == null;
			this.aClass3_Sub14Array1[arg0] = Static310.aClass3_Sub14_1;
			return this.anIntArrayArray72[arg0];
		} else if (this.anInt5369 == 1) {
			this.aBoolean373 = arg0 != this.anInt5367;
			this.anInt5367 = arg0;
			return this.anIntArrayArray72[0];
		} else {
			@Pc(54) Class3_Sub14 local54 = this.aClass3_Sub14Array1[arg0];
			if (local54 == null) {
				this.aBoolean373 = true;
				if (this.anInt5372 >= this.anInt5369) {
					@Pc(75) Class3_Sub14 local75 = (Class3_Sub14) this.aClass56_26.method1275();
					local54 = new Class3_Sub14(arg0, local75.anInt2096);
					this.aClass3_Sub14Array1[local75.anInt2098] = null;
					local75.method5013();
				} else {
					local54 = new Class3_Sub14(arg0, this.anInt5372);
					this.anInt5372++;
				}
				this.aClass3_Sub14Array1[arg0] = local54;
			} else {
				this.aBoolean373 = false;
			}
			this.aClass56_26.method1274(local54);
			return this.anIntArrayArray72[local54.anInt2096];
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
	public void method4368() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5369; local15++) {
			this.anIntArrayArray72[local15] = null;
		}
		this.anIntArrayArray72 = null;
		this.aClass3_Sub14Array1 = null;
		this.aClass56_26.method1270();
		this.aClass56_26 = null;
	}
}
