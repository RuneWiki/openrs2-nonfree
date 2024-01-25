import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class73 {

	@OriginalMember(owner = "client!dka", name = "h", descriptor = "I")
	private int anInt2301 = 65000;

	@OriginalMember(owner = "client!dka", name = "g", descriptor = "Lclient!rla;")
	private Class325 aClass325_1 = null;

	@OriginalMember(owner = "client!dka", name = "l", descriptor = "Lclient!rla;")
	private Class325 aClass325_2 = null;

	@OriginalMember(owner = "client!dka", name = "j", descriptor = "I")
	private final int anInt2303;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(ILclient!rla;Lclient!rla;I)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) Class325 arg1, @OriginalArg(2) Class325 arg2, @OriginalArg(3) int arg3) {
		this.anInt2303 = arg0;
		this.aClass325_2 = arg1;
		this.anInt2301 = arg3;
		this.aClass325_1 = arg2;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IIB[BZ)Z")
	private boolean method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class325 local8 = this.aClass325_2;
		synchronized (this.aClass325_2) {
			try {
				@Pc(73) int local73;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass325_1.method7814()) {
						return false;
					}
					this.aClass325_1.method7815((long) (arg1 * 6));
					this.aClass325_1.method7813(Static381.aByteArray52, 6, 0);
					local73 = (Static381.aByteArray52[5] & 0xFF) + ((Static381.aByteArray52[3] & 0xFF) << 16) + ((Static381.aByteArray52[4] & 0xFF) << 8);
					if (local73 <= 0 || (long) local73 > this.aClass325_2.method7814() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass325_2.method7814() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static381.aByteArray52[1] = (byte) (arg0 >> 8);
				Static381.aByteArray52[3] = (byte) (local73 >> 16);
				Static381.aByteArray52[4] = (byte) (local73 >> 8);
				Static381.aByteArray52[0] = (byte) (arg0 >> 16);
				Static381.aByteArray52[2] = (byte) arg0;
				Static381.aByteArray52[5] = (byte) local73;
				this.aClass325_1.method7815((long) (arg1 * 6));
				this.aClass325_1.method7818(0, Static381.aByteArray52, 6);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (true) {
					if (arg0 > local174) {
						label102: {
							@Pc(182) int local182 = 0;
							@Pc(218) int local218;
							if (arg3) {
								this.aClass325_2.method7815((long) (local73 * 520));
								try {
									this.aClass325_2.method7813(Static381.aByteArray52, 8, 0);
								} catch (@Pc(202) EOFException local202) {
									break label102;
								}
								local218 = (Static381.aByteArray52[1] & 0xFF) + ((Static381.aByteArray52[0] & 0xFF) << 8);
								@Pc(232) int local232 = (Static381.aByteArray52[3] & 0xFF) + ((Static381.aByteArray52[2] & 0xFF) << 8);
								local182 = (Static381.aByteArray52[6] & 0xFF) + ((Static381.aByteArray52[5] & 0xFF) << 8) + ((Static381.aByteArray52[4] & 0xFF) << 16);
								@Pc(260) int local260 = Static381.aByteArray52[7] & 0xFF;
								if (arg1 != local218 || local176 != local232 || this.anInt2303 != local260) {
									return false;
								}
								if (local182 < 0 || (long) local182 > this.aClass325_2.method7814() / 520L) {
									return false;
								}
							}
							if (local182 == 0) {
								arg3 = false;
								local182 = (int) ((this.aClass325_2.method7814() + 519L) / 520L);
								if (local182 == 0) {
									local182++;
								}
								if (local182 == local73) {
									local182++;
								}
							}
							if (arg0 - local174 <= 512) {
								local182 = 0;
							}
							Static381.aByteArray52[3] = (byte) local176;
							Static381.aByteArray52[0] = (byte) (arg1 >> 8);
							Static381.aByteArray52[2] = (byte) (local176 >> 8);
							Static381.aByteArray52[1] = (byte) arg1;
							Static381.aByteArray52[6] = (byte) local182;
							Static381.aByteArray52[4] = (byte) (local182 >> 16);
							Static381.aByteArray52[7] = (byte) this.anInt2303;
							Static381.aByteArray52[5] = (byte) (local182 >> 8);
							this.aClass325_2.method7815((long) (local73 * 520));
							this.aClass325_2.method7818(0, Static381.aByteArray52, 8);
							local218 = arg0 - local174;
							if (local218 > 512) {
								local218 = 512;
							}
							this.aClass325_2.method7818(local174, arg2, local218);
							local174 += local218;
							local73 = local182;
							local176++;
							continue;
						}
					}
					@Pc(452) boolean local452 = true;
					return true;
				}
			} catch (@Pc(457) IOException local457) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2303;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "([BIII)Z")
	public boolean method2047(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class325 local6 = this.aClass325_2;
		synchronized (this.aClass325_2) {
			if (arg2 < 0 || arg2 > this.anInt2301) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method2046(arg2, arg1, arg0, true);
			if (!local30) {
				local30 = this.method2046(arg2, arg1, arg0, false);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(BI)[B")
	public byte[] method2048(@OriginalArg(1) int arg0) {
		@Pc(8) Class325 local8 = this.aClass325_2;
		synchronized (this.aClass325_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass325_1.method7814()) {
					return null;
				}
				this.aClass325_1.method7815((long) (arg0 * 6));
				this.aClass325_1.method7813(Static381.aByteArray52, 6, 0);
				@Pc(78) int local78 = (Static381.aByteArray52[2] & 0xFF) + ((Static381.aByteArray52[0] & 0xFF) << 16) + ((Static381.aByteArray52[1] & 0xFF) << 8);
				@Pc(100) int local100 = ((Static381.aByteArray52[4] & 0xFF) << 8) + ((Static381.aByteArray52[3] & 0xFF) << 16) + (Static381.aByteArray52[5] & 0xFF);
				if (local78 < 0 || local78 > this.anInt2301) {
					return null;
				} else if (local100 > 0 && this.aClass325_2.method7814() / 520L >= (long) local100) {
					@Pc(140) byte[] local140 = new byte[local78];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local78 > local142) {
						if (local100 == 0) {
							return null;
						}
						this.aClass325_2.method7815((long) (local100 * 520));
						@Pc(174) int local174 = local78 - local142;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass325_2.method7813(Static381.aByteArray52, local174 + 8, 0);
						@Pc(202) int local202 = (Static381.aByteArray52[1] & 0xFF) + ((Static381.aByteArray52[0] & 0xFF) << 8);
						@Pc(216) int local216 = (Static381.aByteArray52[3] & 0xFF) + ((Static381.aByteArray52[2] & 0xFF) << 8);
						@Pc(238) int local238 = (Static381.aByteArray52[6] & 0xFF) + ((Static381.aByteArray52[5] & 0xFF) << 8) + ((Static381.aByteArray52[4] & 0xFF) << 16);
						@Pc(244) int local244 = Static381.aByteArray52[7] & 0xFF;
						if (local202 == arg0 && local144 == local216 && local244 == this.anInt2303) {
							if (local238 >= 0 && (long) local238 <= this.aClass325_2.method7814() / 520L) {
								local144++;
								for (@Pc(303) int local303 = 0; local303 < local174; local303++) {
									local140[local142++] = Static381.aByteArray52[local303 + 8];
								}
								local100 = local238;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(346) IOException local346) {
				return null;
			}
		}
	}
}
