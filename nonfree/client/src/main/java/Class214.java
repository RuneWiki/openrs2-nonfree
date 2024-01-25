import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class214 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt6565 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	private int anInt6571 = -1;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!ar;")
	private Class14 aClass14_38 = new Class14();

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private final int anInt6568;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	private final int anInt6572;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lclient!he;")
	private Class1_Sub18[] aClass1_Sub18Array1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6568 = arg0;
		this.anInt6572 = arg1;
		this.anIntArrayArray59 = new int[this.anInt6568][arg2];
		this.aClass1_Sub18Array1 = new Class1_Sub18[this.anInt6572];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[[I")
	public int[][] method5647() {
		if (this.anInt6568 != this.anInt6572) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6568; local17++) {
			this.aClass1_Sub18Array1[local17] = Static315.aClass1_Sub18_1;
		}
		return this.anIntArrayArray59;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public void method5648() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6568; local3++) {
			this.anIntArrayArray59[local3] = null;
		}
		this.aClass1_Sub18Array1 = null;
		this.anIntArrayArray59 = null;
		this.aClass14_38.method305();
		this.aClass14_38 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
	public int[] method5651(@OriginalArg(0) int arg0) {
		if (this.anInt6572 == this.anInt6568) {
			this.aBoolean544 = this.aClass1_Sub18Array1[arg0] == null;
			this.aClass1_Sub18Array1[arg0] = Static315.aClass1_Sub18_1;
			return this.anIntArrayArray59[arg0];
		} else if (this.anInt6568 == 1) {
			this.aBoolean544 = arg0 != this.anInt6571;
			this.anInt6571 = arg0;
			return this.anIntArrayArray59[0];
		} else {
			@Pc(30) Class1_Sub18 local30 = this.aClass1_Sub18Array1[arg0];
			if (local30 == null) {
				this.aBoolean544 = true;
				if (this.anInt6565 < this.anInt6568) {
					local30 = new Class1_Sub18(arg0, this.anInt6565);
					this.anInt6565++;
				} else {
					@Pc(70) Class1_Sub18 local70 = (Class1_Sub18) this.aClass14_38.method303();
					local30 = new Class1_Sub18(arg0, local70.anInt2164);
					this.aClass1_Sub18Array1[local70.anInt2166] = null;
					local70.method5796();
				}
				this.aClass1_Sub18Array1[arg0] = local30;
			} else {
				this.aBoolean544 = false;
			}
			this.aClass14_38.method306(local30);
			return this.anIntArrayArray59[local30.anInt2164];
		}
	}
}
