import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class355 {

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
	private int anInt10056 = 0;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
	private int anInt10057 = 0;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
	private int anInt10059 = 0;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!ep;")
	private Class50 aClass50_1 = null;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_43;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "Lclient!fj;")
	private final Class105 aClass105_6;

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "[Lclient!jba;")
	private final Class15[] aClass15Array1;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "Lclient!aj;")
	public final Class15_Sub2 aClass15_Sub2_1;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class355(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_43 = arg0;
		this.aClass105_6 = new Class105(arg0);
		this.aClass15Array1 = new Class15[10];
		this.aClass15Array1[1] = new Class15_Sub7(arg0);
		this.aClass15Array1[2] = new Class15_Sub8(arg0, this.aClass105_6);
		this.aClass15Array1[4] = new Class15_Sub6(arg0, this.aClass105_6);
		this.aClass15Array1[5] = new Class15_Sub3(arg0, this.aClass105_6);
		this.aClass15Array1[6] = new Class15_Sub5(arg0);
		this.aClass15Array1[7] = new Class15_Sub4(arg0);
		this.aClass15Array1[3] = this.aClass15_Sub2_1 = new Class15_Sub2(arg0);
		this.aClass15Array1[8] = new Class15_Sub1(arg0, this.aClass105_6);
		this.aClass15Array1[9] = new Class15_Sub9(arg0, this.aClass105_6);
		if (!this.aClass15Array1[8].method6946()) {
			this.aClass15Array1[8] = this.aClass15Array1[4];
		}
		if (!this.aClass15Array1[9].method6946()) {
			this.aClass15Array1[9] = this.aClass15Array1[8];
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIIZZI)V")
	public void method7904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg3 & this.aClass31_Sub2_43.method8095();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt10059 != arg4) {
			if (this.anInt10059 != 0) {
				this.aClass15Array1[Integer.MAX_VALUE & this.anInt10059].method6944();
			}
			if (arg4 != 0) {
				this.aClass15Array1[Integer.MAX_VALUE & arg4].method6942(arg2);
				this.aClass15Array1[arg4 & Integer.MAX_VALUE].method6945(arg2);
				this.aClass15Array1[arg4 & Integer.MAX_VALUE].method6948(arg1, arg0);
			}
			this.anInt10057 = arg1;
			this.anInt10059 = arg4;
			this.anInt10056 = arg0;
			this.aClass50_1 = null;
		} else if (this.anInt10059 != 0) {
			this.aClass15Array1[this.anInt10059 & Integer.MAX_VALUE].method6945(arg2);
			if (arg0 != this.anInt10056 || this.anInt10057 != arg1) {
				this.aClass15Array1[this.anInt10059 & Integer.MAX_VALUE].method6948(arg1, arg0);
				this.anInt10056 = arg0;
				this.anInt10057 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!ep;I)Z")
	public boolean method7909(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		if (this.anInt10059 == 0) {
			return false;
		}
		if (arg1 != this.aClass50_1) {
			this.aClass15Array1[this.anInt10059 & Integer.MAX_VALUE].method6947(arg1, arg0);
			this.aClass50_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Z")
	public boolean method7910() {
		return this.aClass15Array1[3].method6946();
	}
}
