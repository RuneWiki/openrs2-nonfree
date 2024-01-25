import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class98 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	private int anInt3071 = -1;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	private int anInt3075 = 0;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!eb;")
	private Class42 aClass42_16 = new Class42();

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	private final int anInt3074;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	private final int anInt3072;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[Lclient!is;")
	private Class1_Sub24[] aClass1_Sub24Array1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(III)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3074 = arg0;
		this.anInt3072 = arg1;
		this.anIntArrayArray25 = new int[this.anInt3074][arg2];
		this.aClass1_Sub24Array1 = new Class1_Sub24[this.anInt3072];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public void method2849() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3074; local3++) {
			this.anIntArrayArray25[local3] = null;
		}
		this.aClass1_Sub24Array1 = null;
		this.anIntArrayArray25 = null;
		this.aClass42_16.method1542();
		this.aClass42_16 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)[[I")
	public int[][] method2852() {
		if (this.anInt3072 != this.anInt3074) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3074; local21++) {
			this.aClass1_Sub24Array1[local21] = Static202.aClass1_Sub24_1;
		}
		return this.anIntArrayArray25;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I")
	public int[] method2856(@OriginalArg(0) int arg0) {
		if (this.anInt3074 == this.anInt3072) {
			this.aBoolean210 = this.aClass1_Sub24Array1[arg0] == null;
			this.aClass1_Sub24Array1[arg0] = Static202.aClass1_Sub24_1;
			return this.anIntArrayArray25[arg0];
		} else if (this.anInt3074 == 1) {
			this.aBoolean210 = arg0 != this.anInt3071;
			this.anInt3071 = arg0;
			return this.anIntArrayArray25[0];
		} else {
			@Pc(50) Class1_Sub24 local50 = this.aClass1_Sub24Array1[arg0];
			if (local50 == null) {
				this.aBoolean210 = true;
				if (this.anInt3074 > this.anInt3075) {
					local50 = new Class1_Sub24(arg0, this.anInt3075);
					this.anInt3075++;
				} else {
					@Pc(90) Class1_Sub24 local90 = (Class1_Sub24) this.aClass42_16.method1544();
					local50 = new Class1_Sub24(arg0, local90.anInt3041);
					this.aClass1_Sub24Array1[local90.anInt3038] = null;
					local90.method6045();
				}
				this.aClass1_Sub24Array1[arg0] = local50;
			} else {
				this.aBoolean210 = false;
			}
			this.aClass42_16.method1539(local50);
			return this.anIntArrayArray25[local50.anInt3041];
		}
	}
}
