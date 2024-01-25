import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!daa", name = "G", descriptor = "Lclient!qv;")
	private Class6_Sub7 aClass6_Sub7_3;

	@OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
	private final int anInt1623 = -1;

	@OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
	private int anInt1627 = 0;

	@OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
	private int anInt1636 = 0;

	@OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
	private int anInt1637 = 0;

	@OriginalMember(owner = "client!daa", name = "U", descriptor = "I")
	private int anInt1642 = -32768;

	@OriginalMember(owner = "client!daa", name = "T", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
	public final int anInt1629;

	@OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
	private final int anInt1635;

	@OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
	private final int anInt1632;

	@OriginalMember(owner = "client!daa", name = "x", descriptor = "Lclient!aba;")
	private Class4 aClass4_2;

	static {
		new Class202("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1629 = arg1 + arg2;
		this.anInt1636 = arg12;
		this.anInt1635 = arg0;
		this.anInt1632 = arg4;
		@Pc(49) Class226 local49 = Static305.aClass14_1.method555(this.anInt1635);
		@Pc(52) int local52 = local49.anInt6964;
		if (local52 == -1) {
			this.aBoolean118 = true;
		} else {
			this.aClass4_2 = Static396.aClass157_2.method3745(local52);
			this.aBoolean118 = false;
		}
		if (this.anInt1629 == arg2) {
			Static250.method3962(this.anInt1627, super.anInt7659, super.aByte90, this.aClass4_2, false, super.anInt7660);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!qa;Lclient!r;)V")
	private void method1559(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(6) Class192[] local6 = arg1.method7708();
		@Pc(14) Class169[] local14 = arg1.method7702();
		if ((this.aClass6_Sub7_3 == null || this.aClass6_Sub7_3.aBoolean566) && (local6 != null || local14 != null)) {
			this.aClass6_Sub7_3 = Static406.method6402(Static115.anInt2326);
		}
		if (this.aClass6_Sub7_3 != null) {
			this.aClass6_Sub7_3.method6397(arg0, (long) Static115.anInt2326, local6, local14);
			this.aClass6_Sub7_3.method6407(super.aByte90, super.aShort127, super.aShort125, super.aShort128, super.aShort126);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
	public void method1560(@OriginalArg(0) int arg0) {
		if (this.aBoolean118) {
			return;
		}
		this.anInt1637 += arg0;
		while (this.aClass4_2.anIntArray12[this.anInt1627] < this.anInt1637) {
			this.anInt1637 -= this.aClass4_2.anIntArray12[this.anInt1627];
			this.anInt1627++;
			if (this.anInt1627 >= this.aClass4_2.anIntArray11.length) {
				this.aBoolean118 = true;
				break;
			}
		}
		if (!this.aBoolean118) {
			Static250.method3962(this.anInt1627, super.anInt7659, super.aByte90, this.aClass4_2, false, super.anInt7660);
		}
	}

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.anInt1642;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(21) Class63 local21 = this.method1561((this.anInt1636 == 0 ? 0 : 5) | 0x800, arg0, this.anInt1635);
		if (local21 == null) {
			return null;
		}
		if (this.anInt1636 != 0) {
			local21.OA(this.anInt1636 * 2048);
		}
		@Pc(37) Class181 local37 = arg0.method6022();
		local37.oa(super.anInt7660, super.anInt7657, super.anInt7659);
		if (this.aClass6_Sub7_3 == null) {
			local21.method7700(local37, null, 0);
		} else {
			@Pc(64) Class208 local64 = this.aClass6_Sub7_3.method6400();
			arg0.method6020(local21, local64, local37, null);
		}
		this.anInt1642 = local21.TA();
		this.method1559(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILclient!qa;I)Lclient!r;")
	private Class63 method1561(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class226 local8 = Static305.aClass14_1.method555(arg2);
		@Pc(13) Class75 local13 = Static164.aClass75Array1[super.aByte90];
		@Pc(34) Class75 local34 = this.anInt1632 >= 3 ? null : Static164.aClass75Array1[this.anInt1632 + 1];
		return this.aBoolean118 ? local8.method5916(arg1, arg0, 0, Static396.aClass157_2, local13, super.anInt7657, super.anInt7660, -1, -1, local34, super.anInt7659) : local8.method5916(arg1, arg0, this.anInt1637, Static396.aClass157_2, local13, super.anInt7657, super.anInt7660, this.anInt1627, this.anInt1623, local34, super.anInt7659);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public void method1562() {
		if (this.aClass6_Sub7_3 != null) {
			this.aClass6_Sub7_3.method6406();
		}
	}

	@OriginalMember(owner = "client!daa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub7_3 != null) {
			this.aClass6_Sub7_3.method6406();
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class63 local11 = this.method1561(0, arg0, this.anInt1635);
		if (local11 != null) {
			this.method1559(arg0, local11);
		}
	}
}
