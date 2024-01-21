import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	private boolean aBoolean36 = true;

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

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIBZIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt208 = arg1;
			this.anInt209 = arg6;
			this.anInt210 = arg7;
			this.anInt211 = arg4;
			this.anInt212 = arg8;
			this.anInt213 = arg0;
			this.anInt214 = arg5;
			this.aClass27_1 = Class27.aClass27Array1[arg9];
			this.anInt215 = 0;
			this.anInt216 = client.anInt367;
			if (arg3 && this.aClass27_1.anInt813 != -1) {
				this.anInt215 = (int) (Math.random() * (double) this.aClass27_1.anInt812);
				this.anInt216 -= (int) (Math.random() * (double) this.aClass27_1.method515(this.anInt215));
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("88629, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			@Pc(20) int local20;
			if (this.aClass27_1 != null) {
				local20 = client.anInt367 - this.anInt216;
				if (local20 > 100 && this.aClass27_1.anInt813 > 0) {
					local20 = 100;
				}
				label36: {
					do {
						do {
							if (local20 <= this.aClass27_1.method515(this.anInt215)) {
								break label36;
							}
							local20 -= this.aClass27_1.method515(this.anInt215);
							this.anInt215++;
						} while (this.anInt215 < this.aClass27_1.anInt812);
						this.anInt215 -= this.aClass27_1.anInt813;
					} while (this.anInt215 >= 0 && this.anInt215 < this.aClass27_1.anInt812);
					this.aClass27_1 = null;
				}
				this.anInt216 = client.anInt367 - local20;
			}
			local20 = -1;
			if (this.aClass27_1 != null) {
				local20 = this.aClass27_1.anIntArray226[this.anInt215];
			}
			@Pc(103) Class9 local103 = Class9.method258(this.anInt208);
			return local103.method264(this.anInt209, this.anInt210, this.anInt211, this.anInt212, this.anInt213, this.anInt214, local20);
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("81474, " + -13634 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}
}
