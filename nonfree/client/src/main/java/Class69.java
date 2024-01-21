import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class69 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!md;")
	private Class44 aClass44_2 = null;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	private int anInt3918 = 65000;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!md;")
	private Class44 aClass44_3 = null;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	private final int anInt3920;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILclient!md;Lclient!md;I)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3) {
		this.anInt3918 = arg3;
		this.aClass44_2 = arg2;
		this.anInt3920 = arg0;
		this.aClass44_3 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3920;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BIZII)Z")
	private boolean method2685(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class44 local8 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			try {
				@Pc(79) int local79;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass44_2.method2084()) {
						return false;
					}
					this.aClass44_2.method2082((long) (arg3 * 6));
					this.aClass44_2.method2077(0, 6, Static81.aByteArray29);
					local79 = (Static81.aByteArray29[5] & 0xFF) + ((Static81.aByteArray29[3] & 0xFF) << 16) + ((Static81.aByteArray29[4] & 0xFF) << 8);
					if (local79 <= 0 || (long) local79 > this.aClass44_3.method2084() / 520L) {
						return false;
					}
				} else {
					local79 = (int) ((this.aClass44_3.method2084() + 519L) / 520L);
					if (local79 == 0) {
						local79 = 1;
					}
				}
				Static81.aByteArray29[2] = (byte) arg1;
				Static81.aByteArray29[3] = (byte) (local79 >> 16);
				@Pc(129) int local129 = 0;
				Static81.aByteArray29[4] = (byte) (local79 >> 8);
				Static81.aByteArray29[1] = (byte) (arg1 >> 8);
				Static81.aByteArray29[0] = (byte) (arg1 >> 16);
				Static81.aByteArray29[5] = (byte) local79;
				this.aClass44_2.method2082((long) (arg3 * 6));
				this.aClass44_2.method2083(Static81.aByteArray29, 0, 6);
				@Pc(174) int local174 = 0;
				while (arg1 > local129) {
					@Pc(178) int local178 = 0;
					@Pc(237) int local237;
					if (arg2) {
						this.aClass44_3.method2082((long) (local79 * 520));
						try {
							this.aClass44_3.method2077(0, 8, Static81.aByteArray29);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local178 = ((Static81.aByteArray29[5] & 0xFF) << 8) + (Static81.aByteArray29[4] << 16 & 0xFF0000) + (Static81.aByteArray29[6] & 0xFF);
						local237 = ((Static81.aByteArray29[0] & 0xFF) << 8) + (Static81.aByteArray29[1] & 0xFF);
						@Pc(251) int local251 = (Static81.aByteArray29[3] & 0xFF) + ((Static81.aByteArray29[2] & 0xFF) << 8);
						@Pc(257) int local257 = Static81.aByteArray29[7] & 0xFF;
						if (local237 != arg3 || local174 != local251 || local257 != this.anInt3920) {
							return false;
						}
						if (local178 < 0 || (long) local178 > this.aClass44_3.method2084() / 520L) {
							return false;
						}
					}
					local237 = arg1 - local129;
					if (local178 == 0) {
						arg2 = false;
						local178 = (int) ((this.aClass44_3.method2084() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local79) {
							local178++;
						}
					}
					Static81.aByteArray29[7] = (byte) this.anInt3920;
					Static81.aByteArray29[0] = (byte) (arg3 >> 8);
					Static81.aByteArray29[2] = (byte) (local174 >> 8);
					Static81.aByteArray29[3] = (byte) local174;
					if (arg1 - local129 <= 512) {
						local178 = 0;
					}
					Static81.aByteArray29[4] = (byte) (local178 >> 16);
					Static81.aByteArray29[1] = (byte) arg3;
					Static81.aByteArray29[6] = (byte) local178;
					if (local237 > 512) {
						local237 = 512;
					}
					Static81.aByteArray29[5] = (byte) (local178 >> 8);
					local174++;
					this.aClass44_3.method2082((long) (local79 * 520));
					this.aClass44_3.method2083(Static81.aByteArray29, 0, 8);
					local79 = local178;
					this.aClass44_3.method2083(arg0, local129, local237);
					local129 += local237;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[B")
	public byte[] method2687(@OriginalArg(0) int arg0) {
		@Pc(8) Class44 local8 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			try {
				if (this.aClass44_2.method2084() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass44_2.method2082((long) (arg0 * 6));
				this.aClass44_2.method2077(0, 6, Static81.aByteArray29);
				@Pc(75) int local75 = (Static81.aByteArray29[2] & 0xFF) + ((Static81.aByteArray29[0] & 0xFF) << 16) + ((Static81.aByteArray29[1] & 0xFF) << 8);
				@Pc(97) int local97 = (Static81.aByteArray29[5] & 0xFF) + ((Static81.aByteArray29[3] & 0xFF) << 16) + ((Static81.aByteArray29[4] & 0xFF) << 8);
				if (local75 < 0 || this.anInt3918 < local75) {
					return null;
				} else if (local97 > 0 && (long) local97 <= this.aClass44_3.method2084() / 520L) {
					@Pc(140) int local140 = 0;
					@Pc(143) byte[] local143 = new byte[local75];
					@Pc(145) int local145 = 0;
					while (local75 > local140) {
						if (local97 == 0) {
							return null;
						}
						this.aClass44_3.method2082((long) (local97 * 520));
						@Pc(167) int local167 = local75 - local140;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass44_3.method2077(0, local167 + 8, Static81.aByteArray29);
						@Pc(195) int local195 = ((Static81.aByteArray29[0] & 0xFF) << 8) + (Static81.aByteArray29[1] & 0xFF);
						@Pc(209) int local209 = ((Static81.aByteArray29[2] & 0xFF) << 8) + (Static81.aByteArray29[3] & 0xFF);
						@Pc(231) int local231 = (Static81.aByteArray29[6] & 0xFF) + ((Static81.aByteArray29[5] & 0xFF) << 8) + ((Static81.aByteArray29[4] & 0xFF) << 16);
						@Pc(237) int local237 = Static81.aByteArray29[7] & 0xFF;
						if (arg0 == local195 && local209 == local145 && local237 == this.anInt3920) {
							if (local231 >= 0 && (long) local231 <= this.aClass44_3.method2084() / 520L) {
								local97 = local231;
								for (@Pc(294) int local294 = 0; local294 < local167; local294++) {
									local143[local140++] = Static81.aByteArray29[local294 + 8];
								}
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local143;
				} else {
					return null;
				}
			} catch (@Pc(324) IOException local324) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI)Z")
	public boolean method2688(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class44 local6 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			if (arg2 < 0 || this.anInt3918 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method2685(arg1, arg2, true, arg0);
			if (!local31) {
				local31 = this.method2685(arg1, arg2, false, arg0);
			}
			return local31;
		}
	}
}
