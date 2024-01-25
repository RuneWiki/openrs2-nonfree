import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class229 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	private int anInt6304 = 65000;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!cv;")
	private Class64 aClass64_2 = null;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!cv;")
	private Class64 aClass64_3 = null;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	private final int anInt6308;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILclient!cv;Lclient!cv;I)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3) {
		this.anInt6304 = arg3;
		this.anInt6308 = arg0;
		this.aClass64_2 = arg2;
		this.aClass64_3 = arg1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BII)Z")
	public boolean method5593(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class64 local11 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			if (arg0 < 0 || this.anInt6304 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method5599(arg1, arg2, arg0, true);
			if (!local31) {
				local31 = this.method5599(arg1, arg2, arg0, false);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!mi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6308;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[B")
	public byte[] method5598(@OriginalArg(1) int arg0) {
		@Pc(8) Class64 local8 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			try {
				if (this.aClass64_2.method1311() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass64_2.method1309((long) (arg0 * 6));
				this.aClass64_2.method1312(6, Static326.aByteArray43, 0);
				@Pc(71) int local71 = ((Static326.aByteArray43[0] & 0xFF) << 16) + ((Static326.aByteArray43[1] & 0xFF) << 8) + (Static326.aByteArray43[2] & 0xFF);
				@Pc(98) int local98 = (Static326.aByteArray43[5] & 0xFF) + ((Static326.aByteArray43[4] & 0xFF) << 8) + ((Static326.aByteArray43[3] & 0xFF) << 16);
				if (local71 < 0 || this.anInt6304 < local71) {
					return null;
				} else if (local98 > 0 && (long) local98 <= this.aClass64_3.method1311() / 520L) {
					@Pc(141) byte[] local141 = new byte[local71];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					label55: while (local71 > local143) {
						if (local98 == 0) {
							return null;
						}
						this.aClass64_3.method1309((long) (local98 * 520));
						@Pc(168) int local168 = local71 - local143;
						if (local168 > 512) {
							local168 = 512;
						}
						this.aClass64_3.method1312(local168 + 8, Static326.aByteArray43, 0);
						@Pc(197) int local197 = ((Static326.aByteArray43[0] & 0xFF) << 8) + (Static326.aByteArray43[1] & 0xFF);
						@Pc(212) int local212 = ((Static326.aByteArray43[2] & 0xFF) << 8) + (Static326.aByteArray43[3] & 0xFF);
						@Pc(235) int local235 = ((Static326.aByteArray43[5] & 0xFF) << 8) + ((Static326.aByteArray43[4] << 16 & 0xFF0000) + (Static326.aByteArray43[6] & 0xFF));
						@Pc(241) int local241 = Static326.aByteArray43[7] & 0xFF;
						if (arg0 == local197 && local212 == local145 && local241 == this.anInt6308) {
							if (local235 >= 0 && (long) local235 <= this.aClass64_3.method1311() / 520L) {
								local98 = local235;
								local145++;
								@Pc(295) int local295 = 0;
								while (true) {
									if (local295 >= local168) {
										continue label55;
									}
									local141[local143++] = Static326.aByteArray43[local295 + 8];
									local295++;
								}
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(324) IOException local324) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIIZ)Z")
	private boolean method5599(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class64 local8 = this.aClass64_3;
		synchronized (this.aClass64_3) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass64_2.method1311()) {
						return false;
					}
					this.aClass64_2.method1309((long) (arg1 * 6));
					this.aClass64_2.method1312(6, Static326.aByteArray43, 0);
					local22 = (Static326.aByteArray43[5] & 0xFF) + (((Static326.aByteArray43[3] & 0xFF) << 16) + ((Static326.aByteArray43[4] & 0xFF) << 8));
					if (local22 <= 0 || this.aClass64_3.method1311() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass64_3.method1311() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static326.aByteArray43[5] = (byte) local22;
				Static326.aByteArray43[3] = (byte) (local22 >> 16);
				Static326.aByteArray43[1] = (byte) (arg2 >> 8);
				Static326.aByteArray43[2] = (byte) arg2;
				Static326.aByteArray43[0] = (byte) (arg2 >> 16);
				Static326.aByteArray43[4] = (byte) (local22 >> 8);
				this.aClass64_2.method1309((long) (arg1 * 6));
				this.aClass64_2.method1310(6, Static326.aByteArray43, 0);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (arg2 > local166) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg3) {
						this.aClass64_3.method1309((long) (local22 * 520));
						try {
							this.aClass64_3.method1312(8, Static326.aByteArray43, 0);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = (Static326.aByteArray43[1] & 0xFF) + ((Static326.aByteArray43[0] & 0xFF) << 8);
						@Pc(221) int local221 = (Static326.aByteArray43[3] & 0xFF) + ((Static326.aByteArray43[2] & 0xFF) << 8);
						local172 = (Static326.aByteArray43[6] & 0xFF) + ((Static326.aByteArray43[5] & 0xFF) << 8) + ((Static326.aByteArray43[4] & 0xFF) << 16);
						@Pc(249) int local249 = Static326.aByteArray43[7] & 0xFF;
						if (arg1 != local207 || local221 != local168 || local249 != this.anInt6308) {
							return false;
						}
						if (local172 < 0 || this.aClass64_3.method1311() / 520L < (long) local172) {
							return false;
						}
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass64_3.method1311() + 519L) / 520L);
						arg3 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local172 == local22) {
							local172++;
						}
					}
					Static326.aByteArray43[1] = (byte) arg1;
					Static326.aByteArray43[0] = (byte) (arg1 >> 8);
					if (arg2 - local166 <= 512) {
						local172 = 0;
					}
					Static326.aByteArray43[3] = (byte) local168;
					Static326.aByteArray43[2] = (byte) (local168 >> 8);
					Static326.aByteArray43[5] = (byte) (local172 >> 8);
					Static326.aByteArray43[4] = (byte) (local172 >> 16);
					Static326.aByteArray43[7] = (byte) this.anInt6308;
					Static326.aByteArray43[6] = (byte) local172;
					this.aClass64_3.method1309((long) (local22 * 520));
					this.aClass64_3.method1310(8, Static326.aByteArray43, 0);
					local207 = arg2 - local166;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass64_3.method1310(local207, arg0, local166);
					local166 += local207;
					local168++;
					local22 = local172;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}
}
