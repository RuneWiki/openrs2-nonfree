import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub1_Sub2_Sub5 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!me", name = "Qb", descriptor = "I")
	private final int anInt2016;

	@OriginalMember(owner = "client!me", name = "Xb", descriptor = "I")
	private final int anInt2019;

	@OriginalMember(owner = "client!me", name = "Rb", descriptor = "I")
	private final int anInt2017;

	@OriginalMember(owner = "client!me", name = "Jb", descriptor = "I")
	private final int anInt2011;

	@OriginalMember(owner = "client!me", name = "Db", descriptor = "I")
	private final int anInt2007;

	@OriginalMember(owner = "client!me", name = "Vb", descriptor = "I")
	private final int anInt2018;

	@OriginalMember(owner = "client!me", name = "Eb", descriptor = "I")
	private final int anInt2008;

	@OriginalMember(owner = "client!me", name = "Bb", descriptor = "Lclient!ed;")
	private Class3_Sub1_Sub4 aClass3_Sub1_Sub4_2;

	@OriginalMember(owner = "client!me", name = "Ib", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!me", name = "zb", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIIZLclient!nd;)V")
	public Class3_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class3_Sub1_Sub2 arg9) {
		this.anInt2016 = arg2;
		this.anInt2019 = arg1;
		this.anInt2017 = arg3;
		this.anInt2011 = arg6;
		this.anInt2007 = arg4;
		this.anInt2018 = arg0;
		this.anInt2008 = arg5;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub4_2 = Static41.method770(arg7);
			this.anInt2010 = 0;
			this.anInt2005 = Static98.anInt2566 - 1;
			if (this.aClass3_Sub1_Sub4_2.anInt864 == 0 && arg9 != null && arg9 instanceof Class3_Sub1_Sub2_Sub5) {
				@Pc(51) Class3_Sub1_Sub2_Sub5 local51 = (Class3_Sub1_Sub2_Sub5) arg9;
				if (this.aClass3_Sub1_Sub4_2 == local51.aClass3_Sub1_Sub4_2) {
					this.anInt2010 = local51.anInt2010;
					this.anInt2005 = local51.anInt2005;
					return;
				}
			}
			if (arg8 && this.aClass3_Sub1_Sub4_2.anInt871 != -1) {
				this.anInt2010 = (int) ((double) this.aClass3_Sub1_Sub4_2.anIntArray58.length * Math.random());
				this.anInt2005 -= (int) (Math.random() * (double) this.aClass3_Sub1_Sub4_2.anIntArray54[this.anInt2010]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		if (this.aClass3_Sub1_Sub4_2 != null) {
			@Pc(13) int local13 = Static98.anInt2566 - this.anInt2005;
			if (local13 > 100 && this.aClass3_Sub1_Sub4_2.anInt871 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (local13 <= this.aClass3_Sub1_Sub4_2.anIntArray54[this.anInt2010]) {
							break label37;
						}
						local13 -= this.aClass3_Sub1_Sub4_2.anIntArray54[this.anInt2010];
						this.anInt2010++;
					} while (this.anInt2010 < this.aClass3_Sub1_Sub4_2.anIntArray58.length);
					this.anInt2010 -= this.aClass3_Sub1_Sub4_2.anInt871;
				} while (this.anInt2010 >= 0 && this.aClass3_Sub1_Sub4_2.anIntArray58.length > this.anInt2010);
				this.aClass3_Sub1_Sub4_2 = null;
			}
			this.anInt2005 = Static98.anInt2566 - local13;
		}
		@Pc(103) Class3_Sub1_Sub15 local103 = Static122.method1962(this.anInt2018);
		if (local103.anIntArray259 != null) {
			local103 = local103.method1817();
		}
		return local103 == null ? null : local103.method1823(this.anInt2011, this.aClass3_Sub1_Sub4_2, this.anInt2007, this.anInt2017, this.anInt2008, this.anInt2019, this.anInt2010, this.anInt2016);
	}
}
