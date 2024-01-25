import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class276 {

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "Lclient!tq;")
	private final Class305 aClass305_34 = new Class305(256);

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "Lclient!tq;")
	private final Class305 aClass305_35 = new Class305(256);

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_99;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Lclient!jo;")
	private final Class168 aClass168_98;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!jo;Lclient!jo;)V")
	public Class276(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1) {
		this.aClass168_99 = arg1;
		this.aClass168_98 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([III)Lclient!wb;")
	public Class6_Sub12_Sub1 method6667(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass168_99.method4456() == 1) {
			return this.method6672(arg1, 0, arg0);
		} else if (this.aClass168_99.method4443(arg1) == 1) {
			return this.method6672(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III[I)Lclient!wb;")
	private Class6_Sub12_Sub1 method6668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(21) int local21 = arg1 ^ (arg0 >>> 12 | (arg0 & 0xA0000FFF) << 4);
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class6_Sub12_Sub1 local37 = (Class6_Sub12_Sub1) this.aClass305_35.method7447(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(58) Class33 local58 = Static585.method1086(this.aClass168_98, arg0, arg1);
			if (local58 == null) {
				return null;
			}
			local37 = local58.method1085();
			this.aClass305_35.method7448(local30, local37);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray124.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[I)Lclient!wb;")
	public Class6_Sub12_Sub1 method6669(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass168_98.method4456() == 1) {
			return this.method6668(0, arg0, arg1);
		} else if (this.aClass168_98.method4443(arg0) == 1) {
			return this.method6668(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[II)Lclient!wb;")
	private Class6_Sub12_Sub1 method6672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFF3) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub12_Sub1 local33 = (Class6_Sub12_Sub1) this.aClass305_35.method7447(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class6_Sub37 local52 = (Class6_Sub37) this.aClass305_34.method7447(local26);
			if (local52 == null) {
				local52 = Static368.method5863(this.aClass168_99, arg1, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass305_34.method7448(local26, local52);
			}
			local33 = local52.method5870(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method8151();
				this.aClass305_35.method7448(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
