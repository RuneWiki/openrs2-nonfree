import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class107 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!tm;")
	private final Class197 aClass197_13 = new Class197(256);

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Lclient!tm;")
	private final Class197 aClass197_14 = new Class197(256);

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!wo;")
	private final Class216 aClass216_50;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!wo;")
	private final Class216 aClass216_49;

	static {
		new Class34(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!wo;Lclient!wo;)V")
	public Class107(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1) {
		this.aClass216_50 = arg1;
		this.aClass216_49 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[I)Lclient!ve;")
	private Class1_Sub15_Sub1 method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF5) ^ arg1;
		@Pc(26) int local26 = local15 | arg0 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class1_Sub15_Sub1 local36 = (Class1_Sub15_Sub1) this.aClass197_14.method5157(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class77 local57 = Static364.method2070(this.aClass216_49, arg0, arg1);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method2069();
			this.aClass197_14.method5166(local36, local29);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray92.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[I)Lclient!ve;")
	public Class1_Sub15_Sub1 method2873(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass216_50.method5647() == 1) {
			return this.method2878(arg1, arg0, 0);
		} else if (this.aClass216_50.method5675(arg0) == 1) {
			return this.method2878(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([III)Lclient!ve;")
	public Class1_Sub15_Sub1 method2877(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass216_49.method5647() == 1) {
			return this.method2872(0, arg1, arg0);
		} else if (this.aClass216_49.method5675(arg1) == 1) {
			return this.method2872(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([IZII)Lclient!ve;")
	private Class1_Sub15_Sub1 method2878(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x40000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub15_Sub1 local33 = (Class1_Sub15_Sub1) this.aClass197_14.method5157(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class1_Sub26 local55 = (Class1_Sub26) this.aClass197_13.method5157(local26);
			if (local55 == null) {
				local55 = Static205.method3863(this.aClass216_50, arg2, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass197_13.method5166(local55, local26);
			}
			local33 = local55.method3856(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method5628();
				this.aClass197_14.method5166(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
