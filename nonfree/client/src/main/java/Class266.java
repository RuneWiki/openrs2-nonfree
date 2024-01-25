import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class266 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	private int anInt7819 = 65000;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "Lclient!ul;")
	private Class318 aClass318_3 = null;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!ul;")
	private Class318 aClass318_2 = null;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	private final int anInt7826;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILclient!ul;Lclient!ul;I)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) Class318 arg1, @OriginalArg(2) Class318 arg2, @OriginalArg(3) int arg3) {
		this.aClass318_2 = arg1;
		this.anInt7819 = arg3;
		this.aClass318_3 = arg2;
		this.anInt7826 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[BI)Z")
	public boolean method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class318 local6 = this.aClass318_2;
		synchronized (this.aClass318_2) {
			if (arg0 < 0 || this.anInt7819 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(27) boolean local27 = this.method6529(true, arg2, arg1, arg0);
			if (!local27) {
				local27 = this.method6529(false, arg2, arg1, arg0);
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z[BBII)Z")
	private boolean method6529(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class318 local8 = this.aClass318_2;
		synchronized (this.aClass318_2) {
			try {
				@Pc(71) int local71;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass318_3.method7605()) {
						return false;
					}
					this.aClass318_3.method7606((long) (arg2 * 6));
					this.aClass318_3.method7600(Static246.aByteArray57, 6, 0);
					local71 = ((Static246.aByteArray57[4] & 0xFF) << 8) + ((Static246.aByteArray57[3] & 0xFF) << 16) + (Static246.aByteArray57[5] & 0xFF);
					if (local71 <= 0 || (long) local71 > this.aClass318_2.method7605() / 520L) {
						return false;
					}
				} else {
					local71 = (int) ((this.aClass318_2.method7605() + 519L) / 520L);
					if (local71 == 0) {
						local71 = 1;
					}
				}
				Static246.aByteArray57[0] = (byte) (arg3 >> 16);
				Static246.aByteArray57[5] = (byte) local71;
				Static246.aByteArray57[3] = (byte) (local71 >> 16);
				Static246.aByteArray57[4] = (byte) (local71 >> 8);
				Static246.aByteArray57[1] = (byte) (arg3 >> 8);
				Static246.aByteArray57[2] = (byte) arg3;
				this.aClass318_3.method7606((long) (arg2 * 6));
				this.aClass318_3.method7608(6, Static246.aByteArray57, 0);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (arg3 > local167) {
					@Pc(173) int local173 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass318_2.method7606((long) (local71 * 520));
						try {
							this.aClass318_2.method7600(Static246.aByteArray57, 8, 0);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local209 = ((Static246.aByteArray57[0] & 0xFF) << 8) + (Static246.aByteArray57[1] & 0xFF);
						local173 = (Static246.aByteArray57[6] & 0xFF) + ((Static246.aByteArray57[5] & 0xFF) << 8) + ((Static246.aByteArray57[4] & 0xFF) << 16);
						@Pc(246) int local246 = ((Static246.aByteArray57[2] & 0xFF) << 8) + (Static246.aByteArray57[3] & 0xFF);
						@Pc(252) int local252 = Static246.aByteArray57[7] & 0xFF;
						if (local209 != arg2 || local169 != local246 || this.anInt7826 != local252) {
							return false;
						}
						if (local173 < 0 || (long) local173 > this.aClass318_2.method7605() / 520L) {
							return false;
						}
					}
					if (local173 == 0) {
						arg0 = false;
						local173 = (int) ((this.aClass318_2.method7605() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local71) {
							local173++;
						}
					}
					if (arg3 - local167 <= 512) {
						local173 = 0;
					}
					Static246.aByteArray57[0] = (byte) (arg2 >> 8);
					Static246.aByteArray57[3] = (byte) local169;
					Static246.aByteArray57[2] = (byte) (local169 >> 8);
					Static246.aByteArray57[1] = (byte) arg2;
					Static246.aByteArray57[6] = (byte) local173;
					Static246.aByteArray57[7] = (byte) this.anInt7826;
					Static246.aByteArray57[4] = (byte) (local173 >> 16);
					Static246.aByteArray57[5] = (byte) (local173 >> 8);
					this.aClass318_2.method7606((long) (local71 * 520));
					this.aClass318_2.method7608(8, Static246.aByteArray57, 0);
					local209 = arg3 - local167;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass318_2.method7608(local209, arg1, local167);
					local71 = local173;
					local167 += local209;
					local169++;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[B")
	public byte[] method6530(@OriginalArg(0) int arg0) {
		@Pc(8) Class318 local8 = this.aClass318_2;
		synchronized (this.aClass318_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass318_3.method7605()) {
					return null;
				}
				this.aClass318_3.method7606((long) (arg0 * 6));
				this.aClass318_3.method7600(Static246.aByteArray57, 6, 0);
				@Pc(69) int local69 = ((Static246.aByteArray57[1] & 0xFF) << 8) + ((Static246.aByteArray57[0] & 0xFF) << 16) + (Static246.aByteArray57[2] & 0xFF);
				@Pc(91) int local91 = (Static246.aByteArray57[5] & 0xFF) + ((Static246.aByteArray57[3] & 0xFF) << 16) + ((Static246.aByteArray57[4] & 0xFF) << 8);
				if (local69 < 0 || this.anInt7819 < local69) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass318_2.method7605() / 520L) {
					@Pc(135) byte[] local135 = new byte[local69];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local69 > local137) {
						if (local91 == 0) {
							return null;
						}
						this.aClass318_2.method7606((long) (local91 * 520));
						@Pc(165) int local165 = local69 - local137;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass318_2.method7600(Static246.aByteArray57, local165 + 8, 0);
						@Pc(194) int local194 = ((Static246.aByteArray57[0] & 0xFF) << 8) + (Static246.aByteArray57[1] & 0xFF);
						@Pc(209) int local209 = ((Static246.aByteArray57[2] & 0xFF) << 8) + (Static246.aByteArray57[3] & 0xFF);
						@Pc(233) int local233 = ((Static246.aByteArray57[4] & 0xFF) << 16) - (-(Static246.aByteArray57[5] << 8 & 0xFF00) - (Static246.aByteArray57[6] & 0xFF));
						@Pc(239) int local239 = Static246.aByteArray57[7] & 0xFF;
						if (local194 == arg0 && local139 == local209 && this.anInt7826 == local239) {
							if (local233 >= 0 && this.aClass318_2.method7605() / 520L >= (long) local233) {
								for (@Pc(286) int local286 = 0; local286 < local165; local286++) {
									local135[local137++] = Static246.aByteArray57[local286 + 8];
								}
								local139++;
								local91 = local233;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7826;
	}
}
