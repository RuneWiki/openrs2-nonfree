import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class55 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!l;")
	private Class37 aClass37_2 = null;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!l;")
	private Class37 aClass37_3 = null;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	private int anInt2338 = 65000;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	private final int anInt2336;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILclient!l;Lclient!l;I)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3) {
		this.aClass37_2 = arg1;
		this.anInt2338 = arg3;
		this.aClass37_3 = arg2;
		this.anInt2336 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2336;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI[BI)Z")
	public boolean method1646(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class37 local6 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			if (arg2 < 0 || this.anInt2338 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method1649(arg2, true, arg1, arg0);
			if (!local38) {
				local38 = this.method1649(arg2, false, arg1, arg0);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B")
	public byte[] method1647(@OriginalArg(1) int arg0) {
		@Pc(8) Class37 local8 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass37_3.method1075()) {
					return null;
				}
				this.aClass37_3.method1072((long) (arg0 * 6));
				this.aClass37_3.method1069(Static80.aByteArray20, 0, 6);
				@Pc(77) int local77 = (Static80.aByteArray20[2] & 0xFF) + ((Static80.aByteArray20[1] & 0xFF) << 8) + ((Static80.aByteArray20[0] & 0xFF) << 16);
				@Pc(99) int local99 = ((Static80.aByteArray20[4] & 0xFF) << 8) + ((Static80.aByteArray20[3] & 0xFF) << 16) + (Static80.aByteArray20[5] & 0xFF);
				if (local77 < 0 || this.anInt2338 < local77) {
					return null;
				} else if (local99 > 0 && this.aClass37_2.method1075() / 520L >= (long) local99) {
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					@Pc(147) byte[] local147 = new byte[local77];
					while (local77 > local142) {
						if (local99 == 0) {
							return null;
						}
						this.aClass37_2.method1072((long) (local99 * 520));
						@Pc(173) int local173 = local77 - local142;
						if (local173 > 512) {
							local173 = 512;
						}
						this.aClass37_2.method1069(Static80.aByteArray20, 0, local173 + 8);
						@Pc(201) int local201 = ((Static80.aByteArray20[0] & 0xFF) << 8) + (Static80.aByteArray20[1] & 0xFF);
						@Pc(216) int local216 = ((Static80.aByteArray20[2] & 0xFF) << 8) + (Static80.aByteArray20[3] & 0xFF);
						@Pc(239) int local239 = (Static80.aByteArray20[6] & 0xFF) + (((Static80.aByteArray20[4] & 0xFF) << 16) + ((Static80.aByteArray20[5] & 0xFF) << 8));
						@Pc(245) int local245 = Static80.aByteArray20[7] & 0xFF;
						if (local201 == arg0 && local144 == local216 && local245 == this.anInt2336) {
							if (local239 >= 0 && (long) local239 <= this.aClass37_2.method1075() / 520L) {
								for (@Pc(296) int local296 = 0; local296 < local173; local296++) {
									local147[local142++] = Static80.aByteArray20[local296 + 8];
								}
								local99 = local239;
								local144++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local147;
				} else {
					return null;
				}
			} catch (@Pc(328) IOException local328) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ[BI)Z")
	private boolean method1649(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class37 local8 = this.aClass37_2;
		synchronized (this.aClass37_2) {
			try {
				@Pc(76) int local76;
				if (arg1) {
					if (this.aClass37_3.method1075() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass37_3.method1072((long) (arg3 * 6));
					this.aClass37_3.method1069(Static80.aByteArray20, 0, 6);
					local76 = ((Static80.aByteArray20[4] & 0xFF) << 8) + ((Static80.aByteArray20[3] << 16 & 0xFF0000) + (Static80.aByteArray20[5] & 0xFF));
					if (local76 <= 0 || this.aClass37_2.method1075() / 520L < (long) local76) {
						return false;
					}
				} else {
					local76 = (int) ((this.aClass37_2.method1075() + 519L) / 520L);
					if (local76 == 0) {
						local76 = 1;
					}
				}
				Static80.aByteArray20[0] = (byte) (arg0 >> 16);
				@Pc(123) int local123 = 0;
				Static80.aByteArray20[1] = (byte) (arg0 >> 8);
				Static80.aByteArray20[2] = (byte) arg0;
				Static80.aByteArray20[3] = (byte) (local76 >> 16);
				Static80.aByteArray20[4] = (byte) (local76 >> 8);
				Static80.aByteArray20[5] = (byte) local76;
				@Pc(156) int local156 = 0;
				this.aClass37_3.method1072((long) (arg3 * 6));
				this.aClass37_3.method1077(0, 6, Static80.aByteArray20);
				while (local123 < arg0) {
					@Pc(175) int local175 = 0;
					@Pc(246) int local246;
					if (arg1) {
						this.aClass37_2.method1072((long) (local76 * 520));
						try {
							this.aClass37_2.method1069(Static80.aByteArray20, 0, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local175 = (Static80.aByteArray20[6] & 0xFF) + ((Static80.aByteArray20[4] & 0xFF) << 16) + ((Static80.aByteArray20[5] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static80.aByteArray20[2] & 0xFF) << 8) + (Static80.aByteArray20[3] & 0xFF);
						local246 = (Static80.aByteArray20[1] & 0xFF) + ((Static80.aByteArray20[0] & 0xFF) << 8);
						@Pc(252) int local252 = Static80.aByteArray20[7] & 0xFF;
						if (local246 != arg3 || local156 != local232 || this.anInt2336 != local252) {
							return false;
						}
						if (local175 < 0 || this.aClass37_2.method1075() / 520L < (long) local175) {
							return false;
						}
					}
					local246 = arg0 - local123;
					if (local246 > 512) {
						local246 = 512;
					}
					if (local175 == 0) {
						local175 = (int) ((this.aClass37_2.method1075() + 519L) / 520L);
						arg1 = false;
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local76) {
							local175++;
						}
					}
					if (arg0 - local123 <= 512) {
						local175 = 0;
					}
					Static80.aByteArray20[0] = (byte) (arg3 >> 8);
					Static80.aByteArray20[1] = (byte) arg3;
					Static80.aByteArray20[2] = (byte) (local156 >> 8);
					Static80.aByteArray20[3] = (byte) local156;
					local156++;
					Static80.aByteArray20[4] = (byte) (local175 >> 16);
					Static80.aByteArray20[5] = (byte) (local175 >> 8);
					Static80.aByteArray20[6] = (byte) local175;
					Static80.aByteArray20[7] = (byte) this.anInt2336;
					this.aClass37_2.method1072((long) (local76 * 520));
					local76 = local175;
					this.aClass37_2.method1077(0, 8, Static80.aByteArray20);
					this.aClass37_2.method1077(local123, local246, arg2);
					local123 += local246;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}
}
