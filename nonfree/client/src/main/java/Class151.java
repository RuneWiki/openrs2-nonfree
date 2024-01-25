import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class151 {

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
	private int anInt3945 = 0;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "Lclient!gq;")
	private Class11 aClass11_1 = null;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
	private int anInt3946 = 0;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	private int anInt3948 = 0;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_17;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "Lclient!pm;")
	private final Class256 aClass256_1;

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "[Lclient!oj;")
	private final Class75[] aClass75Array1;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Lclient!eb;")
	public final Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class151(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_17 = arg0;
		this.aClass256_1 = new Class256(arg0);
		this.aClass75Array1 = new Class75[10];
		this.aClass75Array1[1] = new Class75_Sub9(arg0);
		this.aClass75Array1[2] = new Class75_Sub2(arg0, this.aClass256_1);
		this.aClass75Array1[4] = new Class75_Sub6(arg0, this.aClass256_1);
		this.aClass75Array1[5] = new Class75_Sub7(arg0, this.aClass256_1);
		this.aClass75Array1[6] = new Class75_Sub8(arg0);
		this.aClass75Array1[7] = new Class75_Sub3(arg0);
		this.aClass75Array1[3] = this.aClass75_Sub1_1 = new Class75_Sub1(arg0);
		this.aClass75Array1[8] = new Class75_Sub4(arg0, this.aClass256_1);
		this.aClass75Array1[9] = new Class75_Sub5(arg0, this.aClass256_1);
		if (!this.aClass75Array1[8].method8295()) {
			this.aClass75Array1[8] = this.aClass75Array1[4];
		}
		if (!this.aClass75Array1[9].method8295()) {
			this.aClass75Array1[9] = this.aClass75Array1[8];
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)Z")
	public boolean method3393() {
		return this.aClass75Array1[3].method8295();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZZIIZ)V")
	public void method3394(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass15_Sub3_17.method5333();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg3 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt3945) {
			if (this.anInt3945 != 0) {
				this.aClass75Array1[Integer.MAX_VALUE & this.anInt3945].method8290();
			}
			if (arg4 != 0) {
				this.aClass75Array1[arg4 & Integer.MAX_VALUE].method8293(arg2);
				this.aClass75Array1[arg4 & Integer.MAX_VALUE].method8296(arg2);
				this.aClass75Array1[arg4 & Integer.MAX_VALUE].method8294(arg0, arg3);
			}
			this.anInt3948 = arg0;
			this.anInt3945 = arg4;
			this.anInt3946 = arg3;
			this.aClass11_1 = null;
		} else if (this.anInt3945 != 0) {
			this.aClass75Array1[this.anInt3945 & Integer.MAX_VALUE].method8296(arg2);
			if (arg0 != this.anInt3948 || arg3 != this.anInt3946) {
				this.aClass75Array1[Integer.MAX_VALUE & this.anInt3945].method8294(arg0, arg3);
				this.anInt3948 = arg0;
				this.anInt3946 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!gq;I)Z")
	public boolean method3395(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3945 == 0) {
			return false;
		}
		if (this.aClass11_1 != arg0) {
			this.aClass75Array1[Integer.MAX_VALUE & this.anInt3945].method8289(arg1, arg0);
			this.aClass11_1 = arg0;
		}
		return true;
	}
}
