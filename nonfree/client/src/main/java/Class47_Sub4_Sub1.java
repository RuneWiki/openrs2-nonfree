import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class47_Sub4_Sub1 extends Class47_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!ida", name = "A", descriptor = "Lclient!pl;")
	private Class231 aClass231_3;

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "Z")
	private final boolean aBoolean258;

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ida", name = "E", descriptor = "Z")
	private final boolean aBoolean256;

	@OriginalMember(owner = "client!ida", name = "K", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ida", name = "N", descriptor = "Z")
	private boolean aBoolean259;

	@OriginalMember(owner = "client!ida", name = "z", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "Lclient!r;")
	public Class19 aClass19_2;

	static {
		new Class114("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIZIIZ)V")
	public Class47_Sub4_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static250.method4240(arg7, arg8));
		super.anInt8073 = arg3;
		super.anInt8077 = arg5;
		this.aShort73 = (short) arg1.anInt8333;
		this.aBoolean258 = arg1.anInt8338 != 0 && !arg6;
		this.aByte41 = (byte) arg7;
		this.aBoolean256 = arg6;
		this.aByte42 = (byte) arg2;
		this.aByte43 = (byte) arg8;
		this.aBoolean259 = arg9;
		this.aBoolean255 = arg0.method7611() && arg1.aBoolean576 && !this.aBoolean256 && Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean259) {
			local71 |= 0x10000;
		}
		@Pc(86) Class139 local86 = this.method3743(local71, this.aBoolean255, arg0);
		if (local86 != null) {
			this.aClass1_Sub1_Sub4_2 = local86.aClass1_Sub1_Sub4_3;
			this.aClass19_2 = local86.aClass19_3;
			if (this.aBoolean259) {
				this.aClass19_2 = this.aClass19_2.method7260((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass19_2 == null) {
			return null;
		}
		@Pc(15) Class22 local15 = arg0.method7642();
		local15.oa(super.anInt8073, super.anInt8075, super.anInt8077);
		@Pc(25) Class2_Sub6 local25 = null;
		if (this.aBoolean258) {
			local25 = Static275.method4678(1);
		}
		this.aClass19_2.method7258(local15, local25 == null ? null : local25.aClass2_Sub7Array1[0], 0);
		return local25;
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.aClass19_2 != null) {
			this.aClass19_2.method7259();
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!qa;IB)Lclient!r;")
	private Class19 method3742(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass19_2 != null && arg0.method7607(this.aClass19_2.ba(), arg1) == 0) {
			return this.aClass19_2;
		} else {
			@Pc(31) Class139 local31 = this.method3743(arg1, false, arg0);
			return local31 == null ? null : local31.aClass19_3;
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		if (this.aClass231_3 == null) {
			this.aClass231_3 = Static246.method4148(this.method3742(arg0, 0), super.anInt8073, super.anInt8077, super.anInt8075);
		}
		return this.aClass231_3;
	}

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		this.aBoolean259 = false;
		if (this.aClass19_2 != null) {
			this.aClass19_2.m(this.aClass19_2.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBZLclient!qa;)Lclient!is;")
	private Class139 method3743(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(17) Class288 local17 = Static365.aClass194_6.method5084(this.aShort73 & 0xFFFF);
		@Pc(25) Class10 local25;
		@Pc(33) Class10 local33;
		if (this.aBoolean256) {
			local25 = Static106.aClass10Array5[this.aByte42];
			local33 = Static53.aClass10Array3[0];
		} else {
			local25 = Static53.aClass10Array3[this.aByte42];
			if (this.aByte42 >= 3) {
				local33 = null;
			} else {
				local33 = Static53.aClass10Array3[this.aByte42 + 1];
			}
		}
		return local17.method7071(super.anInt8073, this.aByte41, arg1, arg0, super.anInt8077, local33, local25, this.aByte43, arg2, super.anInt8075);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		if (arg5 instanceof Class47_Sub4_Sub1) {
			@Pc(9) Class47_Sub4_Sub1 local9 = (Class47_Sub4_Sub1) arg5;
			if (this.aClass19_2 != null && local9.aClass19_2 != null) {
				this.aClass19_2.method7263(local9.aClass19_2, arg3, arg1, arg4, arg2);
			}
		} else if (arg5 instanceof Class47_Sub2_Sub6) {
			@Pc(32) Class47_Sub2_Sub6 local32 = (Class47_Sub2_Sub6) arg5;
			if (this.aClass19_2 != null && local32.aClass19_6 != null) {
				this.aClass19_2.method7263(local32.aClass19_6, arg3, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return this.aBoolean259;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		@Pc(30) Class1_Sub1_Sub4 local30;
		if (this.aClass1_Sub1_Sub4_2 == null && this.aBoolean255) {
			@Pc(23) Class139 local23 = this.method3743(262144, true, arg0);
			local30 = local23 == null ? null : local23.aClass1_Sub1_Sub4_3;
		} else {
			local30 = this.aClass1_Sub1_Sub4_2;
			this.aClass1_Sub1_Sub4_2 = null;
		}
		if (local30 != null) {
			Static11.method241(local30, this.aByte42, super.anInt8073, super.anInt8077, null);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method3742(arg1, arg0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		@Pc(14) Class1_Sub1_Sub4 local14;
		if (this.aClass1_Sub1_Sub4_2 == null && this.aBoolean255) {
			@Pc(25) Class139 local25 = this.method3743(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub4_3;
		} else {
			local14 = this.aClass1_Sub1_Sub4_2;
			this.aClass1_Sub1_Sub4_2 = null;
		}
		if (local14 != null) {
			Static354.method5622(local14, this.aByte42, super.anInt8073, super.anInt8077, null);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class19 local14 = this.method3742(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class22 local19 = arg1.method7642();
			local19.oa(super.anInt8073, super.anInt8075, super.anInt8077);
			return local14.method7257(arg2, arg0, local19, false);
		}
	}
}
