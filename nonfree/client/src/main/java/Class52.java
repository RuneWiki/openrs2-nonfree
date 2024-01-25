import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class52 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	private int anInt1431 = -1;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
	private int anInt1435 = 0;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!vn;")
	private Class211 aClass211_5 = new Class211();

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
	private final int anInt1438;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	private final int anInt1430;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "[Lclient!sg;")
	private Class5_Sub38[] aClass5_Sub38Array1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(III)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1438 = arg0;
		this.anInt1430 = arg1;
		this.anIntArrayArray8 = new int[this.anInt1438][arg2];
		this.aClass5_Sub38Array1 = new Class5_Sub38[this.anInt1430];
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I")
	public int[] method1260(@OriginalArg(1) int arg0) {
		if (this.anInt1430 == this.anInt1438) {
			this.aBoolean95 = this.aClass5_Sub38Array1[arg0] == null;
			this.aClass5_Sub38Array1[arg0] = Static138.aClass5_Sub38_1;
			return this.anIntArrayArray8[arg0];
		} else if (this.anInt1438 == 1) {
			this.aBoolean95 = this.anInt1431 != arg0;
			this.anInt1431 = arg0;
			return this.anIntArrayArray8[0];
		} else {
			@Pc(46) Class5_Sub38 local46 = this.aClass5_Sub38Array1[arg0];
			if (local46 == null) {
				this.aBoolean95 = true;
				if (this.anInt1438 <= this.anInt1435) {
					@Pc(71) Class5_Sub38 local71 = (Class5_Sub38) this.aClass211_5.method5601();
					local46 = new Class5_Sub38(arg0, local71.anInt5573);
					this.aClass5_Sub38Array1[local71.anInt5575] = null;
					local71.method5803();
				} else {
					local46 = new Class5_Sub38(arg0, this.anInt1435);
					this.anInt1435++;
				}
				this.aClass5_Sub38Array1[arg0] = local46;
			} else {
				this.aBoolean95 = false;
			}
			this.aClass211_5.method5607(local46);
			return this.anIntArrayArray8[local46.anInt5573];
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)[[I")
	public int[][] method1261() {
		if (this.anInt1438 != this.anInt1430) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt1438; local26++) {
			this.aClass5_Sub38Array1[local26] = Static138.aClass5_Sub38_1;
		}
		return this.anIntArrayArray8;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	public void method1264() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1438; local7++) {
			this.anIntArrayArray8[local7] = null;
		}
		this.anIntArrayArray8 = null;
		this.aClass5_Sub38Array1 = null;
		this.aClass211_5.method5600();
		this.aClass211_5 = null;
	}
}
