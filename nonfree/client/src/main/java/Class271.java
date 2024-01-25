import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class271 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	private int anInt6785 = -1;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	private int anInt6787 = 0;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!dc;")
	private Class70 aClass70_44 = new Class70();

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
	public boolean aBoolean543 = false;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	private final int anInt6784;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	private final int anInt6783;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lclient!wb;")
	private Class2_Sub51[] aClass2_Sub51Array1;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(III)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6784 = arg1;
		this.anInt6783 = arg0;
		this.aClass2_Sub51Array1 = new Class2_Sub51[this.anInt6784];
		this.anIntArrayArray47 = new int[this.anInt6783][arg2];
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I")
	public int[] method5621(@OriginalArg(0) int arg0) {
		if (this.anInt6783 == this.anInt6784) {
			this.aBoolean543 = this.aClass2_Sub51Array1[arg0] == null;
			this.aClass2_Sub51Array1[arg0] = Static358.aClass2_Sub51_1;
			return this.anIntArrayArray47[arg0];
		} else if (this.anInt6783 == 1) {
			this.aBoolean543 = arg0 != this.anInt6785;
			this.anInt6785 = arg0;
			return this.anIntArrayArray47[0];
		} else {
			@Pc(31) Class2_Sub51 local31 = this.aClass2_Sub51Array1[arg0];
			if (local31 == null) {
				this.aBoolean543 = true;
				if (this.anInt6787 < this.anInt6783) {
					local31 = new Class2_Sub51(arg0, this.anInt6787);
					this.anInt6787++;
				} else {
					@Pc(71) Class2_Sub51 local71 = (Class2_Sub51) this.aClass70_44.method1266();
					local31 = new Class2_Sub51(arg0, local71.anInt9368);
					this.aClass2_Sub51Array1[local71.anInt9369] = null;
					local71.method7657();
				}
				this.aClass2_Sub51Array1[arg0] = local31;
			} else {
				this.aBoolean543 = false;
			}
			this.aClass70_44.method1268(local31);
			return this.anIntArrayArray47[local31.anInt9368];
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public void method5623() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6783; local9++) {
			this.anIntArrayArray47[local9] = null;
		}
		this.anIntArrayArray47 = null;
		this.aClass2_Sub51Array1 = null;
		this.aClass70_44.method1265();
		this.aClass70_44 = null;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)[[I")
	public int[][] method5624() {
		if (this.anInt6783 != this.anInt6784) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt6783; local21++) {
			this.aClass2_Sub51Array1[local21] = Static358.aClass2_Sub51_1;
		}
		return this.anIntArrayArray47;
	}
}
