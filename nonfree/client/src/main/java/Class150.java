import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class150 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	private int anInt4780 = -1;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	private int anInt4781 = 0;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Lclient!a;")
	private Class1 aClass1_23 = new Class1();

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int anInt4785;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
	private int anInt4788;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[Lclient!wd;")
	private Class2_Sub32[] aClass2_Sub32Array1;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4785 = arg1;
		this.anInt4788 = arg0;
		this.aClass2_Sub32Array1 = new Class2_Sub32[this.anInt4785];
		this.anIntArrayArrayArray12 = new int[this.anInt4788][3][arg2];
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public void method3893() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4788; local7++) {
			this.anIntArrayArrayArray12[local7][0] = null;
			this.anIntArrayArrayArray12[local7][1] = null;
			this.anIntArrayArrayArray12[local7][2] = null;
			this.anIntArrayArrayArray12[local7] = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass2_Sub32Array1 = null;
		this.aClass1_23.method10();
		this.aClass1_23 = null;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[[I")
	public int[][] method3894(@OriginalArg(0) int arg0) {
		if (this.anInt4785 == this.anInt4788) {
			this.aBoolean405 = this.aClass2_Sub32Array1[arg0] == null;
			this.aClass2_Sub32Array1[arg0] = Static210.aClass2_Sub32_1;
			return this.anIntArrayArrayArray12[arg0];
		} else if (this.anInt4788 == 1) {
			this.aBoolean405 = arg0 != this.anInt4780;
			this.anInt4780 = arg0;
			return this.anIntArrayArrayArray12[0];
		} else {
			@Pc(29) Class2_Sub32 local29 = this.aClass2_Sub32Array1[arg0];
			if (local29 == null) {
				this.aBoolean405 = true;
				if (this.anInt4781 >= this.anInt4788) {
					@Pc(45) Class2_Sub32 local45 = (Class2_Sub32) this.aClass1_23.method4();
					local29 = new Class2_Sub32(arg0, local45.anInt6012);
					this.aClass2_Sub32Array1[local45.anInt6016] = null;
					local45.method4926();
				} else {
					local29 = new Class2_Sub32(arg0, this.anInt4781);
					this.anInt4781++;
				}
				this.aClass2_Sub32Array1[arg0] = local29;
			} else {
				this.aBoolean405 = false;
			}
			this.aClass1_23.method8(local29);
			return this.anIntArrayArrayArray12[local29.anInt6012];
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)[[[I")
	public int[][][] method3896() {
		if (this.anInt4785 != this.anInt4788) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt4788; local24++) {
			this.aClass2_Sub32Array1[local24] = Static210.aClass2_Sub32_1;
		}
		return this.anIntArrayArrayArray12;
	}
}
