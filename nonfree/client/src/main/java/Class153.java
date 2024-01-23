import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class153 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt5122 = 0;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	private int anInt5127 = -1;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!hh;")
	private Class69 aClass69_25 = new Class69();

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	private int anInt5130;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt5123;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[Lclient!cm;")
	private Class1_Sub4[] aClass1_Sub4Array1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5130 = arg0;
		this.anInt5123 = arg1;
		this.anIntArrayArrayArray18 = new int[this.anInt5130][3][arg2];
		this.aClass1_Sub4Array1 = new Class1_Sub4[this.anInt5123];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method3954() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5130; local7++) {
			this.anIntArrayArrayArray18[local7][0] = null;
			this.anIntArrayArrayArray18[local7][1] = null;
			this.anIntArrayArrayArray18[local7][2] = null;
			this.anIntArrayArrayArray18[local7] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass1_Sub4Array1 = null;
		this.aClass69_25.method1629();
		this.aClass69_25 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
	public int[][] method3955(@OriginalArg(0) int arg0) {
		if (this.anInt5130 == this.anInt5123) {
			this.aBoolean396 = this.aClass1_Sub4Array1[arg0] == null;
			this.aClass1_Sub4Array1[arg0] = Static93.aClass1_Sub4_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt5130 == 1) {
			this.aBoolean396 = arg0 != this.anInt5127;
			this.anInt5127 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(68) Class1_Sub4 local68 = this.aClass1_Sub4Array1[arg0];
			if (local68 == null) {
				this.aBoolean396 = true;
				if (this.anInt5130 > this.anInt5122) {
					local68 = new Class1_Sub4(arg0, this.anInt5122);
					this.anInt5122++;
				} else {
					@Pc(99) Class1_Sub4 local99 = (Class1_Sub4) this.aClass69_25.method1632();
					local68 = new Class1_Sub4(arg0, local99.anInt993);
					this.aClass1_Sub4Array1[local99.anInt999] = null;
					local99.method4534();
				}
				this.aClass1_Sub4Array1[arg0] = local68;
			} else {
				this.aBoolean396 = false;
			}
			this.aClass69_25.method1627(local68);
			return this.anIntArrayArrayArray18[local68.anInt993];
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)[[[I")
	public int[][][] method3957() {
		if (this.anInt5130 != this.anInt5123) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5130; local25++) {
			this.aClass1_Sub4Array1[local25] = Static93.aClass1_Sub4_1;
		}
		return this.anIntArrayArrayArray18;
	}
}
