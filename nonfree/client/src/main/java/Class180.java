import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class180 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private int anInt5426 = 0;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	private int anInt5423 = -1;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!fca;")
	private Class114 aClass114_37 = new Class114();

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Z")
	public boolean aBoolean464 = false;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private final int anInt5425;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
	private final int anInt5422;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray23;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[Lclient!jka;")
	private Class5_Sub32[] aClass5_Sub32Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(III)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5425 = arg1;
		this.anInt5422 = arg0;
		this.anIntArrayArrayArray23 = new int[this.anInt5422][3][arg2];
		this.aClass5_Sub32Array1 = new Class5_Sub32[this.anInt5425];
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[[I")
	public int[][] method4548(@OriginalArg(1) int arg0) {
		if (this.anInt5422 == this.anInt5425) {
			this.aBoolean464 = this.aClass5_Sub32Array1[arg0] == null;
			this.aClass5_Sub32Array1[arg0] = Static24.aClass5_Sub32_4;
			return this.anIntArrayArrayArray23[arg0];
		} else if (this.anInt5422 == 1) {
			this.aBoolean464 = arg0 != this.anInt5423;
			this.anInt5423 = arg0;
			return this.anIntArrayArrayArray23[0];
		} else {
			@Pc(46) Class5_Sub32 local46 = this.aClass5_Sub32Array1[arg0];
			if (local46 == null) {
				this.aBoolean464 = true;
				if (this.anInt5422 > this.anInt5426) {
					local46 = new Class5_Sub32(arg0, this.anInt5426);
					this.anInt5426++;
				} else {
					@Pc(77) Class5_Sub32 local77 = (Class5_Sub32) this.aClass114_37.method2818();
					local46 = new Class5_Sub32(arg0, local77.anInt5638);
					this.aClass5_Sub32Array1[local77.anInt5637] = null;
					local77.method9052();
				}
				this.aClass5_Sub32Array1[arg0] = local46;
			} else {
				this.aBoolean464 = false;
			}
			this.aClass114_37.method2812(local46);
			return this.anIntArrayArrayArray23[local46.anInt5638];
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)[[[I")
	public int[][][] method4549() {
		if (this.anInt5425 != this.anInt5422) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt5422; local17++) {
			this.aClass5_Sub32Array1[local17] = Static24.aClass5_Sub32_4;
		}
		return this.anIntArrayArrayArray23;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
	public void method4551() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5422; local3++) {
			this.anIntArrayArrayArray23[local3][0] = null;
			this.anIntArrayArrayArray23[local3][1] = null;
			this.anIntArrayArrayArray23[local3][2] = null;
			this.anIntArrayArrayArray23[local3] = null;
		}
		this.aClass5_Sub32Array1 = null;
		this.anIntArrayArrayArray23 = null;
		this.aClass114_37.method2808();
		this.aClass114_37 = null;
	}
}
