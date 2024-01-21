import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class62 {

	@OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
	public static int[] anIntArray264 = new int[99];

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!ee;")
	private Class24 aClass24_3 = null;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!ee;")
	private Class24 aClass24_2 = null;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	private int anInt2052 = 65000;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	private final int anInt2044;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray264[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILclient!ee;Lclient!ee;I)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3) {
		this.anInt2052 = arg3;
		this.aClass24_2 = arg1;
		this.anInt2044 = arg0;
		this.aClass24_3 = arg2;
	}

	@OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2044;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)Z")
	public boolean method1396(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class24 local11 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			if (arg2 < 0 || this.anInt2052 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1402(arg1, arg2, true, arg0);
			if (!local31) {
				local31 = this.method1402(arg1, arg2, false, arg0);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[B")
	public byte[] method1400(@OriginalArg(1) int arg0) {
		@Pc(8) Class24 local8 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass24_3.method555()) {
					return null;
				}
				this.aClass24_3.method554((long) (arg0 * 6));
				this.aClass24_3.method564(6, Static113.aByteArray24, 0);
				@Pc(78) int local78 = ((Static113.aByteArray24[1] & 0xFF) << 8) + ((Static113.aByteArray24[0] & 0xFF) << 16) + (Static113.aByteArray24[2] & 0xFF);
				@Pc(100) int local100 = (Static113.aByteArray24[5] & 0xFF) + ((Static113.aByteArray24[4] & 0xFF) << 8) + ((Static113.aByteArray24[3] & 0xFF) << 16);
				if (local78 < 0 || local78 > this.anInt2052) {
					return null;
				} else if (local100 > 0 && (long) local100 <= this.aClass24_2.method555() / 520L) {
					@Pc(135) int local135 = 0;
					@Pc(138) byte[] local138 = new byte[local78];
					@Pc(140) int local140 = 0;
					while (local135 < local78) {
						if (local100 == 0) {
							return null;
						}
						@Pc(157) int local157 = local78 - local135;
						this.aClass24_2.method554((long) (local100 * 520));
						if (local157 > 512) {
							local157 = 512;
						}
						this.aClass24_2.method564(local157 + 8, Static113.aByteArray24, 0);
						@Pc(195) int local195 = (Static113.aByteArray24[3] & 0xFF) + ((Static113.aByteArray24[2] & 0xFF) << 8);
						@Pc(209) int local209 = (Static113.aByteArray24[1] & 0xFF) + ((Static113.aByteArray24[0] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static113.aByteArray24[5] & 0xFF) << 8) + (((Static113.aByteArray24[4] & 0xFF) << 16) + (Static113.aByteArray24[6] & 0xFF));
						@Pc(238) int local238 = Static113.aByteArray24[7] & 0xFF;
						if (local209 == arg0 && local195 == local140 && local238 == this.anInt2044) {
							if (local232 >= 0 && (long) local232 <= this.aClass24_2.method555() / 520L) {
								local140++;
								for (@Pc(279) int local279 = 0; local279 < local157; local279++) {
									local138[local135++] = Static113.aByteArray24[local279 + 8];
								}
								local100 = local232;
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
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZZ[B)Z")
	private boolean method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class24 local8 = this.aClass24_2;
		synchronized (this.aClass24_2) {
			try {
				@Pc(67) int local67;
				if (arg2) {
					if (this.aClass24_3.method555() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass24_3.method554((long) (arg0 * 6));
					this.aClass24_3.method564(6, Static113.aByteArray24, 0);
					local67 = (Static113.aByteArray24[5] & 0xFF) + ((Static113.aByteArray24[4] & 0xFF) << 8) + ((Static113.aByteArray24[3] & 0xFF) << 16);
					if (local67 <= 0 || (long) local67 > this.aClass24_2.method555() / 520L) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass24_2.method555() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static113.aByteArray24[0] = (byte) (arg1 >> 16);
				Static113.aByteArray24[1] = (byte) (arg1 >> 8);
				Static113.aByteArray24[2] = (byte) arg1;
				Static113.aByteArray24[3] = (byte) (local67 >> 16);
				Static113.aByteArray24[4] = (byte) (local67 >> 8);
				@Pc(134) int local134 = 0;
				Static113.aByteArray24[5] = (byte) local67;
				this.aClass24_3.method554((long) (arg0 * 6));
				@Pc(149) int local149 = 0;
				this.aClass24_3.method560(0, Static113.aByteArray24, 6);
				while (arg1 > local134) {
					@Pc(160) int local160 = 0;
					@Pc(237) int local237;
					if (arg2) {
						this.aClass24_2.method554((long) (local67 * 520));
						try {
							this.aClass24_2.method564(8, Static113.aByteArray24, 0);
						} catch (@Pc(179) EOFException local179) {
							return true;
						}
						local160 = (Static113.aByteArray24[6] & 0xFF) + ((Static113.aByteArray24[5] & 0xFF) << 8) + ((Static113.aByteArray24[4] & 0xFF) << 16);
						@Pc(217) int local217 = (Static113.aByteArray24[3] & 0xFF) + ((Static113.aByteArray24[2] & 0xFF) << 8);
						@Pc(223) int local223 = Static113.aByteArray24[7] & 0xFF;
						local237 = ((Static113.aByteArray24[0] & 0xFF) << 8) + (Static113.aByteArray24[1] & 0xFF);
						if (local237 != arg0 || local149 != local217 || this.anInt2044 != local223) {
							return false;
						}
						if (local160 < 0 || (long) local160 > this.aClass24_2.method555() / 520L) {
							return false;
						}
					}
					if (local160 == 0) {
						arg2 = false;
						local160 = (int) ((this.aClass24_2.method555() + 519L) / 520L);
						if (local160 == 0) {
							local160++;
						}
						if (local160 == local67) {
							local160++;
						}
					}
					if (arg1 - local134 <= 512) {
						local160 = 0;
					}
					Static113.aByteArray24[0] = (byte) (arg0 >> 8);
					Static113.aByteArray24[1] = (byte) arg0;
					local237 = arg1 - local134;
					Static113.aByteArray24[2] = (byte) (local149 >> 8);
					if (local237 > 512) {
						local237 = 512;
					}
					Static113.aByteArray24[3] = (byte) local149;
					Static113.aByteArray24[4] = (byte) (local160 >> 16);
					local149++;
					Static113.aByteArray24[5] = (byte) (local160 >> 8);
					Static113.aByteArray24[6] = (byte) local160;
					Static113.aByteArray24[7] = (byte) this.anInt2044;
					this.aClass24_2.method554((long) (local67 * 520));
					local67 = local160;
					this.aClass24_2.method560(0, Static113.aByteArray24, 8);
					this.aClass24_2.method560(local134, arg3, local237);
					local134 += local237;
				}
				return true;
			} catch (@Pc(410) IOException local410) {
				return false;
			}
		}
	}
}
