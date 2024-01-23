import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class114 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	private int anInt4191 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	private int anInt4189 = -1;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!qg;")
	private Class131 aClass131_12 = new Class131();

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	private int anInt4192;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	private int anInt4194;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "[Lclient!rm;")
	private Class1_Sub30[] aClass1_Sub30Array1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4192 = arg0;
		this.anInt4194 = arg1;
		this.anIntArrayArray29 = new int[this.anInt4192][arg2];
		this.aClass1_Sub30Array1 = new Class1_Sub30[this.anInt4194];
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public void method3363() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4192; local3++) {
			this.anIntArrayArray29[local3] = null;
		}
		this.anIntArrayArray29 = null;
		this.aClass1_Sub30Array1 = null;
		this.aClass131_12.method3795();
		this.aClass131_12 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
	public int[] method3364(@OriginalArg(0) int arg0) {
		if (this.anInt4192 == this.anInt4194) {
			this.aBoolean211 = this.aClass1_Sub30Array1[arg0] == null;
			this.aClass1_Sub30Array1[arg0] = Static230.aClass1_Sub30_1;
			return this.anIntArrayArray29[arg0];
		} else if (this.anInt4192 == 1) {
			this.aBoolean211 = this.anInt4189 != arg0;
			this.anInt4189 = arg0;
			return this.anIntArrayArray29[0];
		} else {
			@Pc(49) Class1_Sub30 local49 = this.aClass1_Sub30Array1[arg0];
			if (local49 == null) {
				this.aBoolean211 = true;
				if (this.anInt4192 <= this.anInt4191) {
					@Pc(65) Class1_Sub30 local65 = (Class1_Sub30) this.aClass131_12.method3786();
					local49 = new Class1_Sub30(arg0, local65.anInt5140);
					this.aClass1_Sub30Array1[local65.anInt5142] = null;
					local65.method4742();
				} else {
					local49 = new Class1_Sub30(arg0, this.anInt4191);
					this.anInt4191++;
				}
				this.aClass1_Sub30Array1[arg0] = local49;
			} else {
				this.aBoolean211 = false;
			}
			this.aClass131_12.method3793(local49);
			return this.anIntArrayArray29[local49.anInt5140];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)[[I")
	public int[][] method3365() {
		if (this.anInt4194 != this.anInt4192) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4192; local17++) {
			this.aClass1_Sub30Array1[local17] = Static230.aClass1_Sub30_1;
		}
		return this.anIntArrayArray29;
	}
}
