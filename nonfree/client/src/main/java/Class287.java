import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class287 {

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "Lclient!du;")
	private Class85 aClass85_4 = null;

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "Lclient!du;")
	private Class85 aClass85_5 = null;

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
	private int anInt8270 = 65000;

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
	private final int anInt8274;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(ILclient!du;Lclient!du;I)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) int arg3) {
		this.anInt8274 = arg0;
		this.aClass85_5 = arg2;
		this.aClass85_4 = arg1;
		this.anInt8270 = arg3;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)Z")
	public boolean method7029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(11) Class85 local11 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			if (arg1 < 0 || arg1 > this.anInt8270) {
				throw new IllegalArgumentException();
			}
			@Pc(40) boolean local40 = this.method7032(arg2, arg0, arg1, true);
			if (!local40) {
				local40 = this.method7032(arg2, arg0, arg1, false);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!qia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8274;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[B")
	public byte[] method7030(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass85_5.method1851()) {
					return null;
				}
				this.aClass85_5.method1847((long) (arg0 * 6));
				this.aClass85_5.method1843(0, 6, Static468.aByteArray78);
				@Pc(63) int local63 = (Static468.aByteArray78[2] & 0xFF) + ((Static468.aByteArray78[1] & 0xFF) << 8) + ((Static468.aByteArray78[0] & 0xFF) << 16);
				@Pc(85) int local85 = (Static468.aByteArray78[5] & 0xFF) + ((Static468.aByteArray78[4] & 0xFF) << 8) + ((Static468.aByteArray78[3] & 0xFF) << 16);
				if (local63 < 0 || local63 > this.anInt8270) {
					return null;
				} else if (local85 > 0 && this.aClass85_4.method1851() / 520L >= (long) local85) {
					@Pc(125) byte[] local125 = new byte[local63];
					@Pc(127) int local127 = 0;
					@Pc(129) int local129 = 0;
					while (local127 < local63) {
						if (local85 == 0) {
							return null;
						}
						this.aClass85_4.method1847((long) (local85 * 520));
						@Pc(150) int local150 = local63 - local127;
						if (local150 > 512) {
							local150 = 512;
						}
						this.aClass85_4.method1843(0, local150 + 8, Static468.aByteArray78);
						@Pc(178) int local178 = (Static468.aByteArray78[1] & 0xFF) + ((Static468.aByteArray78[0] & 0xFF) << 8);
						@Pc(193) int local193 = ((Static468.aByteArray78[2] & 0xFF) << 8) + (Static468.aByteArray78[3] & 0xFF);
						@Pc(215) int local215 = (Static468.aByteArray78[6] & 0xFF) + ((Static468.aByteArray78[5] & 0xFF) << 8) + ((Static468.aByteArray78[4] & 0xFF) << 16);
						@Pc(221) int local221 = Static468.aByteArray78[7] & 0xFF;
						if (arg0 == local178 && local193 == local129 && this.anInt8274 == local221) {
							if (local215 >= 0 && (long) local215 <= this.aClass85_4.method1851() / 520L) {
								for (@Pc(268) int local268 = 0; local268 < local150; local268++) {
									local125[local127++] = Static468.aByteArray78[local268 + 8];
								}
								local85 = local215;
								local129++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local125;
				} else {
					return null;
				}
			} catch (@Pc(303) IOException local303) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method7032(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class85 local8 = this.aClass85_4;
		synchronized (this.aClass85_4) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass85_5.method1851()) {
						return false;
					}
					this.aClass85_5.method1847((long) (arg1 * 6));
					this.aClass85_5.method1843(0, 6, Static468.aByteArray78);
					local22 = (Static468.aByteArray78[5] & 0xFF) + ((Static468.aByteArray78[3] & 0xFF) << 16) + ((Static468.aByteArray78[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass85_4.method1851() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass85_4.method1851() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static468.aByteArray78[5] = (byte) local22;
				Static468.aByteArray78[2] = (byte) arg2;
				Static468.aByteArray78[3] = (byte) (local22 >> 16);
				Static468.aByteArray78[4] = (byte) (local22 >> 8);
				Static468.aByteArray78[0] = (byte) (arg2 >> 16);
				Static468.aByteArray78[1] = (byte) (arg2 >> 8);
				this.aClass85_5.method1847((long) (arg1 * 6));
				this.aClass85_5.method1849(6, Static468.aByteArray78, 0);
				@Pc(172) int local172 = 0;
				@Pc(174) int local174 = 0;
				while (arg2 > local172) {
					@Pc(178) int local178 = 0;
					@Pc(214) int local214;
					if (arg3) {
						this.aClass85_4.method1847((long) (local22 * 520));
						try {
							this.aClass85_4.method1843(0, 8, Static468.aByteArray78);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local214 = ((Static468.aByteArray78[0] & 0xFF) << 8) + (Static468.aByteArray78[1] & 0xFF);
						local178 = ((Static468.aByteArray78[5] & 0xFF) << 8) + (((Static468.aByteArray78[4] & 0xFF) << 16) + (Static468.aByteArray78[6] & 0xFF));
						@Pc(251) int local251 = (Static468.aByteArray78[3] & 0xFF) + ((Static468.aByteArray78[2] & 0xFF) << 8);
						@Pc(257) int local257 = Static468.aByteArray78[7] & 0xFF;
						if (arg1 != local214 || local174 != local251 || local257 != this.anInt8274) {
							return false;
						}
						if (local178 < 0 || (long) local178 > this.aClass85_4.method1851() / 520L) {
							return false;
						}
					}
					if (local178 == 0) {
						arg3 = false;
						local178 = (int) ((this.aClass85_4.method1851() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local22) {
							local178++;
						}
					}
					if (arg2 - local172 <= 512) {
						local178 = 0;
					}
					Static468.aByteArray78[1] = (byte) arg1;
					Static468.aByteArray78[0] = (byte) (arg1 >> 8);
					Static468.aByteArray78[2] = (byte) (local174 >> 8);
					Static468.aByteArray78[3] = (byte) local174;
					Static468.aByteArray78[5] = (byte) (local178 >> 8);
					Static468.aByteArray78[6] = (byte) local178;
					Static468.aByteArray78[7] = (byte) this.anInt8274;
					Static468.aByteArray78[4] = (byte) (local178 >> 16);
					this.aClass85_4.method1847((long) (local22 * 520));
					this.aClass85_4.method1849(8, Static468.aByteArray78, 0);
					local214 = arg2 - local172;
					if (local214 > 512) {
						local214 = 512;
					}
					this.aClass85_4.method1849(local214, arg0, local172);
					local174++;
					local22 = local178;
					local172 += local214;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}
}
