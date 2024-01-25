import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class219 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!cj;")
	private Class35 aClass35_5 = null;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!cj;")
	private Class35 aClass35_6 = null;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	private int anInt6620 = 65000;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	private final int anInt6619;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(ILclient!cj;Lclient!cj;I)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3) {
		this.aClass35_6 = arg2;
		this.anInt6620 = arg3;
		this.aClass35_5 = arg1;
		this.anInt6619 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[B")
	public byte[] method5827(@OriginalArg(0) int arg0) {
		@Pc(8) Class35 local8 = this.aClass35_5;
		synchronized (this.aClass35_5) {
			try {
				if (this.aClass35_6.method894() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass35_6.method892((long) (arg0 * 6));
				this.aClass35_6.method897(Static341.aByteArray92, 6, 0);
				@Pc(66) int local66 = ((Static341.aByteArray92[0] & 0xFF) << 16) + ((Static341.aByteArray92[1] & 0xFF) << 8) + (Static341.aByteArray92[2] & 0xFF);
				@Pc(88) int local88 = (Static341.aByteArray92[5] & 0xFF) + ((Static341.aByteArray92[4] & 0xFF) << 8) + ((Static341.aByteArray92[3] & 0xFF) << 16);
				if (local66 < 0 || local66 > this.anInt6620) {
					return null;
				} else if (local88 > 0 && this.aClass35_5.method894() / 520L >= (long) local88) {
					@Pc(134) byte[] local134 = new byte[local66];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local66 > local136) {
						if (local88 == 0) {
							return null;
						}
						this.aClass35_5.method892((long) (local88 * 520));
						@Pc(161) int local161 = local66 - local136;
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass35_5.method897(Static341.aByteArray92, local161 + 8, 0);
						@Pc(191) int local191 = (Static341.aByteArray92[1] & 0xFF) + ((Static341.aByteArray92[0] & 0xFF) << 8);
						@Pc(205) int local205 = (Static341.aByteArray92[3] & 0xFF) + ((Static341.aByteArray92[2] & 0xFF) << 8);
						@Pc(228) int local228 = ((Static341.aByteArray92[5] & 0xFF) << 8) + ((Static341.aByteArray92[4] & 0xFF) << 16) + (Static341.aByteArray92[6] & 0xFF);
						@Pc(234) int local234 = Static341.aByteArray92[7] & 0xFF;
						if (local191 == arg0 && local205 == local138 && this.anInt6619 == local234) {
							if (local228 >= 0 && (long) local228 <= this.aClass35_5.method894() / 520L) {
								for (@Pc(281) int local281 = 0; local281 < local161; local281++) {
									local134[local136++] = Static341.aByteArray92[local281 + 8];
								}
								local138++;
								local88 = local228;
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
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6619;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BII)Z")
	public boolean method5831(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class35 local6 = this.aClass35_5;
		synchronized (this.aClass35_5) {
			if (arg2 < 0 || this.anInt6620 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method5832(arg2, arg0, true, arg1);
			if (!local33) {
				local33 = this.method5832(arg2, arg0, false, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BZII)Z")
	private boolean method5832(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class35 local8 = this.aClass35_5;
		synchronized (this.aClass35_5) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass35_6.method894() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass35_6.method892((long) (arg3 * 6));
					this.aClass35_6.method897(Static341.aByteArray92, 6, 0);
					local22 = (Static341.aByteArray92[5] & 0xFF) + (((Static341.aByteArray92[3] & 0xFF) << 16) + ((Static341.aByteArray92[4] & 0xFF) << 8));
					if (local22 <= 0 || this.aClass35_5.method894() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass35_5.method894() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static341.aByteArray92[4] = (byte) (local22 >> 8);
				Static341.aByteArray92[0] = (byte) (arg0 >> 16);
				Static341.aByteArray92[1] = (byte) (arg0 >> 8);
				Static341.aByteArray92[5] = (byte) local22;
				Static341.aByteArray92[3] = (byte) (local22 >> 16);
				Static341.aByteArray92[2] = (byte) arg0;
				this.aClass35_6.method892((long) (arg3 * 6));
				this.aClass35_6.method893(6, Static341.aByteArray92, 0);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (arg0 > local166) {
					@Pc(172) int local172 = 0;
					@Pc(209) int local209;
					if (arg2) {
						this.aClass35_5.method892((long) (local22 * 520));
						try {
							this.aClass35_5.method897(Static341.aByteArray92, 8, 0);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static341.aByteArray92[1] & 0xFF) + ((Static341.aByteArray92[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static341.aByteArray92[3] & 0xFF) + ((Static341.aByteArray92[2] & 0xFF) << 8);
						local172 = (Static341.aByteArray92[6] & 0xFF) + ((Static341.aByteArray92[4] & 0xFF) << 16) + ((Static341.aByteArray92[5] & 0xFF) << 8);
						@Pc(252) int local252 = Static341.aByteArray92[7] & 0xFF;
						if (arg3 != local209 || local223 != local168 || this.anInt6619 != local252) {
							return false;
						}
						if (local172 < 0 || this.aClass35_5.method894() / 520L < (long) local172) {
							return false;
						}
					}
					if (local172 == 0) {
						arg2 = false;
						local172 = (int) ((this.aClass35_5.method894() + 519L) / 520L);
						if (local172 == 0) {
							local172++;
						}
						if (local22 == local172) {
							local172++;
						}
					}
					Static341.aByteArray92[0] = (byte) (arg3 >> 8);
					Static341.aByteArray92[2] = (byte) (local168 >> 8);
					if (arg0 - local166 <= 512) {
						local172 = 0;
					}
					Static341.aByteArray92[3] = (byte) local168;
					Static341.aByteArray92[1] = (byte) arg3;
					Static341.aByteArray92[6] = (byte) local172;
					Static341.aByteArray92[7] = (byte) this.anInt6619;
					Static341.aByteArray92[4] = (byte) (local172 >> 16);
					Static341.aByteArray92[5] = (byte) (local172 >> 8);
					this.aClass35_5.method892((long) (local22 * 520));
					this.aClass35_5.method893(8, Static341.aByteArray92, 0);
					local209 = arg0 - local166;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass35_5.method893(local209, arg1, local166);
					local168++;
					local166 += local209;
					local22 = local172;
				}
				return true;
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}
}
