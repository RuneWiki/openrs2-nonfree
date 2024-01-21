import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class8 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	private int anInt377 = 65000;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!o;")
	private Class67 aClass67_3 = null;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!o;")
	private Class67 aClass67_4 = null;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	private final int anInt378;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILclient!o;Lclient!o;I)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3) {
		this.anInt378 = arg0;
		this.aClass67_3 = arg2;
		this.aClass67_4 = arg1;
		this.anInt377 = arg3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB[BI)Z")
	public boolean method295(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class67 local12 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			if (arg2 < 0 || arg2 > this.anInt377) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method297(arg1, arg2, arg0, true);
			if (!local38) {
				local38 = this.method297(arg1, arg2, arg0, false);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method297(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class67 local8 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			try {
				@Pc(67) int local67;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass67_3.method2204()) {
						return false;
					}
					this.aClass67_3.method2215((long) (arg2 * 6));
					this.aClass67_3.method2208(6, 0, Static107.aByteArray35);
					local67 = ((Static107.aByteArray35[3] & 0xFF) << 16) + ((Static107.aByteArray35[4] & 0xFF) << 8) + (Static107.aByteArray35[5] & 0xFF);
					if (local67 <= 0 || this.aClass67_4.method2204() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass67_4.method2204() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				@Pc(120) int local120 = 0;
				Static107.aByteArray35[0] = (byte) (arg1 >> 16);
				Static107.aByteArray35[1] = (byte) (arg1 >> 8);
				Static107.aByteArray35[5] = (byte) local67;
				Static107.aByteArray35[2] = (byte) arg1;
				Static107.aByteArray35[3] = (byte) (local67 >> 16);
				Static107.aByteArray35[4] = (byte) (local67 >> 8);
				this.aClass67_3.method2215((long) (arg2 * 6));
				@Pc(168) int local168 = 0;
				this.aClass67_3.method2212(Static107.aByteArray35, 0, 6);
				while (arg1 > local120) {
					@Pc(179) int local179 = 0;
					@Pc(252) int local252;
					if (arg3) {
						this.aClass67_4.method2215((long) (local67 * 520));
						try {
							this.aClass67_4.method2208(8, 0, Static107.aByteArray35);
						} catch (@Pc(198) EOFException local198) {
							return true;
						}
						@Pc(215) int local215 = ((Static107.aByteArray35[2] & 0xFF) << 8) + (Static107.aByteArray35[3] & 0xFF);
						local179 = (Static107.aByteArray35[6] & 0xFF) + (((Static107.aByteArray35[4] & 0xFF) << 16) + ((Static107.aByteArray35[5] & 0xFF) << 8));
						local252 = ((Static107.aByteArray35[0] & 0xFF) << 8) + (Static107.aByteArray35[1] & 0xFF);
						@Pc(258) int local258 = Static107.aByteArray35[7] & 0xFF;
						if (local252 != arg2 || local215 != local168 || this.anInt378 != local258) {
							return false;
						}
						if (local179 < 0 || (long) local179 > this.aClass67_4.method2204() / 520L) {
							return false;
						}
					}
					if (local179 == 0) {
						arg3 = false;
						local179 = (int) ((this.aClass67_4.method2204() + 519L) / 520L);
						if (local179 == 0) {
							local179++;
						}
						if (local67 == local179) {
							local179++;
						}
					}
					Static107.aByteArray35[1] = (byte) arg2;
					Static107.aByteArray35[3] = (byte) local168;
					if (arg1 - local120 <= 512) {
						local179 = 0;
					}
					Static107.aByteArray35[6] = (byte) local179;
					local252 = arg1 - local120;
					Static107.aByteArray35[7] = (byte) this.anInt378;
					Static107.aByteArray35[0] = (byte) (arg2 >> 8);
					if (local252 > 512) {
						local252 = 512;
					}
					Static107.aByteArray35[2] = (byte) (local168 >> 8);
					Static107.aByteArray35[4] = (byte) (local179 >> 16);
					local168++;
					Static107.aByteArray35[5] = (byte) (local179 >> 8);
					this.aClass67_4.method2215((long) (local67 * 520));
					local67 = local179;
					this.aClass67_4.method2212(Static107.aByteArray35, 0, 8);
					this.aClass67_4.method2212(arg0, local120, local252);
					local120 += local252;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[B")
	public byte[] method299(@OriginalArg(0) int arg0) {
		@Pc(8) Class67 local8 = this.aClass67_4;
		synchronized (this.aClass67_4) {
			try {
				if (this.aClass67_3.method2204() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass67_3.method2215((long) (arg0 * 6));
				this.aClass67_3.method2208(6, 0, Static107.aByteArray35);
				@Pc(70) int local70 = ((Static107.aByteArray35[0] & 0xFF) << 16) + ((Static107.aByteArray35[1] & 0xFF) << 8) + (Static107.aByteArray35[2] & 0xFF);
				@Pc(92) int local92 = (Static107.aByteArray35[5] & 0xFF) + ((Static107.aByteArray35[3] & 0xFF) << 16) + ((Static107.aByteArray35[4] & 0xFF) << 8);
				if (local70 < 0 || local70 > this.anInt377) {
					return null;
				} else if (local92 > 0 && this.aClass67_4.method2204() / 520L >= (long) local92) {
					@Pc(134) byte[] local134 = new byte[local70];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local70 > local136) {
						if (local92 == 0) {
							return null;
						}
						this.aClass67_4.method2215((long) (local92 * 520));
						@Pc(163) int local163 = local70 - local136;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass67_4.method2208(local163 + 8, 0, Static107.aByteArray35);
						@Pc(191) int local191 = ((Static107.aByteArray35[2] & 0xFF) << 8) + (Static107.aByteArray35[3] & 0xFF);
						@Pc(206) int local206 = ((Static107.aByteArray35[0] & 0xFF) << 8) + (Static107.aByteArray35[1] & 0xFF);
						@Pc(229) int local229 = ((Static107.aByteArray35[4] & 0xFF) << 16) + (Static107.aByteArray35[5] << 8 & 0xFF00) + (Static107.aByteArray35[6] & 0xFF);
						@Pc(235) int local235 = Static107.aByteArray35[7] & 0xFF;
						if (arg0 == local206 && local191 == local138 && local235 == this.anInt378) {
							if (local229 >= 0 && (long) local229 <= this.aClass67_4.method2204() / 520L) {
								for (@Pc(279) int local279 = 0; local279 < local163; local279++) {
									local134[local136++] = Static107.aByteArray35[local279 + 8];
								}
								local138++;
								local92 = local229;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt378;
	}
}
