import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class138 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!qn;")
	private final Class313 aClass313_17 = new Class313(256);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!qn;")
	private final Class313 aClass313_18 = new Class313(256);

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!ik;")
	private final Class182 aClass182_54;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!ik;")
	private final Class182 aClass182_55;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;)V")
	public Class138(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1) {
		this.aClass182_54 = arg1;
		this.aClass182_55 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[IIB)Lclient!wha;")
	private Class3_Sub34_Sub1 method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF2) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(30) long local30 = (long) local21;
		@Pc(37) Class3_Sub34_Sub1 local37 = (Class3_Sub34_Sub1) this.aClass313_18.method7104(local30);
		if (local37 != null) {
			return local37;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class402 local59 = Static738.method9472(this.aClass182_55, arg2, arg0);
			if (local59 == null) {
				return null;
			}
			local37 = local59.method9474();
			this.aClass313_18.method7107(local30, local37);
			if (arg1 != null) {
				arg1[0] -= local37.aByteArray109.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[II)Lclient!wha;")
	private Class3_Sub34_Sub1 method3116(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFFA | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(40) Class3_Sub34_Sub1 local40 = (Class3_Sub34_Sub1) this.aClass313_18.method7104(local26);
		if (local40 != null) {
			return local40;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(66) Class3_Sub27 local66 = (Class3_Sub27) this.aClass313_17.method7104(local26);
			if (local66 == null) {
				local66 = Static230.method3371(this.aClass182_54, arg2, arg0);
				if (local66 == null) {
					return null;
				}
				this.aClass313_17.method7107(local26, local66);
			}
			local40 = local66.method3362(arg1);
			if (local40 == null) {
				return null;
			} else {
				local66.method9596();
				this.aClass313_18.method7107(local26, local40);
				return local40;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)Lclient!wha;")
	public Class3_Sub34_Sub1 method3118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_55.method3956() == 1) {
			return this.method3114(arg1, arg0, 0);
		} else if (this.aClass182_55.method3970(arg1) == 1) {
			return this.method3114(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([III)Lclient!wha;")
	public Class3_Sub34_Sub1 method3121(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_54.method3956() == 1) {
			return this.method3116(arg1, arg0, 0);
		} else if (this.aClass182_54.method3970(arg1) == 1) {
			return this.method3116(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
