import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class119 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	private int anInt3050 = 0;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	private int anInt3051 = 0;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!ed;")
	private Class64 aClass64_1 = null;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
	private int anInt3053 = 0;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_14;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!wc;")
	private final Class266 aClass266_3;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[Lclient!wi;")
	private final Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!cj;")
	public final Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class119(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_14 = arg0;
		this.aClass266_3 = new Class266(arg0);
		this.aClass40Array1 = new Class40[10];
		this.aClass40Array1[1] = new Class40_Sub8(arg0);
		this.aClass40Array1[2] = new Class40_Sub4(arg0, this.aClass266_3);
		this.aClass40Array1[4] = new Class40_Sub5(arg0, this.aClass266_3);
		this.aClass40Array1[5] = new Class40_Sub6(arg0, this.aClass266_3);
		this.aClass40Array1[6] = new Class40_Sub7(arg0);
		this.aClass40Array1[7] = new Class40_Sub9(arg0);
		this.aClass40Array1[3] = this.aClass40_Sub1_1 = new Class40_Sub1(arg0);
		this.aClass40Array1[8] = new Class40_Sub3(arg0, this.aClass266_3);
		this.aClass40Array1[9] = new Class40_Sub2(arg0, this.aClass266_3);
		if (!this.aClass40Array1[8].method5753()) {
			this.aClass40Array1[8] = this.aClass40Array1[4];
		}
		if (!this.aClass40Array1[9].method5753()) {
			this.aClass40Array1[9] = this.aClass40Array1[8];
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZIZ)V")
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg3 & this.aClass75_Sub2_14.method5961();
		if (!local9 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg1 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt3051 != arg2) {
			if (this.anInt3051 != 0) {
				this.aClass40Array1[this.anInt3051 & Integer.MAX_VALUE].method5757();
			}
			if (arg2 != 0) {
				this.aClass40Array1[Integer.MAX_VALUE & arg2].method5758(arg4);
				this.aClass40Array1[arg2 & Integer.MAX_VALUE].method5755(arg4);
				this.aClass40Array1[Integer.MAX_VALUE & arg2].method5759(arg1, arg0);
			}
			this.anInt3053 = arg1;
			this.aClass64_1 = null;
			this.anInt3050 = arg0;
			this.anInt3051 = arg2;
		} else if (this.anInt3051 != 0) {
			this.aClass40Array1[this.anInt3051 & Integer.MAX_VALUE].method5755(arg4);
			if (arg0 != this.anInt3050 || arg1 != this.anInt3053) {
				this.aClass40Array1[Integer.MAX_VALUE & this.anInt3051].method5759(arg1, arg0);
				this.anInt3053 = arg1;
				this.anInt3050 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Z")
	public boolean method2511() {
		return this.aClass40Array1[3].method5753();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILclient!ed;)Z")
	public boolean method2513(@OriginalArg(1) int arg0, @OriginalArg(2) Class64 arg1) {
		if (this.anInt3051 == 0) {
			return false;
		}
		if (arg1 != this.aClass64_1) {
			this.aClass40Array1[this.anInt3051 & Integer.MAX_VALUE].method5760(arg0, arg1);
			this.aClass64_1 = arg1;
		}
		return true;
	}
}
