import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
	public int anInt436;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt434 = this.anInt432 = arg0;
		this.anInt435 = this.anInt436 = arg1;
		this.anInt431 = this.anInt433 = 0;
		this.aByteArray7 = new byte[arg0 * arg1];
		this.anIntArray60 = new int[arg2];
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
	public void method288() {
		@Pc(6) byte[] local6 = new byte[this.anInt432 * this.anInt436];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt436; local10++) {
			for (@Pc(16) int local16 = this.anInt432 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray7[local16 + local10 * this.anInt432];
			}
		}
		this.aByteArray7 = local6;
		this.anInt431 = this.anInt434 - this.anInt432 - this.anInt431;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
	public void method289() {
		@Pc(6) byte[] local6 = new byte[this.anInt432 * this.anInt436];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt436 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt432; local16++) {
				local6[local8++] = this.aByteArray7[local16 + local13 * this.anInt432];
			}
		}
		this.aByteArray7 = local6;
		this.anInt433 = this.anInt435 - this.anInt436 - this.anInt433;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
	public void method290() {
		if (this.anInt432 == this.anInt434 && this.anInt436 == this.anInt435) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt434 * this.anInt435];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt436; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt432; local24++) {
				local17[local24 + this.anInt431 + (local21 + this.anInt433) * this.anInt434] = this.aByteArray7[local19++];
			}
		}
		this.aByteArray7 = local17;
		this.anInt432 = this.anInt434;
		this.anInt436 = this.anInt435;
		this.anInt431 = 0;
		this.anInt433 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public void method291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt431;
		arg1 += this.anInt433;
		@Pc(15) int local15 = arg0 + arg1 * Static81.anInt2634;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt436;
		@Pc(23) int local23 = this.anInt432;
		@Pc(27) int local27 = Static81.anInt2634 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static81.anInt2632) {
			local36 = Static81.anInt2632 - arg1;
			local20 -= local36;
			arg1 = Static81.anInt2632;
			local17 = local36 * local23;
			local15 += local36 * Static81.anInt2634;
		}
		if (arg1 + local20 > Static81.anInt2633) {
			local20 -= arg1 + local20 - Static81.anInt2633;
		}
		if (arg0 < Static81.anInt2635) {
			local36 = Static81.anInt2635 - arg0;
			local23 -= local36;
			arg0 = Static81.anInt2635;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static81.anInt2637) {
			local36 = arg0 + local23 - Static81.anInt2637;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static109.method292(Static81.anIntArray373, this.aByteArray7, this.anIntArray60, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()Lclient!cb;")
	public Class2_Sub1_Sub3_Sub1 method293() {
		@Pc(10) Class2_Sub1_Sub3_Sub1 local10 = new Class2_Sub1_Sub3_Sub1(this.anInt432, this.anInt436, this.anIntArray60.length);
		local10.anInt434 = this.anInt434;
		local10.anInt435 = this.anInt435;
		local10.anInt431 = this.anInt431;
		local10.anInt433 = this.anInt433;
		@Pc(30) int local30 = this.aByteArray7.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray7[local32] = this.aByteArray7[local32];
		}
		local30 = this.anIntArray60.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray60[local51] = this.anIntArray60[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public void method294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray60.length; local1++) {
			@Pc(11) int local11 = this.anIntArray60[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray60[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray60[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray60[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
