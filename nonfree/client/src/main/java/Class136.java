import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class136 {

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	private int anInt4219 = -1;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	private int anInt4221 = 0;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Lclient!a;")
	private Class1 aClass1_15 = new Class1();

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Z")
	public boolean aBoolean349 = false;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	private int anInt4215;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	private int anInt4214;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lclient!ac;")
	private Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(III)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4215 = arg0;
		this.anIntArrayArray40 = new int[this.anInt4215][arg2];
		this.anInt4214 = arg1;
		this.aClass2_Sub2Array1 = new Class2_Sub2[this.anInt4214];
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public void method3405() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4215; local3++) {
			this.anIntArrayArray40[local3] = null;
		}
		this.anIntArrayArray40 = null;
		this.aClass2_Sub2Array1 = null;
		this.aClass1_15.method10();
		this.aClass1_15 = null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)[[I")
	public int[][] method3409() {
		if (this.anInt4215 != this.anInt4214) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt4215; local18++) {
			this.aClass2_Sub2Array1[local18] = Static31.aClass2_Sub2_2;
		}
		return this.anIntArrayArray40;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[I")
	public int[] method3410(@OriginalArg(1) int arg0) {
		if (this.anInt4215 == this.anInt4214) {
			this.aBoolean349 = this.aClass2_Sub2Array1[arg0] == null;
			this.aClass2_Sub2Array1[arg0] = Static31.aClass2_Sub2_2;
			return this.anIntArrayArray40[arg0];
		} else if (this.anInt4215 == 1) {
			this.aBoolean349 = arg0 != this.anInt4219;
			this.anInt4219 = arg0;
			return this.anIntArrayArray40[0];
		} else {
			@Pc(48) Class2_Sub2 local48 = this.aClass2_Sub2Array1[arg0];
			if (local48 == null) {
				this.aBoolean349 = true;
				if (this.anInt4215 <= this.anInt4221) {
					@Pc(68) Class2_Sub2 local68 = (Class2_Sub2) this.aClass1_15.method4();
					local48 = new Class2_Sub2(arg0, local68.anInt149);
					this.aClass2_Sub2Array1[local68.anInt148] = null;
					local68.method4926();
				} else {
					local48 = new Class2_Sub2(arg0, this.anInt4221);
					this.anInt4221++;
				}
				this.aClass2_Sub2Array1[arg0] = local48;
			} else {
				this.aBoolean349 = false;
			}
			this.aClass1_15.method8(local48);
			return this.anIntArrayArray40[local48.anInt149];
		}
	}
}
