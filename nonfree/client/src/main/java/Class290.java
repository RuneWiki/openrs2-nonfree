import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class290 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!rda;")
	private final Class300 aClass300_35 = new Class300(256);

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!rda;")
	private final Class300 aClass300_36 = new Class300(256);

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!wm;")
	private final Class390 aClass390_93;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_92;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;)V")
	public Class290(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1) {
		this.aClass390_93 = arg0;
		this.aClass390_92 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B[III)Lclient!nga;")
	private Class5_Sub42_Sub1 method6864(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
		@Pc(29) int local29 = local15 | arg1 << 16;
		@Pc(32) long local32 = (long) local29;
		@Pc(39) Class5_Sub42_Sub1 local39 = (Class5_Sub42_Sub1) this.aClass300_36.method7188(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class272 local60 = Static688.method6403(this.aClass390_93, arg1, arg2);
			if (local60 == null) {
				return null;
			}
			local39 = local60.method6406();
			this.aClass300_36.method7191(local39, local32);
			if (arg0 != null) {
				arg0[0] -= local39.aByteArray67.length;
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[IB)Lclient!nga;")
	private Class5_Sub42_Sub1 method6866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = ((arg0 & 0x30000FFF) << 4 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class5_Sub42_Sub1 local33 = (Class5_Sub42_Sub1) this.aClass300_36.method7188(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(65) Class5_Sub38 local65 = (Class5_Sub38) this.aClass300_35.method7188(local26);
			if (local65 == null) {
				local65 = Static338.method5172(this.aClass390_92, arg0, arg1);
				if (local65 == null) {
					return null;
				}
				this.aClass300_35.method7191(local65, local26);
			}
			local33 = local65.method5176(arg2);
			if (local33 == null) {
				return null;
			} else {
				local65.method9052();
				this.aClass300_36.method7191(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[I)Lclient!nga;")
	public Class5_Sub42_Sub1 method6867(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass390_93.method8918() == 1) {
			return this.method6864(arg1, 0, arg0);
		} else if (this.aClass390_93.method8913(arg0) == 1) {
			return this.method6864(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([III)Lclient!nga;")
	public Class5_Sub42_Sub1 method6869(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass390_92.method8918() == 1) {
			return this.method6866(0, arg1, arg0);
		} else if (this.aClass390_92.method8913(arg1) == 1) {
			return this.method6866(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
