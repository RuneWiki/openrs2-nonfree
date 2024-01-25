import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class249 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!wh;")
	private final Class356 aClass356_29 = new Class356(256);

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!wh;")
	private final Class356 aClass356_30 = new Class356(256);

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!ga;")
	private final Class111 aClass111_94;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!ga;")
	private final Class111 aClass111_95;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;)V")
	public Class249(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1) {
		this.aClass111_94 = arg1;
		this.aClass111_95 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([IBI)Lclient!ql;")
	public Class1_Sub40_Sub1 method5604(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass111_94.method2436() == 1) {
			return this.method5605(0, arg0, arg1);
		} else if (this.aClass111_94.method2442(arg1) == 1) {
			return this.method5605(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[II)Lclient!ql;")
	private Class1_Sub40_Sub1 method5605(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg0 & 0xD0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub40_Sub1 local33 = (Class1_Sub40_Sub1) this.aClass356_30.method7796(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class1_Sub38 local60 = (Class1_Sub38) this.aClass356_29.method7796(local26);
			if (local60 == null) {
				local60 = Static405.method5723(this.aClass111_94, arg0, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass356_29.method7800(local26, local60);
			}
			local33 = local60.method5719(arg1);
			if (local33 == null) {
				return null;
			} else {
				local60.method7878();
				this.aClass356_30.method7800(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[III)Lclient!ql;")
	private Class1_Sub40_Sub1 method5606(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(33) Class1_Sub40_Sub1 local33 = (Class1_Sub40_Sub1) this.aClass356_30.method7796(local24);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(56) Class176 local56 = Static601.method4024(this.aClass111_95, arg0, arg2);
			if (local56 == null) {
				return null;
			}
			local33 = local56.method4025();
			this.aClass356_30.method7800(local24, local33);
			if (arg1 != null) {
				arg1[0] -= local33.aByteArray79.length;
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB[I)Lclient!ql;")
	public Class1_Sub40_Sub1 method5607(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass111_95.method2436() == 1) {
			return this.method5606(0, arg1, arg0);
		} else if (this.aClass111_95.method2442(arg0) == 1) {
			return this.method5606(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
