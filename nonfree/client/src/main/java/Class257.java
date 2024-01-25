import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class257 {

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Lclient!lt;")
	private Class179 aClass179_29 = null;

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "Lclient!lt;")
	private Class179 aClass179_30 = null;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
	private int anInt7905 = 65000;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
	private final int anInt7903;

	static {
		new Class202("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(ILclient!lt;Lclient!lt;I)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class179 arg2, @OriginalArg(3) int arg3) {
		this.aClass179_29 = arg2;
		this.anInt7905 = arg3;
		this.aClass179_30 = arg1;
		this.anInt7903 = arg0;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)[B")
	public byte[] method6610(@OriginalArg(1) int arg0) {
		@Pc(8) Class179 local8 = this.aClass179_30;
		synchronized (this.aClass179_30) {
			try {
				if (this.aClass179_29.method4525() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass179_29.method4528((long) (arg0 * 6));
				this.aClass179_29.method4526(Static81.aByteArray41, 6, 0);
				@Pc(66) int local66 = ((Static81.aByteArray41[0] & 0xFF) << 16) + ((Static81.aByteArray41[1] & 0xFF) << 8) + (Static81.aByteArray41[2] & 0xFF);
				@Pc(88) int local88 = (Static81.aByteArray41[5] & 0xFF) + ((Static81.aByteArray41[3] & 0xFF) << 16) + ((Static81.aByteArray41[4] & 0xFF) << 8);
				if (local66 < 0 || this.anInt7905 < local66) {
					return null;
				} else if (local88 > 0 && this.aClass179_30.method4525() / 520L >= (long) local88) {
					@Pc(129) byte[] local129 = new byte[local66];
					@Pc(131) int local131 = 0;
					@Pc(133) int local133 = 0;
					label55: while (local66 > local131) {
						if (local88 == 0) {
							return null;
						}
						this.aClass179_30.method4528((long) (local88 * 520));
						@Pc(165) int local165 = local66 - local131;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass179_30.method4526(Static81.aByteArray41, local165 + 8, 0);
						@Pc(193) int local193 = (Static81.aByteArray41[1] & 0xFF) + ((Static81.aByteArray41[0] & 0xFF) << 8);
						@Pc(208) int local208 = ((Static81.aByteArray41[2] & 0xFF) << 8) + (Static81.aByteArray41[3] & 0xFF);
						@Pc(230) int local230 = ((Static81.aByteArray41[5] & 0xFF) << 8) + (Static81.aByteArray41[4] << 16 & 0xFF0000) + (Static81.aByteArray41[6] & 0xFF);
						@Pc(236) int local236 = Static81.aByteArray41[7] & 0xFF;
						if (arg0 == local193 && local208 == local133 && local236 == this.anInt7903) {
							if (local230 >= 0 && (long) local230 <= this.aClass179_30.method4525() / 520L) {
								local88 = local230;
								local133++;
								@Pc(290) int local290 = 0;
								while (true) {
									if (local290 >= local165) {
										continue label55;
									}
									local129[local131++] = Static81.aByteArray41[local290 + 8];
									local290++;
								}
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(319) IOException local319) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([BZIIZ)Z")
	private boolean method6612(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class179 local8 = this.aClass179_30;
		synchronized (this.aClass179_30) {
			try {
				@Pc(67) int local67;
				if (arg1) {
					if ((long) (arg2 * 6 + 6) > this.aClass179_29.method4525()) {
						return false;
					}
					this.aClass179_29.method4528((long) (arg2 * 6));
					this.aClass179_29.method4526(Static81.aByteArray41, 6, 0);
					local67 = (Static81.aByteArray41[5] & 0xFF) + ((Static81.aByteArray41[4] & 0xFF) << 8) + ((Static81.aByteArray41[3] & 0xFF) << 16);
					if (local67 <= 0 || this.aClass179_30.method4525() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass179_30.method4525() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static81.aByteArray41[5] = (byte) local67;
				Static81.aByteArray41[3] = (byte) (local67 >> 16);
				Static81.aByteArray41[1] = (byte) (arg3 >> 8);
				Static81.aByteArray41[2] = (byte) arg3;
				Static81.aByteArray41[4] = (byte) (local67 >> 8);
				Static81.aByteArray41[0] = (byte) (arg3 >> 16);
				this.aClass179_29.method4528((long) (arg2 * 6));
				this.aClass179_29.method4520(6, Static81.aByteArray41, 0);
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				while (arg3 > local163) {
					@Pc(169) int local169 = 0;
					@Pc(204) int local204;
					if (arg1) {
						this.aClass179_30.method4528((long) (local67 * 520));
						try {
							this.aClass179_30.method4526(Static81.aByteArray41, 8, 0);
						} catch (@Pc(188) EOFException local188) {
							return true;
						}
						local204 = (Static81.aByteArray41[1] & 0xFF) + ((Static81.aByteArray41[0] & 0xFF) << 8);
						@Pc(218) int local218 = (Static81.aByteArray41[3] & 0xFF) + ((Static81.aByteArray41[2] & 0xFF) << 8);
						local169 = (Static81.aByteArray41[6] & 0xFF) + ((Static81.aByteArray41[4] & 0xFF) << 16) + ((Static81.aByteArray41[5] & 0xFF) << 8);
						@Pc(246) int local246 = Static81.aByteArray41[7] & 0xFF;
						if (arg2 != local204 || local218 != local165 || local246 != this.anInt7903) {
							return false;
						}
						if (local169 < 0 || this.aClass179_30.method4525() / 520L < (long) local169) {
							return false;
						}
					}
					if (local169 == 0) {
						local169 = (int) ((this.aClass179_30.method4525() + 519L) / 520L);
						arg1 = false;
						if (local169 == 0) {
							local169++;
						}
						if (local67 == local169) {
							local169++;
						}
					}
					Static81.aByteArray41[2] = (byte) (local165 >> 8);
					Static81.aByteArray41[0] = (byte) (arg2 >> 8);
					Static81.aByteArray41[1] = (byte) arg2;
					if (arg3 - local163 <= 512) {
						local169 = 0;
					}
					Static81.aByteArray41[3] = (byte) local165;
					Static81.aByteArray41[6] = (byte) local169;
					Static81.aByteArray41[7] = (byte) this.anInt7903;
					Static81.aByteArray41[5] = (byte) (local169 >> 8);
					Static81.aByteArray41[4] = (byte) (local169 >> 16);
					this.aClass179_30.method4528((long) (local67 * 520));
					this.aClass179_30.method4520(8, Static81.aByteArray41, 0);
					local204 = arg3 - local163;
					if (local204 > 512) {
						local204 = 512;
					}
					this.aClass179_30.method4520(local204, arg0, local163);
					local165++;
					local163 += local204;
					local67 = local169;
				}
				return true;
			} catch (@Pc(423) IOException local423) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[B)Z")
	public boolean method6613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class179 local6 = this.aClass179_30;
		synchronized (this.aClass179_30) {
			if (arg0 < 0 || this.anInt7905 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method6612(arg2, true, arg1, arg0);
			if (!local39) {
				local39 = this.method6612(arg2, false, arg1, arg0);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7903;
	}
}
