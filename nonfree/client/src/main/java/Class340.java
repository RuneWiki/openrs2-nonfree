import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class340 {

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	private int anInt9439 = -1;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	private int anInt9440 = 0;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Lclient!bd;")
	private Class32 aClass32_62 = new Class32();

	@OriginalMember(owner = "client!st", name = "d", descriptor = "Z")
	public boolean aBoolean655 = false;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	private final int anInt9441;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	private final int anInt9438;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!st", name = "o", descriptor = "[Lclient!pg;")
	private Class14_Sub36[] aClass14_Sub36Array1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(III)V")
	public Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9441 = arg1;
		this.anInt9438 = arg0;
		this.anIntArrayArrayArray18 = new int[this.anInt9438][3][arg2];
		this.aClass14_Sub36Array1 = new Class14_Sub36[this.anInt9441];
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method8149() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt9438; local8++) {
			this.anIntArrayArrayArray18[local8][0] = null;
			this.anIntArrayArrayArray18[local8][1] = null;
			this.anIntArrayArrayArray18[local8][2] = null;
			this.anIntArrayArrayArray18[local8] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass14_Sub36Array1 = null;
		this.aClass32_62.method588();
		this.aClass32_62 = null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)[[[I")
	public int[][][] method8151() {
		if (this.anInt9441 != this.anInt9438) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt9438; local20++) {
			this.aClass14_Sub36Array1[local20] = Static408.aClass14_Sub36_1;
		}
		return this.anIntArrayArrayArray18;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)[[I")
	public int[][] method8152(@OriginalArg(1) int arg0) {
		if (this.anInt9438 == this.anInt9441) {
			this.aBoolean655 = this.aClass14_Sub36Array1[arg0] == null;
			this.aClass14_Sub36Array1[arg0] = Static408.aClass14_Sub36_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt9438 == 1) {
			this.aBoolean655 = this.anInt9439 != arg0;
			this.anInt9439 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(35) Class14_Sub36 local35 = this.aClass14_Sub36Array1[arg0];
			if (local35 == null) {
				this.aBoolean655 = true;
				if (this.anInt9440 >= this.anInt9438) {
					@Pc(64) Class14_Sub36 local64 = (Class14_Sub36) this.aClass32_62.method578();
					local35 = new Class14_Sub36(arg0, local64.anInt7806);
					this.aClass14_Sub36Array1[local64.anInt7802] = null;
					local64.method9513();
				} else {
					local35 = new Class14_Sub36(arg0, this.anInt9440);
					this.anInt9440++;
				}
				this.aClass14_Sub36Array1[arg0] = local35;
			} else {
				this.aBoolean655 = false;
			}
			this.aClass32_62.method585(local35);
			return this.anIntArrayArrayArray18[local35.anInt7806];
		}
	}
}
