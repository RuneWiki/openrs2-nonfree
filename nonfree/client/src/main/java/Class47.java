import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class47 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!ck;")
	private Class56 aClass56_2 = null;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!ck;")
	private Class56 aClass56_1 = null;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt958 = 65000;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	private final int anInt963;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILclient!ck;Lclient!ck;I)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3) {
		this.aClass56_1 = arg2;
		this.anInt958 = arg3;
		this.anInt963 = arg0;
		this.aClass56_2 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt963;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[BIIZ)Z")
	private boolean method850(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class56 local8 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				@Pc(73) int local73;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass56_1.method1129()) {
						return false;
					}
					this.aClass56_1.method1123((long) (arg1 * 6));
					this.aClass56_1.method1131(6, Static163.aByteArray42, 0);
					local73 = ((Static163.aByteArray42[3] & 0xFF) << 16) + ((Static163.aByteArray42[4] & 0xFF) << 8) + (Static163.aByteArray42[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aClass56_2.method1129() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass56_2.method1129() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static163.aByteArray42[0] = (byte) (arg2 >> 16);
				Static163.aByteArray42[2] = (byte) arg2;
				Static163.aByteArray42[5] = (byte) local73;
				Static163.aByteArray42[4] = (byte) (local73 >> 8);
				Static163.aByteArray42[3] = (byte) (local73 >> 16);
				Static163.aByteArray42[1] = (byte) (arg2 >> 8);
				this.aClass56_1.method1123((long) (arg1 * 6));
				this.aClass56_1.method1127(6, 0, Static163.aByteArray42);
				@Pc(172) int local172 = 0;
				@Pc(174) int local174 = 0;
				while (local172 < arg2) {
					@Pc(178) int local178 = 0;
					@Pc(213) int local213;
					if (arg3) {
						this.aClass56_2.method1123((long) (local73 * 520));
						try {
							this.aClass56_2.method1131(8, Static163.aByteArray42, 0);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local213 = ((Static163.aByteArray42[0] & 0xFF) << 8) + (Static163.aByteArray42[1] & 0xFF);
						local178 = (Static163.aByteArray42[6] & 0xFF) + ((Static163.aByteArray42[4] & 0xFF) << 16) + ((Static163.aByteArray42[5] & 0xFF) << 8);
						@Pc(250) int local250 = (Static163.aByteArray42[3] & 0xFF) + ((Static163.aByteArray42[2] & 0xFF) << 8);
						@Pc(256) int local256 = Static163.aByteArray42[7] & 0xFF;
						if (local213 != arg1 || local250 != local174 || local256 != this.anInt963) {
							return false;
						}
						if (local178 < 0 || this.aClass56_2.method1129() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						local178 = (int) ((this.aClass56_2.method1129() + 519L) / 520L);
						arg3 = false;
						if (local178 == 0) {
							local178++;
						}
						if (local178 == local73) {
							local178++;
						}
					}
					if (arg2 - local172 <= 512) {
						local178 = 0;
					}
					Static163.aByteArray42[2] = (byte) (local174 >> 8);
					Static163.aByteArray42[1] = (byte) arg1;
					Static163.aByteArray42[0] = (byte) (arg1 >> 8);
					Static163.aByteArray42[3] = (byte) local174;
					Static163.aByteArray42[6] = (byte) local178;
					Static163.aByteArray42[4] = (byte) (local178 >> 16);
					Static163.aByteArray42[5] = (byte) (local178 >> 8);
					Static163.aByteArray42[7] = (byte) this.anInt963;
					this.aClass56_2.method1123((long) (local73 * 520));
					this.aClass56_2.method1127(8, 0, Static163.aByteArray42);
					local213 = arg2 - local172;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass56_2.method1127(local213, local172, arg0);
					local172 += local213;
					local73 = local178;
					local174++;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[B)Z")
	public boolean method851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class56 local6 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			if (arg0 < 0 || this.anInt958 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method850(arg2, arg1, arg0, true);
			if (!local26) {
				local26 = this.method850(arg2, arg1, arg0, false);
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[B")
	public byte[] method854(@OriginalArg(1) int arg0) {
		@Pc(13) Class56 local13 = this.aClass56_2;
		synchronized (this.aClass56_2) {
			try {
				if (this.aClass56_1.method1129() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass56_1.method1123((long) (arg0 * 6));
				this.aClass56_1.method1131(6, Static163.aByteArray42, 0);
				@Pc(75) int local75 = ((Static163.aByteArray42[1] & 0xFF) << 8) + ((Static163.aByteArray42[0] & 0xFF) << 16) + (Static163.aByteArray42[2] & 0xFF);
				@Pc(98) int local98 = ((Static163.aByteArray42[3] & 0xFF) << 16) + (((Static163.aByteArray42[4] & 0xFF) << 8) + (Static163.aByteArray42[5] & 0xFF));
				if (local75 < 0 || this.anInt958 < local75) {
					return null;
				} else if (local98 > 0 && this.aClass56_2.method1129() / 520L >= (long) local98) {
					@Pc(138) byte[] local138 = new byte[local75];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					while (local140 < local75) {
						if (local98 == 0) {
							return null;
						}
						this.aClass56_2.method1123((long) (local98 * 520));
						@Pc(165) int local165 = local75 - local140;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass56_2.method1131(local165 + 8, Static163.aByteArray42, 0);
						@Pc(196) int local196 = ((Static163.aByteArray42[0] & 0xFF) << 8) + (Static163.aByteArray42[1] & 0xFF);
						@Pc(210) int local210 = (Static163.aByteArray42[3] & 0xFF) + ((Static163.aByteArray42[2] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static163.aByteArray42[5] & 0xFF) << 8) + (Static163.aByteArray42[4] << 16 & 0xFF0000) + (Static163.aByteArray42[6] & 0xFF);
						@Pc(238) int local238 = Static163.aByteArray42[7] & 0xFF;
						if (local196 == arg0 && local142 == local210 && this.anInt963 == local238) {
							if (local232 >= 0 && this.aClass56_2.method1129() / 520L >= (long) local232) {
								for (@Pc(282) int local282 = 0; local282 < local165; local282++) {
									local138[local140++] = Static163.aByteArray42[local282 + 8];
								}
								local98 = local232;
								local142++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}
}
