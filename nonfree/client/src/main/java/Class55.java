import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class55 implements Interface10 {

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "Lclient!dfa;")
	private Class74 aClass74_8 = new Class74(128);

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "[I")
	private final int[] anIntArray72 = new int[Static469.aClass47_1.anInt694];

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "[I")
	public final int[] anIntArray73 = new int[Static469.aClass47_1.anInt694];

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(III)V")
	public void method937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class191 local18 = Static61.aClass335_1.method7986(arg1);
		@Pc(21) int local21 = local18.anInt5135;
		@Pc(24) int local24 = local18.anInt5137;
		@Pc(27) int local27 = local18.anInt5136;
		@Pc(34) int local34 = Class332.anIntArray594[local27 - local24];
		if (arg0 < 0 || local34 < arg0) {
			arg0 = 0;
		}
		local34 <<= local24;
		this.method938(local21, this.anIntArray73[local21] & ~local34 | local34 & arg0 << local24);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZII)V")
	public void method938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray73[arg0] = arg1;
		@Pc(21) Class6_Sub40 local21 = (Class6_Sub40) this.aClass74_8.method1401((long) arg0);
		if (local21 == null) {
			local21 = new Class6_Sub40(Static549.method7758() + 500L);
			this.aClass74_8.method1399(local21, (long) arg0);
		} else {
			local21.aLong237 = Static549.method7758() + 500L;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)I")
	public int method939(@OriginalArg(1) boolean arg0) {
		@Pc(15) long local15 = Static549.method7758();
		for (@Pc(30) Class6_Sub40 local30 = arg0 ? (Class6_Sub40) this.aClass74_8.method1404() : (Class6_Sub40) this.aClass74_8.method1405(); local30 != null; local30 = (Class6_Sub40) this.aClass74_8.method1405()) {
			if (local15 > (local30.aLong237 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong237 & 0x4000000000000000L) != 0L) {
					@Pc(67) int local67 = (int) local30.aLong346;
					this.anIntArray73[local67] = this.anIntArray72[local67];
					local30.method9051();
					return local67;
				}
				local30.method9051();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)I")
	@Override
	public int method936(@OriginalArg(1) int arg0) {
		return this.anIntArray73[arg0];
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
	public void method943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray72[arg0] = arg1;
		@Pc(16) Class6_Sub40 local16 = (Class6_Sub40) this.aClass74_8.method1401((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub40(4611686018427387905L);
			this.aClass74_8.method1399(local16, (long) arg0);
		} else if (local16.aLong237 != 4611686018427387905L) {
			local16.aLong237 = Static549.method7758() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public void method944() {
		for (@Pc(3) int local3 = 0; local3 < Static469.aClass47_1.anInt694; local3++) {
			@Pc(18) Class390 local18 = Static469.aClass47_1.method679(local3);
			if (local18 != null && local18.anInt10261 == 0) {
				this.anIntArray72[local3] = 0;
				this.anIntArray73[local3] = 0;
			}
		}
		this.aClass74_8 = new Class74(128);
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(III)V")
	public void method945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class191 local8 = Static61.aClass335_1.method7986(arg1);
		@Pc(11) int local11 = local8.anInt5135;
		@Pc(14) int local14 = local8.anInt5137;
		@Pc(17) int local17 = local8.anInt5136;
		@Pc(34) int local34 = Class332.anIntArray594[local17 - local14];
		if (arg0 < 0 || arg0 > local34) {
			arg0 = 0;
		}
		local34 <<= local14;
		this.method943(local11, ~local34 & this.anIntArray72[local11] | arg0 << local14 & local34);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I")
	@Override
	public int method935(@OriginalArg(1) int arg0) {
		@Pc(18) Class191 local18 = Static61.aClass335_1.method7986(arg0);
		@Pc(21) int local21 = local18.anInt5135;
		@Pc(24) int local24 = local18.anInt5137;
		@Pc(27) int local27 = local18.anInt5136;
		@Pc(34) int local34 = Class332.anIntArray594[local27 - local24];
		return local34 & this.anIntArray73[local21] >> local24;
	}
}
