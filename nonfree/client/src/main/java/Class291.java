import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class291 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
	private int anInt8659 = 65000;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Lclient!oca;")
	private Class235 aClass235_8 = null;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lclient!oca;")
	private Class235 aClass235_7 = null;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	private final int anInt8666;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(ILclient!oca;Lclient!oca;I)V")
	public Class291(@OriginalArg(0) int arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) int arg3) {
		this.anInt8666 = arg0;
		this.aClass235_8 = arg1;
		this.aClass235_7 = arg2;
		this.anInt8659 = arg3;
	}

	@OriginalMember(owner = "client!rfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8666;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[B")
	public byte[] method7155(@OriginalArg(0) int arg0) {
		@Pc(8) Class235 local8 = this.aClass235_8;
		synchronized (this.aClass235_8) {
			try {
				if (this.aClass235_7.method6170() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass235_7.method6166((long) (arg0 * 6));
				this.aClass235_7.method6173(0, Static456.aByteArray75, 6);
				@Pc(70) int local70 = (Static456.aByteArray75[2] & 0xFF) + ((Static456.aByteArray75[0] & 0xFF) << 16) + ((Static456.aByteArray75[1] & 0xFF) << 8);
				@Pc(92) int local92 = (Static456.aByteArray75[5] & 0xFF) + ((Static456.aByteArray75[4] & 0xFF) << 8) + ((Static456.aByteArray75[3] & 0xFF) << 16);
				if (local70 < 0 || local70 > this.anInt8659) {
					return null;
				} else if (local92 > 0 && this.aClass235_8.method6170() / 520L >= (long) local92) {
					@Pc(128) byte[] local128 = new byte[local70];
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					while (local130 < local70) {
						if (local92 == 0) {
							return null;
						}
						this.aClass235_8.method6166((long) (local92 * 520));
						@Pc(158) int local158 = local70 - local130;
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass235_8.method6173(0, Static456.aByteArray75, local158 + 8);
						@Pc(187) int local187 = ((Static456.aByteArray75[0] & 0xFF) << 8) + (Static456.aByteArray75[1] & 0xFF);
						@Pc(202) int local202 = ((Static456.aByteArray75[2] & 0xFF) << 8) + (Static456.aByteArray75[3] & 0xFF);
						@Pc(225) int local225 = ((Static456.aByteArray75[5] & 0xFF) << 8) + (((Static456.aByteArray75[4] & 0xFF) << 16) + (Static456.aByteArray75[6] & 0xFF));
						@Pc(231) int local231 = Static456.aByteArray75[7] & 0xFF;
						if (local187 == arg0 && local132 == local202 && this.anInt8666 == local231) {
							if (local225 >= 0 && this.aClass235_8.method6170() / 520L >= (long) local225) {
								for (@Pc(278) int local278 = 0; local278 < local158; local278++) {
									local128[local130++] = Static456.aByteArray75[local278 + 8];
								}
								local92 = local225;
								local132++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[BI)Z")
	public boolean method7156(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class235 local6 = this.aClass235_8;
		synchronized (this.aClass235_8) {
			if (arg2 < 0 || this.anInt8659 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method7158(true, arg1, arg2, arg0);
			if (!local39) {
				local39 = this.method7158(false, arg1, arg2, arg0);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method7158(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class235 local8 = this.aClass235_8;
		synchronized (this.aClass235_8) {
			try {
				@Pc(69) int local69;
				if (arg0) {
					if (this.aClass235_7.method6170() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass235_7.method6166((long) (arg3 * 6));
					this.aClass235_7.method6173(0, Static456.aByteArray75, 6);
					local69 = ((Static456.aByteArray75[3] & 0xFF) << 16) + ((Static456.aByteArray75[4] & 0xFF) << 8) + (Static456.aByteArray75[5] & 0xFF);
					if (local69 <= 0 || this.aClass235_8.method6170() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass235_8.method6170() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static456.aByteArray75[3] = (byte) (local69 >> 16);
				Static456.aByteArray75[1] = (byte) (arg2 >> 8);
				Static456.aByteArray75[0] = (byte) (arg2 >> 16);
				Static456.aByteArray75[4] = (byte) (local69 >> 8);
				Static456.aByteArray75[5] = (byte) local69;
				Static456.aByteArray75[2] = (byte) arg2;
				this.aClass235_7.method6166((long) (arg3 * 6));
				this.aClass235_7.method6175(0, 6, Static456.aByteArray75);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (arg2 > local168) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass235_8.method6166((long) (local69 * 520));
						try {
							this.aClass235_8.method6173(0, Static456.aByteArray75, 8);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static456.aByteArray75[1] & 0xFF) + ((Static456.aByteArray75[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static456.aByteArray75[3] & 0xFF) + ((Static456.aByteArray75[2] & 0xFF) << 8);
						local174 = ((Static456.aByteArray75[4] & 0xFF) << 16) + (((Static456.aByteArray75[5] & 0xFF) << 8) + (Static456.aByteArray75[6] & 0xFF));
						@Pc(252) int local252 = Static456.aByteArray75[7] & 0xFF;
						if (arg3 != local209 || local170 != local223 || local252 != this.anInt8666) {
							return false;
						}
						if (local174 < 0 || this.aClass235_8.method6170() / 520L < (long) local174) {
							return false;
						}
					}
					if (local174 == 0) {
						arg0 = false;
						local174 = (int) ((this.aClass235_8.method6170() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local69) {
							local174++;
						}
					}
					if (arg2 - local168 <= 512) {
						local174 = 0;
					}
					Static456.aByteArray75[0] = (byte) (arg3 >> 8);
					Static456.aByteArray75[1] = (byte) arg3;
					Static456.aByteArray75[3] = (byte) local170;
					Static456.aByteArray75[2] = (byte) (local170 >> 8);
					Static456.aByteArray75[6] = (byte) local174;
					Static456.aByteArray75[4] = (byte) (local174 >> 16);
					Static456.aByteArray75[5] = (byte) (local174 >> 8);
					Static456.aByteArray75[7] = (byte) this.anInt8666;
					this.aClass235_8.method6166((long) (local69 * 520));
					this.aClass235_8.method6175(0, 8, Static456.aByteArray75);
					local209 = arg2 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass235_8.method6175(local168, local209, arg1);
					local170++;
					local168 += local209;
					local69 = local174;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}
}
