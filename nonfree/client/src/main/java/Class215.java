import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class215 {

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
	private int anInt6220 = 65000;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!wm;")
	private Class361 aClass361_4 = null;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!wm;")
	private Class361 aClass361_3 = null;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
	private final int anInt6226;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILclient!wm;Lclient!wm;I)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) int arg3) {
		this.anInt6226 = arg0;
		this.aClass361_3 = arg1;
		this.aClass361_4 = arg2;
		this.anInt6220 = arg3;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)[B")
	public byte[] method5012(@OriginalArg(1) int arg0) {
		@Pc(8) Class361 local8 = this.aClass361_3;
		synchronized (this.aClass361_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass361_4.method8113()) {
					return null;
				}
				this.aClass361_4.method8112((long) (arg0 * 6));
				this.aClass361_4.method8121(0, 6, Static527.aByteArray244);
				@Pc(65) int local65 = (Static527.aByteArray244[2] & 0xFF) + ((Static527.aByteArray244[1] & 0xFF) << 8) + ((Static527.aByteArray244[0] & 0xFF) << 16);
				@Pc(88) int local88 = ((Static527.aByteArray244[3] & 0xFF) << 16) + ((Static527.aByteArray244[4] & 0xFF) << 8) + (Static527.aByteArray244[5] & 0xFF);
				if (local65 < 0 || this.anInt6220 < local65) {
					return null;
				} else if (local88 > 0 && this.aClass361_3.method8113() / 520L >= (long) local88) {
					@Pc(125) byte[] local125 = new byte[local65];
					@Pc(127) int local127 = 0;
					@Pc(129) int local129 = 0;
					while (local65 > local127) {
						if (local88 == 0) {
							return null;
						}
						this.aClass361_3.method8112((long) (local88 * 520));
						@Pc(151) int local151 = local65 - local127;
						if (local151 > 512) {
							local151 = 512;
						}
						this.aClass361_3.method8121(0, local151 + 8, Static527.aByteArray244);
						@Pc(179) int local179 = (Static527.aByteArray244[1] & 0xFF) + ((Static527.aByteArray244[0] & 0xFF) << 8);
						@Pc(193) int local193 = ((Static527.aByteArray244[2] & 0xFF) << 8) + (Static527.aByteArray244[3] & 0xFF);
						@Pc(215) int local215 = ((Static527.aByteArray244[5] & 0xFF) << 8) + ((Static527.aByteArray244[4] & 0xFF) << 16) + (Static527.aByteArray244[6] & 0xFF);
						@Pc(221) int local221 = Static527.aByteArray244[7] & 0xFF;
						if (arg0 == local179 && local193 == local129 && this.anInt6226 == local221) {
							if (local215 >= 0 && this.aClass361_3.method8113() / 520L >= (long) local215) {
								for (@Pc(257) int local257 = 0; local257 < local151; local257++) {
									local125[local127++] = Static527.aByteArray244[local257 + 8];
								}
								local88 = local215;
								local129++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local125;
				} else {
					return null;
				}
			} catch (@Pc(285) IOException local285) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6226;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "([BIII)Z")
	public boolean method5015(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class361 local6 = this.aClass361_3;
		synchronized (this.aClass361_3) {
			if (arg1 < 0 || arg1 > this.anInt6220) {
				throw new IllegalArgumentException();
			}
			@Pc(36) boolean local36 = this.method5016(arg2, arg0, true, arg1);
			if (!local36) {
				local36 = this.method5016(arg2, arg0, false, arg1);
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BZZI)Z")
	private boolean method5016(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class361 local8 = this.aClass361_3;
		synchronized (this.aClass361_3) {
			try {
				@Pc(26) int local26;
				if (arg2) {
					if (this.aClass361_4.method8113() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass361_4.method8112((long) (arg0 * 6));
					this.aClass361_4.method8121(0, 6, Static527.aByteArray244);
					local26 = ((Static527.aByteArray244[4] & 0xFF) << 8) + ((Static527.aByteArray244[3] & 0xFF) << 16) + (Static527.aByteArray244[5] & 0xFF);
					if (local26 <= 0 || (long) local26 > this.aClass361_3.method8113() / 520L) {
						return false;
					}
				} else {
					local26 = (int) ((this.aClass361_3.method8113() + 519L) / 520L);
					if (local26 == 0) {
						local26 = 1;
					}
				}
				Static527.aByteArray244[0] = (byte) (arg3 >> 16);
				Static527.aByteArray244[4] = (byte) (local26 >> 8);
				Static527.aByteArray244[2] = (byte) arg3;
				Static527.aByteArray244[1] = (byte) (arg3 >> 8);
				Static527.aByteArray244[5] = (byte) local26;
				Static527.aByteArray244[3] = (byte) (local26 >> 16);
				this.aClass361_4.method8112((long) (arg0 * 6));
				this.aClass361_4.method8116(6, 0, Static527.aByteArray244);
				@Pc(188) int local188 = 0;
				@Pc(190) int local190 = 0;
				while (arg3 > local188) {
					@Pc(194) int local194 = 0;
					@Pc(229) int local229;
					if (arg2) {
						this.aClass361_3.method8112((long) (local26 * 520));
						try {
							this.aClass361_3.method8121(0, 8, Static527.aByteArray244);
						} catch (@Pc(213) EOFException local213) {
							return true;
						}
						local229 = (Static527.aByteArray244[1] & 0xFF) + ((Static527.aByteArray244[0] & 0xFF) << 8);
						local194 = ((Static527.aByteArray244[5] & 0xFF) << 8) + (((Static527.aByteArray244[4] & 0xFF) << 16) + (Static527.aByteArray244[6] & 0xFF));
						@Pc(266) int local266 = (Static527.aByteArray244[3] & 0xFF) + ((Static527.aByteArray244[2] & 0xFF) << 8);
						@Pc(272) int local272 = Static527.aByteArray244[7] & 0xFF;
						if (local229 != arg0 || local266 != local190 || this.anInt6226 != local272) {
							return false;
						}
						if (local194 < 0 || this.aClass361_3.method8113() / 520L < (long) local194) {
							return false;
						}
					}
					if (local194 == 0) {
						local194 = (int) ((this.aClass361_3.method8113() + 519L) / 520L);
						arg2 = false;
						if (local194 == 0) {
							local194++;
						}
						if (local26 == local194) {
							local194++;
						}
					}
					Static527.aByteArray244[3] = (byte) local190;
					if (arg3 - local188 <= 512) {
						local194 = 0;
					}
					Static527.aByteArray244[2] = (byte) (local190 >> 8);
					Static527.aByteArray244[0] = (byte) (arg0 >> 8);
					Static527.aByteArray244[1] = (byte) arg0;
					Static527.aByteArray244[5] = (byte) (local194 >> 8);
					Static527.aByteArray244[4] = (byte) (local194 >> 16);
					Static527.aByteArray244[6] = (byte) local194;
					Static527.aByteArray244[7] = (byte) this.anInt6226;
					this.aClass361_3.method8112((long) (local26 * 520));
					this.aClass361_3.method8116(8, 0, Static527.aByteArray244);
					local229 = arg3 - local188;
					if (local229 > 512) {
						local229 = 512;
					}
					this.aClass361_3.method8116(local229, local188, arg1);
					local188 += local229;
					local26 = local194;
					local190++;
				}
				return true;
			} catch (@Pc(446) IOException local446) {
				return false;
			}
		}
	}
}
