import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class60 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!wl;")
	private Class193 aClass193_2 = null;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Lclient!wl;")
	private Class193 aClass193_3 = null;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	private int anInt1949 = 65000;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILclient!wl;Lclient!wl;I)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int arg3) {
		this.anInt1950 = arg0;
		this.anInt1949 = arg3;
		this.aClass193_2 = arg1;
		this.aClass193_3 = arg2;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZZI[B)Z")
	private boolean method1475(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(9) Class193 local9 = this.aClass193_2;
		synchronized (this.aClass193_2) {
			try {
				@Pc(70) int local70;
				@Pc(30) boolean local30;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass193_3.method4834()) {
						local30 = false;
						return local30;
					}
					this.aClass193_3.method4835((long) (arg0 * 6));
					this.aClass193_3.method4838(Static123.aByteArray17, 0, 6);
					local70 = (Static123.aByteArray17[5] & 0xFF) + ((Static123.aByteArray17[4] & 0xFF) << 8) + ((Static123.aByteArray17[3] & 0xFF) << 16);
					if (local70 <= 0 || (long) local70 > this.aClass193_2.method4834() / 520L) {
						local30 = false;
						return local30;
					}
				} else {
					local70 = (int) ((this.aClass193_2.method4834() + 519L) / 520L);
					if (local70 == 0) {
						local70 = 1;
					}
				}
				Static123.aByteArray17[5] = (byte) local70;
				Static123.aByteArray17[0] = (byte) (arg2 >> 16);
				Static123.aByteArray17[1] = (byte) (arg2 >> 8);
				@Pc(126) int local126 = 0;
				Static123.aByteArray17[4] = (byte) (local70 >> 8);
				@Pc(135) int local135 = 0;
				Static123.aByteArray17[2] = (byte) arg2;
				Static123.aByteArray17[3] = (byte) (local70 >> 16);
				this.aClass193_3.method4835((long) (arg0 * 6));
				this.aClass193_3.method4832(0, Static123.aByteArray17, 6);
				while (true) {
					if (local135 < arg2) {
						label137: {
							@Pc(167) int local167 = 0;
							@Pc(248) int local248;
							if (arg1) {
								this.aClass193_2.method4835((long) (local70 * 520));
								try {
									this.aClass193_2.method4838(Static123.aByteArray17, 0, 8);
								} catch (@Pc(190) EOFException local190) {
									break label137;
								}
								local167 = (Static123.aByteArray17[6] & 0xFF) + ((Static123.aByteArray17[4] & 0xFF) << 16) + ((Static123.aByteArray17[5] & 0xFF) << 8);
								@Pc(228) int local228 = ((Static123.aByteArray17[2] & 0xFF) << 8) + (Static123.aByteArray17[3] & 0xFF);
								@Pc(234) int local234 = Static123.aByteArray17[7] & 0xFF;
								local248 = (Static123.aByteArray17[1] & 0xFF) + ((Static123.aByteArray17[0] & 0xFF) << 8);
								if (arg0 != local248 || local126 != local228 || local234 != this.anInt1950) {
									local30 = false;
									return local30;
								}
								if (local167 < 0 || (long) local167 > this.aClass193_2.method4834() / 520L) {
									local30 = false;
									return local30;
								}
							}
							if (local167 == 0) {
								arg1 = false;
								local167 = (int) ((this.aClass193_2.method4834() + 519L) / 520L);
								if (local167 == 0) {
									local167++;
								}
								if (local167 == local70) {
									local167++;
								}
							}
							Static123.aByteArray17[1] = (byte) arg0;
							if (arg2 - local135 <= 512) {
								local167 = 0;
							}
							Static123.aByteArray17[5] = (byte) (local167 >> 8);
							Static123.aByteArray17[4] = (byte) (local167 >> 16);
							Static123.aByteArray17[6] = (byte) local167;
							Static123.aByteArray17[0] = (byte) (arg0 >> 8);
							Static123.aByteArray17[2] = (byte) (local126 >> 8);
							Static123.aByteArray17[7] = (byte) this.anInt1950;
							Static123.aByteArray17[3] = (byte) local126;
							local126++;
							local248 = arg2 - local135;
							this.aClass193_2.method4835((long) (local70 * 520));
							if (local248 > 512) {
								local248 = 512;
							}
							local70 = local167;
							this.aClass193_2.method4832(0, Static123.aByteArray17, 8);
							this.aClass193_2.method4832(local135, arg3, local248);
							local135 += local248;
							continue;
						}
					}
					local30 = true;
					return local30;
				}
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1950;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[B")
	public byte[] method1481(@OriginalArg(0) int arg0) {
		@Pc(9) Class193 local9 = this.aClass193_2;
		synchronized (this.aClass193_2) {
			try {
				@Pc(28) Object local28;
				if ((long) (arg0 * 6 + 6) > this.aClass193_3.method4834()) {
					local28 = null;
					return (byte[]) local28;
				}
				this.aClass193_3.method4835((long) (arg0 * 6));
				this.aClass193_3.method4838(Static123.aByteArray17, 0, 6);
				@Pc(69) int local69 = ((Static123.aByteArray17[0] & 0xFF) << 16) + (Static123.aByteArray17[1] << 8 & 0xFF00) + (Static123.aByteArray17[2] & 0xFF);
				@Pc(91) int local91 = (Static123.aByteArray17[5] & 0xFF) + ((Static123.aByteArray17[4] & 0xFF) << 8) + ((Static123.aByteArray17[3] & 0xFF) << 16);
				if (local69 < 0 || local69 > this.anInt1949) {
					local28 = null;
					return (byte[]) local28;
				} else if (local91 <= 0 || this.aClass193_2.method4834() / 520L < (long) local91) {
					local28 = null;
					return (byte[]) local28;
				} else {
					@Pc(130) byte[] local130 = new byte[local69];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					while (local69 > local134) {
						if (local91 == 0) {
							local28 = null;
							return (byte[]) local28;
						}
						this.aClass193_2.method4835((long) (local91 * 520));
						@Pc(162) int local162 = local69 - local134;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass193_2.method4838(Static123.aByteArray17, 0, local162 + 8);
						@Pc(192) int local192 = (Static123.aByteArray17[3] & 0xFF) + ((Static123.aByteArray17[2] & 0xFF) << 8);
						@Pc(214) int local214 = (Static123.aByteArray17[6] & 0xFF) + ((Static123.aByteArray17[5] & 0xFF) << 8) + ((Static123.aByteArray17[4] & 0xFF) << 16);
						@Pc(228) int local228 = (Static123.aByteArray17[1] & 0xFF) + ((Static123.aByteArray17[0] & 0xFF) << 8);
						@Pc(234) int local234 = Static123.aByteArray17[7] & 0xFF;
						if (arg0 != local228 || local192 != local132 || local234 != this.anInt1950) {
							local28 = null;
							return (byte[]) local28;
						}
						if (local214 < 0 || (long) local214 > this.aClass193_2.method4834() / 520L) {
							local28 = null;
							return (byte[]) local28;
						}
						for (@Pc(272) int local272 = 0; local272 < local162; local272++) {
							local130[local134++] = Static123.aByteArray17[local272 + 8];
						}
						local132++;
						local91 = local214;
					}
					@Pc(293) byte[] local293 = local130;
					return local293;
				}
			} catch (@Pc(297) IOException local297) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[BII)Z")
	public boolean method1482(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class193 local14 = this.aClass193_2;
		synchronized (this.aClass193_2) {
			if (arg0 < 0 || this.anInt1949 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method1475(arg2, true, arg0, arg1);
			if (!local34) {
				local34 = this.method1475(arg2, false, arg0, arg1);
			}
			return local34;
		}
	}
}
