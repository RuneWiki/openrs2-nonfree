import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class77 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!fc;")
	private Class24 aClass24_4 = null;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!fc;")
	private Class24 aClass24_3 = null;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	private int anInt2561 = 65000;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	private final int anInt2552;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILclient!fc;Lclient!fc;I)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3) {
		this.aClass24_4 = arg1;
		this.anInt2552 = arg0;
		this.anInt2561 = arg3;
		this.aClass24_3 = arg2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[B")
	public byte[] method1762(@OriginalArg(0) int arg0) {
		@Pc(8) Class24 local8 = this.aClass24_4;
		synchronized (this.aClass24_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass24_3.method598()) {
					return null;
				}
				this.aClass24_3.method599((long) (arg0 * 6));
				this.aClass24_3.method593(0, 6, Static43.aByteArray7);
				@Pc(77) int local77 = ((Static43.aByteArray7[1] & 0xFF) << 8) + ((Static43.aByteArray7[0] & 0xFF) << 16) + (Static43.aByteArray7[2] & 0xFF);
				@Pc(100) int local100 = ((Static43.aByteArray7[4] & 0xFF) << 8) + ((Static43.aByteArray7[3] << 16 & 0xFF0000) + (Static43.aByteArray7[5] & 0xFF));
				if (local77 < 0 || this.anInt2561 < local77) {
					return null;
				} else if (local100 > 0 && this.aClass24_4.method598() / 520L >= (long) local100) {
					@Pc(144) byte[] local144 = new byte[local77];
					@Pc(146) int local146 = 0;
					@Pc(148) int local148 = 0;
					while (local77 > local146) {
						if (local100 == 0) {
							return null;
						}
						this.aClass24_4.method599((long) (local100 * 520));
						@Pc(174) int local174 = local77 - local146;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass24_4.method593(0, local174 + 8, Static43.aByteArray7);
						@Pc(203) int local203 = ((Static43.aByteArray7[0] & 0xFF) << 8) + (Static43.aByteArray7[1] & 0xFF);
						@Pc(225) int local225 = (Static43.aByteArray7[6] & 0xFF) + ((Static43.aByteArray7[4] & 0xFF) << 16) + ((Static43.aByteArray7[5] & 0xFF) << 8);
						@Pc(231) int local231 = Static43.aByteArray7[7] & 0xFF;
						@Pc(246) int local246 = ((Static43.aByteArray7[2] & 0xFF) << 8) + (Static43.aByteArray7[3] & 0xFF);
						if (arg0 == local203 && local148 == local246 && this.anInt2552 == local231) {
							if (local225 >= 0 && (long) local225 <= this.aClass24_4.method598() / 520L) {
								local100 = local225;
								for (@Pc(295) int local295 = 0; local295 < local174; local295++) {
									local144[local146++] = Static43.aByteArray7[local295 + 8];
								}
								local148++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local144;
				} else {
					return null;
				}
			} catch (@Pc(325) IOException local325) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI[BZI)Z")
	private boolean method1763(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class24 local8 = this.aClass24_4;
		synchronized (this.aClass24_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass24_3.method598() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass24_3.method599((long) (arg3 * 6));
					this.aClass24_3.method593(0, 6, Static43.aByteArray7);
					local22 = ((Static43.aByteArray7[4] & 0xFF) << 8) + ((Static43.aByteArray7[3] & 0xFF) << 16) + (Static43.aByteArray7[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass24_4.method598() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass24_4.method598() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static43.aByteArray7[4] = (byte) (local22 >> 8);
				Static43.aByteArray7[5] = (byte) local22;
				Static43.aByteArray7[1] = (byte) (arg0 >> 8);
				Static43.aByteArray7[2] = (byte) arg0;
				@Pc(137) int local137 = 0;
				Static43.aByteArray7[0] = (byte) (arg0 >> 16);
				@Pc(146) int local146 = 0;
				Static43.aByteArray7[3] = (byte) (local22 >> 16);
				this.aClass24_3.method599((long) (arg3 * 6));
				this.aClass24_3.method595(6, Static43.aByteArray7, 0);
				while (arg0 > local137) {
					@Pc(172) int local172 = 0;
					@Pc(230) int local230;
					if (arg2) {
						this.aClass24_4.method599((long) (local22 * 520));
						try {
							this.aClass24_4.method593(0, 8, Static43.aByteArray7);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local172 = ((Static43.aByteArray7[4] & 0xFF) << 16) - (-((Static43.aByteArray7[5] & 0xFF) << 8) - (Static43.aByteArray7[6] & 0xFF));
						local230 = (Static43.aByteArray7[1] & 0xFF) + ((Static43.aByteArray7[0] & 0xFF) << 8);
						@Pc(244) int local244 = (Static43.aByteArray7[3] & 0xFF) + ((Static43.aByteArray7[2] & 0xFF) << 8);
						@Pc(250) int local250 = Static43.aByteArray7[7] & 0xFF;
						if (local230 != arg3 || local244 != local146 || local250 != this.anInt2552) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass24_4.method598() / 520L) {
							return false;
						}
					}
					local230 = arg0 - local137;
					if (local172 == 0) {
						local172 = (int) ((this.aClass24_4.method598() + 519L) / 520L);
						arg2 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local22 == local172) {
							local172++;
						}
					}
					Static43.aByteArray7[7] = (byte) this.anInt2552;
					Static43.aByteArray7[0] = (byte) (arg3 >> 8);
					Static43.aByteArray7[1] = (byte) arg3;
					Static43.aByteArray7[2] = (byte) (local146 >> 8);
					if (local230 > 512) {
						local230 = 512;
					}
					Static43.aByteArray7[3] = (byte) local146;
					local146++;
					if (arg0 - local137 <= 512) {
						local172 = 0;
					}
					Static43.aByteArray7[5] = (byte) (local172 >> 8);
					Static43.aByteArray7[4] = (byte) (local172 >> 16);
					Static43.aByteArray7[6] = (byte) local172;
					this.aClass24_4.method599((long) (local22 * 520));
					local22 = local172;
					this.aClass24_4.method595(8, Static43.aByteArray7, 0);
					this.aClass24_4.method595(local230, arg1, local137);
					local137 += local230;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2552;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)Z")
	public boolean method1765(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class24 local6 = this.aClass24_4;
		synchronized (this.aClass24_4) {
			if (arg2 < 0 || this.anInt2561 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method1763(arg2, arg1, true, arg0);
			if (!local30) {
				local30 = this.method1763(arg2, arg1, false, arg0);
			}
			return local30;
		}
	}
}
