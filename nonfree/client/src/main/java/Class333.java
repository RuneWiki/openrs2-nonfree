import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class333 {

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
	private int anInt9137 = -1;

	@OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
	private int anInt9141 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!fca;")
	private Class114 aClass114_61 = new Class114();

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "Z")
	public boolean aBoolean779 = false;

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "I")
	private final int anInt9139;

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	private final int anInt9138;

	@OriginalMember(owner = "client!tda", name = "m", descriptor = "[Lclient!gga;")
	private Class5_Sub24[] aClass5_Sub24Array1;

	@OriginalMember(owner = "client!tda", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(III)V")
	public Class333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9139 = arg1;
		this.anInt9138 = arg0;
		this.aClass5_Sub24Array1 = new Class5_Sub24[this.anInt9139];
		this.anIntArrayArray50 = new int[this.anInt9138][arg2];
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	public void method7745() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9138; local7++) {
			this.anIntArrayArray50[local7] = null;
		}
		this.aClass5_Sub24Array1 = null;
		this.anIntArrayArray50 = null;
		this.aClass114_61.method2808();
		this.aClass114_61 = null;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)[[I")
	public int[][] method7746() {
		if (this.anInt9139 != this.anInt9138) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt9138; local22++) {
			this.aClass5_Sub24Array1[local22] = Static371.aClass5_Sub24_1;
		}
		return this.anIntArrayArray50;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)[I")
	public int[] method7747(@OriginalArg(0) int arg0) {
		if (this.anInt9138 == this.anInt9139) {
			this.aBoolean779 = this.aClass5_Sub24Array1[arg0] == null;
			this.aClass5_Sub24Array1[arg0] = Static371.aClass5_Sub24_1;
			return this.anIntArrayArray50[arg0];
		} else if (this.anInt9138 == 1) {
			this.aBoolean779 = this.anInt9137 != arg0;
			this.anInt9137 = arg0;
			return this.anIntArrayArray50[0];
		} else {
			@Pc(48) Class5_Sub24 local48 = this.aClass5_Sub24Array1[arg0];
			if (local48 == null) {
				this.aBoolean779 = true;
				if (this.anInt9141 >= this.anInt9138) {
					@Pc(70) Class5_Sub24 local70 = (Class5_Sub24) this.aClass114_61.method2818();
					local48 = new Class5_Sub24(arg0, local70.anInt3766);
					this.aClass5_Sub24Array1[local70.anInt3767] = null;
					local70.method9052();
				} else {
					local48 = new Class5_Sub24(arg0, this.anInt9141);
					this.anInt9141++;
				}
				this.aClass5_Sub24Array1[arg0] = local48;
			} else {
				this.aBoolean779 = false;
			}
			this.aClass114_61.method2812(local48);
			return this.anIntArrayArray50[local48.anInt3766];
		}
	}
}
