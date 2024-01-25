import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class240 {

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	private int anInt6622 = 0;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!he;")
	private Class10 aClass10_1 = null;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
	private int anInt6621 = 0;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	private int anInt6625 = 0;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_38;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!qf;")
	private final Class198 aClass198_5;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "[Lclient!ov;")
	private final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "Lclient!tf;")
	public final Class38_Sub8 aClass38_Sub8_1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class240(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_38 = arg0;
		this.aClass198_5 = new Class198(arg0);
		this.aClass38Array1 = new Class38[10];
		this.aClass38Array1[1] = new Class38_Sub2(arg0);
		this.aClass38Array1[2] = new Class38_Sub1(arg0, this.aClass198_5);
		this.aClass38Array1[4] = new Class38_Sub5(arg0, this.aClass198_5);
		this.aClass38Array1[5] = new Class38_Sub9(arg0, this.aClass198_5);
		this.aClass38Array1[6] = new Class38_Sub7(arg0);
		this.aClass38Array1[7] = new Class38_Sub4(arg0);
		this.aClass38Array1[3] = this.aClass38_Sub8_1 = new Class38_Sub8(arg0);
		this.aClass38Array1[8] = new Class38_Sub3(arg0, this.aClass198_5);
		this.aClass38Array1[9] = new Class38_Sub6(arg0, this.aClass198_5);
		if (!this.aClass38Array1[8].method5823()) {
			this.aClass38Array1[8] = this.aClass38Array1[4];
		}
		if (!this.aClass38Array1[9].method5823()) {
			this.aClass38Array1[9] = this.aClass38Array1[8];
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!he;I)Z")
	public boolean method5185(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6621 == 0) {
			return false;
		}
		if (arg0 != this.aClass10_1) {
			this.aClass38Array1[Integer.MAX_VALUE & this.anInt6621].method5821(arg0, arg1);
			this.aClass10_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIBZII)V")
	public void method5188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass34_Sub2_38.method5770();
		if (!local5 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg3 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt6621 != arg1) {
			if (this.anInt6621 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt6621].method5824();
			}
			if (arg1 != 0) {
				this.aClass38Array1[arg1 & Integer.MAX_VALUE].method5820(arg0);
				this.aClass38Array1[arg1 & Integer.MAX_VALUE].method5825(arg0);
				this.aClass38Array1[arg1 & Integer.MAX_VALUE].method5827(arg3, arg4);
			}
			this.aClass10_1 = null;
			this.anInt6625 = arg4;
			this.anInt6621 = arg1;
			this.anInt6622 = arg3;
		} else if (this.anInt6621 != 0) {
			this.aClass38Array1[this.anInt6621 & Integer.MAX_VALUE].method5825(arg0);
			if (arg4 != this.anInt6625 || arg3 != this.anInt6622) {
				this.aClass38Array1[this.anInt6621 & Integer.MAX_VALUE].method5827(arg3, arg4);
				this.anInt6625 = arg4;
				this.anInt6622 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)Z")
	public boolean method5190() {
		return this.aClass38Array1[3].method5823();
	}
}
