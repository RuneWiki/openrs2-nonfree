import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class17 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!bf;")
	private Class10 aClass10_1 = null;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!bf;")
	private Class10 aClass10_2 = null;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private int anInt723 = 65000;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	private final int anInt721;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ILclient!bf;Lclient!bf;I)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3) {
		this.aClass10_2 = arg2;
		this.anInt721 = arg0;
		this.aClass10_1 = arg1;
		this.anInt723 = arg3;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIZ[B)Z")
	private boolean method392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class10 local8 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass10_2.method183() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass10_2.method185((long) (arg1 * 6));
					this.aClass10_2.method182(Static54.aByteArray69, 6, 0);
					local22 = ((Static54.aByteArray69[3] & 0xFF) << 16) + ((Static54.aByteArray69[4] << 8 & 0xFF00) + (Static54.aByteArray69[5] & 0xFF));
					if (local22 <= 0 || (long) local22 > this.aClass10_1.method183() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass10_1.method183() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static54.aByteArray69[1] = (byte) (arg0 >> 8);
				Static54.aByteArray69[5] = (byte) local22;
				Static54.aByteArray69[2] = (byte) arg0;
				@Pc(124) int local124 = 0;
				Static54.aByteArray69[4] = (byte) (local22 >> 8);
				Static54.aByteArray69[0] = (byte) (arg0 >> 16);
				@Pc(140) int local140 = 0;
				Static54.aByteArray69[3] = (byte) (local22 >> 16);
				this.aClass10_2.method185((long) (arg1 * 6));
				this.aClass10_2.method178(6, 0, Static54.aByteArray69);
				while (arg0 > local124) {
					@Pc(166) int local166 = 0;
					@Pc(245) int local245;
					if (arg2) {
						this.aClass10_1.method185((long) (local22 * 520));
						try {
							this.aClass10_1.method182(Static54.aByteArray69, 8, 0);
						} catch (@Pc(185) EOFException local185) {
							return true;
						}
						local166 = ((Static54.aByteArray69[4] & 0xFF) << 16) + ((Static54.aByteArray69[5] & 0xFF) << 8) + (Static54.aByteArray69[6] & 0xFF);
						@Pc(224) int local224 = ((Static54.aByteArray69[2] & 0xFF) << 8) + (Static54.aByteArray69[3] & 0xFF);
						@Pc(230) int local230 = Static54.aByteArray69[7] & 0xFF;
						local245 = ((Static54.aByteArray69[0] & 0xFF) << 8) + (Static54.aByteArray69[1] & 0xFF);
						if (arg1 != local245 || local140 != local224 || this.anInt721 != local230) {
							return false;
						}
						if (local166 < 0 || this.aClass10_1.method183() / 520L < (long) local166) {
							return false;
						}
					}
					local245 = arg0 - local124;
					if (local245 > 512) {
						local245 = 512;
					}
					if (local166 == 0) {
						arg2 = false;
						local166 = (int) ((this.aClass10_1.method183() + 519L) / 520L);
						if (local166 == 0) {
							local166++;
						}
						if (local22 == local166) {
							local166++;
						}
					}
					Static54.aByteArray69[3] = (byte) local140;
					Static54.aByteArray69[0] = (byte) (arg1 >> 8);
					if (arg0 - local124 <= 512) {
						local166 = 0;
					}
					Static54.aByteArray69[6] = (byte) local166;
					Static54.aByteArray69[2] = (byte) (local140 >> 8);
					Static54.aByteArray69[4] = (byte) (local166 >> 16);
					local140++;
					Static54.aByteArray69[1] = (byte) arg1;
					Static54.aByteArray69[7] = (byte) this.anInt721;
					Static54.aByteArray69[5] = (byte) (local166 >> 8);
					this.aClass10_1.method185((long) (local22 * 520));
					local22 = local166;
					this.aClass10_1.method178(8, 0, Static54.aByteArray69);
					this.aClass10_1.method178(local245, local124, arg3);
					local124 += local245;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[B")
	public byte[] method393(@OriginalArg(1) int arg0) {
		@Pc(8) Class10 local8 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass10_2.method183()) {
					return null;
				}
				this.aClass10_2.method185((long) (arg0 * 6));
				this.aClass10_2.method182(Static54.aByteArray69, 6, 0);
				@Pc(79) int local79 = ((Static54.aByteArray69[0] & 0xFF) << 16) - (-(Static54.aByteArray69[1] << 8 & 0xFF00) - (Static54.aByteArray69[2] & 0xFF));
				@Pc(103) int local103 = ((Static54.aByteArray69[3] & 0xFF) << 16) + ((Static54.aByteArray69[4] & 0xFF) << 8) + (Static54.aByteArray69[5] & 0xFF);
				if (local79 < 0 || this.anInt723 < local79) {
					return null;
				} else if (local103 > 0 && (long) local103 <= this.aClass10_1.method183() / 520L) {
					@Pc(146) byte[] local146 = new byte[local79];
					@Pc(148) int local148 = 0;
					@Pc(150) int local150 = 0;
					while (local79 > local148) {
						if (local103 == 0) {
							return null;
						}
						this.aClass10_1.method185((long) (local103 * 520));
						@Pc(175) int local175 = local79 - local148;
						if (local175 > 512) {
							local175 = 512;
						}
						this.aClass10_1.method182(Static54.aByteArray69, local175 + 8, 0);
						@Pc(214) int local214 = ((Static54.aByteArray69[5] & 0xFF) << 8) + ((Static54.aByteArray69[4] & 0xFF) << 16) + (Static54.aByteArray69[6] & 0xFF);
						@Pc(229) int local229 = ((Static54.aByteArray69[2] & 0xFF) << 8) + (Static54.aByteArray69[3] & 0xFF);
						@Pc(243) int local243 = ((Static54.aByteArray69[0] & 0xFF) << 8) + (Static54.aByteArray69[1] & 0xFF);
						@Pc(249) int local249 = Static54.aByteArray69[7] & 0xFF;
						if (arg0 == local243 && local229 == local150 && this.anInt721 == local249) {
							if (local214 >= 0 && this.aClass10_1.method183() / 520L >= (long) local214) {
								local103 = local214;
								for (@Pc(299) int local299 = 0; local299 < local175; local299++) {
									local146[local148++] = Static54.aByteArray69[local299 + 8];
								}
								local150++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local146;
				} else {
					return null;
				}
			} catch (@Pc(325) IOException local325) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt721;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BI)Z")
	public boolean method394(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class10 local6 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			if (arg2 < 0 || arg2 > this.anInt723) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method392(arg2, arg0, true, arg1);
			if (!local39) {
				local39 = this.method392(arg2, arg0, false, arg1);
			}
			return local39;
		}
	}
}
