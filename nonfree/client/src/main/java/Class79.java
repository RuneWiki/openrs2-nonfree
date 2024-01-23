import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class79 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	private int anInt2877 = 0;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	private int anInt2882 = -1;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!mi;")
	private Class75 aClass75_15 = new Class75();

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	private int anInt2873;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	private int anInt2879;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[Lclient!dk;")
	private Class1_Sub10[] aClass1_Sub10Array1;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2873 = arg0;
		this.anInt2879 = arg1;
		this.aClass1_Sub10Array1 = new Class1_Sub10[this.anInt2879];
		this.anIntArrayArray22 = new int[this.anInt2873][arg2];
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[I")
	public int[] method2341(@OriginalArg(0) int arg0) {
		if (this.anInt2873 == this.anInt2879) {
			this.aBoolean125 = this.aClass1_Sub10Array1[arg0] == null;
			this.aClass1_Sub10Array1[arg0] = Static207.aClass1_Sub10_1;
			return this.anIntArrayArray22[arg0];
		} else if (this.anInt2873 == 1) {
			this.aBoolean125 = this.anInt2882 != arg0;
			this.anInt2882 = arg0;
			return this.anIntArrayArray22[0];
		} else {
			@Pc(68) Class1_Sub10 local68 = this.aClass1_Sub10Array1[arg0];
			if (local68 == null) {
				this.aBoolean125 = true;
				if (this.anInt2873 > this.anInt2877) {
					local68 = new Class1_Sub10(arg0, this.anInt2877);
					this.anInt2877++;
				} else {
					@Pc(103) Class1_Sub10 local103 = (Class1_Sub10) this.aClass75_15.method2244();
					local68 = new Class1_Sub10(arg0, local103.anInt953);
					this.aClass1_Sub10Array1[local103.anInt951] = null;
					local103.method3525();
				}
				this.aClass1_Sub10Array1[arg0] = local68;
			} else {
				this.aBoolean125 = false;
			}
			this.aClass75_15.method2236(local68);
			return this.anIntArrayArray22[local68.anInt953];
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[[I")
	public int[][] method2343() {
		if (this.anInt2879 != this.anInt2873) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2873; local17++) {
			this.aClass1_Sub10Array1[local17] = Static207.aClass1_Sub10_1;
		}
		return this.anIntArrayArray22;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method2349() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2873; local7++) {
			this.anIntArrayArray22[local7] = null;
		}
		this.anIntArrayArray22 = null;
		this.aClass1_Sub10Array1 = null;
		this.aClass75_15.method2243();
		this.aClass75_15 = null;
	}
}
