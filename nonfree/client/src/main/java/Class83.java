import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class83 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!wi;")
	private Class193 aClass193_7 = null;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!wi;")
	private Class193 aClass193_8 = null;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	private int anInt2674 = 65000;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(ILclient!wi;Lclient!wi;I)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int arg3) {
		this.aClass193_8 = arg1;
		this.anInt2677 = arg0;
		this.anInt2674 = arg3;
		this.aClass193_7 = arg2;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)[B")
	public byte[] method2013(@OriginalArg(1) int arg0) {
		@Pc(9) Class193 local9 = this.aClass193_8;
		synchronized (this.aClass193_8) {
			try {
				@Pc(27) Object local27;
				if ((long) (arg0 * 6 + 6) > this.aClass193_7.method4700()) {
					local27 = null;
					return (byte[]) local27;
				}
				this.aClass193_7.method4697((long) (arg0 * 6));
				this.aClass193_7.method4701(Static163.aByteArray59, 6, 0);
				@Pc(67) int local67 = (Static163.aByteArray59[2] & 0xFF) + ((Static163.aByteArray59[0] & 0xFF) << 16) + ((Static163.aByteArray59[1] & 0xFF) << 8);
				@Pc(90) int local90 = ((Static163.aByteArray59[4] & 0xFF) << 8) + (((Static163.aByteArray59[3] & 0xFF) << 16) + (Static163.aByteArray59[5] & 0xFF));
				if (local67 < 0 || this.anInt2674 < local67) {
					local27 = null;
					return (byte[]) local27;
				} else if (local90 <= 0 || (long) local90 > this.aClass193_8.method4700() / 520L) {
					local27 = null;
					return (byte[]) local27;
				} else {
					@Pc(126) int local126 = 0;
					@Pc(129) byte[] local129 = new byte[local67];
					@Pc(131) int local131 = 0;
					while (local67 > local126) {
						if (local90 == 0) {
							local27 = null;
							return (byte[]) local27;
						}
						this.aClass193_8.method4697((long) (local90 * 520));
						@Pc(157) int local157 = local67 - local126;
						if (local157 > 512) {
							local157 = 512;
						}
						this.aClass193_8.method4701(Static163.aByteArray59, local157 + 8, 0);
						@Pc(180) int local180 = Static163.aByteArray59[7] & 0xFF;
						@Pc(195) int local195 = ((Static163.aByteArray59[0] & 0xFF) << 8) + (Static163.aByteArray59[1] & 0xFF);
						@Pc(210) int local210 = ((Static163.aByteArray59[2] & 0xFF) << 8) + (Static163.aByteArray59[3] & 0xFF);
						@Pc(232) int local232 = (Static163.aByteArray59[6] & 0xFF) + ((Static163.aByteArray59[5] & 0xFF) << 8) + ((Static163.aByteArray59[4] & 0xFF) << 16);
						if (local195 != arg0 || local210 != local131 || this.anInt2677 != local180) {
							local27 = null;
							return (byte[]) local27;
						}
						if (local232 < 0 || this.aClass193_8.method4700() / 520L < (long) local232) {
							local27 = null;
							return (byte[]) local27;
						}
						for (@Pc(281) int local281 = 0; local281 < local157; local281++) {
							local129[local126++] = Static163.aByteArray59[local281 + 8];
						}
						local131++;
						local90 = local232;
					}
					@Pc(308) byte[] local308 = local129;
					return local308;
				}
			} catch (@Pc(312) IOException local312) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI[BI)Z")
	public boolean method2015(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class193 local7 = this.aClass193_8;
		synchronized (this.aClass193_8) {
			if (arg2 < 0 || arg2 > this.anInt2674) {
				throw new IllegalArgumentException();
			}
			@Pc(27) boolean local27 = this.method2016(arg2, true, arg1, arg0);
			if (!local27) {
				local27 = this.method2016(arg2, false, arg1, arg0);
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2677;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method2016(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class193 local9 = this.aClass193_8;
		synchronized (this.aClass193_8) {
			try {
				@Pc(22) int local22;
				@Pc(46) boolean local46;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass193_7.method4700()) {
						local46 = false;
						return local46;
					}
					this.aClass193_7.method4697((long) (arg3 * 6));
					this.aClass193_7.method4701(Static163.aByteArray59, 6, 0);
					local22 = (Static163.aByteArray59[5] & 0xFF) + ((Static163.aByteArray59[4] & 0xFF) << 8) + ((Static163.aByteArray59[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass193_8.method4700() / 520L < (long) local22) {
						local46 = false;
						return local46;
					}
				} else {
					local22 = (int) ((this.aClass193_8.method4700() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static163.aByteArray59[5] = (byte) local22;
				Static163.aByteArray59[4] = (byte) (local22 >> 8);
				Static163.aByteArray59[3] = (byte) (local22 >> 16);
				@Pc(128) int local128 = 0;
				@Pc(130) int local130 = 0;
				Static163.aByteArray59[2] = (byte) arg0;
				Static163.aByteArray59[0] = (byte) (arg0 >> 16);
				Static163.aByteArray59[1] = (byte) (arg0 >> 8);
				this.aClass193_7.method4697((long) (arg3 * 6));
				this.aClass193_7.method4699(0, Static163.aByteArray59, 6);
				while (true) {
					if (local128 < arg0) {
						label131: {
							@Pc(173) int local173 = 0;
							@Pc(231) int local231;
							if (arg1) {
								label150: {
									this.aClass193_8.method4697((long) (local22 * 520));
									try {
										this.aClass193_8.method4701(Static163.aByteArray59, 8, 0);
									} catch (@Pc(193) EOFException local193) {
										break label131;
									}
									local173 = (Static163.aByteArray59[6] & 0xFF) + ((Static163.aByteArray59[5] & 0xFF) << 8) + ((Static163.aByteArray59[4] & 0xFF) << 16);
									local231 = (Static163.aByteArray59[1] & 0xFF) + ((Static163.aByteArray59[0] & 0xFF) << 8);
									@Pc(245) int local245 = (Static163.aByteArray59[3] & 0xFF) + ((Static163.aByteArray59[2] & 0xFF) << 8);
									@Pc(251) int local251 = Static163.aByteArray59[7] & 0xFF;
									if (arg3 == local231 && local245 == local130 && local251 == this.anInt2677) {
										if (local173 >= 0 && this.aClass193_8.method4700() / 520L >= (long) local173) {
											break label150;
										}
										local46 = false;
										return local46;
									}
									local46 = false;
									return local46;
								}
							}
							if (local173 == 0) {
								local173 = (int) ((this.aClass193_8.method4700() + 519L) / 520L);
								arg1 = false;
								if (local173 == 0) {
									local173++;
								}
								if (local22 == local173) {
									local173++;
								}
							}
							if (arg0 - local128 <= 512) {
								local173 = 0;
							}
							Static163.aByteArray59[2] = (byte) (local130 >> 8);
							Static163.aByteArray59[1] = (byte) arg3;
							Static163.aByteArray59[0] = (byte) (arg3 >> 8);
							Static163.aByteArray59[4] = (byte) (local173 >> 16);
							Static163.aByteArray59[7] = (byte) this.anInt2677;
							Static163.aByteArray59[6] = (byte) local173;
							Static163.aByteArray59[3] = (byte) local130;
							local130++;
							Static163.aByteArray59[5] = (byte) (local173 >> 8);
							this.aClass193_8.method4697((long) (local22 * 520));
							local231 = arg0 - local128;
							local22 = local173;
							this.aClass193_8.method4699(0, Static163.aByteArray59, 8);
							if (local231 > 512) {
								local231 = 512;
							}
							this.aClass193_8.method4699(local128, arg2, local231);
							local128 += local231;
							continue;
						}
					}
					local46 = true;
					return local46;
				}
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}
}
