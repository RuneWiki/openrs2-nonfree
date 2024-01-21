import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10 implements Interface1 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!pb;")
	private Class61 aClass61_2 = new Class61();

	@OriginalMember(owner = "client!be", name = "A", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "I")
	private int anInt344 = 128;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	private int anInt346 = 0;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!pd;")
	private final Class20 aClass20_6;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "I")
	private final int anInt345;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[Lclient!nb;")
	private final Class4_Sub14[] aClass4_Sub14Array1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!pd;Lclient!pd;IDI)V")
	public Class10(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass20_6 = arg1;
		this.anInt344 = arg4;
		this.aDouble1 = arg3;
		this.anInt345 = arg2;
		this.anInt346 = this.anInt345;
		@Pc(38) int[] local38 = arg0.method479(0);
		@Pc(41) int local41 = local38.length;
		this.aClass4_Sub14Array1 = new Class4_Sub14[arg0.method471(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class4_Sub16 local63 = new Class4_Sub16(arg0.method474(0, local38[local50]));
			this.aClass4_Sub14Array1[local38[local50]] = new Class4_Sub14(local63);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method220(@OriginalArg(0) int arg0) {
		return this.aClass4_Sub14Array1[arg0].aBoolean102;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(II)V")
	public void method224(@OriginalArg(0) int arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.aClass4_Sub14Array1.length; local15++) {
			@Pc(22) Class4_Sub14 local22 = this.aClass4_Sub14Array1[local15];
			if (local22 != null && local22.anInt1881 != 0 && local22.aBoolean103) {
				local22.method1313(arg0);
				local22.aBoolean103 = false;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BD)V")
	public void method225(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method227();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	@Override
	public int method219(@OriginalArg(1) int arg0) {
		return this.aClass4_Sub14Array1[arg0] == null ? 0 : this.aClass4_Sub14Array1[arg0].anInt1879;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method217(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray211 != null) {
				this.aClass61_2.method1632(local8);
				local8.aBoolean103 = true;
				return local8.anIntArray211;
			}
			@Pc(33) boolean local33 = local8.method1316(this.aDouble1, this.anInt344, this.aClass20_6);
			if (local33) {
				if (this.anInt346 == 0) {
					@Pc(47) Class4_Sub14 local47 = (Class4_Sub14) this.aClass61_2.method1631();
					local47.method1315();
				} else {
					this.anInt346--;
				}
				this.aClass61_2.method1632(local8);
				local8.aBoolean103 = true;
				return local8.anIntArray211;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method218(@OriginalArg(1) int arg0) {
		return this.anInt344 == 64;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method227() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass4_Sub14Array1.length; local3++) {
			if (this.aClass4_Sub14Array1[local3] != null) {
				this.aClass4_Sub14Array1[local3].method1315();
			}
		}
		this.aClass61_2 = new Class61();
		this.anInt346 = this.anInt345;
	}
}
