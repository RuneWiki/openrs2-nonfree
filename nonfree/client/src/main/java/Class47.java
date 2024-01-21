import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class47 {

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!jb;")
	private final Class40 aClass40_13 = new Class40(256);

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!jb;")
	private final Class40 aClass40_14 = new Class40(256);

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!na;")
	private final Class56 aClass56_24;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!na;")
	private final Class56 aClass56_25;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!na;Lclient!na;)V")
	public Class47(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		this.aClass56_24 = arg1;
		this.aClass56_25 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[IB)Lclient!hb;")
	private Class2_Sub5_Sub1 method1119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x70000FFF) << 4);
		@Pc(27) int local27 = local15 | arg1 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class2_Sub5_Sub1 local37 = (Class2_Sub5_Sub1) this.aClass40_14.method851(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class44 local55 = Static140.method1081(this.aClass56_25, arg1, arg0);
			if (local55 == null) {
				return null;
			}
			local37 = local55.method1084();
			this.aClass40_14.method849(local37, local30);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray18.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[II)Lclient!hb;")
	public Class2_Sub5_Sub1 method1122(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass56_25.method1681() == 1) {
			return this.method1119(arg1, 0, arg0);
		} else if (this.aClass56_25.method1678(arg1) == 1) {
			return this.method1119(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[I)Lclient!hb;")
	private Class2_Sub5_Sub1 method1124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF3);
		@Pc(21) int local21 = local11 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub5_Sub1 local33 = (Class2_Sub5_Sub1) this.aClass40_14.method851(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class2_Sub12 local60 = (Class2_Sub12) this.aClass40_13.method851(local26);
			if (local60 == null) {
				local60 = Static85.method1373(this.aClass56_24, arg1, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass40_13.method849(local60, local26);
			}
			local33 = local60.method1376(arg2);
			if (local33 == null) {
				return null;
			} else {
				local60.method2053();
				this.aClass40_14.method849(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)Lclient!hb;")
	public Class2_Sub5_Sub1 method1125(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass56_24.method1681() == 1) {
			return this.method1124(arg1, 0, arg0);
		} else if (this.aClass56_24.method1678(arg1) == 1) {
			return this.method1124(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
