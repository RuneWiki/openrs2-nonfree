import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class98 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt3933 = 65000;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!bb;")
	private Class9 aClass9_4 = null;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!bb;")
	private Class9 aClass9_3 = null;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	private final int anInt3935;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILclient!bb;Lclient!bb;I)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3) {
		this.anInt3935 = arg0;
		this.aClass9_4 = arg2;
		this.anInt3933 = arg3;
		this.aClass9_3 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[B")
	public byte[] method2722(@OriginalArg(1) int arg0) {
		@Pc(8) Class9 local8 = this.aClass9_3;
		synchronized (this.aClass9_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass9_4.method226()) {
					return null;
				}
				this.aClass9_4.method221((long) (arg0 * 6));
				this.aClass9_4.method222(0, Static25.aByteArray4, 6);
				@Pc(75) int local75 = (Static25.aByteArray4[5] & 0xFF) + ((Static25.aByteArray4[3] & 0xFF) << 16) + ((Static25.aByteArray4[4] & 0xFF) << 8);
				@Pc(98) int local98 = ((Static25.aByteArray4[0] & 0xFF) << 16) - (-((Static25.aByteArray4[1] & 0xFF) << 8) - (Static25.aByteArray4[2] & 0xFF));
				if (local98 < 0 || this.anInt3933 < local98) {
					return null;
				} else if (local75 > 0 && (long) local75 <= this.aClass9_3.method226() / 520L) {
					@Pc(140) byte[] local140 = new byte[local98];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local98 > local144) {
						if (local75 == 0) {
							return null;
						}
						this.aClass9_3.method221((long) (local75 * 520));
						@Pc(170) int local170 = local98 - local144;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass9_3.method222(0, Static25.aByteArray4, local170 + 8);
						@Pc(201) int local201 = ((Static25.aByteArray4[0] & 0xFF) << 8) + (Static25.aByteArray4[1] & 0xFF);
						@Pc(224) int local224 = ((Static25.aByteArray4[5] & 0xFF) << 8) + (Static25.aByteArray4[4] << 16 & 0xFF0000) + (Static25.aByteArray4[6] & 0xFF);
						@Pc(230) int local230 = Static25.aByteArray4[7] & 0xFF;
						@Pc(244) int local244 = (Static25.aByteArray4[3] & 0xFF) + ((Static25.aByteArray4[2] & 0xFF) << 8);
						if (arg0 == local201 && local142 == local244 && this.anInt3935 == local230) {
							if (local224 >= 0 && (long) local224 <= this.aClass9_3.method226() / 520L) {
								for (@Pc(290) int local290 = 0; local290 < local170; local290++) {
									local140[local144++] = Static25.aByteArray4[local290 + 8];
								}
								local142++;
								local75 = local224;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3935;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIZII)Z")
	private boolean method2725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class9 local8 = this.aClass9_3;
		synchronized (this.aClass9_3) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass9_4.method226()) {
						return false;
					}
					this.aClass9_4.method221((long) (arg3 * 6));
					this.aClass9_4.method222(0, Static25.aByteArray4, 6);
					local22 = (Static25.aByteArray4[5] & 0xFF) + ((Static25.aByteArray4[3] & 0xFF) << 16) + ((Static25.aByteArray4[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass9_3.method226() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass9_3.method226() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static25.aByteArray4[0] = (byte) (arg1 >> 16);
				Static25.aByteArray4[4] = (byte) (local22 >> 8);
				Static25.aByteArray4[3] = (byte) (local22 >> 16);
				Static25.aByteArray4[5] = (byte) local22;
				Static25.aByteArray4[1] = (byte) (arg1 >> 8);
				Static25.aByteArray4[2] = (byte) arg1;
				this.aClass9_4.method221((long) (arg3 * 6));
				this.aClass9_4.method228(6, 0, Static25.aByteArray4);
				@Pc(167) int local167 = 0;
				@Pc(169) int local169 = 0;
				while (arg1 > local167) {
					@Pc(173) int local173 = 0;
					@Pc(229) int local229;
					if (arg2) {
						this.aClass9_3.method221((long) (local22 * 520));
						try {
							this.aClass9_3.method222(0, Static25.aByteArray4, 8);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						@Pc(200) int local200 = Static25.aByteArray4[7] & 0xFF;
						@Pc(215) int local215 = ((Static25.aByteArray4[2] & 0xFF) << 8) + (Static25.aByteArray4[3] & 0xFF);
						local229 = ((Static25.aByteArray4[0] & 0xFF) << 8) + (Static25.aByteArray4[1] & 0xFF);
						local173 = (Static25.aByteArray4[6] & 0xFF) + ((Static25.aByteArray4[5] & 0xFF) << 8) + ((Static25.aByteArray4[4] & 0xFF) << 16);
						if (arg3 != local229 || local169 != local215 || this.anInt3935 != local200) {
							return false;
						}
						if (local173 < 0 || this.aClass9_3.method226() / 520L < (long) local173) {
							return false;
						}
					}
					local229 = arg1 - local167;
					if (local229 > 512) {
						local229 = 512;
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass9_3.method226() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						arg2 = false;
						if (local22 == local173) {
							local173++;
						}
					}
					Static25.aByteArray4[7] = (byte) this.anInt3935;
					Static25.aByteArray4[3] = (byte) local169;
					Static25.aByteArray4[0] = (byte) (arg3 >> 8);
					Static25.aByteArray4[1] = (byte) arg3;
					if (arg1 - local167 <= 512) {
						local173 = 0;
					}
					Static25.aByteArray4[6] = (byte) local173;
					Static25.aByteArray4[5] = (byte) (local173 >> 8);
					Static25.aByteArray4[2] = (byte) (local169 >> 8);
					Static25.aByteArray4[4] = (byte) (local173 >> 16);
					local169++;
					this.aClass9_3.method221((long) (local22 * 520));
					local22 = local173;
					this.aClass9_3.method228(8, 0, Static25.aByteArray4);
					this.aClass9_3.method228(local229, local167, arg0);
					local167 += local229;
				}
				return true;
			} catch (@Pc(446) IOException local446) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II[BI)Z")
	public boolean method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class9 local6 = this.aClass9_3;
		synchronized (this.aClass9_3) {
			if (arg1 < 0 || this.anInt3933 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method2725(arg2, arg1, true, arg0);
			if (!local39) {
				local39 = this.method2725(arg2, arg1, false, arg0);
			}
			return local39;
		}
	}
}
