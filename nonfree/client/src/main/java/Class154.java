import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class154 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private int anInt4584 = 0;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	private int anInt4595 = -1;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!vn;")
	private Class211 aClass211_19 = new Class211();

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private final int anInt4585;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	private final int anInt4592;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[Lclient!pg;")
	private Class5_Sub34[] aClass5_Sub34Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4585 = arg0;
		this.anInt4592 = arg1;
		this.anIntArrayArrayArray13 = new int[this.anInt4585][3][arg2];
		this.aClass5_Sub34Array1 = new Class5_Sub34[this.anInt4592];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[[I")
	public int[][] method4027(@OriginalArg(0) int arg0) {
		if (this.anInt4585 == this.anInt4592) {
			this.aBoolean336 = this.aClass5_Sub34Array1[arg0] == null;
			this.aClass5_Sub34Array1[arg0] = Static5.aClass5_Sub34_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt4585 == 1) {
			this.aBoolean336 = this.anInt4595 != arg0;
			this.anInt4595 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(61) Class5_Sub34 local61 = this.aClass5_Sub34Array1[arg0];
			if (local61 == null) {
				this.aBoolean336 = true;
				if (this.anInt4584 < this.anInt4585) {
					local61 = new Class5_Sub34(arg0, this.anInt4584);
					this.anInt4584++;
				} else {
					@Pc(101) Class5_Sub34 local101 = (Class5_Sub34) this.aClass211_19.method5601();
					local61 = new Class5_Sub34(arg0, local101.anInt4609);
					this.aClass5_Sub34Array1[local101.anInt4605] = null;
					local101.method5803();
				}
				this.aClass5_Sub34Array1[arg0] = local61;
			} else {
				this.aBoolean336 = false;
			}
			this.aClass211_19.method5607(local61);
			return this.anIntArrayArrayArray13[local61.anInt4609];
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[[[I")
	public int[][][] method4030() {
		if (this.anInt4585 != this.anInt4592) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4585; local21++) {
			this.aClass5_Sub34Array1[local21] = Static5.aClass5_Sub34_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method4032() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4585; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.aClass5_Sub34Array1 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass211_19.method5600();
		this.aClass211_19 = null;
	}
}
