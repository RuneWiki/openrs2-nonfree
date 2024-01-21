import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ITKUXCXG")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ITKUXCXG", name = "s", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!ITKUXCXG", name = "u", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!ITKUXCXG", name = "v", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!ITKUXCXG", name = "l", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ITKUXCXG", name = "q", descriptor = "B")
	private byte aByte20 = 7;

	@OriginalMember(owner = "client!ITKUXCXG", name = "w", descriptor = "I")
	private int anInt393 = 959;

	@OriginalMember(owner = "client!ITKUXCXG", name = "t", descriptor = "Lclient!CRSWMDQF;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!ITKUXCXG", name = "m", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!ITKUXCXG", name = "n", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!ITKUXCXG", name = "o", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!ITKUXCXG", name = "p", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!ITKUXCXG", name = "r", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!ITKUXCXG", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass6_1 = Class6.aClass6Array1[arg7];
			this.anInt385 = arg1;
			this.anInt386 = arg6;
			this.anInt387 = arg2;
			this.anInt388 = arg5;
			this.anInt389 = arg3 + arg0;
			this.aBoolean88 = false;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("5430, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITKUXCXG", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = this.aClass6_1.method194();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass6_1.aClass33_1.anIntArray115[this.anInt391];
			@Pc(20) boolean local20 = false;
			@Pc(38) Class2_Sub1_Sub1_Sub6 local38 = new Class2_Sub1_Sub1_Sub6(Class4.method168(this.aByte20, local15), (byte) 9, true, false, local3);
			if (!this.aBoolean88) {
				local38.method519();
				local38.method520(local15);
				local38.anIntArrayArray17 = null;
				local38.anIntArrayArray16 = null;
			}
			if (this.aClass6_1.anInt189 != 128 || this.aClass6_1.anInt190 != 128) {
				local38.method528(this.aClass6_1.anInt190, this.aClass6_1.anInt189, this.aClass6_1.anInt189);
			}
			if (this.aClass6_1.anInt191 != 0) {
				if (this.aClass6_1.anInt191 == 90) {
					local38.method523();
				}
				if (this.aClass6_1.anInt191 == 180) {
					local38.method523();
					local38.method523();
				}
				if (this.aClass6_1.anInt191 == 270) {
					local38.method523();
					local38.method523();
					local38.method523();
				}
			}
			local38.method529(this.aClass6_1.anInt192 + 64, this.aClass6_1.anInt193 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("80099, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ITKUXCXG", name = "a", descriptor = "(II)V")
	public void method229(@OriginalArg(1) int arg0) {
		try {
			this.anInt392 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt392 <= this.aClass6_1.aClass33_1.method461(this.anInt391)) {
							return;
						}
						this.anInt392 -= this.aClass6_1.aClass33_1.method461(this.anInt391) + 1;
						this.anInt391++;
					} while (this.anInt391 < this.aClass6_1.aClass33_1.anInt648);
				} while (this.anInt391 >= 0 && this.anInt391 < this.aClass6_1.aClass33_1.anInt648);
				this.anInt391 = 0;
				this.aBoolean88 = true;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("79422, " + -144 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
