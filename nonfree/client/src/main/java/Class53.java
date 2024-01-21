import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class53 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!pd;")
	private Class74 aClass74_1 = null;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	private int anInt2101 = 65000;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!pd;")
	private Class74 aClass74_2 = null;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	private final int anInt2100;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILclient!pd;Lclient!pd;I)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3) {
		this.anInt2100 = arg0;
		this.aClass74_1 = arg1;
		this.aClass74_2 = arg2;
		this.anInt2101 = arg3;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[B")
	public byte[] method1488(@OriginalArg(0) int arg0) {
		@Pc(8) Class74 local8 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			try {
				if (this.aClass74_2.method2068() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass74_2.method2065((long) (arg0 * 6));
				this.aClass74_2.method2073(6, Static106.aByteArray19, 0);
				@Pc(69) int local69 = (Static106.aByteArray19[5] & 0xFF) + ((Static106.aByteArray19[4] & 0xFF) << 8) + ((Static106.aByteArray19[3] & 0xFF) << 16);
				@Pc(92) int local92 = ((Static106.aByteArray19[1] & 0xFF) << 8) + (((Static106.aByteArray19[0] & 0xFF) << 16) + (Static106.aByteArray19[2] & 0xFF));
				if (local92 < 0 || local92 > this.anInt2101) {
					return null;
				} else if (local69 > 0 && this.aClass74_1.method2068() / 520L >= (long) local69) {
					@Pc(128) int local128 = 0;
					@Pc(130) int local130 = 0;
					@Pc(133) byte[] local133 = new byte[local92];
					while (local92 > local128) {
						if (local69 == 0) {
							return null;
						}
						this.aClass74_1.method2065((long) (local69 * 520));
						@Pc(156) int local156 = local92 - local128;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass74_1.method2073(local156 + 8, Static106.aByteArray19, 0);
						@Pc(184) int local184 = (Static106.aByteArray19[1] & 0xFF) + ((Static106.aByteArray19[0] & 0xFF) << 8);
						@Pc(198) int local198 = (Static106.aByteArray19[3] & 0xFF) + ((Static106.aByteArray19[2] & 0xFF) << 8);
						@Pc(221) int local221 = (Static106.aByteArray19[6] & 0xFF) + ((Static106.aByteArray19[4] & 0xFF) << 16) + ((Static106.aByteArray19[5] & 0xFF) << 8);
						@Pc(227) int local227 = Static106.aByteArray19[7] & 0xFF;
						if (arg0 == local184 && local130 == local198 && this.anInt2100 == local227) {
							if (local221 >= 0 && this.aClass74_1.method2068() / 520L >= (long) local221) {
								local69 = local221;
								for (@Pc(276) int local276 = 0; local276 < local156; local276++) {
									local133[local128++] = Static106.aByteArray19[local276 + 8];
								}
								local130++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local133;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2100;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)Z")
	public boolean method1492(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class74 local10 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			if (arg2 < 0 || this.anInt2101 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method1493(true, arg1, arg2, arg0);
			if (!local37) {
				local37 = this.method1493(false, arg1, arg2, arg0);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method1493(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class74 local8 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass74_2.method2068()) {
						return false;
					}
					this.aClass74_2.method2065((long) (arg1 * 6));
					this.aClass74_2.method2073(6, Static106.aByteArray19, 0);
					local22 = (Static106.aByteArray19[5] & 0xFF) + ((Static106.aByteArray19[4] & 0xFF) << 8) + ((Static106.aByteArray19[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass74_1.method2068() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass74_1.method2068() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static106.aByteArray19[5] = (byte) local22;
				Static106.aByteArray19[2] = (byte) arg2;
				Static106.aByteArray19[0] = (byte) (arg2 >> 16);
				Static106.aByteArray19[3] = (byte) (local22 >> 16);
				Static106.aByteArray19[4] = (byte) (local22 >> 8);
				Static106.aByteArray19[1] = (byte) (arg2 >> 8);
				@Pc(152) int local152 = 0;
				this.aClass74_2.method2065((long) (arg1 * 6));
				this.aClass74_2.method2064(Static106.aByteArray19, 0, 6);
				@Pc(169) int local169 = 0;
				while (local152 < arg2) {
					@Pc(173) int local173 = 0;
					@Pc(251) int local251;
					if (arg0) {
						this.aClass74_1.method2065((long) (local22 * 520));
						try {
							this.aClass74_1.method2073(8, Static106.aByteArray19, 0);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local173 = ((Static106.aByteArray19[5] & 0xFF) << 8) + ((Static106.aByteArray19[4] & 0xFF) << 16) + (Static106.aByteArray19[6] & 0xFF);
						@Pc(230) int local230 = (Static106.aByteArray19[3] & 0xFF) + ((Static106.aByteArray19[2] & 0xFF) << 8);
						@Pc(236) int local236 = Static106.aByteArray19[7] & 0xFF;
						local251 = ((Static106.aByteArray19[0] & 0xFF) << 8) + (Static106.aByteArray19[1] & 0xFF);
						if (local251 != arg1 || local230 != local169 || local236 != this.anInt2100) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass74_1.method2068() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						arg0 = false;
						local173 = (int) ((this.aClass74_1.method2068() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local22) {
							local173++;
						}
					}
					Static106.aByteArray19[1] = (byte) arg1;
					Static106.aByteArray19[2] = (byte) (local169 >> 8);
					Static106.aByteArray19[3] = (byte) local169;
					local169++;
					Static106.aByteArray19[7] = (byte) this.anInt2100;
					if (arg2 - local152 <= 512) {
						local173 = 0;
					}
					Static106.aByteArray19[0] = (byte) (arg1 >> 8);
					local251 = arg2 - local152;
					if (local251 > 512) {
						local251 = 512;
					}
					Static106.aByteArray19[5] = (byte) (local173 >> 8);
					Static106.aByteArray19[4] = (byte) (local173 >> 16);
					Static106.aByteArray19[6] = (byte) local173;
					this.aClass74_1.method2065((long) (local22 * 520));
					local22 = local173;
					this.aClass74_1.method2064(Static106.aByteArray19, 0, 8);
					this.aClass74_1.method2064(arg3, local152, local251);
					local152 += local251;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}
}
