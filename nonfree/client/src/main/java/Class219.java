import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class219 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!pl;")
	private final Class273 aClass273_14 = new Class273(256);

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!pl;")
	private final Class273 aClass273_15 = new Class273(256);

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "Lclient!la;")
	private final Class207 aClass207_67;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!la;")
	private final Class207 aClass207_66;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class219(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1) {
		this.aClass207_67 = arg1;
		this.aClass207_66 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIII)Lclient!so;")
	private Class5_Sub37_Sub1 method4918(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0x90000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub37_Sub1 local31 = (Class5_Sub37_Sub1) this.aClass273_15.method6581(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class117 local58 = Static648.method2664(this.aClass207_66, arg1, arg2);
			if (local58 == null) {
				return null;
			}
			local31 = local58.method2663();
			this.aClass273_15.method6585(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray94.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[I)Lclient!so;")
	public Class5_Sub37_Sub1 method4921(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass207_67.method4685() == 1) {
			return this.method4923(0, arg0, arg1);
		} else if (this.aClass207_67.method4672(arg0) == 1) {
			return this.method4923(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI[I)Lclient!so;")
	public Class5_Sub37_Sub1 method4922(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass207_66.method4685() == 1) {
			return this.method4918(arg1, 0, arg0);
		} else if (this.aClass207_66.method4672(arg0) == 1) {
			return this.method4918(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[I)Lclient!so;")
	private Class5_Sub37_Sub1 method4923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0xFFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub37_Sub1 local33 = (Class5_Sub37_Sub1) this.aClass273_15.method6581(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(61) Class5_Sub29 local61 = (Class5_Sub29) this.aClass273_14.method6581(local26);
			if (local61 == null) {
				local61 = Static279.method4457(this.aClass207_67, arg0, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass273_14.method6585(local26, local61);
			}
			local33 = local61.method4449(arg2);
			if (local33 == null) {
				return null;
			} else {
				local61.method9047();
				this.aClass273_15.method6585(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
