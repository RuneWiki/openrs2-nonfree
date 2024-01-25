import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class327 {

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	private int anInt9326 = 0;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	private int anInt9330 = 0;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	private int anInt9333 = 0;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_33;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!bb;")
	private final Class30 aClass30_5;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "[Lclient!mh;")
	private final Class99[] aClass99Array1;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "Lclient!qe;")
	public final Class99_Sub6 aClass99_Sub6_1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class327(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_33 = arg0;
		this.aClass30_5 = new Class30(arg0);
		this.aClass99Array1 = new Class99[10];
		this.aClass99Array1[1] = new Class99_Sub2(arg0);
		this.aClass99Array1[2] = new Class99_Sub5(arg0, this.aClass30_5);
		this.aClass99Array1[4] = new Class99_Sub4(arg0, this.aClass30_5);
		this.aClass99Array1[5] = new Class99_Sub9(arg0, this.aClass30_5);
		this.aClass99Array1[6] = new Class99_Sub8(arg0);
		this.aClass99Array1[7] = new Class99_Sub1(arg0);
		this.aClass99Array1[3] = this.aClass99_Sub6_1 = new Class99_Sub6(arg0);
		this.aClass99Array1[8] = new Class99_Sub3(arg0, this.aClass30_5);
		this.aClass99Array1[9] = new Class99_Sub7(arg0, this.aClass30_5);
		if (!this.aClass99Array1[8].method8718()) {
			this.aClass99Array1[8] = this.aClass99Array1[4];
		}
		if (!this.aClass99Array1[9].method8718()) {
			this.aClass99Array1[9] = this.aClass99Array1[8];
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!mw;II)Z")
	public boolean method7999(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9333 == 0) {
			return false;
		} else {
			this.aClass99Array1[this.anInt9333 & Integer.MAX_VALUE].method8722(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)Z")
	public boolean method8001() {
		return this.aClass99Array1[3].method8718();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZBIZII)V")
	public void method8003(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass57_Sub2_33.method7664();
		if (!local5 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg4 = arg1;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg2) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt9333) {
			if (this.anInt9333 != 0) {
				this.aClass99Array1[this.anInt9333 & Integer.MAX_VALUE].method8726();
			}
			if (arg3 != 0) {
				this.aClass99Array1[arg3 & Integer.MAX_VALUE].method8720(arg2);
				this.aClass99Array1[Integer.MAX_VALUE & arg3].method8723(arg2);
				this.aClass99Array1[arg3 & Integer.MAX_VALUE].method8716(arg4, arg1);
			}
			this.anInt9326 = arg4;
			this.anInt9330 = arg1;
			this.anInt9333 = arg3;
		} else if (this.anInt9333 != 0) {
			this.aClass99Array1[this.anInt9333 & Integer.MAX_VALUE].method8723(arg2);
			if (arg1 != this.anInt9330 || this.anInt9326 != arg4) {
				this.aClass99Array1[Integer.MAX_VALUE & this.anInt9333].method8716(arg4, arg1);
				this.anInt9326 = arg4;
				this.anInt9330 = arg1;
			}
		}
	}
}
