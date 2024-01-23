import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class36 implements Interface1 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	private int anInt1644 = 50;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Lclient!nb;")
	private Class15 aClass15_15;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!nb;")
	private Class15 aClass15_16;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!id;")
	private Class43 aClass43_7;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[Z")
	private boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!nb;Lclient!nb;Lclient!nb;IZ)V")
	public Class36(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean89 = arg4;
		this.aClass15_15 = arg0;
		this.aClass15_16 = arg2;
		this.anInt1644 = arg3;
		this.aClass43_7 = new Class43(this.anInt1644);
		@Pc(37) Class2_Sub3 local37 = new Class2_Sub3(arg1.method387(0, 0));
		@Pc(41) int local41 = local37.method163();
		this.aByteArray11 = new byte[local41];
		this.aBooleanArray6 = new boolean[local41];
		this.aBooleanArray10 = new boolean[local41];
		this.aByteArray12 = new byte[local41];
		this.aByteArray14 = new byte[local41];
		this.aBooleanArray7 = new boolean[local41];
		this.aBooleanArray9 = new boolean[local41];
		this.aBooleanArray8 = new boolean[local41];
		this.aByteArray13 = new byte[local41];
		this.aShortArray41 = new short[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray9[local83] = local37.method209() == 1;
		}
		for (@Pc(107) int local107 = 0; local107 < local41; local107++) {
			if (this.aBooleanArray9[local107]) {
				this.aBooleanArray6[local107] = local37.method209() == 1;
			}
		}
		for (@Pc(134) int local134 = 0; local134 < local41; local134++) {
			if (this.aBooleanArray9[local134]) {
				this.aBooleanArray10[local134] = local37.method209() == 1;
			}
		}
		for (@Pc(161) int local161 = 0; local161 < local41; local161++) {
			if (this.aBooleanArray9[local161]) {
				this.aBooleanArray7[local161] = local37.method209() == 1;
			}
		}
		for (@Pc(190) int local190 = 0; local190 < local41; local190++) {
			if (this.aBooleanArray9[local190]) {
				this.aBooleanArray8[local190] = local37.method209() == 1;
			}
		}
		for (@Pc(217) int local217 = 0; local217 < local41; local217++) {
			if (this.aBooleanArray9[local217]) {
				this.aByteArray11[local217] = local37.method186();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < local41; local241++) {
			if (this.aBooleanArray9[local241]) {
				this.aByteArray14[local241] = local37.method186();
			}
		}
		for (@Pc(265) int local265 = 0; local265 < local41; local265++) {
			if (this.aBooleanArray9[local265]) {
				this.aByteArray12[local265] = local37.method186();
			}
		}
		for (@Pc(285) int local285 = 0; local285 < local41; local285++) {
			if (this.aBooleanArray9[local285]) {
				this.aByteArray13[local285] = local37.method186();
			}
		}
		for (@Pc(305) int local305 = 0; local305 < local41; local305++) {
			if (this.aBooleanArray9[local305]) {
				this.aShortArray41[local305] = (short) local37.method163();
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1131(@OriginalArg(1) int arg0) {
		return this.aBooleanArray10[arg0];
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1133(@OriginalArg(0) int arg0) {
		return this.aBooleanArray6[arg0];
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method1136(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub19 local8 = this.method1138(arg0);
		return local8 == null ? false : local8.method2830(this, this.aClass15_16);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
	@Override
	public int method1135(@OriginalArg(1) int arg0) {
		return this.aShortArray41[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(IB)Lclient!sc;")
	private Class2_Sub2_Sub19 method1138(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub2_Sub19 local13 = (Class2_Sub2_Sub19) this.aClass43_7.method1464((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(24) byte[] local24 = this.aClass15_15.method387(0, arg0);
		if (local24 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub3 local38 = new Class2_Sub3(local24);
			local13 = new Class2_Sub2_Sub19(local38);
			this.aClass43_7.method1462((long) arg0, local13);
			return local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1134(@OriginalArg(0) int arg0) {
		return this.aBoolean89 || this.aBooleanArray7[arg0];
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public void method1140() {
		this.aClass43_7.method1469();
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1137(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub2_Sub19 local13 = this.method1138(arg0);
		return local13 == null ? null : local13.method2828(this.aClass15_16, this.aBoolean89 || this.aBooleanArray7[arg0], this);
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)V")
	public void method1142(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub2_Sub19 local12 = (Class2_Sub2_Sub19) this.aClass43_7.method1470(); local12 != null; local12 = (Class2_Sub2_Sub19) this.aClass43_7.method1463()) {
			if (local12.aBoolean256) {
				local12.method2829(arg0);
				local12.aBoolean256 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIZ)[I")
	@Override
	public int[] method1132(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub2_Sub19 local9 = this.method1138(arg1);
		if (local9 == null) {
			return null;
		} else {
			local9.aBoolean256 = true;
			return local9.method2831(this, arg0, this.aClass15_16, this.aBoolean89 || this.aBooleanArray7[arg1]);
		}
	}
}
