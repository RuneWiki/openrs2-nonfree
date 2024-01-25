import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class76 {

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	private int anInt2228 = 0;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	private int anInt2230 = 0;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	private int anInt2231 = 0;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_9;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!mha;")
	private final Class219 aClass219_2;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[Lclient!vaa;")
	private final Class38[] aClass38Array1;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!rfa;")
	public final Class38_Sub7 aClass38_Sub7_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class76(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_9 = arg0;
		this.aClass219_2 = new Class219(arg0);
		this.aClass38Array1 = new Class38[10];
		this.aClass38Array1[1] = new Class38_Sub4(arg0);
		this.aClass38Array1[2] = new Class38_Sub2(arg0, this.aClass219_2);
		this.aClass38Array1[4] = new Class38_Sub5(arg0, this.aClass219_2);
		this.aClass38Array1[5] = new Class38_Sub1(arg0, this.aClass219_2);
		this.aClass38Array1[6] = new Class38_Sub8(arg0);
		this.aClass38Array1[7] = new Class38_Sub3(arg0);
		this.aClass38Array1[3] = this.aClass38_Sub7_1 = new Class38_Sub7(arg0);
		this.aClass38Array1[8] = new Class38_Sub9(arg0, this.aClass219_2);
		this.aClass38Array1[9] = new Class38_Sub6(arg0, this.aClass219_2);
		if (!this.aClass38Array1[8].method7818()) {
			this.aClass38Array1[8] = this.aClass38Array1[4];
		}
		if (!this.aClass38Array1[9].method7818()) {
			this.aClass38Array1[9] = this.aClass38Array1[8];
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!il;II)Z")
	public boolean method2053(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2231 == 0) {
			return false;
		} else {
			this.aClass38Array1[Integer.MAX_VALUE & this.anInt2231].method7810(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZIIZ)V")
	public void method2054(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass13_Sub2_9.method8507();
		if (!local5 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt2231) {
			if (this.anInt2231 != 0) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt2231].method7819();
			}
			if (arg2 != 0) {
				this.aClass38Array1[arg2 & Integer.MAX_VALUE].method7812(arg4);
				this.aClass38Array1[arg2 & Integer.MAX_VALUE].method7813(arg4);
				this.aClass38Array1[arg2 & Integer.MAX_VALUE].method7814(arg0, arg3);
			}
			this.anInt2228 = arg0;
			this.anInt2231 = arg2;
			this.anInt2230 = arg3;
		} else if (this.anInt2231 != 0) {
			this.aClass38Array1[this.anInt2231 & Integer.MAX_VALUE].method7813(arg4);
			if (this.anInt2228 != arg0 || this.anInt2230 != arg3) {
				this.aClass38Array1[Integer.MAX_VALUE & this.anInt2231].method7814(arg0, arg3);
				this.anInt2228 = arg0;
				this.anInt2230 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z")
	public boolean method2056() {
		return this.aClass38Array1[3].method7818();
	}
}
