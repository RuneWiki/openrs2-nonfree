import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class85 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private int anInt4483 = -1;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	private int anInt4482 = 0;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!ad;")
	private Class4 aClass4_16 = new Class4();

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	private final int anInt4485;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	private final int anInt4480;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "[Lclient!w;")
	private Class1_Sub24[] aClass1_Sub24Array1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4485 = arg1;
		this.anIntArrayArray39 = new int[arg0][arg2];
		this.anInt4480 = arg0;
		this.aClass1_Sub24Array1 = new Class1_Sub24[arg1];
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public void method3435() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4480; local7++) {
			this.anIntArrayArray39[local7] = null;
		}
		this.aClass1_Sub24Array1 = null;
		this.anIntArrayArray39 = null;
		this.aClass4_16.method182();
		this.aClass4_16 = null;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)[[I")
	public int[][] method3436() {
		if (this.anInt4485 != this.anInt4480) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(23) int local23 = 0; local23 < this.anInt4480; local23++) {
			this.aClass1_Sub24Array1[local23] = Static116.aClass1_Sub24_1;
		}
		return this.anIntArrayArray39;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[I")
	public int[] method3438(@OriginalArg(1) int arg0) {
		if (this.anInt4480 == this.anInt4485) {
			this.aBoolean177 = this.aClass1_Sub24Array1[arg0] == null;
			this.aClass1_Sub24Array1[arg0] = Static116.aClass1_Sub24_1;
			return this.anIntArrayArray39[arg0];
		} else if (this.anInt4480 == 1) {
			this.aBoolean177 = arg0 != this.anInt4483;
			this.anInt4483 = arg0;
			return this.anIntArrayArray39[0];
		} else {
			@Pc(49) Class1_Sub24 local49 = this.aClass1_Sub24Array1[arg0];
			if (this.aBoolean177 = local49 == null) {
				if (this.anInt4482 < this.anInt4480) {
					local49 = new Class1_Sub24(arg0, this.anInt4482);
					this.anInt4482++;
				} else {
					@Pc(84) Class1_Sub24 local84 = (Class1_Sub24) this.aClass4_16.method176();
					local49 = new Class1_Sub24(arg0, local84.anInt4502);
					this.aClass1_Sub24Array1[local84.anInt4499] = null;
					local84.method3499();
				}
				this.aClass1_Sub24Array1[arg0] = local49;
			}
			this.aClass4_16.method180(local49);
			return this.anIntArrayArray39[local49.anInt4502];
		}
	}
}
