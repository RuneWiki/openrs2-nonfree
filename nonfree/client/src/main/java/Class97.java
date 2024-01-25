import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class97 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	private int anInt2735 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2740 = 0;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	private int anInt2741 = 0;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!lr;")
	private Class137 aClass137_1 = null;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_13;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!hl;")
	private final Class100 aClass100_2;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[Lclient!hw;")
	private final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!cs;")
	public final Class38_Sub2 aClass38_Sub2_1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class97(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_13 = arg0;
		this.aClass100_2 = new Class100(arg0);
		this.aClass38Array1 = new Class38[10];
		this.aClass38Array1[1] = new Class38_Sub8(arg0);
		this.aClass38Array1[2] = new Class38_Sub4(arg0, this.aClass100_2);
		this.aClass38Array1[4] = new Class38_Sub9(arg0, this.aClass100_2);
		this.aClass38Array1[5] = new Class38_Sub5(arg0, this.aClass100_2);
		this.aClass38Array1[6] = new Class38_Sub3(arg0);
		this.aClass38Array1[7] = new Class38_Sub6(arg0);
		this.aClass38Array1[3] = this.aClass38_Sub2_1 = new Class38_Sub2(arg0);
		this.aClass38Array1[8] = new Class38_Sub1(arg0, this.aClass100_2);
		this.aClass38Array1[9] = new Class38_Sub7(arg0, this.aClass100_2);
		if (!this.aClass38Array1[8].method5704()) {
			this.aClass38Array1[8] = this.aClass38Array1[4];
		}
		if (!this.aClass38Array1[9].method5704()) {
			this.aClass38Array1[9] = this.aClass38Array1[8];
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!lr;II)Z")
	public boolean method2331(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2741 == 0) {
			return false;
		}
		if (this.aClass137_1 != arg0) {
			this.aClass38Array1[this.anInt2741 & Integer.MAX_VALUE].method5710(arg0, arg1);
			this.aClass137_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
	public boolean method2332() {
		return this.aClass38Array1[3].method5704();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZZII)V")
	public void method2333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass167_Sub1_13.method5962();
		if (!local5 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg0 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt2741) {
			if (this.anInt2741 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt2741].method5706();
			}
			if (arg1 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & arg1].method5707(arg3);
				this.aClass38Array1[arg1 & Integer.MAX_VALUE].method5708(arg3);
				this.aClass38Array1[Integer.MAX_VALUE & arg1].method5703(arg0, arg4);
			}
			this.anInt2741 = arg1;
			this.aClass137_1 = null;
			this.anInt2735 = arg4;
			this.anInt2740 = arg0;
		} else if (this.anInt2741 != 0) {
			this.aClass38Array1[this.anInt2741 & Integer.MAX_VALUE].method5708(arg3);
			if (arg4 != this.anInt2735 || arg0 != this.anInt2740) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt2741].method5703(arg0, arg4);
				this.anInt2740 = arg0;
				this.anInt2735 = arg4;
			}
		}
	}
}
