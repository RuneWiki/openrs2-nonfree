import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class59 implements Interface4 {

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	private int anInt2107 = 50;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!jb;")
	private Class28 aClass28_37;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!jb;")
	private Class28 aClass28_38;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "Lclient!ak;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "[Z")
	private boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[Z")
	private boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "[Z")
	private boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;Lclient!jb;IZ)V")
	public Class59(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass28_37 = arg0;
		this.aBoolean191 = arg4;
		this.anInt2107 = arg3;
		this.aClass28_38 = arg2;
		this.aClass8_6 = new Class8(this.anInt2107);
		@Pc(37) Class1_Sub26 local37 = new Class1_Sub26(arg1.method819(0, 0));
		@Pc(41) int local41 = local37.method2964();
		this.aBooleanArray13 = new boolean[local41];
		this.aBooleanArray14 = new boolean[local41];
		this.aByteArray33 = new byte[local41];
		this.aByteArray35 = new byte[local41];
		this.aBooleanArray15 = new boolean[local41];
		this.aByteArray32 = new byte[local41];
		this.aByteArray34 = new byte[local41];
		this.aBooleanArray16 = new boolean[local41];
		this.aShortArray29 = new short[local41];
		this.aBooleanArray17 = new boolean[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray15[local83] = local37.method2945() == 1;
		}
		for (@Pc(103) int local103 = 0; local103 < local41; local103++) {
			if (this.aBooleanArray15[local103]) {
				this.aBooleanArray14[local103] = local37.method2945() == 1;
			}
		}
		for (@Pc(134) int local134 = 0; local134 < local41; local134++) {
			if (this.aBooleanArray15[local134]) {
				this.aBooleanArray13[local134] = local37.method2945() == 1;
			}
		}
		for (@Pc(163) int local163 = 0; local163 < local41; local163++) {
			if (this.aBooleanArray15[local163]) {
				this.aBooleanArray17[local163] = local37.method2945() == 1;
			}
		}
		for (@Pc(194) int local194 = 0; local194 < local41; local194++) {
			if (this.aBooleanArray15[local194]) {
				this.aBooleanArray16[local194] = local37.method2945() == 1;
			}
		}
		for (@Pc(223) int local223 = 0; local223 < local41; local223++) {
			if (this.aBooleanArray15[local223]) {
				this.aByteArray34[local223] = local37.method2992();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local41; local247++) {
			if (this.aBooleanArray15[local247]) {
				this.aByteArray32[local247] = local37.method2992();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < local41; local267++) {
			if (this.aBooleanArray15[local267]) {
				this.aByteArray33[local267] = local37.method2992();
			}
		}
		for (@Pc(291) int local291 = 0; local291 < local41; local291++) {
			if (this.aBooleanArray15[local291]) {
				this.aByteArray35[local291] = local37.method2992();
			}
		}
		for (@Pc(311) int local311 = 0; local311 < local41; local311++) {
			if (this.aBooleanArray15[local311]) {
				this.aShortArray29[local311] = (short) local37.method2964();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1633(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub5 local13 = this.method1643(arg0);
		return local13 == null ? false : local13.method633(this.aClass28_38, this);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method1638(@OriginalArg(0) int arg0) {
		return this.aBoolean191 || this.aBooleanArray17[arg0];
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1635(@OriginalArg(0) int arg0) {
		return this.aBooleanArray13[arg0];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
	public void method1640(@OriginalArg(1) boolean arg0) {
		this.aBoolean191 = arg0;
		this.method1647();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1634(@OriginalArg(1) int arg0) {
		return this.aBooleanArray14[arg0];
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(II)Lclient!ck;")
	private Class1_Sub2_Sub5 method1643(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub2_Sub5 local7 = (Class1_Sub2_Sub5) this.aClass8_6.method312((long) arg0);
		if (local7 != null) {
			return local7;
		}
		@Pc(22) byte[] local22 = this.aClass28_37.method819(0, arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(31) Class1_Sub26 local31 = new Class1_Sub26(local22);
			local7 = new Class1_Sub2_Sub5(local31);
			this.aClass8_6.method304(local7, (long) arg0);
			return local7;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V")
	public void method1644(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class1_Sub2_Sub5 local7 = (Class1_Sub2_Sub5) this.aClass8_6.method305(); local7 != null; local7 = (Class1_Sub2_Sub5) this.aClass8_6.method306()) {
			if (local7.aBoolean54) {
				local7.method632(arg0);
				local7.aBoolean54 = false;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIF)[I")
	@Override
	public int[] method1636(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		@Pc(16) Class1_Sub2_Sub5 local16 = this.method1643(arg0);
		if (local16 == null) {
			return null;
		} else {
			local16.aBoolean54 = true;
			return local16.method634(this.aBoolean191 || this.aBooleanArray17[arg0], arg1, this.aClass28_38, this);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public void method1647() {
		this.aClass8_6.method308();
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1637(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub5 local10 = this.method1643(arg0);
		return local10 == null ? null : local10.method629(this, this.aClass28_38, this.aBoolean191 || this.aBooleanArray17[arg0]);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
	@Override
	public int method1632(@OriginalArg(1) int arg0) {
		return this.aShortArray29[arg0] & 0xFFFF;
	}
}
