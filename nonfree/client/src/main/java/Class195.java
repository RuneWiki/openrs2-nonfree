import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class195 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!ok;")
	private Class187 aClass187_3 = null;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!ok;")
	private Class187 aClass187_2 = null;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private int anInt5722 = 65000;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	private final int anInt5720;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILclient!ok;Lclient!ok;I)V")
	public Class195(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) int arg3) {
		this.anInt5720 = arg0;
		this.aClass187_2 = arg2;
		this.aClass187_3 = arg1;
		this.anInt5722 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5720;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[B")
	public byte[] method4393(@OriginalArg(1) int arg0) {
		@Pc(8) Class187 local8 = this.aClass187_3;
		synchronized (this.aClass187_3) {
			try {
				if (this.aClass187_2.method4253() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass187_2.method4261((long) (arg0 * 6));
				this.aClass187_2.method4259(0, 6, Static365.aByteArray83);
				@Pc(70) int local70 = ((Static365.aByteArray83[0] & 0xFF) << 16) - (-((Static365.aByteArray83[1] & 0xFF) << 8) - (Static365.aByteArray83[2] & 0xFF));
				@Pc(92) int local92 = (Static365.aByteArray83[5] & 0xFF) + ((Static365.aByteArray83[3] & 0xFF) << 16) + ((Static365.aByteArray83[4] & 0xFF) << 8);
				if (local70 < 0 || this.anInt5722 < local70) {
					return null;
				} else if (local92 > 0 && this.aClass187_3.method4253() / 520L >= (long) local92) {
					@Pc(133) byte[] local133 = new byte[local70];
					@Pc(135) int local135 = 0;
					@Pc(137) int local137 = 0;
					label55: while (local135 < local70) {
						if (local92 == 0) {
							return null;
						}
						this.aClass187_3.method4261((long) (local92 * 520));
						@Pc(162) int local162 = local70 - local135;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass187_3.method4259(0, local162 + 8, Static365.aByteArray83);
						@Pc(190) int local190 = (Static365.aByteArray83[1] & 0xFF) + ((Static365.aByteArray83[0] & 0xFF) << 8);
						@Pc(204) int local204 = (Static365.aByteArray83[3] & 0xFF) + ((Static365.aByteArray83[2] & 0xFF) << 8);
						@Pc(226) int local226 = (Static365.aByteArray83[6] & 0xFF) + ((Static365.aByteArray83[5] & 0xFF) << 8) + ((Static365.aByteArray83[4] & 0xFF) << 16);
						@Pc(232) int local232 = Static365.aByteArray83[7] & 0xFF;
						if (local190 == arg0 && local204 == local137 && this.anInt5720 == local232) {
							if (local226 >= 0 && this.aClass187_3.method4253() / 520L >= (long) local226) {
								local137++;
								local92 = local226;
								@Pc(278) int local278 = 0;
								while (true) {
									if (local162 <= local278) {
										continue label55;
									}
									local133[local135++] = Static365.aByteArray83[local278 + 8];
									local278++;
								}
							}
							return null;
						}
						return null;
					}
					return local133;
				} else {
					return null;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)Z")
	public boolean method4395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class187 local6 = this.aClass187_3;
		synchronized (this.aClass187_3) {
			if (arg0 < 0 || this.anInt5722 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method4396(true, arg2, arg1, arg0);
			if (!local31) {
				local31 = this.method4396(false, arg2, arg1, arg0);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z[BZII)Z")
	private boolean method4396(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class187 local8 = this.aClass187_3;
		synchronized (this.aClass187_3) {
			try {
				@Pc(77) int local77;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass187_2.method4253()) {
						return false;
					}
					this.aClass187_2.method4261((long) (arg2 * 6));
					this.aClass187_2.method4259(0, 6, Static365.aByteArray83);
					local77 = ((Static365.aByteArray83[4] & 0xFF) << 8) + ((Static365.aByteArray83[3] & 0xFF) << 16) + (Static365.aByteArray83[5] & 0xFF);
					if (local77 <= 0 || (long) local77 > this.aClass187_3.method4253() / 520L) {
						return false;
					}
				} else {
					local77 = (int) ((this.aClass187_3.method4253() + 519L) / 520L);
					if (local77 == 0) {
						local77 = 1;
					}
				}
				Static365.aByteArray83[5] = (byte) local77;
				Static365.aByteArray83[4] = (byte) (local77 >> 8);
				Static365.aByteArray83[2] = (byte) arg3;
				Static365.aByteArray83[3] = (byte) (local77 >> 16);
				Static365.aByteArray83[1] = (byte) (arg3 >> 8);
				Static365.aByteArray83[0] = (byte) (arg3 >> 16);
				this.aClass187_2.method4261((long) (arg2 * 6));
				this.aClass187_2.method4256(Static365.aByteArray83, 6, 0);
				@Pc(171) int local171 = 0;
				@Pc(173) int local173 = 0;
				while (arg3 > local171) {
					@Pc(177) int local177 = 0;
					@Pc(213) int local213;
					if (arg0) {
						this.aClass187_3.method4261((long) (local77 * 520));
						try {
							this.aClass187_3.method4259(0, 8, Static365.aByteArray83);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local213 = ((Static365.aByteArray83[0] & 0xFF) << 8) + (Static365.aByteArray83[1] & 0xFF);
						@Pc(227) int local227 = (Static365.aByteArray83[3] & 0xFF) + ((Static365.aByteArray83[2] & 0xFF) << 8);
						local177 = ((Static365.aByteArray83[4] & 0xFF) << 16) - (-((Static365.aByteArray83[5] & 0xFF) << 8) - (Static365.aByteArray83[6] & 0xFF));
						@Pc(257) int local257 = Static365.aByteArray83[7] & 0xFF;
						if (local213 != arg2 || local227 != local173 || local257 != this.anInt5720) {
							return false;
						}
						if (local177 < 0 || this.aClass187_3.method4253() / 520L < (long) local177) {
							return false;
						}
					}
					if (local177 == 0) {
						arg0 = false;
						local177 = (int) ((this.aClass187_3.method4253() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local177 == local77) {
							local177++;
						}
					}
					Static365.aByteArray83[3] = (byte) local173;
					Static365.aByteArray83[0] = (byte) (arg2 >> 8);
					if (arg3 - local171 <= 512) {
						local177 = 0;
					}
					Static365.aByteArray83[2] = (byte) (local173 >> 8);
					Static365.aByteArray83[1] = (byte) arg2;
					Static365.aByteArray83[7] = (byte) this.anInt5720;
					Static365.aByteArray83[5] = (byte) (local177 >> 8);
					Static365.aByteArray83[4] = (byte) (local177 >> 16);
					Static365.aByteArray83[6] = (byte) local177;
					this.aClass187_3.method4261((long) (local77 * 520));
					this.aClass187_3.method4256(Static365.aByteArray83, 8, 0);
					local213 = arg3 - local171;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass187_3.method4256(arg1, local213, local171);
					local171 += local213;
					local173++;
					local77 = local177;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}
}
