import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class113 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	private int anInt3586 = -1;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	private int anInt3587 = 0;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!c;")
	private Class17 aClass17_17 = new Class17();

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	private int anInt3583;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private int anInt3588;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lclient!gg;")
	private Class4_Sub15[] aClass4_Sub15Array1;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3583 = arg1;
		this.anInt3588 = arg0;
		this.aClass4_Sub15Array1 = new Class4_Sub15[this.anInt3583];
		this.anIntArrayArrayArray10 = new int[this.anInt3588][3][arg2];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[[[I")
	public int[][][] method2909() {
		if (this.anInt3583 != this.anInt3588) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt3588; local27++) {
			this.aClass4_Sub15Array1[local27] = Static298.aClass4_Sub15_3;
		}
		return this.anIntArrayArrayArray10;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I")
	public int[][] method2911(@OriginalArg(0) int arg0) {
		if (this.anInt3588 == this.anInt3583) {
			this.aBoolean232 = this.aClass4_Sub15Array1[arg0] == null;
			this.aClass4_Sub15Array1[arg0] = Static298.aClass4_Sub15_3;
			return this.anIntArrayArrayArray10[arg0];
		} else if (this.anInt3588 == 1) {
			this.aBoolean232 = this.anInt3586 != arg0;
			this.anInt3586 = arg0;
			return this.anIntArrayArrayArray10[0];
		} else {
			@Pc(68) Class4_Sub15 local68 = this.aClass4_Sub15Array1[arg0];
			if (local68 == null) {
				this.aBoolean232 = true;
				if (this.anInt3588 > this.anInt3587) {
					local68 = new Class4_Sub15(arg0, this.anInt3587);
					this.anInt3587++;
				} else {
					@Pc(108) Class4_Sub15 local108 = (Class4_Sub15) this.aClass17_17.method609();
					local68 = new Class4_Sub15(arg0, local108.anInt1796);
					this.aClass4_Sub15Array1[local108.anInt1798] = null;
					local108.method4690();
				}
				this.aClass4_Sub15Array1[arg0] = local68;
			} else {
				this.aBoolean232 = false;
			}
			this.aClass17_17.method611(local68);
			return this.anIntArrayArrayArray10[local68.anInt1796];
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public void method2912() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt3588; local14++) {
			this.anIntArrayArrayArray10[local14][0] = null;
			this.anIntArrayArrayArray10[local14][1] = null;
			this.anIntArrayArrayArray10[local14][2] = null;
			this.anIntArrayArrayArray10[local14] = null;
		}
		this.aClass4_Sub15Array1 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass17_17.method618();
		this.aClass17_17 = null;
	}
}
