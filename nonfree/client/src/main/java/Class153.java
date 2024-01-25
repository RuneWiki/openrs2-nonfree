import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class153 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	private int anInt3975 = 0;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	private int anInt3972 = 0;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private int anInt3980 = 0;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_17;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!ol;")
	private final Class264 aClass264_2;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[Lclient!cka;")
	private final Class21[] aClass21Array1;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!ii;")
	public final Class21_Sub4 aClass21_Sub4_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class153(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_17 = arg0;
		this.aClass264_2 = new Class264(arg0);
		this.aClass21Array1 = new Class21[10];
		this.aClass21Array1[1] = new Class21_Sub2(arg0);
		this.aClass21Array1[2] = new Class21_Sub8(arg0, this.aClass264_2);
		this.aClass21Array1[4] = new Class21_Sub5(arg0, this.aClass264_2);
		this.aClass21Array1[5] = new Class21_Sub7(arg0, this.aClass264_2);
		this.aClass21Array1[6] = new Class21_Sub6(arg0);
		this.aClass21Array1[7] = new Class21_Sub9(arg0);
		this.aClass21Array1[3] = this.aClass21_Sub4_1 = new Class21_Sub4(arg0);
		this.aClass21Array1[8] = new Class21_Sub3(arg0, this.aClass264_2);
		this.aClass21Array1[9] = new Class21_Sub1(arg0, this.aClass264_2);
		if (!this.aClass21Array1[8].method8692()) {
			this.aClass21Array1[8] = this.aClass21Array1[4];
		}
		if (!this.aClass21Array1[9].method8692()) {
			this.aClass21Array1[9] = this.aClass21Array1[8];
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!qk;I)Z")
	public boolean method3375(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3980 == 0) {
			return false;
		} else {
			this.aClass21Array1[this.anInt3980 & Integer.MAX_VALUE].method8700(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
	public boolean method3376() {
		return this.aClass21Array1[3].method8692();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZZI)V")
	public void method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg3 & this.aClass16_Sub2_17.method8195();
		if (!local9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg0 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg2) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt3980) {
			if (this.anInt3980 != 0) {
				this.aClass21Array1[this.anInt3980 & Integer.MAX_VALUE].method8695();
			}
			if (arg1 != 0) {
				this.aClass21Array1[arg1 & Integer.MAX_VALUE].method8698(arg2);
				this.aClass21Array1[arg1 & Integer.MAX_VALUE].method8697(arg2);
				this.aClass21Array1[arg1 & Integer.MAX_VALUE].method8696(arg4, arg0);
			}
			this.anInt3980 = arg1;
			this.anInt3972 = arg4;
			this.anInt3975 = arg0;
		} else if (this.anInt3980 != 0) {
			this.aClass21Array1[this.anInt3980 & Integer.MAX_VALUE].method8697(arg2);
			if (arg4 != this.anInt3972 || arg0 != this.anInt3975) {
				this.aClass21Array1[this.anInt3980 & Integer.MAX_VALUE].method8696(arg4, arg0);
				this.anInt3972 = arg4;
				this.anInt3975 = arg0;
			}
			return;
		}
	}
}
