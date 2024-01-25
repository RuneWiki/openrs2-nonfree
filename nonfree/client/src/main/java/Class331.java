import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class331 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	private int anInt9164 = 65000;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!uo;")
	private Class320 aClass320_6 = null;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!uo;")
	private Class320 aClass320_5 = null;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private final int anInt9168;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILclient!uo;Lclient!uo;I)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) int arg3) {
		this.aClass320_6 = arg2;
		this.anInt9164 = arg3;
		this.aClass320_5 = arg1;
		this.anInt9168 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[B")
	public byte[] method7493(@OriginalArg(1) int arg0) {
		@Pc(8) Class320 local8 = this.aClass320_5;
		synchronized (this.aClass320_5) {
			try {
				if (this.aClass320_6.method7333() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass320_6.method7334((long) (arg0 * 6));
				this.aClass320_6.method7339(6, Static96.aByteArray29, 0);
				@Pc(67) int local67 = (Static96.aByteArray29[2] & 0xFF) + ((Static96.aByteArray29[1] & 0xFF) << 8) + ((Static96.aByteArray29[0] & 0xFF) << 16);
				@Pc(89) int local89 = (Static96.aByteArray29[5] & 0xFF) + ((Static96.aByteArray29[3] & 0xFF) << 16) + ((Static96.aByteArray29[4] & 0xFF) << 8);
				if (local67 < 0 || this.anInt9164 < local67) {
					return null;
				} else if (local89 > 0 && (long) local89 <= this.aClass320_5.method7333() / 520L) {
					@Pc(138) byte[] local138 = new byte[local67];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					while (local140 < local67) {
						if (local89 == 0) {
							return null;
						}
						this.aClass320_5.method7334((long) (local89 * 520));
						@Pc(168) int local168 = local67 - local140;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass320_5.method7339(local168 + 8, Static96.aByteArray29, 0);
						@Pc(198) int local198 = (Static96.aByteArray29[1] & 0xFF) + ((Static96.aByteArray29[0] & 0xFF) << 8);
						@Pc(212) int local212 = (Static96.aByteArray29[3] & 0xFF) + ((Static96.aByteArray29[2] & 0xFF) << 8);
						@Pc(234) int local234 = (Static96.aByteArray29[6] & 0xFF) + ((Static96.aByteArray29[5] & 0xFF) << 8) + ((Static96.aByteArray29[4] & 0xFF) << 16);
						@Pc(240) int local240 = Static96.aByteArray29[7] & 0xFF;
						if (arg0 == local198 && local212 == local142 && this.anInt9168 == local240) {
							if (local234 >= 0 && (long) local234 <= this.aClass320_5.method7333() / 520L) {
								local89 = local234;
								for (@Pc(286) int local286 = 0; local286 < local168; local286++) {
									local138[local140++] = Static96.aByteArray29[local286 + 8];
								}
								local142++;
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
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BZII)Z")
	private boolean method7494(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class320 local8 = this.aClass320_5;
		synchronized (this.aClass320_5) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass320_6.method7333() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass320_6.method7334((long) (arg3 * 6));
					this.aClass320_6.method7339(6, Static96.aByteArray29, 0);
					local22 = ((Static96.aByteArray29[3] & 0xFF) << 16) - (-((Static96.aByteArray29[4] & 0xFF) << 8) - (Static96.aByteArray29[5] & 0xFF));
					if (local22 <= 0 || (long) local22 > this.aClass320_5.method7333() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass320_5.method7333() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static96.aByteArray29[3] = (byte) (local22 >> 16);
				Static96.aByteArray29[4] = (byte) (local22 >> 8);
				Static96.aByteArray29[0] = (byte) (arg0 >> 16);
				Static96.aByteArray29[2] = (byte) arg0;
				Static96.aByteArray29[5] = (byte) local22;
				Static96.aByteArray29[1] = (byte) (arg0 >> 8);
				this.aClass320_6.method7334((long) (arg3 * 6));
				this.aClass320_6.method7332(0, 6, Static96.aByteArray29);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (arg0 > local176) {
					@Pc(182) int local182 = 0;
					@Pc(218) int local218;
					if (arg2) {
						this.aClass320_5.method7334((long) (local22 * 520));
						try {
							this.aClass320_5.method7339(8, Static96.aByteArray29, 0);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local218 = ((Static96.aByteArray29[0] & 0xFF) << 8) + (Static96.aByteArray29[1] & 0xFF);
						local182 = ((Static96.aByteArray29[4] & 0xFF) << 16) + ((Static96.aByteArray29[5] & 0xFF) << 8) + (Static96.aByteArray29[6] & 0xFF);
						@Pc(256) int local256 = ((Static96.aByteArray29[2] & 0xFF) << 8) + (Static96.aByteArray29[3] & 0xFF);
						@Pc(262) int local262 = Static96.aByteArray29[7] & 0xFF;
						if (local218 != arg3 || local256 != local178 || this.anInt9168 != local262) {
							return false;
						}
						if (local182 < 0 || (long) local182 > this.aClass320_5.method7333() / 520L) {
							return false;
						}
					}
					if (local182 == 0) {
						arg2 = false;
						local182 = (int) ((this.aClass320_5.method7333() + 519L) / 520L);
						if (local182 == 0) {
							local182++;
						}
						if (local22 == local182) {
							local182++;
						}
					}
					Static96.aByteArray29[3] = (byte) local178;
					Static96.aByteArray29[1] = (byte) arg3;
					Static96.aByteArray29[2] = (byte) (local178 >> 8);
					Static96.aByteArray29[0] = (byte) (arg3 >> 8);
					if (arg0 - local176 <= 512) {
						local182 = 0;
					}
					Static96.aByteArray29[6] = (byte) local182;
					Static96.aByteArray29[4] = (byte) (local182 >> 16);
					Static96.aByteArray29[5] = (byte) (local182 >> 8);
					Static96.aByteArray29[7] = (byte) this.anInt9168;
					this.aClass320_5.method7334((long) (local22 * 520));
					this.aClass320_5.method7332(0, 8, Static96.aByteArray29);
					local218 = arg0 - local176;
					if (local218 > 512) {
						local218 = 512;
					}
					this.aClass320_5.method7332(local176, local218, arg1);
					local178++;
					local176 += local218;
					local22 = local182;
				}
				return true;
			} catch (@Pc(451) IOException local451) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt9168;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[BII)Z")
	public boolean method7496(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class320 local6 = this.aClass320_5;
		synchronized (this.aClass320_5) {
			if (arg1 < 0 || arg1 > this.anInt9164) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method7494(arg1, arg0, true, arg2);
			if (!local29) {
				local29 = this.method7494(arg1, arg0, false, arg2);
			}
			return local29;
		}
	}
}
