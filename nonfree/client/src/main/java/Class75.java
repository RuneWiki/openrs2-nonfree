import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class75 {

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
	private int anInt1494 = 65000;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Lclient!cka;")
	private Class62 aClass62_1 = null;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Lclient!cka;")
	private Class62 aClass62_2 = null;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
	private final int anInt1502;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILclient!cka;Lclient!cka;I)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3) {
		this.anInt1494 = arg3;
		this.aClass62_1 = arg2;
		this.anInt1502 = arg0;
		this.aClass62_2 = arg1;
	}

	@OriginalMember(owner = "client!dca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1502;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(III[B)Z")
	public boolean method1394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class62 local6 = this.aClass62_2;
		synchronized (this.aClass62_2) {
			if (arg1 < 0 || arg1 > this.anInt1494) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method1396(arg1, true, arg0, arg2);
			if (!local34) {
				local34 = this.method1396(arg1, false, arg0, arg2);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)[B")
	public byte[] method1395(@OriginalArg(0) int arg0) {
		@Pc(15) Class62 local15 = this.aClass62_2;
		synchronized (this.aClass62_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass62_1.method1159()) {
					return null;
				}
				this.aClass62_1.method1160((long) (arg0 * 6));
				this.aClass62_1.method1162(Static459.aByteArray83, 0, 6);
				@Pc(77) int local77 = ((Static459.aByteArray83[0] & 0xFF) << 16) - (-((Static459.aByteArray83[1] & 0xFF) << 8) - (Static459.aByteArray83[2] & 0xFF));
				@Pc(100) int local100 = ((Static459.aByteArray83[3] & 0xFF) << 16) - (-((Static459.aByteArray83[4] & 0xFF) << 8) - (Static459.aByteArray83[5] & 0xFF));
				if (local77 < 0 || local77 > this.anInt1494) {
					return null;
				} else if (local100 > 0 && (long) local100 <= this.aClass62_2.method1159() / 520L) {
					@Pc(144) byte[] local144 = new byte[local77];
					@Pc(146) int local146 = 0;
					@Pc(148) int local148 = 0;
					while (local77 > local146) {
						if (local100 == 0) {
							return null;
						}
						this.aClass62_2.method1160((long) (local100 * 520));
						@Pc(176) int local176 = local77 - local146;
						if (local176 > 512) {
							local176 = 512;
						}
						this.aClass62_2.method1162(Static459.aByteArray83, 0, local176 + 8);
						@Pc(206) int local206 = (Static459.aByteArray83[1] & 0xFF) + ((Static459.aByteArray83[0] & 0xFF) << 8);
						@Pc(221) int local221 = ((Static459.aByteArray83[2] & 0xFF) << 8) + (Static459.aByteArray83[3] & 0xFF);
						@Pc(244) int local244 = ((Static459.aByteArray83[5] & 0xFF) << 8) + (((Static459.aByteArray83[4] & 0xFF) << 16) + (Static459.aByteArray83[6] & 0xFF));
						@Pc(250) int local250 = Static459.aByteArray83[7] & 0xFF;
						if (local206 == arg0 && local148 == local221 && this.anInt1502 == local250) {
							if (local244 >= 0 && (long) local244 <= this.aClass62_2.method1159() / 520L) {
								for (@Pc(292) int local292 = 0; local292 < local176; local292++) {
									local144[local146++] = Static459.aByteArray83[local292 + 8];
								}
								local148++;
								local100 = local244;
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
			} catch (@Pc(332) IOException local332) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZBI[B)Z")
	private boolean method1396(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class62 local8 = this.aClass62_2;
		synchronized (this.aClass62_2) {
			try {
				@Pc(24) int local24;
				if (arg1) {
					if ((long) (arg2 * 6 + 6) > this.aClass62_1.method1159()) {
						return false;
					}
					this.aClass62_1.method1160((long) (arg2 * 6));
					this.aClass62_1.method1162(Static459.aByteArray83, 0, 6);
					local24 = ((Static459.aByteArray83[4] & 0xFF) << 8) + (((Static459.aByteArray83[3] & 0xFF) << 16) + (Static459.aByteArray83[5] & 0xFF));
					if (local24 <= 0 || (long) local24 > this.aClass62_2.method1159() / 520L) {
						return false;
					}
				} else {
					local24 = (int) ((this.aClass62_2.method1159() + 519L) / 520L);
					if (local24 == 0) {
						local24 = 1;
					}
				}
				Static459.aByteArray83[5] = (byte) local24;
				Static459.aByteArray83[2] = (byte) arg0;
				Static459.aByteArray83[4] = (byte) (local24 >> 8);
				Static459.aByteArray83[1] = (byte) (arg0 >> 8);
				Static459.aByteArray83[3] = (byte) (local24 >> 16);
				Static459.aByteArray83[0] = (byte) (arg0 >> 16);
				this.aClass62_1.method1160((long) (arg2 * 6));
				this.aClass62_1.method1161(0, 6, Static459.aByteArray83);
				@Pc(172) int local172 = 0;
				@Pc(183) int local183 = 0;
				while (true) {
					if (local172 < arg0) {
						label102: {
							@Pc(189) int local189 = 0;
							@Pc(225) int local225;
							if (arg1) {
								this.aClass62_2.method1160((long) (local24 * 520));
								try {
									this.aClass62_2.method1162(Static459.aByteArray83, 0, 8);
								} catch (@Pc(209) EOFException local209) {
									break label102;
								}
								local225 = (Static459.aByteArray83[1] & 0xFF) + ((Static459.aByteArray83[0] & 0xFF) << 8);
								local189 = ((Static459.aByteArray83[4] & 0xFF) << 16) + (((Static459.aByteArray83[5] & 0xFF) << 8) + (Static459.aByteArray83[6] & 0xFF));
								@Pc(263) int local263 = ((Static459.aByteArray83[2] & 0xFF) << 8) + (Static459.aByteArray83[3] & 0xFF);
								@Pc(269) int local269 = Static459.aByteArray83[7] & 0xFF;
								if (arg2 != local225 || local263 != local183 || this.anInt1502 != local269) {
									return false;
								}
								if (local189 < 0 || this.aClass62_2.method1159() / 520L < (long) local189) {
									return false;
								}
							}
							if (local189 == 0) {
								local189 = (int) ((this.aClass62_2.method1159() + 519L) / 520L);
								arg1 = false;
								if (local189 == 0) {
									local189++;
								}
								if (local189 == local24) {
									local189++;
								}
							}
							Static459.aByteArray83[2] = (byte) (local183 >> 8);
							Static459.aByteArray83[3] = (byte) local183;
							Static459.aByteArray83[1] = (byte) arg2;
							if (arg0 - local172 <= 512) {
								local189 = 0;
							}
							Static459.aByteArray83[0] = (byte) (arg2 >> 8);
							Static459.aByteArray83[5] = (byte) (local189 >> 8);
							Static459.aByteArray83[6] = (byte) local189;
							Static459.aByteArray83[7] = (byte) this.anInt1502;
							Static459.aByteArray83[4] = (byte) (local189 >> 16);
							this.aClass62_2.method1160((long) (local24 * 520));
							this.aClass62_2.method1161(0, 8, Static459.aByteArray83);
							local225 = arg0 - local172;
							if (local225 > 512) {
								local225 = 512;
							}
							this.aClass62_2.method1161(local172, local225, arg3);
							local172 += local225;
							local24 = local189;
							local183++;
							continue;
						}
					}
					@Pc(456) boolean local456 = true;
					return true;
				}
			} catch (@Pc(461) IOException local461) {
				return false;
			}
		}
	}
}
