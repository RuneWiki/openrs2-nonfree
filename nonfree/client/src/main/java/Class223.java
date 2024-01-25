import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class223 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!ika;")
	private Class176 aClass176_5 = null;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	private int anInt6123 = 65000;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!ika;")
	private Class176 aClass176_6 = null;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	private final int anInt6122;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILclient!ika;Lclient!ika;I)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3) {
		this.anInt6123 = arg3;
		this.aClass176_6 = arg1;
		this.anInt6122 = arg0;
		this.aClass176_5 = arg2;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([BIII)Z")
	public boolean method5244(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class176 local6 = this.aClass176_6;
		synchronized (this.aClass176_6) {
			if (arg2 < 0 || arg2 > this.anInt6123) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method5247(arg0, arg1, true, arg2);
			if (!local38) {
				local38 = this.method5247(arg0, arg1, false, arg2);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[B")
	public byte[] method5246(@OriginalArg(1) int arg0) {
		@Pc(8) Class176 local8 = this.aClass176_6;
		synchronized (this.aClass176_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass176_5.method3786()) {
					return null;
				}
				this.aClass176_5.method3782((long) (arg0 * 6));
				this.aClass176_5.method3787(0, 6, Static160.aByteArray12);
				@Pc(69) int local69 = ((Static160.aByteArray12[1] & 0xFF) << 8) + (Static160.aByteArray12[0] << 16 & 0xFF0000) + (Static160.aByteArray12[2] & 0xFF);
				@Pc(91) int local91 = ((Static160.aByteArray12[3] & 0xFF) << 16) + ((Static160.aByteArray12[4] & 0xFF) << 8) + (Static160.aByteArray12[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt6123) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass176_6.method3786() / 520L) {
					@Pc(135) byte[] local135 = new byte[local69];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local69 > local137) {
						if (local91 == 0) {
							return null;
						}
						this.aClass176_6.method3782((long) (local91 * 520));
						@Pc(167) int local167 = local69 - local137;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass176_6.method3787(0, local167 + 8, Static160.aByteArray12);
						@Pc(195) int local195 = (Static160.aByteArray12[1] & 0xFF) + ((Static160.aByteArray12[0] & 0xFF) << 8);
						@Pc(209) int local209 = (Static160.aByteArray12[3] & 0xFF) + ((Static160.aByteArray12[2] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static160.aByteArray12[4] & 0xFF) << 16) + ((Static160.aByteArray12[5] << 8 & 0xFF00) + (Static160.aByteArray12[6] & 0xFF));
						@Pc(238) int local238 = Static160.aByteArray12[7] & 0xFF;
						if (local195 == arg0 && local139 == local209 && local238 == this.anInt6122) {
							if (local232 >= 0 && this.aClass176_6.method3786() / 520L >= (long) local232) {
								local139++;
								for (@Pc(281) int local281 = 0; local281 < local167; local281++) {
									local135[local137++] = Static160.aByteArray12[local281 + 8];
								}
								local91 = local232;
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
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B[BIZI)Z")
	private boolean method5247(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class176 local8 = this.aClass176_6;
		synchronized (this.aClass176_6) {
			try {
				@Pc(72) int local72;
				if (arg2) {
					if (this.aClass176_5.method3786() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass176_5.method3782((long) (arg1 * 6));
					this.aClass176_5.method3787(0, 6, Static160.aByteArray12);
					local72 = ((Static160.aByteArray12[3] & 0xFF) << 16) + ((Static160.aByteArray12[4] & 0xFF) << 8) + (Static160.aByteArray12[5] & 0xFF);
					if (local72 <= 0 || (long) local72 > this.aClass176_6.method3786() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass176_6.method3786() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static160.aByteArray12[1] = (byte) (arg3 >> 8);
				Static160.aByteArray12[4] = (byte) (local72 >> 8);
				Static160.aByteArray12[5] = (byte) local72;
				Static160.aByteArray12[0] = (byte) (arg3 >> 16);
				Static160.aByteArray12[3] = (byte) (local72 >> 16);
				Static160.aByteArray12[2] = (byte) arg3;
				this.aClass176_5.method3782((long) (arg1 * 6));
				this.aClass176_5.method3784(0, Static160.aByteArray12, 6);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (true) {
					if (arg3 > local176) {
						label102: {
							@Pc(184) int local184 = 0;
							@Pc(220) int local220;
							if (arg2) {
								this.aClass176_6.method3782((long) (local72 * 520));
								try {
									this.aClass176_6.method3787(0, 8, Static160.aByteArray12);
								} catch (@Pc(204) EOFException local204) {
									break label102;
								}
								local220 = ((Static160.aByteArray12[0] & 0xFF) << 8) + (Static160.aByteArray12[1] & 0xFF);
								@Pc(235) int local235 = ((Static160.aByteArray12[2] & 0xFF) << 8) + (Static160.aByteArray12[3] & 0xFF);
								local184 = ((Static160.aByteArray12[5] & 0xFF) << 8) + ((Static160.aByteArray12[4] & 0xFF) << 16) + (Static160.aByteArray12[6] & 0xFF);
								@Pc(264) int local264 = Static160.aByteArray12[7] & 0xFF;
								if (local220 != arg1 || local178 != local235 || this.anInt6122 != local264) {
									return false;
								}
								if (local184 < 0 || (long) local184 > this.aClass176_6.method3786() / 520L) {
									return false;
								}
							}
							if (local184 == 0) {
								arg2 = false;
								local184 = (int) ((this.aClass176_6.method3786() + 519L) / 520L);
								if (local184 == 0) {
									local184++;
								}
								if (local72 == local184) {
									local184++;
								}
							}
							Static160.aByteArray12[3] = (byte) local178;
							if (arg3 - local176 <= 512) {
								local184 = 0;
							}
							Static160.aByteArray12[1] = (byte) arg1;
							Static160.aByteArray12[2] = (byte) (local178 >> 8);
							Static160.aByteArray12[0] = (byte) (arg1 >> 8);
							Static160.aByteArray12[7] = (byte) this.anInt6122;
							Static160.aByteArray12[5] = (byte) (local184 >> 8);
							Static160.aByteArray12[4] = (byte) (local184 >> 16);
							Static160.aByteArray12[6] = (byte) local184;
							this.aClass176_6.method3782((long) (local72 * 520));
							this.aClass176_6.method3784(0, Static160.aByteArray12, 8);
							local220 = arg3 - local176;
							if (local220 > 512) {
								local220 = 512;
							}
							this.aClass176_6.method3784(local176, arg0, local220);
							local178++;
							local72 = local184;
							local176 += local220;
							continue;
						}
					}
					@Pc(460) boolean local460 = true;
					return true;
				}
			} catch (@Pc(465) IOException local465) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6122;
	}
}
