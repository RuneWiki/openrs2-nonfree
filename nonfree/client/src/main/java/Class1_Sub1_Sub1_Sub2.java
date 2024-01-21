import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt218 = 705;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!mc;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIIZII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt219 = arg4;
			this.anInt220 = arg8;
			this.anInt221 = arg1;
			this.anInt222 = arg0;
			this.anInt223 = arg3;
			this.anInt224 = arg5;
			this.anInt225 = arg9;
			this.aClass25_1 = Class25.aClass25Array1[arg6];
			this.anInt226 = 0;
			this.anInt227 = client.anInt320;
			if (arg7 && this.aClass25_1.anInt779 != -1) {
				this.anInt226 = (int) (Math.random() * (double) this.aClass25_1.anInt778);
				this.anInt227 -= (int) (Math.random() * (double) this.aClass25_1.method484(this.anInt226));
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("1427, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9;
			if (this.aClass25_1 != null) {
				local9 = client.anInt320 - this.anInt227;
				if (local9 > 100 && this.aClass25_1.anInt779 > 0) {
					local9 = 100;
				}
				label40: {
					do {
						do {
							if (local9 <= this.aClass25_1.method484(this.anInt226)) {
								break label40;
							}
							local9 -= this.aClass25_1.method484(this.anInt226);
							this.anInt226++;
						} while (this.anInt226 < this.aClass25_1.anInt778);
						this.anInt226 -= this.aClass25_1.anInt779;
					} while (this.anInt226 >= 0 && this.anInt226 < this.aClass25_1.anInt778);
					this.aClass25_1 = null;
				}
				this.anInt227 = client.anInt320 - local9;
			}
			local9 = -1;
			if (this.aClass25_1 != null) {
				local9 = this.aClass25_1.anIntArray215[this.anInt226];
			}
			@Pc(92) Class9 local92 = Class9.method249(this.anInt219);
			@Pc(108) Class1_Sub1_Sub1_Sub5 local108 = local92.method255(this.anInt220, this.anInt221, this.anInt222, this.anInt223, this.anInt224, this.anInt225, local9);
			if (arg0 != 0) {
				this.anInt218 = -78;
			}
			return local108;
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("83936, " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}
}
