import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class2_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "I")
	public int anInt1369;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	public int anInt1371;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V")
	public void method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray167.length; local1++) {
			@Pc(11) int local11 = this.anIntArray167[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray167[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray167[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray167[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
	public void method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1372;
		arg1 += this.anInt1371;
		@Pc(15) int local15 = arg0 + arg1 * Static118.anInt2964;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1367;
		@Pc(23) int local23 = this.anInt1370;
		@Pc(27) int local27 = Static118.anInt2964 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static118.anInt2965) {
			local36 = Static118.anInt2965 - arg1;
			local20 -= local36;
			arg1 = Static118.anInt2965;
			local17 = local36 * local23;
			local15 += local36 * Static118.anInt2964;
		}
		if (arg1 + local20 > Static118.anInt2969) {
			local20 -= arg1 + local20 - Static118.anInt2969;
		}
		if (arg0 < Static118.anInt2967) {
			local36 = Static118.anInt2967 - arg0;
			local23 -= local36;
			arg0 = Static118.anInt2967;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static118.anInt2968) {
			local36 = arg0 + local23 - Static118.anInt2968;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static139.method995(Static118.anIntArray419, this.aByteArray21, this.anIntArray167, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "()V")
	public void method997() {
		if (this.anInt1370 == this.anInt1369 && this.anInt1367 == this.anInt1368) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1369 * this.anInt1368];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1367; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1370; local24++) {
				local17[local24 + this.anInt1372 + (local21 + this.anInt1371) * this.anInt1369] = this.aByteArray21[local19++];
			}
		}
		this.aByteArray21 = local17;
		this.anInt1370 = this.anInt1369;
		this.anInt1367 = this.anInt1368;
		this.anInt1372 = 0;
		this.anInt1371 = 0;
	}
}
