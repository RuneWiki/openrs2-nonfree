import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class71_Sub1 extends Class71 implements Interface2 {

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	private int anInt2518 = 50;

	@OriginalMember(owner = "client!il", name = "ab", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "Lclient!lc;")
	private Class98 aClass98_71;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "Lclient!lc;")
	private Class98 aClass98_72;

	@OriginalMember(owner = "client!il", name = "eb", descriptor = "Lclient!ii;")
	private Class69 aClass69_4;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "Lclient!ii;")
	private Class69 aClass69_3;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;Lclient!lc;IZ)V")
	public Class71_Sub1(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aBoolean171 = arg4;
		this.aClass98_71 = arg2;
		this.anInt2518 = arg3;
		this.aClass98_72 = arg0;
		this.aClass69_4 = new Class69(this.anInt2518);
		if (Static178.aBoolean216) {
			this.aClass69_3 = new Class69(this.anInt2518);
		} else {
			this.aClass69_3 = null;
		}
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(II)V")
	public void method1985(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class4_Sub2_Sub3 local16 = (Class4_Sub2_Sub3) this.aClass69_4.method1928(); local16 != null; local16 = (Class4_Sub2_Sub3) this.aClass69_4.method1935()) {
			if (local16.aBoolean12) {
				local16.method220(arg0);
				local16.aBoolean12 = false;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public void method1986() {
		this.aClass69_4.method1932();
		if (this.aClass69_3 != null) {
			this.aClass69_3.method1932();
		}
		Static13.anIntArray27 = null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)V")
	@Override
	public void method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static32.method479(this.method1962(arg1).aByte21 & 0xFF, this.method1962(arg1).aByte20 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(33) Class4_Sub2_Sub3 local33 = this.method1991(arg1);
		if (local33 != null) {
			local21 = local33.method223(this, this.aClass98_71, arg0);
		}
		if (!local21) {
			@Pc(49) Class4_Sub2_Sub13 local49 = this.method1989(arg1);
			local49.method2435();
		}
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(II)I")
	@Override
	public int method1982(@OriginalArg(0) int arg0) {
		return this.method1962(arg0).aByte22 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BZ)V")
	public void method1987(@OriginalArg(1) boolean arg0) {
		this.aBoolean171 = arg0;
		this.method1986();
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method1978(@OriginalArg(0) int arg0) {
		return this.method1962(arg0).aBoolean328;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)I")
	@Override
	public int method1970(@OriginalArg(0) int arg0) {
		return this.method1962(arg0).aByte20 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IFI)[I")
	@Override
	public int[] method1969(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub2_Sub3 local14 = this.method1991(arg1);
		if (local14 == null) {
			return null;
		} else {
			local14.aBoolean12 = true;
			return local14.method219(this, this.aClass98_71, arg0, this.aBoolean171 || this.method1962(arg1).aBoolean326);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I")
	@Override
	public int method1979(@OriginalArg(0) int arg0) {
		return this.method1962(arg0).aShort32 & 0xFFFF;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method1974(@OriginalArg(0) int arg0) {
		return this.aBoolean171 || this.method1962(arg0).aBoolean326;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method1975(@OriginalArg(1) int arg0) {
		@Pc(4) Class4_Sub2_Sub3 local4 = this.method1991(arg0);
		return local4 == null ? null : local4.method217(this, this.aClass98_71, this.aBoolean171 || this.method1962(arg0).aBoolean326);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)Lclient!qe;")
	@Override
	protected Class4_Sub2_Sub17 method1967(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub2_Sub3 local13 = this.method1991(arg0);
		return local13 == null ? null : local13.aClass4_Sub2_Sub17_1;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(BI)I")
	@Override
	public int method1981(@OriginalArg(1) int arg0) {
		return this.method1962(arg0).aByte19 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(IB)Lclient!lh;")
	private Class4_Sub2_Sub13 method1989(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub2_Sub13 local17 = (Class4_Sub2_Sub13) this.aClass69_3.method1930((long) arg0);
		if (local17 == null) {
			local17 = new Class4_Sub2_Sub13(this.method1962(arg0).aShort32 & 0xFFFF);
			this.aClass69_3.method1933((long) arg0, local17);
			return local17;
		} else {
			return local17;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IZ)Lclient!b;")
	private Class4_Sub2_Sub3 method1991(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub2_Sub3 local11 = (Class4_Sub2_Sub3) this.aClass69_4.method1930((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(24) byte[] local24 = this.aClass98_72.method2396(0, arg0);
		if (local24 == null) {
			return null;
		} else {
			local11 = new Class4_Sub2_Sub3(new Class4_Sub17(local24));
			this.aClass69_4.method1933((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1980(@OriginalArg(1) int arg0) {
		return this.method1962(arg0).aBoolean329;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZBIIF)Lclient!af;")
	@Override
	public Class4_Sub2_Sub1_Sub1 method1971(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(14) Class4_Sub2_Sub3 local14 = this.method1991(arg2);
		if (local14 != null && local14.method221(this, this.aClass98_71)) {
			return arg0 ? local14.aClass4_Sub2_Sub17_1.method3411(arg1, arg1, this, (double) arg3, this.aClass98_71) : local14.aClass4_Sub2_Sub17_1.method3416((double) arg3, this.aClass98_71, this, arg1, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)V")
	public void method1993(@OriginalArg(1) int arg0) {
		this.anInt2518 = arg0;
		this.aClass69_4 = new Class69(this.anInt2518);
		if (Static178.aBoolean216) {
			this.aClass69_3 = new Class69(this.anInt2518);
		} else {
			this.aClass69_3 = null;
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1977(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub3 local16 = this.method1991(arg0);
		return local16 == null ? false : local16.method221(this, this.aClass98_71);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	@Override
	public void method1973(@OriginalArg(1) int arg0) {
		this.method1972(this.aBoolean171 || this.method1962(arg0).aBoolean326 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1983(@OriginalArg(1) int arg0) {
		return this.method1962(arg0).aByte21 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method1976(@OriginalArg(1) int arg0) {
		return !this.method1962(arg0).aBoolean325;
	}
}
