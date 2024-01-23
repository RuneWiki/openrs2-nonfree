import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class90 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt3490 = 65000;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!ao;")
	private Class14 aClass14_2 = null;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!ao;")
	private Class14 aClass14_3 = null;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	private int anInt3496;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILclient!ao;Lclient!ao;I)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3) {
		this.anInt3490 = arg3;
		this.aClass14_3 = arg2;
		this.anInt3496 = arg0;
		this.aClass14_2 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BI)Z")
	public boolean method2775(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class14 local13 = this.aClass14_2;
		synchronized (this.aClass14_2) {
			if (arg2 < 0 || this.anInt3490 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method2776(arg0, arg1, arg2, true);
			if (!local37) {
				local37 = this.method2776(arg0, arg1, arg2, false);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BIZI)Z")
	private boolean method2776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) Class14 local9 = this.aClass14_2;
		synchronized (this.aClass14_2) {
			try {
				@Pc(68) int local68;
				@Pc(26) boolean local26;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass14_3.method243()) {
						local26 = false;
						return local26;
					}
					this.aClass14_3.method236((long) (arg0 * 6));
					this.aClass14_3.method235(6, Static86.aByteArray25, 0);
					local68 = ((Static86.aByteArray25[4] & 0xFF) << 8) + (Static86.aByteArray25[3] << 16 & 0xFF0000) + (Static86.aByteArray25[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aClass14_2.method243() / 520L) {
						local26 = false;
						return local26;
					}
				} else {
					local68 = (int) ((this.aClass14_2.method243() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static86.aByteArray25[1] = (byte) (arg2 >> 8);
				Static86.aByteArray25[2] = (byte) arg2;
				Static86.aByteArray25[4] = (byte) (local68 >> 8);
				Static86.aByteArray25[0] = (byte) (arg2 >> 16);
				Static86.aByteArray25[5] = (byte) local68;
				Static86.aByteArray25[3] = (byte) (local68 >> 16);
				@Pc(151) int local151 = 0;
				this.aClass14_3.method236((long) (arg0 * 6));
				this.aClass14_3.method232(Static86.aByteArray25, 0, 6);
				@Pc(168) int local168 = 0;
				while (true) {
					if (local151 < arg2) {
						label139: {
							@Pc(177) int local177 = 0;
							@Pc(236) int local236;
							if (arg3) {
								this.aClass14_2.method236((long) (local68 * 520));
								try {
									this.aClass14_2.method235(8, Static86.aByteArray25, 0);
								} catch (@Pc(197) EOFException local197) {
									break label139;
								}
								local177 = (Static86.aByteArray25[6] & 0xFF) + (((Static86.aByteArray25[4] & 0xFF) << 16) + ((Static86.aByteArray25[5] & 0xFF) << 8));
								local236 = (Static86.aByteArray25[1] & 0xFF) + ((Static86.aByteArray25[0] & 0xFF) << 8);
								@Pc(250) int local250 = (Static86.aByteArray25[3] & 0xFF) + ((Static86.aByteArray25[2] & 0xFF) << 8);
								@Pc(256) int local256 = Static86.aByteArray25[7] & 0xFF;
								if (local236 != arg0 || local250 != local168 || local256 != this.anInt3496) {
									local26 = false;
									return local26;
								}
								if (local177 < 0 || this.aClass14_2.method243() / 520L < (long) local177) {
									local26 = false;
									return local26;
								}
							}
							if (local177 == 0) {
								local177 = (int) ((this.aClass14_2.method243() + 519L) / 520L);
								if (local177 == 0) {
									local177++;
								}
								if (local68 == local177) {
									local177++;
								}
								arg3 = false;
							}
							Static86.aByteArray25[0] = (byte) (arg0 >> 8);
							Static86.aByteArray25[2] = (byte) (local168 >> 8);
							if (arg2 - local151 <= 512) {
								local177 = 0;
							}
							Static86.aByteArray25[4] = (byte) (local177 >> 16);
							Static86.aByteArray25[3] = (byte) local168;
							Static86.aByteArray25[7] = (byte) this.anInt3496;
							Static86.aByteArray25[1] = (byte) arg0;
							Static86.aByteArray25[6] = (byte) local177;
							local236 = arg2 - local151;
							if (local236 > 512) {
								local236 = 512;
							}
							Static86.aByteArray25[5] = (byte) (local177 >> 8);
							this.aClass14_2.method236((long) (local68 * 520));
							local68 = local177;
							this.aClass14_2.method232(Static86.aByteArray25, 0, 8);
							local168++;
							this.aClass14_2.method232(arg1, local151, local236);
							local151 += local236;
							continue;
						}
					}
					local26 = true;
					return local26;
				}
			} catch (@Pc(425) IOException local425) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[B")
	public byte[] method2777(@OriginalArg(0) int arg0) {
		@Pc(9) Class14 local9 = this.aClass14_2;
		synchronized (this.aClass14_2) {
			try {
				@Pc(23) Object local23;
				if ((long) (arg0 * 6 + 6) > this.aClass14_3.method243()) {
					local23 = null;
					return (byte[]) local23;
				}
				this.aClass14_3.method236((long) (arg0 * 6));
				this.aClass14_3.method235(6, Static86.aByteArray25, 0);
				@Pc(67) int local67 = (Static86.aByteArray25[2] & 0xFF) + ((Static86.aByteArray25[1] & 0xFF) << 8) + ((Static86.aByteArray25[0] & 0xFF) << 16);
				@Pc(91) int local91 = ((Static86.aByteArray25[3] & 0xFF) << 16) + ((Static86.aByteArray25[4] & 0xFF) << 8) + (Static86.aByteArray25[5] & 0xFF);
				if (local67 < 0 || local67 > this.anInt3490) {
					local23 = null;
					return (byte[]) local23;
				} else if (local91 <= 0 || (long) local91 > this.aClass14_2.method243() / 520L) {
					local23 = null;
					return (byte[]) local23;
				} else {
					@Pc(137) byte[] local137 = new byte[local67];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local139 < local67) {
						if (local91 == 0) {
							local23 = null;
							return (byte[]) local23;
						}
						this.aClass14_2.method236((long) (local91 * 520));
						@Pc(166) int local166 = local67 - local139;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass14_2.method235(local166 + 8, Static86.aByteArray25, 0);
						@Pc(187) int local187 = Static86.aByteArray25[7] & 0xFF;
						@Pc(202) int local202 = ((Static86.aByteArray25[2] & 0xFF) << 8) + (Static86.aByteArray25[3] & 0xFF);
						@Pc(224) int local224 = (Static86.aByteArray25[6] & 0xFF) + ((Static86.aByteArray25[5] & 0xFF) << 8) + ((Static86.aByteArray25[4] & 0xFF) << 16);
						@Pc(238) int local238 = (Static86.aByteArray25[1] & 0xFF) + ((Static86.aByteArray25[0] & 0xFF) << 8);
						if (arg0 != local238 || local202 != local141 || this.anInt3496 != local187) {
							local23 = null;
							return (byte[]) local23;
						}
						if (local224 < 0 || this.aClass14_2.method243() / 520L < (long) local224) {
							local23 = null;
							return (byte[]) local23;
						}
						local141++;
						for (@Pc(283) int local283 = 0; local283 < local166; local283++) {
							local137[local139++] = Static86.aByteArray25[local283 + 8];
						}
						local91 = local224;
					}
					@Pc(303) byte[] local303 = local137;
					return local303;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3496;
	}
}
