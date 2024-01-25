import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class313 {

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	private int anInt8720 = 65000;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!nn;")
	private Class251 aClass251_139 = null;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!nn;")
	private Class251 aClass251_140 = null;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	private final int anInt8722;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILclient!nn;Lclient!nn;I)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) int arg3) {
		this.aClass251_140 = arg2;
		this.aClass251_139 = arg1;
		this.anInt8722 = arg0;
		this.anInt8720 = arg3;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)[B")
	public byte[] method7372(@OriginalArg(0) int arg0) {
		@Pc(8) Class251 local8 = this.aClass251_139;
		synchronized (this.aClass251_139) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass251_140.method5754()) {
					return null;
				}
				this.aClass251_140.method5751((long) (arg0 * 6));
				this.aClass251_140.method5752(0, Static589.aByteArray102, 6);
				@Pc(78) int local78 = (Static589.aByteArray102[2] & 0xFF) + ((Static589.aByteArray102[1] & 0xFF) << 8) + ((Static589.aByteArray102[0] & 0xFF) << 16);
				@Pc(101) int local101 = ((Static589.aByteArray102[4] & 0xFF) << 8) + (((Static589.aByteArray102[3] & 0xFF) << 16) + (Static589.aByteArray102[5] & 0xFF));
				if (local78 < 0 || this.anInt8720 < local78) {
					return null;
				} else if (local101 > 0 && this.aClass251_139.method5754() / 520L >= (long) local101) {
					@Pc(141) byte[] local141 = new byte[local78];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local143 < local78) {
						if (local101 == 0) {
							return null;
						}
						this.aClass251_139.method5751((long) (local101 * 520));
						@Pc(171) int local171 = local78 - local143;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass251_139.method5752(0, Static589.aByteArray102, local171 + 8);
						@Pc(201) int local201 = (Static589.aByteArray102[1] & 0xFF) + ((Static589.aByteArray102[0] & 0xFF) << 8);
						@Pc(215) int local215 = (Static589.aByteArray102[3] & 0xFF) + ((Static589.aByteArray102[2] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static589.aByteArray102[5] & 0xFF) << 8) + ((Static589.aByteArray102[4] & 0xFF) << 16) + (Static589.aByteArray102[6] & 0xFF);
						@Pc(243) int local243 = Static589.aByteArray102[7] & 0xFF;
						if (local201 == arg0 && local215 == local145 && local243 == this.anInt8722) {
							if (local237 >= 0 && this.aClass251_139.method5754() / 520L >= (long) local237) {
								for (@Pc(287) int local287 = 0; local287 < local171; local287++) {
									local141[local143++] = Static589.aByteArray102[local287 + 8];
								}
								local145++;
								local101 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(319) IOException local319) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([BIII)Z")
	public boolean method7373(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class251 local6 = this.aClass251_139;
		synchronized (this.aClass251_139) {
			if (arg1 < 0 || arg1 > this.anInt8720) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method7374(arg0, arg2, true, arg1);
			if (!local38) {
				local38 = this.method7374(arg0, arg2, false, arg1);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BIZI)Z")
	private boolean method7374(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class251 local14 = this.aClass251_139;
		synchronized (this.aClass251_139) {
			try {
				@Pc(77) int local77;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass251_140.method5754()) {
						return false;
					}
					this.aClass251_140.method5751((long) (arg1 * 6));
					this.aClass251_140.method5752(0, Static589.aByteArray102, 6);
					local77 = (Static589.aByteArray102[5] & 0xFF) + ((Static589.aByteArray102[3] & 0xFF) << 16) + ((Static589.aByteArray102[4] & 0xFF) << 8);
					if (local77 <= 0 || this.aClass251_139.method5754() / 520L < (long) local77) {
						return false;
					}
				} else {
					local77 = (int) ((this.aClass251_139.method5754() + 519L) / 520L);
					if (local77 == 0) {
						local77 = 1;
					}
				}
				Static589.aByteArray102[4] = (byte) (local77 >> 8);
				Static589.aByteArray102[3] = (byte) (local77 >> 16);
				Static589.aByteArray102[5] = (byte) local77;
				Static589.aByteArray102[1] = (byte) (arg3 >> 8);
				Static589.aByteArray102[0] = (byte) (arg3 >> 16);
				Static589.aByteArray102[2] = (byte) arg3;
				this.aClass251_140.method5751((long) (arg1 * 6));
				this.aClass251_140.method5750(0, 6, Static589.aByteArray102);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (arg3 > local176) {
					@Pc(182) int local182 = 0;
					@Pc(217) int local217;
					if (arg2) {
						this.aClass251_139.method5751((long) (local77 * 520));
						try {
							this.aClass251_139.method5752(0, Static589.aByteArray102, 8);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local217 = ((Static589.aByteArray102[0] & 0xFF) << 8) + (Static589.aByteArray102[1] & 0xFF);
						local182 = (Static589.aByteArray102[6] & 0xFF) + ((Static589.aByteArray102[4] & 0xFF) << 16) + ((Static589.aByteArray102[5] & 0xFF) << 8);
						@Pc(254) int local254 = (Static589.aByteArray102[3] & 0xFF) + ((Static589.aByteArray102[2] & 0xFF) << 8);
						@Pc(260) int local260 = Static589.aByteArray102[7] & 0xFF;
						if (arg1 != local217 || local254 != local178 || this.anInt8722 != local260) {
							return false;
						}
						if (local182 < 0 || (long) local182 > this.aClass251_139.method5754() / 520L) {
							return false;
						}
					}
					if (local182 == 0) {
						local182 = (int) ((this.aClass251_139.method5754() + 519L) / 520L);
						arg2 = false;
						if (local182 == 0) {
							local182++;
						}
						if (local77 == local182) {
							local182++;
						}
					}
					Static589.aByteArray102[0] = (byte) (arg1 >> 8);
					Static589.aByteArray102[3] = (byte) local178;
					Static589.aByteArray102[1] = (byte) arg1;
					if (arg3 - local176 <= 512) {
						local182 = 0;
					}
					Static589.aByteArray102[2] = (byte) (local178 >> 8);
					Static589.aByteArray102[7] = (byte) this.anInt8722;
					Static589.aByteArray102[6] = (byte) local182;
					Static589.aByteArray102[5] = (byte) (local182 >> 8);
					Static589.aByteArray102[4] = (byte) (local182 >> 16);
					this.aClass251_139.method5751((long) (local77 * 520));
					this.aClass251_139.method5750(0, 8, Static589.aByteArray102);
					local217 = arg3 - local176;
					if (local217 > 512) {
						local217 = 512;
					}
					this.aClass251_139.method5750(local176, local217, arg0);
					local176 += local217;
					local178++;
					local77 = local182;
				}
				return true;
			} catch (@Pc(445) IOException local445) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8722;
	}
}
