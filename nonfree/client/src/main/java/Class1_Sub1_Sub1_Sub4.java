import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EFJXCNIG")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!EFJXCNIG", name = "u", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!EFJXCNIG", name = "q", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!EFJXCNIG", name = "B", descriptor = "B")
	private byte aByte1 = -23;

	@OriginalMember(owner = "client!EFJXCNIG", name = "m", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!EFJXCNIG", name = "n", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!EFJXCNIG", name = "o", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!EFJXCNIG", name = "w", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!EFJXCNIG", name = "x", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!EFJXCNIG", name = "y", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!EFJXCNIG", name = "z", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!EFJXCNIG", name = "v", descriptor = "Lclient!DVIZXFSW;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!EFJXCNIG", name = "A", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!EFJXCNIG", name = "p", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!EFJXCNIG", name = "s", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!EFJXCNIG", name = "t", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!EFJXCNIG", name = "r", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!EFJXCNIG", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt252 = arg7;
			this.anInt253 = arg9;
			this.anInt254 = arg6;
			this.anInt258 = arg5;
			this.anInt259 = arg4;
			this.anInt260 = arg2;
			this.anInt261 = arg1;
			if (arg3 != -1) {
				this.aClass7_1 = Class7.aClass7Array1[arg3];
				this.anInt262 = 0;
				this.anInt255 = client.anInt1079 - 1;
				if (arg8 && this.aClass7_1.anInt238 != -1) {
					this.anInt262 = (int) (Math.random() * (double) this.aClass7_1.anInt237);
					this.anInt255 -= (int) (Math.random() * (double) this.aClass7_1.method103((byte) 6, this.anInt262));
				}
			}
			@Pc(89) Class44 local89 = Class44.method519(this.anInt252);
			this.anInt256 = local89.anInt778;
			this.anInt257 = local89.anInt776;
			this.anIntArray31 = local89.anIntArray193;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("29953, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFJXCNIG", name = "a", descriptor = "(B)Lclient!WEJSKHXC;")
	private Class44 method109() {
		try {
			if (this.aByte1 != -23) {
				throw new NullPointerException();
			}
			@Pc(9) int local9 = -1;
			if (this.anInt256 != -1) {
				@Pc(18) Class5 local18 = Class5.aClass5Array1[this.anInt256];
				@Pc(21) int local21 = local18.anInt218;
				@Pc(24) int local24 = local18.anInt219;
				@Pc(27) int local27 = local18.anInt220;
				@Pc(33) int local33 = client.anIntArray212[local27 - local24];
				local9 = aClient1.anIntArray241[local21] >> local24 & local33;
			} else if (this.anInt257 != -1) {
				local9 = aClient1.anIntArray241[this.anInt257];
			}
			return local9 < 0 || local9 >= this.anIntArray31.length || this.anIntArray31[local9] == -1 ? null : Class44.method519(this.anIntArray31[local9]);
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("97295, " + -23 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EFJXCNIG", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass7_1 != null) {
				@Pc(11) int local11 = client.anInt1079 - this.anInt255;
				if (local11 > 100 && this.aClass7_1.anInt238 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass7_1.method103((byte) 6, this.anInt262)) {
								break label43;
							}
							local11 -= this.aClass7_1.method103((byte) 6, this.anInt262);
							this.anInt262++;
						} while (this.anInt262 < this.aClass7_1.anInt237);
						this.anInt262 -= this.aClass7_1.anInt238;
					} while (this.anInt262 >= 0 && this.anInt262 < this.aClass7_1.anInt237);
					this.aClass7_1 = null;
				}
				this.anInt255 = client.anInt1079 - local11;
				if (this.aClass7_1 != null) {
					local3 = this.aClass7_1.anIntArray27[this.anInt262];
				}
			}
			@Pc(95) Class44 local95;
			if (this.anIntArray31 == null) {
				local95 = Class44.method519(this.anInt252);
			} else {
				local95 = this.method109();
			}
			return local95 == null ? null : local95.method520(this.anInt253, this.anInt254, this.anInt258, this.anInt259, this.anInt260, this.anInt261, local3);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("78352, " + 822 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
