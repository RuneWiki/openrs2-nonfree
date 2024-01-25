import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class320 {

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "Lclient!av;")
	private Class24 aClass24_1 = null;

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
	private int anInt8127 = 0;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
	private int anInt8129 = 0;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
	private int anInt8130 = 0;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_39;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "Lclient!ud;")
	private final Class335 aClass335_5;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "[Lclient!eb;")
	private final Class46[] aClass46Array1;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "Lclient!hj;")
	public final Class46_Sub5 aClass46_Sub5_1;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class320(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_39 = arg0;
		this.aClass335_5 = new Class335(arg0);
		this.aClass46Array1 = new Class46[10];
		this.aClass46Array1[1] = new Class46_Sub6(arg0);
		this.aClass46Array1[2] = new Class46_Sub1(arg0, this.aClass335_5);
		this.aClass46Array1[4] = new Class46_Sub3(arg0, this.aClass335_5);
		this.aClass46Array1[5] = new Class46_Sub9(arg0, this.aClass335_5);
		this.aClass46Array1[6] = new Class46_Sub8(arg0);
		this.aClass46Array1[7] = new Class46_Sub7(arg0);
		this.aClass46Array1[3] = this.aClass46_Sub5_1 = new Class46_Sub5(arg0);
		this.aClass46Array1[8] = new Class46_Sub2(arg0, this.aClass335_5);
		this.aClass46Array1[9] = new Class46_Sub4(arg0, this.aClass335_5);
		if (!this.aClass46Array1[8].method7207()) {
			this.aClass46Array1[8] = this.aClass46Array1[4];
		}
		if (!this.aClass46Array1[9].method7207()) {
			this.aClass46Array1[9] = this.aClass46Array1[8];
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZZII)V")
	public void method6753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg2 & this.aClass45_Sub3_39.method7430();
		if (!local9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt8130) {
			if (this.anInt8130 != 0) {
				this.aClass46Array1[Integer.MAX_VALUE & this.anInt8130].method7205();
			}
			if (arg4 != 0) {
				this.aClass46Array1[Integer.MAX_VALUE & arg4].method7200(arg3);
				this.aClass46Array1[Integer.MAX_VALUE & arg4].method7206(arg3);
				this.aClass46Array1[arg4 & Integer.MAX_VALUE].method7202(arg1, arg0);
			}
			this.anInt8127 = arg1;
			this.aClass24_1 = null;
			this.anInt8129 = arg0;
			this.anInt8130 = arg4;
		} else if (this.anInt8130 != 0) {
			this.aClass46Array1[this.anInt8130 & Integer.MAX_VALUE].method7206(arg3);
			if (this.anInt8129 != arg0 || arg1 != this.anInt8127) {
				this.aClass46Array1[Integer.MAX_VALUE & this.anInt8130].method7202(arg1, arg0);
				this.anInt8129 = arg0;
				this.anInt8127 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)Z")
	public boolean method6754() {
		return this.aClass46Array1[3].method7207();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!av;I)Z")
	public boolean method6755(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8130 == 0) {
			return false;
		}
		if (this.aClass24_1 != arg0) {
			this.aClass46Array1[this.anInt8130 & Integer.MAX_VALUE].method7208(arg1, arg0);
			this.aClass24_1 = arg0;
		}
		return true;
	}
}
