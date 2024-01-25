import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class271 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	private int anInt7215 = 65000;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!ie;")
	private Class115 aClass115_4 = null;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!ie;")
	private Class115 aClass115_5 = null;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private final int anInt7216;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(ILclient!ie;Lclient!ie;I)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) int arg3) {
		this.anInt7216 = arg0;
		this.aClass115_4 = arg1;
		this.aClass115_5 = arg2;
		this.anInt7215 = arg3;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[BII)Z")
	public boolean method5845(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class115 local6 = this.aClass115_4;
		synchronized (this.aClass115_4) {
			if (arg2 < 0 || arg2 > this.anInt7215) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5851(arg0, arg1, arg2, true);
			if (!local35) {
				local35 = this.method5851(arg0, arg1, arg2, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)[B")
	public byte[] method5847(@OriginalArg(0) int arg0) {
		@Pc(8) Class115 local8 = this.aClass115_4;
		synchronized (this.aClass115_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass115_5.method2295()) {
					return null;
				}
				this.aClass115_5.method2294((long) (arg0 * 6));
				this.aClass115_5.method2288(0, Static50.aByteArray11, 6);
				@Pc(75) int local75 = ((Static50.aByteArray11[1] & 0xFF) << 8) + ((Static50.aByteArray11[0] & 0xFF) << 16) + (Static50.aByteArray11[2] & 0xFF);
				@Pc(97) int local97 = ((Static50.aByteArray11[4] & 0xFF) << 8) + (Static50.aByteArray11[3] << 16 & 0xFF0000) + (Static50.aByteArray11[5] & 0xFF);
				if (local75 < 0 || this.anInt7215 < local75) {
					return null;
				} else if (local97 > 0 && this.aClass115_4.method2295() / 520L >= (long) local97) {
					@Pc(138) byte[] local138 = new byte[local75];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					while (local75 > local140) {
						if (local97 == 0) {
							return null;
						}
						this.aClass115_4.method2294((long) (local97 * 520));
						@Pc(167) int local167 = local75 - local140;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass115_4.method2288(0, Static50.aByteArray11, local167 + 8);
						@Pc(196) int local196 = ((Static50.aByteArray11[0] & 0xFF) << 8) + (Static50.aByteArray11[1] & 0xFF);
						@Pc(210) int local210 = (Static50.aByteArray11[3] & 0xFF) + ((Static50.aByteArray11[2] & 0xFF) << 8);
						@Pc(232) int local232 = (Static50.aByteArray11[6] & 0xFF) + ((Static50.aByteArray11[5] & 0xFF) << 8) + ((Static50.aByteArray11[4] & 0xFF) << 16);
						@Pc(238) int local238 = Static50.aByteArray11[7] & 0xFF;
						if (arg0 == local196 && local210 == local142 && local238 == this.anInt7216) {
							if (local232 >= 0 && (long) local232 <= this.aClass115_4.method2295() / 520L) {
								for (@Pc(289) int local289 = 0; local289 < local167; local289++) {
									local138[local140++] = Static50.aByteArray11[local289 + 8];
								}
								local142++;
								local97 = local232;
								continue;
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7216;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[BIZ)Z")
	private boolean method5851(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class115 local8 = this.aClass115_4;
		synchronized (this.aClass115_4) {
			try {
				@Pc(68) int local68;
				if (arg3) {
					if (this.aClass115_5.method2295() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass115_5.method2294((long) (arg0 * 6));
					this.aClass115_5.method2288(0, Static50.aByteArray11, 6);
					local68 = ((Static50.aByteArray11[4] & 0xFF) << 8) + ((Static50.aByteArray11[3] << 16 & 0xFF0000) + (Static50.aByteArray11[5] & 0xFF));
					if (local68 <= 0 || (long) local68 > this.aClass115_4.method2295() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass115_4.method2295() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static50.aByteArray11[2] = (byte) arg2;
				Static50.aByteArray11[0] = (byte) (arg2 >> 16);
				Static50.aByteArray11[5] = (byte) local68;
				Static50.aByteArray11[1] = (byte) (arg2 >> 8);
				Static50.aByteArray11[4] = (byte) (local68 >> 8);
				Static50.aByteArray11[3] = (byte) (local68 >> 16);
				this.aClass115_5.method2294((long) (arg0 * 6));
				this.aClass115_5.method2289(6, 0, Static50.aByteArray11);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (arg2 > local169) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg3) {
						this.aClass115_4.method2294((long) (local68 * 520));
						try {
							this.aClass115_4.method2288(0, Static50.aByteArray11, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = (Static50.aByteArray11[1] & 0xFF) + ((Static50.aByteArray11[0] & 0xFF) << 8);
						@Pc(224) int local224 = (Static50.aByteArray11[3] & 0xFF) + ((Static50.aByteArray11[2] & 0xFF) << 8);
						local175 = ((Static50.aByteArray11[4] & 0xFF) << 16) - (-((Static50.aByteArray11[5] & 0xFF) << 8) - (Static50.aByteArray11[6] & 0xFF));
						@Pc(254) int local254 = Static50.aByteArray11[7] & 0xFF;
						if (arg0 != local210 || local171 != local224 || this.anInt7216 != local254) {
							return false;
						}
						if (local175 < 0 || this.aClass115_4.method2295() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg3 = false;
						local175 = (int) ((this.aClass115_4.method2295() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local68 == local175) {
							local175++;
						}
					}
					Static50.aByteArray11[3] = (byte) local171;
					if (arg2 - local169 <= 512) {
						local175 = 0;
					}
					Static50.aByteArray11[0] = (byte) (arg0 >> 8);
					Static50.aByteArray11[1] = (byte) arg0;
					Static50.aByteArray11[2] = (byte) (local171 >> 8);
					Static50.aByteArray11[6] = (byte) local175;
					Static50.aByteArray11[5] = (byte) (local175 >> 8);
					Static50.aByteArray11[7] = (byte) this.anInt7216;
					Static50.aByteArray11[4] = (byte) (local175 >> 16);
					this.aClass115_4.method2294((long) (local68 * 520));
					this.aClass115_4.method2289(8, 0, Static50.aByteArray11);
					local210 = arg2 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass115_4.method2289(local210, local169, arg1);
					local171++;
					local68 = local175;
					local169 += local210;
				}
				return true;
			} catch (@Pc(440) IOException local440) {
				return false;
			}
		}
	}
}
