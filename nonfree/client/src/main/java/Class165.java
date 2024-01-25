import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class165 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	private int anInt4520 = 0;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	private int anInt4521 = 0;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	private int anInt4524 = 0;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "Lclient!tu;")
	private Class19 aClass19_1 = null;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_24;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!ha;")
	private final Class98 aClass98_3;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[Lclient!wo;")
	private final Class12[] aClass12Array1;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "Lclient!mb;")
	public final Class12_Sub5 aClass12_Sub5_1;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class165(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_24 = arg0;
		this.aClass98_3 = new Class98(arg0);
		this.aClass12Array1 = new Class12[10];
		this.aClass12Array1[1] = new Class12_Sub2(arg0);
		this.aClass12Array1[2] = new Class12_Sub8(arg0, this.aClass98_3);
		this.aClass12Array1[4] = new Class12_Sub6(arg0, this.aClass98_3);
		this.aClass12Array1[5] = new Class12_Sub3(arg0, this.aClass98_3);
		this.aClass12Array1[6] = new Class12_Sub4(arg0);
		this.aClass12Array1[7] = new Class12_Sub9(arg0);
		this.aClass12Array1[3] = this.aClass12_Sub5_1 = new Class12_Sub5(arg0);
		this.aClass12Array1[8] = new Class12_Sub7(arg0, this.aClass98_3);
		this.aClass12Array1[9] = new Class12_Sub1(arg0, this.aClass98_3);
		if (!this.aClass12Array1[8].method6091()) {
			this.aClass12Array1[8] = this.aClass12Array1[4];
		}
		if (!this.aClass12Array1[9].method6091()) {
			this.aClass12Array1[9] = this.aClass12Array1[8];
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Z")
	public boolean method3827() {
		return this.aClass12Array1[3].method6091();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZZI)V")
	public void method3828(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass66_Sub2_24.method4978();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt4524 != arg2) {
			if (this.anInt4524 != 0) {
				this.aClass12Array1[Integer.MAX_VALUE & this.anInt4524].method6096();
			}
			if (arg2 != 0) {
				this.aClass12Array1[Integer.MAX_VALUE & arg2].method6097(arg0);
				this.aClass12Array1[Integer.MAX_VALUE & arg2].method6092(arg0);
			}
			this.anInt4520 = Integer.MIN_VALUE;
			this.anInt4524 = arg2;
			this.anInt4521 = Integer.MIN_VALUE;
			this.aClass19_1 = null;
		} else if (this.anInt4524 != 0) {
			this.aClass12Array1[this.anInt4524 & Integer.MAX_VALUE].method6092(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public void method3830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((this.anInt4520 != arg1 | this.anInt4521 != arg0) & this.anInt4524 != 0) {
			this.aClass12Array1[this.anInt4524 & Integer.MAX_VALUE].method6094(arg0, arg1);
			this.anInt4521 = arg0;
			this.anInt4520 = arg1;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!tu;B)Z")
	public boolean method3832(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		if (this.anInt4524 == 0) {
			return false;
		}
		if (this.aClass19_1 != arg1) {
			this.aClass12Array1[Integer.MAX_VALUE & this.anInt4524].method6090(arg0, arg1);
			this.aClass19_1 = arg1;
		}
		return true;
	}
}
