import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class367 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
	private int anInt9849;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	private int anInt9852;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	private int anInt9853;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	public int anInt9854;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "[S")
	public short[] aShortArray145;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!kb;")
	public Class2_Sub24 aClass2_Sub24_3;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	private int anInt9856;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int anInt9857;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public int anInt9858;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean aBoolean724;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	private Class367() {
		if (Static283.anIntArray542 == null) {
			Static137.method1860();
		}
		this.method8225();
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!ha;Lclient!vj;I)V")
	public Class367(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class2_Sub22 arg1, @OriginalArg(2) int arg2) {
		if (Static283.anIntArray542 == null) {
			Static137.method1860();
		}
		this.anInt9858 = arg1.method8547();
		this.aBoolean724 = (this.anInt9858 & 0x8) != 0;
		this.aBoolean723 = (this.anInt9858 & 0x10) != 0;
		this.anInt9858 &= 0x7;
		@Pc(47) int local47 = arg1.method8546() << arg2;
		@Pc(53) int local53 = arg1.method8546() << arg2;
		@Pc(59) int local59 = arg1.method8546() << arg2;
		@Pc(63) int local63 = arg1.method8547();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray145 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray145.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method8546();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray145[local75] = (short) (local90 | local86 << 8);
		}
		local63 = Static427.anInt6729 + (local63 << Static609.anInt9827);
		@Pc(155) int local155 = Static343.anIntArray359 == null ? Static486.anIntArray562[Static261.method3559(arg1.method8546()) & 0xFFFF] : Static343.anIntArray359[arg1.method8546()];
		local86 = arg1.method8547();
		this.anInt9854 = local86 & 0x1F;
		this.anInt9852 = (local86 & 0xE0) << 3;
		if (this.anInt9854 != 31) {
			this.method8225();
		}
		this.method8222(arg0, local155, local47, local59, local63, local53);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIII)V")
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9853 = arg2;
		this.anInt9856 = arg1;
		this.anInt9849 = arg0;
		this.anInt9857 = arg3;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZII)V")
	public void method8220(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (arg0) {
			local15 = 2048;
		} else {
			@Pc(29) int local29 = arg1 * this.anInt9857 / 50 + this.anInt9852 & 0x7FF;
			@Pc(32) int local32 = this.anInt9856;
			if (local32 == 1) {
				local15 = (Canvas_Sub1.anIntArray497[local29 << 3] >> 4) + 1024;
			} else if (local32 == 3) {
				local15 = Static283.anIntArray542[local29] >> 1;
			} else if (local32 == 4) {
				local15 = local29 >> 10 << 11;
			} else if (local32 == 2) {
				local15 = local29;
			} else if (local32 == 5) {
				local15 = (local29 < 1024 ? local29 : 2048 - local29) << 1;
			} else {
				local15 = 2048;
			}
		}
		this.aClass2_Sub24_3.method6310((float) (this.anInt9853 + (local15 * this.anInt9849 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method8222(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass2_Sub24_3 = arg0.method6929(arg2, arg3, arg5, arg4, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	private void method8225() {
		@Pc(10) int local10 = this.anInt9854;
		if (local10 == 2) {
			this.anInt9856 = 1;
			this.anInt9857 = 2048;
			this.anInt9849 = 2048;
			this.anInt9853 = 0;
		} else if (local10 == 3) {
			this.anInt9857 = 4096;
			this.anInt9853 = 0;
			this.anInt9856 = 1;
			this.anInt9849 = 2048;
		} else if (local10 == 4) {
			this.anInt9849 = 2048;
			this.anInt9857 = 2048;
			this.anInt9856 = 4;
			this.anInt9853 = 0;
		} else if (local10 == 5) {
			this.anInt9856 = 4;
			this.anInt9857 = 8192;
			this.anInt9853 = 0;
			this.anInt9849 = 2048;
		} else if (local10 == 12) {
			this.anInt9856 = 2;
			this.anInt9849 = 2048;
			this.anInt9857 = 2048;
			this.anInt9853 = 0;
		} else if (local10 == 13) {
			this.anInt9856 = 2;
			this.anInt9853 = 0;
			this.anInt9849 = 2048;
			this.anInt9857 = 8192;
		} else if (local10 == 10) {
			this.anInt9856 = 3;
			this.anInt9849 = 512;
			this.anInt9857 = 2048;
			this.anInt9853 = 1536;
		} else if (local10 == 11) {
			this.anInt9853 = 1536;
			this.anInt9856 = 3;
			this.anInt9857 = 4096;
			this.anInt9849 = 512;
		} else if (local10 == 6) {
			this.anInt9853 = 1280;
			this.anInt9856 = 3;
			this.anInt9857 = 2048;
			this.anInt9849 = 768;
		} else if (local10 == 7) {
			this.anInt9849 = 768;
			this.anInt9856 = 3;
			this.anInt9857 = 4096;
			this.anInt9853 = 1280;
		} else if (local10 == 8) {
			this.anInt9849 = 1024;
			this.anInt9853 = 1024;
			this.anInt9856 = 3;
			this.anInt9857 = 2048;
		} else if (local10 == 9) {
			this.anInt9849 = 1024;
			this.anInt9856 = 3;
			this.anInt9853 = 1024;
			this.anInt9857 = 4096;
		} else if (local10 == 14) {
			this.anInt9849 = 768;
			this.anInt9857 = 2048;
			this.anInt9853 = 1280;
			this.anInt9856 = 1;
		} else if (local10 == 15) {
			this.anInt9857 = 4096;
			this.anInt9856 = 1;
			this.anInt9853 = 1536;
			this.anInt9849 = 512;
		} else if (local10 == 16) {
			this.anInt9853 = 1792;
			this.anInt9849 = 256;
			this.anInt9856 = 1;
			this.anInt9857 = 8192;
		} else {
			this.anInt9857 = 2048;
			this.anInt9853 = 0;
			this.anInt9849 = 2048;
			this.anInt9856 = 0;
		}
	}
}
