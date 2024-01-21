import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class56 implements Interface1 {

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
	public static int[] anIntArray215 = new int[99];

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	private int anInt2528 = 50;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	private int anInt2536 = 128;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "Lclient!c;")
	private final Class10 aClass10_82;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "Lclient!c;")
	private final Class10 aClass10_83;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!dd;")
	private Class17 aClass17_14;

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 99; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) ((double) local19 + Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D);
			local12 += local32;
			anIntArray215[local14] = local12 / 4;
		}
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!c;Lclient!c;II)V")
	public Class56(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass10_82 = arg1;
		this.aClass10_83 = arg0;
		this.anInt2536 = arg3;
		this.anInt2528 = arg2;
		this.aClass17_14 = new Class17(this.anInt2528);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method1713(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub3_Sub14 local8 = this.method1723(arg1);
		local8.aBoolean132 = true;
		return local8.method2120(arg0, this.aClass10_82, this.anInt2536, this);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)I")
	@Override
	public int method1716(@OriginalArg(0) int arg0) {
		return this.method1723(arg0).anInt3184;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZI)Z")
	@Override
	public boolean method1717(@OriginalArg(1) int arg0) {
		return this.anInt2536 == 64 || this.method1723(arg0).anInt3189 == 64;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(ZI)V")
	public void method1720(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class2_Sub3_Sub14 local7 = (Class2_Sub3_Sub14) this.aClass17_14.method511(); local7 != null; local7 = (Class2_Sub3_Sub14) this.aClass17_14.method515()) {
			if (local7.aBoolean132) {
				local7.method2119(arg0);
				local7.aBoolean132 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1715(@OriginalArg(1) int arg0) {
		return this.method1723(arg0).aBoolean131;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)Lclient!qf;")
	private Class2_Sub3_Sub14 method1723(@OriginalArg(0) int arg0) {
		@Pc(20) Class2_Sub3_Sub14 local20 = (Class2_Sub3_Sub14) this.aClass17_14.method505((long) arg0);
		if (local20 != null) {
			return local20;
		}
		@Pc(31) byte[] local31 = this.aClass10_83.method1605(arg0, 0);
		if (local31 == null) {
			return Static60.method926();
		} else {
			@Pc(41) Class2_Sub13 local41 = new Class2_Sub13(local31);
			local20 = new Class2_Sub3_Sub14(local41);
			this.aClass17_14.method508((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public void method1724() {
		this.aClass17_14 = new Class17(this.anInt2528);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method1714(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub13 local9 = new Class2_Sub13(this.aClass10_83.method1605(arg0, 0));
		@Pc(23) Class2_Sub3_Sub14 local23 = new Class2_Sub3_Sub14(local9);
		return local23.method2117(this, this.anInt2536, this.aClass10_82);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1712(@OriginalArg(0) int arg0) {
		return this.method1723(arg0).aBoolean130;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1718(@OriginalArg(0) int arg0) {
		return this.method1723(arg0).method2118(this, this.aClass10_82);
	}
}
