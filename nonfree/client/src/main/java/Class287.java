import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class287 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!dj;")
	private final Class66 aClass66_32 = new Class66(256);

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!dj;")
	private final Class66 aClass66_33 = new Class66(256);

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_98;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!bt;")
	private final Class34 aClass34_97;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;)V")
	public Class287(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		this.aClass34_98 = arg1;
		this.aClass34_97 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IB)Lclient!aia;")
	public Class4_Sub4_Sub1 method6471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass34_98.method1247() == 1) {
			return this.method6475(arg0, 0, arg1);
		} else if (this.aClass34_98.method1233(arg0) == 1) {
			return this.method6475(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([IIII)Lclient!aia;")
	private Class4_Sub4_Sub1 method6473(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x60000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub4_Sub1 local31 = (Class4_Sub4_Sub1) this.aClass66_33.method1994(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(49) Class341 local49 = Static687.method7487(this.aClass34_97, arg2, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method7490();
			this.aClass66_33.method1985(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray1.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[II)Lclient!aia;")
	public Class4_Sub4_Sub1 method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass34_97.method1247() == 1) {
			return this.method6473(arg1, arg0, 0);
		} else if (this.aClass34_97.method1233(arg0) == 1) {
			return this.method6473(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III[I)Lclient!aia;")
	private Class4_Sub4_Sub1 method6475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 << 4 & 0xFFF8 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class4_Sub4_Sub1 local38 = (Class4_Sub4_Sub1) this.aClass66_33.method1994(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class4_Sub16 local60 = (Class4_Sub16) this.aClass66_32.method1994(local31);
			if (local60 == null) {
				local60 = Static113.method2139(this.aClass34_98, arg1, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass66_32.method1985(local60, local31);
			}
			local38 = local60.method2131(arg2);
			if (local38 == null) {
				return null;
			} else {
				local60.method9000();
				this.aClass66_33.method1985(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}
}
