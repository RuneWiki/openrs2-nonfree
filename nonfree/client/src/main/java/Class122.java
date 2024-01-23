import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class122 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	private int anInt3913 = 0;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	private int anInt3921 = -1;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!hi;")
	private Class61 aClass61_21 = new Class61();

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	private int anInt3920;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[Lclient!mf;")
	private Class1_Sub22[] aClass1_Sub22Array1;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(III)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3920 = arg1;
		this.anInt3914 = arg0;
		this.aClass1_Sub22Array1 = new Class1_Sub22[this.anInt3920];
		this.anIntArrayArray18 = new int[this.anInt3914][arg2];
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public void method3149() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3914; local3++) {
			this.anIntArrayArray18[local3] = null;
		}
		this.aClass1_Sub22Array1 = null;
		this.anIntArrayArray18 = null;
		this.aClass61_21.method1845();
		this.aClass61_21 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[I")
	public int[] method3152(@OriginalArg(0) int arg0) {
		if (this.anInt3914 == this.anInt3920) {
			this.aBoolean297 = this.aClass1_Sub22Array1[arg0] == null;
			this.aClass1_Sub22Array1[arg0] = Static104.aClass1_Sub22_1;
			return this.anIntArrayArray18[arg0];
		} else if (this.anInt3914 == 1) {
			this.aBoolean297 = this.anInt3921 != arg0;
			this.anInt3921 = arg0;
			return this.anIntArrayArray18[0];
		} else {
			@Pc(71) Class1_Sub22 local71 = this.aClass1_Sub22Array1[arg0];
			if (local71 == null) {
				this.aBoolean297 = true;
				if (this.anInt3913 < this.anInt3914) {
					local71 = new Class1_Sub22(arg0, this.anInt3913);
					this.anInt3913++;
				} else {
					@Pc(108) Class1_Sub22 local108 = (Class1_Sub22) this.aClass61_21.method1838();
					local71 = new Class1_Sub22(arg0, local108.anInt3471);
					this.aClass1_Sub22Array1[local108.anInt3472] = null;
					local108.method4441();
				}
				this.aClass1_Sub22Array1[arg0] = local71;
			} else {
				this.aBoolean297 = false;
			}
			this.aClass61_21.method1843(local71);
			return this.anIntArrayArray18[local71.anInt3471];
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)[[I")
	public int[][] method3153() {
		if (this.anInt3914 != this.anInt3920) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3914; local21++) {
			this.aClass1_Sub22Array1[local21] = Static104.aClass1_Sub22_1;
		}
		return this.anIntArrayArray18;
	}
}
