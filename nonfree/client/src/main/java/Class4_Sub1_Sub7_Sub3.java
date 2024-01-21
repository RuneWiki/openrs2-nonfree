import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class4_Sub1_Sub7_Sub3 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
	public int anInt3482;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	public int anInt3484;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public int anInt3486;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	public int anInt3487;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public void method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray327.length; local1++) {
			@Pc(11) int local11 = this.anIntArray327[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray327[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray327[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray327[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3485;
		arg1 += this.anInt3487;
		@Pc(15) int local15 = arg0 + arg1 * Static145.anInt3841;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3482;
		@Pc(23) int local23 = this.anInt3484;
		@Pc(27) int local27 = Static145.anInt3841 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static145.anInt3836) {
			local36 = Static145.anInt3836 - arg1;
			local20 -= local36;
			arg1 = Static145.anInt3836;
			local17 = local36 * local23;
			local15 += local36 * Static145.anInt3841;
		}
		if (arg1 + local20 > Static145.anInt3840) {
			local20 -= arg1 + local20 - Static145.anInt3840;
		}
		if (arg0 < Static145.anInt3837) {
			local36 = Static145.anInt3837 - arg0;
			local23 -= local36;
			arg0 = Static145.anInt3837;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static145.anInt3839) {
			local36 = arg0 + local23 - Static145.anInt3839;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static195.method2641(Static145.anIntArray411, this.aByteArray39, this.anIntArray327, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	public void method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3485;
		arg1 += this.anInt3487;
		@Pc(15) int local15 = arg0 + arg1 * Static145.anInt3841;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3482;
		@Pc(23) int local23 = this.anInt3484;
		@Pc(27) int local27 = Static145.anInt3841 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static145.anInt3836) {
			local36 = Static145.anInt3836 - arg1;
			local20 -= local36;
			arg1 = Static145.anInt3836;
			local17 = local36 * local23;
			local15 += local36 * Static145.anInt3841;
		}
		if (arg1 + local20 > Static145.anInt3840) {
			local20 -= arg1 + local20 - Static145.anInt3840;
		}
		if (arg0 < Static145.anInt3837) {
			local36 = Static145.anInt3837 - arg0;
			local23 -= local36;
			arg0 = Static145.anInt3837;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static145.anInt3839) {
			local36 = arg0 + local23 - Static145.anInt3839;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static195.method2640(Static145.anIntArray411, this.aByteArray39, this.anIntArray327, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
	public void method2644() {
		if (this.anInt3484 == this.anInt3483 && this.anInt3482 == this.anInt3486) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3483 * this.anInt3486];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3482; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3484; local24++) {
				local17[local24 + this.anInt3485 + (local21 + this.anInt3487) * this.anInt3483] = this.aByteArray39[local19++];
			}
		}
		this.aByteArray39 = local17;
		this.anInt3484 = this.anInt3483;
		this.anInt3482 = this.anInt3486;
		this.anInt3485 = 0;
		this.anInt3487 = 0;
	}
}
