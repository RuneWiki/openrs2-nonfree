import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class306 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	private int anInt8236 = 0;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!wq;")
	private Class35 aClass35_1 = null;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	private int anInt8240 = 0;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private int anInt8244 = 0;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_36;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!pba;")
	private final Class240 aClass240_6;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[Lclient!ef;")
	private final Class52[] aClass52Array1;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!vw;")
	public final Class52_Sub9 aClass52_Sub9_1;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class306(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_36 = arg0;
		this.aClass240_6 = new Class240(arg0);
		this.aClass52Array1 = new Class52[10];
		this.aClass52Array1[1] = new Class52_Sub2(arg0);
		this.aClass52Array1[2] = new Class52_Sub3(arg0, this.aClass240_6);
		this.aClass52Array1[4] = new Class52_Sub6(arg0, this.aClass240_6);
		this.aClass52Array1[5] = new Class52_Sub5(arg0, this.aClass240_6);
		this.aClass52Array1[6] = new Class52_Sub8(arg0);
		this.aClass52Array1[7] = new Class52_Sub4(arg0);
		this.aClass52Array1[3] = this.aClass52_Sub9_1 = new Class52_Sub9(arg0);
		this.aClass52Array1[8] = new Class52_Sub1(arg0, this.aClass240_6);
		this.aClass52Array1[9] = new Class52_Sub7(arg0, this.aClass240_6);
		if (!this.aClass52Array1[8].method7601()) {
			this.aClass52Array1[8] = this.aClass52Array1[4];
		}
		if (!this.aClass52Array1[9].method7601()) {
			this.aClass52Array1[9] = this.aClass52Array1[8];
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZIIZ)V")
	public void method6804(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) boolean local10 = arg0 & this.aClass121_Sub3_36.method7159();
		if (!local10 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg2 = arg1;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg4) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt8240) {
			if (this.anInt8240 != 0) {
				this.aClass52Array1[this.anInt8240 & Integer.MAX_VALUE].method7598();
			}
			if (arg3 != 0) {
				this.aClass52Array1[arg3 & Integer.MAX_VALUE].method7605(arg4);
				this.aClass52Array1[arg3 & Integer.MAX_VALUE].method7603(arg4);
				this.aClass52Array1[Integer.MAX_VALUE & arg3].method7599(arg1, arg2);
			}
			this.anInt8240 = arg3;
			this.anInt8244 = arg1;
			this.aClass35_1 = null;
			this.anInt8236 = arg2;
		} else if (this.anInt8240 != 0) {
			this.aClass52Array1[Integer.MAX_VALUE & this.anInt8240].method7603(arg4);
			if (this.anInt8244 != arg1 || this.anInt8236 != arg2) {
				this.aClass52Array1[Integer.MAX_VALUE & this.anInt8240].method7599(arg1, arg2);
				this.anInt8244 = arg1;
				this.anInt8236 = arg2;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!wq;I)Z")
	public boolean method6805(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1) {
		if (this.anInt8240 == 0) {
			return false;
		}
		if (arg1 != this.aClass35_1) {
			this.aClass52Array1[Integer.MAX_VALUE & this.anInt8240].method7604(arg1, arg0);
			this.aClass35_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
	public boolean method6808() {
		return this.aClass52Array1[3].method7601();
	}
}
