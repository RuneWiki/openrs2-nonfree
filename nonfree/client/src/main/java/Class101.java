import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class101 implements Interface2 {

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Lclient!hd;")
	private Class128 aClass128_11 = new Class128(128);

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "[I")
	private final int[] anIntArray196 = new int[Static509.aClass208_6.anInt5718];

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "[I")
	public final int[] anIntArray195 = new int[Static509.aClass208_6.anInt5718];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
	public void method2867() {
		for (@Pc(11) int local11 = 0; local11 < Static509.aClass208_6.anInt5718; local11++) {
			@Pc(18) Class334 local18 = Static509.aClass208_6.method4919(local11);
			if (local18 != null && local18.anInt8846 == 0) {
				this.anIntArray196[local11] = 0;
				this.anIntArray195[local11] = 0;
			}
		}
		this.aClass128_11 = new Class128(128);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)I")
	@Override
	public int method2865(@OriginalArg(1) int arg0) {
		@Pc(15) Class81 local15 = Static183.aClass316_1.method6789(arg0);
		@Pc(18) int local18 = local15.anInt2184;
		@Pc(21) int local21 = local15.anInt2185;
		@Pc(24) int local24 = local15.anInt2189;
		@Pc(31) int local31 = Class4_Sub2_Sub3.anIntArray497[local24 - local21];
		return local31 & this.anIntArray195[local18] >> local21;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)I")
	@Override
	public int method2866(@OriginalArg(0) int arg0) {
		return this.anIntArray195[arg0];
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	public void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class81 local8 = Static183.aClass316_1.method6789(arg0);
		@Pc(11) int local11 = local8.anInt2184;
		@Pc(14) int local14 = local8.anInt2185;
		@Pc(17) int local17 = local8.anInt2189;
		@Pc(24) int local24 = Class4_Sub2_Sub3.anIntArray497[local17 - local14];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method2871(local11, ~local24 & this.anIntArray195[local11] | arg1 << local14 & local24);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BZ)I")
	public int method2870(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static8.method201();
		for (@Pc(30) Class6_Sub47 local30 = arg0 ? (Class6_Sub47) this.aClass128_11.method3265() : (Class6_Sub47) this.aClass128_11.method3273(); local30 != null; local30 = (Class6_Sub47) this.aClass128_11.method3273()) {
			if ((local30.aLong240 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong240 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local30.aLong263;
					this.anIntArray195[local56] = this.anIntArray196[local56];
					local30.method7804();
					return local56;
				}
				local30.method7804();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(III)V")
	public void method2871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray195[arg0] = arg1;
		@Pc(24) Class6_Sub47 local24 = (Class6_Sub47) this.aClass128_11.method3263((long) arg0);
		if (local24 == null) {
			local24 = new Class6_Sub47(Static8.method201() + 500L);
			this.aClass128_11.method3267(local24, (long) arg0);
		} else {
			local24.aLong240 = Static8.method201() + 500L;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ)V")
	public void method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class81 local14 = Static183.aClass316_1.method6789(arg0);
		@Pc(17) int local17 = local14.anInt2184;
		@Pc(20) int local20 = local14.anInt2185;
		@Pc(23) int local23 = local14.anInt2189;
		@Pc(30) int local30 = Class4_Sub2_Sub3.anIntArray497[local23 - local20];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method2874(local17, this.anIntArray196[local17] & ~local30 | arg1 << local20 & local30);
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(III)V")
	public void method2874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray196[arg0] = arg1;
		@Pc(24) Class6_Sub47 local24 = (Class6_Sub47) this.aClass128_11.method3263((long) arg0);
		if (local24 == null) {
			local24 = new Class6_Sub47(4611686018427387905L);
			this.aClass128_11.method3267(local24, (long) arg0);
		} else if (local24.aLong240 != 4611686018427387905L) {
			local24.aLong240 = Static8.method201() + 500L | 0x4000000000000000L;
		}
	}
}
