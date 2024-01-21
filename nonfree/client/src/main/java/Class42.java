import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class42 implements Interface1 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!ac;")
	private Class3 aClass3_7 = new Class3();

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	private int anInt1495 = 128;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	private int anInt1497 = 0;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	private final int anInt1496;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!fd;")
	private final Class24 aClass24_16;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[Lclient!be;")
	private final Class2_Sub3[] aClass2_Sub3Array1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!fd;Lclient!fd;IDI)V")
	public Class42(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1496 = arg2;
		this.aClass24_16 = arg1;
		this.anInt1495 = arg4;
		this.anInt1497 = this.anInt1496;
		this.aDouble9 = arg3;
		@Pc(38) int[] local38 = arg0.method1929(0);
		@Pc(41) int local41 = local38.length;
		this.aClass2_Sub3Array1 = new Class2_Sub3[arg0.method1927(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class2_Sub9 local63 = new Class2_Sub9(arg0.method1931(local38[local50], 0));
			this.aClass2_Sub3Array1[local38[local50]] = new Class2_Sub3(local63);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IB)V")
	public void method1011(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass2_Sub3Array1.length; local7++) {
			@Pc(14) Class2_Sub3 local14 = this.aClass2_Sub3Array1[local7];
			if (local14 != null && local14.anInt219 != 0 && local14.aBoolean24) {
				local14.method194(arg0);
				local14.aBoolean24 = false;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1007(@OriginalArg(0) int arg0) {
		return this.aClass2_Sub3Array1[arg0].aBoolean25;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I")
	@Override
	public int method1010(@OriginalArg(1) int arg0) {
		return this.aClass2_Sub3Array1[arg0] == null ? 0 : this.aClass2_Sub3Array1[arg0].anInt218;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public void method1013() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass2_Sub3Array1.length; local3++) {
			if (this.aClass2_Sub3Array1[local3] != null) {
				this.aClass2_Sub3Array1[local3].method196();
			}
		}
		this.aClass3_7 = new Class3();
		this.anInt1497 = this.anInt1496;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(DZ)V")
	public void method1014(@OriginalArg(0) double arg0) {
		this.aDouble9 = arg0;
		this.method1013();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1008(@OriginalArg(0) int arg0) {
		return this.anInt1495 == 64;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1009(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub3 local14 = this.aClass2_Sub3Array1[arg0];
		if (local14 != null) {
			if (local14.anIntArray46 != null) {
				this.aClass3_7.method84(local14);
				local14.aBoolean24 = true;
				return local14.anIntArray46;
			}
			@Pc(39) boolean local39 = local14.method193(this.aDouble9, this.anInt1495, this.aClass24_16);
			if (local39) {
				if (this.anInt1497 == 0) {
					@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass3_7.method77();
					local50.method196();
				} else {
					this.anInt1497--;
				}
				this.aClass3_7.method84(local14);
				local14.aBoolean24 = true;
				return local14.anIntArray46;
			}
		}
		return null;
	}
}
