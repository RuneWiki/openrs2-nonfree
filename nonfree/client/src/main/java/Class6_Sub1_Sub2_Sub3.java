import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GJMFUMBP")
public final class Class6_Sub1_Sub2_Sub3 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!GJMFUMBP", name = "o", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!GJMFUMBP", name = "p", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!GJMFUMBP", name = "m", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!GJMFUMBP", name = "q", descriptor = "B")
	private byte aByte19 = 2;

	@OriginalMember(owner = "client!GJMFUMBP", name = "v", descriptor = "I")
	private int anInt198 = -80;

	@OriginalMember(owner = "client!GJMFUMBP", name = "w", descriptor = "Lclient!OKJTNJLE;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!GJMFUMBP", name = "r", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!GJMFUMBP", name = "s", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!GJMFUMBP", name = "t", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!GJMFUMBP", name = "u", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!GJMFUMBP", name = "n", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!GJMFUMBP", name = "<init>", descriptor = "(IIIIIBII)V")
	public Class6_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass28_1 = Class28.aClass28Array1[arg1];
			this.anInt194 = arg3;
			this.anInt195 = arg2;
			@Pc(26) boolean local26 = false;
			this.anInt196 = arg7;
			this.anInt197 = arg6;
			this.anInt191 = arg4 + arg0;
			this.aBoolean62 = false;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("45781, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJMFUMBP", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class6_Sub1_Sub2_Sub2 local3 = this.aClass28_1.method188();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass28_1.aClass2_2.anIntArray10[this.anInt192];
			if (2 == this.aByte19) {
				@Pc(21) boolean local21 = false;
			} else {
				this.anInt198 = 460;
			}
			@Pc(37) Class6_Sub1_Sub2_Sub2 local37 = new Class6_Sub1_Sub2_Sub2(local3, Class27.method185(local15), true, (byte) 8, false);
			if (!this.aBoolean62) {
				local37.method93();
				local37.method94(local15);
				local37.anIntArrayArray5 = null;
				local37.anIntArrayArray4 = null;
			}
			if (this.aClass28_1.anInt351 != 128 || this.aClass28_1.anInt352 != 128) {
				local37.method102(this.aClass28_1.anInt351, this.aClass28_1.anInt351, this.aClass28_1.anInt352);
			}
			if (this.aClass28_1.anInt353 != 0) {
				if (this.aClass28_1.anInt353 == 90) {
					local37.method97();
				}
				if (this.aClass28_1.anInt353 == 180) {
					local37.method97();
					local37.method97();
				}
				if (this.aClass28_1.anInt353 == 270) {
					local37.method97();
					local37.method97();
					local37.method97();
				}
			}
			local37.method103(64 + this.aClass28_1.anInt354, 850 + this.aClass28_1.anInt355, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("37818, " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJMFUMBP", name = "a", descriptor = "(II)V")
	public void method127(@OriginalArg(0) int arg0) {
		try {
			this.anInt193 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt193 <= this.aClass28_1.aClass2_2.method12(this.anInt192, 214)) {
							return;
						}
						this.anInt193 -= this.aClass28_1.aClass2_2.method12(this.anInt192, 214);
						this.anInt192++;
					} while (this.anInt192 < this.aClass28_1.aClass2_2.anInt40);
				} while (this.anInt192 >= 0 && this.anInt192 < this.aClass28_1.aClass2_2.anInt40);
				this.anInt192 = 0;
				this.aBoolean62 = true;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("6361, " + arg0 + ", " + -10939 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}
}
