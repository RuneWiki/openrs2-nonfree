import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class337 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!ub;")
	private Class344 aClass344_8 = null;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!ub;")
	private Class344 aClass344_9 = null;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	private int anInt9331 = 65000;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
	private final int anInt9332;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILclient!ub;Lclient!ub;I)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) Class344 arg1, @OriginalArg(2) Class344 arg2, @OriginalArg(3) int arg3) {
		this.anInt9332 = arg0;
		this.aClass344_9 = arg1;
		this.aClass344_8 = arg2;
		this.anInt9331 = arg3;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[B")
	public byte[] method8159(@OriginalArg(1) int arg0) {
		@Pc(8) Class344 local8 = this.aClass344_9;
		synchronized (this.aClass344_9) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass344_8.method8364()) {
					return null;
				}
				this.aClass344_8.method8361((long) (arg0 * 6));
				this.aClass344_8.method8360(Static467.aByteArray79, 0, 6);
				@Pc(67) int local67 = (Static467.aByteArray79[2] & 0xFF) + ((Static467.aByteArray79[1] & 0xFF) << 8) + ((Static467.aByteArray79[0] & 0xFF) << 16);
				@Pc(89) int local89 = (Static467.aByteArray79[5] & 0xFF) + ((Static467.aByteArray79[3] & 0xFF) << 16) + ((Static467.aByteArray79[4] & 0xFF) << 8);
				if (local67 < 0 || local67 > this.anInt9331) {
					return null;
				} else if (local89 > 0 && this.aClass344_9.method8364() / 520L >= (long) local89) {
					@Pc(129) byte[] local129 = new byte[local67];
					@Pc(131) int local131 = 0;
					@Pc(133) int local133 = 0;
					while (local67 > local131) {
						if (local89 == 0) {
							return null;
						}
						this.aClass344_9.method8361((long) (local89 * 520));
						@Pc(158) int local158 = local67 - local131;
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass344_9.method8360(Static467.aByteArray79, 0, local158 + 8);
						@Pc(186) int local186 = (Static467.aByteArray79[1] & 0xFF) + ((Static467.aByteArray79[0] & 0xFF) << 8);
						@Pc(200) int local200 = ((Static467.aByteArray79[2] & 0xFF) << 8) + (Static467.aByteArray79[3] & 0xFF);
						@Pc(223) int local223 = (Static467.aByteArray79[6] & 0xFF) + ((Static467.aByteArray79[4] & 0xFF) << 16) + ((Static467.aByteArray79[5] & 0xFF) << 8);
						@Pc(229) int local229 = Static467.aByteArray79[7] & 0xFF;
						if (local186 == arg0 && local200 == local133 && local229 == this.anInt9332) {
							if (local223 >= 0 && (long) local223 <= this.aClass344_9.method8364() / 520L) {
								for (@Pc(276) int local276 = 0; local276 < local158; local276++) {
									local129[local131++] = Static467.aByteArray79[local276 + 8];
								}
								local89 = local223;
								local133++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BII)Z")
	public boolean method8160(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class344 local6 = this.aClass344_9;
		synchronized (this.aClass344_9) {
			if (arg2 < 0 || this.anInt9331 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method8161(arg2, true, arg1, arg0);
			if (!local35) {
				local35 = this.method8161(arg2, false, arg1, arg0);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!tk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt9332;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIZ[BI)Z")
	private boolean method8161(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class344 local8 = this.aClass344_9;
		synchronized (this.aClass344_9) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass344_8.method8364()) {
						return false;
					}
					this.aClass344_8.method8361((long) (arg3 * 6));
					this.aClass344_8.method8360(Static467.aByteArray79, 0, 6);
					local22 = (Static467.aByteArray79[5] & 0xFF) + ((Static467.aByteArray79[4] & 0xFF) << 8) + ((Static467.aByteArray79[3] & 0xFF) << 16);
					if (local22 <= 0 || (long) local22 > this.aClass344_9.method8364() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass344_9.method8364() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static467.aByteArray79[2] = (byte) arg0;
				Static467.aByteArray79[5] = (byte) local22;
				Static467.aByteArray79[0] = (byte) (arg0 >> 16);
				Static467.aByteArray79[4] = (byte) (local22 >> 8);
				Static467.aByteArray79[3] = (byte) (local22 >> 16);
				Static467.aByteArray79[1] = (byte) (arg0 >> 8);
				this.aClass344_8.method8361((long) (arg3 * 6));
				this.aClass344_8.method8365(Static467.aByteArray79, 0, 6);
				@Pc(172) int local172 = 0;
				@Pc(174) int local174 = 0;
				while (local172 < arg0) {
					@Pc(178) int local178 = 0;
					@Pc(214) int local214;
					if (arg1) {
						this.aClass344_9.method8361((long) (local22 * 520));
						try {
							this.aClass344_9.method8360(Static467.aByteArray79, 0, 8);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local214 = ((Static467.aByteArray79[0] & 0xFF) << 8) + (Static467.aByteArray79[1] & 0xFF);
						@Pc(229) int local229 = ((Static467.aByteArray79[2] & 0xFF) << 8) + (Static467.aByteArray79[3] & 0xFF);
						local178 = ((Static467.aByteArray79[5] & 0xFF) << 8) + ((Static467.aByteArray79[4] & 0xFF) << 16) + (Static467.aByteArray79[6] & 0xFF);
						@Pc(257) int local257 = Static467.aByteArray79[7] & 0xFF;
						if (local214 != arg3 || local229 != local174 || local257 != this.anInt9332) {
							return false;
						}
						if (local178 < 0 || this.aClass344_9.method8364() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						arg1 = false;
						local178 = (int) ((this.aClass344_9.method8364() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						if (local22 == local178) {
							local178++;
						}
					}
					Static467.aByteArray79[3] = (byte) local174;
					if (arg0 - local172 <= 512) {
						local178 = 0;
					}
					Static467.aByteArray79[1] = (byte) arg3;
					Static467.aByteArray79[0] = (byte) (arg3 >> 8);
					Static467.aByteArray79[2] = (byte) (local174 >> 8);
					Static467.aByteArray79[5] = (byte) (local178 >> 8);
					Static467.aByteArray79[4] = (byte) (local178 >> 16);
					Static467.aByteArray79[6] = (byte) local178;
					Static467.aByteArray79[7] = (byte) this.anInt9332;
					this.aClass344_9.method8361((long) (local22 * 520));
					this.aClass344_9.method8365(Static467.aByteArray79, 0, 8);
					local214 = arg0 - local172;
					if (local214 > 512) {
						local214 = 512;
					}
					this.aClass344_9.method8365(arg2, local172, local214);
					local174++;
					local22 = local178;
					local172 += local214;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}
}
