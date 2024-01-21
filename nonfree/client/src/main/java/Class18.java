import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class18 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!oa;")
	private final Class75 aClass75_3 = new Class75(256);

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!oa;")
	private final Class75 aClass75_4 = new Class75(256);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!wa;")
	private final Class23 aClass23_19;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!wa;")
	private final Class23 aClass23_20;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!wa;Lclient!wa;)V")
	public Class18(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1) {
		this.aClass23_19 = arg0;
		this.aClass23_20 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I)Lclient!ne;")
	public Class5_Sub7_Sub1 method536(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass23_19.method750() == 1) {
			return this.method544(arg1, arg0, 0);
		} else if (this.aClass23_19.method752(arg0) == 1) {
			return this.method544(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IBII)Lclient!ne;")
	private Class5_Sub7_Sub1 method538(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg1 << 4 & 0xFFFD | arg1 >>> 12) ^ arg2;
		@Pc(26) int local26 = local20 | arg1 << 16;
		@Pc(31) long local31 = (long) local26 ^ 0x100000000L;
		@Pc(38) Class5_Sub7_Sub1 local38 = (Class5_Sub7_Sub1) this.aClass75_4.method2072(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(60) Class5_Sub5 local60 = (Class5_Sub5) this.aClass75_3.method2072(local31);
			if (local60 == null) {
				local60 = Static20.method310(this.aClass23_20, arg1, arg2);
				if (local60 == null) {
					return null;
				}
				this.aClass75_3.method2069(local60, local31);
			}
			local38 = local60.method311(arg0);
			if (local38 == null) {
				return null;
			} else {
				local60.method3207();
				this.aClass75_4.method2069(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IZI)Lclient!ne;")
	public Class5_Sub7_Sub1 method542(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass23_20.method750() == 1) {
			return this.method538(arg0, 0, arg1);
		} else if (this.aClass23_20.method752(arg1) == 1) {
			return this.method538(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[III)Lclient!ne;")
	private Class5_Sub7_Sub1 method544(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (arg2 >>> 12 | (arg2 & 0x70000FFF) << 4) ^ arg1;
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class5_Sub7_Sub1 local36 = (Class5_Sub7_Sub1) this.aClass75_4.method2072(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class21 local54 = Static221.method619(this.aClass23_19, arg2, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method620();
			this.aClass75_4.method2069(local36, local29);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray42.length;
			}
			return local36;
		} else {
			return null;
		}
	}
}
