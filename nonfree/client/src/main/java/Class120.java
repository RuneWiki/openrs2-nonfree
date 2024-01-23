import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class120 {

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "Lclient!vl;")
	private Class187 aClass187_4 = null;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!vl;")
	private Class187 aClass187_5 = null;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	private int anInt3777 = 65000;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(ILclient!vl;Lclient!vl;I)V")
	public Class120(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) int arg3) {
		this.anInt3777 = arg3;
		this.aClass187_4 = arg1;
		this.anInt3774 = arg0;
		this.aClass187_5 = arg2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[B")
	public byte[] method3072(@OriginalArg(0) int arg0) {
		@Pc(9) Class187 local9 = this.aClass187_4;
		synchronized (this.aClass187_4) {
			try {
				@Pc(27) Object local27;
				if ((long) (arg0 * 6 + 6) > this.aClass187_5.method4496()) {
					local27 = null;
					return (byte[]) local27;
				}
				this.aClass187_5.method4487((long) (arg0 * 6));
				this.aClass187_5.method4489(Static312.aByteArray73, 6, 0);
				@Pc(75) int local75 = (Static312.aByteArray73[2] & 0xFF) + ((Static312.aByteArray73[1] & 0xFF) << 8) + ((Static312.aByteArray73[0] & 0xFF) << 16);
				@Pc(97) int local97 = (Static312.aByteArray73[5] & 0xFF) + ((Static312.aByteArray73[4] & 0xFF) << 8) + ((Static312.aByteArray73[3] & 0xFF) << 16);
				if (local75 < 0 || this.anInt3777 < local75) {
					local27 = null;
					return (byte[]) local27;
				} else if (local97 > 0 && (long) local97 <= this.aClass187_4.method4496() / 520L) {
					@Pc(137) int local137 = 0;
					@Pc(139) int local139 = 0;
					@Pc(142) byte[] local142 = new byte[local75];
					while (local139 < local75) {
						if (local97 == 0) {
							local27 = null;
							return (byte[]) local27;
						}
						this.aClass187_4.method4487((long) (local97 * 520));
						@Pc(166) int local166 = local75 - local139;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass187_4.method4489(Static312.aByteArray73, local166 + 8, 0);
						@Pc(186) int local186 = Static312.aByteArray73[7] & 0xFF;
						@Pc(208) int local208 = (Static312.aByteArray73[6] & 0xFF) + ((Static312.aByteArray73[5] & 0xFF) << 8) + ((Static312.aByteArray73[4] & 0xFF) << 16);
						@Pc(222) int local222 = (Static312.aByteArray73[3] & 0xFF) + ((Static312.aByteArray73[2] & 0xFF) << 8);
						@Pc(236) int local236 = (Static312.aByteArray73[1] & 0xFF) + ((Static312.aByteArray73[0] & 0xFF) << 8);
						if (arg0 != local236 || local137 != local222 || this.anInt3774 != local186) {
							local27 = null;
							return (byte[]) local27;
						}
						if (local208 < 0 || this.aClass187_4.method4496() / 520L < (long) local208) {
							local27 = null;
							return (byte[]) local27;
						}
						local97 = local208;
						local137++;
						for (@Pc(282) int local282 = 0; local282 < local166; local282++) {
							local142[local139++] = Static312.aByteArray73[local282 + 8];
						}
					}
					@Pc(304) byte[] local304 = local142;
					return local304;
				} else {
					local27 = null;
					return (byte[]) local27;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3774;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method3073(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) Class187 local9 = this.aClass187_4;
		synchronized (this.aClass187_4) {
			try {
				@Pc(70) int local70;
				@Pc(27) boolean local27;
				if (arg3) {
					if (this.aClass187_5.method4496() < (long) (arg1 * 6 + 6)) {
						local27 = false;
						return local27;
					}
					this.aClass187_5.method4487((long) (arg1 * 6));
					this.aClass187_5.method4489(Static312.aByteArray73, 6, 0);
					local70 = ((Static312.aByteArray73[3] & 0xFF) << 16) - (-((Static312.aByteArray73[4] & 0xFF) << 8) - (Static312.aByteArray73[5] & 0xFF));
					if (local70 <= 0 || (long) local70 > this.aClass187_4.method4496() / 520L) {
						local27 = false;
						return local27;
					}
				} else {
					local70 = (int) ((this.aClass187_4.method4496() + 519L) / 520L);
					if (local70 == 0) {
						local70 = 1;
					}
				}
				Static312.aByteArray73[3] = (byte) (local70 >> 16);
				Static312.aByteArray73[2] = (byte) arg2;
				Static312.aByteArray73[5] = (byte) local70;
				Static312.aByteArray73[0] = (byte) (arg2 >> 16);
				@Pc(138) int local138 = 0;
				@Pc(140) int local140 = 0;
				Static312.aByteArray73[4] = (byte) (local70 >> 8);
				Static312.aByteArray73[1] = (byte) (arg2 >> 8);
				this.aClass187_5.method4487((long) (arg1 * 6));
				this.aClass187_5.method4491(0, 6, Static312.aByteArray73);
				while (true) {
					if (local138 < arg2) {
						label132: {
							@Pc(178) int local178 = 0;
							@Pc(214) int local214;
							if (arg3) {
								this.aClass187_4.method4487((long) (local70 * 520));
								try {
									this.aClass187_4.method4489(Static312.aByteArray73, 8, 0);
								} catch (@Pc(197) EOFException local197) {
									break label132;
								}
								local214 = ((Static312.aByteArray73[0] & 0xFF) << 8) + (Static312.aByteArray73[1] & 0xFF);
								local178 = ((Static312.aByteArray73[5] & 0xFF) << 8) + ((Static312.aByteArray73[4] & 0xFF) << 16) + (Static312.aByteArray73[6] & 0xFF);
								@Pc(251) int local251 = ((Static312.aByteArray73[2] & 0xFF) << 8) + (Static312.aByteArray73[3] & 0xFF);
								@Pc(257) int local257 = Static312.aByteArray73[7] & 0xFF;
								if (arg1 != local214 || local140 != local251 || local257 != this.anInt3774) {
									local27 = false;
									return local27;
								}
								if (local178 < 0 || this.aClass187_4.method4496() / 520L < (long) local178) {
									local27 = false;
									return local27;
								}
							}
							local214 = arg2 - local138;
							if (local214 > 512) {
								local214 = 512;
							}
							if (local178 == 0) {
								arg3 = false;
								local178 = (int) ((this.aClass187_4.method4496() + 519L) / 520L);
								if (local178 == 0) {
									local178++;
								}
								if (local70 == local178) {
									local178++;
								}
							}
							if (arg2 - local138 <= 512) {
								local178 = 0;
							}
							Static312.aByteArray73[0] = (byte) (arg1 >> 8);
							Static312.aByteArray73[1] = (byte) arg1;
							Static312.aByteArray73[6] = (byte) local178;
							Static312.aByteArray73[4] = (byte) (local178 >> 16);
							Static312.aByteArray73[2] = (byte) (local140 >> 8);
							Static312.aByteArray73[3] = (byte) local140;
							Static312.aByteArray73[5] = (byte) (local178 >> 8);
							local140++;
							Static312.aByteArray73[7] = (byte) this.anInt3774;
							this.aClass187_4.method4487((long) (local70 * 520));
							local70 = local178;
							this.aClass187_4.method4491(0, 8, Static312.aByteArray73);
							this.aClass187_4.method4491(local138, local214, arg0);
							local138 += local214;
							continue;
						}
					}
					local27 = true;
					return local27;
				}
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BIIZ)Z")
	public boolean method3074(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = this.aClass187_4;
		synchronized (this.aClass187_4) {
			if (arg1 < 0 || arg1 > this.anInt3777) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method3073(arg0, arg2, arg1, true);
			if (!local34) {
				local34 = this.method3073(arg0, arg2, arg1, false);
			}
			return local34;
		}
	}
}
