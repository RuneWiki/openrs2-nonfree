import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class39 implements Interface3 {

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!nd;")
	private Class53 aClass53_9 = new Class53();

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	private int anInt1369 = 128;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt1373 = 0;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	private final int anInt1377;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!kb;")
	private final Class41 aClass41_6;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[Lclient!ka;")
	private final Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;IDI)V")
	public Class39(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt1369 = arg4;
		this.anInt1377 = arg2;
		this.anInt1373 = this.anInt1377;
		this.aClass41_6 = arg1;
		@Pc(38) int[] local38 = arg0.method1712(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub11Array1 = new Class1_Sub11[arg0.method1700(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub20 local63 = new Class1_Sub20(arg0.method1710(0, local38[local50]));
			this.aClass1_Sub11Array1[local38[local50]] = new Class1_Sub11(local63);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method1038() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass1_Sub11Array1.length; local3++) {
			if (this.aClass1_Sub11Array1[local3] != null) {
				this.aClass1_Sub11Array1[local3].method1099();
			}
		}
		this.aClass53_9 = new Class53();
		this.anInt1373 = this.anInt1377;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method1037(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub11Array1[arg0].aBoolean43;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ID)V")
	public void method1040(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1038();
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1035(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub11 local13 = this.aClass1_Sub11Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray237 != null) {
				this.aClass53_9.method1451(local13);
				local13.aBoolean42 = true;
				return local13.anIntArray237;
			}
			@Pc(38) boolean local38 = local13.method1100(this.aDouble9, this.anInt1369, this.aClass41_6);
			if (local38) {
				if (this.anInt1373 == 0) {
					@Pc(57) Class1_Sub11 local57 = (Class1_Sub11) this.aClass53_9.method1445();
					local57.method1099();
				} else {
					this.anInt1373--;
				}
				this.aClass53_9.method1451(local13);
				local13.aBoolean42 = true;
				return local13.anIntArray237;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1036(@OriginalArg(0) int arg0) {
		return this.anInt1369 == 64;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
	@Override
	public int method1034(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub11Array1[arg0] == null ? 0 : this.aClass1_Sub11Array1[arg0].anInt1460;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
	public void method1044(@OriginalArg(0) int arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.aClass1_Sub11Array1.length; local13++) {
			@Pc(20) Class1_Sub11 local20 = this.aClass1_Sub11Array1[local13];
			if (local20 != null && local20.anInt1461 != 0 && local20.aBoolean42) {
				local20.method1101(arg0);
				local20.aBoolean42 = false;
			}
		}
	}
}
