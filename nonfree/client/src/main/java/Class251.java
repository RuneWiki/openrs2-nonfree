import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class251 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[16384];

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16384];

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!nf;")
	private final Class170 aClass170_12 = new Class170();

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	private int anInt7452;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	private final int anInt7448;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!fe;")
	private final Class74 aClass74_31;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray31[local11] = (float) Math.sin((double) local11 * local9);
			aFloatArray30[local11] = (float) Math.cos((double) local11 * local9);
		}
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class251(@OriginalArg(0) int arg0) {
		this.anInt7452 = arg0;
		this.anInt7448 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass74_31 = new Class74(local16);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public int method6114() {
		return this.anInt7448;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!jb;)V")
	private void method6115(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method6525();
			arg0.method6373();
			this.anInt7452 += arg0.anInt4663;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qa;I)Ljava/lang/Object;")
	public Object method6117(@OriginalArg(0) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method2958();
		for (@Pc(22) Class6_Sub2_Sub4 local22 = (Class6_Sub2_Sub4) this.aClass74_31.method1883(local9); local22 != null; local22 = (Class6_Sub2_Sub4) this.aClass74_31.method1882()) {
			if (local22.anInterface9_3.method2959(arg0)) {
				@Pc(34) Object local34 = local22.method3930();
				if (local34 != null) {
					if (local22.method3933()) {
						@Pc(63) Class6_Sub2_Sub4_Sub2 local63 = new Class6_Sub2_Sub4_Sub2(arg0, local34, local22.anInt4663);
						this.aClass74_31.method1890(local22.aLong229, local63);
						this.aClass170_12.method4001(local63);
						local63.aLong225 = 0L;
						local22.method6525();
						local22.method6373();
					} else {
						this.aClass170_12.method4001(local22);
						local22.aLong225 = 0L;
					}
					return local34;
				}
				local22.method6525();
				local22.method6373();
				this.anInt7452 += local22.anInt4663;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public void method6118() {
		this.aClass170_12.method4007();
		this.aClass74_31.method1888();
		this.anInt7452 = this.anInt7448;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public void method6119() {
		for (@Pc(19) Class6_Sub2_Sub4 local19 = (Class6_Sub2_Sub4) this.aClass170_12.method4006(); local19 != null; local19 = (Class6_Sub2_Sub4) this.aClass170_12.method4000()) {
			if (local19.method3933()) {
				local19.method6525();
				local19.method6373();
				this.anInt7452 += local19.anInt4663;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public void method6121() {
		if (Static238.aClass91_1 == null) {
			return;
		}
		for (@Pc(13) Class6_Sub2_Sub4 local13 = (Class6_Sub2_Sub4) this.aClass170_12.method4006(); local13 != null; local13 = (Class6_Sub2_Sub4) this.aClass170_12.method4000()) {
			if (local13.method3933()) {
				if (local13.method3930() == null) {
					local13.method6525();
					local13.method6373();
					this.anInt7452 += local13.anInt4663;
				}
			} else if ((long) 5 < ++local13.aLong225) {
				@Pc(54) Class6_Sub2_Sub4 local54 = Static238.aClass91_1.method5720(local13);
				this.aClass74_31.method1890(local13.aLong229, local54);
				Static15.method393(local54, local13);
				local13.method6525();
				local13.method6373();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)I")
	public int method6122() {
		return this.anInt7452;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!qa;)V")
	private void method6123(@OriginalArg(1) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method2958();
		for (@Pc(16) Class6_Sub2_Sub4 local16 = (Class6_Sub2_Sub4) this.aClass74_31.method1883(local9); local16 != null; local16 = (Class6_Sub2_Sub4) this.aClass74_31.method1882()) {
			if (local16.anInterface9_3.method2959(arg0)) {
				this.method6115(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qa;ILjava/lang/Object;)V")
	public void method6124(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) Object arg1) {
		this.method6125(arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qa;ILjava/lang/Object;I)V")
	private void method6125(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt7448 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6123(arg0);
		this.anInt7452--;
		while (this.anInt7452 < 0) {
			@Pc(32) Class6_Sub2_Sub4 local32 = (Class6_Sub2_Sub4) this.aClass170_12.method4003();
			this.method6115(local32);
		}
		@Pc(49) Class6_Sub2_Sub4_Sub2 local49 = new Class6_Sub2_Sub4_Sub2(arg0, arg1, 1);
		this.aClass74_31.method1890(arg0.method2958(), local49);
		this.aClass170_12.method4001(local49);
		local49.aLong225 = 0L;
	}
}
