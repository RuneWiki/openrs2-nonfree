import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class180 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
	private int anInt5277 = 0;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
	private int anInt5281 = -1;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!rk;")
	private Class249 aClass249_26 = new Class249();

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
	private final int anInt5280;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
	private final int anInt5279;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "[Lclient!am;")
	private Class2_Sub3[] aClass2_Sub3Array1;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(III)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5280 = arg1;
		this.anInt5279 = arg0;
		this.anIntArrayArrayArray11 = new int[this.anInt5279][3][arg2];
		this.aClass2_Sub3Array1 = new Class2_Sub3[this.anInt5280];
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
	public void method4529() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5279; local7++) {
			this.anIntArrayArrayArray11[local7][0] = null;
			this.anIntArrayArrayArray11[local7][1] = null;
			this.anIntArrayArrayArray11[local7][2] = null;
			this.anIntArrayArrayArray11[local7] = null;
		}
		this.aClass2_Sub3Array1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass249_26.method6530();
		this.aClass249_26 = null;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)[[[I")
	public int[][][] method4530() {
		if (this.anInt5280 != this.anInt5279) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5279; local17++) {
			this.aClass2_Sub3Array1[local17] = Static485.aClass2_Sub3_1;
		}
		return this.anIntArrayArrayArray11;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I")
	public int[][] method4533(@OriginalArg(1) int arg0) {
		if (this.anInt5280 == this.anInt5279) {
			this.aBoolean392 = this.aClass2_Sub3Array1[arg0] == null;
			this.aClass2_Sub3Array1[arg0] = Static485.aClass2_Sub3_1;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt5279 == 1) {
			this.aBoolean392 = arg0 != this.anInt5281;
			this.anInt5281 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(66) Class2_Sub3 local66 = this.aClass2_Sub3Array1[arg0];
			if (local66 == null) {
				this.aBoolean392 = true;
				if (this.anInt5277 < this.anInt5279) {
					local66 = new Class2_Sub3(arg0, this.anInt5277);
					this.anInt5277++;
				} else {
					@Pc(97) Class2_Sub3 local97 = (Class2_Sub3) this.aClass249_26.method6521();
					local66 = new Class2_Sub3(arg0, local97.anInt438);
					this.aClass2_Sub3Array1[local97.anInt437] = null;
					local97.method7802();
				}
				this.aClass2_Sub3Array1[arg0] = local66;
			} else {
				this.aBoolean392 = false;
			}
			this.aClass249_26.method6520(local66);
			return this.anIntArrayArrayArray11[local66.anInt438];
		}
	}
}
