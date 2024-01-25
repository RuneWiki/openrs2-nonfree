import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class178 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!no;")
	private Class173 aClass173_3 = null;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	private int anInt4402 = 65000;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!no;")
	private Class173 aClass173_4 = null;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	private final int anInt4397;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILclient!no;Lclient!no;I)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class173 arg2, @OriginalArg(3) int arg3) {
		this.anInt4402 = arg3;
		this.anInt4397 = arg0;
		this.aClass173_4 = arg1;
		this.aClass173_3 = arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[B")
	public byte[] method3528(@OriginalArg(1) int arg0) {
		@Pc(8) Class173 local8 = this.aClass173_4;
		synchronized (this.aClass173_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass173_3.method3442()) {
					return null;
				}
				this.aClass173_3.method3440((long) (arg0 * 6));
				this.aClass173_3.method3438(6, 0, Static327.aByteArray61);
				@Pc(69) int local69 = (Static327.aByteArray61[2] & 0xFF) + ((Static327.aByteArray61[1] & 0xFF) << 8) + ((Static327.aByteArray61[0] & 0xFF) << 16);
				@Pc(92) int local92 = ((Static327.aByteArray61[3] & 0xFF) << 16) + (Static327.aByteArray61[4] << 8 & 0xFF00) + (Static327.aByteArray61[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt4402) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass173_4.method3442() / 520L) {
					@Pc(130) byte[] local130 = new byte[local69];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					while (local69 > local132) {
						if (local92 == 0) {
							return null;
						}
						this.aClass173_4.method3440((long) (local92 * 520));
						@Pc(162) int local162 = local69 - local132;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass173_4.method3438(local162 + 8, 0, Static327.aByteArray61);
						@Pc(190) int local190 = (Static327.aByteArray61[1] & 0xFF) + ((Static327.aByteArray61[0] & 0xFF) << 8);
						@Pc(205) int local205 = ((Static327.aByteArray61[2] & 0xFF) << 8) + (Static327.aByteArray61[3] & 0xFF);
						@Pc(227) int local227 = ((Static327.aByteArray61[5] & 0xFF) << 8) + ((Static327.aByteArray61[4] & 0xFF) << 16) + (Static327.aByteArray61[6] & 0xFF);
						@Pc(233) int local233 = Static327.aByteArray61[7] & 0xFF;
						if (arg0 == local190 && local205 == local134 && this.anInt4397 == local233) {
							if (local227 >= 0 && (long) local227 <= this.aClass173_4.method3442() / 520L) {
								local134++;
								for (@Pc(274) int local274 = 0; local274 < local162; local274++) {
									local130[local132++] = Static327.aByteArray61[local274 + 8];
								}
								local92 = local227;
								continue;
							}
							return null;
						}
						return null;
					}
					return local130;
				} else {
					return null;
				}
			} catch (@Pc(305) IOException local305) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIZI)Z")
	private boolean method3529(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class173 local8 = this.aClass173_4;
		synchronized (this.aClass173_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass173_3.method3442() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass173_3.method3440((long) (arg1 * 6));
					this.aClass173_3.method3438(6, 0, Static327.aByteArray61);
					local22 = ((Static327.aByteArray61[4] & 0xFF) << 8) + (Static327.aByteArray61[3] << 16 & 0xFF0000) + (Static327.aByteArray61[5] & 0xFF);
					if (local22 <= 0 || this.aClass173_4.method3442() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass173_4.method3442() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static327.aByteArray61[5] = (byte) local22;
				Static327.aByteArray61[3] = (byte) (local22 >> 16);
				Static327.aByteArray61[1] = (byte) (arg3 >> 8);
				Static327.aByteArray61[4] = (byte) (local22 >> 8);
				Static327.aByteArray61[2] = (byte) arg3;
				Static327.aByteArray61[0] = (byte) (arg3 >> 16);
				this.aClass173_3.method3440((long) (arg1 * 6));
				this.aClass173_3.method3445(6, Static327.aByteArray61, 0);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (arg3 > local166) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg2) {
						this.aClass173_4.method3440((long) (local22 * 520));
						try {
							this.aClass173_4.method3438(8, 0, Static327.aByteArray61);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = ((Static327.aByteArray61[0] & 0xFF) << 8) + (Static327.aByteArray61[1] & 0xFF);
						local172 = (Static327.aByteArray61[6] & 0xFF) + ((Static327.aByteArray61[5] & 0xFF) << 8) + ((Static327.aByteArray61[4] & 0xFF) << 16);
						@Pc(243) int local243 = (Static327.aByteArray61[3] & 0xFF) + ((Static327.aByteArray61[2] & 0xFF) << 8);
						@Pc(249) int local249 = Static327.aByteArray61[7] & 0xFF;
						if (local207 != arg1 || local168 != local243 || local249 != this.anInt4397) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass173_4.method3442() / 520L) {
							return false;
						}
					}
					if (local172 == 0) {
						arg2 = false;
						local172 = (int) ((this.aClass173_4.method3442() + 519L) / 520L);
						if (local172 == 0) {
							local172++;
						}
						if (local22 == local172) {
							local172++;
						}
					}
					Static327.aByteArray61[3] = (byte) local168;
					Static327.aByteArray61[2] = (byte) (local168 >> 8);
					Static327.aByteArray61[0] = (byte) (arg1 >> 8);
					Static327.aByteArray61[1] = (byte) arg1;
					if (arg3 - local166 <= 512) {
						local172 = 0;
					}
					Static327.aByteArray61[5] = (byte) (local172 >> 8);
					Static327.aByteArray61[6] = (byte) local172;
					Static327.aByteArray61[4] = (byte) (local172 >> 16);
					Static327.aByteArray61[7] = (byte) this.anInt4397;
					this.aClass173_4.method3440((long) (local22 * 520));
					this.aClass173_4.method3445(8, Static327.aByteArray61, 0);
					local207 = arg3 - local166;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass173_4.method3445(local207, arg0, local166);
					local168++;
					local22 = local172;
					local166 += local207;
				}
				return true;
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BBI)Z")
	public boolean method3530(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class173 local6 = this.aClass173_4;
		synchronized (this.aClass173_4) {
			if (arg0 < 0 || this.anInt4402 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method3529(arg1, arg2, true, arg0);
			if (!local30) {
				local30 = this.method3529(arg1, arg2, false, arg0);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4397;
	}
}
