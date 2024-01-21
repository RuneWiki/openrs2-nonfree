import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GOHSICMY")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!GOHSICMY", name = "r", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!GOHSICMY", name = "s", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!GOHSICMY", name = "l", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!GOHSICMY", name = "u", descriptor = "I")
	private int anInt326 = -52;

	@OriginalMember(owner = "client!GOHSICMY", name = "m", descriptor = "Lclient!MBSSGBHW;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!GOHSICMY", name = "n", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!GOHSICMY", name = "o", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!GOHSICMY", name = "p", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!GOHSICMY", name = "q", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!GOHSICMY", name = "t", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!GOHSICMY", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass25_1 = Class25.aClass25Array1[arg1];
			this.anInt319 = arg0;
			this.anInt320 = arg5;
			this.anInt321 = arg3;
			this.anInt322 = arg7;
			this.anInt325 = arg2 + arg6;
			@Pc(33) int local33 = 63 / arg4;
			this.aBoolean65 = false;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("81036, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOHSICMY", name = "a", descriptor = "(II)V")
	public void method144(@OriginalArg(1) int arg0) {
		try {
			this.anInt324 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt324 <= this.aClass25_1.aClass19_1.method243(this.anInt323)) {
							return;
						}
						this.anInt324 -= this.aClass25_1.aClass19_1.method243(this.anInt323) + 1;
						this.anInt323++;
					} while (this.anInt323 < this.aClass25_1.aClass19_1.anInt411);
				} while (this.anInt323 >= 0 && this.anInt323 < this.aClass25_1.aClass19_1.anInt411);
				this.anInt323 = 0;
				this.aBoolean65 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("73043, " + -48 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GOHSICMY", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass25_1.method278();
			@Pc(8) boolean local8 = false;
			if (local3 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass25_1.aClass19_1.anIntArray82[this.anInt323];
			@Pc(36) Class1_Sub1_Sub1_Sub4 local36 = new Class1_Sub1_Sub1_Sub4(local3, true, Class49.method573(local25), 0, false);
			if (!this.aBoolean65) {
				local36.method370();
				local36.method371(local25);
				local36.anIntArrayArray12 = null;
				local36.anIntArrayArray11 = null;
			}
			if (this.aClass25_1.anInt473 != 128 || this.aClass25_1.anInt474 != 128) {
				local36.method379(this.aClass25_1.anInt473, this.aClass25_1.anInt474, this.aClass25_1.anInt473);
			}
			if (this.aClass25_1.anInt475 != 0) {
				if (this.aClass25_1.anInt475 == 90) {
					local36.method374();
				}
				if (this.aClass25_1.anInt475 == 180) {
					local36.method374();
					local36.method374();
				}
				if (this.aClass25_1.anInt475 == 270) {
					local36.method374();
					local36.method374();
					local36.method374();
				}
			}
			local36.method380(this.aClass25_1.anInt476 + 64, this.aClass25_1.anInt477 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("60824, " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
