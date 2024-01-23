import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class12 {

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!hd;")
	private Class50 aClass50_5 = new Class50(256);

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!hd;")
	private Class50 aClass50_6 = new Class50(256);

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!jb;")
	private Class28 aClass28_5;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!jb;")
	private Class28 aClass28_6;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!jb;Lclient!jb;)V")
	public Class12(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		this.aClass28_5 = arg1;
		this.aClass28_6 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[II)Lclient!ee;")
	private Class1_Sub7_Sub1 method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xD0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub7_Sub1 local33 = (Class1_Sub7_Sub1) this.aClass50_6.method1364(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class1_Sub17 local52 = (Class1_Sub17) this.aClass50_5.method1364(local26);
			if (local52 == null) {
				local52 = Static135.method2267(this.aClass28_5, arg1, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass50_5.method1362(local26, local52);
			}
			local33 = local52.method2265(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method3735();
				this.aClass50_6.method1362(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IZII)Lclient!ee;")
	private Class1_Sub7_Sub1 method341(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg1 & 0x70000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub7_Sub1 local31 = (Class1_Sub7_Sub1) this.aClass50_6.method1364(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class43 local52 = Static237.method1256(this.aClass28_6, arg1, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1253();
			this.aClass50_6.method1362(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray24.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[II)Lclient!ee;")
	public Class1_Sub7_Sub1 method344(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass28_6.method825() == 1) {
			return this.method341(arg1, 0, arg0);
		} else if (this.aClass28_6.method832(arg0) == 1) {
			return this.method341(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[I)Lclient!ee;")
	public Class1_Sub7_Sub1 method345(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass28_5.method825() == 1) {
			return this.method339(arg0, 0, arg1);
		} else if (this.aClass28_5.method832(arg0) == 1) {
			return this.method339(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
