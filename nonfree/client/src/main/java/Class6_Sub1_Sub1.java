import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!kw;")
	private Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
	private int anInt1931 = 0;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
	private int anInt1927 = -32768;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
	private int anInt1935 = 0;

	@OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
	private final int anInt1945 = -1;

	@OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
	private int anInt1940 = 0;

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
	private final int anInt1947;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
	public final int anInt1928;

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
	private final int anInt1943;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "Lclient!hi;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1947 = arg0;
		this.anInt1931 = arg12;
		this.anInt1928 = arg1 + arg2;
		this.anInt1943 = arg4;
		@Pc(49) Class186 local49 = Static17.aClass231_2.method5905(this.anInt1947);
		@Pc(52) int local52 = local49.anInt5838;
		if (local52 == -1) {
			this.aBoolean140 = true;
		} else {
			this.aClass122_1 = Static46.aClass247_1.method6029(local52);
			this.aBoolean140 = false;
		}
		if (arg2 == this.anInt1928) {
			Static448.method6790(false, super.anInt8811, super.anInt8813, super.aByte100, this.aClass122_1, this.anInt1935);
		}
	}

	@OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_1 != null) {
			this.aClass4_Sub4_1.method4600();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(21) Class2 local21 = this.method1808(this.anInt1947, (this.anInt1931 == 0 ? 0 : 5) | 0x800, arg0);
		if (local21 == null) {
			return null;
		}
		if (this.anInt1931 != 0) {
			local21.I(this.anInt1931 * 2048);
		}
		@Pc(40) Class205 local40 = arg0.method7448();
		local40.GA(super.anInt8811, super.anInt8814, super.anInt8813);
		this.method1812(local21, arg0, local40);
		if (this.aClass4_Sub4_1 == null) {
			local21.method5774(local40, null, 0);
		} else {
			@Pc(66) Class26 local66 = this.aClass4_Sub4_1.method4590();
			arg0.method7464(local21, local66, local40, null, 0);
		}
		this.anInt1927 = local21.DA();
		return null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILclient!oa;)Lclient!ba;")
	private Class2 method1808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(8) Class186 local8 = Static17.aClass231_2.method5905(arg0);
		@Pc(13) Class52 local13 = Static163.aClass52Array4[super.aByte100];
		@Pc(26) Class52 local26 = this.anInt1943 >= 3 ? null : Static163.aClass52Array4[this.anInt1943 + 1];
		return this.aBoolean140 ? local8.method4862(local13, Static46.aClass247_1, arg1, super.anInt8811, 0, -1, -1, arg2, local26, super.anInt8813, super.anInt8814) : local8.method4862(local13, Static46.aClass247_1, arg1, super.anInt8811, this.anInt1940, this.anInt1945, this.anInt1935, arg2, local26, super.anInt8813, super.anInt8814);
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
	public void method1809(@OriginalArg(0) int arg0) {
		if (this.aBoolean140) {
			return;
		}
		this.anInt1940 += arg0;
		while (this.aClass122_1.anIntArray394[this.anInt1935] < this.anInt1940) {
			this.anInt1940 -= this.aClass122_1.anIntArray394[this.anInt1935];
			this.anInt1935++;
			if (this.aClass122_1.anIntArray396.length <= this.anInt1935) {
				this.aBoolean140 = true;
				break;
			}
		}
		if (!this.aBoolean140) {
			Static448.method6790(false, super.anInt8811, super.anInt8813, super.aByte100, this.aClass122_1, this.anInt1935);
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.anInt1927;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public void method1811() {
		if (this.aClass4_Sub4_1 != null) {
			this.aClass4_Sub4_1.method4600();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ba;ILclient!oa;Lclient!q;)V")
	private void method1812(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class205 arg2) {
		arg0.method5770(arg2);
		@Pc(12) Class83[] local12 = arg0.method5778();
		@Pc(15) Class109[] local15 = arg0.method5789();
		if ((this.aClass4_Sub4_1 == null || this.aClass4_Sub4_1.aBoolean359) && (local12 != null || local15 != null)) {
			this.aClass4_Sub4_1 = Static261.method4593(Static223.anInt4829, true);
		}
		if (this.aClass4_Sub4_1 != null) {
			this.aClass4_Sub4_1.method4599(arg1, (long) Static223.anInt4829, local12, local15);
			this.aClass4_Sub4_1.method4588(super.aByte100, super.aShort123, super.aShort122, super.aShort120, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(11) Class2 local11 = this.method1808(this.anInt1947, 0, arg0);
		if (local11 != null) {
			@Pc(16) Class205 local16 = arg0.method7448();
			local16.GA(super.anInt8811, super.anInt8814, super.anInt8813);
			this.method1812(local11, arg0, local16);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
