import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class113 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!waa;")
	private final Class350 aClass350_7 = new Class350(256);

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!waa;")
	private final Class350 aClass350_8 = new Class350(256);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!jn;")
	private final Class176 aClass176_44;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_45;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;)V")
	public Class113(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1) {
		this.aClass176_44 = arg0;
		this.aClass176_45 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[III)Lclient!ep;")
	private Class4_Sub16_Sub1 method2939(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF8) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class4_Sub16_Sub1 local33 = (Class4_Sub16_Sub1) this.aClass350_8.method8207(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class4_Sub47 local59 = (Class4_Sub47) this.aClass350_7.method8207(local26);
			if (local59 == null) {
				local59 = Static527.method7640(this.aClass176_45, arg0, arg2);
				if (local59 == null) {
					return null;
				}
				this.aClass350_7.method8199(local26, local59);
			}
			local33 = local59.method7635(arg1);
			if (local33 == null) {
				return null;
			} else {
				local59.method8379();
				this.aClass350_8.method8199(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[I)Lclient!ep;")
	public Class4_Sub16_Sub1 method2940(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass176_45.method3973() == 1) {
			return this.method2939(0, arg1, arg0);
		} else if (this.aClass176_45.method3999(arg0) == 1) {
			return this.method2939(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I[III)Lclient!ep;")
	private Class4_Sub16_Sub1 method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 >>> 12 | (arg2 & 0x10000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub16_Sub1 local31 = (Class4_Sub16_Sub1) this.aClass350_8.method8207(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class321 local49 = Static602.method7590(this.aClass176_44, arg2, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method7592();
			this.aClass350_8.method8199(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray27.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([IBI)Lclient!ep;")
	public Class4_Sub16_Sub1 method2943(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass176_44.method3973() == 1) {
			return this.method2942(arg1, arg0, 0);
		} else if (this.aClass176_44.method3999(arg1) == 1) {
			return this.method2942(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
