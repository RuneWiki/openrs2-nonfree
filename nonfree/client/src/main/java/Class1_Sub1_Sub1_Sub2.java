import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!mc;")
	private Class25 aClass25_1;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIIZIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt212 = arg1;
			this.anInt213 = arg0;
			this.anInt214 = arg4;
			this.anInt215 = arg9;
			this.anInt216 = arg7;
			this.anInt217 = arg2;
			this.anInt218 = arg8;
			this.aClass25_1 = Class25.aClass25Array1[arg3];
			this.anInt219 = 0;
			this.anInt220 = client.anInt363;
			if (arg6 && this.aClass25_1.anInt786 != -1) {
				this.anInt219 = (int) (Math.random() * (double) this.aClass25_1.anInt785);
				this.anInt220 -= (int) (Math.random() * (double) this.aClass25_1.method485(this.anInt219));
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("51207, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			@Pc(9) int local9;
			if (this.aClass25_1 != null) {
				local9 = client.anInt363 - this.anInt220;
				if (local9 > 100 && this.aClass25_1.anInt786 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass25_1.method485(this.anInt219)) {
								break label36;
							}
							local9 -= this.aClass25_1.method485(this.anInt219);
							this.anInt219++;
						} while (this.anInt219 < this.aClass25_1.anInt785);
						this.anInt219 -= this.aClass25_1.anInt786;
					} while (this.anInt219 >= 0 && this.anInt219 < this.aClass25_1.anInt785);
					this.aClass25_1 = null;
				}
				this.anInt220 = client.anInt363 - local9;
			}
			local9 = -1;
			if (this.aClass25_1 != null) {
				local9 = this.aClass25_1.anIntArray215[this.anInt219];
			}
			@Pc(92) Class9 local92 = Class9.method250(this.anInt212);
			return local92.method256(this.anInt213, this.anInt214, this.anInt215, this.anInt216, this.anInt217, this.anInt218, local9);
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("22977, " + false + ", " + local120.toString());
			throw new RuntimeException();
		}
	}
}
