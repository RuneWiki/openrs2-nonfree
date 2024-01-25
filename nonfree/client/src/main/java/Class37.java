import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class37 {

	@OriginalMember(owner = "client!bia", name = "l", descriptor = "Lclient!tga;")
	private final Class335 aClass335_3 = new Class335(256);

	@OriginalMember(owner = "client!bia", name = "m", descriptor = "Lclient!tga;")
	private final Class335 aClass335_4 = new Class335(256);

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_9;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "Lclient!cb;")
	private final Class50 aClass50_8;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;)V")
	public Class37(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1) {
		this.aClass50_9 = arg0;
		this.aClass50_8 = arg1;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II[I)Lclient!bc;")
	public Class5_Sub9_Sub1 method613(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass50_8.method902() == 1) {
			return this.method614(0, arg0, arg1);
		} else if (this.aClass50_8.method913(arg0) == 1) {
			return this.method614(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III[I)Lclient!bc;")
	private Class5_Sub9_Sub1 method614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(19) int local19 = ((arg0 & 0x40000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(25) int local25 = local19 | arg0 << 16;
		@Pc(30) long local30 = (long) local25 ^ 0x100000000L;
		@Pc(37) Class5_Sub9_Sub1 local37 = (Class5_Sub9_Sub1) this.aClass335_4.method7766(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class5_Sub54 local56 = (Class5_Sub54) this.aClass335_3.method7766(local30);
			if (local56 == null) {
				local56 = Static638.method8453(this.aClass50_8, arg0, arg1);
				if (local56 == null) {
					return null;
				}
				this.aClass335_3.method7770(local30, local56);
			}
			local37 = local56.method8463(arg2);
			if (local37 == null) {
				return null;
			} else {
				local56.method8829();
				this.aClass335_4.method7770(local30, local37);
				return local37;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BII[I)Lclient!bc;")
	private Class5_Sub9_Sub1 method615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFD) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(29) long local29 = (long) local21;
		@Pc(36) Class5_Sub9_Sub1 local36 = (Class5_Sub9_Sub1) this.aClass335_4.method7766(local29);
		if (local36 != null) {
			return local36;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class259 local57 = Static682.method6432(this.aClass50_9, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method6434();
			this.aClass335_4.method7770(local29, local36);
			if (arg2 != null) {
				arg2[0] -= local36.aByteArray4.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I[II)Lclient!bc;")
	public Class5_Sub9_Sub1 method618(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass50_9.method902() == 1) {
			return this.method615(arg0, 0, arg1);
		} else if (this.aClass50_9.method913(arg0) == 1) {
			return this.method615(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
