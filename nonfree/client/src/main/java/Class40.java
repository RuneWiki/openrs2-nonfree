import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class40 implements Interface1 {

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	private int anInt1704 = 50;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!ai;")
	private Class7 aClass7_13;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!ai;")
	private Class7 aClass7_12;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "Lclient!ge;")
	private Class39 aClass39_10;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!ai;Lclient!ai;Lclient!ai;IZ)V")
	public Class40(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean89 = arg4;
		this.aClass7_13 = arg2;
		this.aClass7_12 = arg0;
		this.anInt1704 = arg3;
		this.aClass39_10 = new Class39(this.anInt1704);
		@Pc(37) Class1_Sub9 local37 = new Class1_Sub9(arg1.method3242(0, 0));
		@Pc(41) int local41 = local37.method946();
		this.aByteArray24 = new byte[local41];
		this.aBooleanArray11 = new boolean[local41];
		this.aByteArray22 = new byte[local41];
		this.aBooleanArray12 = new boolean[local41];
		this.aShortArray23 = new short[local41];
		this.aBooleanArray9 = new boolean[local41];
		this.aBooleanArray10 = new boolean[local41];
		this.aByteArray21 = new byte[local41];
		this.aByteArray23 = new byte[local41];
		this.aBooleanArray8 = new boolean[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray9[local83] = local37.method895() == 1;
		}
		for (@Pc(107) int local107 = 0; local107 < local41; local107++) {
			if (this.aBooleanArray9[local107]) {
				this.aBooleanArray12[local107] = local37.method895() == 1;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local41; local132++) {
			if (this.aBooleanArray9[local132]) {
				this.aBooleanArray11[local132] = local37.method895() == 1;
			}
		}
		for (@Pc(159) int local159 = 0; local159 < local41; local159++) {
			if (this.aBooleanArray9[local159]) {
				this.aBooleanArray8[local159] = local37.method895() == 1;
			}
		}
		for (@Pc(188) int local188 = 0; local188 < local41; local188++) {
			if (this.aBooleanArray9[local188]) {
				this.aBooleanArray10[local188] = local37.method895() == 1;
			}
		}
		for (@Pc(219) int local219 = 0; local219 < local41; local219++) {
			if (this.aBooleanArray9[local219]) {
				this.aByteArray23[local219] = local37.method891();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < local41; local243++) {
			if (this.aBooleanArray9[local243]) {
				this.aByteArray21[local243] = local37.method891();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < local41; local263++) {
			if (this.aBooleanArray9[local263]) {
				this.aByteArray24[local263] = local37.method891();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local41; local287++) {
			if (this.aBooleanArray9[local287]) {
				this.aByteArray22[local287] = local37.method891();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < local41; local307++) {
			if (this.aBooleanArray9[local307]) {
				this.aShortArray23[local307] = (short) local37.method946();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IFI)[I")
	@Override
	public int[] method1244(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub1_Sub3 local10 = this.method1255(arg1);
		if (local10 == null) {
			return null;
		} else {
			local10.aBoolean34 = true;
			return local10.method311(this.aBoolean89 || this.aBooleanArray8[arg1], arg0, this, this.aClass7_13);
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)V")
	public void method1251(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class1_Sub1_Sub3 local13 = (Class1_Sub1_Sub3) this.aClass39_10.method1155(); local13 != null; local13 = (Class1_Sub1_Sub3) this.aClass39_10.method1153()) {
			if (local13.aBoolean34) {
				local13.method312(arg0);
				local13.aBoolean34 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1245(@OriginalArg(0) int arg0) {
		return this.aBooleanArray11[arg0];
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I")
	@Override
	public int method1250(@OriginalArg(0) int arg0) {
		return this.aShortArray23[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	public void method1253() {
		this.aClass39_10.method1158();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1249(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub3 local8 = this.method1255(arg0);
		return local8 == null ? false : local8.method307(this, this.aClass7_13);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method1248(@OriginalArg(0) int arg0) {
		return this.aBoolean89 || this.aBooleanArray8[arg0];
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1247(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = this.method1255(arg0);
		return local10 == null ? null : local10.method308(this.aBoolean89 || this.aBooleanArray8[arg0], this, this.aClass7_13);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1246(@OriginalArg(1) int arg0) {
		return this.aBooleanArray12[arg0];
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)Lclient!bf;")
	private Class1_Sub1_Sub3 method1255(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub3 local13 = (Class1_Sub1_Sub3) this.aClass39_10.method1161((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(24) byte[] local24 = this.aClass7_12.method3242(arg0, 0);
		if (local24 == null) {
			return null;
		} else {
			@Pc(33) Class1_Sub9 local33 = new Class1_Sub9(local24);
			local13 = new Class1_Sub1_Sub3(local33);
			this.aClass39_10.method1152((long) arg0, local13);
			return local13;
		}
	}
}
