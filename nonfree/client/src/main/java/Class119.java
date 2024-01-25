import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class119 {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	private int anInt2939 = 0;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!jk;")
	private Class5 aClass5_1 = null;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
	private int anInt2935 = 0;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
	private int anInt2937 = 0;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_18;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Lclient!qh;")
	private final Class202 aClass202_3;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "[Lclient!hr;")
	private final Class84[] aClass84Array1;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!lk;")
	public final Class84_Sub5 aClass84_Sub5_1;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class119(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_18 = arg0;
		this.aClass202_3 = new Class202(arg0);
		this.aClass84Array1 = new Class84[10];
		this.aClass84Array1[1] = new Class84_Sub6(arg0);
		this.aClass84Array1[2] = new Class84_Sub8(arg0, this.aClass202_3);
		this.aClass84Array1[4] = new Class84_Sub3(arg0, this.aClass202_3);
		this.aClass84Array1[5] = new Class84_Sub9(arg0, this.aClass202_3);
		this.aClass84Array1[6] = new Class84_Sub4(arg0);
		this.aClass84Array1[7] = new Class84_Sub2(arg0);
		this.aClass84Array1[3] = this.aClass84_Sub5_1 = new Class84_Sub5(arg0);
		this.aClass84Array1[8] = new Class84_Sub7(arg0, this.aClass202_3);
		this.aClass84Array1[9] = new Class84_Sub1(arg0, this.aClass202_3);
		if (!this.aClass84Array1[8].method5155()) {
			this.aClass84Array1[8] = this.aClass84Array1[4];
		}
		if (!this.aClass84Array1[9].method5155()) {
			this.aClass84Array1[9] = this.aClass84Array1[8];
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
	public void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2937 != 0 & (this.anInt2939 != arg0 | arg1 != this.anInt2935)) {
			this.aClass84Array1[Integer.MAX_VALUE & this.anInt2937].method5154(arg0, arg1);
			this.anInt2939 = arg0;
			this.anInt2935 = arg1;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZIIZ)V")
	public void method2404(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass128_Sub2_18.method3595();
		if (!local5 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt2937 != arg1) {
			if (this.anInt2937 != 0) {
				this.aClass84Array1[this.anInt2937 & Integer.MAX_VALUE].method5153();
			}
			if (arg1 != 0) {
				this.aClass84Array1[Integer.MAX_VALUE & arg1].method5149(arg0);
				this.aClass84Array1[arg1 & Integer.MAX_VALUE].method5150(arg0);
			}
			this.anInt2935 = Integer.MIN_VALUE;
			this.aClass5_1 = null;
			this.anInt2937 = arg1;
			this.anInt2939 = Integer.MIN_VALUE;
		} else if (this.anInt2937 != 0) {
			this.aClass84Array1[Integer.MAX_VALUE & this.anInt2937].method5150(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)Z")
	public boolean method2405() {
		return this.aClass84Array1[3].method5155();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!jk;B)Z")
	public boolean method2407(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		if (this.anInt2937 == 0) {
			return false;
		}
		if (arg1 != this.aClass5_1) {
			this.aClass84Array1[Integer.MAX_VALUE & this.anInt2937].method5152(arg1, arg0);
			this.aClass5_1 = arg1;
		}
		return true;
	}
}
