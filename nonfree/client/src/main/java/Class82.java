import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class82 implements Interface4 {

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	private int anInt3124 = 50;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!pa;")
	private Class86 aClass86_54;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Lclient!pa;")
	private Class86 aClass86_56;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!ad;")
	private Class4 aClass4_7;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "[Z")
	private boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[Z")
	private boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!pa;Lclient!pa;Lclient!pa;IZ)V")
	public Class82(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_54 = arg2;
		this.aClass86_56 = arg0;
		this.aBoolean131 = arg4;
		this.anInt3124 = arg3;
		this.aClass4_7 = new Class4(this.anInt3124);
		@Pc(37) Class1_Sub17 local37 = new Class1_Sub17(arg1.method3325(0, 0));
		@Pc(41) int local41 = local37.method2178();
		this.aBooleanArray14 = new boolean[local41];
		this.aBooleanArray18 = new boolean[local41];
		this.aByteArray43 = new byte[local41];
		this.aShortArray42 = new short[local41];
		this.aByteArray44 = new byte[local41];
		this.aByteArray41 = new byte[local41];
		this.aBooleanArray15 = new boolean[local41];
		this.aBooleanArray17 = new boolean[local41];
		this.aByteArray42 = new byte[local41];
		this.aBooleanArray16 = new boolean[local41];
		for (@Pc(83) int local83 = 0; local83 < local41; local83++) {
			this.aBooleanArray16[local83] = local37.method2142() == 1;
		}
		for (@Pc(109) int local109 = 0; local109 < local41; local109++) {
			if (this.aBooleanArray16[local109]) {
				this.aBooleanArray15[local109] = local37.method2142() == 1;
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local41; local136++) {
			if (this.aBooleanArray16[local136]) {
				this.aBooleanArray18[local136] = local37.method2142() == 1;
			}
		}
		for (@Pc(167) int local167 = 0; local167 < local41; local167++) {
			if (this.aBooleanArray16[local167]) {
				this.aBooleanArray14[local167] = local37.method2142() == 1;
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local41; local192++) {
			if (this.aBooleanArray16[local192]) {
				this.aBooleanArray17[local192] = local37.method2142() == 1;
			}
		}
		for (@Pc(223) int local223 = 0; local223 < local41; local223++) {
			if (this.aBooleanArray16[local223]) {
				this.aByteArray42[local223] = local37.method2155();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < local41; local243++) {
			if (this.aBooleanArray16[local243]) {
				this.aByteArray41[local243] = local37.method2155();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < local41; local263++) {
			if (this.aBooleanArray16[local263]) {
				this.aByteArray44[local263] = local37.method2155();
			}
		}
		for (@Pc(283) int local283 = 0; local283 < local41; local283++) {
			if (this.aBooleanArray16[local283]) {
				this.aByteArray43[local283] = local37.method2155();
			}
		}
		for (@Pc(303) int local303 = 0; local303 < local41; local303++) {
			if (this.aBooleanArray16[local303]) {
				this.aShortArray42[local303] = (short) local37.method2178();
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method2511(@OriginalArg(1) int arg0) {
		return this.aBooleanArray15[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public void method2512() {
		this.aClass4_7.method75();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2507(@OriginalArg(1) int arg0) {
		return this.aBooleanArray18[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
	public void method2513(@OriginalArg(1) boolean arg0) {
		this.aBoolean131 = arg0;
		this.method2512();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZI)Lclient!sc;")
	private Class1_Sub1_Sub17 method2515(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub17 local11 = (Class1_Sub1_Sub17) this.aClass4_7.method81((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass86_56.method3325(arg0, 0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(31) Class1_Sub17 local31 = new Class1_Sub17(local22);
			local11 = new Class1_Sub1_Sub17(local31);
			this.aClass4_7.method83(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2510(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub1_Sub17 local4 = this.method2515(arg0);
		return local4 == null ? false : local4.method3105(this.aClass86_54, this);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2509(@OriginalArg(0) int arg0) {
		return this.aBoolean131 || this.aBooleanArray14[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2506(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub1_Sub17 local4 = this.method2515(arg0);
		return local4 == null ? null : local4.method3108(this.aBoolean131 || this.aBooleanArray14[arg0], this.aClass86_54, this);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I")
	@Override
	public int method2508(@OriginalArg(1) int arg0) {
		return this.aShortArray42[arg0] & 0xFFFF;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)V")
	public void method2518(@OriginalArg(0) int arg0) {
		for (@Pc(19) Class1_Sub1_Sub17 local19 = (Class1_Sub1_Sub17) this.aClass4_7.method79(); local19 != null; local19 = (Class1_Sub1_Sub17) this.aClass4_7.method73()) {
			if (local19.aBoolean178) {
				local19.method3111(arg0);
				local19.aBoolean178 = false;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method2505(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Class1_Sub1_Sub17 local19 = this.method2515(arg1);
		if (local19 == null) {
			return null;
		} else {
			local19.aBoolean178 = true;
			return local19.method3107(this.aClass86_54, arg0, this.aBoolean131 || this.aBooleanArray14[arg1], this);
		}
	}
}
