import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class315 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!wr;")
	private final Class380 aClass380_44 = new Class380(256);

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Lclient!wr;")
	private final Class380 aClass380_45 = new Class380(256);

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Lclient!ni;")
	private final Class223 aClass223_127;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_126;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;)V")
	public Class315(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1) {
		this.aClass223_127 = arg0;
		this.aClass223_126 = arg1;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III[I)Lclient!ib;")
	private Class6_Sub27_Sub1 method7571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF8 | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(35) Class6_Sub27_Sub1 local35 = (Class6_Sub27_Sub1) this.aClass380_45.method8747(local26);
		if (local35 != null) {
			return local35;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class6_Sub20 local57 = (Class6_Sub20) this.aClass380_44.method8747(local26);
			if (local57 == null) {
				local57 = Static172.method3246(this.aClass223_126, arg0, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass380_44.method8753(local57, local26);
			}
			local35 = local57.method3238(arg2);
			if (local35 == null) {
				return null;
			} else {
				local57.method8792();
				this.aClass380_45.method8753(local35, local26);
				return local35;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I)Lclient!ib;")
	public Class6_Sub27_Sub1 method7573(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass223_127.method5961() == 1) {
			return this.method7574(arg1, arg0, 0);
		} else if (this.aClass223_127.method5970(arg0) == 1) {
			return this.method7574(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[III)Lclient!ib;")
	private Class6_Sub27_Sub1 method7574(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub27_Sub1 local31 = (Class6_Sub27_Sub1) this.aClass380_45.method8747(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class51 local52 = Static648.method2092(this.aClass223_127, arg2, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method2094();
			this.aClass380_45.method8753(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray33.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ[I)Lclient!ib;")
	public Class6_Sub27_Sub1 method7575(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass223_126.method5961() == 1) {
			return this.method7571(0, arg0, arg1);
		} else if (this.aClass223_126.method5970(arg0) == 1) {
			return this.method7571(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
