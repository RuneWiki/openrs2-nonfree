import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class18 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!qc;")
	private final Class66 aClass66_4 = new Class66(256);

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!oc;")
	private final Class56 aClass56_21;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!oc;")
	private final Class56 aClass56_22;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!oc;Lclient!oc;)V")
	public Class18(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		this.aClass56_21 = arg1;
		this.aClass56_22 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([III)Lclient!pa;")
	public Class1_Sub14_Sub1 method554(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass56_21.method1267() == 1) {
			return this.method559(arg0, arg1, 0);
		} else if (this.aClass56_21.method1279(arg1) == 1) {
			return this.method559(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[II)Lclient!pa;")
	private Class1_Sub14_Sub1 method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0x50000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub14_Sub1 local31 = (Class1_Sub14_Sub1) this.aClass66_4.method1650(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class16 local49 = Static131.method389(this.aClass56_22, arg1, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method386();
			this.aClass66_4.method1653(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray21.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIIB)Lclient!pa;")
	private Class1_Sub14_Sub1 method559(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class1_Sub14_Sub1 local38 = (Class1_Sub14_Sub1) this.aClass66_4.method1650(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(56) Class52 local56 = Static73.method1206(this.aClass56_21, arg2, arg1);
			if (local56 == null) {
				return null;
			}
			local38 = local56.method1208();
			this.aClass66_4.method1653(local38, local31);
			if (arg0 != null) {
				arg0[0] -= local38.aByteArray21.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[I)Lclient!pa;")
	public Class1_Sub14_Sub1 method560(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass56_22.method1267() == 1) {
			return this.method558(arg0, 0, arg1);
		} else if (this.aClass56_22.method1279(arg0) == 1) {
			return this.method558(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
