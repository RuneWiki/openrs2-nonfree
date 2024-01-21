import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class18 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!rc;")
	private Class82 aClass82_1 = null;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!rc;")
	private Class82 aClass82_2 = null;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	private int anInt552 = 65000;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	private final int anInt543;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(ILclient!rc;Lclient!rc;I)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3) {
		this.aClass82_1 = arg1;
		this.aClass82_2 = arg2;
		this.anInt543 = arg0;
		this.anInt552 = arg3;
	}

	@OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt543;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[BZII)Z")
	private boolean method470(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class82 local8 = this.aClass82_1;
		synchronized (this.aClass82_1) {
			try {
				@Pc(75) int local75;
				if (arg1) {
					if (this.aClass82_2.method2442() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass82_2.method2441((long) (arg2 * 6));
					this.aClass82_2.method2433(Static153.aByteArray31, 6, 0);
					local75 = (Static153.aByteArray31[5] & 0xFF) + ((Static153.aByteArray31[3] & 0xFF) << 16) + ((Static153.aByteArray31[4] & 0xFF) << 8);
					if (local75 <= 0 || this.aClass82_1.method2442() / 520L < (long) local75) {
						return false;
					}
				} else {
					local75 = (int) ((this.aClass82_1.method2442() + 519L) / 520L);
					if (local75 == 0) {
						local75 = 1;
					}
				}
				Static153.aByteArray31[1] = (byte) (arg3 >> 8);
				Static153.aByteArray31[3] = (byte) (local75 >> 16);
				Static153.aByteArray31[2] = (byte) arg3;
				@Pc(140) int local140 = 0;
				Static153.aByteArray31[0] = (byte) (arg3 >> 16);
				Static153.aByteArray31[4] = (byte) (local75 >> 8);
				Static153.aByteArray31[5] = (byte) local75;
				this.aClass82_2.method2441((long) (arg2 * 6));
				@Pc(169) int local169 = 0;
				this.aClass82_2.method2437(Static153.aByteArray31, 6, 0);
				while (arg3 > local169) {
					@Pc(180) int local180 = 0;
					@Pc(239) int local239;
					if (arg1) {
						this.aClass82_1.method2441((long) (local75 * 520));
						try {
							this.aClass82_1.method2433(Static153.aByteArray31, 8, 0);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local180 = ((Static153.aByteArray31[5] & 0xFF) << 8) + ((Static153.aByteArray31[4] << 16 & 0xFF0000) + (Static153.aByteArray31[6] & 0xFF));
						local239 = ((Static153.aByteArray31[0] & 0xFF) << 8) + (Static153.aByteArray31[1] & 0xFF);
						@Pc(253) int local253 = (Static153.aByteArray31[3] & 0xFF) + ((Static153.aByteArray31[2] & 0xFF) << 8);
						@Pc(259) int local259 = Static153.aByteArray31[7] & 0xFF;
						if (arg2 != local239 || local253 != local140 || local259 != this.anInt543) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass82_1.method2442() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						arg1 = false;
						local180 = (int) ((this.aClass82_1.method2442() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local75) {
							local180++;
						}
					}
					Static153.aByteArray31[0] = (byte) (arg2 >> 8);
					Static153.aByteArray31[1] = (byte) arg2;
					Static153.aByteArray31[2] = (byte) (local140 >> 8);
					Static153.aByteArray31[7] = (byte) this.anInt543;
					local239 = arg3 - local169;
					Static153.aByteArray31[3] = (byte) local140;
					if (arg3 - local169 <= 512) {
						local180 = 0;
					}
					Static153.aByteArray31[6] = (byte) local180;
					if (local239 > 512) {
						local239 = 512;
					}
					local140++;
					Static153.aByteArray31[5] = (byte) (local180 >> 8);
					Static153.aByteArray31[4] = (byte) (local180 >> 16);
					this.aClass82_1.method2441((long) (local75 * 520));
					this.aClass82_1.method2437(Static153.aByteArray31, 8, 0);
					this.aClass82_1.method2437(arg0, local239, local169);
					local75 = local180;
					local169 += local239;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[B")
	public byte[] method471(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_1;
		synchronized (this.aClass82_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass82_2.method2442()) {
					return null;
				}
				this.aClass82_2.method2441((long) (arg0 * 6));
				this.aClass82_2.method2433(Static153.aByteArray31, 6, 0);
				@Pc(63) int local63 = (Static153.aByteArray31[2] & 0xFF) + ((Static153.aByteArray31[1] & 0xFF) << 8) + ((Static153.aByteArray31[0] & 0xFF) << 16);
				@Pc(86) int local86 = (Static153.aByteArray31[5] & 0xFF) + ((Static153.aByteArray31[3] & 0xFF) << 16) + ((Static153.aByteArray31[4] & 0xFF) << 8);
				if (local63 < 0 || this.anInt552 < local63) {
					return null;
				} else if (local86 > 0 && (long) local86 <= this.aClass82_1.method2442() / 520L) {
					@Pc(131) byte[] local131 = new byte[local63];
					@Pc(133) int local133 = 0;
					@Pc(135) int local135 = 0;
					while (local133 < local63) {
						if (local86 == 0) {
							return null;
						}
						this.aClass82_1.method2441((long) (local86 * 520));
						@Pc(157) int local157 = local63 - local133;
						if (local157 > 512) {
							local157 = 512;
						}
						this.aClass82_1.method2433(Static153.aByteArray31, local157 + 8, 0);
						@Pc(186) int local186 = ((Static153.aByteArray31[2] & 0xFF) << 8) + (Static153.aByteArray31[3] & 0xFF);
						@Pc(208) int local208 = (Static153.aByteArray31[6] & 0xFF) + ((Static153.aByteArray31[4] & 0xFF) << 16) + ((Static153.aByteArray31[5] & 0xFF) << 8);
						@Pc(223) int local223 = ((Static153.aByteArray31[0] & 0xFF) << 8) + (Static153.aByteArray31[1] & 0xFF);
						@Pc(229) int local229 = Static153.aByteArray31[7] & 0xFF;
						if (arg0 == local223 && local135 == local186 && this.anInt543 == local229) {
							if (local208 >= 0 && (long) local208 <= this.aClass82_1.method2442() / 520L) {
								local135++;
								for (@Pc(274) int local274 = 0; local274 < local157; local274++) {
									local131[local133++] = Static153.aByteArray31[local274 + 8];
								}
								local86 = local208;
								continue;
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(300) IOException local300) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BIZ)Z")
	public boolean method473(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class82 local6 = this.aClass82_1;
		synchronized (this.aClass82_1) {
			if (arg2 < 0 || arg2 > this.anInt552) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method470(arg1, true, arg0, arg2);
			if (!local29) {
				local29 = this.method470(arg1, false, arg0, arg2);
			}
			return local29;
		}
	}
}
