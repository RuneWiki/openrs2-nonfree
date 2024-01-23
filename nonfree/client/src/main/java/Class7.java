import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	private int anInt127 = -1;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	private int anInt133 = 0;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!gj;")
	private Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[Lclient!fj;")
	private Class1_Sub15[] aClass1_Sub15Array1;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt129 = arg1;
		this.anInt128 = arg0;
		this.aClass1_Sub15Array1 = new Class1_Sub15[this.anInt129];
		this.anIntArrayArray1 = new int[this.anInt128][arg2];
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)[[I")
	public int[][] method112() {
		if (this.anInt128 != this.anInt129) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt128; local25++) {
			this.aClass1_Sub15Array1[local25] = Static181.aClass1_Sub15_1;
		}
		return this.anIntArrayArray1;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	public void method115() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt128; local3++) {
			this.anIntArrayArray1[local3] = null;
		}
		this.anIntArrayArray1 = null;
		this.aClass1_Sub15Array1 = null;
		this.aClass59_1.method1703();
		this.aClass59_1 = null;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
	public int[] method116(@OriginalArg(0) int arg0) {
		if (this.anInt129 == this.anInt128) {
			this.aBoolean4 = this.aClass1_Sub15Array1[arg0] == null;
			this.aClass1_Sub15Array1[arg0] = Static181.aClass1_Sub15_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt128 == 1) {
			this.aBoolean4 = this.anInt127 != arg0;
			this.anInt127 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(47) Class1_Sub15 local47 = this.aClass1_Sub15Array1[arg0];
			if (local47 == null) {
				this.aBoolean4 = true;
				if (this.anInt133 >= this.anInt128) {
					@Pc(72) Class1_Sub15 local72 = (Class1_Sub15) this.aClass59_1.method1708();
					local47 = new Class1_Sub15(arg0, local72.anInt1634);
					this.aClass1_Sub15Array1[local72.anInt1636] = null;
					local72.method4779();
				} else {
					local47 = new Class1_Sub15(arg0, this.anInt133);
					this.anInt133++;
				}
				this.aClass1_Sub15Array1[arg0] = local47;
			} else {
				this.aBoolean4 = false;
			}
			this.aClass59_1.method1702(local47);
			return this.anIntArrayArray1[local47.anInt1634];
		}
	}
}
