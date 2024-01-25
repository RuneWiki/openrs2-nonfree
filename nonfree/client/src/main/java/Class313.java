import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class313 {

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	private int anInt9091 = 0;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	private int anInt9096 = 0;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	private int anInt9093 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_35;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!sn;")
	private final Class336 aClass336_6;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[Lclient!cb;")
	private final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!bha;")
	public final Class38_Sub1 aClass38_Sub1_1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class313(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_35 = arg0;
		this.aClass336_6 = new Class336(arg0);
		this.aClass38Array1 = new Class38[10];
		this.aClass38Array1[1] = new Class38_Sub7(arg0);
		this.aClass38Array1[2] = new Class38_Sub6(arg0, this.aClass336_6);
		this.aClass38Array1[4] = new Class38_Sub4(arg0, this.aClass336_6);
		this.aClass38Array1[5] = new Class38_Sub5(arg0, this.aClass336_6);
		this.aClass38Array1[6] = new Class38_Sub2(arg0);
		this.aClass38Array1[7] = new Class38_Sub9(arg0);
		this.aClass38Array1[3] = this.aClass38_Sub1_1 = new Class38_Sub1(arg0);
		this.aClass38Array1[8] = new Class38_Sub8(arg0, this.aClass336_6);
		this.aClass38Array1[9] = new Class38_Sub3(arg0, this.aClass336_6);
		if (!this.aClass38Array1[8].method9403()) {
			this.aClass38Array1[8] = this.aClass38Array1[4];
		}
		if (!this.aClass38Array1[9].method9403()) {
			this.aClass38Array1[9] = this.aClass38Array1[8];
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZZII)V")
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) boolean local14 = arg1 & this.aClass144_Sub3_35.method6897();
		if (!local14 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg4 = arg3;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt9093 != arg0) {
			if (this.anInt9093 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt9093].method9402();
			}
			if (arg0 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & arg0].method9406(arg2);
				this.aClass38Array1[Integer.MAX_VALUE & arg0].method9399(arg2);
				this.aClass38Array1[Integer.MAX_VALUE & arg0].method9398(arg3, arg4);
			}
			this.anInt9091 = arg4;
			this.anInt9093 = arg0;
			this.anInt9096 = arg3;
		} else if (this.anInt9093 != 0) {
			this.aClass38Array1[Integer.MAX_VALUE & this.anInt9093].method9399(arg2);
			if (arg3 != this.anInt9096 || arg4 != this.anInt9091) {
				this.aClass38Array1[this.anInt9093 & Integer.MAX_VALUE].method9398(arg3, arg4);
				this.anInt9091 = arg4;
				this.anInt9096 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BILclient!pu;)Z")
	public boolean method7843(@OriginalArg(1) int arg0, @OriginalArg(2) Class161 arg1) {
		if (this.anInt9093 == 0) {
			return false;
		} else {
			this.aClass38Array1[Integer.MAX_VALUE & this.anInt9093].method9401(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
	public boolean method7844() {
		return this.aClass38Array1[3].method9403();
	}
}
