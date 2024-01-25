import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class186 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Lclient!wb;")
	private final Class243 aClass243_21 = new Class243(256);

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Lclient!wb;")
	private final Class243 aClass243_22 = new Class243(256);

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!g;")
	private final Class83 aClass83_94;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Lclient!g;")
	private final Class83 aClass83_93;

	static {
		new Class62("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!g;Lclient!g;)V")
	public Class186(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		this.aClass83_94 = arg0;
		this.aClass83_93 = arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB[II)Lclient!jk;")
	private Class2_Sub20_Sub1 method4582(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg2;
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class2_Sub20_Sub1 local38 = (Class2_Sub20_Sub1) this.aClass243_22.method5967(local31);
		if (local38 != null) {
			return local38;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class2_Sub13 local60 = (Class2_Sub13) this.aClass243_21.method5967(local31);
			if (local60 == null) {
				local60 = Static105.method1874(this.aClass83_93, arg0, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass243_21.method5968(local31, local60);
			}
			local38 = local60.method1871(arg1);
			if (local38 == null) {
				return null;
			} else {
				local60.method6130();
				this.aClass243_22.method5968(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[IB)Lclient!jk;")
	public Class2_Sub20_Sub1 method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass83_93.method1956() == 1) {
			return this.method4582(0, arg1, arg0);
		} else if (this.aClass83_93.method1955(arg0) == 1) {
			return this.method4582(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([III)Lclient!jk;")
	public Class2_Sub20_Sub1 method4586(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_94.method1956() == 1) {
			return this.method4588(arg0, arg1, 0);
		} else if (this.aClass83_94.method1955(arg1) == 1) {
			return this.method4588(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([IIII)Lclient!jk;")
	private Class2_Sub20_Sub1 method4588(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF7);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(33) Class2_Sub20_Sub1 local33 = (Class2_Sub20_Sub1) this.aClass243_22.method5967(local24);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(51) Class80 local51 = Static393.method1856(this.aClass83_94, arg2, arg1);
			if (local51 == null) {
				return null;
			}
			local33 = local51.method1857();
			this.aClass243_22.method5968(local24, local33);
			if (arg0 != null) {
				arg0[0] -= local33.aByteArray40.length;
			}
			return local33;
		} else {
			return null;
		}
	}
}
