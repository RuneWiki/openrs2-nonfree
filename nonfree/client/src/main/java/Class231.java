import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class231 {

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!cp;")
	private final Class44 aClass44_34 = new Class44(256);

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!cp;")
	private final Class44 aClass44_35 = new Class44(256);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_90;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!b;")
	private final Class20 aClass20_91;

	static {
		new Class57("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!b;Lclient!b;)V")
	public Class231(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		this.aClass20_90 = arg0;
		this.aClass20_91 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[II)Lclient!nd;")
	public Class3_Sub29_Sub1 method5271(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass20_91.method229() == 1) {
			return this.method5276(0, arg1, arg0);
		} else if (this.aClass20_91.method231(arg1) == 1) {
			return this.method5276(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[IZ)Lclient!nd;")
	public Class3_Sub29_Sub1 method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass20_90.method229() == 1) {
			return this.method5275(arg1, arg0, 0);
		} else if (this.aClass20_90.method231(arg0) == 1) {
			return this.method5275(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIII)Lclient!nd;")
	private Class3_Sub29_Sub1 method5275(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x50000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(29) long local29 = (long) local21;
		@Pc(36) Class3_Sub29_Sub1 local36 = (Class3_Sub29_Sub1) this.aClass44_35.method942(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class71 local57 = Static397.method1481(this.aClass20_90, arg2, arg1);
			if (local57 == null) {
				return null;
			}
			local36 = local57.method1484();
			this.aClass44_35.method948(local29, local36);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray54.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB[I)Lclient!nd;")
	private Class3_Sub29_Sub1 method5276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(25) int local25 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg1;
		@Pc(31) int local31 = local25 | arg0 << 16;
		@Pc(36) long local36 = (long) local31 ^ 0x100000000L;
		@Pc(43) Class3_Sub29_Sub1 local43 = (Class3_Sub29_Sub1) this.aClass44_35.method942(local36);
		if (local43 != null) {
			return local43;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(65) Class3_Sub11 local65 = (Class3_Sub11) this.aClass44_34.method942(local36);
			if (local65 == null) {
				local65 = Static87.method1448(this.aClass20_91, arg0, arg1);
				if (local65 == null) {
					return null;
				}
				this.aClass44_34.method948(local36, local65);
			}
			local43 = local65.method1449(arg2);
			if (local43 == null) {
				return null;
			} else {
				local65.method5700();
				this.aClass44_35.method948(local36, local43);
				return local43;
			}
		} else {
			return null;
		}
	}
}
