import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt143 = 9;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "B")
	private byte aByte1 = 69;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!oc;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIBZIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt144 = arg6;
			this.anInt145 = arg8;
			if (arg2 != this.aByte1) {
				throw new NullPointerException();
			}
			this.anInt146 = arg1;
			this.anInt147 = arg5;
			this.anInt148 = arg4;
			this.anInt149 = arg9;
			this.anInt150 = arg7;
			this.aClass29_1 = Class29.aClass29Array1[arg0];
			this.anInt151 = 0;
			this.anInt152 = client.anInt209;
			if (arg3 && this.aClass29_1.anInt808 != -1) {
				this.anInt151 = (int) (Math.random() * (double) this.aClass29_1.anInt807);
				this.anInt152 -= (int) (Math.random() * (double) this.aClass29_1.method529(this.anInt151));
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("69904, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			@Pc(9) int local9;
			if (this.aClass29_1 != null) {
				local9 = client.anInt209 - this.anInt152;
				if (local9 > 100 && this.aClass29_1.anInt808 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass29_1.method529(this.anInt151)) {
								break label36;
							}
							local9 -= this.aClass29_1.method529(this.anInt151);
							this.anInt151++;
						} while (this.anInt151 < this.aClass29_1.anInt807);
						this.anInt151 -= this.aClass29_1.anInt808;
					} while (this.anInt151 >= 0 && this.anInt151 < this.aClass29_1.anInt807);
					this.aClass29_1 = null;
				}
				this.anInt152 = client.anInt209 - local9;
			}
			local9 = -1;
			if (this.aClass29_1 != null) {
				local9 = this.aClass29_1.anIntArray237[this.anInt151];
			}
			@Pc(92) Class11 local92 = Class11.method292(this.anInt144);
			return local92.method298(this.anInt145, this.anInt146, this.anInt147, this.anInt148, this.anInt149, this.anInt150, local9);
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("27724, " + -21173 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}
}
