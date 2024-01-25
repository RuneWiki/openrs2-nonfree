import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class117 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!fe;")
	private final Class74 aClass74_16 = new Class74(256);

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!fe;")
	private final Class74 aClass74_17 = new Class74(256);

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!he;")
	private final Class100 aClass100_33;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!he;")
	private final Class100 aClass100_32;

	static {
		new Class267("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!he;Lclient!he;)V")
	public Class117(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1) {
		this.aClass100_33 = arg0;
		this.aClass100_32 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIZ)Lclient!hh;")
	public Class6_Sub17_Sub1 method2804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass100_33.method2516() == 1) {
			return this.method2806(arg0, arg1, 0);
		} else if (this.aClass100_33.method2523(arg1) == 1) {
			return this.method2806(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[III)Lclient!hh;")
	private Class6_Sub17_Sub1 method2806(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 << 4 & 0xFFFB | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub17_Sub1 local31 = (Class6_Sub17_Sub1) this.aClass74_17.method1883(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class127 local49 = Static454.method3004(this.aClass100_33, arg2, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method3001();
			this.aClass74_17.method1890(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray38.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)Lclient!hh;")
	private Class6_Sub17_Sub1 method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub17_Sub1 local33 = (Class6_Sub17_Sub1) this.aClass74_17.method1883(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class6_Sub26 local52 = (Class6_Sub26) this.aClass74_16.method1883(local26);
			if (local52 == null) {
				local52 = Static277.method4182(this.aClass100_32, arg0, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass74_16.method1890(local26, local52);
			}
			local33 = local52.method4179(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method6525();
				this.aClass74_17.method1890(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([III)Lclient!hh;")
	public Class6_Sub17_Sub1 method2809(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass100_32.method2516() == 1) {
			return this.method2808(0, arg1, arg0);
		} else if (this.aClass100_32.method2523(arg1) == 1) {
			return this.method2808(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
