import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class234 {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!efa;")
	private final Class90 aClass90_18 = new Class90(256);

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!efa;")
	private final Class90 aClass90_19 = new Class90(256);

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!mv;")
	private final Class229 aClass229_85;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_84;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;)V")
	public Class234(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1) {
		this.aClass229_85 = arg0;
		this.aClass229_84 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IBI)Lclient!wm;")
	private Class2_Sub13_Sub1 method5041(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 << 4 & 0xFFF7 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub13_Sub1 local31 = (Class2_Sub13_Sub1) this.aClass90_19.method1685(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class100 local52 = Static596.method1807(this.aClass229_85, arg0, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1806();
			this.aClass90_19.method1684(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray101.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII[I)Lclient!wm;")
	private Class2_Sub13_Sub1 method5042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub13_Sub1 local33 = (Class2_Sub13_Sub1) this.aClass90_19.method1685(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class2_Sub37 local52 = (Class2_Sub37) this.aClass90_18.method1685(local26);
			if (local52 == null) {
				local52 = Static406.method5531(this.aClass229_84, arg0, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass90_18.method1684(local52, local26);
			}
			local33 = local52.method5535(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method7657();
				this.aClass90_19.method1684(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[I)Lclient!wm;")
	public Class2_Sub13_Sub1 method5043(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass229_84.method4952() == 1) {
			return this.method5042(0, arg0, arg1);
		} else if (this.aClass229_84.method4981(arg0) == 1) {
			return this.method5042(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[II)Lclient!wm;")
	public Class2_Sub13_Sub1 method5044(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass229_85.method4952() == 1) {
			return this.method5041(0, arg0, arg1);
		} else if (this.aClass229_85.method4981(arg1) == 1) {
			return this.method5041(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
