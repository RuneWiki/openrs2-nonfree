import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class63 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!jt;")
	private Class136 aClass136_3 = null;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	private int anInt2133 = 65000;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!jt;")
	private Class136 aClass136_4 = null;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
	private final int anInt2131;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILclient!jt;Lclient!jt;I)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(3) int arg3) {
		this.aClass136_3 = arg1;
		this.aClass136_4 = arg2;
		this.anInt2133 = arg3;
		this.anInt2131 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[B")
	public byte[] method1657(@OriginalArg(1) int arg0) {
		@Pc(8) Class136 local8 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass136_4.method3108()) {
					return null;
				}
				this.aClass136_4.method3105((long) (arg0 * 6));
				this.aClass136_4.method3110(0, Static412.aByteArray92, 6);
				@Pc(71) int local71 = ((Static412.aByteArray92[1] & 0xFF) << 8) + (Static412.aByteArray92[0] << 16 & 0xFF0000) + (Static412.aByteArray92[2] & 0xFF);
				@Pc(95) int local95 = ((Static412.aByteArray92[3] & 0xFF) << 16) - (-((Static412.aByteArray92[4] & 0xFF) << 8) - (Static412.aByteArray92[5] & 0xFF));
				if (local71 < 0 || local71 > this.anInt2133) {
					return null;
				} else if (local95 > 0 && (long) local95 <= this.aClass136_3.method3108() / 520L) {
					@Pc(140) byte[] local140 = new byte[local71];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local142 < local71) {
						if (local95 == 0) {
							return null;
						}
						this.aClass136_3.method3105((long) (local95 * 520));
						@Pc(171) int local171 = local71 - local142;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass136_3.method3110(0, Static412.aByteArray92, local171 + 8);
						@Pc(202) int local202 = ((Static412.aByteArray92[0] & 0xFF) << 8) + (Static412.aByteArray92[1] & 0xFF);
						@Pc(216) int local216 = (Static412.aByteArray92[3] & 0xFF) + ((Static412.aByteArray92[2] & 0xFF) << 8);
						@Pc(240) int local240 = ((Static412.aByteArray92[4] & 0xFF) << 16) - (-(Static412.aByteArray92[5] << 8 & 0xFF00) - (Static412.aByteArray92[6] & 0xFF));
						@Pc(246) int local246 = Static412.aByteArray92[7] & 0xFF;
						if (local202 == arg0 && local216 == local144 && this.anInt2131 == local246) {
							if (local240 >= 0 && this.aClass136_3.method3108() / 520L >= (long) local240) {
								local144++;
								for (@Pc(298) int local298 = 0; local298 < local171; local298++) {
									local140[local142++] = Static412.aByteArray92[local298 + 8];
								}
								local95 = local240;
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
			} catch (@Pc(329) IOException local329) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2131;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method1658(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) Class136 local13 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			try {
				@Pc(79) int local79;
				if (arg3) {
					if (this.aClass136_4.method3108() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass136_4.method3105((long) (arg2 * 6));
					this.aClass136_4.method3110(0, Static412.aByteArray92, 6);
					local79 = ((Static412.aByteArray92[4] & 0xFF) << 8) + ((Static412.aByteArray92[3] & 0xFF) << 16) + (Static412.aByteArray92[5] & 0xFF);
					if (local79 <= 0 || this.aClass136_3.method3108() / 520L < (long) local79) {
						return false;
					}
				} else {
					local79 = (int) ((this.aClass136_3.method3108() + 519L) / 520L);
					if (local79 == 0) {
						local79 = 1;
					}
				}
				Static412.aByteArray92[1] = (byte) (arg1 >> 8);
				Static412.aByteArray92[2] = (byte) arg1;
				Static412.aByteArray92[4] = (byte) (local79 >> 8);
				Static412.aByteArray92[5] = (byte) local79;
				Static412.aByteArray92[0] = (byte) (arg1 >> 16);
				Static412.aByteArray92[3] = (byte) (local79 >> 16);
				this.aClass136_4.method3105((long) (arg2 * 6));
				this.aClass136_4.method3113(6, Static412.aByteArray92, 0);
				@Pc(172) int local172 = 0;
				@Pc(174) int local174 = 0;
				while (arg1 > local172) {
					@Pc(178) int local178 = 0;
					@Pc(213) int local213;
					if (arg3) {
						this.aClass136_3.method3105((long) (local79 * 520));
						try {
							this.aClass136_3.method3110(0, Static412.aByteArray92, 8);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local213 = (Static412.aByteArray92[1] & 0xFF) + ((Static412.aByteArray92[0] & 0xFF) << 8);
						@Pc(227) int local227 = ((Static412.aByteArray92[2] & 0xFF) << 8) + (Static412.aByteArray92[3] & 0xFF);
						local178 = (Static412.aByteArray92[6] & 0xFF) + ((Static412.aByteArray92[4] & 0xFF) << 16) + ((Static412.aByteArray92[5] & 0xFF) << 8);
						@Pc(255) int local255 = Static412.aByteArray92[7] & 0xFF;
						if (local213 != arg2 || local227 != local174 || this.anInt2131 != local255) {
							return false;
						}
						if (local178 < 0 || this.aClass136_3.method3108() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						arg3 = false;
						local178 = (int) ((this.aClass136_3.method3108() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local79 == local178) {
							local178++;
						}
					}
					Static412.aByteArray92[1] = (byte) arg2;
					Static412.aByteArray92[0] = (byte) (arg2 >> 8);
					if (arg1 - local172 <= 512) {
						local178 = 0;
					}
					Static412.aByteArray92[2] = (byte) (local174 >> 8);
					Static412.aByteArray92[3] = (byte) local174;
					Static412.aByteArray92[5] = (byte) (local178 >> 8);
					Static412.aByteArray92[4] = (byte) (local178 >> 16);
					Static412.aByteArray92[6] = (byte) local178;
					Static412.aByteArray92[7] = (byte) this.anInt2131;
					this.aClass136_3.method3105((long) (local79 * 520));
					this.aClass136_3.method3113(8, Static412.aByteArray92, 0);
					local213 = arg1 - local172;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass136_3.method3113(local213, arg0, local172);
					local79 = local178;
					local172 += local213;
					local174++;
				}
				return true;
			} catch (@Pc(440) IOException local440) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B[BII)Z")
	public boolean method1661(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class136 local6 = this.aClass136_3;
		synchronized (this.aClass136_3) {
			if (arg2 < 0 || this.anInt2133 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method1658(arg0, arg2, arg1, true);
			if (!local35) {
				local35 = this.method1658(arg0, arg2, arg1, false);
			}
			return local35;
		}
	}
}
