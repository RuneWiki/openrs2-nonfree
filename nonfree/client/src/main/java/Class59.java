import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class59 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	private int anInt1798 = -1;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	private int anInt1802 = 0;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!wn;")
	private Class182 aClass182_9 = new Class182();

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	private int anInt1803;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[Lclient!jn;")
	private Class8_Sub15[] aClass8_Sub15Array1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1803 = arg0;
		this.anIntArrayArray8 = new int[this.anInt1803][arg2];
		this.anInt1801 = arg1;
		this.aClass8_Sub15Array1 = new Class8_Sub15[this.anInt1801];
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)[[I")
	public int[][] method1363() {
		if (this.anInt1803 != this.anInt1801) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1803; local29++) {
			this.aClass8_Sub15Array1[local29] = Static12.aClass8_Sub15_1;
		}
		return this.anIntArrayArray8;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public void method1364() {
		for (@Pc(16) int local16 = 0; local16 < this.anInt1803; local16++) {
			this.anIntArrayArray8[local16] = null;
		}
		this.aClass8_Sub15Array1 = null;
		this.anIntArrayArray8 = null;
		this.aClass182_9.method4317();
		this.aClass182_9 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	public int[] method1366(@OriginalArg(0) int arg0) {
		if (this.anInt1801 == this.anInt1803) {
			this.aBoolean131 = this.aClass8_Sub15Array1[arg0] == null;
			this.aClass8_Sub15Array1[arg0] = Static12.aClass8_Sub15_1;
			return this.anIntArrayArray8[arg0];
		} else if (this.anInt1803 == 1) {
			this.aBoolean131 = arg0 != this.anInt1798;
			this.anInt1798 = arg0;
			return this.anIntArrayArray8[0];
		} else {
			@Pc(46) Class8_Sub15 local46 = this.aClass8_Sub15Array1[arg0];
			if (local46 == null) {
				this.aBoolean131 = true;
				if (this.anInt1802 >= this.anInt1803) {
					@Pc(71) Class8_Sub15 local71 = (Class8_Sub15) this.aClass182_9.method4320();
					local46 = new Class8_Sub15(arg0, local71.anInt2595);
					this.aClass8_Sub15Array1[local71.anInt2596] = null;
					local71.method4273();
				} else {
					local46 = new Class8_Sub15(arg0, this.anInt1802);
					this.anInt1802++;
				}
				this.aClass8_Sub15Array1[arg0] = local46;
			} else {
				this.aBoolean131 = false;
			}
			this.aClass182_9.method4325(local46);
			return this.anIntArrayArray8[local46.anInt2595];
		}
	}
}
