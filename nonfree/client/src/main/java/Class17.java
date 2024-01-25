import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class17 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Lclient!mo;")
	private final Class221 aClass221_2 = new Class221(256);

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!mo;")
	private final Class221 aClass221_3 = new Class221(256);

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!vo;")
	private final Class348 aClass348_8;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_9;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;)V")
	public Class17(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1) {
		this.aClass348_8 = arg1;
		this.aClass348_9 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([IIB)Lclient!tk;")
	public Class4_Sub42_Sub1 method808(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass348_8.method7985() == 1) {
			return this.method814(arg1, arg0, 0);
		} else if (this.aClass348_8.method7981(arg1) == 1) {
			return this.method814(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI[II)Lclient!tk;")
	private Class4_Sub42_Sub1 method811(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 << 4 & 0xFFFA | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub42_Sub1 local31 = (Class4_Sub42_Sub1) this.aClass221_3.method5075(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class323 local49 = Static605.method7397(this.aClass348_9, arg0, arg2);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method7396();
			this.aClass221_3.method5073(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray90.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[II)Lclient!tk;")
	public Class4_Sub42_Sub1 method813(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass348_9.method7985() == 1) {
			return this.method811(0, arg1, arg0);
		} else if (this.aClass348_9.method7981(arg0) == 1) {
			return this.method811(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ[II)Lclient!tk;")
	private Class4_Sub42_Sub1 method814(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 ^ (arg2 >>> 12 | (arg2 & 0x70000FFF) << 4);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class4_Sub42_Sub1 local38 = (Class4_Sub42_Sub1) this.aClass221_3.method5075(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class4_Sub12 local60 = (Class4_Sub12) this.aClass221_2.method5075(local31);
			if (local60 == null) {
				local60 = Static116.method2124(this.aClass348_8, arg2, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass221_2.method5073(local60, local31);
			}
			local38 = local60.method2116(arg1);
			if (local38 == null) {
				return null;
			} else {
				local60.method8193();
				this.aClass221_3.method5073(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}
}
