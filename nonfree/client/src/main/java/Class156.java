import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class156 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	private int anInt4715 = -1;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	private int anInt4712 = 0;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Lclient!an;")
	private Class10 aClass10_53 = new Class10();

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Z")
	public boolean aBoolean307 = false;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	private int anInt4713;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	private int anInt4716;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "[Lclient!bk;")
	private Class4_Sub7[] aClass4_Sub7Array1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4713 = arg0;
		this.anIntArrayArray41 = new int[this.anInt4713][arg2];
		this.anInt4716 = arg1;
		this.aClass4_Sub7Array1 = new Class4_Sub7[this.anInt4716];
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)[[I")
	public int[][] method3755() {
		if (this.anInt4716 != this.anInt4713) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt4713; local22++) {
			this.aClass4_Sub7Array1[local22] = Static177.aClass4_Sub7_1;
		}
		return this.anIntArrayArray41;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public void method3762() {
		for (@Pc(17) int local17 = 0; local17 < this.anInt4713; local17++) {
			this.anIntArrayArray41[local17] = null;
		}
		this.anIntArrayArray41 = null;
		this.aClass4_Sub7Array1 = null;
		this.aClass10_53.method192();
		this.aClass10_53 = null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)[I")
	public int[] method3763(@OriginalArg(0) int arg0) {
		if (this.anInt4713 == this.anInt4716) {
			this.aBoolean307 = this.aClass4_Sub7Array1[arg0] == null;
			this.aClass4_Sub7Array1[arg0] = Static177.aClass4_Sub7_1;
			return this.anIntArrayArray41[arg0];
		} else if (this.anInt4713 == 1) {
			this.aBoolean307 = arg0 != this.anInt4715;
			this.anInt4715 = arg0;
			return this.anIntArrayArray41[0];
		} else {
			@Pc(46) Class4_Sub7 local46 = this.aClass4_Sub7Array1[arg0];
			if (local46 == null) {
				this.aBoolean307 = true;
				if (this.anInt4712 < this.anInt4713) {
					local46 = new Class4_Sub7(arg0, this.anInt4712);
					this.anInt4712++;
				} else {
					@Pc(82) Class4_Sub7 local82 = (Class4_Sub7) this.aClass10_53.method187();
					local46 = new Class4_Sub7(arg0, local82.anInt436);
					this.aClass4_Sub7Array1[local82.anInt434] = null;
					local82.method4391();
				}
				this.aClass4_Sub7Array1[arg0] = local46;
			} else {
				this.aBoolean307 = false;
			}
			this.aClass10_53.method189(local46);
			return this.anIntArrayArray41[local46.anInt436];
		}
	}
}
