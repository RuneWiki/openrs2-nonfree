import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class257 {

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Lclient!faa;")
	private final Class91 aClass91_31 = new Class91(256);

	@OriginalMember(owner = "client!on", name = "m", descriptor = "Lclient!faa;")
	private final Class91 aClass91_32 = new Class91(256);

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!sea;")
	private final Class308 aClass308_136;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!sea;")
	private final Class308 aClass308_137;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;)V")
	public Class257(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1) {
		this.aClass308_136 = arg0;
		this.aClass308_137 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([IIIB)Lclient!bu;")
	private Class1_Sub13_Sub1 method5474(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFFF | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub13_Sub1 local33 = (Class1_Sub13_Sub1) this.aClass91_32.method2271(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class1_Sub49 local57 = (Class1_Sub49) this.aClass91_31.method2271(local26);
			if (local57 == null) {
				local57 = Static562.method7593(this.aClass308_137, arg1, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass91_31.method2269(local26, local57);
			}
			local33 = local57.method7594(arg0);
			if (local33 == null) {
				return null;
			} else {
				local57.method7908();
				this.aClass91_32.method2269(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([IIII)Lclient!bu;")
	private Class1_Sub13_Sub1 method5477(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x50000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub13_Sub1 local31 = (Class1_Sub13_Sub1) this.aClass91_32.method2271(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class249 local49 = Static603.method5368(this.aClass308_136, arg2, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method5369();
			this.aClass91_32.method2269(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray8.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([III)Lclient!bu;")
	public Class1_Sub13_Sub1 method5478(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass308_136.method6564() == 1) {
			return this.method5477(arg0, arg1, 0);
		} else if (this.aClass308_136.method6568(arg1) == 1) {
			return this.method5477(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IZ)Lclient!bu;")
	public Class1_Sub13_Sub1 method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass308_137.method6564() == 1) {
			return this.method5474(arg1, 0, arg0);
		} else if (this.aClass308_137.method6568(arg0) == 1) {
			return this.method5474(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
