import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class71 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt2620 = -1;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private int anInt2625 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!vb;")
	private Class120 aClass120_14 = new Class120();

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	private int anInt2621;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private int anInt2629;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[Lclient!le;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2621 = arg0;
		this.anIntArrayArrayArray7 = new int[this.anInt2621][3][arg2];
		this.anInt2629 = arg1;
		this.aClass1_Sub16Array1 = new Class1_Sub16[this.anInt2629];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[[I")
	public int[][] method2050(@OriginalArg(0) int arg0) {
		if (this.anInt2629 == this.anInt2621) {
			this.aBoolean221 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static62.aClass1_Sub16_1;
			return this.anIntArrayArrayArray7[arg0];
		} else if (this.anInt2621 == 1) {
			this.aBoolean221 = arg0 != this.anInt2620;
			this.anInt2620 = arg0;
			return this.anIntArrayArrayArray7[0];
		} else {
			@Pc(48) Class1_Sub16 local48 = this.aClass1_Sub16Array1[arg0];
			if (local48 == null) {
				this.aBoolean221 = true;
				if (this.anInt2625 >= this.anInt2621) {
					@Pc(73) Class1_Sub16 local73 = (Class1_Sub16) this.aClass120_14.method3563();
					local48 = new Class1_Sub16(arg0, local73.anInt2674);
					this.aClass1_Sub16Array1[local73.anInt2670] = null;
					local73.method3735();
				} else {
					local48 = new Class1_Sub16(arg0, this.anInt2625);
					this.anInt2625++;
				}
				this.aClass1_Sub16Array1[arg0] = local48;
			} else {
				this.aBoolean221 = false;
			}
			this.aClass120_14.method3571(local48);
			return this.anIntArrayArrayArray7[local48.anInt2674];
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method2051() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2621; local7++) {
			this.anIntArrayArrayArray7[local7][0] = null;
			this.anIntArrayArrayArray7[local7][1] = null;
			this.anIntArrayArrayArray7[local7][2] = null;
			this.anIntArrayArrayArray7[local7] = null;
		}
		this.aClass1_Sub16Array1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass120_14.method3560();
		this.aClass120_14 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method2053() {
		if (this.anInt2621 != this.anInt2629) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt2621; local22++) {
			this.aClass1_Sub16Array1[local22] = Static62.aClass1_Sub16_1;
		}
		return this.anIntArrayArrayArray7;
	}
}
