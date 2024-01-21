import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FSCCBLKX")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!FSCCBLKX", name = "z", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!FSCCBLKX", name = "w", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!FSCCBLKX", name = "x", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!FSCCBLKX", name = "y", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!FSCCBLKX", name = "p", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!FSCCBLKX", name = "q", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!FSCCBLKX", name = "r", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!FSCCBLKX", name = "s", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!FSCCBLKX", name = "o", descriptor = "Lclient!XKEHWKFH;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!FSCCBLKX", name = "m", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!FSCCBLKX", name = "v", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!FSCCBLKX", name = "t", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!FSCCBLKX", name = "u", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!FSCCBLKX", name = "n", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!FSCCBLKX", name = "<init>", descriptor = "(IIZIIIIBII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt290 = arg4;
			this.anInt291 = arg5;
			this.anInt292 = arg0;
			this.anInt283 = arg6;
			this.anInt284 = arg1;
			this.anInt285 = arg8;
			this.anInt286 = arg9;
			if (arg3 != -1) {
				this.aClass46_1 = Class46.aClass46Array1[arg3];
				this.anInt282 = 0;
				this.anInt289 = client.anInt931;
				if (arg2 && this.aClass46_1.anInt776 != -1) {
					this.anInt282 = (int) (Math.random() * (double) this.aClass46_1.anInt775);
					this.anInt289 -= (int) (Math.random() * (double) this.aClass46_1.method542(this.anInt282, (byte) 2));
				}
			}
			@Pc(78) Class40 local78 = Class40.method529(this.anInt290);
			this.anInt287 = local78.anInt719;
			this.anInt288 = local78.anInt729;
			this.anIntArray43 = local78.anIntArray164;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("89533, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FSCCBLKX", name = "a", descriptor = "(B)Lclient!USIJLMTP;")
	private Class40 method204() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt287 != -1) {
				@Pc(17) Class24 local17 = Class24.aClass24Array1[this.anInt287];
				@Pc(20) int local20 = local17.anInt474;
				@Pc(23) int local23 = local17.anInt475;
				@Pc(26) int local26 = local17.anInt476;
				@Pc(32) int local32 = client.anIntArray232[local26 - local23];
				local1 = aClient1.anIntArray267[local20] >> local23 & local32;
			} else if (this.anInt288 != -1) {
				local1 = aClient1.anIntArray267[this.anInt288];
			}
			return local1 < 0 || local1 >= this.anIntArray43.length || this.anIntArray43[local1] == -1 ? null : Class40.method529(this.anIntArray43[local1]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("44619, " + 9 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FSCCBLKX", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass46_1 != null) {
				@Pc(11) int local11 = client.anInt931 - this.anInt289;
				if (local11 > 100 && this.aClass46_1.anInt776 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass46_1.method542(this.anInt282, (byte) 2)) {
								break label43;
							}
							local11 -= this.aClass46_1.method542(this.anInt282, (byte) 2);
							this.anInt282++;
						} while (this.anInt282 < this.aClass46_1.anInt775);
						this.anInt282 -= this.aClass46_1.anInt776;
					} while (this.anInt282 >= 0 && this.anInt282 < this.aClass46_1.anInt775);
					this.aClass46_1 = null;
				}
				this.anInt289 = client.anInt931 - local11;
				if (this.aClass46_1 != null) {
					local3 = this.aClass46_1.anIntArray196[this.anInt282];
				}
			}
			@Pc(102) Class40 local102;
			if (this.anIntArray43 == null) {
				local102 = Class40.method529(this.anInt290);
			} else {
				local102 = this.method204();
			}
			return local102 == null ? null : local102.method522(this.anInt291, this.anInt292, this.anInt283, this.anInt284, this.anInt285, this.anInt286, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("39089, " + 8 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
