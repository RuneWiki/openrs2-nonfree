import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt210 = 650;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IZIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			while (arg5 >= 0) {
				this.aBoolean37 = !this.aBoolean37;
			}
			this.anInt211 = arg8;
			this.anInt212 = arg9;
			this.anInt213 = arg7;
			this.anInt214 = arg0;
			this.anInt215 = arg4;
			this.anInt216 = arg6;
			this.anInt217 = arg2;
			this.aClass27_1 = Class27.aClass27Array1[arg3];
			this.anInt218 = 0;
			this.anInt219 = client.anInt446;
			if (arg1 && this.aClass27_1.anInt801 != -1) {
				this.anInt218 = (int) (Math.random() * (double) this.aClass27_1.anInt800);
				this.anInt219 -= (int) (Math.random() * (double) this.aClass27_1.method517(this.anInt218));
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("2595, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(13) int local13;
			if (this.aClass27_1 != null) {
				local13 = client.anInt446 - this.anInt219;
				if (local13 > 100 && this.aClass27_1.anInt801 > 0) {
					local13 = 100;
				}
				label36: {
					do {
						do {
							if (local13 <= this.aClass27_1.method517(this.anInt218)) {
								break label36;
							}
							local13 -= this.aClass27_1.method517(this.anInt218);
							this.anInt218++;
						} while (this.anInt218 < this.aClass27_1.anInt800);
						this.anInt218 -= this.aClass27_1.anInt801;
					} while (this.anInt218 >= 0 && this.anInt218 < this.aClass27_1.anInt800);
					this.aClass27_1 = null;
				}
				this.anInt219 = client.anInt446 - local13;
			}
			local13 = -1;
			if (this.aClass27_1 != null) {
				local13 = this.aClass27_1.anIntArray227[this.anInt218];
			}
			@Pc(96) Class9 local96 = Class9.method258(this.anInt211);
			return local96.method264(this.anInt212, this.anInt213, this.anInt214, this.anInt215, this.anInt216, this.anInt217, local13);
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("79221, " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}
}
