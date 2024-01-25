import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class24 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!gu;")
	private final Class96 aClass96_10 = new Class96(256);

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!gu;")
	private final Class96 aClass96_11 = new Class96(256);

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_26;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!ul;")
	private final Class246 aClass246_25;

	static {
		new Class7("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!ul;Lclient!ul;)V")
	public Class24(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		this.aClass246_26 = arg0;
		this.aClass246_25 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IB)Lclient!fv;")
	public Class1_Sub20_Sub1 method607(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass246_26.method5502() == 1) {
			return this.method609(arg1, arg0, 0);
		} else if (this.aClass246_26.method5492(arg0) == 1) {
			return this.method609(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([IIIZ)Lclient!fv;")
	private Class1_Sub20_Sub1 method609(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub20_Sub1 local31 = (Class1_Sub20_Sub1) this.aClass96_11.method2335(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class164 local49 = Static466.method3769(this.aClass246_26, arg2, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method3767();
			this.aClass96_11.method2341(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray46.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IZ)Lclient!fv;")
	public Class1_Sub20_Sub1 method610(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass246_25.method5502() == 1) {
			return this.method611(0, arg0, arg1);
		} else if (this.aClass246_25.method5492(arg0) == 1) {
			return this.method611(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III[I)Lclient!fv;")
	private Class1_Sub20_Sub1 method611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFFA | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub20_Sub1 local33 = (Class1_Sub20_Sub1) this.aClass96_11.method2335(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class1_Sub34 local55 = (Class1_Sub34) this.aClass96_10.method2335(local26);
			if (local55 == null) {
				local55 = Static288.method4187(this.aClass246_25, arg0, arg1);
				if (local55 == null) {
					return null;
				}
				this.aClass96_10.method2341(local26, local55);
			}
			local33 = local55.method4180(arg2);
			if (local33 == null) {
				return null;
			} else {
				local55.method6020();
				this.aClass96_11.method2341(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
