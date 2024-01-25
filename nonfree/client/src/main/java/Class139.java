import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class139 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!vo;")
	private Class19 aClass19_1 = null;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	private int anInt4060 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	private int anInt4059 = 0;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_29;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!le;")
	private final Class120 aClass120_3;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "[Lclient!jh;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class139(@OriginalArg(0) Class63_Sub1 arg0) {
		this.aClass63_Sub1_29 = arg0;
		this.aClass120_3 = new Class120(arg0);
		this.aClass2Array1 = new Class2[9];
		this.aClass2Array1[1] = new Class2_Sub1(arg0);
		this.aClass2Array1[2] = new Class2_Sub6(arg0, this.aClass120_3);
		this.aClass2Array1[4] = new Class2_Sub7(arg0, this.aClass120_3);
		this.aClass2Array1[5] = new Class2_Sub4(arg0, this.aClass120_3);
		this.aClass2Array1[6] = new Class2_Sub3(arg0);
		this.aClass2Array1[7] = new Class2_Sub2(arg0);
		this.aClass2Array1[3] = new Class2_Sub5(arg0);
		this.aClass2Array1[8] = this.aClass2Array1[4];
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZB)V")
	public void method3748(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass63_Sub1_29.method4558();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt4060 != arg0) {
			if (this.anInt4060 != 0) {
				this.aClass2Array1[this.anInt4060 & Integer.MAX_VALUE].method3770();
			}
			if (arg0 != 0) {
				this.aClass2Array1[Integer.MAX_VALUE & arg0].method3767(arg1);
				this.aClass2Array1[Integer.MAX_VALUE & arg0].method3765(arg1);
			}
			this.anInt4059 = Integer.MIN_VALUE;
			this.aClass19_1 = null;
			this.anInt4060 = arg0;
		} else if (this.anInt4060 != 0) {
			this.aClass2Array1[this.anInt4060 & Integer.MAX_VALUE].method3765(arg1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!vo;I)Z")
	public boolean method3749(@OriginalArg(0) Class19 arg0) {
		if (this.anInt4060 == 0) {
			return false;
		}
		if (arg0 != this.aClass19_1) {
			this.aClass2Array1[Integer.MAX_VALUE & this.anInt4060].method3769(arg0);
			this.aClass19_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)Z")
	public boolean method3750() {
		return this.aClass2Array1[3].method3768();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZB)V")
	public void method3751(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if ((arg0 != this.anInt4059 | arg1) & this.anInt4060 != 0) {
			this.aClass2Array1[this.anInt4060 & Integer.MAX_VALUE].method3766(arg0);
			this.anInt4059 = arg0;
		}
	}
}
