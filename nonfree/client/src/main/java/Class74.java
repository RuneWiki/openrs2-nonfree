import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class74 {

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt3210 = -1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	private int anInt3205 = 0;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!db;")
	private Class19 aClass19_13 = new Class19();

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	private int anInt3203;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	private int anInt3213;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "[Lclient!cd;")
	private Class1_Sub5[] aClass1_Sub5Array1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3203 = arg1;
		this.anInt3213 = arg0;
		this.anIntArrayArrayArray18 = new int[this.anInt3213][3][arg2];
		this.aClass1_Sub5Array1 = new Class1_Sub5[this.anInt3203];
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public void method2452() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3213; local7++) {
			this.anIntArrayArrayArray18[local7][0] = null;
			this.anIntArrayArrayArray18[local7][1] = null;
			this.anIntArrayArrayArray18[local7][2] = null;
			this.anIntArrayArrayArray18[local7] = null;
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass1_Sub5Array1 = null;
		this.aClass19_13.method619();
		this.aClass19_13 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
	public int[][] method2454(@OriginalArg(0) int arg0) {
		if (this.anInt3213 == this.anInt3203) {
			this.aBoolean175 = this.aClass1_Sub5Array1[arg0] == null;
			this.aClass1_Sub5Array1[arg0] = Static203.aClass1_Sub5_1;
			return this.anIntArrayArrayArray18[arg0];
		} else if (this.anInt3213 == 1) {
			this.aBoolean175 = this.anInt3210 != arg0;
			this.anInt3210 = arg0;
			return this.anIntArrayArrayArray18[0];
		} else {
			@Pc(71) Class1_Sub5 local71 = this.aClass1_Sub5Array1[arg0];
			if (local71 == null) {
				this.aBoolean175 = true;
				if (this.anInt3213 > this.anInt3205) {
					local71 = new Class1_Sub5(arg0, this.anInt3205);
					this.anInt3205++;
				} else {
					@Pc(109) Class1_Sub5 local109 = (Class1_Sub5) this.aClass19_13.method613();
					local71 = new Class1_Sub5(arg0, local109.anInt583);
					this.aClass1_Sub5Array1[local109.anInt584] = null;
					local109.method3530();
				}
				this.aClass1_Sub5Array1[arg0] = local71;
			} else {
				this.aBoolean175 = false;
			}
			this.aClass19_13.method618(local71);
			return this.anIntArrayArrayArray18[local71.anInt583];
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)[[[I")
	public int[][][] method2457() {
		if (this.anInt3213 != this.anInt3203) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt3213; local24++) {
			this.aClass1_Sub5Array1[local24] = Static203.aClass1_Sub5_1;
		}
		return this.anIntArrayArrayArray18;
	}
}
