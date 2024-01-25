import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class90 {

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	private int anInt2682 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	private int anInt2680 = 0;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private int anInt2686 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_14;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!cd;")
	private final Class45 aClass45_4;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[Lclient!bp;")
	private final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!sl;")
	public final Class6_Sub6 aClass6_Sub6_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class90(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_14 = arg0;
		this.aClass45_4 = new Class45(arg0);
		this.aClass6Array1 = new Class6[10];
		this.aClass6Array1[1] = new Class6_Sub5(arg0);
		this.aClass6Array1[2] = new Class6_Sub2(arg0, this.aClass45_4);
		this.aClass6Array1[4] = new Class6_Sub4(arg0, this.aClass45_4);
		this.aClass6Array1[5] = new Class6_Sub8(arg0, this.aClass45_4);
		this.aClass6Array1[6] = new Class6_Sub7(arg0);
		this.aClass6Array1[7] = new Class6_Sub9(arg0);
		this.aClass6Array1[3] = this.aClass6_Sub6_1 = new Class6_Sub6(arg0);
		this.aClass6Array1[8] = new Class6_Sub3(arg0, this.aClass45_4);
		this.aClass6Array1[9] = new Class6_Sub1(arg0, this.aClass45_4);
		if (!this.aClass6Array1[8].method8025()) {
			this.aClass6Array1[8] = this.aClass6Array1[4];
		}
		if (!this.aClass6Array1[9].method8025()) {
			this.aClass6Array1[9] = this.aClass6Array1[8];
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIZI)V")
	public void method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass82_Sub1_14.method6183();
		if (!local5 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg0 = arg3;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt2680 != arg1) {
			if (this.anInt2680 != 0) {
				this.aClass6Array1[Integer.MAX_VALUE & this.anInt2680].method8031();
			}
			if (arg1 != 0) {
				this.aClass6Array1[arg1 & Integer.MAX_VALUE].method8028(arg4);
				this.aClass6Array1[Integer.MAX_VALUE & arg1].method8026(arg4);
				this.aClass6Array1[arg1 & Integer.MAX_VALUE].method8024(arg3, arg0);
			}
			this.anInt2686 = arg0;
			this.anInt2680 = arg1;
			this.anInt2682 = arg3;
		} else if (this.anInt2680 != 0) {
			this.aClass6Array1[Integer.MAX_VALUE & this.anInt2680].method8026(arg4);
			if (arg3 != this.anInt2682 || arg0 != this.anInt2686) {
				this.aClass6Array1[Integer.MAX_VALUE & this.anInt2680].method8024(arg3, arg0);
				this.anInt2682 = arg3;
				this.anInt2686 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
	public boolean method2239() {
		return this.aClass6Array1[3].method8025();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!wu;)Z")
	public boolean method2242(@OriginalArg(0) int arg0, @OriginalArg(2) Class94 arg1) {
		if (this.anInt2680 == 0) {
			return false;
		} else {
			this.aClass6Array1[Integer.MAX_VALUE & this.anInt2680].method8029(arg1, arg0);
			return true;
		}
	}
}
