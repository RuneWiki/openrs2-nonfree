import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class22 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!ua;")
	private Class72 aClass72_1 = null;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	private int anInt750 = 65000;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!ua;")
	private Class72 aClass72_2 = null;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	private final int anInt748;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILclient!ua;Lclient!ua;I)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3) {
		this.anInt750 = arg3;
		this.aClass72_1 = arg1;
		this.anInt748 = arg0;
		this.aClass72_2 = arg2;
	}

	@OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt748;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIII)Z")
	public boolean method558(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class72 local11 = this.aClass72_1;
		synchronized (this.aClass72_1) {
			if (arg1 < 0 || this.anInt750 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method562(true, arg2, arg0, arg1);
			if (!local37) {
				local37 = this.method562(false, arg2, arg0, arg1);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[B")
	public byte[] method560(@OriginalArg(0) int arg0) {
		@Pc(8) Class72 local8 = this.aClass72_1;
		synchronized (this.aClass72_1) {
			try {
				if (this.aClass72_2.method1940() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass72_2.method1942((long) (arg0 * 6));
				this.aClass72_2.method1941(Static17.aByteArray5, 6, 0);
				@Pc(69) int local69 = (Static17.aByteArray5[5] & 0xFF) + ((Static17.aByteArray5[4] & 0xFF) << 8) + ((Static17.aByteArray5[3] & 0xFF) << 16);
				@Pc(92) int local92 = ((Static17.aByteArray5[0] & 0xFF) << 16) + (((Static17.aByteArray5[1] & 0xFF) << 8) + (Static17.aByteArray5[2] & 0xFF));
				if (local92 < 0 || this.anInt750 < local92) {
					return null;
				} else if (local69 > 0 && (long) local69 <= this.aClass72_1.method1940() / 520L) {
					@Pc(136) byte[] local136 = new byte[local92];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					label55: while (local140 < local92) {
						if (local69 == 0) {
							return null;
						}
						this.aClass72_1.method1942((long) (local69 * 520));
						@Pc(163) int local163 = local92 - local140;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass72_1.method1941(Static17.aByteArray5, local163 + 8, 0);
						@Pc(192) int local192 = ((Static17.aByteArray5[0] & 0xFF) << 8) + (Static17.aByteArray5[1] & 0xFF);
						@Pc(214) int local214 = (Static17.aByteArray5[6] & 0xFF) + ((Static17.aByteArray5[4] & 0xFF) << 16) + ((Static17.aByteArray5[5] & 0xFF) << 8);
						@Pc(220) int local220 = Static17.aByteArray5[7] & 0xFF;
						@Pc(234) int local234 = (Static17.aByteArray5[3] & 0xFF) + ((Static17.aByteArray5[2] & 0xFF) << 8);
						if (local192 == arg0 && local234 == local138 && local220 == this.anInt748) {
							if (local214 >= 0 && this.aClass72_1.method1940() / 520L >= (long) local214) {
								local69 = local214;
								local138++;
								@Pc(280) int local280 = 0;
								while (true) {
									if (local163 <= local280) {
										continue label55;
									}
									local136[local140++] = Static17.aByteArray5[local280 + 8];
									local280++;
								}
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method562(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class72 local8 = this.aClass72_1;
		synchronized (this.aClass72_1) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass72_2.method1940()) {
						return false;
					}
					this.aClass72_2.method1942((long) (arg1 * 6));
					this.aClass72_2.method1941(Static17.aByteArray5, 6, 0);
					local22 = (Static17.aByteArray5[5] & 0xFF) + ((Static17.aByteArray5[4] & 0xFF) << 8) + ((Static17.aByteArray5[3] & 0xFF) << 16);
					if (local22 <= 0 || (long) local22 > this.aClass72_1.method1940() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass72_1.method1940() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static17.aByteArray5[0] = (byte) (arg3 >> 16);
				Static17.aByteArray5[3] = (byte) (local22 >> 16);
				Static17.aByteArray5[1] = (byte) (arg3 >> 8);
				Static17.aByteArray5[4] = (byte) (local22 >> 8);
				Static17.aByteArray5[5] = (byte) local22;
				@Pc(145) int local145 = 0;
				Static17.aByteArray5[2] = (byte) arg3;
				this.aClass72_2.method1942((long) (arg1 * 6));
				this.aClass72_2.method1935(0, 6, Static17.aByteArray5);
				@Pc(167) int local167 = 0;
				while (local145 < arg3) {
					@Pc(171) int local171 = 0;
					@Pc(243) int local243;
					if (arg0) {
						this.aClass72_1.method1942((long) (local22 * 520));
						try {
							this.aClass72_1.method1941(Static17.aByteArray5, 8, 0);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local171 = (Static17.aByteArray5[6] & 0xFF) + ((Static17.aByteArray5[5] & 0xFF) << 8) + ((Static17.aByteArray5[4] & 0xFF) << 16);
						@Pc(229) int local229 = ((Static17.aByteArray5[2] & 0xFF) << 8) + (Static17.aByteArray5[3] & 0xFF);
						local243 = (Static17.aByteArray5[1] & 0xFF) + ((Static17.aByteArray5[0] & 0xFF) << 8);
						@Pc(249) int local249 = Static17.aByteArray5[7] & 0xFF;
						if (local243 != arg1 || local229 != local167 || local249 != this.anInt748) {
							return false;
						}
						if (local171 < 0 || this.aClass72_1.method1940() / 520L < (long) local171) {
							return false;
						}
					}
					if (local171 == 0) {
						arg0 = false;
						local171 = (int) ((this.aClass72_1.method1940() + 519L) / 520L);
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local22) {
							local171++;
						}
					}
					Static17.aByteArray5[0] = (byte) (arg1 >> 8);
					Static17.aByteArray5[2] = (byte) (local167 >> 8);
					if (arg3 - local145 <= 512) {
						local171 = 0;
					}
					Static17.aByteArray5[3] = (byte) local167;
					Static17.aByteArray5[4] = (byte) (local171 >> 16);
					Static17.aByteArray5[7] = (byte) this.anInt748;
					Static17.aByteArray5[1] = (byte) arg1;
					local243 = arg3 - local145;
					Static17.aByteArray5[5] = (byte) (local171 >> 8);
					Static17.aByteArray5[6] = (byte) local171;
					if (local243 > 512) {
						local243 = 512;
					}
					local167++;
					this.aClass72_1.method1942((long) (local22 * 520));
					local22 = local171;
					this.aClass72_1.method1935(0, 8, Static17.aByteArray5);
					this.aClass72_1.method1935(local145, local243, arg2);
					local145 += local243;
				}
				return true;
			} catch (@Pc(423) IOException local423) {
				return false;
			}
		}
	}
}
