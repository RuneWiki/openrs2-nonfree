import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class212 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
	private int anInt6620;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
	private int anInt6621;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
	private int anInt6623;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
	private int anInt6624;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	private int anInt6626;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "Z")
	public boolean aBoolean571;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Lclient!pn;")
	public Class3_Sub28 aClass3_Sub28_2;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
	public int anInt6629;

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "Z")
	public boolean aBoolean572;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	private Class212() {
		if (Static121.anIntArray272 == null) {
			Static365.method6011();
		}
		this.method5547();
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!oa;Lclient!fd;I)V")
	public Class212(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class3_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (Static121.anIntArray272 == null) {
			Static365.method6011();
		}
		this.anInt6629 = arg1.method6538();
		this.aBoolean571 = (this.anInt6629 & 0x10) != 0;
		this.aBoolean572 = (this.anInt6629 & 0x8) != 0;
		this.anInt6629 &= 0x7;
		@Pc(47) int local47 = arg1.method6535() << arg2;
		@Pc(53) int local53 = arg1.method6535() << arg2;
		@Pc(59) int local59 = arg1.method6535() << arg2;
		@Pc(63) int local63 = arg1.method6538();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray97 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray97.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method6535();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray97[local75] = (short) (local90 | local86 << 8);
		}
		local63 = (local63 << Static309.anInt6172) + Static377.anInt7321;
		@Pc(157) int local157 = Static331.anIntArray442 == null ? Static373.anIntArray469[Static504.method7607(arg1.method6535()) & 0xFFFF] : Static331.anIntArray442[arg1.method6535()];
		local86 = arg1.method6538();
		this.anInt6619 = local86 & 0x1F;
		this.anInt6620 = (local86 & 0xE0) << 3;
		if (this.anInt6619 != 31) {
			this.method5547();
		}
		this.method5546(local47, local63, local59, local157, local53, arg0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIIII)V")
	public void method5543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6626 = arg2;
		this.anInt6623 = arg3;
		this.anInt6621 = arg1;
		this.anInt6624 = arg0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIILclient!oa;)V")
	private void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		this.aClass3_Sub28_2 = arg5.method5331(arg0, arg2, arg4, arg1, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
	private void method5547() {
		@Pc(8) int local8 = this.anInt6619;
		if (local8 == 2) {
			this.anInt6626 = 0;
			this.anInt6623 = 1;
			this.anInt6624 = 2048;
			this.anInt6621 = 2048;
		} else if (local8 == 3) {
			this.anInt6626 = 0;
			this.anInt6624 = 4096;
			this.anInt6623 = 1;
			this.anInt6621 = 2048;
		} else if (local8 == 4) {
			this.anInt6623 = 4;
			this.anInt6621 = 2048;
			this.anInt6624 = 2048;
			this.anInt6626 = 0;
		} else if (local8 == 5) {
			this.anInt6621 = 2048;
			this.anInt6626 = 0;
			this.anInt6624 = 8192;
			this.anInt6623 = 4;
		} else if (local8 == 12) {
			this.anInt6621 = 2048;
			this.anInt6623 = 2;
			this.anInt6624 = 2048;
			this.anInt6626 = 0;
		} else if (local8 == 13) {
			this.anInt6623 = 2;
			this.anInt6626 = 0;
			this.anInt6624 = 8192;
			this.anInt6621 = 2048;
		} else if (local8 == 10) {
			this.anInt6624 = 2048;
			this.anInt6626 = 1536;
			this.anInt6621 = 512;
			this.anInt6623 = 3;
		} else if (local8 == 11) {
			this.anInt6623 = 3;
			this.anInt6624 = 4096;
			this.anInt6626 = 1536;
			this.anInt6621 = 512;
		} else if (local8 == 6) {
			this.anInt6623 = 3;
			this.anInt6621 = 768;
			this.anInt6624 = 2048;
			this.anInt6626 = 1280;
		} else if (local8 == 7) {
			this.anInt6623 = 3;
			this.anInt6621 = 768;
			this.anInt6624 = 4096;
			this.anInt6626 = 1280;
		} else if (local8 == 8) {
			this.anInt6621 = 1024;
			this.anInt6626 = 1024;
			this.anInt6624 = 2048;
			this.anInt6623 = 3;
		} else if (local8 == 9) {
			this.anInt6624 = 4096;
			this.anInt6623 = 3;
			this.anInt6626 = 1024;
			this.anInt6621 = 1024;
		} else if (local8 == 14) {
			this.anInt6624 = 2048;
			this.anInt6626 = 1280;
			this.anInt6623 = 1;
			this.anInt6621 = 768;
		} else if (local8 == 15) {
			this.anInt6621 = 512;
			this.anInt6624 = 4096;
			this.anInt6626 = 1536;
			this.anInt6623 = 1;
		} else if (local8 == 16) {
			this.anInt6623 = 1;
			this.anInt6626 = 1792;
			this.anInt6624 = 8192;
			this.anInt6621 = 256;
		} else {
			this.anInt6623 = 0;
			this.anInt6626 = 0;
			this.anInt6621 = 2048;
			this.anInt6624 = 2048;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZZ)V")
	public void method5548(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(54) int local54;
		if (arg1) {
			local54 = 2048;
		} else {
			@Pc(18) int local18 = this.anInt6620 + this.anInt6624 * arg0 / 50 & 0x7FF;
			@Pc(21) int local21 = this.anInt6623;
			if (local21 == 1) {
				local54 = (Class2_Sub3.anIntArray620[local18 << 3] >> 4) + 1024;
			} else if (local21 == 3) {
				local54 = Static121.anIntArray272[local18] >> 1;
			} else if (local21 == 4) {
				local54 = local18 >> 10 << 11;
			} else if (local21 == 2) {
				local54 = local18;
			} else if (local21 == 5) {
				local54 = (local18 >= 1024 ? 2048 - local18 : local18) << 1;
			} else {
				local54 = 2048;
			}
		}
		this.aClass3_Sub28_2.method8151((float) ((local54 * this.anInt6621 >> 11) + this.anInt6626) / 2048.0F);
	}
}
