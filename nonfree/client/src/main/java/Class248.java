import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class248 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!rs;")
	private Class220 aClass220_5 = null;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	private int anInt6887 = 65000;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!rs;")
	private Class220 aClass220_4 = null;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	private final int anInt6880;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILclient!rs;Lclient!rs;I)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3) {
		this.anInt6887 = arg3;
		this.aClass220_5 = arg1;
		this.anInt6880 = arg0;
		this.aClass220_4 = arg2;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BII)Z")
	public boolean method5436(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class220 local11 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			if (arg1 < 0 || arg1 > this.anInt6887) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method5437(arg1, arg2, true, arg0);
			if (!local38) {
				local38 = this.method5437(arg1, arg2, false, arg0);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIZ[B)Z")
	private boolean method5437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class220 local8 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass220_4.method4792()) {
						return false;
					}
					this.aClass220_4.method4796((long) (arg1 * 6));
					this.aClass220_4.method4798(0, 6, Static423.aByteArray136);
					local22 = (Static423.aByteArray136[5] & 0xFF) + ((Static423.aByteArray136[3] & 0xFF) << 16) + ((Static423.aByteArray136[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass220_5.method4792() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass220_5.method4792() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static423.aByteArray136[0] = (byte) (arg0 >> 16);
				Static423.aByteArray136[4] = (byte) (local22 >> 8);
				Static423.aByteArray136[2] = (byte) arg0;
				Static423.aByteArray136[5] = (byte) local22;
				Static423.aByteArray136[3] = (byte) (local22 >> 16);
				Static423.aByteArray136[1] = (byte) (arg0 >> 8);
				this.aClass220_4.method4796((long) (arg1 * 6));
				this.aClass220_4.method4794(6, 0, Static423.aByteArray136);
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				while (local163 < arg0) {
					@Pc(175) int local175 = 0;
					@Pc(211) int local211;
					if (arg2) {
						this.aClass220_5.method4796((long) (local22 * 520));
						try {
							this.aClass220_5.method4798(0, 8, Static423.aByteArray136);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local211 = ((Static423.aByteArray136[0] & 0xFF) << 8) + (Static423.aByteArray136[1] & 0xFF);
						@Pc(225) int local225 = (Static423.aByteArray136[3] & 0xFF) + ((Static423.aByteArray136[2] & 0xFF) << 8);
						local175 = ((Static423.aByteArray136[4] & 0xFF) << 16) + (Static423.aByteArray136[5] << 8 & 0xFF00) + (Static423.aByteArray136[6] & 0xFF);
						@Pc(253) int local253 = Static423.aByteArray136[7] & 0xFF;
						if (local211 != arg1 || local225 != local165 || this.anInt6880 != local253) {
							return false;
						}
						if (local175 < 0 || (long) local175 > this.aClass220_5.method4792() / 520L) {
							return false;
						}
					}
					if (local175 == 0) {
						local175 = (int) ((this.aClass220_5.method4792() + 519L) / 520L);
						arg2 = false;
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local22) {
							local175++;
						}
					}
					Static423.aByteArray136[0] = (byte) (arg1 >> 8);
					Static423.aByteArray136[3] = (byte) local165;
					Static423.aByteArray136[1] = (byte) arg1;
					if (arg0 - local163 <= 512) {
						local175 = 0;
					}
					Static423.aByteArray136[2] = (byte) (local165 >> 8);
					Static423.aByteArray136[4] = (byte) (local175 >> 16);
					Static423.aByteArray136[7] = (byte) this.anInt6880;
					Static423.aByteArray136[6] = (byte) local175;
					Static423.aByteArray136[5] = (byte) (local175 >> 8);
					this.aClass220_5.method4796((long) (local22 * 520));
					this.aClass220_5.method4794(8, 0, Static423.aByteArray136);
					local211 = arg0 - local163;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass220_5.method4794(local211, local163, arg3);
					local22 = local175;
					local163 += local211;
					local165++;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ZI)[B")
	public byte[] method5438(@OriginalArg(1) int arg0) {
		@Pc(8) Class220 local8 = this.aClass220_5;
		synchronized (this.aClass220_5) {
			try {
				if (this.aClass220_4.method4792() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass220_4.method4796((long) (arg0 * 6));
				this.aClass220_4.method4798(0, 6, Static423.aByteArray136);
				@Pc(66) int local66 = ((Static423.aByteArray136[0] & 0xFF) << 16) + ((Static423.aByteArray136[1] & 0xFF) << 8) + (Static423.aByteArray136[2] & 0xFF);
				@Pc(88) int local88 = ((Static423.aByteArray136[4] & 0xFF) << 8) + ((Static423.aByteArray136[3] & 0xFF) << 16) + (Static423.aByteArray136[5] & 0xFF);
				if (local66 < 0 || local66 > this.anInt6887) {
					return null;
				} else if (local88 > 0 && this.aClass220_5.method4792() / 520L >= (long) local88) {
					@Pc(134) byte[] local134 = new byte[local66];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local66 > local136) {
						if (local88 == 0) {
							return null;
						}
						this.aClass220_5.method4796((long) (local88 * 520));
						@Pc(164) int local164 = local66 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass220_5.method4798(0, local164 + 8, Static423.aByteArray136);
						@Pc(192) int local192 = (Static423.aByteArray136[1] & 0xFF) + ((Static423.aByteArray136[0] & 0xFF) << 8);
						@Pc(206) int local206 = ((Static423.aByteArray136[2] & 0xFF) << 8) + (Static423.aByteArray136[3] & 0xFF);
						@Pc(228) int local228 = (Static423.aByteArray136[6] & 0xFF) + ((Static423.aByteArray136[5] & 0xFF) << 8) + ((Static423.aByteArray136[4] & 0xFF) << 16);
						@Pc(234) int local234 = Static423.aByteArray136[7] & 0xFF;
						if (arg0 == local192 && local138 == local206 && this.anInt6880 == local234) {
							if (local228 >= 0 && (long) local228 <= this.aClass220_5.method4792() / 520L) {
								local88 = local228;
								for (@Pc(288) int local288 = 0; local288 < local164; local288++) {
									local134[local136++] = Static423.aByteArray136[local288 + 8];
								}
								local138++;
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
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6880;
	}
}
