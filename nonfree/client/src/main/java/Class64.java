import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class64 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	private int anInt2965 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt2964 = -1;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!bg;")
	private Class11 aClass11_14 = new Class11();

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lclient!bi;")
	private Class4_Sub4[] aClass4_Sub4Array1;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private final int anInt2970;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	private final int anInt2972;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(III)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub4Array1 = new Class4_Sub4[arg1];
		this.anInt2970 = arg1;
		this.anInt2972 = arg0;
		this.anIntArrayArray23 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)[[I")
	public int[][] method2208() {
		if (this.anInt2972 != this.anInt2970) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2972; local17++) {
			this.aClass4_Sub4Array1[local17] = Static28.aClass4_Sub4_1;
		}
		return this.anIntArrayArray23;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public void method2209() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2972; local3++) {
			this.anIntArrayArray23[local3] = null;
		}
		this.aClass4_Sub4Array1 = null;
		this.anIntArrayArray23 = null;
		this.aClass11_14.method280();
		this.aClass11_14 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
	public int[] method2211(@OriginalArg(0) int arg0) {
		if (this.anInt2972 == this.anInt2970) {
			this.aBoolean127 = this.aClass4_Sub4Array1[arg0] == null;
			this.aClass4_Sub4Array1[arg0] = Static28.aClass4_Sub4_1;
			return this.anIntArrayArray23[arg0];
		} else if (this.anInt2972 == 1) {
			this.aBoolean127 = arg0 != this.anInt2964;
			this.anInt2964 = arg0;
			return this.anIntArrayArray23[0];
		} else {
			@Pc(66) Class4_Sub4 local66 = this.aClass4_Sub4Array1[arg0];
			if (this.aBoolean127 = local66 == null) {
				if (this.anInt2972 <= this.anInt2965) {
					@Pc(86) Class4_Sub4 local86 = (Class4_Sub4) this.aClass11_14.method275();
					local66 = new Class4_Sub4(arg0, local86.anInt478);
					this.aClass4_Sub4Array1[local86.anInt481] = null;
					local86.method3173();
				} else {
					local66 = new Class4_Sub4(arg0, this.anInt2965);
					this.anInt2965++;
				}
				this.aClass4_Sub4Array1[arg0] = local66;
			}
			this.aClass11_14.method273(local66);
			return this.anIntArrayArray23[local66.anInt478];
		}
	}
}
