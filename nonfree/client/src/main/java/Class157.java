import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class157 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!vh;")
	private Class363 aClass363_1 = null;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!vh;")
	private Class363 aClass363_2 = null;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private int anInt4194 = 65000;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	private final int anInt4198;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(ILclient!vh;Lclient!vh;I)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class363 arg2, @OriginalArg(3) int arg3) {
		this.aClass363_1 = arg2;
		this.anInt4198 = arg0;
		this.anInt4194 = arg3;
		this.aClass363_2 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II[BZI)Z")
	private boolean method3814(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class363 local18 = this.aClass363_2;
		synchronized (this.aClass363_2) {
			try {
				@Pc(32) int local32;
				if (arg2) {
					if (this.aClass363_1.method8567() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass363_1.method8575((long) (arg0 * 6));
					this.aClass363_1.method8569(Static329.aByteArray25, 0, 6);
					local32 = ((Static329.aByteArray25[3] & 0xFF) << 16) + (((Static329.aByteArray25[4] & 0xFF) << 8) + (Static329.aByteArray25[5] & 0xFF));
					if (local32 <= 0 || (long) local32 > this.aClass363_2.method8567() / 520L) {
						return false;
					}
				} else {
					local32 = (int) ((this.aClass363_2.method8567() + 519L) / 520L);
					if (local32 == 0) {
						local32 = 1;
					}
				}
				Static329.aByteArray25[5] = (byte) local32;
				Static329.aByteArray25[2] = (byte) arg3;
				Static329.aByteArray25[4] = (byte) (local32 >> 8);
				Static329.aByteArray25[0] = (byte) (arg3 >> 16);
				Static329.aByteArray25[1] = (byte) (arg3 >> 8);
				Static329.aByteArray25[3] = (byte) (local32 >> 16);
				this.aClass363_1.method8575((long) (arg0 * 6));
				this.aClass363_1.method8574(6, 0, Static329.aByteArray25);
				@Pc(172) int local172 = 0;
				@Pc(174) int local174 = 0;
				while (arg3 > local172) {
					@Pc(178) int local178 = 0;
					@Pc(213) int local213;
					if (arg2) {
						this.aClass363_2.method8575((long) (local32 * 520));
						try {
							this.aClass363_2.method8569(Static329.aByteArray25, 0, 8);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local213 = ((Static329.aByteArray25[0] & 0xFF) << 8) + (Static329.aByteArray25[1] & 0xFF);
						@Pc(227) int local227 = (Static329.aByteArray25[3] & 0xFF) + ((Static329.aByteArray25[2] & 0xFF) << 8);
						local178 = (Static329.aByteArray25[6] & 0xFF) + ((Static329.aByteArray25[5] & 0xFF) << 8) + ((Static329.aByteArray25[4] & 0xFF) << 16);
						@Pc(255) int local255 = Static329.aByteArray25[7] & 0xFF;
						if (arg0 != local213 || local174 != local227 || this.anInt4198 != local255) {
							return false;
						}
						if (local178 < 0 || this.aClass363_2.method8567() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						arg2 = false;
						local178 = (int) ((this.aClass363_2.method8567() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local32 == local178) {
							local178++;
						}
					}
					Static329.aByteArray25[3] = (byte) local174;
					if (arg3 - local172 <= 512) {
						local178 = 0;
					}
					Static329.aByteArray25[2] = (byte) (local174 >> 8);
					Static329.aByteArray25[1] = (byte) arg0;
					Static329.aByteArray25[0] = (byte) (arg0 >> 8);
					Static329.aByteArray25[6] = (byte) local178;
					Static329.aByteArray25[5] = (byte) (local178 >> 8);
					Static329.aByteArray25[4] = (byte) (local178 >> 16);
					Static329.aByteArray25[7] = (byte) this.anInt4198;
					this.aClass363_2.method8575((long) (local32 * 520));
					this.aClass363_2.method8574(8, 0, Static329.aByteArray25);
					local213 = arg3 - local172;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass363_2.method8574(local213, local172, arg1);
					local172 += local213;
					local32 = local178;
					local174++;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BIIB)Z")
	public boolean method3815(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class363 local6 = this.aClass363_2;
		synchronized (this.aClass363_2) {
			if (arg2 < 0 || this.anInt4194 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(43) boolean local43 = this.method3814(arg1, arg0, true, arg2);
			if (!local43) {
				local43 = this.method3814(arg1, arg0, false, arg2);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4198;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[B")
	public byte[] method3817(@OriginalArg(0) int arg0) {
		@Pc(8) Class363 local8 = this.aClass363_2;
		synchronized (this.aClass363_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass363_1.method8567()) {
					return null;
				}
				this.aClass363_1.method8575((long) (arg0 * 6));
				this.aClass363_1.method8569(Static329.aByteArray25, 0, 6);
				@Pc(67) int local67 = ((Static329.aByteArray25[0] & 0xFF) << 16) - (-((Static329.aByteArray25[1] & 0xFF) << 8) - (Static329.aByteArray25[2] & 0xFF));
				@Pc(90) int local90 = ((Static329.aByteArray25[3] & 0xFF) << 16) - (-(Static329.aByteArray25[4] << 8 & 0xFF00) - (Static329.aByteArray25[5] & 0xFF));
				if (local67 < 0 || local67 > this.anInt4194) {
					return null;
				} else if (local90 > 0 && (long) local90 <= this.aClass363_2.method8567() / 520L) {
					@Pc(130) byte[] local130 = new byte[local67];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					while (local67 > local132) {
						if (local90 == 0) {
							return null;
						}
						this.aClass363_2.method8575((long) (local90 * 520));
						@Pc(156) int local156 = local67 - local132;
						if (local156 > 512) {
							local156 = 512;
						}
						this.aClass363_2.method8569(Static329.aByteArray25, 0, local156 + 8);
						@Pc(184) int local184 = (Static329.aByteArray25[1] & 0xFF) + ((Static329.aByteArray25[0] & 0xFF) << 8);
						@Pc(198) int local198 = (Static329.aByteArray25[3] & 0xFF) + ((Static329.aByteArray25[2] & 0xFF) << 8);
						@Pc(221) int local221 = ((Static329.aByteArray25[5] & 0xFF) << 8) + ((Static329.aByteArray25[4] & 0xFF) << 16) + (Static329.aByteArray25[6] & 0xFF);
						@Pc(227) int local227 = Static329.aByteArray25[7] & 0xFF;
						if (local184 == arg0 && local198 == local134 && this.anInt4198 == local227) {
							if (local221 >= 0 && this.aClass363_2.method8567() / 520L >= (long) local221) {
								for (@Pc(274) int local274 = 0; local274 < local156; local274++) {
									local130[local132++] = Static329.aByteArray25[local274 + 8];
								}
								local134++;
								local90 = local221;
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
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}
}
