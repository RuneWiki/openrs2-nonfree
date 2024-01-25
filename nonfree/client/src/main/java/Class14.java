import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class14 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Lclient!lp;")
	private Class155 aClass155_2 = null;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Lclient!lp;")
	private Class155 aClass155_1 = null;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	private int anInt288 = 65000;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	private final int anInt283;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(ILclient!lp;Lclient!lp;I)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3) {
		this.anInt288 = arg3;
		this.aClass155_2 = arg2;
		this.anInt283 = arg0;
		this.aClass155_1 = arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[BZI)Z")
	private boolean method249(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class155 local8 = this.aClass155_1;
		synchronized (this.aClass155_1) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass155_2.method3600() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass155_2.method3607((long) (arg0 * 6));
					this.aClass155_2.method3606(6, 0, Static384.aByteArray80);
					local22 = ((Static384.aByteArray80[3] & 0xFF) << 16) + (Static384.aByteArray80[4] << 8 & 0xFF00) + (Static384.aByteArray80[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass155_1.method3600() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass155_1.method3600() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static384.aByteArray80[5] = (byte) local22;
				Static384.aByteArray80[0] = (byte) (arg3 >> 16);
				Static384.aByteArray80[4] = (byte) (local22 >> 8);
				Static384.aByteArray80[2] = (byte) arg3;
				Static384.aByteArray80[1] = (byte) (arg3 >> 8);
				Static384.aByteArray80[3] = (byte) (local22 >> 16);
				this.aClass155_2.method3607((long) (arg0 * 6));
				this.aClass155_2.method3598(6, Static384.aByteArray80, 0);
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				while (arg3 > local161) {
					@Pc(167) int local167 = 0;
					@Pc(202) int local202;
					if (arg2) {
						this.aClass155_1.method3607((long) (local22 * 520));
						try {
							this.aClass155_1.method3606(8, 0, Static384.aByteArray80);
						} catch (@Pc(186) EOFException local186) {
							return true;
						}
						local202 = (Static384.aByteArray80[1] & 0xFF) + ((Static384.aByteArray80[0] & 0xFF) << 8);
						@Pc(216) int local216 = ((Static384.aByteArray80[2] & 0xFF) << 8) + (Static384.aByteArray80[3] & 0xFF);
						local167 = ((Static384.aByteArray80[4] & 0xFF) << 16) + ((Static384.aByteArray80[5] & 0xFF) << 8) + (Static384.aByteArray80[6] & 0xFF);
						@Pc(245) int local245 = Static384.aByteArray80[7] & 0xFF;
						if (arg0 != local202 || local163 != local216 || local245 != this.anInt283) {
							return false;
						}
						if (local167 < 0 || (long) local167 > this.aClass155_1.method3600() / 520L) {
							return false;
						}
					}
					if (local167 == 0) {
						local167 = (int) ((this.aClass155_1.method3600() + 519L) / 520L);
						arg2 = false;
						if (local167 == 0) {
							local167++;
						}
						if (local22 == local167) {
							local167++;
						}
					}
					Static384.aByteArray80[1] = (byte) arg0;
					Static384.aByteArray80[0] = (byte) (arg0 >> 8);
					Static384.aByteArray80[3] = (byte) local163;
					Static384.aByteArray80[2] = (byte) (local163 >> 8);
					if (arg3 - local161 <= 512) {
						local167 = 0;
					}
					Static384.aByteArray80[6] = (byte) local167;
					Static384.aByteArray80[5] = (byte) (local167 >> 8);
					Static384.aByteArray80[7] = (byte) this.anInt283;
					Static384.aByteArray80[4] = (byte) (local167 >> 16);
					this.aClass155_1.method3607((long) (local22 * 520));
					this.aClass155_1.method3598(8, Static384.aByteArray80, 0);
					local202 = arg3 - local161;
					if (local202 > 512) {
						local202 = 512;
					}
					this.aClass155_1.method3598(local202, arg1, local161);
					local22 = local167;
					local163++;
					local161 += local202;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[B")
	public byte[] method250(@OriginalArg(0) int arg0) {
		@Pc(8) Class155 local8 = this.aClass155_1;
		synchronized (this.aClass155_1) {
			try {
				if (this.aClass155_2.method3600() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass155_2.method3607((long) (arg0 * 6));
				this.aClass155_2.method3606(6, 0, Static384.aByteArray80);
				@Pc(79) int local79 = (Static384.aByteArray80[2] & 0xFF) + (((Static384.aByteArray80[0] & 0xFF) << 16) + ((Static384.aByteArray80[1] & 0xFF) << 8));
				@Pc(102) int local102 = ((Static384.aByteArray80[3] & 0xFF) << 16) + ((Static384.aByteArray80[4] & 0xFF) << 8) + (Static384.aByteArray80[5] & 0xFF);
				if (local79 < 0 || local79 > this.anInt288) {
					return null;
				} else if (local102 > 0 && this.aClass155_1.method3600() / 520L >= (long) local102) {
					@Pc(142) byte[] local142 = new byte[local79];
					@Pc(144) int local144 = 0;
					@Pc(146) int local146 = 0;
					while (local144 < local79) {
						if (local102 == 0) {
							return null;
						}
						this.aClass155_1.method3607((long) (local102 * 520));
						@Pc(168) int local168 = local79 - local144;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass155_1.method3606(local168 + 8, 0, Static384.aByteArray80);
						@Pc(198) int local198 = ((Static384.aByteArray80[0] & 0xFF) << 8) + (Static384.aByteArray80[1] & 0xFF);
						@Pc(212) int local212 = (Static384.aByteArray80[3] & 0xFF) + ((Static384.aByteArray80[2] & 0xFF) << 8);
						@Pc(235) int local235 = ((Static384.aByteArray80[5] & 0xFF) << 8) + ((Static384.aByteArray80[4] & 0xFF) << 16) + (Static384.aByteArray80[6] & 0xFF);
						@Pc(241) int local241 = Static384.aByteArray80[7] & 0xFF;
						if (arg0 == local198 && local212 == local146 && this.anInt283 == local241) {
							if (local235 >= 0 && this.aClass155_1.method3600() / 520L >= (long) local235) {
								for (@Pc(284) int local284 = 0; local284 < local168; local284++) {
									local142[local144++] = Static384.aByteArray80[local284 + 8];
								}
								local146++;
								local102 = local235;
								continue;
							}
							return null;
						}
						return null;
					}
					return local142;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt283;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ[BI)Z")
	public boolean method252(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class155 local6 = this.aClass155_1;
		synchronized (this.aClass155_1) {
			if (arg2 < 0 || arg2 > this.anInt288) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method249(arg0, arg1, true, arg2);
			if (!local35) {
				local35 = this.method249(arg0, arg1, false, arg2);
			}
			return local35;
		}
	}
}
