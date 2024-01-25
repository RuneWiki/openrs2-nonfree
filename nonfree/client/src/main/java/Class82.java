import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class82 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	private int anInt2601 = -1;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	private int anInt2605 = 0;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Lclient!ar;")
	private Class14 aClass14_21 = new Class14();

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	private final int anInt2603;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
	private final int anInt2600;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "[Lclient!jq;")
	private Class2_Sub21[] aClass2_Sub21Array1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(III)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2603 = arg1;
		this.anInt2600 = arg0;
		this.anIntArrayArray19 = new int[this.anInt2600][arg2];
		this.aClass2_Sub21Array1 = new Class2_Sub21[this.anInt2603];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)[[I")
	public int[][] method2032() {
		if (this.anInt2603 != this.anInt2600) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt2600; local27++) {
			this.aClass2_Sub21Array1[local27] = Static58.aClass2_Sub21_1;
		}
		return this.anIntArrayArray19;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public void method2033() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt2600; local9++) {
			this.anIntArrayArray19[local9] = null;
		}
		this.anIntArrayArray19 = null;
		this.aClass2_Sub21Array1 = null;
		this.aClass14_21.method305();
		this.aClass14_21 = null;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IB)[I")
	public int[] method2034(@OriginalArg(0) int arg0) {
		if (this.anInt2603 == this.anInt2600) {
			this.aBoolean199 = this.aClass2_Sub21Array1[arg0] == null;
			this.aClass2_Sub21Array1[arg0] = Static58.aClass2_Sub21_1;
			return this.anIntArrayArray19[arg0];
		} else if (this.anInt2600 == 1) {
			this.aBoolean199 = arg0 != this.anInt2601;
			this.anInt2601 = arg0;
			return this.anIntArrayArray19[0];
		} else {
			@Pc(50) Class2_Sub21 local50 = this.aClass2_Sub21Array1[arg0];
			if (local50 == null) {
				this.aBoolean199 = true;
				if (this.anInt2605 >= this.anInt2600) {
					@Pc(70) Class2_Sub21 local70 = (Class2_Sub21) this.aClass14_21.method302();
					local50 = new Class2_Sub21(arg0, local70.anInt3692);
					this.aClass2_Sub21Array1[local70.anInt3694] = null;
					local70.method5866();
				} else {
					local50 = new Class2_Sub21(arg0, this.anInt2605);
					this.anInt2605++;
				}
				this.aClass2_Sub21Array1[arg0] = local50;
			} else {
				this.aBoolean199 = false;
			}
			this.aClass14_21.method308(local50);
			return this.anIntArrayArray19[local50.anInt3692];
		}
	}
}
