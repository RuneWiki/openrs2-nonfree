import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class71 {

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt2263 = 65000;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!rs;")
	private Class174 aClass174_2 = null;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!rs;")
	private Class174 aClass174_1 = null;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private final int anInt2264;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ILclient!rs;Lclient!rs;I)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) int arg3) {
		this.aClass174_2 = arg1;
		this.anInt2263 = arg3;
		this.anInt2264 = arg0;
		this.aClass174_1 = arg2;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIB[BI)Z")
	private boolean method2238(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class174 local8 = this.aClass174_2;
		synchronized (this.aClass174_2) {
			try {
				@Pc(72) int local72;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass174_1.method5030()) {
						return false;
					}
					this.aClass174_1.method5036((long) (arg3 * 6));
					this.aClass174_1.method5034(6, Static279.aByteArray67, 0);
					local72 = ((Static279.aByteArray67[4] & 0xFF) << 8) + ((Static279.aByteArray67[3] & 0xFF) << 16) + (Static279.aByteArray67[5] & 0xFF);
					if (local72 <= 0 || this.aClass174_2.method5030() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass174_2.method5030() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static279.aByteArray67[2] = (byte) arg1;
				Static279.aByteArray67[5] = (byte) local72;
				Static279.aByteArray67[3] = (byte) (local72 >> 16);
				Static279.aByteArray67[4] = (byte) (local72 >> 8);
				Static279.aByteArray67[1] = (byte) (arg1 >> 8);
				Static279.aByteArray67[0] = (byte) (arg1 >> 16);
				this.aClass174_1.method5036((long) (arg3 * 6));
				this.aClass174_1.method5033(Static279.aByteArray67, 6, 0);
				@Pc(177) int local177 = 0;
				@Pc(179) int local179 = 0;
				while (local177 < arg1) {
					@Pc(183) int local183 = 0;
					@Pc(218) int local218;
					if (arg0) {
						this.aClass174_2.method5036((long) (local72 * 520));
						try {
							this.aClass174_2.method5034(8, Static279.aByteArray67, 0);
						} catch (@Pc(202) EOFException local202) {
							return true;
						}
						local218 = ((Static279.aByteArray67[0] & 0xFF) << 8) + (Static279.aByteArray67[1] & 0xFF);
						local183 = ((Static279.aByteArray67[5] & 0xFF) << 8) + ((Static279.aByteArray67[4] & 0xFF) << 16) + (Static279.aByteArray67[6] & 0xFF);
						@Pc(256) int local256 = ((Static279.aByteArray67[2] & 0xFF) << 8) + (Static279.aByteArray67[3] & 0xFF);
						@Pc(262) int local262 = Static279.aByteArray67[7] & 0xFF;
						if (arg3 != local218 || local179 != local256 || local262 != this.anInt2264) {
							return false;
						}
						if (local183 < 0 || (long) local183 > this.aClass174_2.method5030() / 520L) {
							return false;
						}
					}
					if (local183 == 0) {
						local183 = (int) ((this.aClass174_2.method5030() + 519L) / 520L);
						arg0 = false;
						if (local183 == 0) {
							local183++;
						}
						if (local72 == local183) {
							local183++;
						}
					}
					Static279.aByteArray67[1] = (byte) arg3;
					Static279.aByteArray67[0] = (byte) (arg3 >> 8);
					Static279.aByteArray67[2] = (byte) (local179 >> 8);
					if (arg1 - local177 <= 512) {
						local183 = 0;
					}
					Static279.aByteArray67[3] = (byte) local179;
					Static279.aByteArray67[5] = (byte) (local183 >> 8);
					Static279.aByteArray67[7] = (byte) this.anInt2264;
					Static279.aByteArray67[6] = (byte) local183;
					Static279.aByteArray67[4] = (byte) (local183 >> 16);
					this.aClass174_2.method5036((long) (local72 * 520));
					this.aClass174_2.method5033(Static279.aByteArray67, 8, 0);
					local218 = arg1 - local177;
					if (local218 > 512) {
						local218 = 512;
					}
					this.aClass174_2.method5033(arg2, local218, local177);
					local179++;
					local72 = local183;
					local177 += local218;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[B)Z")
	public boolean method2241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class174 local6 = this.aClass174_2;
		synchronized (this.aClass174_2) {
			if (arg0 < 0 || arg0 > this.anInt2263) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method2238(true, arg0, arg2, arg1);
			if (!local33) {
				local33 = this.method2238(false, arg0, arg2, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2264;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[B")
	public byte[] method2245(@OriginalArg(1) int arg0) {
		@Pc(8) Class174 local8 = this.aClass174_2;
		synchronized (this.aClass174_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass174_1.method5030()) {
					return null;
				}
				this.aClass174_1.method5036((long) (arg0 * 6));
				this.aClass174_1.method5034(6, Static279.aByteArray67, 0);
				@Pc(66) int local66 = (Static279.aByteArray67[2] & 0xFF) + ((Static279.aByteArray67[0] & 0xFF) << 16) + ((Static279.aByteArray67[1] & 0xFF) << 8);
				@Pc(88) int local88 = (Static279.aByteArray67[5] & 0xFF) + ((Static279.aByteArray67[4] & 0xFF) << 8) + ((Static279.aByteArray67[3] & 0xFF) << 16);
				if (local66 < 0 || this.anInt2263 < local66) {
					return null;
				} else if (local88 > 0 && this.aClass174_2.method5030() / 520L >= (long) local88) {
					@Pc(128) byte[] local128 = new byte[local66];
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					while (local66 > local137) {
						if (local88 == 0) {
							return null;
						}
						this.aClass174_2.method5036((long) (local88 * 520));
						@Pc(161) int local161 = local66 - local137;
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass174_2.method5034(local161 + 8, Static279.aByteArray67, 0);
						@Pc(192) int local192 = ((Static279.aByteArray67[0] & 0xFF) << 8) + (Static279.aByteArray67[1] & 0xFF);
						@Pc(206) int local206 = ((Static279.aByteArray67[2] & 0xFF) << 8) + (Static279.aByteArray67[3] & 0xFF);
						@Pc(228) int local228 = (Static279.aByteArray67[6] & 0xFF) + ((Static279.aByteArray67[4] & 0xFF) << 16) + ((Static279.aByteArray67[5] & 0xFF) << 8);
						@Pc(234) int local234 = Static279.aByteArray67[7] & 0xFF;
						if (arg0 == local192 && local206 == local139 && this.anInt2264 == local234) {
							if (local228 >= 0 && this.aClass174_2.method5030() / 520L >= (long) local228) {
								local88 = local228;
								for (@Pc(291) int local291 = 0; local291 < local161; local291++) {
									local128[local137++] = Static279.aByteArray67[local291 + 8];
								}
								local139++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}
}
