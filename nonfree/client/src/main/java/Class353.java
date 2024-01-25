import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class353 implements Interface17 {

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!faa;")
	private Class91 aClass91_38 = new Class91(128);

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
	public final int[] anIntArray589 = new int[Static433.aClass117_2.anInt3150];

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
	private final int[] anIntArray588 = new int[Static433.aClass117_2.anInt3150];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BII)V")
	public void method7620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray589[arg1] = arg0;
		@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) this.aClass91_38.method2271((long) arg1);
		if (local16 == null) {
			local16 = new Class1_Sub18(Static480.method6650() + 500L);
			this.aClass91_38.method2269((long) arg1, local16);
		} else {
			local16.aLong53 = Static480.method6650() + 500L;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public void method7621() {
		for (@Pc(3) int local3 = 0; local3 < Static433.aClass117_2.anInt3150; local3++) {
			@Pc(12) Class14 local12 = Static433.aClass117_2.method2696(local3);
			if (local12 != null && local12.anInt543 == 0) {
				this.anIntArray588[local3] = 0;
				this.anIntArray589[local3] = 0;
			}
		}
		this.aClass91_38 = new Class91(128);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	public void method7622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray588[arg0] = arg1;
		@Pc(24) Class1_Sub18 local24 = (Class1_Sub18) this.aClass91_38.method2271((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub18(4611686018427387905L);
			this.aClass91_38.method2269((long) arg0, local24);
		} else if (local24.aLong53 != 4611686018427387905L) {
			local24.aLong53 = Static480.method6650() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(BII)V")
	public void method7623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class116 local13 = Static300.aClass321_3.method7117(arg1);
		@Pc(16) int local16 = local13.anInt3147;
		@Pc(19) int local19 = local13.anInt3146;
		@Pc(22) int local22 = local13.anInt3149;
		@Pc(29) int local29 = Class1_Sub8_Sub2_Sub1.anIntArray30[local22 - local19];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method7620(this.anIntArray589[local16] & ~local29 | local29 & arg0 << local19, local16);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)I")
	@Override
	public int method7618(@OriginalArg(0) int arg0) {
		return this.anIntArray589[arg0];
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)I")
	@Override
	public int method7619(@OriginalArg(1) int arg0) {
		@Pc(8) Class116 local8 = Static300.aClass321_3.method7117(arg0);
		@Pc(11) int local11 = local8.anInt3147;
		@Pc(20) int local20 = local8.anInt3146;
		@Pc(23) int local23 = local8.anInt3149;
		@Pc(29) int local29 = Class1_Sub8_Sub2_Sub1.anIntArray30[local23 - local20];
		return this.anIntArray589[local11] >> local20 & local29;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BZ)I")
	public int method7625(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static480.method6650();
		for (@Pc(30) Class1_Sub18 local30 = arg0 ? (Class1_Sub18) this.aClass91_38.method2278() : (Class1_Sub18) this.aClass91_38.method2276(); local30 != null; local30 = (Class1_Sub18) this.aClass91_38.method2276()) {
			if ((local30.aLong53 & 0x3FFFFFFFFFFFFFFFL) < local16) {
				if ((local30.aLong53 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local30.aLong268;
					this.anIntArray589[local55] = this.anIntArray588[local55];
					local30.method7908();
					return local55;
				}
				local30.method7908();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V")
	public void method7626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class116 local8 = Static300.aClass321_3.method7117(arg0);
		@Pc(11) int local11 = local8.anInt3147;
		@Pc(14) int local14 = local8.anInt3146;
		@Pc(17) int local17 = local8.anInt3149;
		@Pc(23) int local23 = Class1_Sub8_Sub2_Sub1.anIntArray30[local17 - local14];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method7622(local11, local23 & arg1 << local14 | this.anIntArray588[local11] & ~local23);
	}
}
