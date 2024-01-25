import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class184 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private int anInt5345 = 0;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	private int anInt5347 = 0;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!kv;")
	private Class1 aClass1_1 = null;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	private int anInt5349 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_34;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!re;")
	private final Class202 aClass202_4;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!aa;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!ef;")
	public final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class184(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_34 = arg0;
		this.aClass202_4 = new Class202(arg0);
		this.aClass2Array1 = new Class2[10];
		this.aClass2Array1[1] = new Class2_Sub5(arg0);
		this.aClass2Array1[2] = new Class2_Sub2(arg0, this.aClass202_4);
		this.aClass2Array1[4] = new Class2_Sub6(arg0, this.aClass202_4);
		this.aClass2Array1[5] = new Class2_Sub8(arg0, this.aClass202_4);
		this.aClass2Array1[6] = new Class2_Sub3(arg0);
		this.aClass2Array1[7] = new Class2_Sub9(arg0);
		this.aClass2Array1[3] = this.aClass2_Sub4_1 = new Class2_Sub4(arg0);
		this.aClass2Array1[8] = new Class2_Sub1(arg0, this.aClass202_4);
		this.aClass2Array1[9] = new Class2_Sub7(arg0, this.aClass202_4);
		if (!this.aClass2Array1[8].method5380()) {
			this.aClass2Array1[8] = this.aClass2Array1[4];
		}
		if (!this.aClass2Array1[9].method5380()) {
			this.aClass2Array1[9] = this.aClass2Array1[8];
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZZZ)V")
	public void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = arg1 & this.aClass30_Sub1_34.method4681();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt5349) {
			if (this.anInt5349 != 0) {
				this.aClass2Array1[this.anInt5349 & Integer.MAX_VALUE].method5384();
			}
			if (arg0 != 0) {
				this.aClass2Array1[arg0 & Integer.MAX_VALUE].method5386(arg2);
				this.aClass2Array1[arg0 & Integer.MAX_VALUE].method5383(arg2);
			}
			this.anInt5347 = Integer.MIN_VALUE;
			this.anInt5345 = Integer.MIN_VALUE;
			this.anInt5349 = arg0;
			this.aClass1_1 = null;
		} else if (this.anInt5349 != 0) {
			this.aClass2Array1[this.anInt5349 & Integer.MAX_VALUE].method5383(arg2);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
	public boolean method4116() {
		return this.aClass2Array1[3].method5380();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)V")
	public void method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5349 != 0 & (this.anInt5345 != arg1 | this.anInt5347 != arg0)) {
			this.aClass2Array1[this.anInt5349 & Integer.MAX_VALUE].method5385(arg0, arg1);
			this.anInt5347 = arg0;
			this.anInt5345 = arg1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!kv;II)Z")
	public boolean method4118(@OriginalArg(0) Class1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5349 == 0) {
			return false;
		}
		if (this.aClass1_1 != arg0) {
			this.aClass2Array1[this.anInt5349 & Integer.MAX_VALUE].method5382(arg1, arg0);
			this.aClass1_1 = arg0;
		}
		return true;
	}
}
