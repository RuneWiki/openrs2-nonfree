import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class53 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!we;")
	private Class78 aClass78_2 = null;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!we;")
	private Class78 aClass78_3 = null;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int anInt2146 = 65000;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	private final int anInt2148;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(ILclient!we;Lclient!we;I)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3) {
		this.anInt2146 = arg3;
		this.aClass78_3 = arg2;
		this.anInt2148 = arg0;
		this.aClass78_2 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[B")
	public byte[] method1442(@OriginalArg(1) int arg0) {
		@Pc(6) Class78 local6 = this.aClass78_2;
		synchronized (this.aClass78_2) {
			try {
				if (this.aClass78_3.method2178() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass78_3.method2185((long) (arg0 * 6));
				this.aClass78_3.method2176(6, 0, Static84.aByteArray30);
				@Pc(72) int local72 = ((Static84.aByteArray30[4] & 0xFF) << 8) + ((Static84.aByteArray30[3] & 0xFF) << 16) + (Static84.aByteArray30[5] & 0xFF);
				@Pc(94) int local94 = ((Static84.aByteArray30[0] & 0xFF) << 16) + ((Static84.aByteArray30[1] & 0xFF) << 8) + (Static84.aByteArray30[2] & 0xFF);
				if (local94 < 0 || local94 > this.anInt2146) {
					return null;
				} else if (local72 > 0 && (long) local72 <= this.aClass78_2.method2178() / 520L) {
					@Pc(133) byte[] local133 = new byte[local94];
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					label55: while (local135 < local94) {
						if (local72 == 0) {
							return null;
						}
						this.aClass78_2.method2185((long) (local72 * 520));
						@Pc(162) int local162 = local94 - local135;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass78_2.method2176(local162 + 8, 0, Static84.aByteArray30);
						@Pc(200) int local200 = ((Static84.aByteArray30[4] & 0xFF) << 16) - (-((Static84.aByteArray30[5] & 0xFF) << 8) - (Static84.aByteArray30[6] & 0xFF));
						@Pc(206) int local206 = Static84.aByteArray30[7] & 0xFF;
						@Pc(220) int local220 = (Static84.aByteArray30[1] & 0xFF) + ((Static84.aByteArray30[0] & 0xFF) << 8);
						@Pc(235) int local235 = ((Static84.aByteArray30[2] & 0xFF) << 8) + (Static84.aByteArray30[3] & 0xFF);
						if (arg0 == local220 && local235 == local137 && this.anInt2148 == local206) {
							if (local200 >= 0 && this.aClass78_2.method2178() / 520L >= (long) local200) {
								local137++;
								local72 = local200;
								@Pc(282) int local282 = 0;
								while (true) {
									if (local162 <= local282) {
										continue label55;
									}
									local133[local135++] = Static84.aByteArray30[local282 + 8];
									local282++;
								}
							}
							return null;
						}
						return null;
					}
					return local133;
				} else {
					return null;
				}
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BIB)Z")
	public boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class78 local6 = this.aClass78_2;
		synchronized (this.aClass78_2) {
			if (arg0 < 0 || arg0 > this.anInt2146) {
				throw new IllegalArgumentException();
			}
			@Pc(40) boolean local40 = this.method1447(arg1, arg2, arg0, true);
			if (!local40) {
				local40 = this.method1447(arg1, arg2, arg0, false);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2148;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method1447(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class78 local8 = this.aClass78_2;
		synchronized (this.aClass78_2) {
			try {
				@Pc(69) int local69;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass78_3.method2178()) {
						return false;
					}
					this.aClass78_3.method2185((long) (arg1 * 6));
					this.aClass78_3.method2176(6, 0, Static84.aByteArray30);
					local69 = (Static84.aByteArray30[5] & 0xFF) + ((Static84.aByteArray30[4] & 0xFF) << 8) + ((Static84.aByteArray30[3] & 0xFF) << 16);
					if (local69 <= 0 || (long) local69 > this.aClass78_2.method2178() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass78_2.method2178() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static84.aByteArray30[5] = (byte) local69;
				Static84.aByteArray30[2] = (byte) arg2;
				Static84.aByteArray30[0] = (byte) (arg2 >> 16);
				Static84.aByteArray30[1] = (byte) (arg2 >> 8);
				Static84.aByteArray30[4] = (byte) (local69 >> 8);
				@Pc(134) int local134 = 0;
				Static84.aByteArray30[3] = (byte) (local69 >> 16);
				this.aClass78_3.method2185((long) (arg1 * 6));
				this.aClass78_3.method2180(6, Static84.aByteArray30, 0);
				@Pc(169) int local169 = 0;
				while (arg2 > local134) {
					@Pc(173) int local173 = 0;
					@Pc(234) int local234;
					if (arg3) {
						this.aClass78_2.method2185((long) (local69 * 520));
						try {
							this.aClass78_2.method2176(8, 0, Static84.aByteArray30);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local173 = (Static84.aByteArray30[6] & 0xFF) + (((Static84.aByteArray30[4] & 0xFF) << 16) + ((Static84.aByteArray30[5] & 0xFF) << 8));
						local234 = ((Static84.aByteArray30[0] & 0xFF) << 8) + (Static84.aByteArray30[1] & 0xFF);
						@Pc(248) int local248 = (Static84.aByteArray30[3] & 0xFF) + ((Static84.aByteArray30[2] & 0xFF) << 8);
						@Pc(254) int local254 = Static84.aByteArray30[7] & 0xFF;
						if (arg1 != local234 || local169 != local248 || local254 != this.anInt2148) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass78_2.method2178() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass78_2.method2178() + 519L) / 520L);
						arg3 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local69) {
							local173++;
						}
					}
					Static84.aByteArray30[3] = (byte) local169;
					if (arg2 - local134 <= 512) {
						local173 = 0;
					}
					Static84.aByteArray30[4] = (byte) (local173 >> 16);
					Static84.aByteArray30[5] = (byte) (local173 >> 8);
					Static84.aByteArray30[1] = (byte) arg1;
					Static84.aByteArray30[0] = (byte) (arg1 >> 8);
					Static84.aByteArray30[6] = (byte) local173;
					Static84.aByteArray30[2] = (byte) (local169 >> 8);
					local234 = arg2 - local134;
					local169++;
					Static84.aByteArray30[7] = (byte) this.anInt2148;
					if (local234 > 512) {
						local234 = 512;
					}
					this.aClass78_2.method2185((long) (local69 * 520));
					this.aClass78_2.method2180(8, Static84.aByteArray30, 0);
					local69 = local173;
					this.aClass78_2.method2180(local234, arg0, local134);
					local134 += local234;
				}
				return true;
			} catch (@Pc(421) IOException local421) {
				return false;
			}
		}
	}
}
