import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIBIIIZII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			if (arg3 != -61) {
				throw new NullPointerException();
			}
			this.anInt212 = arg2;
			this.anInt213 = arg6;
			this.anInt214 = arg1;
			this.anInt215 = arg5;
			this.anInt216 = arg4;
			this.anInt217 = arg0;
			this.anInt218 = arg8;
			this.aClass27_1 = Class27.aClass27Array1[arg9];
			this.anInt219 = 0;
			this.anInt220 = client.anInt268;
			if (arg7 && this.aClass27_1.anInt831 != -1) {
				this.anInt219 = (int) (Math.random() * (double) this.aClass27_1.anInt830);
				this.anInt220 -= (int) (Math.random() * (double) this.aClass27_1.method517(this.anInt219));
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("17550, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			@Pc(16) int local16;
			if (this.aClass27_1 != null) {
				local16 = client.anInt268 - this.anInt220;
				if (local16 > 100 && this.aClass27_1.anInt831 > 0) {
					local16 = 100;
				}
				label36: {
					do {
						do {
							if (local16 <= this.aClass27_1.method517(this.anInt219)) {
								break label36;
							}
							local16 -= this.aClass27_1.method517(this.anInt219);
							this.anInt219++;
						} while (this.anInt219 < this.aClass27_1.anInt830);
						this.anInt219 -= this.aClass27_1.anInt831;
					} while (this.anInt219 >= 0 && this.anInt219 < this.aClass27_1.anInt830);
					this.aClass27_1 = null;
				}
				this.anInt220 = client.anInt268 - local16;
			}
			local16 = -1;
			if (this.aClass27_1 != null) {
				local16 = this.aClass27_1.anIntArray227[this.anInt219];
			}
			@Pc(99) Class9 local99 = Class9.method258(this.anInt212);
			return local99.method264(this.anInt213, this.anInt214, this.anInt215, this.anInt216, this.anInt217, this.anInt218, local16);
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("90804, " + 8 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
