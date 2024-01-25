import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class181 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_29 = new Class74(256);

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_30 = new Class74(256);

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!lga;")
	private final Class223 aClass223_62;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!lga;")
	private final Class223 aClass223_63;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;)V")
	public Class181(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1) {
		this.aClass223_62 = arg1;
		this.aClass223_63 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III[I)Lclient!vfa;")
	private Class6_Sub54_Sub1 method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF2);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub54_Sub1 local31 = (Class6_Sub54_Sub1) this.aClass74_30.method1401(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class393 local56 = Static699.method8920(this.aClass223_63, arg0, arg1);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method8922();
			this.aClass74_30.method1399(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray107.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[IB)Lclient!vfa;")
	private Class6_Sub54_Sub1 method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | arg1 << 4 & 0xFFFA) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class6_Sub54_Sub1 local33 = (Class6_Sub54_Sub1) this.aClass74_30.method1401(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(63) Class6_Sub16 local63 = (Class6_Sub16) this.aClass74_29.method1401(local26);
			if (local63 == null) {
				local63 = Static132.method2556(this.aClass223_62, arg1, arg0);
				if (local63 == null) {
					return null;
				}
				this.aClass74_29.method1399(local63, local26);
			}
			local33 = local63.method2555(arg2);
			if (local33 == null) {
				return null;
			} else {
				local63.method9051();
				this.aClass74_30.method1399(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[II)Lclient!vfa;")
	public Class6_Sub54_Sub1 method4562(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass223_62.method5290() == 1) {
			return this.method4561(arg0, 0, arg1);
		} else if (this.aClass223_62.method5264(arg0) == 1) {
			return this.method4561(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([IBI)Lclient!vfa;")
	public Class6_Sub54_Sub1 method4565(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass223_63.method5290() == 1) {
			return this.method4560(0, arg1, arg0);
		} else if (this.aClass223_63.method5264(arg1) == 1) {
			return this.method4560(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
