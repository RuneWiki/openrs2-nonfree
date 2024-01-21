import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class54 {

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!hb;")
	private Class29 aClass29_2 = null;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!hb;")
	private Class29 aClass29_3 = null;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	private int anInt1954 = 65000;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private final int anInt1947;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(ILclient!hb;Lclient!hb;I)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) int arg3) {
		this.anInt1947 = arg0;
		this.aClass29_3 = arg1;
		this.anInt1954 = arg3;
		this.aClass29_2 = arg2;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[BII)Z")
	public boolean method1451(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class29 local11 = this.aClass29_3;
		synchronized (this.aClass29_3) {
			if (arg0 < 0 || this.anInt1954 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method1454(arg1, true, arg2, arg0);
			if (!local34) {
				local34 = this.method1454(arg1, false, arg2, arg0);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([BZIIB)Z")
	private boolean method1454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class29 local8 = this.aClass29_3;
		synchronized (this.aClass29_3) {
			try {
				@Pc(68) int local68;
				if (arg1) {
					if (this.aClass29_2.method808() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass29_2.method816((long) (arg2 * 6));
					this.aClass29_2.method814(0, 6, Static15.aByteArray126);
					local68 = ((Static15.aByteArray126[3] & 0xFF) << 16) + (((Static15.aByteArray126[4] & 0xFF) << 8) + (Static15.aByteArray126[5] & 0xFF));
					if (local68 <= 0 || this.aClass29_3.method808() / 520L < (long) local68) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass29_3.method808() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static15.aByteArray126[5] = (byte) local68;
				Static15.aByteArray126[1] = (byte) (arg3 >> 8);
				@Pc(129) int local129 = 0;
				Static15.aByteArray126[4] = (byte) (local68 >> 8);
				Static15.aByteArray126[0] = (byte) (arg3 >> 16);
				@Pc(145) int local145 = 0;
				Static15.aByteArray126[3] = (byte) (local68 >> 16);
				Static15.aByteArray126[2] = (byte) arg3;
				this.aClass29_2.method816((long) (arg2 * 6));
				this.aClass29_2.method809(0, 6, Static15.aByteArray126);
				while (arg3 > local129) {
					@Pc(176) int local176 = 0;
					@Pc(233) int local233;
					if (arg1) {
						this.aClass29_3.method816((long) (local68 * 520));
						try {
							this.aClass29_3.method814(0, 8, Static15.aByteArray126);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local176 = ((Static15.aByteArray126[5] & 0xFF) << 8) + ((Static15.aByteArray126[4] & 0xFF) << 16) + (Static15.aByteArray126[6] & 0xFF);
						local233 = (Static15.aByteArray126[1] & 0xFF) + ((Static15.aByteArray126[0] & 0xFF) << 8);
						@Pc(247) int local247 = (Static15.aByteArray126[3] & 0xFF) + ((Static15.aByteArray126[2] & 0xFF) << 8);
						@Pc(253) int local253 = Static15.aByteArray126[7] & 0xFF;
						if (local233 != arg2 || local247 != local145 || local253 != this.anInt1947) {
							return false;
						}
						if (local176 < 0 || (long) local176 > this.aClass29_3.method808() / 520L) {
							return false;
						}
					}
					local233 = arg3 - local129;
					if (local176 == 0) {
						arg1 = false;
						local176 = (int) ((this.aClass29_3.method808() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local176 == local68) {
							local176++;
						}
					}
					Static15.aByteArray126[3] = (byte) local145;
					if (local233 > 512) {
						local233 = 512;
					}
					Static15.aByteArray126[1] = (byte) arg2;
					Static15.aByteArray126[0] = (byte) (arg2 >> 8);
					if (arg3 - local129 <= 512) {
						local176 = 0;
					}
					Static15.aByteArray126[5] = (byte) (local176 >> 8);
					Static15.aByteArray126[2] = (byte) (local145 >> 8);
					Static15.aByteArray126[4] = (byte) (local176 >> 16);
					Static15.aByteArray126[6] = (byte) local176;
					Static15.aByteArray126[7] = (byte) this.anInt1947;
					this.aClass29_3.method816((long) (local68 * 520));
					local145++;
					this.aClass29_3.method809(0, 8, Static15.aByteArray126);
					this.aClass29_3.method809(local129, local233, arg0);
					local68 = local176;
					local129 += local233;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1947;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[B")
	public byte[] method1457(@OriginalArg(1) int arg0) {
		@Pc(8) Class29 local8 = this.aClass29_3;
		synchronized (this.aClass29_3) {
			try {
				if (this.aClass29_2.method808() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass29_2.method816((long) (arg0 * 6));
				this.aClass29_2.method814(0, 6, Static15.aByteArray126);
				@Pc(70) int local70 = ((Static15.aByteArray126[1] & 0xFF) << 8) + (((Static15.aByteArray126[0] & 0xFF) << 16) + (Static15.aByteArray126[2] & 0xFF));
				@Pc(92) int local92 = (Static15.aByteArray126[5] & 0xFF) + ((Static15.aByteArray126[4] & 0xFF) << 8) + ((Static15.aByteArray126[3] & 0xFF) << 16);
				if (local70 < 0 || this.anInt1954 < local70) {
					return null;
				} else if (local92 > 0 && this.aClass29_3.method808() / 520L >= (long) local92) {
					@Pc(145) byte[] local145 = new byte[local70];
					@Pc(147) int local147 = 0;
					@Pc(149) int local149 = 0;
					while (local70 > local147) {
						if (local92 == 0) {
							return null;
						}
						this.aClass29_3.method816((long) (local92 * 520));
						@Pc(175) int local175 = local70 - local147;
						if (local175 > 512) {
							local175 = 512;
						}
						this.aClass29_3.method814(0, local175 + 8, Static15.aByteArray126);
						@Pc(211) int local211 = ((Static15.aByteArray126[4] & 0xFF) << 16) + (Static15.aByteArray126[5] << 8 & 0xFF00) + (Static15.aByteArray126[6] & 0xFF);
						@Pc(226) int local226 = ((Static15.aByteArray126[2] & 0xFF) << 8) + (Static15.aByteArray126[3] & 0xFF);
						@Pc(232) int local232 = Static15.aByteArray126[7] & 0xFF;
						@Pc(246) int local246 = (Static15.aByteArray126[1] & 0xFF) + ((Static15.aByteArray126[0] & 0xFF) << 8);
						if (arg0 == local246 && local226 == local149 && this.anInt1947 == local232) {
							if (local211 >= 0 && (long) local211 <= this.aClass29_3.method808() / 520L) {
								local149++;
								for (@Pc(295) int local295 = 0; local295 < local175; local295++) {
									local145[local147++] = Static15.aByteArray126[local295 + 8];
								}
								local92 = local211;
								continue;
							}
							return null;
						}
						return null;
					}
					return local145;
				} else {
					return null;
				}
			} catch (@Pc(326) IOException local326) {
				return null;
			}
		}
	}
}
