import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class171 {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Lclient!sf;")
	private Class159 aClass159_6 = null;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	private int anInt5427 = 65000;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!sf;")
	private Class159 aClass159_5 = null;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private int anInt5432;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(ILclient!sf;Lclient!sf;I)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3) {
		this.aClass159_5 = arg2;
		this.anInt5432 = arg0;
		this.aClass159_6 = arg1;
		this.anInt5427 = arg3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B[BII)Z")
	public boolean method4406(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class159 local7 = this.aClass159_6;
		synchronized (this.aClass159_6) {
			if (arg2 < 0 || arg2 > this.anInt5427) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method4407(true, arg0, arg1, arg2);
			if (!local39) {
				local39 = this.method4407(false, arg0, arg1, arg2);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method4407(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class159 local9 = this.aClass159_6;
		synchronized (this.aClass159_6) {
			try {
				@Pc(73) int local73;
				@Pc(33) boolean local33;
				if (arg0) {
					if (this.aClass159_5.method4235() < (long) (arg2 * 6 + 6)) {
						local33 = false;
						return local33;
					}
					this.aClass159_5.method4243((long) (arg2 * 6));
					this.aClass159_5.method4242(Static306.aByteArray75, 6, 0);
					local73 = (Static306.aByteArray75[5] & 0xFF) + ((Static306.aByteArray75[4] & 0xFF) << 8) + ((Static306.aByteArray75[3] & 0xFF) << 16);
					if (local73 <= 0 || this.aClass159_6.method4235() / 520L < (long) local73) {
						local33 = false;
						return local33;
					}
				} else {
					local73 = (int) ((this.aClass159_6.method4235() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static306.aByteArray75[2] = (byte) arg3;
				Static306.aByteArray75[4] = (byte) (local73 >> 8);
				Static306.aByteArray75[5] = (byte) local73;
				Static306.aByteArray75[1] = (byte) (arg3 >> 8);
				Static306.aByteArray75[3] = (byte) (local73 >> 16);
				@Pc(143) int local143 = 0;
				Static306.aByteArray75[0] = (byte) (arg3 >> 16);
				this.aClass159_5.method4243((long) (arg2 * 6));
				@Pc(160) int local160 = 0;
				this.aClass159_5.method4239(6, 0, Static306.aByteArray75);
				while (true) {
					if (arg3 > local143) {
						label136: {
							@Pc(176) int local176 = 0;
							@Pc(235) int local235;
							if (arg0) {
								this.aClass159_6.method4243((long) (local73 * 520));
								try {
									this.aClass159_6.method4242(Static306.aByteArray75, 8, 0);
								} catch (@Pc(196) EOFException local196) {
									break label136;
								}
								local176 = (Static306.aByteArray75[6] & 0xFF) + ((Static306.aByteArray75[4] & 0xFF) << 16) + ((Static306.aByteArray75[5] & 0xFF) << 8);
								local235 = ((Static306.aByteArray75[0] & 0xFF) << 8) + (Static306.aByteArray75[1] & 0xFF);
								@Pc(249) int local249 = (Static306.aByteArray75[3] & 0xFF) + ((Static306.aByteArray75[2] & 0xFF) << 8);
								@Pc(255) int local255 = Static306.aByteArray75[7] & 0xFF;
								if (arg2 != local235 || local160 != local249 || this.anInt5432 != local255) {
									local33 = false;
									return local33;
								}
								if (local176 < 0 || (long) local176 > this.aClass159_6.method4235() / 520L) {
									local33 = false;
									return local33;
								}
							}
							if (local176 == 0) {
								arg0 = false;
								local176 = (int) ((this.aClass159_6.method4235() + 519L) / 520L);
								if (local176 == 0) {
									local176++;
								}
								if (local73 == local176) {
									local176++;
								}
							}
							Static306.aByteArray75[3] = (byte) local160;
							Static306.aByteArray75[2] = (byte) (local160 >> 8);
							Static306.aByteArray75[7] = (byte) this.anInt5432;
							local160++;
							if (arg3 - local143 <= 512) {
								local176 = 0;
							}
							Static306.aByteArray75[5] = (byte) (local176 >> 8);
							local235 = arg3 - local143;
							if (local235 > 512) {
								local235 = 512;
							}
							Static306.aByteArray75[1] = (byte) arg2;
							Static306.aByteArray75[6] = (byte) local176;
							Static306.aByteArray75[4] = (byte) (local176 >> 16);
							Static306.aByteArray75[0] = (byte) (arg2 >> 8);
							this.aClass159_6.method4243((long) (local73 * 520));
							local73 = local176;
							this.aClass159_6.method4239(8, 0, Static306.aByteArray75);
							this.aClass159_6.method4239(local235, local143, arg1);
							local143 += local235;
							continue;
						}
					}
					local33 = true;
					return local33;
				}
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5432;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)[B")
	public byte[] method4408(@OriginalArg(1) int arg0) {
		@Pc(20) Class159 local20 = this.aClass159_6;
		synchronized (this.aClass159_6) {
			@Pc(34) Object local34;
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass159_5.method4235()) {
					local34 = null;
					return (byte[]) local34;
				}
				this.aClass159_5.method4243((long) (arg0 * 6));
				this.aClass159_5.method4242(Static306.aByteArray75, 6, 0);
				@Pc(75) int local75 = (Static306.aByteArray75[5] & 0xFF) + (((Static306.aByteArray75[3] & 0xFF) << 16) + ((Static306.aByteArray75[4] & 0xFF) << 8));
				@Pc(98) int local98 = ((Static306.aByteArray75[0] & 0xFF) << 16) + (((Static306.aByteArray75[1] & 0xFF) << 8) + (Static306.aByteArray75[2] & 0xFF));
				if (local98 < 0 || local98 > this.anInt5427) {
					local34 = null;
					return (byte[]) local34;
				}
				if (local75 > 0 && (long) local75 <= this.aClass159_6.method4235() / 520L) {
					@Pc(142) byte[] local142 = new byte[local98];
					@Pc(144) int local144 = 0;
					@Pc(146) int local146 = 0;
					label101: while (local98 > local146) {
						if (local75 != 0) {
							this.aClass159_6.method4243((long) (local75 * 520));
							@Pc(169) int local169 = local98 - local146;
							if (local169 > 512) {
								local169 = 512;
							}
							this.aClass159_6.method4242(Static306.aByteArray75, local169 + 8, 0);
							@Pc(199) int local199 = ((Static306.aByteArray75[2] & 0xFF) << 8) + (Static306.aByteArray75[3] & 0xFF);
							@Pc(213) int local213 = ((Static306.aByteArray75[0] & 0xFF) << 8) + (Static306.aByteArray75[1] & 0xFF);
							@Pc(219) int local219 = Static306.aByteArray75[7] & 0xFF;
							@Pc(241) int local241 = (Static306.aByteArray75[6] & 0xFF) + ((Static306.aByteArray75[5] & 0xFF) << 8) + ((Static306.aByteArray75[4] & 0xFF) << 16);
							if (local213 == arg0 && local199 == local144 && local219 == this.anInt5432) {
								if (local241 >= 0 && this.aClass159_6.method4235() / 520L >= (long) local241) {
									local144++;
									local75 = local241;
									@Pc(283) int local283 = 0;
									while (true) {
										if (local283 >= local169) {
											continue label101;
										}
										local142[local146++] = Static306.aByteArray75[local283 + 8];
										local283++;
									}
								}
								local34 = null;
								return (byte[]) local34;
							}
							local34 = null;
							return (byte[]) local34;
						}
						local34 = null;
						return (byte[]) local34;
					}
					@Pc(301) byte[] local301 = local142;
					return local301;
				}
				local34 = null;
			} catch (@Pc(305) IOException local305) {
				return null;
			}
			return (byte[]) local34;
		}
	}
}
