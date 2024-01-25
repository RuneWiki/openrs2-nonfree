import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class261 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!jr;")
	private final Class127 aClass127_35 = new Class127(256);

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!jr;")
	private final Class127 aClass127_36 = new Class127(256);

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!dn;")
	private final Class56 aClass56_97;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!dn;")
	private final Class56 aClass56_98;

	static {
		new Class175("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!dn;Lclient!dn;)V")
	public Class261(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		this.aClass56_97 = arg1;
		this.aClass56_98 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[II)Lclient!eb;")
	private Class3_Sub13_Sub1 method5897(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x50000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(35) Class3_Sub13_Sub1 local35 = (Class3_Sub13_Sub1) this.aClass127_36.method3246(local26);
		if (local35 != null) {
			return local35;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) Class3_Sub6 local54 = (Class3_Sub6) this.aClass127_35.method3246(local26);
			if (local54 == null) {
				local54 = Static23.method647(this.aClass56_97, arg2, arg0);
				if (local54 == null) {
					return null;
				}
				this.aClass127_35.method3257(local26, local54);
			}
			local35 = local54.method651(arg1);
			if (local35 == null) {
				return null;
			} else {
				local54.method5987();
				this.aClass127_36.method3257(local26, local35);
				return local35;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([III)Lclient!eb;")
	public Class3_Sub13_Sub1 method5900(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass56_97.method1380() == 1) {
			return this.method5897(arg1, arg0, 0);
		} else if (this.aClass56_97.method1373(arg1) == 1) {
			return this.method5897(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBI)Lclient!eb;")
	public Class3_Sub13_Sub1 method5904(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass56_98.method1380() == 1) {
			return this.method5905(arg1, 0, arg0);
		} else if (this.aClass56_98.method1373(arg1) == 1) {
			return this.method5905(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII[I)Lclient!eb;")
	private Class3_Sub13_Sub1 method5905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x20000FFF) << 4);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub13_Sub1 local31 = (Class3_Sub13_Sub1) this.aClass127_36.method3246(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class136 local49 = Static458.method3436(this.aClass56_98, arg1, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method3437();
			this.aClass127_36.method3257(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray24.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
