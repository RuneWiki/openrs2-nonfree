import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class245 {

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "Lclient!gd;")
	private Class121 aClass121_2 = null;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!gd;")
	private Class121 aClass121_3 = null;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
	private int anInt6167 = 65000;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	private final int anInt6161;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!gd;Lclient!gd;I)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3) {
		this.aClass121_2 = arg2;
		this.anInt6167 = arg3;
		this.anInt6161 = arg0;
		this.aClass121_3 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[B")
	public byte[] method5154(@OriginalArg(1) int arg0) {
		@Pc(8) Class121 local8 = this.aClass121_3;
		synchronized (this.aClass121_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass121_2.method2182()) {
					return null;
				}
				this.aClass121_2.method2186((long) (arg0 * 6));
				this.aClass121_2.method2184(Static355.aByteArray59, 0, 6);
				@Pc(69) int local69 = (Static355.aByteArray59[2] & 0xFF) + ((Static355.aByteArray59[0] & 0xFF) << 16) + ((Static355.aByteArray59[1] & 0xFF) << 8);
				@Pc(92) int local92 = ((Static355.aByteArray59[3] & 0xFF) << 16) + ((Static355.aByteArray59[4] & 0xFF) << 8) + (Static355.aByteArray59[5] & 0xFF);
				if (local69 < 0 || this.anInt6167 < local69) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass121_3.method2182() / 520L) {
					@Pc(129) byte[] local129 = new byte[local69];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					label55: while (local69 > local139) {
						if (local92 == 0) {
							return null;
						}
						this.aClass121_3.method2186((long) (local92 * 520));
						@Pc(163) int local163 = local69 - local139;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass121_3.method2184(Static355.aByteArray59, 0, local163 + 8);
						@Pc(191) int local191 = (Static355.aByteArray59[1] & 0xFF) + ((Static355.aByteArray59[0] & 0xFF) << 8);
						@Pc(206) int local206 = ((Static355.aByteArray59[2] & 0xFF) << 8) + (Static355.aByteArray59[3] & 0xFF);
						@Pc(228) int local228 = (Static355.aByteArray59[6] & 0xFF) + ((Static355.aByteArray59[5] & 0xFF) << 8) + ((Static355.aByteArray59[4] & 0xFF) << 16);
						@Pc(234) int local234 = Static355.aByteArray59[7] & 0xFF;
						if (arg0 == local191 && local206 == local141 && this.anInt6161 == local234) {
							if (local228 >= 0 && (long) local228 <= this.aClass121_3.method2182() / 520L) {
								local92 = local228;
								local141++;
								@Pc(284) int local284 = 0;
								while (true) {
									if (local163 <= local284) {
										continue label55;
									}
									local129[local139++] = Static355.aByteArray59[local284 + 8];
									local284++;
								}
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method5157(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class121 local8 = this.aClass121_3;
		synchronized (this.aClass121_3) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass121_2.method2182()) {
						return false;
					}
					this.aClass121_2.method2186((long) (arg2 * 6));
					this.aClass121_2.method2184(Static355.aByteArray59, 0, 6);
					local22 = ((Static355.aByteArray59[3] & 0xFF) << 16) + ((Static355.aByteArray59[4] & 0xFF) << 8) + (Static355.aByteArray59[5] & 0xFF);
					if (local22 <= 0 || this.aClass121_3.method2182() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass121_3.method2182() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static355.aByteArray59[4] = (byte) (local22 >> 8);
				Static355.aByteArray59[1] = (byte) (arg3 >> 8);
				Static355.aByteArray59[2] = (byte) arg3;
				Static355.aByteArray59[3] = (byte) (local22 >> 16);
				Static355.aByteArray59[5] = (byte) local22;
				Static355.aByteArray59[0] = (byte) (arg3 >> 16);
				this.aClass121_2.method2186((long) (arg2 * 6));
				this.aClass121_2.method2183(6, 0, Static355.aByteArray59);
				@Pc(169) int local169 = 0;
				@Pc(171) int local171 = 0;
				while (local169 < arg3) {
					@Pc(175) int local175 = 0;
					@Pc(210) int local210;
					if (arg0) {
						this.aClass121_3.method2186((long) (local22 * 520));
						try {
							this.aClass121_3.method2184(Static355.aByteArray59, 0, 8);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = (Static355.aByteArray59[1] & 0xFF) + ((Static355.aByteArray59[0] & 0xFF) << 8);
						@Pc(224) int local224 = (Static355.aByteArray59[3] & 0xFF) + ((Static355.aByteArray59[2] & 0xFF) << 8);
						local175 = ((Static355.aByteArray59[5] & 0xFF) << 8) + ((Static355.aByteArray59[4] & 0xFF) << 16) + (Static355.aByteArray59[6] & 0xFF);
						@Pc(253) int local253 = Static355.aByteArray59[7] & 0xFF;
						if (local210 != arg2 || local224 != local171 || this.anInt6161 != local253) {
							return false;
						}
						if (local175 < 0 || (long) local175 > this.aClass121_3.method2182() / 520L) {
							return false;
						}
					}
					if (local175 == 0) {
						arg0 = false;
						local175 = (int) ((this.aClass121_3.method2182() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local22 == local175) {
							local175++;
						}
					}
					Static355.aByteArray59[0] = (byte) (arg2 >> 8);
					if (arg3 - local169 <= 512) {
						local175 = 0;
					}
					Static355.aByteArray59[1] = (byte) arg2;
					Static355.aByteArray59[2] = (byte) (local171 >> 8);
					Static355.aByteArray59[3] = (byte) local171;
					Static355.aByteArray59[5] = (byte) (local175 >> 8);
					Static355.aByteArray59[4] = (byte) (local175 >> 16);
					Static355.aByteArray59[7] = (byte) this.anInt6161;
					Static355.aByteArray59[6] = (byte) local175;
					this.aClass121_3.method2186((long) (local22 * 520));
					this.aClass121_3.method2183(8, 0, Static355.aByteArray59);
					local210 = arg3 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass121_3.method2183(local210, local169, arg1);
					local169 += local210;
					local22 = local175;
					local171++;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIZI)Z")
	public boolean method5159(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class121 local6 = this.aClass121_3;
		synchronized (this.aClass121_3) {
			if (arg1 < 0 || this.anInt6167 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method5157(true, arg0, arg2, arg1);
			if (!local39) {
				local39 = this.method5157(false, arg0, arg2, arg1);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!nr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6161;
	}
}
