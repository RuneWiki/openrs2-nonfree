import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class360 {

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!wr;")
	private Class363 aClass363_6 = null;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	private int anInt9588 = 65000;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!wr;")
	private Class363 aClass363_7 = null;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	private final int anInt9583;

	static {
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray8[local10] = (char) (local10 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray8[local24] = (char) (local24 + 97 - 26);
		}
		for (@Pc(40) int local40 = 52; local40 < 62; local40++) {
			aCharArray8[local40] = (char) (local40 - 4);
		}
		aCharArray8[62] = '*';
		aCharArray8[63] = '-';
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(ILclient!wr;Lclient!wr;I)V")
	public Class360(@OriginalArg(0) int arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class363 arg2, @OriginalArg(3) int arg3) {
		this.anInt9588 = arg3;
		this.anInt9583 = arg0;
		this.aClass363_6 = arg2;
		this.aClass363_7 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[BI)Z")
	public boolean method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class363 local6 = this.aClass363_7;
		synchronized (this.aClass363_7) {
			if (arg1 < 0 || this.anInt9588 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method7821(arg0, arg2, true, arg1);
			if (!local36) {
				local36 = this.method7821(arg0, arg2, false, arg1);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)[B")
	public byte[] method7820(@OriginalArg(1) int arg0) {
		@Pc(8) Class363 local8 = this.aClass363_7;
		synchronized (this.aClass363_7) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass363_6.method7840()) {
					return null;
				}
				this.aClass363_6.method7843((long) (arg0 * 6));
				this.aClass363_6.method7842(0, Static33.aByteArray33, 6);
				@Pc(69) int local69 = (Static33.aByteArray33[2] & 0xFF) + ((Static33.aByteArray33[1] & 0xFF) << 8) + ((Static33.aByteArray33[0] & 0xFF) << 16);
				@Pc(92) int local92 = ((Static33.aByteArray33[3] & 0xFF) << 16) + ((Static33.aByteArray33[4] & 0xFF) << 8) + (Static33.aByteArray33[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt9588) {
					return null;
				} else if (local92 > 0 && this.aClass363_7.method7840() / 520L >= (long) local92) {
					@Pc(145) byte[] local145 = new byte[local69];
					@Pc(147) int local147 = 0;
					@Pc(149) int local149 = 0;
					label55: while (local69 > local147) {
						if (local92 == 0) {
							return null;
						}
						this.aClass363_7.method7843((long) (local92 * 520));
						@Pc(172) int local172 = local69 - local147;
						if (local172 > 512) {
							local172 = 512;
						}
						this.aClass363_7.method7842(0, Static33.aByteArray33, local172 + 8);
						@Pc(200) int local200 = ((Static33.aByteArray33[0] & 0xFF) << 8) + (Static33.aByteArray33[1] & 0xFF);
						@Pc(214) int local214 = (Static33.aByteArray33[3] & 0xFF) + ((Static33.aByteArray33[2] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static33.aByteArray33[5] & 0xFF) << 8) + ((Static33.aByteArray33[4] & 0xFF) << 16) + (Static33.aByteArray33[6] & 0xFF);
						@Pc(243) int local243 = Static33.aByteArray33[7] & 0xFF;
						if (arg0 == local200 && local214 == local149 && local243 == this.anInt9583) {
							if (local237 >= 0 && this.aClass363_7.method7840() / 520L >= (long) local237) {
								local149++;
								local92 = local237;
								@Pc(293) int local293 = 0;
								while (true) {
									if (local293 >= local172) {
										continue label55;
									}
									local145[local147++] = Static33.aByteArray33[local293 + 8];
									local293++;
								}
							}
							return null;
						}
						return null;
					}
					return local145;
				} else {
					return null;
				}
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BZBI)Z")
	private boolean method7821(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class363 local8 = this.aClass363_7;
		synchronized (this.aClass363_7) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass363_6.method7840() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass363_6.method7843((long) (arg0 * 6));
					this.aClass363_6.method7842(0, Static33.aByteArray33, 6);
					local22 = ((Static33.aByteArray33[4] & 0xFF) << 8) + ((Static33.aByteArray33[3] & 0xFF) << 16) + (Static33.aByteArray33[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass363_7.method7840() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass363_7.method7840() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static33.aByteArray33[5] = (byte) local22;
				Static33.aByteArray33[4] = (byte) (local22 >> 8);
				Static33.aByteArray33[0] = (byte) (arg3 >> 16);
				Static33.aByteArray33[1] = (byte) (arg3 >> 8);
				Static33.aByteArray33[3] = (byte) (local22 >> 16);
				Static33.aByteArray33[2] = (byte) arg3;
				this.aClass363_6.method7843((long) (arg0 * 6));
				this.aClass363_6.method7847(Static33.aByteArray33, 0, 6);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (local166 < arg3) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg2) {
						this.aClass363_7.method7843((long) (local22 * 520));
						try {
							this.aClass363_7.method7842(0, Static33.aByteArray33, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = ((Static33.aByteArray33[0] & 0xFF) << 8) + (Static33.aByteArray33[1] & 0xFF);
						@Pc(221) int local221 = (Static33.aByteArray33[3] & 0xFF) + ((Static33.aByteArray33[2] & 0xFF) << 8);
						local172 = (Static33.aByteArray33[6] & 0xFF) + ((Static33.aByteArray33[4] & 0xFF) << 16) + ((Static33.aByteArray33[5] & 0xFF) << 8);
						@Pc(249) int local249 = Static33.aByteArray33[7] & 0xFF;
						if (local207 != arg0 || local168 != local221 || this.anInt9583 != local249) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass363_7.method7840() / 520L) {
							return false;
						}
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass363_7.method7840() + 519L) / 520L);
						arg2 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local172 == local22) {
							local172++;
						}
					}
					Static33.aByteArray33[1] = (byte) arg0;
					Static33.aByteArray33[0] = (byte) (arg0 >> 8);
					Static33.aByteArray33[2] = (byte) (local168 >> 8);
					Static33.aByteArray33[3] = (byte) local168;
					if (arg3 - local166 <= 512) {
						local172 = 0;
					}
					Static33.aByteArray33[6] = (byte) local172;
					Static33.aByteArray33[5] = (byte) (local172 >> 8);
					Static33.aByteArray33[7] = (byte) this.anInt9583;
					Static33.aByteArray33[4] = (byte) (local172 >> 16);
					this.aClass363_7.method7843((long) (local22 * 520));
					this.aClass363_7.method7847(Static33.aByteArray33, 0, 8);
					local207 = arg3 - local166;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass363_7.method7847(arg1, local166, local207);
					local168++;
					local166 += local207;
					local22 = local172;
				}
				return true;
			} catch (@Pc(422) IOException local422) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt9583;
	}
}
