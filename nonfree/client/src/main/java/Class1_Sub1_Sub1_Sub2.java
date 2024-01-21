import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt208 = arg3;
			this.anInt209 = arg4;
			this.anInt210 = arg5;
			this.anInt211 = arg2;
			this.anInt212 = arg9;
			this.anInt213 = arg1;
			this.anInt214 = arg6;
			this.aClass27_1 = Class27.aClass27Array1[arg7];
			this.anInt215 = 0;
			this.anInt216 = client.anInt440;
			if (arg8 && this.aClass27_1.anInt809 != -1) {
				this.anInt215 = (int) (Math.random() * (double) this.aClass27_1.anInt808);
				this.anInt216 -= (int) (Math.random() * (double) this.aClass27_1.method517(this.anInt215, (byte) 2));
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("57240, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			@Pc(9) int local9;
			if (this.aClass27_1 != null) {
				local9 = client.anInt440 - this.anInt216;
				if (local9 > 100 && this.aClass27_1.anInt809 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass27_1.method517(this.anInt215, (byte) 2)) {
								break label36;
							}
							local9 -= this.aClass27_1.method517(this.anInt215, (byte) 2);
							this.anInt215++;
						} while (this.anInt215 < this.aClass27_1.anInt808);
						this.anInt215 -= this.aClass27_1.anInt809;
					} while (this.anInt215 >= 0 && this.anInt215 < this.aClass27_1.anInt808);
					this.aClass27_1 = null;
				}
				this.anInt216 = client.anInt440 - local9;
			}
			local9 = -1;
			if (this.aClass27_1 != null) {
				local9 = this.aClass27_1.anIntArray227[this.anInt215];
			}
			@Pc(92) Class9 local92 = Class9.method258(this.anInt208);
			return local92.method264(this.anInt209, this.anInt210, this.anInt211, this.anInt212, this.anInt213, this.anInt214, local9);
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("92005, " + -28205 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
