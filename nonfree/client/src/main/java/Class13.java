import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class13 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!fp;")
	private Class77 aClass77_1 = null;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "Lclient!fp;")
	private Class77 aClass77_2 = null;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	private int anInt278 = 65000;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	private final int anInt272;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(ILclient!fp;Lclient!fp;I)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3) {
		this.aClass77_1 = arg1;
		this.anInt272 = arg0;
		this.anInt278 = arg3;
		this.aClass77_2 = arg2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BBZI)Z")
	private boolean method200(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class77 local6 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			try {
				@Pc(20) int local20;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass77_2.method1878()) {
						return false;
					}
					this.aClass77_2.method1871((long) (arg3 * 6));
					this.aClass77_2.method1873(0, Static286.aByteArray86, 6);
					local20 = (Static286.aByteArray86[5] & 0xFF) + ((Static286.aByteArray86[3] & 0xFF) << 16) + ((Static286.aByteArray86[4] & 0xFF) << 8);
					if (local20 <= 0 || (long) local20 > this.aClass77_1.method1878() / 520L) {
						return false;
					}
				} else {
					local20 = (int) ((this.aClass77_1.method1878() + 519L) / 520L);
					if (local20 == 0) {
						local20 = 1;
					}
				}
				Static286.aByteArray86[2] = (byte) arg0;
				Static286.aByteArray86[3] = (byte) (local20 >> 16);
				Static286.aByteArray86[5] = (byte) local20;
				Static286.aByteArray86[4] = (byte) (local20 >> 8);
				Static286.aByteArray86[0] = (byte) (arg0 >> 16);
				Static286.aByteArray86[1] = (byte) (arg0 >> 8);
				this.aClass77_2.method1871((long) (arg3 * 6));
				this.aClass77_2.method1875(Static286.aByteArray86, 0, 6);
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				while (arg0 > local161) {
					@Pc(166) int local166 = 0;
					@Pc(200) int local200;
					if (arg2) {
						this.aClass77_1.method1871((long) (local20 * 520));
						try {
							this.aClass77_1.method1873(0, Static286.aByteArray86, 8);
						} catch (@Pc(185) EOFException local185) {
							return true;
						}
						local200 = (Static286.aByteArray86[1] & 0xFF) + ((Static286.aByteArray86[0] & 0xFF) << 8);
						@Pc(214) int local214 = (Static286.aByteArray86[3] & 0xFF) + ((Static286.aByteArray86[2] & 0xFF) << 8);
						local166 = (Static286.aByteArray86[6] & 0xFF) + ((Static286.aByteArray86[5] & 0xFF) << 8) + ((Static286.aByteArray86[4] & 0xFF) << 16);
						@Pc(242) int local242 = Static286.aByteArray86[7] & 0xFF;
						if (local200 != arg3 || local214 != local163 || local242 != this.anInt272) {
							return false;
						}
						if (local166 < 0 || (long) local166 > this.aClass77_1.method1878() / 520L) {
							return false;
						}
					}
					if (local166 == 0) {
						local166 = (int) ((this.aClass77_1.method1878() + 519L) / 520L);
						arg2 = false;
						if (local166 == 0) {
							local166++;
						}
						if (local166 == local20) {
							local166++;
						}
					}
					Static286.aByteArray86[0] = (byte) (arg3 >> 8);
					if (arg0 - local161 <= 512) {
						local166 = 0;
					}
					Static286.aByteArray86[1] = (byte) arg3;
					Static286.aByteArray86[3] = (byte) local163;
					Static286.aByteArray86[2] = (byte) (local163 >> 8);
					Static286.aByteArray86[5] = (byte) (local166 >> 8);
					Static286.aByteArray86[6] = (byte) local166;
					Static286.aByteArray86[7] = (byte) this.anInt272;
					Static286.aByteArray86[4] = (byte) (local166 >> 16);
					this.aClass77_1.method1871((long) (local20 * 520));
					this.aClass77_1.method1875(Static286.aByteArray86, 0, 8);
					local200 = arg0 - local161;
					if (local200 > 512) {
						local200 = 512;
					}
					this.aClass77_1.method1875(arg1, local161, local200);
					local163++;
					local161 += local200;
					local20 = local166;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)[B")
	public byte[] method207(@OriginalArg(0) int arg0) {
		@Pc(16) Class77 local16 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass77_2.method1878()) {
					return null;
				}
				this.aClass77_2.method1871((long) (arg0 * 6));
				this.aClass77_2.method1873(0, Static286.aByteArray86, 6);
				@Pc(78) int local78 = (Static286.aByteArray86[2] & 0xFF) + ((Static286.aByteArray86[0] & 0xFF) << 16) + ((Static286.aByteArray86[1] & 0xFF) << 8);
				@Pc(100) int local100 = (Static286.aByteArray86[5] & 0xFF) + ((Static286.aByteArray86[4] & 0xFF) << 8) + ((Static286.aByteArray86[3] & 0xFF) << 16);
				if (local78 < 0 || this.anInt278 < local78) {
					return null;
				} else if (local100 > 0 && this.aClass77_1.method1878() / 520L >= (long) local100) {
					@Pc(137) byte[] local137 = new byte[local78];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local139 < local78) {
						if (local100 == 0) {
							return null;
						}
						this.aClass77_1.method1871((long) (local100 * 520));
						@Pc(166) int local166 = local78 - local139;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass77_1.method1873(0, Static286.aByteArray86, local166 + 8);
						@Pc(196) int local196 = (Static286.aByteArray86[1] & 0xFF) + ((Static286.aByteArray86[0] & 0xFF) << 8);
						@Pc(211) int local211 = ((Static286.aByteArray86[2] & 0xFF) << 8) + (Static286.aByteArray86[3] & 0xFF);
						@Pc(233) int local233 = (Static286.aByteArray86[6] & 0xFF) + ((Static286.aByteArray86[5] & 0xFF) << 8) + ((Static286.aByteArray86[4] & 0xFF) << 16);
						@Pc(239) int local239 = Static286.aByteArray86[7] & 0xFF;
						if (local196 == arg0 && local141 == local211 && this.anInt272 == local239) {
							if (local233 >= 0 && (long) local233 <= this.aClass77_1.method1878() / 520L) {
								for (@Pc(287) int local287 = 0; local287 < local166; local287++) {
									local137[local139++] = Static286.aByteArray86[local287 + 8];
								}
								local100 = local233;
								local141++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[BII)Z")
	public boolean method209(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class77 local6 = this.aClass77_1;
		synchronized (this.aClass77_1) {
			if (arg2 < 0 || arg2 > this.anInt278) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method200(arg2, arg0, true, arg1);
			if (!local29) {
				local29 = this.method200(arg2, arg0, false, arg1);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!an", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt272;
	}
}
