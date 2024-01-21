import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class29 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	private int anInt1088 = 65000;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "Lclient!wb;")
	private Class82 aClass82_2 = null;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!wb;")
	private Class82 aClass82_3 = null;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	private final int anInt1098;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ILclient!wb;Lclient!wb;I)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3) {
		this.anInt1098 = arg0;
		this.anInt1088 = arg3;
		this.aClass82_3 = arg2;
		this.aClass82_2 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZI[BI)Z")
	private boolean method729(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class82 local8 = this.aClass82_2;
		synchronized (this.aClass82_2) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass82_3.method2142() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass82_3.method2144((long) (arg1 * 6));
					this.aClass82_3.method2150(0, 6, Static5.aByteArray6);
					local22 = (Static5.aByteArray6[5] & 0xFF) + ((Static5.aByteArray6[3] & 0xFF) << 16) + ((Static5.aByteArray6[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass82_2.method2142() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass82_2.method2142() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				@Pc(106) int local106 = 0;
				Static5.aByteArray6[3] = (byte) (local22 >> 16);
				Static5.aByteArray6[1] = (byte) (arg3 >> 8);
				Static5.aByteArray6[2] = (byte) arg3;
				Static5.aByteArray6[4] = (byte) (local22 >> 8);
				Static5.aByteArray6[0] = (byte) (arg3 >> 16);
				Static5.aByteArray6[5] = (byte) local22;
				this.aClass82_3.method2144((long) (arg1 * 6));
				@Pc(154) int local154 = 0;
				this.aClass82_3.method2143(6, 0, Static5.aByteArray6);
				while (local106 < arg3) {
					@Pc(171) int local171 = 0;
					@Pc(229) int local229;
					if (arg0) {
						this.aClass82_2.method2144((long) (local22 * 520));
						try {
							this.aClass82_2.method2150(0, 8, Static5.aByteArray6);
						} catch (@Pc(190) EOFException local190) {
							return true;
						}
						local171 = ((Static5.aByteArray6[4] & 0xFF) << 16) + (Static5.aByteArray6[5] << 8 & 0xFF00) + (Static5.aByteArray6[6] & 0xFF);
						local229 = (Static5.aByteArray6[1] & 0xFF) + ((Static5.aByteArray6[0] & 0xFF) << 8);
						@Pc(235) int local235 = Static5.aByteArray6[7] & 0xFF;
						@Pc(250) int local250 = ((Static5.aByteArray6[2] & 0xFF) << 8) + (Static5.aByteArray6[3] & 0xFF);
						if (local229 != arg1 || local154 != local250 || local235 != this.anInt1098) {
							return false;
						}
						if (local171 < 0 || (long) local171 > this.aClass82_2.method2142() / 520L) {
							return false;
						}
					}
					if (local171 == 0) {
						local171 = (int) ((this.aClass82_2.method2142() + 519L) / 520L);
						arg0 = false;
						if (local171 == 0) {
							local171++;
						}
						if (local171 == local22) {
							local171++;
						}
					}
					Static5.aByteArray6[7] = (byte) this.anInt1098;
					Static5.aByteArray6[3] = (byte) local154;
					local229 = arg3 - local106;
					if (local229 > 512) {
						local229 = 512;
					}
					if (arg3 - local106 <= 512) {
						local171 = 0;
					}
					Static5.aByteArray6[1] = (byte) arg1;
					Static5.aByteArray6[6] = (byte) local171;
					Static5.aByteArray6[2] = (byte) (local154 >> 8);
					Static5.aByteArray6[0] = (byte) (arg1 >> 8);
					local154++;
					Static5.aByteArray6[5] = (byte) (local171 >> 8);
					Static5.aByteArray6[4] = (byte) (local171 >> 16);
					this.aClass82_2.method2144((long) (local22 * 520));
					local22 = local171;
					this.aClass82_2.method2143(8, 0, Static5.aByteArray6);
					this.aClass82_2.method2143(local229, local106, arg2);
					local106 += local229;
				}
				return true;
			} catch (@Pc(424) IOException local424) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI[BI)Z")
	public boolean method732(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class82 local14 = this.aClass82_2;
		synchronized (this.aClass82_2) {
			if (arg0 < 0 || this.anInt1088 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(41) boolean local41 = this.method729(true, arg2, arg1, arg0);
			if (!local41) {
				local41 = this.method729(false, arg2, arg1, arg0);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!ha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1098;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B")
	public byte[] method733(@OriginalArg(0) int arg0) {
		@Pc(8) Class82 local8 = this.aClass82_2;
		synchronized (this.aClass82_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass82_3.method2142()) {
					return null;
				}
				this.aClass82_3.method2144((long) (arg0 * 6));
				this.aClass82_3.method2150(0, 6, Static5.aByteArray6);
				@Pc(67) int local67 = ((Static5.aByteArray6[3] & 0xFF) << 16) - (-((Static5.aByteArray6[4] & 0xFF) << 8) - (Static5.aByteArray6[5] & 0xFF));
				@Pc(90) int local90 = ((Static5.aByteArray6[0] & 0xFF) << 16) + (((Static5.aByteArray6[1] & 0xFF) << 8) + (Static5.aByteArray6[2] & 0xFF));
				if (local90 < 0 || this.anInt1088 < local90) {
					return null;
				} else if (local67 > 0 && (long) local67 <= this.aClass82_2.method2142() / 520L) {
					@Pc(130) byte[] local130 = new byte[local90];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					while (local90 > local143) {
						if (local67 == 0) {
							return null;
						}
						this.aClass82_2.method2144((long) (local67 * 520));
						@Pc(169) int local169 = local90 - local143;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass82_2.method2150(0, local169 + 8, Static5.aByteArray6);
						@Pc(199) int local199 = (Static5.aByteArray6[1] & 0xFF) + ((Static5.aByteArray6[0] & 0xFF) << 8);
						@Pc(205) int local205 = Static5.aByteArray6[7] & 0xFF;
						@Pc(220) int local220 = ((Static5.aByteArray6[2] & 0xFF) << 8) + (Static5.aByteArray6[3] & 0xFF);
						@Pc(243) int local243 = ((Static5.aByteArray6[4] & 0xFF) << 16) - (-(Static5.aByteArray6[5] << 8 & 0xFF00) - (Static5.aByteArray6[6] & 0xFF));
						if (local199 == arg0 && local220 == local141 && local205 == this.anInt1098) {
							if (local243 >= 0 && this.aClass82_2.method2142() / 520L >= (long) local243) {
								for (@Pc(286) int local286 = 0; local286 < local169; local286++) {
									local130[local143++] = Static5.aByteArray6[local286 + 8];
								}
								local141++;
								local67 = local243;
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
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}
}
