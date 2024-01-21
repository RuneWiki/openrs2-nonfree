import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCMSALIP")
public final class Class5_Sub1_Sub1_Sub4 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!GCMSALIP", name = "t", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!GCMSALIP", name = "u", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!GCMSALIP", name = "q", descriptor = "B")
	private byte aByte8 = 3;

	@OriginalMember(owner = "client!GCMSALIP", name = "r", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!GCMSALIP", name = "v", descriptor = "B")
	private byte aByte9 = 23;

	@OriginalMember(owner = "client!GCMSALIP", name = "p", descriptor = "Lclient!BKJQHSVH;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!GCMSALIP", name = "l", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!GCMSALIP", name = "m", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!GCMSALIP", name = "n", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!GCMSALIP", name = "o", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!GCMSALIP", name = "s", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!GCMSALIP", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class5_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass6_2 = Class6.aClass6Array1[arg7];
			this.anInt223 = arg0;
			this.anInt224 = arg4;
			this.anInt225 = arg2;
			this.anInt226 = arg6;
			this.anInt227 = arg3 + arg5;
			this.aBoolean78 = false;
			@Pc(39) int local39 = 90 / arg1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("22103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCMSALIP", name = "a", descriptor = "(II)V")
	public void method105(@OriginalArg(1) int arg0) {
		try {
			this.anInt229 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt229 <= this.aClass6_2.aClass32_2.method229(this.anInt228, this.aByte8)) {
							return;
						}
						this.anInt229 -= this.aClass6_2.aClass32_2.method229(this.anInt228, this.aByte8) + 1;
						this.anInt228++;
					} while (this.anInt228 < this.aClass6_2.aClass32_2.anInt441);
				} while (this.anInt228 >= 0 && this.anInt228 < this.aClass6_2.aClass32_2.anInt441);
				this.anInt228 = 0;
				this.aBoolean78 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("500, " + 337 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCMSALIP", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class5_Sub1_Sub1_Sub6 local3 = this.aClass6_2.method26();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass6_2.aClass32_2.anIntArray96[this.anInt228];
			@Pc(27) Class5_Sub1_Sub1_Sub6 local27 = new Class5_Sub1_Sub1_Sub6(true, Class2.method11(local15), local3, this.aByte9, false);
			if (!this.aBoolean78) {
				local27.method384();
				local27.method385(local15);
				local27.anIntArrayArray13 = null;
				local27.anIntArrayArray12 = null;
			}
			if (this.aClass6_2.anInt32 != 128 || this.aClass6_2.anInt33 != 128) {
				local27.method393(this.aClass6_2.anInt32, this.aClass6_2.anInt33, this.aClass6_2.anInt32);
			}
			if (this.aClass6_2.anInt34 != 0) {
				if (this.aClass6_2.anInt34 == 90) {
					local27.method388();
				}
				if (this.aClass6_2.anInt34 == 180) {
					local27.method388();
					local27.method388();
				}
				if (this.aClass6_2.anInt34 == 270) {
					local27.method388();
					local27.method388();
					local27.method388();
				}
			}
			local27.method394(this.aClass6_2.anInt35 + 64, this.aClass6_2.anInt36 + 850, -30, -50, -30, true);
			return local27;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("30497, " + 186 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
