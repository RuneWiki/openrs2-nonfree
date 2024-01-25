import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class342 {

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int anInt9516 = 0;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	private int anInt9518 = 0;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	private int anInt9521 = 0;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_35;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "Lclient!wo;")
	private final Class391 aClass391_4;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "[Lclient!mk;")
	private final Class231[] aClass231Array1;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!pp;")
	public final Class231_Sub4 aClass231_Sub4_1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class342(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_35 = arg0;
		this.aClass391_4 = new Class391(arg0);
		this.aClass231Array1 = new Class231[10];
		this.aClass231Array1[1] = new Class231_Sub6(arg0);
		this.aClass231Array1[2] = new Class231_Sub1(arg0, this.aClass391_4);
		this.aClass231Array1[4] = new Class231_Sub9(arg0, this.aClass391_4);
		this.aClass231Array1[5] = new Class231_Sub2(arg0, this.aClass391_4);
		this.aClass231Array1[6] = new Class231_Sub8(arg0);
		this.aClass231Array1[7] = new Class231_Sub3(arg0);
		this.aClass231Array1[3] = this.aClass231_Sub4_1 = new Class231_Sub4(arg0);
		this.aClass231Array1[8] = new Class231_Sub7(arg0, this.aClass391_4);
		this.aClass231Array1[9] = new Class231_Sub5(arg0, this.aClass391_4);
		if (!this.aClass231Array1[8].method8714()) {
			this.aClass231Array1[8] = this.aClass231Array1[4];
		}
		if (!this.aClass231Array1[9].method8714()) {
			this.aClass231Array1[9] = this.aClass231Array1[8];
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIZZI)V")
	public void method8005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg2 & this.aClass65_Sub1_35.method6889();
		if (!local9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg0 = arg1;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt9516) {
			if (this.anInt9516 != 0) {
				this.aClass231Array1[this.anInt9516 & Integer.MAX_VALUE].method8716();
			}
			if (arg4 != 0) {
				this.aClass231Array1[arg4 & Integer.MAX_VALUE].method8713(arg3);
				this.aClass231Array1[Integer.MAX_VALUE & arg4].method8717(arg3);
				this.aClass231Array1[arg4 & Integer.MAX_VALUE].method8715(arg0, arg1);
			}
			this.anInt9518 = arg0;
			this.anInt9516 = arg4;
			this.anInt9521 = arg1;
		} else if (this.anInt9516 != 0) {
			this.aClass231Array1[Integer.MAX_VALUE & this.anInt9516].method8717(arg3);
			if (this.anInt9521 != arg1 || this.anInt9518 != arg0) {
				this.aClass231Array1[this.anInt9516 & Integer.MAX_VALUE].method8715(arg0, arg1);
				this.anInt9521 = arg1;
				this.anInt9518 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	public boolean method8006() {
		return this.aClass231Array1[3].method8714();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!wj;I)Z")
	public boolean method8007(@OriginalArg(1) Class80 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9516 == 0) {
			return false;
		} else {
			this.aClass231Array1[Integer.MAX_VALUE & this.anInt9516].method8712(arg0, arg1);
			return true;
		}
	}
}
